
package com.mailjet.api.model.v3.campaignaggregate;

import java.util.Date;
import com.mailjet.api.client.model.MailJetKeyProperty;
import com.mailjet.api.client.model.MailJetResourceProperty;


/**
 * Class defining property constants for "campaignaggregate" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
 * 
 */
public final class CampaignaggregateProperty<DataType >
    extends MailJetResourceProperty<Campaignaggregate, DataType>
{

    /**
     * 
     * 
     */
    public final static CampaignaggregateProperty<String> CAMPAIGNIDS = new CampaignaggregateProperty<String>("CampaignIDS", String.class);
    /**
     * 
     * 
     */
    public final static CampaignaggregateProperty<Long> CONTACTFILTERID = new CampaignaggregateProperty<Long>("ContactFilterID", Long.class);
    /**
     * 
     * 
     */
    public final static CampaignaggregateProperty<Long> CONTACTSLISTID = new CampaignaggregateProperty<Long>("ContactsListID", Long.class);
    /**
     * 
     * 
     */
    public final static CampaignaggregateProperty<Boolean> FINAL = new CampaignaggregateProperty<Boolean>("Final", Boolean.class);
    /**
     * 
     * 
     */
    public final static CampaignaggregateProperty<Date> FROMDATE = new CampaignaggregateProperty<Date>("FromDate", Date.class);
    /**
     * 
     * 
     */
    public final static CampaignaggregateProperty.Key<Long> ID = new CampaignaggregateProperty.Key<Long>("ID", Long.class);
    /**
     * 
     * 
     */
    public final static CampaignaggregateProperty<String> KEYWORD = new CampaignaggregateProperty<String>("Keyword", String.class);
    /**
     * 
     * 
     */
    public final static CampaignaggregateProperty<String> NAME = new CampaignaggregateProperty<String>("Name", String.class);
    /**
     * 
     * 
     */
    public final static CampaignaggregateProperty<Long> SENDERID = new CampaignaggregateProperty<Long>("SenderID", Long.class);
    /**
     * 
     * 
     */
    public final static CampaignaggregateProperty<Date> TODATE = new CampaignaggregateProperty<Date>("ToDate", Date.class);

    private CampaignaggregateProperty(String name, Class<?> type) {
        super(name, type);
    }

    public static CampaignaggregateProperty<Object> ref(String name) {
        return new CampaignaggregateProperty<Object>(name, Object.class);
    }

    public final static class Key<KeyDataType >
        extends MailJetKeyProperty<Campaignaggregate, KeyDataType>
    {


        private Key(String name, Class<?> type) {
            super(name, type);
        }

    }

}
