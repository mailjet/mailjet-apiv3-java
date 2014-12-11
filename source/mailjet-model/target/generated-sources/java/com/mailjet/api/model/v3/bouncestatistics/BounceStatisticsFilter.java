
package com.mailjet.api.model.v3.bouncestatistics;

import java.util.Date;
import com.mailjet.api.client.model.MailJetResourceFilter;


/**
 * Class representing filter for  "bouncestatistics" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:20 CEST 2014.
 * 
 */
public final class BounceStatisticsFilter<DataType >
    extends MailJetResourceFilter<BounceStatistics, DataType>
{

    /**
     * Filter bounces on this campaign (ID).
     * 
     */
    public final static BounceStatisticsFilter<Long> CAMPAIGNID = new BounceStatisticsFilter<Long>("CampaignID", Long.class);
    /**
     * Filter on campaign status.
     * 
     */
    public final static BounceStatisticsFilter<Short> CAMPAIGNSTATUS = new BounceStatisticsFilter<Short>("CampaignStatus", Short.class);
    /**
     * Filter bounces on this contact list (ID).
     * 
     */
    public final static BounceStatisticsFilter<Long> CONTACTSLIST = new BounceStatisticsFilter<Long>("ContactsList", Long.class);
    /**
     * Filter bounces on this custom campaign value.
     * 
     */
    public final static BounceStatisticsFilter<String> CUSTOMCAMPAIGN = new BounceStatisticsFilter<String>("CustomCampaign", String.class);
    /**
     * Filter results on from address.
     * 
     */
    public final static BounceStatisticsFilter<String> FROM = new BounceStatisticsFilter<String>("From", String.class);
    /**
     * Filter results on from domain.
     * 
     */
    public final static BounceStatisticsFilter<String> FROMDOMAIN = new BounceStatisticsFilter<String>("FromDomain", String.class);
    /**
     * Unique numerical ID for this object.
     * 
     */
    public final static BounceStatisticsFilter<Long> FROMID = new BounceStatisticsFilter<Long>("FromID", Long.class);
    /**
     * Minimum value for campaign SendStartAt timestamp.
     * 
     */
    public final static BounceStatisticsFilter<Date> FROMTS = new BounceStatisticsFilter<Date>("FromTS", Date.class);
    /**
     * Type of from address.
     * 
     */
    public final static BounceStatisticsFilter<Integer> FROMTYPE = new BounceStatisticsFilter<Integer>("FromType", Integer.class);
    /**
     * Filter on Campaign IsDeleted.
     * 
     */
    public final static BounceStatisticsFilter<Boolean> ISDELETED = new BounceStatisticsFilter<Boolean>("IsDeleted", Boolean.class);
    /**
     * Filter on whether Campaign was started by the newsletter tool or not.
     * 
     */
    public final static BounceStatisticsFilter<Boolean> ISNEWSLETTERTOOL = new BounceStatisticsFilter<Boolean>("IsNewsletterTool", Boolean.class);
    /**
     * Filter on Campaign IsStarred.
     * 
     */
    public final static BounceStatisticsFilter<Boolean> ISSTARRED = new BounceStatisticsFilter<Boolean>("IsStarred", Boolean.class);
    /**
     * Filter on message status.
     * 
     */
    public final static BounceStatisticsFilter<Long> MESSAGESTATUSID = new BounceStatisticsFilter<Long>("MessageStatusID", Long.class);
    /**
     * Set FromTS and ToTS timestamps to beginning of indicated period and current timestamp, respectively.
     * 
     */
    public final static BounceStatisticsFilter<String> PERIOD = new BounceStatisticsFilter<String>("Period", String.class);
    /**
     * Maximum value for campaign SendStartAt timestamp.
     * 
     */
    public final static BounceStatisticsFilter<Date> TOTS = new BounceStatisticsFilter<Date>("ToTS", Date.class);

    private BounceStatisticsFilter(String name, Class<?> type) {
        super(name, type);
    }

}
