
/*
 * This is a generated class.
 */

package com.mailjet.client.resource;

import com.mailjet.client.Resource;
import com.mailjet.client.enums.ApiAuthenticationType;
import com.mailjet.client.enums.ApiVersion;

/**
 *
 * @author Guillaume Badi
 */
public class DnsCheck {

    public static Resource resource = new Resource("dns", "check", ApiVersion.V3, ApiAuthenticationType.Basic);

	public static String DKIMSTATUS = "DKIMStatus";
	public static String DKIMERRORS = "DKIMErrors";
	public static String DKIMRECORDCURRENTVALUE = "DKIMRecordCurrentValue";
	public static String SPFSTATUS = "SPFStatus";
	public static String SPFERRORS = "SPFErrors";
	public static String SPFRECORDSCURRENTVALUES = "SPFRecordsCurrentValues";

}

