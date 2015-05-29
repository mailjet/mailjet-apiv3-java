
package com.mailjet.api.model.v3.campaignstatistics;

import java.util.Date;
import com.mailjet.api.client.model.MailJetKeyProperty;
import com.mailjet.api.client.model.MailJetResourceProperty;


/**
 * Class defining property constants for "campaignstatistics" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
 * 
 */
public final class CampaignStatisticsProperty<DataType >
    extends MailJetResourceProperty<CampaignStatistics, DataType>
{

    /**
     * 
     * 
     */
    public final static CampaignStatisticsProperty<Long> AXTESTINGID = new CampaignStatisticsProperty<Long>("AXTestingID", Long.class);
    /**
     * Number of blocked messages.
     * 
     */
    public final static CampaignStatisticsProperty<Long> BLOCKEDCOUNT = new CampaignStatisticsProperty<Long>("BlockedCount", Long.class);
    /**
     * Number of bounced messages.
     * 
     */
    public final static CampaignStatisticsProperty<Long> BOUNCEDCOUNT = new CampaignStatisticsProperty<Long>("BouncedCount", Long.class);
    /**
     * Reference to campaign.
     * 
     */
    public final static CampaignStatisticsProperty<Long> CAMPAIGNID = new CampaignStatisticsProperty<Long>("CampaignID", Long.class);
    /**
     * 
     * 
     */
    public final static CampaignStatisticsProperty<Boolean> CAMPAIGNISSTARRED = new CampaignStatisticsProperty<Boolean>("CampaignIsStarred", Boolean.class);
    /**
     * 
     * 
     */
    public final static CampaignStatisticsProperty<Date> CAMPAIGNSENDSTARTAT = new CampaignStatisticsProperty<Date>("CampaignSendStartAt", Date.class);
    /**
     * 
     * 
     */
    public final static CampaignStatisticsProperty<String> CAMPAIGNSUBJECT = new CampaignStatisticsProperty<String>("CampaignSubject", String.class);
    /**
     * Number of registered clicks.
     * 
     */
    public final static CampaignStatisticsProperty<Long> CLICKEDCOUNT = new CampaignStatisticsProperty<Long>("ClickedCount", Long.class);
    /**
     * 
     * 
     */
    public final static CampaignStatisticsProperty<String> CONTACTLISTNAME = new CampaignStatisticsProperty<String>("ContactListName", String.class);
    /**
     * Number of messages delivered to their destination.
     * 
     */
    public final static CampaignStatisticsProperty<Long> DELIVEREDCOUNT = new CampaignStatisticsProperty<Long>("DeliveredCount", Long.class);
    /**
     * Timestamp of last registered activity for this Campaign.
     * 
     */
    public final static CampaignStatisticsProperty<Date> LASTACTIVITYAT = new CampaignStatisticsProperty<Date>("LastActivityAt", Date.class);
    /**
     * Only retrieve campaign statistics for the given NewsLetter ID.
     * 
     */
    public final static CampaignStatisticsProperty<Long> NEWSLETTERID = new CampaignStatisticsProperty<Long>("NewsLetterID", Long.class);
    /**
     * Number of message open registrations.
     * 
     */
    public final static CampaignStatisticsProperty<Long> OPENEDCOUNT = new CampaignStatisticsProperty<Long>("OpenedCount", Long.class);
    /**
     * Total number of messages processed by Mailjet.
     * 
     */
    public final static CampaignStatisticsProperty<Long> PROCESSEDCOUNT = new CampaignStatisticsProperty<Long>("ProcessedCount", Long.class);
    /**
     * Number of messages waiting in send queue.
     * 
     */
    public final static CampaignStatisticsProperty<Long> QUEUEDCOUNT = new CampaignStatisticsProperty<Long>("QueuedCount", Long.class);
    /**
     * 
     * 
     */
    public final static CampaignStatisticsProperty<String> SEGMENTNAME = new CampaignStatisticsProperty<String>("SegmentName", String.class);
    /**
     * Number of spam complaints.
     * 
     */
    public final static CampaignStatisticsProperty<Long> SPAMCOMPLAINTCOUNT = new CampaignStatisticsProperty<Long>("SpamComplaintCount", Long.class);
    /**
     * 
     * 
     */
    public final static CampaignStatisticsProperty<Long> UNSUBSCRIBEDCOUNT = new CampaignStatisticsProperty<Long>("UnsubscribedCount", Long.class);

    private CampaignStatisticsProperty(String name, Class<?> type) {
        super(name, type);
    }

    public static CampaignStatisticsProperty<Object> ref(String name) {
        return new CampaignStatisticsProperty<Object>(name, Object.class);
    }

    public final static class Key<KeyDataType >
        extends MailJetKeyProperty<CampaignStatistics, KeyDataType>
    {


        private Key(String name, Class<?> type) {
            super(name, type);
        }

    }

}
