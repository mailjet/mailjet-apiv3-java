package com.mailjet.client.resource.smses;

import com.mailjet.client.Resource.SMSes;

/**
 *
 * @author Ivaylo Ivanov
 */
public class Send {

    public static Resource resource = new Resource("sms-send", "", true);

	public static String From = "From";
    public static String To = "To";
    public static String Text = "Text";
    public static String MessageID = "MessageID";
    public static String SMSCount = "SMSCount";
    public static String CreationTS = "CreationTS";
    public static String SentTS = "SentTS";
    public static String Cost = "Cost";
    public static String Status = "Status";

}