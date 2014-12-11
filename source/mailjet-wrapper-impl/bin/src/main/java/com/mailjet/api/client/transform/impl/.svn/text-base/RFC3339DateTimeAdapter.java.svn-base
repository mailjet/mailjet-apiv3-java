package com.mailjet.api.client.transform.impl;

import java.lang.reflect.Type;
import java.text.ParseException;
import java.util.Date;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

/**
 * GSON type adapter between {@link Date} and RFC 3339 DateTime format.
 * 
 * @author MailJet
 * 
 */
public class RFC3339DateTimeAdapter implements JsonDeserializer<Date>,
		JsonSerializer<Date> {
	private final InternetDateFormat formatter = new InternetDateFormat(false, 0);

	public final JsonElement serialize(final Date value, final Type type,
			final JsonSerializationContext context) {
		return new JsonPrimitive(formatter.format(value));
	}

	public final Date deserialize(final JsonElement element, final Type type,
			final JsonDeserializationContext context) throws JsonParseException {
		try {
			String value = element.getAsString();
			return value.length() == 0 ? null : formatter.parse(value);
		} catch (ParseException e) {
			throw new JsonParseException(e);
		}
	}
}
