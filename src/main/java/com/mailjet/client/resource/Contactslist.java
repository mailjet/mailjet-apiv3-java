
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
public class Contactslist {

    public static Resource resource = new Resource("contactslist", "", ApiVersion.V3, ApiAuthenticationType.Basic);
    public static Resource csvDataResource = new Resource("contactslist", "csvdata", ApiVersion.V3, ApiAuthenticationType.Basic);

	public static String ADDRESS = "Address";
	public static String CREATEDAT = "CreatedAt";
	public static String ID = "ID";
	public static String ISDELETED = "IsDeleted";
	public static String NAME = "Name";
	public static String SUBSCRIBERCOUNT = "SubscriberCount";
	public static String EXCLUDEID = "ExcludeID";
	public static String LIMIT = PaginationConstants.LIMIT;
	public static String OFFSET = PaginationConstants.OFFSET;
	public static String COUNTONLY = PaginationConstants.COUNT_ONLY;

}

