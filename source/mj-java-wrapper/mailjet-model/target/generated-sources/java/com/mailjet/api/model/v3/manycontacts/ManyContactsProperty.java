
package com.mailjet.api.model.v3.manycontacts;

import java.util.List;
import com.mailjet.api.client.model.MailJetKeyProperty;
import com.mailjet.api.client.model.MailJetResourceProperty;
import com.mailjet.api.model.v3.customtypes.ManyContactsAction;
import com.mailjet.api.model.v3.customtypes.ManyContactsListRecipientList;


/**
 * Class defining property constants for "manycontacts" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:21 CEST 2014.
 * 
 */
public final class ManyContactsProperty<DataType >
    extends MailJetResourceProperty<ManyContacts, DataType>
{

    /**
     * Action to perform when POST is done.
     * 
     */
    public final static ManyContactsProperty<ManyContactsAction> ACTION = new ManyContactsProperty<ManyContactsAction>("Action", ManyContactsAction.class);
    /**
     * Array of email addresses.
     * 
     */
    public final static ManyContactsProperty<List<String>> ADDRESSES = new ManyContactsProperty<List<String>>("Addresses", List.class);
    /**
     * On return, filled with errors.
     * 
     */
    public final static ManyContactsProperty<Object> ERRORS = new ManyContactsProperty<Object>("Errors", Object.class);
    /**
     * Should subscription be enforced ?.
     * 
     */
    public final static ManyContactsProperty<Boolean> FORCE = new ManyContactsProperty<Boolean>("Force", Boolean.class);
    /**
     * Rereference to Contactslist to which to subscribe.
     * 
     */
    public final static ManyContactsProperty<Long> LISTID = new ManyContactsProperty<Long>("ListID", Long.class);
    /**
     * On return contains a list of create listrecipients.
     * 
     */
    public final static ManyContactsProperty<ManyContactsListRecipientList> RECIPIENTS = new ManyContactsProperty<ManyContactsListRecipientList>("Recipients", ManyContactsListRecipientList.class);

    private ManyContactsProperty(String name, Class<?> type) {
        super(name, type);
    }

    public static ManyContactsProperty<Object> ref(String name) {
        return new ManyContactsProperty<Object>(name, Object.class);
    }

    public final static class Key<KeyDataType >
        extends MailJetKeyProperty<ManyContacts, KeyDataType>
    {


        private Key(String name, Class<?> type) {
            super(name, type);
        }

    }

}
