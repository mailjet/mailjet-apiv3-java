
package com.mailjet.api.model.v3.campaigngraphstatistics;

import com.mailjet.api.client.model.MailJetKeyProperty;
import com.mailjet.api.client.model.MailJetResourceProperty;


/**
 * Class defining property constants for "campaigngraphstatistics" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:20 CEST 2014.
 * 
 */
public final class CampaignGraphStatisticsProperty<DataType >
    extends MailJetResourceProperty<CampaignGraphStatistics, DataType>
{

    /**
     * 
     * 
     */
    public final static CampaignGraphStatisticsProperty<Long> CLICKCOUNT = new CampaignGraphStatisticsProperty<Long>("Clickcount", Long.class);
    /**
     * 
     * 
     */
    public final static CampaignGraphStatisticsProperty.Key<Long> ID = new CampaignGraphStatisticsProperty.Key<Long>("ID", Long.class);
    /**
     * 
     * 
     */
    public final static CampaignGraphStatisticsProperty<Long> OPENCOUNT = new CampaignGraphStatisticsProperty<Long>("Opencount", Long.class);
    /**
     * 
     * 
     */
    public final static CampaignGraphStatisticsProperty<Long> SPAMCOUNT = new CampaignGraphStatisticsProperty<Long>("Spamcount", Long.class);
    /**
     * 
     * 
     */
    public final static CampaignGraphStatisticsProperty<Long> TICK = new CampaignGraphStatisticsProperty<Long>("Tick", Long.class);
    /**
     * 
     * 
     */
    public final static CampaignGraphStatisticsProperty<Long> UNSUBCOUNT = new CampaignGraphStatisticsProperty<Long>("Unsubcount", Long.class);

    private CampaignGraphStatisticsProperty(String name, Class<?> type) {
        super(name, type);
    }

    public static CampaignGraphStatisticsProperty<Object> ref(String name) {
        return new CampaignGraphStatisticsProperty<Object>(name, Object.class);
    }

    public final static class Key<KeyDataType >
        extends MailJetKeyProperty<CampaignGraphStatistics, KeyDataType>
    {


        private Key(String name, Class<?> type) {
            super(name, type);
        }

    }

}
