
package com.mailjet.api.model.v3.campaignoverview;

import com.mailjet.api.client.model.MailJetResourceFilter;


/**
 * Class representing filter for  "campaignoverview" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
 * 
 */
public final class CampaignoverviewFilter<DataType >
    extends MailJetResourceFilter<Campaignoverview, DataType>
{

    /**
     * 
     * 
     */
    public final static CampaignoverviewFilter<Boolean> ALL = new CampaignoverviewFilter<Boolean>("All", Boolean.class);
    /**
     * 
     * 
     */
    public final static CampaignoverviewFilter<Boolean> ARCHIVED = new CampaignoverviewFilter<Boolean>("Archived", Boolean.class);
    /**
     * 
     * 
     */
    public final static CampaignoverviewFilter<Boolean> DRAFTS = new CampaignoverviewFilter<Boolean>("Drafts", Boolean.class);
    /**
     * 
     * 
     */
    public final static CampaignoverviewFilter<Boolean> PROGRAMMED = new CampaignoverviewFilter<Boolean>("Programmed", Boolean.class);
    /**
     * 
     * 
     */
    public final static CampaignoverviewFilter<Boolean> SENT = new CampaignoverviewFilter<Boolean>("Sent", Boolean.class);
    /**
     * 
     * 
     */
    public final static CampaignoverviewFilter<Boolean> STARRED = new CampaignoverviewFilter<Boolean>("Starred", Boolean.class);
    /**
     * 
     * 
     */
    public final static CampaignoverviewFilter<String> SUBJECT = new CampaignoverviewFilter<String>("Subject", String.class);

    private CampaignoverviewFilter(String name, Class<?> type) {
        super(name, type);
    }

}
