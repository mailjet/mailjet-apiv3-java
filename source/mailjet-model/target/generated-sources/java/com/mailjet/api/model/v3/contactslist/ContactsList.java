
package com.mailjet.api.model.v3.contactslist;

import java.util.Date;
import com.mailjet.api.client.MailJetApiService;
import com.mailjet.api.client.model.ResourceOperationTypes;
import com.mailjet.api.client.model.metadata.Component;
import com.mailjet.api.client.model.metadata.Resource;


/**
 * Class representing "Manage your contact lists. One Contact might be associated to one or more ContactsList.".
 * 
 * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:21 CEST 2014.
 * 
 */
@Resource(name = "contactslist", description = "Manage your contact lists. One Contact might be associated to one or more ContactsList.", allowedOperations = {
    ResourceOperationTypes.Get,
    ResourceOperationTypes.Put,
    ResourceOperationTypes.Post,
    ResourceOperationTypes.Delete
}, uniquekey = "Address")
public final class ContactsList {

    @Component(name = "Address", type = "AnsiString", defaultValue = "Random HEX string", required = false, description = "Email address at which this contacts of this list can be reached.")
    private String Address;
    @Component(name = "CreatedAt", type = "TRFC3339DateTime", defaultValue = "Current time", required = false, description = "Timestamp when object was created in database.")
    private Date CreatedAt;
    @Component(name = "ID", type = "Int64", defaultValue = "", required = false, description = "Unique numerical ID for this object.")
    private Long ID;
    @Component(name = "IsDeleted", type = "Boolean", defaultValue = "false", required = false, description = "Has this list been deleted or not.")
    private Boolean IsDeleted;
    @Component(name = "Name", type = "AnsiString", defaultValue = "", required = false, description = "User-specified name for this contact list (must be unique).")
    private String Name;
    @Component(name = "SubscriberCount", type = "LongInt", defaultValue = "", required = false, description = "Number of subscribers for this list.")
    private Integer SubscriberCount;
    /**
     * API Operation "List".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<ContactsList>> List = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<ContactsList>>(ContactsList.class, ResourceOperationTypes.Get);
    /**
     * API Operation "Get".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.RetrieveById<ContactsList>> Get = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.RetrieveById<ContactsList>>(ContactsList.class, ResourceOperationTypes.GetById);
    /**
     * API Operation "Update".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Update<ContactsList>> Update = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Update<ContactsList>>(ContactsList.class, ResourceOperationTypes.Put);
    /**
     * API Operation "Create".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Create<ContactsList>> Create = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Create<ContactsList>>(ContactsList.class, ResourceOperationTypes.Post);
    /**
     * API Operation "Delete".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Delete<ContactsList>> Delete = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Delete<ContactsList>>(ContactsList.class, ResourceOperationTypes.Delete);

    /**
     * Gets "Email address at which this contacts of this list can be reached." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getAddress() {
        return Address;
    }

    /**
     * Sets the specified value to "Email address at which this contacts of this list can be reached." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ContactsList setAddress(String value) {
        Address = value;
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
    public ContactsList setCreatedAt(Date value) {
        CreatedAt = value;
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
    public ContactsList setID(Long value) {
        ID = value;
        return this;
    }

    /**
     * Gets "Has this list been deleted or not." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Boolean getIsDeleted() {
        return IsDeleted;
    }

    /**
     * Sets the specified value to "Has this list been deleted or not." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ContactsList setIsDeleted(Boolean value) {
        IsDeleted = value;
        return this;
    }

    /**
     * Gets "User-specified name for this contact list (must be unique)." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getName() {
        return Name;
    }

    /**
     * Sets the specified value to "User-specified name for this contact list (must be unique)." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ContactsList setName(String value) {
        Name = value;
        return this;
    }

    /**
     * Gets "Number of subscribers for this list." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Integer getSubscriberCount() {
        return SubscriberCount;
    }

    /**
     * Sets the specified value to "Number of subscribers for this list." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ContactsList setSubscriberCount(Integer value) {
        SubscriberCount = value;
        return this;
    }

    public String toString() {
        return ((ContactsList.class.getSimpleName()+"#")+ this.getID());
    }

}
