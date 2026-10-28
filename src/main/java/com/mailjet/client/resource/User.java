
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
public class User {

    public static Resource resource = new Resource("user", "", ApiVersion.V3, ApiAuthenticationType.Basic);

	public static String ACL = "ACL";
	public static String CREATEDAT = "CreatedAt";
	public static String EMAIL = "Email";
	public static String ID = "ID";
	public static String LASTIP = "LastIp";
	public static String LASTLOGINAT = "LastLoginAt";
	public static String LOCALE = "Locale";
	public static String MAXALLOWEDAPIKEYS = "MaxAllowedAPIKeys";
	public static String TIMEZONE = "Timezone";
	public static String USERNAME = "Username";
	public static String WARNEDRATELIMITAT = "WarnedRatelimitAt";
	public static String ISACTIVATED = "IsActivated";
	public static String NEWEMAIL = "NewEmail";
	public static String LIMIT = PaginationConstants.LIMIT;
	public static String OFFSET = PaginationConstants.OFFSET;
	public static String COUNTONLY = PaginationConstants.COUNT_ONLY;

}

