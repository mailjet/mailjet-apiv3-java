package com.mailjet.client.resource.smses;

import com.mailjet.client.Resource.SMSes;

/**
 *
 * @author Ivaylo Ivanov
 */
public class Export {

    public static Resource resource = new Resource("sms/export", "", true);

	public static String FromTS = "FromTS";
    public static String ToTS = "ToTS";
    public static String ID = "ID";
    public static String URL = "URL";
    public static String Status = "Status";
    public static String CreationTS = "CreationTS";
    public static String ExpirationTS = "ExpirationTS";

}