
package com.mailjet.api.model.v3.campaign;

import java.math.BigDecimal;
import java.util.Date;
import com.mailjet.api.client.model.MailJetKeyProperty;
import com.mailjet.api.client.model.MailJetResourceProperty;


/**
 * Class defining property constants for "campaign" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:20 CEST 2014.
 * 
 */
public final class CampaignProperty<DataType >
    extends MailJetResourceProperty<Campaign, DataType>
{

    /**
     * Type of campaign (transactional, campaign).
     * 
     */
    public final static CampaignProperty<Integer> CAMPAIGNTYPE = new CampaignProperty<Integer>("CampaignType", Integer.class);
    /**
     * Number of messages for which click tracking is requested.
     * 
     */
    public final static CampaignProperty<Long> CLICKTRACKED = new CampaignProperty<Long>("ClickTracked", Long.class);
    /**
     * Timestamp when object was created in database.
     * 
     */
    public final static CampaignProperty<Date> CREATEDAT = new CampaignProperty<Date>("CreatedAt", Date.class);
    /**
     * Custom tag for this campaign, must be unique.
     * 
     */
    public final static CampaignProperty.Key<String> CUSTOMVALUE = new CampaignProperty.Key<String>("CustomValue", String.class);
    /**
     * Unique numerical ID for this object.
     * 
     */
    public final static CampaignProperty<Long> FIRSTMESSAGEID = new CampaignProperty<Long>("FirstMessageID", Long.class);
    /**
     * Sender of the campaign.
     * 
     */
    public final static CampaignProperty<Long> FROMID = new CampaignProperty<Long>("FromID", Long.class);
    /**
     * Sender email address for the campaign.
     * 
     */
    public final static CampaignProperty<String> FROMEMAIL = new CampaignProperty<String>("FromEmail", String.class);
    /**
     * Sender name for the campaign.
     * 
     */
    public final static CampaignProperty<String> FROMNAME = new CampaignProperty<String>("FromName", String.class);
    /**
     * Number of messages containing HTML in this campaign.
     * 
     */
    public final static CampaignProperty<Long> HASHTMLCOUNT = new CampaignProperty<Long>("HasHtmlCount", Long.class);
    /**
     * Number of messages containing HTML in this campaign.
     * 
     */
    public final static CampaignProperty<Long> HASTXTCOUNT = new CampaignProperty<Long>("HasTxtCount", Long.class);
    /**
     * Unique numerical ID for this object.
     * 
     */
    public final static CampaignProperty.Key<Long> ID = new CampaignProperty.Key<Long>("ID", Long.class);
    /**
     * Has the campaign been deleted by the user.
     * 
     */
    public final static CampaignProperty<Boolean> ISDELETED = new CampaignProperty<Boolean>("IsDeleted", Boolean.class);
    /**
     * Is this campaign marked as starred?.
     * 
     */
    public final static CampaignProperty<Boolean> ISSTARRED = new CampaignProperty<Boolean>("IsStarred", Boolean.class);
    /**
     * Reference to contactslist to which campaign is sent.
     * 
     */
    public final static CampaignProperty<Long> LISTID = new CampaignProperty<Long>("ListID", Long.class);
    /**
     * Newletter ID for which the campaign was created.
     * 
     */
    public final static CampaignProperty<Long> NEWSLETTERID = new CampaignProperty<Long>("NewsLetterID", Long.class);
    /**
     * Number of messages for which open tracking is requested.
     * 
     */
    public final static CampaignProperty<Long> OPENTRACKED = new CampaignProperty<Long>("OpenTracked", Long.class);
    /**
     * 
     * 
     */
    public final static CampaignProperty<Long> SEGMENTATIONID = new CampaignProperty<Long>("SegmentationID", Long.class);
    /**
     * Timestamp indicating when last message in this campaign was sent.
     * 
     */
    public final static CampaignProperty<Date> SENDENDAT = new CampaignProperty<Date>("SendEndAt", Date.class);
    /**
     * Timestamp indicating when first message in this campaign was sent.
     * 
     */
    public final static CampaignProperty<Date> SENDSTARTAT = new CampaignProperty<Date>("SendStartAt", Date.class);
    /**
     * Spam Assassin score for this campaign.
     * 
     */
    public final static CampaignProperty<BigDecimal> SPAMASSSCORE = new CampaignProperty<BigDecimal>("SpamassScore", BigDecimal.class);
    /**
     * Status of this campaign.
     * 
     */
    public final static CampaignProperty<Short> STATUS = new CampaignProperty<Short>("Status", Short.class);
    /**
     * Campaign subject.
     * 
     */
    public final static CampaignProperty<String> SUBJECT = new CampaignProperty<String>("Subject", String.class);
    /**
     * Number of messages for which unsubscribe tracking is requested.
     * 
     */
    public final static CampaignProperty<Long> UNSUBSCRIBETRACKEDCOUNT = new CampaignProperty<Long>("UnsubscribeTrackedCount", Long.class);

    private CampaignProperty(String name, Class<?> type) {
        super(name, type);
    }

    public static CampaignProperty<Object> ref(String name) {
        return new CampaignProperty<Object>(name, Object.class);
    }

    public final static class Key<KeyDataType >
        extends MailJetKeyProperty<Campaign, KeyDataType>
    {


        private Key(String name, Class<?> type) {
            super(name, type);
        }

    }

}
