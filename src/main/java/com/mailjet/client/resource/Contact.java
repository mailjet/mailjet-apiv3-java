
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
public class Contact {

    public static Resource resource = new Resource("contact", "", ApiVersion.V3, ApiAuthenticationType.Basic);

	public static String CREATEDAT = "CreatedAt";
	public static String ISEXCLUDEDFROMCAMPAIGNS = "IsExcludedFromCampaigns";
	public static String EXCLUSIONFROMCAMPAIGNSUPDATEDAT = "ExclusionFromCampaignsUpdatedAt";
	public static String DELIVEREDCOUNT = "DeliveredCount";
	public static String EMAIL = "Email";
	public static String ID = "ID";
	public static String ISOPTINPENDING = "IsOptInPending";
	public static String ISSPAMCOMPLAINING = "IsSpamComplaining";
	public static String LASTACTIVITYAT = "LastActivityAt";
	public static String LASTUPDATEAT = "LastUpdateAt";
	public static String NAME = "Name";
	public static String UNSUBSCRIBEDAT = "UnsubscribedAt";
	public static String UNSUBSCRIBEDBY = "UnsubscribedBy";
	public static String CAMPAIGN = "Campaign";
	public static String CONTACTSLIST = "ContactsList";
	public static String ISUNSUBSCRIBED = "IsUnsubscribed";
	public static String STATUS = "Status";
	public static String LIMIT = PaginationConstants.LIMIT;
	public static String OFFSET = PaginationConstants.OFFSET;
	public static String COUNTONLY = PaginationConstants.COUNT_ONLY;

}

