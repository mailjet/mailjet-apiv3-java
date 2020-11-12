
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
public class Contactstatistics {

    public static Resource resource = new Resource("contactstatistics", "", ApiVersion.V3, ApiAuthenticationType.Basic);

	public static String BLOCKEDCOUNT = "BlockedCount";
	public static String BOUNCEDCOUNT = "BouncedCount";
	public static String CLICKEDCOUNT = "ClickedCount";
	public static String CONTACT = "Contact";
	public static String DELIVEREDCOUNT = "DeliveredCount";
	public static String LASTACTIVITYAT = "LastActivityAt";
	public static String MARKETINGCONTACTS = "MarketingContacts";
	public static String OPENEDCOUNT = "OpenedCount";
	public static String PROCESSEDCOUNT = "ProcessedCount";
	public static String QUEUEDCOUNT = "QueuedCount";
	public static String SPAMCOMPLAINTCOUNT = "SpamComplaintCount";
	public static String UNSUBSCRIBEDCOUNT = "UnsubscribedCount";
	public static String USERMARKETINGCONTACTS = "UserMarketingContacts";
	public static String BLOCKED = "Blocked";
	public static String BOUNCED = "Bounced";
	public static String CLICK = "Click";
	public static String MAXLASTACTIVITYAT = "MaxLastActivityAt";
	public static String MINLASTACTIVITYAT = "MinLastActivityAt";
	public static String OPEN = "Open";
	public static String QUEUED = "Queued";
	@Deprecated
	public static String RECALCULATE = "Recalculate";
	public static String SENT = "Sent";
	public static String SPAM = "Spam";
	public static String UNSUBSCRIBED = "Unsubscribed";
	public static String LIMIT = "Limit";
	public static String OFFSET = "Offset";
	public static String COUNTONLY = "CountOnly";
	public static final String SOFTBOUNCEDCOUNT = "SoftbouncedCount";
	public static final String HARDBOUNCEDCOUNT = "HardbouncedCount";
	public static final String DEFERREDCOUNT = "DeferredCount";
	public static final String WORKFLOWEXITEDCOUNT = "WorkflowExitedCount";

}

