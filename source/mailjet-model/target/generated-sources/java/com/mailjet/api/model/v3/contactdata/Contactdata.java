
package com.mailjet.api.model.v3.contactdata;

import java.util.Map;
import com.mailjet.api.client.MailJetApiService;
import com.mailjet.api.client.model.ResourceOperationTypes;
import com.mailjet.api.client.model.metadata.Component;
import com.mailjet.api.client.model.metadata.Resource;


/**
 * Class representing "This resource can be used to examine and manipulate the associated extra static data of a contact.".
 * 
 * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
 * 
 */
@Resource(name = "contactdata", description = "This resource can be used to examine and manipulate the associated extra static data of a contact.", allowedOperations = {
    ResourceOperationTypes.Get,
    ResourceOperationTypes.Put,
    ResourceOperationTypes.Post,
    ResourceOperationTypes.Delete
}, uniquekey = "Email")
public final class Contactdata {

    @Component(name = "ContactID", type = "Int64", defaultValue = "", required = false, description = "")
    private Long ContactID;
    @Component(name = "Data", type = "TKeyValueList", defaultValue = "", required = false, description = "Static data in an array with Name, Value pairs.")
    private java.util.List<Map> Data;
    @Component(name = "ID", type = "Int64", defaultValue = "", required = false, description = "ID of this resource. It equals the Contact ID.")
    private Long ID;
    /**
     * API Operation "List".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<Contactdata>> List = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<Contactdata>>(Contactdata.class, ResourceOperationTypes.Get);
    /**
     * API Operation "Get".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.RetrieveById<Contactdata>> Get = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.RetrieveById<Contactdata>>(Contactdata.class, ResourceOperationTypes.GetById);
    /**
     * API Operation "Update".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Update<Contactdata>> Update = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Update<Contactdata>>(Contactdata.class, ResourceOperationTypes.Put);
    /**
     * API Operation "Create".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Create<Contactdata>> Create = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Create<Contactdata>>(Contactdata.class, ResourceOperationTypes.Post);
    /**
     * API Operation "Delete".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Delete<Contactdata>> Delete = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Delete<Contactdata>>(Contactdata.class, ResourceOperationTypes.Delete);

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getContactID() {
        return ContactID;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Contactdata setContactID(Long value) {
        ContactID = value;
        return this;
    }

    /**
     * Gets "Static data in an array with Name, Value pairs." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public java.util.List<Map> getData() {
        return Data;
    }

    /**
     * Sets the specified value to "Static data in an array with Name, Value pairs." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Contactdata setData(java.util.List<Map> value) {
        Data = value;
        return this;
    }

    /**
     * Gets "ID of this resource. It equals the Contact ID." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getID() {
        return ID;
    }

    /**
     * Sets the specified value to "ID of this resource. It equals the Contact ID." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Contactdata setID(Long value) {
        ID = value;
        return this;
    }

    public String toString() {
        return ((Contactdata.class.getSimpleName()+"#")+ this.getID());
    }

}
