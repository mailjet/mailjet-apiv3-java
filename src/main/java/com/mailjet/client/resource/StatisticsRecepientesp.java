package com.mailjet.client.resource;

import com.mailjet.client.Resource;
import com.mailjet.client.enums.ApiAuthenticationType;
import com.mailjet.client.enums.ApiVersion;

public class StatisticsRecepientesp {
	public static final Resource resource = new Resource("statistics/recipient-esp", "", ApiVersion.V3, ApiAuthenticationType.Basic);

	public static final String ATTEMPTEDMESSAGESCOUNT = "AttemptedMessagesCount";
	public static final String CLICKEDMESSAGESCOUNT = "ClickedMessagesCount";
	public static final String DEFERREDMESSAGESCOUNT = "DeferredMessagesCount";
	public static final String DELIVEREDMESSAGESCOUNT = "DeliveredMessagesCount";
	public static final String HARDBOUNCEDMESSAGESCOUNT = "HardBouncedMessagesCount";
	public static final String ESPNAME = "ESPName";
	public static final String OPENEDMESSAGESCOUNT = "OpenedMessagesCount";
	public static final String SOFTBOUNCEDMESSAGESCOUNT = "SoftBouncedMessagesCount";
	public static final String SPAMREPORTSCOUNT = "SpamReportsCount";
	public static final String UNSUBSCRIBEDMESSAGESCOUNT = "UnsubscribedMessagesCount";
	
	public static final String CAMPAIGNID = "CampaignID";
	public static final String ESPNAMES = "EspNames";
}
