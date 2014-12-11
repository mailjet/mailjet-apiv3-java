
package com.mailjet.api.model.v3.newsletter;

import java.util.Date;
import com.mailjet.api.client.model.MailJetResourceFilter;


/**
 * Class representing filter for  "newsletter" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:21 CEST 2014.
 * 
 */
public final class NewsletterFilter<DataType >
    extends MailJetResourceFilter<Newsletter, DataType>
{

    /**
     * 
     * 
     */
    public final static NewsletterFilter<Long> AXTESTING = new NewsletterFilter<Long>("AXTesting", Long.class);
    /**
     * Only retrieve Newsletter resources for which Campaign ID equals the specified value.
     * 
     */
    public final static NewsletterFilter<Long> CAMPAIGN = new NewsletterFilter<Long>("Campaign", Long.class);
    /**
     * Only retrieve newsletter resources for which ContactsList ID equals the specified value.
     * 
     */
    public final static NewsletterFilter<Long> CONTACTSLIST = new NewsletterFilter<Long>("ContactsList", Long.class);
    /**
     * Only retrieve newsletters delivered after this value.
     * 
     */
    public final static NewsletterFilter<Date> DELIVEREDAT = new NewsletterFilter<Date>("DeliveredAt", Date.class);
    /**
     * Only retrieve newsletters with edit mode equal to the specified value.
     * 
     */
    public final static NewsletterFilter<Newsletter.EditMode> EDITMODE = new NewsletterFilter<Newsletter.EditMode>("EditMode", Newsletter.EditMode.class);
    /**
     * Only retrieve newsletter resources for which IsArchived equals the specified value.
     * 
     */
    public final static NewsletterFilter<Boolean> ISARCHIVED = new NewsletterFilter<Boolean>("IsArchived", Boolean.class);
    /**
     * 
     * 
     */
    public final static NewsletterFilter<Boolean> ISCAMPAIGN = new NewsletterFilter<Boolean>("IsCampaign", Boolean.class);
    /**
     * Only retrieve campaigns where isDeleted matches the specified value.
     * 
     */
    public final static NewsletterFilter<Boolean> ISDELETED = new NewsletterFilter<Boolean>("IsDeleted", Boolean.class);
    /**
     * Only retrieve newsletters with IsHandled equal to the specified value.
     * 
     */
    public final static NewsletterFilter<Boolean> ISHANDLED = new NewsletterFilter<Boolean>("IsHandled", Boolean.class);
    /**
     * Only retrieve newsletters with IsStarred equal to the specified value.
     * 
     */
    public final static NewsletterFilter<Boolean> ISSTARRED = new NewsletterFilter<Boolean>("IsStarred", Boolean.class);
    /**
     * Only retrieve modified newsletters.
     * 
     */
    public final static NewsletterFilter<Boolean> MODIFIED = new NewsletterFilter<Boolean>("Modified", Boolean.class);
    /**
     * Only retrieve newsletters based on this template.
     * 
     */
    public final static NewsletterFilter<Long> NEWSLETTERTEMPLATE = new NewsletterFilter<Long>("NewsLetterTemplate", Long.class);
    /**
     * 
     * 
     */
    public final static NewsletterFilter<Long> SEGMENTATION = new NewsletterFilter<Long>("Segmentation", Long.class);
    /**
     * Comma-separated list of statuses: only newsletters with these statuses are retrieved.
     * 
     */
    public final static NewsletterFilter<Newsletter.Status> STATUS = new NewsletterFilter<Newsletter.Status>("Status", Newsletter.Status.class);
    /**
     * Only retrieve newsletters with this subject.
     * 
     */
    public final static NewsletterFilter<String> SUBJECT = new NewsletterFilter<String>("Subject", String.class);

    private NewsletterFilter(String name, Class<?> type) {
        super(name, type);
    }

}
