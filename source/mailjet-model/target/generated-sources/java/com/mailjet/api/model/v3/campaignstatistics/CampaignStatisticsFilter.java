
package com.mailjet.api.model.v3.campaignstatistics;

import java.util.Date;
import com.mailjet.api.client.model.MailJetResourceFilter;


/**
 * Class representing filter for  "campaignstatistics" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:20 CEST 2014.
 * 
 */
public final class CampaignStatisticsFilter<DataType >
    extends MailJetResourceFilter<CampaignStatistics, DataType>
{

    /**
     * 
     * 
     */
    public final static CampaignStatisticsFilter<Long> AXTESTING = new CampaignStatisticsFilter<Long>("AXTesting", Long.class);
    /**
     * Only retrieve campaigns that have blocked messages.
     * 
     */
    public final static CampaignStatisticsFilter<Boolean> BLOCKED = new CampaignStatisticsFilter<Boolean>("Blocked", Boolean.class);
    /**
     * Only retrieve campaigns that have bounced messages.
     * 
     */
    public final static CampaignStatisticsFilter<Boolean> BOUNCED = new CampaignStatisticsFilter<Boolean>("Bounced", Boolean.class);
    /**
     * Only retrieve campaignstatistics resources for which CampaignStatus equals the specified value.
     * 
     */
    public final static CampaignStatisticsFilter<Short> CAMPAIGNSTATUS = new CampaignStatisticsFilter<Short>("CampaignStatus", Short.class);
    /**
     * Only retrieve campaigns that have clicks registered for messages.
     * 
     */
    public final static CampaignStatisticsFilter<Boolean> CLICK = new CampaignStatisticsFilter<Boolean>("Click", Boolean.class);
    /**
     * Only retrieve campaignstatistics resources for which ContactsList equals the specified value.
     * 
     */
    public final static CampaignStatisticsFilter<Long> CONTACTSLIST = new CampaignStatisticsFilter<Long>("ContactsList", Long.class);
    /**
     * 
     * 
     */
    public final static CampaignStatisticsFilter<Date> FROMTS = new CampaignStatisticsFilter<Date>("FromTS", Date.class);
    /**
     * Only retrieve campaigns for which CampaignType matches the specified value.
     * 
     */
    public final static CampaignStatisticsFilter<Integer> FROMTYPE = new CampaignStatisticsFilter<Integer>("FromType", Integer.class);
    /**
     * 
     * 
     */
    public final static CampaignStatisticsFilter<Boolean> GROUPAX = new CampaignStatisticsFilter<Boolean>("GroupAX", Boolean.class);
    /**
     * If set, Only retrieve campaigns which are marked as deleted.
     * 
     */
    public final static CampaignStatisticsFilter<Boolean> ISDELETED = new CampaignStatisticsFilter<Boolean>("IsDeleted", Boolean.class);
    /**
     * If set, Only retrieve campaigns which are marked as starred.
     * 
     */
    public final static CampaignStatisticsFilter<Boolean> ISSTARRED = new CampaignStatisticsFilter<Boolean>("IsStarred", Boolean.class);
    /**
     * Only retrieve campaignstatistics resources for which LastActivityAt equals the specified value.
     * 
     */
    public final static CampaignStatisticsFilter<Date> LASTACTIVITYAT = new CampaignStatisticsFilter<Date>("LastActivityAt", Date.class);
    /**
     * Only retrieve campaigns that have LastActivityAt less than this value.
     * 
     */
    public final static CampaignStatisticsFilter<Date> MAXLASTACTIVITYAT = new CampaignStatisticsFilter<Date>("MaxLastActivityAt", Date.class);
    /**
     * Only retrieve campaigns that have LastActivityAt larger than this value.
     * 
     */
    public final static CampaignStatisticsFilter<Date> MINLASTACTIVITYAT = new CampaignStatisticsFilter<Date>("MinLastActivityAt", Date.class);
    /**
     * Only retrieve campaignstatistics resources for which NewsLetter equals the specified value.
     * 
     */
    public final static CampaignStatisticsFilter<Long> NEWSLETTER = new CampaignStatisticsFilter<Long>("NewsLetter", Long.class);
    /**
     * Only retrieve campaigns that have opens registered for messages.
     * 
     */
    public final static CampaignStatisticsFilter<Boolean> OPEN = new CampaignStatisticsFilter<Boolean>("Open", Boolean.class);
    /**
     * Only retrieve campaigns that have queued messages.
     * 
     */
    public final static CampaignStatisticsFilter<Boolean> QUEUED = new CampaignStatisticsFilter<Boolean>("Queued", Boolean.class);
    /**
     * 
     * 
     */
    public final static CampaignStatisticsFilter<Long> SEGMENTATION = new CampaignStatisticsFilter<Long>("Segmentation", Long.class);
    /**
     * Only retrieve campaignstatistics resources for which Sender equals the specified value.
     * 
     */
    public final static CampaignStatisticsFilter<Long> SENDER = new CampaignStatisticsFilter<Long>("Sender", Long.class);
    /**
     * Only retrieve campaigns that have sent messages.
     * 
     */
    public final static CampaignStatisticsFilter<Boolean> SENT = new CampaignStatisticsFilter<Boolean>("Sent", Boolean.class);
    /**
     * 
     * 
     */
    public final static CampaignStatisticsFilter<Boolean> SHOWEXTRADATA = new CampaignStatisticsFilter<Boolean>("ShowExtraData", Boolean.class);
    /**
     * Only retrieve campaigns that have spam complaints.
     * 
     */
    public final static CampaignStatisticsFilter<Boolean> SPAM = new CampaignStatisticsFilter<Boolean>("Spam", Boolean.class);
    /**
     * Only retrieve campaigns whose subject contains the specified value.
     * 
     */
    public final static CampaignStatisticsFilter<String> SUBJECT = new CampaignStatisticsFilter<String>("Subject", String.class);
    /**
     * 
     * 
     */
    public final static CampaignStatisticsFilter<Date> TOTS = new CampaignStatisticsFilter<Date>("ToTS", Date.class);
    /**
     * Only retrieve campaignstatistics resources for which Unsubscribed count is nonzero.
     * 
     */
    public final static CampaignStatisticsFilter<Boolean> UNSUBSCRIBED = new CampaignStatisticsFilter<Boolean>("Unsubscribed", Boolean.class);

    private CampaignStatisticsFilter(String name, Class<?> type) {
        super(name, type);
    }

}
