package com.mailjet.client.resource;

import com.mailjet.client.Resource;
import com.mailjet.client.enums.ApiAuthenticationType;
import com.mailjet.client.enums.ApiVersion;

public class Statcounters {
	public static final Resource resource = new Resource("statcounters", "", ApiVersion.V3, ApiAuthenticationType.Basic);

	public static final String APIKEYID = "APIKeyID";
	public static final String EVENTCLICKEDCOUNT = "EventClickedCount";
	public static final String EVENTOPENEDCOUNT = "EventOpenedCount";
	public static final String EVENTCLICKDELAY = "EventClickDelay";
	public static final String EVENTOPENDELAY = "EventOpenDelay";
	public static final String EVENTUNSUBSCRIBEDCOUNT = "EventUnsubscribedCount";
	public static final String EVENTWORKFLOWEXITEDCOUNT = "EventWorkflowExitedCount";
	public static final String EVENTSPAMCOUNT = "EventSpamCount";
	public static final String MESSAGEBLOCKEDCOUNT = "MessageBlockedCount";
	public static final String MESSAGECLICKEDCOUNT = "MessageClickedCount";
	public static final String MESSAGEDEFERREDCOUNT = "MessageDeferredCount";
	public static final String MESSAGEHARDBOUNCEDCOUNT = "MessageHardBouncedCount";
	public static final String MESSAGEOPENEDCOUNT = "MessageOpenedCount";
	public static final String MESSAGEQUEUEDCOUNT = "MessageQueuedCount";
	public static final String MESSAGESENTCOUNT = "MessageSentCount";
	public static final String MESSAGESOFTBOUNCEDCOUNT = "MessageSoftBouncedCount";
	public static final String MESSAGESPAMCOUNT = "MessageSpamCount";
	public static final String MESSAGEUNSUBSCRIBEDCOUNT = "MessageUnsubscribedCount";
	public static final String MESSAGEWORKFLOWEXITEDCOUNT = "MessageWorkFlowExitedCount";
	public static final String SOURCEID = "SourceID";
	public static final String TOTAL = "Total";
	public static final String TIMESLICE = "Timeslice";
	
	public static final String COUNTERSOURCE = "CounterSource";
	public static final String COUNTERRESOLUTION = "CounterResolution";
	public static final String COUNTERTIMING = "CounterTiming";
	public static final String FROMTS = "FromTS";
	public static final String TOTS = "ToTS";
	
}
