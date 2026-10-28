
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
public class Metadata {

    public static Resource resource = new Resource("metadata", "", ApiVersion.V3, ApiAuthenticationType.Basic);

	public static String ACTIONS = "Actions";
	public static String APIVERSION = "APIVersion";
	public static String DESCRIPTION = "Description";
	public static String FILTERS = "Filters";
	public static String ISREADONLY = "IsReadOnly";
	public static String NAME = "Name";
	public static String PRIVATEOPERATIONS = "PrivateOperations";
	public static String PROPERTIES = "Properties";
	public static String PUBLICOPERATIONS = "PublicOperations";
	public static String SORTINFO = "SortInfo";
	public static String UNIQUEKEY = "UniqueKey";
	public static String PUBLICRESOURCES = "PublicResources";
	public static String READONLYRESOURCES = "ReadOnlyResources";
	public static String RESOURCENAME = "ResourceName";
	public static String LIMIT = PaginationConstants.LIMIT;
	public static String OFFSET = PaginationConstants.OFFSET;
	public static String COUNTONLY = PaginationConstants.COUNT_ONLY;

}

