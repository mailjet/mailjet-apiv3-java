
package com.mailjet.api.model.v3.newslettertemplatecategory;

import com.mailjet.api.client.model.MailJetResourceFilter;


/**
 * Class representing filter for  "newslettertemplatecategory" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
 * 
 */
public final class NewsletterTemplateCategoryFilter<DataType >
    extends MailJetResourceFilter<NewsletterTemplateCategory, DataType>
{

    /**
     * Only retrieve newslettertemplatecategory resources for which Locale equals the specified value.
     * 
     */
    public final static NewsletterTemplateCategoryFilter<String> LOCALE = new NewsletterTemplateCategoryFilter<String>("Locale", String.class);

    private NewsletterTemplateCategoryFilter(String name, Class<?> type) {
        super(name, type);
    }

}
