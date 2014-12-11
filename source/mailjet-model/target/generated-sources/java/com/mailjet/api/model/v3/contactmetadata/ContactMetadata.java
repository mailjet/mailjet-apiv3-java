
package com.mailjet.api.model.v3.contactmetadata;

import com.mailjet.api.client.MailJetApiService;
import com.mailjet.api.client.model.ResourceOperationTypes;
import com.mailjet.api.client.model.metadata.Component;
import com.mailjet.api.client.model.metadata.Resource;
import com.mailjet.api.model.v3.customtypes.ContactDataType;


/**
 * Class representing "Definition of available extra data items for contacts.".
 * 
 * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:21 CEST 2014.
 * 
 */
@Resource(name = "contactmetadata", description = "Definition of available extra data items for contacts.", allowedOperations = {
    ResourceOperationTypes.Get,
    ResourceOperationTypes.Put,
    ResourceOperationTypes.Post,
    ResourceOperationTypes.Delete
}, uniquekey = "Namespace|Name")
public final class ContactMetadata {

    @Component(name = "Datatype", type = "TContactDataType", defaultValue = "str", required = true, description = "Type of data.")
    private ContactDataType Datatype;
    @Component(name = "ID", type = "Int64", defaultValue = "", required = false, description = "ID of this definition.")
    private Long ID;
    @Component(name = "Name", type = "AnsiString", defaultValue = "", required = true, description = "The name of the data. The name must be unique within a namespace.")
    private String Name;
    @Component(name = "NameSpace", type = "AnsiString", defaultValue = "static", required = true, description = "The namespace for this data. There are 2 possible values: static and historic.")
    private String NameSpace;
    /**
     * API Operation "List".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<ContactMetadata>> List = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<ContactMetadata>>(ContactMetadata.class, ResourceOperationTypes.Get);
    /**
     * API Operation "Get".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.RetrieveById<ContactMetadata>> Get = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.RetrieveById<ContactMetadata>>(ContactMetadata.class, ResourceOperationTypes.GetById);
    /**
     * API Operation "Update".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Update<ContactMetadata>> Update = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Update<ContactMetadata>>(ContactMetadata.class, ResourceOperationTypes.Put);
    /**
     * API Operation "Create".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Create<ContactMetadata>> Create = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Create<ContactMetadata>>(ContactMetadata.class, ResourceOperationTypes.Post);
    /**
     * API Operation "Delete".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Delete<ContactMetadata>> Delete = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Delete<ContactMetadata>>(ContactMetadata.class, ResourceOperationTypes.Delete);

    /**
     * Gets "Type of data." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public ContactDataType getDatatype() {
        return Datatype;
    }

    /**
     * Sets the specified value to "Type of data." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ContactMetadata setDatatype(ContactDataType value) {
        Datatype = value;
        return this;
    }

    /**
     * Gets "ID of this definition." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getID() {
        return ID;
    }

    /**
     * Sets the specified value to "ID of this definition." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ContactMetadata setID(Long value) {
        ID = value;
        return this;
    }

    /**
     * Gets "The name of the data. The name must be unique within a namespace." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getName() {
        return Name;
    }

    /**
     * Sets the specified value to "The name of the data. The name must be unique within a namespace." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ContactMetadata setName(String value) {
        Name = value;
        return this;
    }

    /**
     * Gets "The namespace for this data. There are 2 possible values: static and historic." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getNameSpace() {
        return NameSpace;
    }

    /**
     * Sets the specified value to "The namespace for this data. There are 2 possible values: static and historic." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ContactMetadata setNameSpace(String value) {
        NameSpace = value;
        return this;
    }

    public String toString() {
        return ((ContactMetadata.class.getSimpleName()+"#")+ this.getID());
    }

}
