package com.mailjet.client.resource.sms;

import com.mailjet.client.Resource;

/**
 *
 * @author Ivaylo Ivanov
 */
public class SMS {

    public static Resource resource = new Resource("sms", "", true);

	public static String From = "From";
    public static String To = "To";
    public static String Text = "Text";
    public static String MessageID = "MessageID";
    public static String SMSCount = "SMSCount";
    public static String CreationTS = "CreationTS";
    public static String SentTS = "SentTS";
    public static String Cost = "Cost";
    public static String Status = "Status";
    public static String FromTS = "FromTS";
    public static String ToTS = "ToTS";
    public static String StatusCode = "StatusCode";
    public static String Offset = "Offset";
    public static String Limit = "Limit";

}