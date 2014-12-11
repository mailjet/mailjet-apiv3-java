package com.mailjet.api.client.transform;

import java.util.List;

import com.mailjet.api.client.model.ResultSet;

/**
 * Interface providing serialization/deserialization of Java object in MailJet
 * API data format.
 * 
 * @author MailJet
 * 
 */
public interface DataTransformer {
	/**
	 * Deserializes an object represented in MailJet API format and creates the
	 * corresponding Java object.
	 * 
	 * @param value
	 *            not null, the data to be deserialized
	 * @param cls
	 *            not null, the {@link Class} specifying the type of the
	 *            expected result object
	 * @param <ObjectType>
	 *            type of the object that should be created from the string
	 *            parameter
	 * @return not null, the resulting object
	 */
	<ObjectType> ObjectType fromString(String value, Class<ObjectType> cls);

	
	/**
	 * Deserializes an object represented in MailJet API format and creates the
	 * corresponding Java object.
	 * 
	 * @param value
	 *            not null, the data to be deserialized
	 * @param cls
	 *            not null, the {@link Class} specifying the type of the
	 *            expected result object
	 * @param <ObjectType>
	 *            type of the object that should be created from the string
	 *            parameter
	 * @return not null, the resulting object
	 */
	<ObjectType> ResultSet<ObjectType> fromStringResultSet(String value, Class<ObjectType> cls);
	
	/**
	 * Deserializes a collection of raw objects.
	 * 
	 * @param values
	 *            not null, collection values
	 * @param cls
	 *            not null, the real type of objects in the collection
	 * @param <ObjectType>
	 *            the type of the elements in the resulting collection
	 * @return not null, collection of objects of type <ObjectType>
	 * 
	 */
	<ObjectType> List<ObjectType> typedList(Iterable<?> values,
			Class<ObjectType> cls);

	/**
	 * Serializes a Java object to its MailJet API format representation.
	 * 
	 * @param value
	 *            not null, the object to be serialized
	 * @return the resulting object, could be null if passed parameter was null
	 */
	String toString(Object value);
}
