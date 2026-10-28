
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
public class Contactdata {

    public static Resource resource = new Resource("contactdata", "", ApiVersion.V3, ApiAuthenticationType.Basic);

	public static String CONTACTID = "ContactID";
	public static String DATA = "Data";
	public static String ID = "ID";
	public static String CAMPAIGN = "Campaign";
	public static String CONTACTEMAIL = "ContactEmail";
	public static String CONTACTSLIST = "ContactsList";
	public static String FIELDS = "Fields";
	public static String ISUNSUBSCRIBED = "IsUnsubscribed";
	public static String LASTACTIVITYAT = "LastActivityAt";
	public static String STATUS = "Status";
	public static String LIMIT = PaginationConstants.LIMIT;
	public static String OFFSET = PaginationConstants.OFFSET;
	public static String COUNTONLY = PaginationConstants.COUNT_ONLY;

}

