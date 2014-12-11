
package com.mailjet.api.model.v3.contacthistorydata;

import java.util.Date;
import com.mailjet.api.client.model.MailJetResourceFilter;


/**
 * Class representing filter for  "contacthistorydata" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:21 CEST 2014.
 * 
 */
public final class ContactHistorydataFilter<DataType >
    extends MailJetResourceFilter<ContactHistorydata, DataType>
{

    /**
     * Only retrieve contacthistorydata resources for the specified contact.
     * 
     */
    public final static ContactHistorydataFilter<Long> CONTACT = new ContactHistorydataFilter<Long>("Contact", Long.class);
    /**
     * Is set to true, then only the last recorded value is returned. This can only be specified if Contact and Name are specified.
     * 
     */
    public final static ContactHistorydataFilter<Boolean> LAST = new ContactHistorydataFilter<Boolean>("Last", Boolean.class);
    /**
     * Only retrieve contacthistorydata resources for which CreatedAt is strictly less than the specified value.
     * 
     */
    public final static ContactHistorydataFilter<Date> MAXCREATEDAT = new ContactHistorydataFilter<Date>("MaxCreatedAt", Date.class);
    /**
     * Only retrieve contacthistorydata resources for which CreatedAt is greater than or equal to the specified value.
     * 
     */
    public final static ContactHistorydataFilter<Date> MINCREATEDAT = new ContactHistorydataFilter<Date>("MinCreatedAt", Date.class);
    /**
     * Only retrieve contacthistorydata resources for which Name equals the specified value.
     * 
     */
    public final static ContactHistorydataFilter<String> NAME = new ContactHistorydataFilter<String>("Name", String.class);

    private ContactHistorydataFilter(String name, Class<?> type) {
        super(name, type);
    }

}
