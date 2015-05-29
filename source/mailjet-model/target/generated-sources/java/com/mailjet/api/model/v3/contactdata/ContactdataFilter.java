
package com.mailjet.api.model.v3.contactdata;

import java.util.Date;
import com.mailjet.api.client.model.MailJetResourceFilter;


/**
 * Class representing filter for  "contactdata" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
 * 
 */
public final class ContactdataFilter<DataType >
    extends MailJetResourceFilter<Contactdata, DataType>
{

    /**
     * Only retrieve contactdata resources for which Campaign equals the specified value.
     * 
     */
    public final static ContactdataFilter<Long> CAMPAIGN = new ContactdataFilter<Long>("Campaign", Long.class);
    /**
     * Only retrieve contactdata resources for which ContactsList equals the specified value.
     * 
     */
    public final static ContactdataFilter<Long> CONTACTSLIST = new ContactdataFilter<Long>("ContactsList", Long.class);
    /**
     * Only retrieve the value for the named field from the extra contact data.
     * 
     */
    public final static ContactdataFilter<String> FIELDS = new ContactdataFilter<String>("Fields", String.class);
    /**
     * Only retrieve contactdata resources for which Contact.IsUnsubscribed equals the specified value
     * 
     */
    public final static ContactdataFilter<Boolean> ISUNSUBSCRIBED = new ContactdataFilter<Boolean>("IsUnsubscribed", Boolean.class);
    /**
     * Only retrieve contactdata resources for which Contact.LastActivityAt equals the specified value.
     * 
     */
    public final static ContactdataFilter<Date> LASTACTIVITYAT = new ContactdataFilter<Date>("LastActivityAt", Date.class);
    /**
     * Only retrieve contactdata resources for which Contact.Recipient equals the specified value.
     * 
     */
    public final static ContactdataFilter<Long> RECIPIENT = new ContactdataFilter<Long>("Recipient", Long.class);
    /**
     * Only retrieve contactdata resources for which Contact.Status equals the specified value.
     * 
     */
    public final static ContactdataFilter<String> STATUS = new ContactdataFilter<String>("Status", String.class);

    private ContactdataFilter(String name, Class<?> type) {
        super(name, type);
    }

}
