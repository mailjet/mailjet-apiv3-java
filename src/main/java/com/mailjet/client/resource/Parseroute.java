
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
public class Parseroute {

    public static Resource resource = new Resource("parseroute", "", ApiVersion.V3, ApiAuthenticationType.Basic);

	public static String APIKEY = "APIKey";
	public static String EMAIL = "Email";
	public static String ID = "ID";
	public static String URL = "Url";
	public static String LIMIT = PaginationConstants.LIMIT;
	public static String OFFSET = PaginationConstants.OFFSET;
	public static String COUNTONLY = PaginationConstants.COUNT_ONLY;

}

