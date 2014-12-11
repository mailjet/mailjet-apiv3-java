
package com.mailjet.api.model.v3.contact;

import java.util.Date;
import com.mailjet.api.client.MailJetApiService;
import com.mailjet.api.client.model.ResourceOperationTypes;
import com.mailjet.api.client.model.metadata.Component;
import com.mailjet.api.client.model.metadata.Resource;


/**
 * Class representing "Manage the details of a Contact.".
 * 
 * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:21 CEST 2014.
 * 
 */
@Resource(name = "contact", description = "Manage the details of a Contact.", allowedOperations = {
    ResourceOperationTypes.Get,
    ResourceOperationTypes.Put,
    ResourceOperationTypes.Post
}, uniquekey = "Email")
public final class Contact {

    @Component(name = "CreatedAt", type = "TRFC3339DateTime", defaultValue = "Current time", required = false, description = "Timestamp when object was created in database.")
    private Date CreatedAt;
    @Component(name = "DeliveredCount", type = "Int64", defaultValue = "", required = false, description = "Number of messages delivered to this contact.")
    private Long DeliveredCount;
    @Component(name = "Email", type = "TEmail", defaultValue = "", required = true, description = "Email address of this contact.")
    private String Email;
    @Component(name = "ID", type = "Int64", defaultValue = "", required = false, description = "Unique numerical ID for this object.")
    private Long ID;
    @Component(name = "IsOptInPending", type = "Boolean", defaultValue = "false", required = false, description = "Is an opt-in for a contactslist subscription pending ?.")
    private Boolean IsOptInPending;
    @Component(name = "IsSpamComplaining", type = "Boolean", defaultValue = "false", required = false, description = "Is this contact complaining of spam ?.")
    private Boolean IsSpamComplaining;
    @Component(name = "LastActivityAt", type = "TRFC3339DateTime", defaultValue = "", required = false, description = "Timestamp of last registered activity for this contact.")
    private Date LastActivityAt;
    @Component(name = "LastUpdateAt", type = "TRFC3339DateTime", defaultValue = "", required = false, description = "Timestamp of last update of this contact.")
    private Date LastUpdateAt;
    @Component(name = "Name", type = "AnsiString", defaultValue = "", required = false, description = "User-provided name for this contact.")
    private String Name;
    @Component(name = "UnsubscribedAt", type = "TRFC3339DateTime", defaultValue = "", required = false, description = "Timestamp of last unsubscribe from all lists request.")
    private Date UnsubscribedAt;
    @Component(name = "UnsubscribedBy", type = "AnsiString", defaultValue = "", required = false, description = "Description of who initiated the unsubscribe from all lists request.")
    private String UnsubscribedBy;
    /**
     * API Operation "List".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<Contact>> List = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<Contact>>(Contact.class, ResourceOperationTypes.Get);
    /**
     * API Operation "Get".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.RetrieveById<Contact>> Get = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.RetrieveById<Contact>>(Contact.class, ResourceOperationTypes.GetById);
    /**
     * API Operation "Update".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Update<Contact>> Update = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Update<Contact>>(Contact.class, ResourceOperationTypes.Put);
    /**
     * API Operation "Create".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Create<Contact>> Create = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Create<Contact>>(Contact.class, ResourceOperationTypes.Post);

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
    public Contact setCreatedAt(Date value) {
        CreatedAt = value;
        return this;
    }

    /**
     * Gets "Number of messages delivered to this contact." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getDeliveredCount() {
        return DeliveredCount;
    }

    /**
     * Sets the specified value to "Number of messages delivered to this contact." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Contact setDeliveredCount(Long value) {
        DeliveredCount = value;
        return this;
    }

    /**
     * Gets "Email address of this contact." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getEmail() {
        return Email;
    }

    /**
     * Sets the specified value to "Email address of this contact." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Contact setEmail(String value) {
        Email = value;
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
    public Contact setID(Long value) {
        ID = value;
        return this;
    }

    /**
     * Gets "Is an opt-in for a contactslist subscription pending ?." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Boolean getIsOptInPending() {
        return IsOptInPending;
    }

    /**
     * Sets the specified value to "Is an opt-in for a contactslist subscription pending ?." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Contact setIsOptInPending(Boolean value) {
        IsOptInPending = value;
        return this;
    }

    /**
     * Gets "Is this contact complaining of spam ?." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Boolean getIsSpamComplaining() {
        return IsSpamComplaining;
    }

    /**
     * Sets the specified value to "Is this contact complaining of spam ?." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Contact setIsSpamComplaining(Boolean value) {
        IsSpamComplaining = value;
        return this;
    }

    /**
     * Gets "Timestamp of last registered activity for this contact." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Date getLastActivityAt() {
        return LastActivityAt;
    }

    /**
     * Sets the specified value to "Timestamp of last registered activity for this contact." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Contact setLastActivityAt(Date value) {
        LastActivityAt = value;
        return this;
    }

    /**
     * Gets "Timestamp of last update of this contact." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Date getLastUpdateAt() {
        return LastUpdateAt;
    }

    /**
     * Sets the specified value to "Timestamp of last update of this contact." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Contact setLastUpdateAt(Date value) {
        LastUpdateAt = value;
        return this;
    }

    /**
     * Gets "User-provided name for this contact." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getName() {
        return Name;
    }

    /**
     * Sets the specified value to "User-provided name for this contact." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Contact setName(String value) {
        Name = value;
        return this;
    }

    /**
     * Gets "Timestamp of last unsubscribe from all lists request." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Date getUnsubscribedAt() {
        return UnsubscribedAt;
    }

    /**
     * Sets the specified value to "Timestamp of last unsubscribe from all lists request." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Contact setUnsubscribedAt(Date value) {
        UnsubscribedAt = value;
        return this;
    }

    /**
     * Gets "Description of who initiated the unsubscribe from all lists request." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getUnsubscribedBy() {
        return UnsubscribedBy;
    }

    /**
     * Sets the specified value to "Description of who initiated the unsubscribe from all lists request." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Contact setUnsubscribedBy(String value) {
        UnsubscribedBy = value;
        return this;
    }

    public String toString() {
        return ((Contact.class.getSimpleName()+"#")+ this.getID());
    }

}
