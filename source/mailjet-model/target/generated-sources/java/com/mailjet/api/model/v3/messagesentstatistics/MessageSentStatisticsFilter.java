
package com.mailjet.api.model.v3.messagesentstatistics;

import java.util.Date;
import com.mailjet.api.client.model.MailJetResourceFilter;


/**
 * Class representing filter for  "messagesentstatistics" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
 * 
 */
public final class MessageSentStatisticsFilter<DataType >
    extends MailJetResourceFilter<MessageSentStatistics, DataType>
{

    /**
     * Retrieve all messages. Normally, only the first message of each campaign is retrieved.
     * 
     */
    public final static MessageSentStatisticsFilter<Boolean> ALLMESSAGES = new MessageSentStatisticsFilter<Boolean>("AllMessages", Boolean.class);
    /**
     * Unique numerical ID for this object.
     * 
     */
    public final static MessageSentStatisticsFilter<Long> CAMPAIGNID = new MessageSentStatisticsFilter<Long>("CampaignID", Long.class);
    /**
     * Only retrieve campaigns with Status equal to specified value.
     * 
     */
    public final static MessageSentStatisticsFilter<Short> CAMPAIGNSTATUS = new MessageSentStatisticsFilter<Short>("CampaignStatus", Short.class);
    /**
     * Only retrieve messagesentstatistics resources for which Contact equals the specified value.
     * 
     */
    public final static MessageSentStatisticsFilter<Long> CONTACT = new MessageSentStatisticsFilter<Long>("Contact", Long.class);
    /**
     * Only retrieve campaigns sent to specified Contacts list.
     * 
     */
    public final static MessageSentStatisticsFilter<Long> CONTACTSLIST = new MessageSentStatisticsFilter<Long>("ContactsList", Long.class);
    /**
     * Only retrieve campaigns with given Custom Value.
     * 
     */
    public final static MessageSentStatisticsFilter<String> CUSTOMCAMPAIGN = new MessageSentStatisticsFilter<String>("CustomCampaign", String.class);
    /**
     * 
     * 
     */
    public final static MessageSentStatisticsFilter<String> CUSTOMID = new MessageSentStatisticsFilter<String>("CustomID", String.class);
    /**
     * Only retrieve campaigns with given From header.
     * 
     */
    public final static MessageSentStatisticsFilter<String> FROM = new MessageSentStatisticsFilter<String>("From", String.class);
    /**
     * Only retrieve campaigns with given domain in From header.
     * 
     */
    public final static MessageSentStatisticsFilter<String> FROMDOMAIN = new MessageSentStatisticsFilter<String>("FromDomain", String.class);
    /**
     * Only retrieve campaigns with this sender ID.
     * 
     */
    public final static MessageSentStatisticsFilter<Long> FROMID = new MessageSentStatisticsFilter<Long>("FromID", Long.class);
    /**
     * Only retrieve campaigns with SendStartAt after this timestamp.
     * 
     */
    public final static MessageSentStatisticsFilter<Date> FROMTS = new MessageSentStatisticsFilter<Date>("FromTS", Date.class);
    /**
     * Only retrieve campaigns with FromType equal to specified value.
     * 
     */
    public final static MessageSentStatisticsFilter<Integer> FROMTYPE = new MessageSentStatisticsFilter<Integer>("FromType", Integer.class);
    /**
     * Only retrieve campaigns where isDeleted matches the specified value.
     * 
     */
    public final static MessageSentStatisticsFilter<Boolean> ISDELETED = new MessageSentStatisticsFilter<Boolean>("IsDeleted", Boolean.class);
    /**
     * Only retrieve campaigns which were started by the newsletter tool.
     * 
     */
    public final static MessageSentStatisticsFilter<Boolean> ISNEWSLETTERTOOL = new MessageSentStatisticsFilter<Boolean>("IsNewsletterTool", Boolean.class);
    /**
     * Only retrieve campaigns which were marked as starred.
     * 
     */
    public final static MessageSentStatisticsFilter<Boolean> ISSTARRED = new MessageSentStatisticsFilter<Boolean>("IsStarred", Boolean.class);
    /**
     * Only retrieve messages with Status equal to specified value.
     * 
     */
    public final static MessageSentStatisticsFilter<String> MESSAGESTATUS = new MessageSentStatisticsFilter<String>("MessageStatus", String.class);
    /**
     * Set FromTS and ToTS timestamps to beginning of indicated period and current timestamp, respectively.
     * 
     */
    public final static MessageSentStatisticsFilter<String> PERIOD = new MessageSentStatisticsFilter<String>("Period", String.class);
    /**
     * 
     * 
     */
    public final static MessageSentStatisticsFilter<Boolean> RAWDATA = new MessageSentStatisticsFilter<Boolean>("RawData", Boolean.class);
    /**
     * 
     * 
     */
    public final static MessageSentStatisticsFilter<Boolean> SHOWEXTRADATA = new MessageSentStatisticsFilter<Boolean>("ShowExtraData", Boolean.class);
    /**
     * Only retrieve campaigns with SendStartAt timestamp less than the specified value.
     * 
     */
    public final static MessageSentStatisticsFilter<Date> TOTS = new MessageSentStatisticsFilter<Date>("ToTS", Date.class);

    private MessageSentStatisticsFilter(String name, Class<?> type) {
        super(name, type);
    }

}
