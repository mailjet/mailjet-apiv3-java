
package com.mailjet.api.model.v3.clickstatistics;

import java.util.Date;
import com.mailjet.api.client.model.MailJetResourceFilter;


/**
 * Class representing filter for  "clickstatistics" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:21 CEST 2014.
 * 
 */
public final class ClickStatisticsFilter<DataType >
    extends MailJetResourceFilter<ClickStatistics, DataType>
{

    /**
     * Unique numerical ID for this object.
     * 
     */
    public final static ClickStatisticsFilter<Long> CAMPAIGNID = new ClickStatisticsFilter<Long>("CampaignID", Long.class);
    /**
     * Only retrieve campaigns with status equal to specified value.
     * 
     */
    public final static ClickStatisticsFilter<Short> CAMPAIGNSTATUS = new ClickStatisticsFilter<Short>("CampaignStatus", Short.class);
    /**
     * Only retrieve campaigns to given Contacts list.
     * 
     */
    public final static ClickStatisticsFilter<Long> CONTACTSLIST = new ClickStatisticsFilter<Long>("ContactsList", Long.class);
    /**
     * Only retrieve campaigns with given Custom Value.
     * 
     */
    public final static ClickStatisticsFilter<String> CUSTOMCAMPAIGN = new ClickStatisticsFilter<String>("CustomCampaign", String.class);
    /**
     * Only retrieve campaigns with given From header.
     * 
     */
    public final static ClickStatisticsFilter<String> FROM = new ClickStatisticsFilter<String>("From", String.class);
    /**
     * Only retrieve campaigns with given domain in From header.
     * 
     */
    public final static ClickStatisticsFilter<String> FROMDOMAIN = new ClickStatisticsFilter<String>("FromDomain", String.class);
    /**
     * Only retrieve campaigns with this sender ID.
     * 
     */
    public final static ClickStatisticsFilter<Long> FROMID = new ClickStatisticsFilter<Long>("FromID", Long.class);
    /**
     * Only retrieve campaigns with SendStartAt after this timestamp.
     * 
     */
    public final static ClickStatisticsFilter<Date> FROMTS = new ClickStatisticsFilter<Date>("FromTS", Date.class);
    /**
     * Only retrieve campaigns with FromType equal to specified value.
     * 
     */
    public final static ClickStatisticsFilter<Integer> FROMTYPE = new ClickStatisticsFilter<Integer>("FromType", Integer.class);
    /**
     * Only retrieve campaigns where isDeleted matches the specified value.
     * 
     */
    public final static ClickStatisticsFilter<Boolean> ISDELETED = new ClickStatisticsFilter<Boolean>("IsDeleted", Boolean.class);
    /**
     * Only retrieve campaigns which were started by the newsletter tool.
     * 
     */
    public final static ClickStatisticsFilter<Boolean> ISNEWSLETTERTOOL = new ClickStatisticsFilter<Boolean>("IsNewsletterTool", Boolean.class);
    /**
     * Only retrieve campaigns which were marked as starred.
     * 
     */
    public final static ClickStatisticsFilter<Boolean> ISSTARRED = new ClickStatisticsFilter<Boolean>("IsStarred", Boolean.class);
    /**
     * Only retrieve messages with the given ID.
     * 
     */
    public final static ClickStatisticsFilter<Long> MESSAGEID = new ClickStatisticsFilter<Long>("MessageID", Long.class);
    /**
     * Only retrieve messages with status equal to specified value.
     * 
     */
    public final static ClickStatisticsFilter<Long> MESSAGESTATUSID = new ClickStatisticsFilter<Long>("MessageStatusID", Long.class);
    /**
     * Set FromTS and ToTS timestamps to beginning of indicated period and current timestamp, respectively.
     * 
     */
    public final static ClickStatisticsFilter<String> PERIOD = new ClickStatisticsFilter<String>("Period", String.class);
    /**
     * Only retrieve campaigns with SendStartAt timestamp less than the specified value.
     * 
     */
    public final static ClickStatisticsFilter<Date> TOTS = new ClickStatisticsFilter<Date>("ToTS", Date.class);

    private ClickStatisticsFilter(String name, Class<?> type) {
        super(name, type);
    }

}
