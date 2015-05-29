
package com.mailjet.api.model.v3.contact;

import java.util.Date;
import com.mailjet.api.client.model.MailJetResourceFilter;


/**
 * Class representing filter for  "contact" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
 * 
 */
public final class ContactFilter<DataType >
    extends MailJetResourceFilter<Contact, DataType>
{

    /**
     * Only retrieve contacts targeted by this campaign.
     * 
     */
    public final static ContactFilter<Long> CAMPAIGN = new ContactFilter<Long>("Campaign", Long.class);
    /**
     * Only retrieve contacts from this contact list.
     * 
     */
    public final static ContactFilter<Long> CONTACTSLIST = new ContactFilter<Long>("ContactsList", Long.class);
    /**
     * Only retrieve contacts which have been unsubscribed (or not).
     * 
     */
    public final static ContactFilter<Boolean> ISUNSUBSCRIBED = new ContactFilter<Boolean>("IsUnsubscribed", Boolean.class);
    /**
     * Only retrieve contact resources for which LastActivityAt equals the specified value.
     * 
     */
    public final static ContactFilter<Date> LASTACTIVITYAT = new ContactFilter<Date>("LastActivityAt", Date.class);
    /**
     * Only retrieve contacts corresponding to this recipient.
     * 
     */
    public final static ContactFilter<Long> RECIPIENT = new ContactFilter<Long>("Recipient", Long.class);
    /**
     * Only retrieve contacts with the specified status.
     * 
     */
    public final static ContactFilter<String> STATUS = new ContactFilter<String>("Status", String.class);

    private ContactFilter(String name, Class<?> type) {
        super(name, type);
    }

}
