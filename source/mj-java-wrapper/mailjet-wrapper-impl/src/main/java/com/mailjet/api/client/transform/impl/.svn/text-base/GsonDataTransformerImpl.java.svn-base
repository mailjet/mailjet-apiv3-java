package com.mailjet.api.client.transform.impl;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.mailjet.api.client.model.ResultSet;
import com.mailjet.api.client.model.metadata.Component;
import com.mailjet.api.client.model.metadata.EnumValue;
import com.mailjet.api.client.transform.DataTransformer;

/**
 * Implementation of the interface using the Google GSON library.
 * 
 * @author MailJet
 * 
 */
public class GsonDataTransformerImpl implements DataTransformer {
	private Gson gson;

	/**
	 * Constructor.
	 */
	public GsonDataTransformerImpl() {
		gson = new GsonBuilder()
				.registerTypeAdapter(Date.class, new RFC3339DateTimeAdapter())
				.registerTypeAdapterFactory(ENUM_FACTORY)
				.setFieldNamingStrategy(new MailJetFieldNamingStrategy())
				.excludeFieldsWithModifiers(Modifier.STATIC).create();

	}

	public final <T> T fromString(final String value, final Class<T> cls) {
		return gson.fromJson(value, cls);
	}
	
	public final <T> ResultSet<T> fromStringResultSet(final String value, final Class<T> cls) {
		return gson.fromJson(value, new ParameterizedType() {
			private Type[] type = new Type[]{cls};
			
			public Type getRawType() {
				return ResultSet.class;
			}
			
			public Type getOwnerType() {
				return null;
			}
			
			public Type[] getActualTypeArguments() {
				return type;
			}
		});
	}

	public final String toString(final Object value) {
		return gson.toJson(value);
	}

	public final <ObjectType> List<ObjectType> typedList(
			final Iterable<?> values, final Class<ObjectType> cls) {
		List<ObjectType> result = new ArrayList<ObjectType>();
		for (Object object : values) {
			if (object != null) {
				result.add(gson.fromJson((JsonElement) object, cls));
			}
		}
		return result;
	}

	/**
	 * Naming strategy which uses MailJet API Client library annotation to map
	 * Java property names to JSON properties.
	 * 
	 * @author MailJet
	 * 
	 */
	class MailJetFieldNamingStrategy implements FieldNamingStrategy {

		public String translateName(final Field f) {
			Component component = f.getAnnotation(Component.class);
			return component != null ? component.name() : f.getName();
		}

	}

	/**
	 * GSON adapter factory for enum types.
	 */
	private static final TypeAdapterFactory ENUM_FACTORY = newEnumTypeHierarchyFactory();

	/**
	 * GSON adapter factory for enum types.
	 * 
	 * @return instance of the factory capable to convert enum constants
	 */
	private static TypeAdapterFactory newEnumTypeHierarchyFactory() {
		return new TypeAdapterFactory() {
			@SuppressWarnings({ "rawtypes", "unchecked" })
			public <T> TypeAdapter<T> create(final Gson gson,
					final TypeToken<T> typeToken) {
				Class<? super T> rawType = typeToken.getRawType();
				if (!Enum.class.isAssignableFrom(rawType)
						|| rawType == Enum.class) {
					return null;
				}
				if (!rawType.isEnum()) {
					// handle anonymous subclasses
					rawType = rawType.getSuperclass();
				}
				return (TypeAdapter<T>) new EnumTypeAdapter(rawType);
			}
		};
	}

	/**
	 * Type adapter that uses MailJet API Client metadata to
	 * serialize/deerialize enum constants.
	 * 
	 * @author MailJet
	 * 
	 * @param <T>
	 *            type of the enum
	 */
	private static final class EnumTypeAdapter<T extends Enum<T>> extends
			TypeAdapter<T> {
		private final Map<String, T> nameToConstant = new HashMap<String, T>();
		private final Map<T, String> constantToName = new HashMap<T, String>();

		/**
		 * Constructor.
		 * 
		 * @param classOfT
		 *            not null, enum class
		 */
		public EnumTypeAdapter(final Class<T> classOfT) {
			try {
				for (T constant : classOfT.getEnumConstants()) {
					String name = constant.name();
					EnumValue annotation = classOfT.getField(name)
							.getAnnotation(EnumValue.class);
					if (annotation != null) {
						name = annotation.value();
					}
					nameToConstant.put(name, constant);
					constantToName.put(constant, name);
				}
			} catch (NoSuchFieldException e) {
				throw new AssertionError();
			}
		}

		@Override
		public T read(final JsonReader in) throws IOException {
			if (in.peek() == JsonToken.NULL) {
				in.nextNull();
				return null;
			}
			return nameToConstant.get(in.nextString());
		}

		@Override
		public void write(final JsonWriter out, final T value)
				throws IOException {
			out.value(value == null ? null : constantToName.get(value));
		}
	}

}
