package com.mailjet.client.resource;

import com.mailjet.client.Resource;
import com.mailjet.client.enums.ApiAuthenticationType;
import com.mailjet.client.enums.ApiVersion;

public class StatisticsLinkclick {
	public static final Resource resource = new Resource("statistics/link-click", "", ApiVersion.V3, ApiAuthenticationType.Basic);

	public static final String APIKEYID = "APIKeyID";
	public static final String CLICKEDMESSAGESCOUNT = "ClickedMessagesCount";
	public static final String CLICKEDEVENTSCOUNT = "ClickedEventsCount";
	public static final String POSITIONINDEX = "PositionIndex";
	public static final String URL = "URL";
	public static final String CAMPAIGNID = "CampaignID";
}
