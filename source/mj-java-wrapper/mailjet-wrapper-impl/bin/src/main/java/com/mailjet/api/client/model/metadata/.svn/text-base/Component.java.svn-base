package com.mailjet.api.client.model.metadata;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Fields annotated with this annotation represent a component resource provided
 * by MailJet API. The MailJet API wrapper library uses this metadata to map
 * Java fields to resource properties from MailJet API. Currently there are two
 * types of supported components: properties and filters. The annotation
 * attributes describe the properties of a component such as name, description,
 * type, etc.
 *
 * @author MailJet
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Component {
	/**
	 * Message describing the semantics of the property.
	 *
	 */
	String description() default "";

	/**
	 * String representation of the default value that is assumed by MailJet API
	 * if value was not supplied.
	 *
	 */
	String defaultValue() default "";

	/**
	 * Indicates if it is required to set value for the field annotated.
	 *
	 */
	boolean required() default false;

	/**
	 * Name that is used by MailJet to identify the component.
	 *
	 */
	String name();

	/**
	 * Type of the component that the MailJet API is possible to process.
	 *
	 */
	String type();
}
