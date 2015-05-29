
package com.mailjet.api.model.v3.contactslistsignup;

import com.mailjet.api.client.MailJetApiService;
import com.mailjet.api.client.model.ResourceOperationTypes;
import com.mailjet.api.client.model.metadata.Component;
import com.mailjet.api.client.model.metadata.Resource;


/**
 * Class representing "Contacts list signup request.".
 * 
 * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
 * 
 */
@Resource(name = "contactslistsignup", description = "Contacts list signup request.", allowedOperations = {
    ResourceOperationTypes.Get
})
public final class ContactsListSignup {

    @Component(name = "ConfirmAt", type = "Int64", defaultValue = "", required = false, description = "Timestamp when signup confirmation was registered.")
    private Long ConfirmAt;
    @Component(name = "ConfirmIp", type = "AnsiString", defaultValue = "", required = false, description = "IP address detected during signup confirmation.")
    private String ConfirmIp;
    @Component(name = "ContactID", type = "TContact", defaultValue = "", required = false, description = "Reference to Contact to be signed up.")
    private Long ContactID;
    @Component(name = "Email", type = "TEmail", defaultValue = "", required = true, description = "Email address to be signed up.")
    private String Email;
    @Component(name = "ID", type = "Int64", defaultValue = "", required = false, description = "Unique numerical ID for this object.")
    private Long ID;
    @Component(name = "ListID", type = "TContactsList", defaultValue = "", required = true, description = "Contact list to which contact will be subscribed.")
    private Long ListID;
    @Component(name = "RecipientID", type = "TRecipient", defaultValue = "", required = false, description = "Reference to recipient to which contact corresponds.")
    private Long RecipientID;
    @Component(name = "SignupAt", type = "Int64", defaultValue = "", required = false, description = "Timestamp of sign up registration.")
    private Long SignupAt;
    @Component(name = "SignupIp", type = "AnsiString", defaultValue = "", required = false, description = "IP address detected during signup registration.")
    private String SignupIp;
    @Component(name = "SignupKey", type = "AnsiString", defaultValue = "", required = false, description = "Unique confirmation key needed for confirmation.")
    private String SignupKey;
    @Component(name = "Source", type = "AnsiString", defaultValue = "", required = true, description = "Where did the signup request come from.")
    private String Source;
    @Component(name = "SourceId", type = "Int64", defaultValue = "", required = false, description = "ID of signup request entity (usually widget ID).")
    private Long SourceId;
    /**
     * API Operation "List".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<ContactsListSignup>> List = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<ContactsListSignup>>(ContactsListSignup.class, ResourceOperationTypes.Get);
    /**
     * API Operation "Get".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.RetrieveById<ContactsListSignup>> Get = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.RetrieveById<ContactsListSignup>>(ContactsListSignup.class, ResourceOperationTypes.GetById);

    /**
     * Gets "Timestamp when signup confirmation was registered." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getConfirmAt() {
        return ConfirmAt;
    }

    /**
     * Sets the specified value to "Timestamp when signup confirmation was registered." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ContactsListSignup setConfirmAt(Long value) {
        ConfirmAt = value;
        return this;
    }

    /**
     * Gets "IP address detected during signup confirmation." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getConfirmIp() {
        return ConfirmIp;
    }

    /**
     * Sets the specified value to "IP address detected during signup confirmation." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ContactsListSignup setConfirmIp(String value) {
        ConfirmIp = value;
        return this;
    }

    /**
     * Gets "Reference to Contact to be signed up." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getContactID() {
        return ContactID;
    }

    /**
     * Sets the specified value to "Reference to Contact to be signed up." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ContactsListSignup setContactID(Long value) {
        ContactID = value;
        return this;
    }

    /**
     * Gets "Email address to be signed up." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getEmail() {
        return Email;
    }

    /**
     * Sets the specified value to "Email address to be signed up." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ContactsListSignup setEmail(String value) {
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
    public ContactsListSignup setID(Long value) {
        ID = value;
        return this;
    }

    /**
     * Gets "Contact list to which contact will be subscribed." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getListID() {
        return ListID;
    }

    /**
     * Sets the specified value to "Contact list to which contact will be subscribed." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ContactsListSignup setListID(Long value) {
        ListID = value;
        return this;
    }

    /**
     * Gets "Reference to recipient to which contact corresponds." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getRecipientID() {
        return RecipientID;
    }

    /**
     * Sets the specified value to "Reference to recipient to which contact corresponds." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ContactsListSignup setRecipientID(Long value) {
        RecipientID = value;
        return this;
    }

    /**
     * Gets "Timestamp of sign up registration." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getSignupAt() {
        return SignupAt;
    }

    /**
     * Sets the specified value to "Timestamp of sign up registration." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ContactsListSignup setSignupAt(Long value) {
        SignupAt = value;
        return this;
    }

    /**
     * Gets "IP address detected during signup registration." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getSignupIp() {
        return SignupIp;
    }

    /**
     * Sets the specified value to "IP address detected during signup registration." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ContactsListSignup setSignupIp(String value) {
        SignupIp = value;
        return this;
    }

    /**
     * Gets "Unique confirmation key needed for confirmation." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getSignupKey() {
        return SignupKey;
    }

    /**
     * Sets the specified value to "Unique confirmation key needed for confirmation." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ContactsListSignup setSignupKey(String value) {
        SignupKey = value;
        return this;
    }

    /**
     * Gets "Where did the signup request come from." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getSource() {
        return Source;
    }

    /**
     * Sets the specified value to "Where did the signup request come from." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ContactsListSignup setSource(String value) {
        Source = value;
        return this;
    }

    /**
     * Gets "ID of signup request entity (usually widget ID)." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getSourceId() {
        return SourceId;
    }

    /**
     * Sets the specified value to "ID of signup request entity (usually widget ID)." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public ContactsListSignup setSourceId(Long value) {
        SourceId = value;
        return this;
    }

    public String toString() {
        return ((ContactsListSignup.class.getSimpleName()+"#")+ this.getID());
    }

}
