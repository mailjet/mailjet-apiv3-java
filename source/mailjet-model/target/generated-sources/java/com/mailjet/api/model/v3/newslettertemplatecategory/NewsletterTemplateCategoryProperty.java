
package com.mailjet.api.model.v3.newslettertemplatecategory;

import com.mailjet.api.client.model.MailJetKeyProperty;
import com.mailjet.api.client.model.MailJetResourceProperty;


/**
 * Class defining property constants for "newslettertemplatecategory" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:21 CEST 2014.
 * 
 */
public final class NewsletterTemplateCategoryProperty<DataType >
    extends MailJetResourceProperty<NewsletterTemplateCategory, DataType>
{

    /**
     * Category description (localized).
     * 
     */
    public final static NewsletterTemplateCategoryProperty<String> DESCRIPTION = new NewsletterTemplateCategoryProperty<String>("Description", String.class);
    /**
     * Unique numerical ID for this object.
     * 
     */
    public final static NewsletterTemplateCategoryProperty.Key<Long> ID = new NewsletterTemplateCategoryProperty.Key<Long>("ID", Long.class);
    /**
     * Locale in which the information in this record is recorded.
     * 
     */
    public final static NewsletterTemplateCategoryProperty<String> LOCALE = new NewsletterTemplateCategoryProperty<String>("Locale", String.class);
    /**
     * Parent category reference.
     * 
     */
    public final static NewsletterTemplateCategoryProperty<Long> PARENTCATEGORYID = new NewsletterTemplateCategoryProperty<Long>("ParentCategoryID", Long.class);
    /**
     * Category name.
     * 
     */
    public final static NewsletterTemplateCategoryProperty<String> VALUE = new NewsletterTemplateCategoryProperty<String>("Value", String.class);

    private NewsletterTemplateCategoryProperty(String name, Class<?> type) {
        super(name, type);
    }

    public static NewsletterTemplateCategoryProperty<Object> ref(String name) {
        return new NewsletterTemplateCategoryProperty<Object>(name, Object.class);
    }

    public final static class Key<KeyDataType >
        extends MailJetKeyProperty<NewsletterTemplateCategory, KeyDataType>
    {


        private Key(String name, Class<?> type) {
            super(name, type);
        }

    }

}
