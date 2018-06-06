package com.mailjet.client.resource.sms;

import com.mailjet.client.Resource;

/**
 *
 * @author Ivaylo Ivanov
 */
public class SmsExport {

    public static final Resource resource = new Resource("sms/export", "", true);

	public static final String FROMTS = "FromTS";
    public static final String TOTS = "ToTS";
    public static final String ID = "ID";
    public static final String URL = "URL";
    public static final String STATUS = "Status";
    public static final String CREATIONTS = "CreationTS";
    public static final String EXPIRATIONTS = "ExpirationTS";

}