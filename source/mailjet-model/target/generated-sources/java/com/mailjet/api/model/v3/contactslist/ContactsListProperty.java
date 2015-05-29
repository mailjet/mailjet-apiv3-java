
package com.mailjet.api.model.v3.contactslist;

import java.util.Date;
import com.mailjet.api.client.model.MailJetKeyProperty;
import com.mailjet.api.client.model.MailJetResourceProperty;


/**
 * Class defining property constants for "contactslist" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
 * 
 */
public final class ContactsListProperty<DataType >
    extends MailJetResourceProperty<ContactsList, DataType>
{

    /**
     * Email address at which this contacts of this list can be reached.
     * 
     */
    public final static ContactsListProperty.Key<String> ADDRESS = new ContactsListProperty.Key<String>("Address", String.class);
    /**
     * Timestamp when object was created in database.
     * 
     */
    public final static ContactsListProperty<Date> CREATEDAT = new ContactsListProperty<Date>("CreatedAt", Date.class);
    /**
     * Unique numerical ID for this object.
     * 
     */
    public final static ContactsListProperty.Key<Long> ID = new ContactsListProperty.Key<Long>("ID", Long.class);
    /**
     * Has this list been deleted or not.
     * 
     */
    public final static ContactsListProperty<Boolean> ISDELETED = new ContactsListProperty<Boolean>("IsDeleted", Boolean.class);
    /**
     * User-specified name for this contact list (must be unique).
     * 
     */
    public final static ContactsListProperty<String> NAME = new ContactsListProperty<String>("Name", String.class);
    /**
     * Number of subscribers for this list.
     * 
     */
    public final static ContactsListProperty<Integer> SUBSCRIBERCOUNT = new ContactsListProperty<Integer>("SubscriberCount", Integer.class);

    private ContactsListProperty(String name, Class<?> type) {
        super(name, type);
    }

    public static ContactsListProperty<Object> ref(String name) {
        return new ContactsListProperty<Object>(name, Object.class);
    }

    public final static class Key<KeyDataType >
        extends MailJetKeyProperty<ContactsList, KeyDataType>
    {


        private Key(String name, Class<?> type) {
            super(name, type);
        }

    }

}
