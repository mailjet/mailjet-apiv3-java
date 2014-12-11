
package com.mailjet.api.model.v3.contact;

import java.util.Date;
import com.mailjet.api.client.model.MailJetKeyProperty;
import com.mailjet.api.client.model.MailJetResourceProperty;


/**
 * Class defining property constants for "contact" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:21 CEST 2014.
 * 
 */
public final class ContactProperty<DataType >
    extends MailJetResourceProperty<Contact, DataType>
{

    /**
     * Timestamp when object was created in database.
     * 
     */
    public final static ContactProperty<Date> CREATEDAT = new ContactProperty<Date>("CreatedAt", Date.class);
    /**
     * Number of messages delivered to this contact.
     * 
     */
    public final static ContactProperty<Long> DELIVEREDCOUNT = new ContactProperty<Long>("DeliveredCount", Long.class);
    /**
     * Email address of this contact.
     * 
     */
    public final static ContactProperty.Key<String> EMAIL = new ContactProperty.Key<String>("Email", String.class);
    /**
     * Unique numerical ID for this object.
     * 
     */
    public final static ContactProperty.Key<Long> ID = new ContactProperty.Key<Long>("ID", Long.class);
    /**
     * Is an opt-in for a contactslist subscription pending ?.
     * 
     */
    public final static ContactProperty<Boolean> ISOPTINPENDING = new ContactProperty<Boolean>("IsOptInPending", Boolean.class);
    /**
     * Is this contact complaining of spam ?.
     * 
     */
    public final static ContactProperty<Boolean> ISSPAMCOMPLAINING = new ContactProperty<Boolean>("IsSpamComplaining", Boolean.class);
    /**
     * Timestamp of last registered activity for this contact.
     * 
     */
    public final static ContactProperty<Date> LASTACTIVITYAT = new ContactProperty<Date>("LastActivityAt", Date.class);
    /**
     * Timestamp of last update of this contact.
     * 
     */
    public final static ContactProperty<Date> LASTUPDATEAT = new ContactProperty<Date>("LastUpdateAt", Date.class);
    /**
     * User-provided name for this contact.
     * 
     */
    public final static ContactProperty<String> NAME = new ContactProperty<String>("Name", String.class);
    /**
     * Timestamp of last unsubscribe from all lists request.
     * 
     */
    public final static ContactProperty<Date> UNSUBSCRIBEDAT = new ContactProperty<Date>("UnsubscribedAt", Date.class);
    /**
     * Description of who initiated the unsubscribe from all lists request.
     * 
     */
    public final static ContactProperty<String> UNSUBSCRIBEDBY = new ContactProperty<String>("UnsubscribedBy", String.class);

    private ContactProperty(String name, Class<?> type) {
        super(name, type);
    }

    public static ContactProperty<Object> ref(String name) {
        return new ContactProperty<Object>(name, Object.class);
    }

    public final static class Key<KeyDataType >
        extends MailJetKeyProperty<Contact, KeyDataType>
    {


        private Key(String name, Class<?> type) {
            super(name, type);
        }

    }

}
