
package com.mailjet.api.model.v3.contactfilter;

import com.mailjet.api.client.MailJetApiService;
import com.mailjet.api.client.model.ResourceOperationTypes;
import com.mailjet.api.client.model.metadata.Component;
import com.mailjet.api.client.model.metadata.Resource;
import com.mailjet.api.model.v3.customtypes.ContactFilterStatus;


/**
 * Class representing "A list of filter expressions for use in newsletters.".
 * 
 * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
 * 
 */
@Resource(name = "contactfilter", description = "A list of filter expressions for use in newsletters.", allowedOperations = {
    ResourceOperationTypes.Get,
    ResourceOperationTypes.Put,
    ResourceOperationTypes.Post,
    ResourceOperationTypes.Delete
}, uniquekey = "Name")
public final class Contactfilter {

    @Component(name = "Description", type = "AnsiString", defaultValue = "", required = false, description = "Textual escription of the filter.")
    private String Description;
    @Component(name = "Expression", type = "AnsiString", defaultValue = "", required = false, description = "Filter Expression. Checked for syntactical correctness when writing")
    private String Expression;
    @Component(name = "ID", type = "Int64", defaultValue = "", required = false, description = "ID of the filter")
    private Long ID;
    @Component(name = "Name", type = "AnsiString", defaultValue = "", required = false, description = "A unique name for this filter.")
    private String Name;
    @Component(name = "Status", type = "TContactFilterStatus", defaultValue = "unused", required = false, description = "")
    private ContactFilterStatus Status;
    /**
     * API Operation "List".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<Contactfilter>> List = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<Contactfilter>>(Contactfilter.class, ResourceOperationTypes.Get);
    /**
     * API Operation "Get".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.RetrieveById<Contactfilter>> Get = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.RetrieveById<Contactfilter>>(Contactfilter.class, ResourceOperationTypes.GetById);
    /**
     * API Operation "Update".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Update<Contactfilter>> Update = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Update<Contactfilter>>(Contactfilter.class, ResourceOperationTypes.Put);
    /**
     * API Operation "Create".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Create<Contactfilter>> Create = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Create<Contactfilter>>(Contactfilter.class, ResourceOperationTypes.Post);
    /**
     * API Operation "Delete".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Delete<Contactfilter>> Delete = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Delete<Contactfilter>>(Contactfilter.class, ResourceOperationTypes.Delete);

    /**
     * Gets "Textual escription of the filter." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getDescription() {
        return Description;
    }

    /**
     * Sets the specified value to "Textual escription of the filter." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Contactfilter setDescription(String value) {
        Description = value;
        return this;
    }

    /**
     * Gets "Filter Expression. Checked for syntactical correctness when writing" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getExpression() {
        return Expression;
    }

    /**
     * Sets the specified value to "Filter Expression. Checked for syntactical correctness when writing" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Contactfilter setExpression(String value) {
        Expression = value;
        return this;
    }

    /**
     * Gets "ID of the filter" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getID() {
        return ID;
    }

    /**
     * Sets the specified value to "ID of the filter" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Contactfilter setID(Long value) {
        ID = value;
        return this;
    }

    /**
     * Gets "A unique name for this filter." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getName() {
        return Name;
    }

    /**
     * Sets the specified value to "A unique name for this filter." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Contactfilter setName(String value) {
        Name = value;
        return this;
    }

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public ContactFilterStatus getStatus() {
        return Status;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Contactfilter setStatus(ContactFilterStatus value) {
        Status = value;
        return this;
    }

    public String toString() {
        return ((Contactfilter.class.getSimpleName()+"#")+ this.getID());
    }

}
