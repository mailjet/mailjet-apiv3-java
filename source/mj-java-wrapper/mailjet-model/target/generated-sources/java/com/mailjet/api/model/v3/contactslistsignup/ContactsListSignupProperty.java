
package com.mailjet.api.model.v3.contactslistsignup;

import com.mailjet.api.client.model.MailJetKeyProperty;
import com.mailjet.api.client.model.MailJetResourceProperty;


/**
 * Class defining property constants for "contactslistsignup" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:21 CEST 2014.
 * 
 */
public final class ContactsListSignupProperty<DataType >
    extends MailJetResourceProperty<ContactsListSignup, DataType>
{

    /**
     * Timestamp when signup confirmation was registered.
     * 
     */
    public final static ContactsListSignupProperty<Long> CONFIRMAT = new ContactsListSignupProperty<Long>("ConfirmAt", Long.class);
    /**
     * IP address detected during signup confirmation.
     * 
     */
    public final static ContactsListSignupProperty<String> CONFIRMIP = new ContactsListSignupProperty<String>("ConfirmIp", String.class);
    /**
     * Reference to Contact to be signed up.
     * 
     */
    public final static ContactsListSignupProperty<Long> CONTACTID = new ContactsListSignupProperty<Long>("ContactID", Long.class);
    /**
     * Email address to be signed up.
     * 
     */
    public final static ContactsListSignupProperty<String> EMAIL = new ContactsListSignupProperty<String>("Email", String.class);
    /**
     * Unique numerical ID for this object.
     * 
     */
    public final static ContactsListSignupProperty.Key<Long> ID = new ContactsListSignupProperty.Key<Long>("ID", Long.class);
    /**
     * Contact list to which contact will be subscribed.
     * 
     */
    public final static ContactsListSignupProperty<Long> LISTID = new ContactsListSignupProperty<Long>("ListID", Long.class);
    /**
     * Reference to recipient to which contact corresponds.
     * 
     */
    public final static ContactsListSignupProperty<Long> RECIPIENTID = new ContactsListSignupProperty<Long>("RecipientID", Long.class);
    /**
     * Timestamp of sign up registration.
     * 
     */
    public final static ContactsListSignupProperty<Long> SIGNUPAT = new ContactsListSignupProperty<Long>("SignupAt", Long.class);
    /**
     * IP address detected during signup registration.
     * 
     */
    public final static ContactsListSignupProperty<String> SIGNUPIP = new ContactsListSignupProperty<String>("SignupIp", String.class);
    /**
     * Unique confirmation key needed for confirmation.
     * 
     */
    public final static ContactsListSignupProperty<String> SIGNUPKEY = new ContactsListSignupProperty<String>("SignupKey", String.class);
    /**
     * Where did the signup request come from.
     * 
     */
    public final static ContactsListSignupProperty<String> SOURCE = new ContactsListSignupProperty<String>("Source", String.class);
    /**
     * ID of signup request entity (usually widget ID).
     * 
     */
    public final static ContactsListSignupProperty<Long> SOURCEID = new ContactsListSignupProperty<Long>("SourceId", Long.class);

    private ContactsListSignupProperty(String name, Class<?> type) {
        super(name, type);
    }

    public static ContactsListSignupProperty<Object> ref(String name) {
        return new ContactsListSignupProperty<Object>(name, Object.class);
    }

    public final static class Key<KeyDataType >
        extends MailJetKeyProperty<ContactsListSignup, KeyDataType>
    {


        private Key(String name, Class<?> type) {
            super(name, type);
        }

    }

}
