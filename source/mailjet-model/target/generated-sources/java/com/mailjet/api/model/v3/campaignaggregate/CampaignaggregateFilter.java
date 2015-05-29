
package com.mailjet.api.model.v3.campaignaggregate;

import com.mailjet.api.client.model.MailJetResourceFilter;


/**
 * Class representing filter for  "campaignaggregate" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
 * 
 */
public final class CampaignaggregateFilter<DataType >
    extends MailJetResourceFilter<Campaignaggregate, DataType>
{

    /**
     * 
     * 
     */
    public final static CampaignaggregateFilter<Long> CONTACTFILTER = new CampaignaggregateFilter<Long>("ContactFilter", Long.class);
    /**
     * 
     * 
     */
    public final static CampaignaggregateFilter<Long> CONTACTSLIST = new CampaignaggregateFilter<Long>("ContactsList", Long.class);
    /**
     * 
     * 
     */
    public final static CampaignaggregateFilter<Long> SENDER = new CampaignaggregateFilter<Long>("Sender", Long.class);

    private CampaignaggregateFilter(String name, Class<?> type) {
        super(name, type);
    }

}
