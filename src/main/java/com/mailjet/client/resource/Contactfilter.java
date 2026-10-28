
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
public class Contactfilter {

    public static Resource resource = new Resource("contactfilter", "", ApiVersion.V3, ApiAuthenticationType.Basic);

	public static String DESCRIPTION = "Description";
	public static String EXPRESSION = "Expression";
	public static String ID = "ID";
	public static String NAME = "Name";
	public static String STATUS = "Status";
	public static String SHOWDELETED = "ShowDeleted";
	public static String LIMIT = PaginationConstants.LIMIT;
	public static String OFFSET = PaginationConstants.OFFSET;
	public static String COUNTONLY = PaginationConstants.COUNT_ONLY;

}

