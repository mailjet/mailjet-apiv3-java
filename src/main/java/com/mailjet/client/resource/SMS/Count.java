package com.mailjet.client.resource.sms;

import com.mailjet.client.Resource;

/**
 *
 * @author Ivaylo Ivanov
 */
public class Count {

    public static Resource resource = new Resource("sms/count", "", true);

	public static String To = "To";
    public static String FromTS = "FromTS";
    public static String ToTS = "ToTS";
    public static String StatusCode = "StatusCode";

}