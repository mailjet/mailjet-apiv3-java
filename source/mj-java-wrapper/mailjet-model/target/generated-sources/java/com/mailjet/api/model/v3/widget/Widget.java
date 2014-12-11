
package com.mailjet.api.model.v3.widget;

import com.mailjet.api.client.MailJetApiService;
import com.mailjet.api.client.model.ResourceOperationTypes;
import com.mailjet.api.client.model.metadata.Component;
import com.mailjet.api.client.model.metadata.Resource;


/**
 * Class representing "Manage settings for Widgets. Widgets are small registration forms that you may include on your website to ease the process of subscribing to a Contacts List.Mailjet widget definitions.".
 * 
 * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:21 CEST 2014.
 * 
 */
@Resource(name = "widget", description = "Manage settings for Widgets. Widgets are small registration forms that you may include on your website to ease the process of subscribing to a Contacts List.Mailjet widget definitions.", allowedOperations = {
    ResourceOperationTypes.Get,
    ResourceOperationTypes.Put,
    ResourceOperationTypes.Post,
    ResourceOperationTypes.Delete
})
public final class Widget {

    @Component(name = "CreatedAt", type = "Int64", defaultValue = "", required = false, description = "Timestamp when widget was created.")
    private Long CreatedAt;
    @Component(name = "From", type = "TSender", defaultValue = "", required = true, description = "Reference to Sender address for this widget.")
    private Long FromID;
    @Component(name = "ID", type = "Int64", defaultValue = "", required = false, description = "Unique numerical ID for this object.")
    private Long ID;
    @Component(name = "IsActive", type = "Boolean", defaultValue = "false", required = false, description = "Is the widget still active.")
    private Boolean IsActive;
    @Component(name = "List", type = "TContactsList", defaultValue = "", required = true, description = "Contactslist for which this widget handles subscriptions.")
    private Long ListID;
    @Component(name = "Locale", type = "AnsiString", defaultValue = "", required = true, description = "Locale in which the information in this record is recorded.")
    private String Locale;
    @Component(name = "Name", type = "AnsiString", defaultValue = "", required = false, description = "Name for this widget.")
    private String Name;
    @Component(name = "Replyto", type = "TEmail", defaultValue = "", required = false, description = "Reply To email address for this widhet.")
    private String Replyto;
    @Component(name = "Sendername", type = "AnsiString", defaultValue = "", required = false, description = "Sender name for this widget.")
    private String Sendername;
    @Component(name = "Subject", type = "AnsiString", defaultValue = "", required = false, description = "Subject for this widget.")
    private String Subject;
    @Component(name = "Template", type = "TMessageTemplate", defaultValue = "", required = false, description = "Message to send when sending mail for this widget.")
    private Long TemplateID;
    /**
     * API Operation "List".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<Widget>> List = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<Widget>>(Widget.class, ResourceOperationTypes.Get);
    /**
     * API Operation "Get".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.RetrieveById<Widget>> Get = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.RetrieveById<Widget>>(Widget.class, ResourceOperationTypes.GetById);
    /**
     * API Operation "Update".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Update<Widget>> Update = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Update<Widget>>(Widget.class, ResourceOperationTypes.Put);
    /**
     * API Operation "Create".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Create<Widget>> Create = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Create<Widget>>(Widget.class, ResourceOperationTypes.Post);
    /**
     * API Operation "Delete".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Delete<Widget>> Delete = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Delete<Widget>>(Widget.class, ResourceOperationTypes.Delete);

    /**
     * Gets "Timestamp when widget was created." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getCreatedAt() {
        return CreatedAt;
    }

    /**
     * Sets the specified value to "Timestamp when widget was created." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Widget setCreatedAt(Long value) {
        CreatedAt = value;
        return this;
    }

    /**
     * Gets "Reference to Sender address for this widget." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getFromID() {
        return FromID;
    }

    /**
     * Sets the specified value to "Reference to Sender address for this widget." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Widget setFromID(Long value) {
        FromID = value;
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
    public Widget setID(Long value) {
        ID = value;
        return this;
    }

    /**
     * Gets "Is the widget still active." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Boolean getIsActive() {
        return IsActive;
    }

    /**
     * Sets the specified value to "Is the widget still active." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Widget setIsActive(Boolean value) {
        IsActive = value;
        return this;
    }

    /**
     * Gets "Contactslist for which this widget handles subscriptions." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getListID() {
        return ListID;
    }

    /**
     * Sets the specified value to "Contactslist for which this widget handles subscriptions." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Widget setListID(Long value) {
        ListID = value;
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
    public Widget setLocale(String value) {
        Locale = value;
        return this;
    }

    /**
     * Gets "Name for this widget." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getName() {
        return Name;
    }

    /**
     * Sets the specified value to "Name for this widget." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Widget setName(String value) {
        Name = value;
        return this;
    }

    /**
     * Gets "Reply To email address for this widhet." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getReplyto() {
        return Replyto;
    }

    /**
     * Sets the specified value to "Reply To email address for this widhet." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Widget setReplyto(String value) {
        Replyto = value;
        return this;
    }

    /**
     * Gets "Sender name for this widget." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getSendername() {
        return Sendername;
    }

    /**
     * Sets the specified value to "Sender name for this widget." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Widget setSendername(String value) {
        Sendername = value;
        return this;
    }

    /**
     * Gets "Subject for this widget." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getSubject() {
        return Subject;
    }

    /**
     * Sets the specified value to "Subject for this widget." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Widget setSubject(String value) {
        Subject = value;
        return this;
    }

    /**
     * Gets "Message to send when sending mail for this widget." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getTemplateID() {
        return TemplateID;
    }

    /**
     * Sets the specified value to "Message to send when sending mail for this widget." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Widget setTemplateID(Long value) {
        TemplateID = value;
        return this;
    }

    public String toString() {
        return ((Widget.class.getSimpleName()+"#")+ this.getID());
    }

}
