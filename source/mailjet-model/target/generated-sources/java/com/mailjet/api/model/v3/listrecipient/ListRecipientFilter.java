
package com.mailjet.api.model.v3.listrecipient;

import java.util.Date;
import com.mailjet.api.client.model.MailJetResourceFilter;


/**
 * Class representing filter for  "listrecipient" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
 * 
 */
public final class ListRecipientFilter<DataType >
    extends MailJetResourceFilter<ListRecipient, DataType>
{

    /**
     * Retrieve only list recipients for which the IsActive property matches the specified value.
     * 
     */
    public final static ListRecipientFilter<Boolean> ACTIVE = new ListRecipientFilter<Boolean>("Active", Boolean.class);
    /**
     * Retrieve only list recipients for which the contact's IsBlocked property matches the specified value.
     * 
     */
    public final static ListRecipientFilter<Boolean> BLOCKED = new ListRecipientFilter<Boolean>("Blocked", Boolean.class);
    /**
     * Only retrieve listrecipient resources for which Contact ID equals the specified value.
     * 
     */
    public final static ListRecipientFilter<Long> CONTACT = new ListRecipientFilter<Long>("Contact", Long.class);
    /**
     * Retrieve only list recipients for which the contact's Email  property matches the specified value.
     * 
     */
    public final static ListRecipientFilter<String> CONTACTEMAIL = new ListRecipientFilter<String>("ContactEmail", String.class);
    /**
     * Retrieve only list recipients for the specified contact list.
     * 
     */
    public final static ListRecipientFilter<Long> CONTACTSLIST = new ListRecipientFilter<Long>("ContactsList", Long.class);
    /**
     * 
     * 
     */
    public final static ListRecipientFilter<Boolean> IGNOREDELETED = new ListRecipientFilter<Boolean>("IgnoreDeleted", Boolean.class);
    /**
     * Timestamp of last registered activity for this ListRecipient.
     * 
     */
    public final static ListRecipientFilter<Date> LASTACTIVITYAT = new ListRecipientFilter<Date>("LastActivityAt", Date.class);
    /**
     * Retrieve only list recipients for the specified contact list.
     * 
     */
    public final static ListRecipientFilter<String> LISTNAME = new ListRecipientFilter<String>("ListName", String.class);
    /**
     * Retrieve only list recipients for which the contact has at least an opened email.
     * 
     */
    public final static ListRecipientFilter<Boolean> OPENED = new ListRecipientFilter<Boolean>("Opened", Boolean.class);
    /**
     * Retrieve only list recipients for the given status.
     * 
     */
    public final static ListRecipientFilter<String> STATUS = new ListRecipientFilter<String>("Status", String.class);
    /**
     * Retrieve only list recipients for which the IsUnsubscribed property matches the specified value.
     * 
     */
    public final static ListRecipientFilter<Boolean> UNSUB = new ListRecipientFilter<Boolean>("Unsub", Boolean.class);

    private ListRecipientFilter(String name, Class<?> type) {
        super(name, type);
    }

}
