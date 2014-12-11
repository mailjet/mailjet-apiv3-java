
package com.mailjet.api.model.v3.newslettertemplate;

import com.mailjet.api.client.model.MailJetResourceFilter;


/**
 * Class representing filter for  "newslettertemplate" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:21 CEST 2014.
 * 
 */
public final class NewsletterTemplateFilter<DataType >
    extends MailJetResourceFilter<NewsletterTemplate, DataType>
{

    /**
     * Only show public newsletter templates.
     * 
     */
    public final static NewsletterTemplateFilter<Boolean> ISPUBLIC = new NewsletterTemplateFilter<Boolean>("IsPublic", Boolean.class);
    /**
     * Only retrieve templates for this category.
     * 
     */
    public final static NewsletterTemplateFilter<Long> NEWSLETTERTEMPLATECATEGORY = new NewsletterTemplateFilter<Long>("NewsLetterTemplateCategory", Long.class);

    private NewsletterTemplateFilter(String name, Class<?> type) {
        super(name, type);
    }

}
