
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
public class Sender {

    public static Resource resource = new Resource("sender", "", ApiVersion.V3, ApiAuthenticationType.Basic);

	public static String CREATEDAT = "CreatedAt";
	public static String DNS = "DNS";
	public static String EMAIL = "Email";
	public static String EMAILTYPE = "EmailType";
	public static String FILENAME = "Filename";
	public static String ID = "ID";
	public static String ISDEFAULTSENDER = "IsDefaultSender";
	public static String NAME = "Name";
	public static String STATUS = "Status";
	public static String DNSID = "DnsID";
	public static String DOMAIN = "Domain";
	public static String LOCALPART = "LocalPart";
	public static String SHOWDELETED = "ShowDeleted";
	public static String LIMIT = PaginationConstants.LIMIT;
	public static String OFFSET = PaginationConstants.OFFSET;
	public static String COUNTONLY = PaginationConstants.COUNT_ONLY;

}

