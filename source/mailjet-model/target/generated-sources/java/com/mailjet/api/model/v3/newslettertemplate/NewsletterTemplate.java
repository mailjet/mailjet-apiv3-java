
package com.mailjet.api.model.v3.newslettertemplate;

import java.util.Date;
import com.mailjet.api.client.MailJetApiService;
import com.mailjet.api.client.model.ResourceOperationTypes;
import com.mailjet.api.client.model.metadata.Component;
import com.mailjet.api.client.model.metadata.EnumValue;
import com.mailjet.api.client.model.metadata.Resource;


/**
 * Class representing "Manages a Newsletter Template Properties.".
 * 
 * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
 * 
 */
@Resource(name = "newslettertemplate", description = "Manages a Newsletter Template Properties.", allowedOperations = {
    ResourceOperationTypes.Get,
    ResourceOperationTypes.Put,
    ResourceOperationTypes.Post
})
public final class NewsletterTemplate {

    @Component(name = "CategoryID", type = "TNewsLetterTemplateCategory", defaultValue = "", required = false, description = "Category for this newsletter.")
    private Long CategoryID;
    @Component(name = "CreatedAt", type = "TRFC3339DateTime", defaultValue = "Current time", required = false, description = "Timestamp when object was created in database.")
    private Date CreatedAt;
    @Component(name = "Footer", type = "AnsiString", defaultValue = "default", required = false, description = "Footer type to generate.")
    private NewsletterTemplate.Footer Footer;
    @Component(name = "FooterAddress", type = "AnsiString", defaultValue = "", required = false, description = "Address to use in footer.")
    private String FooterAddress;
    @Component(name = "FooterWYSIWYGType", type = "SmallInt", defaultValue = "", required = false, description = "What kind of footer to generate.")
    private Short FooterWYSIWYGType;
    @Component(name = "HeaderFilename", type = "AnsiString", defaultValue = "", required = false, description = "Filename to use in header.")
    private String HeaderFilename;
    @Component(name = "HeaderLink", type = "AnsiString", defaultValue = "", required = false, description = "Link used in header.")
    private String HeaderLink;
    @Component(name = "HeaderText", type = "AnsiString", defaultValue = "", required = false, description = "Text of header.")
    private String HeaderText;
    @Component(name = "HeaderUrl", type = "AnsiString", defaultValue = "", required = false, description = "URL used in header.")
    private String HeaderUrl;
    @Component(name = "ID", type = "Int64", defaultValue = "", required = false, description = "Unique numerical ID for this object.")
    private Long ID;
    @Component(name = "Locale", type = "AnsiString", defaultValue = "", required = true, description = "Locale in which the information in this record is recorded.")
    private String Locale;
    @Component(name = "Name", type = "AnsiString", defaultValue = "", required = false, description = "Name for this newsletter.")
    private String Name;
    @Component(name = "Permalink", type = "AnsiString", defaultValue = "default", required = false, description = "Type of permalink that should be added to the newsletter.")
    private NewsletterTemplate.Permalink Permalink;
    @Component(name = "PermalinkWYSIWYGType", type = "SmallInt", defaultValue = "", required = false, description = "?.")
    private Short PermalinkWYSIWYGType;
    @Component(name = "SourceNewsLetterID", type = "Int64", defaultValue = "", required = false, description = "When specified in POST or PUT, copy data from this newsletter.")
    private Long SourceNewsLetterID;
    @Component(name = "Status", type = "SmallInt", defaultValue = "", required = false, description = "Status of the newsletter template.")
    private Short Status;
    /**
     * API Operation "List".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<NewsletterTemplate>> List = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<NewsletterTemplate>>(NewsletterTemplate.class, ResourceOperationTypes.Get);
    /**
     * API Operation "Get".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.RetrieveById<NewsletterTemplate>> Get = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.RetrieveById<NewsletterTemplate>>(NewsletterTemplate.class, ResourceOperationTypes.GetById);
    /**
     * API Operation "Update".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Update<NewsletterTemplate>> Update = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Update<NewsletterTemplate>>(NewsletterTemplate.class, ResourceOperationTypes.Put);
    /**
     * API Operation "Create".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Create<NewsletterTemplate>> Create = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Create<NewsletterTemplate>>(NewsletterTemplate.class, ResourceOperationTypes.Post);

    /**
     * Gets "Category for this newsletter." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getCategoryID() {
        return CategoryID;
    }

    /**
     * Sets the specified value to "Category for this newsletter." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public NewsletterTemplate setCategoryID(Long value) {
        CategoryID = value;
        return this;
    }

    /**
     * Gets "Timestamp when object was created in database." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Date getCreatedAt() {
        return CreatedAt;
    }

    /**
     * Sets the specified value to "Timestamp when object was created in database." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public NewsletterTemplate setCreatedAt(Date value) {
        CreatedAt = value;
        return this;
    }

    /**
     * Gets "Footer type to generate." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public NewsletterTemplate.Footer getFooter() {
        return Footer;
    }

    /**
     * Sets the specified value to "Footer type to generate." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public NewsletterTemplate setFooter(NewsletterTemplate.Footer value) {
        Footer = value;
        return this;
    }

    /**
     * Gets "Address to use in footer." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getFooterAddress() {
        return FooterAddress;
    }

    /**
     * Sets the specified value to "Address to use in footer." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public NewsletterTemplate setFooterAddress(String value) {
        FooterAddress = value;
        return this;
    }

    /**
     * Gets "What kind of footer to generate." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Short getFooterWYSIWYGType() {
        return FooterWYSIWYGType;
    }

    /**
     * Sets the specified value to "What kind of footer to generate." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public NewsletterTemplate setFooterWYSIWYGType(Short value) {
        FooterWYSIWYGType = value;
        return this;
    }

    /**
     * Gets "Filename to use in header." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getHeaderFilename() {
        return HeaderFilename;
    }

    /**
     * Sets the specified value to "Filename to use in header." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public NewsletterTemplate setHeaderFilename(String value) {
        HeaderFilename = value;
        return this;
    }

    /**
     * Gets "Link used in header." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getHeaderLink() {
        return HeaderLink;
    }

    /**
     * Sets the specified value to "Link used in header." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public NewsletterTemplate setHeaderLink(String value) {
        HeaderLink = value;
        return this;
    }

    /**
     * Gets "Text of header." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getHeaderText() {
        return HeaderText;
    }

    /**
     * Sets the specified value to "Text of header." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public NewsletterTemplate setHeaderText(String value) {
        HeaderText = value;
        return this;
    }

    /**
     * Gets "URL used in header." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getHeaderUrl() {
        return HeaderUrl;
    }

    /**
     * Sets the specified value to "URL used in header." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public NewsletterTemplate setHeaderUrl(String value) {
        HeaderUrl = value;
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
    public NewsletterTemplate setID(Long value) {
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
    public NewsletterTemplate setLocale(String value) {
        Locale = value;
        return this;
    }

    /**
     * Gets "Name for this newsletter." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getName() {
        return Name;
    }

    /**
     * Sets the specified value to "Name for this newsletter." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public NewsletterTemplate setName(String value) {
        Name = value;
        return this;
    }

    /**
     * Gets "Type of permalink that should be added to the newsletter." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public NewsletterTemplate.Permalink getPermalink() {
        return Permalink;
    }

    /**
     * Sets the specified value to "Type of permalink that should be added to the newsletter." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public NewsletterTemplate setPermalink(NewsletterTemplate.Permalink value) {
        Permalink = value;
        return this;
    }

    /**
     * Gets "?." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Short getPermalinkWYSIWYGType() {
        return PermalinkWYSIWYGType;
    }

    /**
     * Sets the specified value to "?." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public NewsletterTemplate setPermalinkWYSIWYGType(Short value) {
        PermalinkWYSIWYGType = value;
        return this;
    }

    /**
     * Gets "When specified in POST or PUT, copy data from this newsletter." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getSourceNewsLetterID() {
        return SourceNewsLetterID;
    }

    /**
     * Sets the specified value to "When specified in POST or PUT, copy data from this newsletter." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public NewsletterTemplate setSourceNewsLetterID(Long value) {
        SourceNewsLetterID = value;
        return this;
    }

    /**
     * Gets "Status of the newsletter template." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Short getStatus() {
        return Status;
    }

    /**
     * Sets the specified value to "Status of the newsletter template." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public NewsletterTemplate setStatus(Short value) {
        Status = value;
        return this;
    }

    public String toString() {
        return ((NewsletterTemplate.class.getSimpleName()+"#")+ this.getID());
    }


    /**
     * Enumeration defining allowed values for "Footer"(Footer type to generate.) MailJet API property.
     * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
     * 
     */
    public static enum Footer {


        /**
         * Value "default".
         * 
         */
        @EnumValue("default")
        DEFAULT,

        /**
         * Value "none".
         * 
         */
        @EnumValue("none")
        NONE;

    }


    /**
     * Enumeration defining allowed values for "Permalink"(Type of permalink that should be added to the newsletter.) MailJet API property.
     * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
     * 
     */
    public static enum Permalink {


        /**
         * Value "default".
         * 
         */
        @EnumValue("default")
        DEFAULT,

        /**
         * Value "none".
         * 
         */
        @EnumValue("none")
        NONE;

    }

}
