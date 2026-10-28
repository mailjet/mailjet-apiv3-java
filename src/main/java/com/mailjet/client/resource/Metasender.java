
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
public class Metasender {

    public static Resource resource = new Resource("metasender", "", ApiVersion.V3, ApiAuthenticationType.Basic);

	public static String CREATEDAT = "CreatedAt";
	public static String DESCRIPTION = "Description";
	public static String EMAIL = "Email";
	public static String FILENAME = "Filename";
	public static String ID = "ID";
	public static String ISENABLED = "IsEnabled";
	public static String DNS = "DNS";
	public static String USER = "User";
	public static String LIMIT = PaginationConstants.LIMIT;
	public static String OFFSET = PaginationConstants.OFFSET;
	public static String COUNTONLY = PaginationConstants.COUNT_ONLY;

}

