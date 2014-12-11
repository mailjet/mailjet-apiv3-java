
package com.mailjet.api.model.v3.domainstatistics;

import java.util.Date;
import com.mailjet.api.client.model.MailJetResourceFilter;


/**
 * Class representing filter for  "domainstatistics" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:21 CEST 2014.
 * 
 */
public final class DomainStatisticsFilter<DataType >
    extends MailJetResourceFilter<DomainStatistics, DataType>
{

    /**
     * Unique numerical ID for this object.
     * 
     */
    public final static DomainStatisticsFilter<Long> CAMPAIGNID = new DomainStatisticsFilter<Long>("CampaignID", Long.class);
    /**
     * Only retrieve campaigns with status equal to specified value.
     * 
     */
    public final static DomainStatisticsFilter<Short> CAMPAIGNSTATUS = new DomainStatisticsFilter<Short>("CampaignStatus", Short.class);
    /**
     * Only retrieve campaigns sent to specified Contacts list.
     * 
     */
    public final static DomainStatisticsFilter<Long> CONTACTSLIST = new DomainStatisticsFilter<Long>("ContactsList", Long.class);
    /**
     * Only retrieve campaigns with given Custom Value.
     * 
     */
    public final static DomainStatisticsFilter<String> CUSTOMCAMPAIGN = new DomainStatisticsFilter<String>("CustomCampaign", String.class);
    /**
     * Only retrieve campaigns with given From header.
     * 
     */
    public final static DomainStatisticsFilter<String> FROM = new DomainStatisticsFilter<String>("From", String.class);
    /**
     * Only retrieve campaigns with given domain in From header.
     * 
     */
    public final static DomainStatisticsFilter<String> FROMDOMAIN = new DomainStatisticsFilter<String>("FromDomain", String.class);
    /**
     * Only retrieve campaigns with this sender ID.
     * 
     */
    public final static DomainStatisticsFilter<Long> FROMID = new DomainStatisticsFilter<Long>("FromID", Long.class);
    /**
     * Only retrieve campaigns with SendStartAt after this timestamp.
     * 
     */
    public final static DomainStatisticsFilter<Date> FROMTS = new DomainStatisticsFilter<Date>("FromTS", Date.class);
    /**
     * Only retrieve campaigns with FromType equal to specified value.
     * 
     */
    public final static DomainStatisticsFilter<Integer> FROMTYPE = new DomainStatisticsFilter<Integer>("FromType", Integer.class);
    /**
     * Only retrieve campaigns where isDeleted matches the specified value.
     * 
     */
    public final static DomainStatisticsFilter<Boolean> ISDELETED = new DomainStatisticsFilter<Boolean>("IsDeleted", Boolean.class);
    /**
     * Only retrieve campaigns which were started by the newsletter tool.
     * 
     */
    public final static DomainStatisticsFilter<Boolean> ISNEWSLETTERTOOL = new DomainStatisticsFilter<Boolean>("IsNewsletterTool", Boolean.class);
    /**
     * Only retrieve campaigns which were marked as starred.
     * 
     */
    public final static DomainStatisticsFilter<Boolean> ISSTARRED = new DomainStatisticsFilter<Boolean>("IsStarred", Boolean.class);
    /**
     * Only retrieve messages with status equal to specified value.
     * 
     */
    public final static DomainStatisticsFilter<Long> MESSAGESTATUSID = new DomainStatisticsFilter<Long>("MessageStatusID", Long.class);
    /**
     * Set FromTS and ToTS timestamps to beginning of indicated period and current timestamp, respectively.
     * 
     */
    public final static DomainStatisticsFilter<String> PERIOD = new DomainStatisticsFilter<String>("Period", String.class);
    /**
     * Only retrieve campaigns with SendStartAt timestamp less than the specified value.
     * 
     */
    public final static DomainStatisticsFilter<Date> TOTS = new DomainStatisticsFilter<Date>("ToTS", Date.class);

    private DomainStatisticsFilter(String name, Class<?> type) {
        super(name, type);
    }

}
