
package com.mailjet.api.model.v3.contactslistsignup;

import com.mailjet.api.client.model.MailJetResourceFilter;


/**
 * Class representing filter for  "contactslistsignup" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
 * 
 */
public final class ContactsListSignupFilter<DataType >
    extends MailJetResourceFilter<ContactsListSignup, DataType>
{

    /**
     * Only retrieve signup requests for given API key.
     * 
     */
    public final static ContactsListSignupFilter<Long> APIKEY = new ContactsListSignupFilter<Long>("APIKey", Long.class);
    /**
     * Only retrieve ContactsListSignup resources for which Contact ID equals the specified value.
     * 
     */
    public final static ContactsListSignupFilter<Long> CONTACT = new ContactsListSignupFilter<Long>("Contact", Long.class);
    /**
     * Only retrieve signup requests for given contacts list.
     * 
     */
    public final static ContactsListSignupFilter<Long> CONTACTSLIST = new ContactsListSignupFilter<Long>("ContactsList", Long.class);
    /**
     * Only retrieve signup requests for given email domain.
     * 
     */
    public final static ContactsListSignupFilter<String> DOMAIN = new ContactsListSignupFilter<String>("Domain", String.class);
    /**
     * Shortcut fot filtering on Localpart@domain.
     * 
     */
    public final static ContactsListSignupFilter<String> EMAIL = new ContactsListSignupFilter<String>("Email", String.class);
    /**
     * Only retrieve signup requests for given email local part. If specified, domain must also be specified.
     * 
     */
    public final static ContactsListSignupFilter<String> LOCALPART = new ContactsListSignupFilter<String>("LocalPart", String.class);
    /**
     * Only retrieve signup requests for which ConfirmAt is less than specified value.
     * 
     */
    public final static ContactsListSignupFilter<Long> MAXCONFIRMAT = new ContactsListSignupFilter<Long>("MaxConfirmAt", Long.class);
    /**
     * Only retrieve signup requests for which SignupAt is less than specified value.
     * 
     */
    public final static ContactsListSignupFilter<Long> MAXSIGNUPAT = new ContactsListSignupFilter<Long>("MaxSignupAt", Long.class);
    /**
     * Only retrieve signup requests for which ConfirmAt is larger than specified value.
     * 
     */
    public final static ContactsListSignupFilter<Long> MINCONFIRMAT = new ContactsListSignupFilter<Long>("MinConfirmAt", Long.class);
    /**
     * Only retrieve signup requests for which SignupAt is larger than specified value.
     * 
     */
    public final static ContactsListSignupFilter<Long> MINSIGNUPAT = new ContactsListSignupFilter<Long>("MinSignupAt", Long.class);
    /**
     * 
     * 
     */
    public final static ContactsListSignupFilter<String> SIGNUPIP = new ContactsListSignupFilter<String>("SignupIp", String.class);
    /**
     * Only retrieve ContactsListSignup resources for which Source equals the specified value.
     * 
     */
    public final static ContactsListSignupFilter<String> SOURCE = new ContactsListSignupFilter<String>("Source", String.class);
    /**
     * Only retrieve ContactsListSignup resources for which SourceID equals the specified value.
     * 
     */
    public final static ContactsListSignupFilter<Long> SOURCEID = new ContactsListSignupFilter<Long>("SourceID", Long.class);

    private ContactsListSignupFilter(String name, Class<?> type) {
        super(name, type);
    }

}
