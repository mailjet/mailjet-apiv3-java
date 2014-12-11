
package com.mailjet.api.model.v3.manycontacts;

import java.util.List;
import com.mailjet.api.client.MailJetApiService;
import com.mailjet.api.client.model.ResourceOperationTypes;
import com.mailjet.api.client.model.metadata.Component;
import com.mailjet.api.client.model.metadata.Resource;
import com.mailjet.api.model.v3.customtypes.ManyContactsAction;
import com.mailjet.api.model.v3.customtypes.ManyContactsListRecipientList;


/**
 * Class representing "Manage contacts within a contactlist in a single call".
 * 
 * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:21 CEST 2014.
 * 
 */
@Resource(name = "manycontacts", description = "Manage contacts within a contactlist in a single call", allowedOperations = {
    ResourceOperationTypes.Post
})
public final class ManyContacts {

    @Component(name = "Action", type = "TManyContactsAction", defaultValue = "Add", required = false, description = "Action to perform when POST is done.")
    private ManyContactsAction Action;
    @Component(name = "Addresses", type = "TStrings", defaultValue = "", required = true, description = "Array of email addresses.")
    private List<String> Addresses;
    @Component(name = "Errors", type = "TImportErrorList", defaultValue = "", required = false, description = "On return, filled with errors.")
    private Object Errors;
    @Component(name = "Force", type = "Boolean", defaultValue = "false", required = false, description = "Should subscription be enforced ?.")
    private Boolean Force;
    @Component(name = "List", type = "TContactsList", defaultValue = "", required = true, description = "Rereference to Contactslist to which to subscribe.")
    private Long ListID;
    @Component(name = "Recipients", type = "TListRecipientList", defaultValue = "", required = false, description = "On return contains a list of create listrecipients.")
    private ManyContactsListRecipientList Recipients;
    /**
     * API Operation "Create".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Create<ManyContacts>> Create = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Create<ManyContacts>>(ManyContacts.class, ResourceOperationTypes.Post);

    /**
     * Gets "Action to perform when POST is done." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public ManyContactsAction getAction() {
        return Action;
    }

    /**
     * Sets the specified value to "Action to perform when POST is done." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ManyContacts setAction(ManyContactsAction value) {
        Action = value;
        return this;
    }

    /**
     * Gets "Array of email addresses." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public List<String> getAddresses() {
        return Addresses;
    }

    /**
     * Sets the specified value to "Array of email addresses." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ManyContacts setAddresses(List<String> value) {
        Addresses = value;
        return this;
    }

    /**
     * Gets "On return, filled with errors." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Object getErrors() {
        return Errors;
    }

    /**
     * Sets the specified value to "On return, filled with errors." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ManyContacts setErrors(Object value) {
        Errors = value;
        return this;
    }

    /**
     * Gets "Should subscription be enforced ?." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Boolean getForce() {
        return Force;
    }

    /**
     * Sets the specified value to "Should subscription be enforced ?." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ManyContacts setForce(Boolean value) {
        Force = value;
        return this;
    }

    /**
     * Gets "Rereference to Contactslist to which to subscribe." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getListID() {
        return ListID;
    }

    /**
     * Sets the specified value to "Rereference to Contactslist to which to subscribe." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ManyContacts setListID(Long value) {
        ListID = value;
        return this;
    }

    /**
     * Gets "On return contains a list of create listrecipients." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public ManyContactsListRecipientList getRecipients() {
        return Recipients;
    }

    /**
     * Sets the specified value to "On return contains a list of create listrecipients." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ManyContacts setRecipients(ManyContactsListRecipientList value) {
        Recipients = value;
        return this;
    }

}
