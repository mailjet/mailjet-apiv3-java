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
public class EmailV3_1 {

    public static Resource resource = new Resource("send", "");

    public static String FROM = "From";
    public static String MJTEMPLATEMPLATEID = "Mj-Template-ID";
    public static String SUBJECT = "Subject";
    public static String TEXTPART = "TextPart";
    public static String HTMLPART = "HTMLPart";
    public static String VARS = "Vars";
    public static String TO = "To";
    public static String CC = "cc";
    public static String BCC = "bcc";
    public static String MJTEMPLATEID = "TemplateID";
    public static String MJTEMPLATELANGUAGE = "TemplateLanguage";
    public static String MJTEMPLATEERRORREPORTING = "TemplateErrorReporting";
    public static String MJTEMPLATEERRORDELIVERY = "TemplateErrorDeliver";
    public static String ATTACHMENTS = "Attachments";
    public static String INLINE_ATTACHMENTS = "InlineAttachments";
    public static String INLINEATTACHMENTS = "InlineAttachments";
    public static String MJPRIO = "Priority";
    public static String MJCUSTOMID = "CustomID";
    public static String MJCAMPAIGN = "CustomCampaign";
    public static String MJDEDUPLICATECAMPAIGN = "DeduplicateCampaign";
    public static String MJEVENTPAYLOAD = "EventPayload";
    public static String HEADERS = "Headers";
    public static String MESSAGE = "Message";
    public static String MESSAGES = "Messages";
}
