
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
public class Preferences {

    public static Resource resource = new Resource("preferences", "", ApiVersion.V3, ApiAuthenticationType.Basic);

	public static String ID = "ID";
	public static String KEY = "Key";
	public static String USER = "User";
	public static String VALUE = "Value";
	public static String SHOWALLUSERS = "ShowAllUsers";
	public static String LIMIT = PaginationConstants.LIMIT;
	public static String OFFSET = PaginationConstants.OFFSET;
	public static String COUNTONLY = PaginationConstants.COUNT_ONLY;

}

