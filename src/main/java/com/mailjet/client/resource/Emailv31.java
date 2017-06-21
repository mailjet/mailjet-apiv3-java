/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mailjet.client.resource;

import com.mailjet.client.Resource;

/**
 *
 * @author guillaume
 */
public class Emailv31 {

    public static Resource resource = new Resource("send", "");

    public static String EMAIL = "Email";
    public static String NAME = "Name";
    public static String FROM = "From";
    public static String SENDER = "Sender";
    public static String REPLY_TO = "ReplyTo";
    public static String SUBJECT = "Subject";
    public static String TEXT_PART = "TextPart";
    public static String HTML_PART = "HTMLPart";
    public static String VARS = "Variables";
    public static String TO = "To";
    public static String CC = "Cc";
    public static String BCC = "Bcc";
    public static String TEMPLATE_ID = "TemplateID";
    public static String TEMPLATE_LANGUAGE = "TemplateLanguage";
    public static String TEMPLATE_ERROR_REPORTING = "TemplateErrorReporting";
    public static String TEMPLATE_ERROR_DELIVERY = "TemplateErrorDeliver";
    public static String ATTACHMENTS = "Attachments";
    public static String INLINED_ATTACHMENTS = "InlinedAttachments";
    public static String PRIORITY = "Priority";
    public static String CUSTOM_ID = "CustomID";
    public static String CUSTOM_CAMPAIGN = "CustomCampaign";
    public static String DEDUPLICATE_CAMPAIGN = "DeduplicateCampaign";
    public static String EVENT_PAYLOAD = "EventPayload";
    public static String HEADERS = "Headers";
    public static String MESSAGES = "Messages";
    public static String TRACK_OPENS = "TrackOpens";
    public static String TRACK_CLICKS = "TrackClicks";
    public static String MONITORING_CATEGORY = "MonitoringCategory";
}
