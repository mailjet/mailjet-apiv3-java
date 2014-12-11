package com.mailjet.api.client.model.metadata;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation defining the value of the enumeration constant when sent to
 * MailJet API. The annotation is used whenever the constant name is different
 * than the represented value, e.g. the value is not valid Java identifier. By
 * default the client will try to use the constant name as value.
 *
 * @author MailJet
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface EnumValue {
	/**
	 * The value that the constant represents.
	 *
	 */
	String value();
}
