
package com.mailjet.api.model.v3.useragentstatistics;

import java.util.Date;
import com.mailjet.api.client.model.MailJetResourceFilter;


/**
 * Class representing filter for  "useragentstatistics" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:21 CEST 2014.
 * 
 */
public final class UserAgentStatisticsFilter<DataType >
    extends MailJetResourceFilter<UserAgentStatistics, DataType>
{

    /**
     * Unique numerical ID for this object.
     * 
     */
    public final static UserAgentStatisticsFilter<Long> CAMPAIGNID = new UserAgentStatisticsFilter<Long>("CampaignID", Long.class);
    /**
     * Only retrieve campaigns for which Status equals the specified value.
     * 
     */
    public final static UserAgentStatisticsFilter<Short> CAMPAIGNSTATUS = new UserAgentStatisticsFilter<Short>("CampaignStatus", Short.class);
    /**
     * Only retrieve campaigns sent to specified Contacts list.
     * 
     */
    public final static UserAgentStatisticsFilter<Long> CONTACTSLIST = new UserAgentStatisticsFilter<Long>("ContactsList", Long.class);
    /**
     * Only retrieve campaigns with given Custom Value.
     * 
     */
    public final static UserAgentStatisticsFilter<String> CUSTOMCAMPAIGN = new UserAgentStatisticsFilter<String>("CustomCampaign", String.class);
    /**
     * Event source. This is one of open or click.
     * 
     */
    public final static UserAgentStatisticsFilter<String> EVENT = new UserAgentStatisticsFilter<String>("Event", String.class);
    /**
     * Exclude browsers running on this platform from result.
     * 
     */
    public final static UserAgentStatisticsFilter<String> EXCLUDEPLATFORM = new UserAgentStatisticsFilter<String>("ExcludePlatform", String.class);
    /**
     * Only retrieve campaigns with given From header.
     * 
     */
    public final static UserAgentStatisticsFilter<String> FROM = new UserAgentStatisticsFilter<String>("From", String.class);
    /**
     * Only retrieve campaigns with given domain in From header.
     * 
     */
    public final static UserAgentStatisticsFilter<String> FROMDOMAIN = new UserAgentStatisticsFilter<String>("FromDomain", String.class);
    /**
     * Only retrieve campaigns with this sender ID.
     * 
     */
    public final static UserAgentStatisticsFilter<Long> FROMID = new UserAgentStatisticsFilter<Long>("FromID", Long.class);
    /**
     * Only retrieve campaigns with SendStartAt after this timestamp.
     * 
     */
    public final static UserAgentStatisticsFilter<Date> FROMTS = new UserAgentStatisticsFilter<Date>("FromTS", Date.class);
    /**
     * Only retrieve campaigns with FromType equal to specified value.
     * 
     */
    public final static UserAgentStatisticsFilter<Integer> FROMTYPE = new UserAgentStatisticsFilter<Integer>("FromType", Integer.class);
    /**
     * Only retrieve campaigns where isDeleted matches the specified value.
     * 
     */
    public final static UserAgentStatisticsFilter<Boolean> ISDELETED = new UserAgentStatisticsFilter<Boolean>("IsDeleted", Boolean.class);
    /**
     * Only retrieve campaigns which were started by the newsletter tool.
     * 
     */
    public final static UserAgentStatisticsFilter<Boolean> ISNEWSLETTERTOOL = new UserAgentStatisticsFilter<Boolean>("IsNewsletterTool", Boolean.class);
    /**
     * Only retrieve campaigns which were marked as starred.
     * 
     */
    public final static UserAgentStatisticsFilter<Boolean> ISSTARRED = new UserAgentStatisticsFilter<Boolean>("IsStarred", Boolean.class);
    /**
     * Set FromTS and ToTS timestamps to beginning of indicated period and current timestamp, respectively.
     * 
     */
    public final static UserAgentStatisticsFilter<String> PERIOD = new UserAgentStatisticsFilter<String>("Period", String.class);
    /**
     * Only retrieve useragentstatistics resources for which Platform equals the specified value.
     * 
     */
    public final static UserAgentStatisticsFilter<String> PLATFORM = new UserAgentStatisticsFilter<String>("Platform", String.class);
    /**
     * Only retrieve campaigns with SendStartAt timestamp less than the specified value.
     * 
     */
    public final static UserAgentStatisticsFilter<Date> TOTS = new UserAgentStatisticsFilter<Date>("ToTS", Date.class);

    private UserAgentStatisticsFilter(String name, Class<?> type) {
        super(name, type);
    }

}
