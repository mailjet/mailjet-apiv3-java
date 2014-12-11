
package com.mailjet.api.model.v3.newsletter;

import java.math.BigDecimal;
import java.util.Date;
import com.mailjet.api.client.model.MailJetKeyProperty;
import com.mailjet.api.client.model.MailJetResourceProperty;


/**
 * Class defining property constants for "newsletter" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:21 CEST 2014.
 * 
 */
public final class NewsletterProperty<DataType >
    extends MailJetResourceProperty<Newsletter, DataType>
{

    /**
     * 
     * 
     */
    public final static NewsletterProperty<BigDecimal> AXFRACTION = new NewsletterProperty<BigDecimal>("AXFraction", BigDecimal.class);
    /**
     * 
     * 
     */
    public final static NewsletterProperty<String> AXFRACTIONNAME = new NewsletterProperty<String>("AXFractionName", String.class);
    /**
     * 
     * 
     */
    public final static NewsletterProperty<Long> AXTESTINGID = new NewsletterProperty<Long>("AXTestingID", Long.class);
    /**
     * Callback URL.
     * 
     */
    public final static NewsletterProperty<String> CALLBACK = new NewsletterProperty<String>("Callback", String.class);
    /**
     * Reference to campaign created for this newsletter.
     * 
     */
    public final static NewsletterProperty<Long> CAMPAIGNID = new NewsletterProperty<Long>("CampaignID", Long.class);
    /**
     * Reference to contacts list to which newsletter will be sent.
     * 
     */
    public final static NewsletterProperty<Long> CONTACTSLISTID = new NewsletterProperty<Long>("ContactsListID", Long.class);
    /**
     * Timestamp when object was created in database.
     * 
     */
    public final static NewsletterProperty<Date> CREATEDAT = new NewsletterProperty<Date>("CreatedAt", Date.class);
    /**
     * When the newsletter was delivered.
     * 
     */
    public final static NewsletterProperty<Date> DELIVEREDAT = new NewsletterProperty<Date>("DeliveredAt", Date.class);
    /**
     * Edit mode for newsletter.
     * 
     */
    public final static NewsletterProperty<Newsletter.EditMode> EDITMODE = new NewsletterProperty<Newsletter.EditMode>("EditMode", Newsletter.EditMode.class);
    /**
     * Edit type.
     * 
     */
    public final static NewsletterProperty<Newsletter.EditType> EDITTYPE = new NewsletterProperty<Newsletter.EditType>("EditType", Newsletter.EditType.class);
    /**
     * Footer type to generate.
     * 
     */
    public final static NewsletterProperty<Newsletter.Footer> FOOTER = new NewsletterProperty<Newsletter.Footer>("Footer", Newsletter.Footer.class);
    /**
     * Address to use in footer.
     * 
     */
    public final static NewsletterProperty<String> FOOTERADDRESS = new NewsletterProperty<String>("FooterAddress", String.class);
    /**
     * What kind of footer to generate.
     * 
     */
    public final static NewsletterProperty<Short> FOOTERWYSIWYGTYPE = new NewsletterProperty<Short>("FooterWYSIWYGType", Short.class);
    /**
     * Filename to use in header.
     * 
     */
    public final static NewsletterProperty<String> HEADERFILENAME = new NewsletterProperty<String>("HeaderFilename", String.class);
    /**
     * Link used in header.
     * 
     */
    public final static NewsletterProperty<String> HEADERLINK = new NewsletterProperty<String>("HeaderLink", String.class);
    /**
     * Text of header.
     * 
     */
    public final static NewsletterProperty<String> HEADERTEXT = new NewsletterProperty<String>("HeaderText", String.class);
    /**
     * URL used in header.
     * 
     */
    public final static NewsletterProperty<String> HEADERURL = new NewsletterProperty<String>("HeaderUrl", String.class);
    /**
     * Unique numerical ID for this object.
     * 
     */
    public final static NewsletterProperty.Key<Long> ID = new NewsletterProperty.Key<Long>("ID", Long.class);
    /**
     * IP address used to create newsletter.
     * 
     */
    public final static NewsletterProperty<String> IP = new NewsletterProperty<String>("Ip", String.class);
    /**
     * Has the newsletter been handled by Mailjet ?.
     * 
     */
    public final static NewsletterProperty<Boolean> ISHANDLED = new NewsletterProperty<Boolean>("IsHandled", Boolean.class);
    /**
     * Is this a starred newsletter ?.
     * 
     */
    public final static NewsletterProperty<Boolean> ISSTARRED = new NewsletterProperty<Boolean>("IsStarred", Boolean.class);
    /**
     * Does the newsletter include a text version ?.
     * 
     */
    public final static NewsletterProperty<Boolean> ISTEXTPARTINCLUDED = new NewsletterProperty<Boolean>("IsTextPartIncluded", Boolean.class);
    /**
     * Locale in which the information in this record is recorded.
     * 
     */
    public final static NewsletterProperty<String> LOCALE = new NewsletterProperty<String>("Locale", String.class);
    /**
     * Timestamp when newsletter content was last modified.
     * 
     */
    public final static NewsletterProperty<Date> MODIFIEDAT = new NewsletterProperty<Date>("ModifiedAt", Date.class);
    /**
     * Type of permalink that should be added to the newsletter.
     * 
     */
    public final static NewsletterProperty<Newsletter.Permalink> PERMALINK = new NewsletterProperty<Newsletter.Permalink>("Permalink", Newsletter.Permalink.class);
    /**
     * Host for the permalink.
     * 
     */
    public final static NewsletterProperty<String> PERMALINKHOST = new NewsletterProperty<String>("PermalinkHost", String.class);
    /**
     * ?.
     * 
     */
    public final static NewsletterProperty<Short> PERMALINKWYSIWYGTYPE = new NewsletterProperty<Short>("PermalinkWYSIWYGType", Short.class);
    /**
     * ?.
     * 
     */
    public final static NewsletterProperty<Short> POLITENESSMODE = new NewsletterProperty<Short>("PolitenessMode", Short.class);
    /**
     * Reply-To address for the mail.
     * 
     */
    public final static NewsletterProperty<String> REPLYEMAIL = new NewsletterProperty<String>("ReplyEmail", String.class);
    /**
     * 
     * 
     */
    public final static NewsletterProperty<Long> SEGMENTATIONID = new NewsletterProperty<Long>("SegmentationID", Long.class);
    /**
     * Sender.
     * 
     */
    public final static NewsletterProperty<String> SENDER = new NewsletterProperty<String>("Sender", String.class);
    /**
     * Sender email address in headers.
     * 
     */
    public final static NewsletterProperty<String> SENDEREMAIL = new NewsletterProperty<String>("SenderEmail", String.class);
    /**
     * Name of the sender in Sender headers.
     * 
     */
    public final static NewsletterProperty<String> SENDERNAME = new NewsletterProperty<String>("SenderName", String.class);
    /**
     * Status of the newsletter.
     * 
     */
    public final static NewsletterProperty<Newsletter.Status> STATUS = new NewsletterProperty<Newsletter.Status>("Status", Newsletter.Status.class);
    /**
     * Newsletter subject.
     * 
     */
    public final static NewsletterProperty<String> SUBJECT = new NewsletterProperty<String>("Subject", String.class);
    /**
     * Template from which this newsletter was generated, or as which it was last saved.
     * 
     */
    public final static NewsletterProperty<Long> TEMPLATEID = new NewsletterProperty<Long>("TemplateID", Long.class);
    /**
     * Address used for testing.
     * 
     */
    public final static NewsletterProperty<String> TESTADDRESS = new NewsletterProperty<String>("TestAddress", String.class);
    /**
     * Newsletter title.
     * 
     */
    public final static NewsletterProperty<String> TITLE = new NewsletterProperty<String>("Title", String.class);
    /**
     * URL where an online version of the newsletter can be found [?].
     * 
     */
    public final static NewsletterProperty<String> URL = new NewsletterProperty<String>("Url", String.class);

    private NewsletterProperty(String name, Class<?> type) {
        super(name, type);
    }

    public static NewsletterProperty<Object> ref(String name) {
        return new NewsletterProperty<Object>(name, Object.class);
    }

    public final static class Key<KeyDataType >
        extends MailJetKeyProperty<Newsletter, KeyDataType>
    {


        private Key(String name, Class<?> type) {
            super(name, type);
        }

    }

}
