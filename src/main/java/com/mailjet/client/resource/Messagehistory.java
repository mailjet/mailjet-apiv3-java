
/*
 * This is a generated class.
 */

package com.mailjet.client.resource;

import com.mailjet.client.Resource;
import com.mailjet.client.PaginationConstants;
import com.mailjet.client.enums.ApiAuthenticationType;
import com.mailjet.client.enums.ApiVersion;

/**
 *
 * @author Guillaume Badi
 */
public class Messagehistory {

    public static Resource resource = new Resource("messagehistory", "", ApiVersion.V3, ApiAuthenticationType.Basic);

	public static String COMMENT = "Comment";
	public static String EVENTAT = "EventAt";
	public static String EVENTTYPE = "EventType";
	public static String STATE = "State";
	public static String USERAGENT = "Useragent";
	public static String MESSAGE = "Message";
	public static String LIMIT = PaginationConstants.LIMIT;
	public static String OFFSET = PaginationConstants.OFFSET;
	public static String COUNTONLY = PaginationConstants.COUNT_ONLY;

}

