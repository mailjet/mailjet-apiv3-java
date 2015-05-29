
package com.mailjet.api.model.v3.newslettertemplate;

import java.util.Date;
import com.mailjet.api.client.model.MailJetKeyProperty;
import com.mailjet.api.client.model.MailJetResourceProperty;


/**
 * Class defining property constants for "newslettertemplate" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
 * 
 */
public final class NewsletterTemplateProperty<DataType >
    extends MailJetResourceProperty<NewsletterTemplate, DataType>
{

    /**
     * Category for this newsletter.
     * 
     */
    public final static NewsletterTemplateProperty<Long> CATEGORYID = new NewsletterTemplateProperty<Long>("CategoryID", Long.class);
    /**
     * Timestamp when object was created in database.
     * 
     */
    public final static NewsletterTemplateProperty<Date> CREATEDAT = new NewsletterTemplateProperty<Date>("CreatedAt", Date.class);
    /**
     * Footer type to generate.
     * 
     */
    public final static NewsletterTemplateProperty<NewsletterTemplate.Footer> FOOTER = new NewsletterTemplateProperty<NewsletterTemplate.Footer>("Footer", NewsletterTemplate.Footer.class);
    /**
     * Address to use in footer.
     * 
     */
    public final static NewsletterTemplateProperty<String> FOOTERADDRESS = new NewsletterTemplateProperty<String>("FooterAddress", String.class);
    /**
     * What kind of footer to generate.
     * 
     */
    public final static NewsletterTemplateProperty<Short> FOOTERWYSIWYGTYPE = new NewsletterTemplateProperty<Short>("FooterWYSIWYGType", Short.class);
    /**
     * Filename to use in header.
     * 
     */
    public final static NewsletterTemplateProperty<String> HEADERFILENAME = new NewsletterTemplateProperty<String>("HeaderFilename", String.class);
    /**
     * Link used in header.
     * 
     */
    public final static NewsletterTemplateProperty<String> HEADERLINK = new NewsletterTemplateProperty<String>("HeaderLink", String.class);
    /**
     * Text of header.
     * 
     */
    public final static NewsletterTemplateProperty<String> HEADERTEXT = new NewsletterTemplateProperty<String>("HeaderText", String.class);
    /**
     * URL used in header.
     * 
     */
    public final static NewsletterTemplateProperty<String> HEADERURL = new NewsletterTemplateProperty<String>("HeaderUrl", String.class);
    /**
     * Unique numerical ID for this object.
     * 
     */
    public final static NewsletterTemplateProperty.Key<Long> ID = new NewsletterTemplateProperty.Key<Long>("ID", Long.class);
    /**
     * Locale in which the information in this record is recorded.
     * 
     */
    public final static NewsletterTemplateProperty<String> LOCALE = new NewsletterTemplateProperty<String>("Locale", String.class);
    /**
     * Name for this newsletter.
     * 
     */
    public final static NewsletterTemplateProperty<String> NAME = new NewsletterTemplateProperty<String>("Name", String.class);
    /**
     * Type of permalink that should be added to the newsletter.
     * 
     */
    public final static NewsletterTemplateProperty<NewsletterTemplate.Permalink> PERMALINK = new NewsletterTemplateProperty<NewsletterTemplate.Permalink>("Permalink", NewsletterTemplate.Permalink.class);
    /**
     * ?.
     * 
     */
    public final static NewsletterTemplateProperty<Short> PERMALINKWYSIWYGTYPE = new NewsletterTemplateProperty<Short>("PermalinkWYSIWYGType", Short.class);
    /**
     * When specified in POST or PUT, copy data from this newsletter.
     * 
     */
    public final static NewsletterTemplateProperty<Long> SOURCENEWSLETTERID = new NewsletterTemplateProperty<Long>("SourceNewsLetterID", Long.class);
    /**
     * Status of the newsletter template.
     * 
     */
    public final static NewsletterTemplateProperty<Short> STATUS = new NewsletterTemplateProperty<Short>("Status", Short.class);

    private NewsletterTemplateProperty(String name, Class<?> type) {
        super(name, type);
    }

    public static NewsletterTemplateProperty<Object> ref(String name) {
        return new NewsletterTemplateProperty<Object>(name, Object.class);
    }

    public final static class Key<KeyDataType >
        extends MailJetKeyProperty<NewsletterTemplate, KeyDataType>
    {


        private Key(String name, Class<?> type) {
            super(name, type);
        }

    }

}
