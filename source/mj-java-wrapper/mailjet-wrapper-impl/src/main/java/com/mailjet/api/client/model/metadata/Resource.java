package com.mailjet.api.client.model.metadata;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.mailjet.api.client.model.ResourceOperationTypes;

/**
 * MailJet API wrapper library use this annotation to mark that a class is
 * mapped to MailJet API resource.
 *
 * @author MailJet
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Resource {
	/**
	 * Gets the name of the resource from MailJet API.
	 *
	 */
	String name();

	/**
	 * Operations supported for that resource by MailJet API.
	 *
	 */
	ResourceOperationTypes[] allowedOperations() default {};

	/**
	 * List of property names which can be alternatively used to identify a
	 * resource on MailJet API.
	 *
	 */
	String[] uniquekey() default "";

	/**
	 * Description of the resource semantics.
	 *
	 */
	String description() default "";
}
