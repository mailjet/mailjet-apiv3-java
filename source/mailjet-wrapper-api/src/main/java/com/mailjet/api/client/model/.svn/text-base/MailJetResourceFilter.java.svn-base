package com.mailjet.api.client.model;

import com.mailjet.api.client.MailJetApiCall;

/**
 * Class representing a {@link MailJetApiCall} filter along with it's data type.
 * 
 * @author MailJet
 * 
 * @param <ResourceType>
 *            type of the resource to which the property belongs
 * @param <DataType>
 *            type of the values filter can accept
 */
public class MailJetResourceFilter<ResourceType, DataType> {
	private final String name;
	private final Class<?> type;

	/**
	 * Constructor.
	 * 
	 * @param name
	 *            not null, the name of the filter
	 * @param type
	 *            not null, the type of the filter
	 */
	public MailJetResourceFilter(final String name, final Class<?> type) {
		this.name = name;
		this.type = type;
	}

	/**
	 * Gets the name of the property.
	 * 
	 * @return not null, the value specified as a name
	 */
	public final String getName() {
		return name;
	}

	/**
	 * Gets the class object representing the property value's type.
	 * 
	 * @return not null, the class
	 */
	public final Class<?> getType() {
		return type;
	}

}
