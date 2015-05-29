
package com.mailjet.api.model.v3.messagestatistics;

import java.util.Date;
import com.mailjet.api.client.model.MailJetResourceFilter;


/**
 * Class representing filter for  "messagestatistics" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
 * 
 */
public final class MessageStatisticsFilter<DataType >
    extends MailJetResourceFilter<MessageStatistics, DataType>
{

    /**
     * Unique numerical ID for this object.
     * 
     */
    public final static MessageStatisticsFilter<Long> CAMPAIGNID = new MessageStatisticsFilter<Long>("CampaignID", Long.class);
    /**
     * Only retrieve campaigns with status equal to specified value.
     * 
     */
    public final static MessageStatisticsFilter<Short> CAMPAIGNSTATUS = new MessageStatisticsFilter<Short>("CampaignStatus", Short.class);
    /**
     * Only retrieve message statistics for this contact email address.
     * 
     */
    public final static MessageStatisticsFilter<String> CONTACTEMAIL = new MessageStatisticsFilter<String>("ContactEmail", String.class);
    /**
     * Unique numerical ID for this object.
     * 
     */
    public final static MessageStatisticsFilter<Long> CONTACTID = new MessageStatisticsFilter<Long>("ContactID", Long.class);
    /**
     * 
     * 
     */
    public final static MessageStatisticsFilter<Long> CONTACTLISTID = new MessageStatisticsFilter<Long>("ContactListID", Long.class);
    /**
     * Only retrieve campaigns with given Custom Value.
     * 
     */
    public final static MessageStatisticsFilter<String> CUSTOMCAMPAIGN = new MessageStatisticsFilter<String>("CustomCampaign", String.class);
    /**
     * Only retrieve campaigns with given From header.
     * 
     */
    public final static MessageStatisticsFilter<String> FROM = new MessageStatisticsFilter<String>("From", String.class);
    /**
     * Only retrieve campaigns with given domain in From header.
     * 
     */
    public final static MessageStatisticsFilter<String> FROMDOMAIN = new MessageStatisticsFilter<String>("FromDomain", String.class);
    /**
     * Only retrieve campaigns with this sender ID.
     * 
     */
    public final static MessageStatisticsFilter<Long> FROMID = new MessageStatisticsFilter<Long>("FromID", Long.class);
    /**
     * Only retrieve campaigns with SendStartAt after this timestamp.
     * 
     */
    public final static MessageStatisticsFilter<Date> FROMTS = new MessageStatisticsFilter<Date>("FromTS", Date.class);
    /**
     * Only retrieve campaigns with FromType equal to specified value.
     * 
     */
    public final static MessageStatisticsFilter<Integer> FROMTYPE = new MessageStatisticsFilter<Integer>("FromType", Integer.class);
    /**
     * Only retrieve campaigns where isDeleted matches the specified value.
     * 
     */
    public final static MessageStatisticsFilter<Boolean> ISDELETED = new MessageStatisticsFilter<Boolean>("IsDeleted", Boolean.class);
    /**
     * Only retrieve campaigns which were started by the newsletter tool.
     * 
     */
    public final static MessageStatisticsFilter<Boolean> ISNEWSLETTERTOOL = new MessageStatisticsFilter<Boolean>("IsNewsletterTool", Boolean.class);
    /**
     * Only retrieve campaigns which were marked as starred.
     * 
     */
    public final static MessageStatisticsFilter<Boolean> ISSTARRED = new MessageStatisticsFilter<Boolean>("IsStarred", Boolean.class);
    /**
     * Only retrieve messages with status equal to specified value.
     * 
     */
    public final static MessageStatisticsFilter<Long> MESSAGESTATUSID = new MessageStatisticsFilter<Long>("MessageStatusID", Long.class);
    /**
     * Set FromTS and ToTS timestamps to beginning of indicated period and current timestamp, respectively.
     * 
     */
    public final static MessageStatisticsFilter<String> PERIOD = new MessageStatisticsFilter<String>("Period", String.class);
    /**
     * Only retrieve campaigns with SendStartAt timestamp less than the specified value.
     * 
     */
    public final static MessageStatisticsFilter<Date> TOTS = new MessageStatisticsFilter<Date>("ToTS", Date.class);

    private MessageStatisticsFilter(String name, Class<?> type) {
        super(name, type);
    }

}
