
package com.mailjet.api.model.v3.openstatistics;

import java.util.Date;
import com.mailjet.api.client.model.MailJetResourceFilter;


/**
 * Class representing filter for  "openstatistics" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
 * 
 */
public final class OpenStatisticsFilter<DataType >
    extends MailJetResourceFilter<OpenStatistics, DataType>
{

    /**
     * Unique numerical ID for this object.
     * 
     */
    public final static OpenStatisticsFilter<Long> CAMPAIGNID = new OpenStatisticsFilter<Long>("CampaignID", Long.class);
    /**
     * Only retrieve campaigns with status equal to specified value.
     * 
     */
    public final static OpenStatisticsFilter<Short> CAMPAIGNSTATUS = new OpenStatisticsFilter<Short>("CampaignStatus", Short.class);
    /**
     * Only retrieve campaigns sent to specified Contacts list.
     * 
     */
    public final static OpenStatisticsFilter<Long> CONTACTSLIST = new OpenStatisticsFilter<Long>("ContactsList", Long.class);
    /**
     * Only retrieve campaigns with given Custom Value.
     * 
     */
    public final static OpenStatisticsFilter<String> CUSTOMCAMPAIGN = new OpenStatisticsFilter<String>("CustomCampaign", String.class);
    /**
     * Only retrieve campaigns with given From header.
     * 
     */
    public final static OpenStatisticsFilter<String> FROM = new OpenStatisticsFilter<String>("From", String.class);
    /**
     * Only retrieve campaigns with given domain in From header.
     * 
     */
    public final static OpenStatisticsFilter<String> FROMDOMAIN = new OpenStatisticsFilter<String>("FromDomain", String.class);
    /**
     * Only retrieve campaigns with this sender ID.
     * 
     */
    public final static OpenStatisticsFilter<Long> FROMID = new OpenStatisticsFilter<Long>("FromID", Long.class);
    /**
     * Only retrieve campaigns with SendStartAt after this timestamp.
     * 
     */
    public final static OpenStatisticsFilter<Date> FROMTS = new OpenStatisticsFilter<Date>("FromTS", Date.class);
    /**
     * Only retrieve campaigns with FromType equal to specified value.
     * 
     */
    public final static OpenStatisticsFilter<Integer> FROMTYPE = new OpenStatisticsFilter<Integer>("FromType", Integer.class);
    /**
     * Only retrieve campaigns where isDeleted matches the specified value.
     * 
     */
    public final static OpenStatisticsFilter<Boolean> ISDELETED = new OpenStatisticsFilter<Boolean>("IsDeleted", Boolean.class);
    /**
     * Only retrieve campaigns which were started by the newsletter tool.
     * 
     */
    public final static OpenStatisticsFilter<Boolean> ISNEWSLETTERTOOL = new OpenStatisticsFilter<Boolean>("IsNewsletterTool", Boolean.class);
    /**
     * Only retrieve campaigns which were marked as starred.
     * 
     */
    public final static OpenStatisticsFilter<Boolean> ISSTARRED = new OpenStatisticsFilter<Boolean>("IsStarred", Boolean.class);
    /**
     * Only retrieve messages with status equal to specified value.
     * 
     */
    public final static OpenStatisticsFilter<Long> MESSAGESTATUSID = new OpenStatisticsFilter<Long>("MessageStatusID", Long.class);
    /**
     * Set FromTS and ToTS timestamps to beginning of indicated period and current timestamp, respectively.
     * 
     */
    public final static OpenStatisticsFilter<String> PERIOD = new OpenStatisticsFilter<String>("Period", String.class);
    /**
     * Only retrieve campaigns with SendStartAt timestamp less than the specified value.
     * 
     */
    public final static OpenStatisticsFilter<Date> TOTS = new OpenStatisticsFilter<Date>("ToTS", Date.class);

    private OpenStatisticsFilter(String name, Class<?> type) {
        super(name, type);
    }

}
