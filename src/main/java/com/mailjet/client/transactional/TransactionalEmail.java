package com.mailjet.client.transactional;

import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Singular;

import java.util.List;
import java.util.Map;

/**
 * A model used to send emails through send api v3.1
 */
@Builder
public class TransactionalEmail {
    /**
     * The email subject line
     */
    private String subject;

    /**
     * Provides the HTML part of the message. Mandatory, if the TextPart and TemplateID parameters are not specified.
     */
    @SerializedName("HTMLPart")
    private String htmlPart;

    /**
     * Provides the Text part of the message. Mandatory, if the HTMLPart and TemplateID parameters are not specified.
     */
    private String textPart;

    /**
     *  Specifies the sender name and email address. Used when you want to send emails on behalf of a different email address. Must be a valid, activated sender for this account.
     *  See the /sender and /metasender API resources for more info.
     *  The Sender email address will be used to send the message, while the From email address will be displayed in the recipient's inbox.
     *  In such cases, it is not necessary for the From address to be verified. However, the information will be displayed in the inbox as From {from_email} via / sent on behalf of {sender_domain}.
     *  Note: This option is disabled by default. Contact the Support team if you want us to enable this setting on a specific API Key.
     */
    private SendContact sender;

    /**
     *  When Sender is not specified, the email address will be used to send the message.
     *  In such cases, it must be a valid, activated sender for this account.
     *  See the /sender and /metasender API resources for more info.
     *  When Sender is specified, the Sender email address will be used to send the message, while the From email address will be displayed in the recipient's inbox.
     *  In such cases, it is not necessary for the From address to be validated.
     *  When the Sender and From domains differ, the information will be displayed in the inbox as From {from_email} via / sent on behalf of {sender_domain}.
     *  If the From domain has a DMARC policy in effect(e.g.Yahoo, AOL), the message will not be delivered.Instead, it will either bounce or be considered as Spam.
     */
    private SendContact from;

    /**
     * the email address and name(optional), to which replies to this message will go.
     */
    private SendContact replyTo;

    /**
     * To recipients
     */
    @Singular("to")
    private List<SendContact> to;

    /**
     * CC recipients
     */
    @Singular("cc")
    private List<SendContact> cc;

    /**
     * BCC recipients
     */
    @Singular("bcc")
    private List<SendContact> bcc;

    /**
     * Unique numeric ID of the template to be used as email content. If the HTML/Text parts are specified, TemplateID will overwrite them.
     * Equivalent to using the X-MJ-TemplateID header through SMTP.
     */
    private Long templateID;

    /**
     * When true, activates the template language processing. Equivalent to using the X-MJ-TemplateLanguage header through SMTP.
     * Default value: false
     */
    private Boolean templateLanguage;

    /**
     * An object containing the email address and name of the recipient,
     * to whom a carbon copy with the error message is sent to in case of sending issues. Can only be used when TemplateLanguage=true.
     * Equivalent to using the X-MJ-TemplateErrorReporting header through SMTP.
     */
    private SendContact templateErrorReporting;

    /**
     * When true, the message delivery will proceed if an error is discovered in the templating language.
     * When false, the message delivery will be stopped.
     * Can only be used when TemplateLanguage= true.
     * Equivalent to using the X-MJ-TemplateErrorDeliver header through SMTP.
     * Default value: false
     */
    private Boolean templateErrorDelivery;

    /**
     * The array of attachments to the email
     * Each attachment contains the Filename, Content type and Base64 encoded content of the file.
     * The total size of attachments (including inline) should not exceed 15 MB.
     */
    @Singular
    private List<Attachment> attachments;

    /**
     * The array of inlined attachments to the email that are available for inline use.
     * Each attachment contains the Filename, Content type and Base64 encoded content of the file.
     * Inline attachments can be visible directly in the body of the message, depending on the email client support.
     * Insert the file into the HTML code of the email by using cid:Filename, or, if you have specified ContentID, by using cid:ContentID.
     * The total size of attachments(including inline) should not exceed 15 MB.
     */
    @Singular
    private List<Attachment> inlinedAttachments;

    /**
     * Indicates the processing priority inside your account (API Key) scheduling queue.
     * Equivalent of using X-Mailjet-Prio header through SMTP.
     * Default value: 2
     */
    private Integer priority;

    /**
     * Specifies a custom campaign name, to which all messages with this property value will be assigned.
     * If the campaign doesn't already exist it will be automatically created in the Mailjet system.
     * API users are allowed to send multiple emails from the same campaign name to the same contacts.
     * To block this feature, use the DeduplicateCampaign property.
     * Equivalent of using X-Mailjet-Campaign header through SMTP.
     */
    private String customCampaign;

    /**
     * Enables or disables the option to send messages from the same campaign to the same contact multiple times.
     * Equivalent of using X-Mailjet-DeduplicateCampaign header through SMTP.
     * Default value: false
     */
    private Boolean deduplicateCampaign;

    /**
     *  Enable or disable open tracking on this message.
     *  This property will overwrite the preferences selected in the Mailjet account.
     *  Equivalent of using X-Mailjet-TrackOpen header through SMTP.
     */
    private TrackOpens trackOpens;

    /**
     *  Enable or disable click tracking on this message.
     *  This property will overwrite the preferences selected in the Mailjet account.
     *  Equivalent of using X-Mailjet-TrackClick header through SMTP.
     */
    private TrackClicks trackClicks;

    /**
     * Select a user-defined custom ID.
     */
    private String customID;

    /**
     *  Defines a payload attached to the message.
     *  The Parse API will return the values in the payload.
     *  Any standard format can be used - XML, JSON, CSV etc.
     *  Equivalent of using X-MJ-EventPayload header through SMTP.
     */
    private String eventPayload;

    /**
     *  URL tags to append every URL link in the message.
     *  The user needs to provide the query between the ? and # characters in the URL.
     *  The URLTags value needs to be URL-encoded.
     */
    @SerializedName("URLTags")
    private String urlTags;

    /**
     * Additional email headers.
     */
    @Singular
    private Map<String, String> headers;

    /**
     * Adds variable used to modify the content of your email.
     * Specified as {var_name}:{var_value} pairs.
     * Enter the information in the template text / HTML part by using the [[var:{var_name}]] format.
     * Equivalent of using X-MJ-Vars header through SMTP.
     */
    @Singular
    private Map<String, String> variables;
}
