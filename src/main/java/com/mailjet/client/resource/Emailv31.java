/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mailjet.client.resource;

import com.mailjet.client.Resource;
import com.mailjet.client.enums.ApiAuthenticationType;
import com.mailjet.client.enums.ApiVersion;

/**
 *
 * @author guillaume
 */
public class Emailv31 {

    public static Resource resource = new Resource("send", "", ApiVersion.V3_1, ApiAuthenticationType.Basic);

    public static String MESSAGES = "Messages";
    public static String SANDBOX_MODE = "SandboxMode";
    public static String ADVANCE_ERROR_HANDLING = "AdvanceErrorHandling";

    public static class Message {
      public static String EMAIL = "Email";
      public static String NAME = "Name";
      public static String FROM = "From";
      public static String SENDER = "Sender";
      public static String REPLYTO = "ReplyTo";
      public static String SUBJECT = "Subject";
      public static String TEXTPART = "TextPart";
      public static String HTMLPART = "HTMLPart";
      public static String VARS = "Variables";
      public static String TO = "To";
      public static String CC = "Cc";
      public static String BCC = "Bcc";
      public static String TEMPLATEID = "TemplateID";
      public static String TEMPLATELANGUAGE = "TemplateLanguage";
      public static String TEMPLATEERROR_REPORTING = "TemplateErrorReporting";
      public static String TEMPLATEERROR_DELIVERY = "TemplateErrorDeliver";
      public static String ATTACHMENTS = "Attachments";
      public static String INLINEDATTACHMENTS = "InlinedAttachments";
      public static String PRIORITY = "Priority";
      public static String CUSTOMID = "CustomID";
      public static String CUSTOMCAMPAIGN = "CustomCampaign";
      public static String DEDUPLICATECAMPAIGN = "DeduplicateCampaign";
      public static String EVENTPAYLOAD = "EventPayload";
      public static String HEADERS = "Headers";
      public static String VARIABLES = "Variables";
      public static String URLTAGS = "URLTags";

      public static String TRACKOPENS = "TrackOpens";
      public static String TRACKCLICKS = "TrackClicks";
      public static String MONITORINGCATEGORY = "MonitoringCategory";
    }
}
