
package com.mailjet.api.model.v3.listrecipient;

import java.util.Date;
import com.mailjet.api.client.model.MailJetKeyProperty;
import com.mailjet.api.client.model.MailJetResourceProperty;


/**
 * Class defining property constants for "listrecipient" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:21 CEST 2014.
 * 
 */
public final class ListRecipientProperty<DataType >
    extends MailJetResourceProperty<ListRecipient, DataType>
{

    /**
     * Reference to contact which is suscribed to the contactslist.
     * 
     */
    public final static ListRecipientProperty<Long> CONTACTID = new ListRecipientProperty<Long>("ContactID", Long.class);
    /**
     * Unique numerical ID for this object.
     * 
     */
    public final static ListRecipientProperty.Key<Long> ID = new ListRecipientProperty.Key<Long>("ID", Long.class);
    /**
     * Is this subscription active.
     * 
     */
    public final static ListRecipientProperty<Boolean> ISACTIVE = new ListRecipientProperty<Boolean>("IsActive", Boolean.class);
    /**
     * Has the contact been unsubscribed from the list ?.
     * 
     */
    public final static ListRecipientProperty<Boolean> ISUNSUBSCRIBED = new ListRecipientProperty<Boolean>("IsUnsubscribed", Boolean.class);
    /**
     * Contacts list to which contact is subscribed.
     * 
     */
    public final static ListRecipientProperty<Long> LISTID = new ListRecipientProperty<Long>("ListID", Long.class);
    /**
     * Timestamp when unsubscription was registered.
     * 
     */
    public final static ListRecipientProperty<Date> UNSUBSCRIBEDAT = new ListRecipientProperty<Date>("UnsubscribedAt", Date.class);

    private ListRecipientProperty(String name, Class<?> type) {
        super(name, type);
    }

    public static ListRecipientProperty<Object> ref(String name) {
        return new ListRecipientProperty<Object>(name, Object.class);
    }

    public final static class Key<KeyDataType >
        extends MailJetKeyProperty<ListRecipient, KeyDataType>
    {


        private Key(String name, Class<?> type) {
            super(name, type);
        }

    }

}
