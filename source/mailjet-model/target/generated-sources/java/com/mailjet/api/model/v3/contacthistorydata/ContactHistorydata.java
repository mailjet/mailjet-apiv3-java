
package com.mailjet.api.model.v3.contacthistorydata;

import java.util.Date;
import com.mailjet.api.client.MailJetApiService;
import com.mailjet.api.client.model.ResourceOperationTypes;
import com.mailjet.api.client.model.metadata.Component;
import com.mailjet.api.client.model.metadata.Resource;


/**
 * Class representing "This resource can be used to examine the associated extra historical data of a contact.".
 * 
 * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:21 CEST 2014.
 * 
 */
@Resource(name = "contacthistorydata", description = "This resource can be used to examine the associated extra historical data of a contact.", allowedOperations = {
    ResourceOperationTypes.Get,
    ResourceOperationTypes.Post,
    ResourceOperationTypes.Delete
})
public final class ContactHistorydata {

    @Component(name = "Contact", type = "TContact", defaultValue = "", required = false, description = "Contact for which this is the historical data.")
    private Long ContactID;
    @Component(name = "CreatedAt", type = "TRFC3339DateTime", defaultValue = "Current time", required = false, description = "Timestamp when the historical data was registered by Mailjet")
    private Date CreatedAt;
    @Component(name = "Data", type = "AnsiString", defaultValue = "", required = false, description = "The data as a string.")
    private String Data;
    @Component(name = "ID", type = "Int64", defaultValue = "", required = false, description = "ID of the data item.")
    private Long ID;
    @Component(name = "Name", type = "AnsiString", defaultValue = "", required = false, description = "Name of the history data item.")
    private String Name;
    /**
     * API Operation "List".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<ContactHistorydata>> List = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<ContactHistorydata>>(ContactHistorydata.class, ResourceOperationTypes.Get);
    /**
     * API Operation "Get".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.RetrieveById<ContactHistorydata>> Get = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.RetrieveById<ContactHistorydata>>(ContactHistorydata.class, ResourceOperationTypes.GetById);
    /**
     * API Operation "Create".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Create<ContactHistorydata>> Create = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Create<ContactHistorydata>>(ContactHistorydata.class, ResourceOperationTypes.Post);
    /**
     * API Operation "Delete".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Delete<ContactHistorydata>> Delete = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Delete<ContactHistorydata>>(ContactHistorydata.class, ResourceOperationTypes.Delete);

    /**
     * Gets "Contact for which this is the historical data." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getContactID() {
        return ContactID;
    }

    /**
     * Sets the specified value to "Contact for which this is the historical data." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ContactHistorydata setContactID(Long value) {
        ContactID = value;
        return this;
    }

    /**
     * Gets "Timestamp when the historical data was registered by Mailjet" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Date getCreatedAt() {
        return CreatedAt;
    }

    /**
     * Sets the specified value to "Timestamp when the historical data was registered by Mailjet" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ContactHistorydata setCreatedAt(Date value) {
        CreatedAt = value;
        return this;
    }

    /**
     * Gets "The data as a string." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getData() {
        return Data;
    }

    /**
     * Sets the specified value to "The data as a string." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ContactHistorydata setData(String value) {
        Data = value;
        return this;
    }

    /**
     * Gets "ID of the data item." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getID() {
        return ID;
    }

    /**
     * Sets the specified value to "ID of the data item." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ContactHistorydata setID(Long value) {
        ID = value;
        return this;
    }

    /**
     * Gets "Name of the history data item." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getName() {
        return Name;
    }

    /**
     * Sets the specified value to "Name of the history data item." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ContactHistorydata setName(String value) {
        Name = value;
        return this;
    }

    public String toString() {
        return ((ContactHistorydata.class.getSimpleName()+"#")+ this.getID());
    }

}
