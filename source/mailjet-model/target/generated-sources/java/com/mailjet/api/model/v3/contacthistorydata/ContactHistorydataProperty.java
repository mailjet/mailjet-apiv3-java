
package com.mailjet.api.model.v3.contacthistorydata;

import java.util.Date;
import com.mailjet.api.client.model.MailJetKeyProperty;
import com.mailjet.api.client.model.MailJetResourceProperty;


/**
 * Class defining property constants for "contacthistorydata" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
 * 
 */
public final class ContactHistorydataProperty<DataType >
    extends MailJetResourceProperty<ContactHistorydata, DataType>
{

    /**
     * Contact for which this is the historical data.
     * 
     */
    public final static ContactHistorydataProperty<Long> CONTACTID = new ContactHistorydataProperty<Long>("ContactID", Long.class);
    /**
     * Timestamp when the historical data was registered by Mailjet
     * 
     */
    public final static ContactHistorydataProperty<Date> CREATEDAT = new ContactHistorydataProperty<Date>("CreatedAt", Date.class);
    /**
     * The data as a string.
     * 
     */
    public final static ContactHistorydataProperty<String> DATA = new ContactHistorydataProperty<String>("Data", String.class);
    /**
     * ID of the data item.
     * 
     */
    public final static ContactHistorydataProperty.Key<Long> ID = new ContactHistorydataProperty.Key<Long>("ID", Long.class);
    /**
     * Name of the history data item.
     * 
     */
    public final static ContactHistorydataProperty<String> NAME = new ContactHistorydataProperty<String>("Name", String.class);

    private ContactHistorydataProperty(String name, Class<?> type) {
        super(name, type);
    }

    public static ContactHistorydataProperty<Object> ref(String name) {
        return new ContactHistorydataProperty<Object>(name, Object.class);
    }

    public final static class Key<KeyDataType >
        extends MailJetKeyProperty<ContactHistorydata, KeyDataType>
    {


        private Key(String name, Class<?> type) {
            super(name, type);
        }

    }

}
