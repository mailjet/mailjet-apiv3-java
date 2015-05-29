
package com.mailjet.api.model.v3.campaigngraphstatistics;

import com.mailjet.api.client.model.MailJetResourceFilter;


/**
 * Class representing filter for  "campaigngraphstatistics" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
 * 
 */
public final class CampaignGraphStatisticsFilter<DataType >
    extends MailJetResourceFilter<CampaignGraphStatistics, DataType>
{

    /**
     * 
     * 
     */
    public final static CampaignGraphStatisticsFilter<Boolean> CLICK = new CampaignGraphStatisticsFilter<Boolean>("Click", Boolean.class);
    /**
     * 
     * 
     */
    public final static CampaignGraphStatisticsFilter<String> IDS = new CampaignGraphStatisticsFilter<String>("IDS", String.class);
    /**
     * 
     * 
     */
    public final static CampaignGraphStatisticsFilter<Boolean> OPEN = new CampaignGraphStatisticsFilter<Boolean>("Open", Boolean.class);
    /**
     * 
     * 
     */
    public final static CampaignGraphStatisticsFilter<String> RANGE = new CampaignGraphStatisticsFilter<String>("Range", String.class);
    /**
     * 
     * 
     */
    public final static CampaignGraphStatisticsFilter<Boolean> SPAM = new CampaignGraphStatisticsFilter<Boolean>("Spam", Boolean.class);
    /**
     * 
     * 
     */
    public final static CampaignGraphStatisticsFilter<Boolean> UNSUB = new CampaignGraphStatisticsFilter<Boolean>("Unsub", Boolean.class);

    private CampaignGraphStatisticsFilter(String name, Class<?> type) {
        super(name, type);
    }

}
