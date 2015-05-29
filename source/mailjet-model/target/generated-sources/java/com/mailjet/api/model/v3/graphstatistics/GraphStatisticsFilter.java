
package com.mailjet.api.model.v3.graphstatistics;

import java.util.Date;
import com.mailjet.api.client.model.MailJetResourceFilter;


/**
 * Class representing filter for  "graphstatistics" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
 * 
 */
public final class GraphStatisticsFilter<DataType >
    extends MailJetResourceFilter<GraphStatistics, DataType>
{

    /**
     * Unique numerical ID for this object.
     * 
     */
    public final static GraphStatisticsFilter<Long> CAMPAIGNID = new GraphStatisticsFilter<Long>("CampaignID", Long.class);
    /**
     * Only retrieve campaigns with status equal to specified value.
     * 
     */
    public final static GraphStatisticsFilter<Short> CAMPAIGNSTATUS = new GraphStatisticsFilter<Short>("CampaignStatus", Short.class);
    /**
     * Only retrieve campaigns sent to the specified contact.
     * 
     */
    public final static GraphStatisticsFilter<Integer> CONTACT = new GraphStatisticsFilter<Integer>("Contact", Integer.class);
    /**
     * Only retrieve campaigns sent to specified Contacts list.
     * 
     */
    public final static GraphStatisticsFilter<Long> CONTACTSLIST = new GraphStatisticsFilter<Long>("ContactsList", Long.class);
    /**
     * Only retrieve campaigns with given Custom Value.
     * 
     */
    public final static GraphStatisticsFilter<String> CUSTOMCAMPAIGN = new GraphStatisticsFilter<String>("CustomCampaign", String.class);
    /**
     * Only retrieve campaigns with given From header.
     * 
     */
    public final static GraphStatisticsFilter<String> FROM = new GraphStatisticsFilter<String>("From", String.class);
    /**
     * Only retrieve campaigns with given domain in From header.
     * 
     */
    public final static GraphStatisticsFilter<String> FROMDOMAIN = new GraphStatisticsFilter<String>("FromDomain", String.class);
    /**
     * Only retrieve campaigns with this sender ID.
     * 
     */
    public final static GraphStatisticsFilter<Long> FROMID = new GraphStatisticsFilter<Long>("FromID", Long.class);
    /**
     * Only retrieve campaigns with SendStartAt after this timestamp.
     * 
     */
    public final static GraphStatisticsFilter<Date> FROMTS = new GraphStatisticsFilter<Date>("FromTS", Date.class);
    /**
     * Only retrieve campaigns with FromType equal to specified value.
     * 
     */
    public final static GraphStatisticsFilter<Integer> FROMTYPE = new GraphStatisticsFilter<Integer>("FromType", Integer.class);
    /**
     * Only retrieve campaigns where isDeleted matches the specified value.
     * 
     */
    public final static GraphStatisticsFilter<Boolean> ISDELETED = new GraphStatisticsFilter<Boolean>("IsDeleted", Boolean.class);
    /**
     * Only retrieve campaigns which were started by the newsletter tool.
     * 
     */
    public final static GraphStatisticsFilter<Boolean> ISNEWSLETTERTOOL = new GraphStatisticsFilter<Boolean>("IsNewsletterTool", Boolean.class);
    /**
     * Only retrieve campaigns which were marked as starred.
     * 
     */
    public final static GraphStatisticsFilter<Boolean> ISSTARRED = new GraphStatisticsFilter<Boolean>("IsStarred", Boolean.class);
    /**
     * Only retrieve messages with status equal to specified value.
     * 
     */
    public final static GraphStatisticsFilter<Long> MESSAGESTATUSID = new GraphStatisticsFilter<Long>("MessageStatusID", Long.class);
    /**
     * Set FromTS and ToTS timestamps to beginning of indicated period and current timestamp, respectively.
     * 
     */
    public final static GraphStatisticsFilter<String> PERIOD = new GraphStatisticsFilter<String>("Period", String.class);
    /**
     * Scale for this statistic (hour, day, week, month, year)
     * 
     */
    public final static GraphStatisticsFilter<String> SCALE = new GraphStatisticsFilter<String>("Scale", String.class);
    /**
     * 
     * 
     */
    public final static GraphStatisticsFilter<Date> TIMESHIFT = new GraphStatisticsFilter<Date>("TimeShift", Date.class);
    /**
     * Only retrieve campaigns with SendStartAt timestamp less than the specified value.
     * 
     */
    public final static GraphStatisticsFilter<Date> TOTS = new GraphStatisticsFilter<Date>("ToTS", Date.class);

    private GraphStatisticsFilter(String name, Class<?> type) {
        super(name, type);
    }

}
