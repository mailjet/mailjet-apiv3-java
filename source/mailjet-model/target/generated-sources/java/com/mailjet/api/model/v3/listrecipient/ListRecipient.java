
package com.mailjet.api.model.v3.listrecipient;

import java.util.Date;
import com.mailjet.api.client.MailJetApiService;
import com.mailjet.api.client.model.ResourceOperationTypes;
import com.mailjet.api.client.model.metadata.Component;
import com.mailjet.api.client.model.metadata.Resource;


/**
 * Class representing "Manage the relationship between a contact and a contactslists.".
 * 
 * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:21 CEST 2014.
 * 
 */
@Resource(name = "listrecipient", description = "Manage the relationship between a contact and a contactslists.", allowedOperations = {
    ResourceOperationTypes.Get,
    ResourceOperationTypes.Put,
    ResourceOperationTypes.Post,
    ResourceOperationTypes.Delete
})
public final class ListRecipient {

    @Component(name = "Contact", type = "TContact", defaultValue = "", required = true, description = "Reference to contact which is suscribed to the contactslist.")
    private Long ContactID;
    @Component(name = "ID", type = "Int64", defaultValue = "", required = false, description = "Unique numerical ID for this object.")
    private Long ID;
    @Component(name = "IsActive", type = "Boolean", defaultValue = "false", required = false, description = "Is this subscription active.")
    private Boolean IsActive;
    @Component(name = "IsUnsubscribed", type = "Boolean", defaultValue = "True if UnsubscribedAt is a valid date", required = false, description = "Has the contact been unsubscribed from the list ?.")
    private Boolean IsUnsubscribed;
    @Component(name = "List", type = "TContactsList", defaultValue = "", required = true, description = "Contacts list to which contact is subscribed.")
    private Long ListID;
    @Component(name = "UnsubscribedAt", type = "TRFC3339DateTime", defaultValue = "", required = false, description = "Timestamp when unsubscription was registered.")
    private Date UnsubscribedAt;
    /**
     * API Operation "List".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<ListRecipient>> List = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<ListRecipient>>(ListRecipient.class, ResourceOperationTypes.Get);
    /**
     * API Operation "Get".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.RetrieveById<ListRecipient>> Get = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.RetrieveById<ListRecipient>>(ListRecipient.class, ResourceOperationTypes.GetById);
    /**
     * API Operation "Update".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Update<ListRecipient>> Update = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Update<ListRecipient>>(ListRecipient.class, ResourceOperationTypes.Put);
    /**
     * API Operation "Create".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Create<ListRecipient>> Create = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Create<ListRecipient>>(ListRecipient.class, ResourceOperationTypes.Post);
    /**
     * API Operation "Delete".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Delete<ListRecipient>> Delete = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Delete<ListRecipient>>(ListRecipient.class, ResourceOperationTypes.Delete);

    /**
     * Gets "Reference to contact which is suscribed to the contactslist." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getContactID() {
        return ContactID;
    }

    /**
     * Sets the specified value to "Reference to contact which is suscribed to the contactslist." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ListRecipient setContactID(Long value) {
        ContactID = value;
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
    public ListRecipient setID(Long value) {
        ID = value;
        return this;
    }

    /**
     * Gets "Is this subscription active." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Boolean getIsActive() {
        return IsActive;
    }

    /**
     * Sets the specified value to "Is this subscription active." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ListRecipient setIsActive(Boolean value) {
        IsActive = value;
        return this;
    }

    /**
     * Gets "Has the contact been unsubscribed from the list ?." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Boolean getIsUnsubscribed() {
        return IsUnsubscribed;
    }

    /**
     * Sets the specified value to "Has the contact been unsubscribed from the list ?." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ListRecipient setIsUnsubscribed(Boolean value) {
        IsUnsubscribed = value;
        return this;
    }

    /**
     * Gets "Contacts list to which contact is subscribed." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getListID() {
        return ListID;
    }

    /**
     * Sets the specified value to "Contacts list to which contact is subscribed." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ListRecipient setListID(Long value) {
        ListID = value;
        return this;
    }

    /**
     * Gets "Timestamp when unsubscription was registered." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Date getUnsubscribedAt() {
        return UnsubscribedAt;
    }

    /**
     * Sets the specified value to "Timestamp when unsubscription was registered." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ListRecipient setUnsubscribedAt(Date value) {
        UnsubscribedAt = value;
        return this;
    }

    public String toString() {
        return ((ListRecipient.class.getSimpleName()+"#")+ this.getID());
    }

}
