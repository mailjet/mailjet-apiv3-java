
package com.mailjet.api.model.v3.newslettertemplatecategory;

import com.mailjet.api.client.MailJetApiService;
import com.mailjet.api.client.model.ResourceOperationTypes;
import com.mailjet.api.client.model.metadata.Component;
import com.mailjet.api.client.model.metadata.Resource;


/**
 * Class representing "Manage categories for your newsletters. Allows you to group newsletters by category.".
 * 
 * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
 * 
 */
@Resource(name = "newslettertemplatecategory", description = "Manage categories for your newsletters. Allows you to group newsletters by category.", allowedOperations = {
    ResourceOperationTypes.Get
})
public final class NewsletterTemplateCategory {

    @Component(name = "Description", type = "AnsiString", defaultValue = "", required = true, description = "Category description (localized).")
    private String Description;
    @Component(name = "ID", type = "Int64", defaultValue = "", required = false, description = "Unique numerical ID for this object.")
    private Long ID;
    @Component(name = "Locale", type = "AnsiString", defaultValue = "", required = true, description = "Locale in which the information in this record is recorded.")
    private String Locale;
    @Component(name = "ParentCategoryID", type = "TNewsLetterTemplateCategory", defaultValue = "", required = true, description = "Parent category reference.")
    private Long ParentCategoryID;
    @Component(name = "Value", type = "AnsiString", defaultValue = "", required = true, description = "Category name.")
    private String Value;
    /**
     * API Operation "List".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<NewsletterTemplateCategory>> List = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<NewsletterTemplateCategory>>(NewsletterTemplateCategory.class, ResourceOperationTypes.Get);
    /**
     * API Operation "Get".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.RetrieveById<NewsletterTemplateCategory>> Get = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.RetrieveById<NewsletterTemplateCategory>>(NewsletterTemplateCategory.class, ResourceOperationTypes.GetById);

    /**
     * Gets "Category description (localized)." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getDescription() {
        return Description;
    }

    /**
     * Sets the specified value to "Category description (localized)." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public NewsletterTemplateCategory setDescription(String value) {
        Description = value;
        return this;
    }

    /**
     * Gets "Unique numerical ID for this object." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getID() {
        return ID;
    }

    /**
     * Sets the specified value to "Unique numerical ID for this object." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public NewsletterTemplateCategory setID(Long value) {
        ID = value;
        return this;
    }

    /**
     * Gets "Locale in which the information in this record is recorded." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getLocale() {
        return Locale;
    }

    /**
     * Sets the specified value to "Locale in which the information in this record is recorded." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public NewsletterTemplateCategory setLocale(String value) {
        Locale = value;
        return this;
    }

    /**
     * Gets "Parent category reference." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getParentCategoryID() {
        return ParentCategoryID;
    }

    /**
     * Sets the specified value to "Parent category reference." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public NewsletterTemplateCategory setParentCategoryID(Long value) {
        ParentCategoryID = value;
        return this;
    }

    /**
     * Gets "Category name." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getValue() {
        return Value;
    }

    /**
     * Sets the specified value to "Category name." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public NewsletterTemplateCategory setValue(String value) {
        Value = value;
        return this;
    }

    public String toString() {
        return ((NewsletterTemplateCategory.class.getSimpleName()+"#")+ this.getID());
    }

}
