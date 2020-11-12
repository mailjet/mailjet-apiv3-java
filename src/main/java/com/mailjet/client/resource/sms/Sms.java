package com.mailjet.client.resource.sms;

import com.mailjet.client.Resource;
import com.mailjet.client.enums.ApiAuthenticationType;
import com.mailjet.client.enums.ApiVersion;

/**
 *
 * @author Ivaylo Ivanov
 */
public class Sms {

    public static final Resource resource = new Resource("sms", "", ApiVersion.V4, ApiAuthenticationType.Bearer, true);

	public static final String FROM = "From";
    public static final String TO = "To";
    public static final String TEXT = "Text";
    public static final String MESSAGEID = "MessageID";
    public static final String SMSCOUNT = "SMSCount";
    public static final String CREATIONTS = "CreationTS";
    public static final String SENTTS = "SentTS";
    public static final String COST = "Cost";
    public static final String STATUS = "Status";
    public static final String FROMTS = "FromTS";
    public static final String TOTS = "ToTS";
    public static final String STATUSCODE = "StatusCode";
    public static final String OFFSET = "Offset";
    public static final String LIMIT = "Limit";

}