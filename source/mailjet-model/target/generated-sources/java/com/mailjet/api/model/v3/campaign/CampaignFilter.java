
package com.mailjet.api.model.v3.campaign;

import java.util.Date;
import com.mailjet.api.client.model.MailJetResourceFilter;


/**
 * Class representing filter for  "campaign" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
 * 
 */
public final class CampaignFilter<DataType >
    extends MailJetResourceFilter<Campaign, DataType>
{

    /**
     * Unique numerical ID for this object.
     * 
     */
    public final static CampaignFilter<Long> CAMPAIGNID = new CampaignFilter<Long>("CampaignID", Long.class);
    /**
     * Only retrieve campaign resources for which Status equals the specified value.
     * 
     */
    public final static CampaignFilter<Short> CAMPAIGNSTATUS = new CampaignFilter<Short>("CampaignStatus", Short.class);
    /**
     * Only retrieve campaigns for this contact list.
     * 
     */
    public final static CampaignFilter<Long> CONTACTSLIST = new CampaignFilter<Long>("ContactsList", Long.class);
    /**
     * Only retrieve campaigns with this custom campaign value.
     * 
     */
    public final static CampaignFilter<String> CUSTOMCAMPAIGN = new CampaignFilter<String>("CustomCampaign", String.class);
    /**
     * Only retrieve campaign resources for which From equals the specified value.
     * 
     */
    public final static CampaignFilter<String> FROM = new CampaignFilter<String>("From", String.class);
    /**
     * Only retrieve campaigns with this from domain.
     * 
     */
    public final static CampaignFilter<String> FROMDOMAIN = new CampaignFilter<String>("FromDomain", String.class);
    /**
     * Only retrieve campaigns with this sender ID.
     * 
     */
    public final static CampaignFilter<Long> FROMID = new CampaignFilter<Long>("FromID", Long.class);
    /**
     * Only retrieve campaigns with SendStartAt after this timestamp.
     * 
     */
    public final static CampaignFilter<Date> FROMTS = new CampaignFilter<Date>("FromTS", Date.class);
    /**
     * Only retrieve campaigns with FromType equal to specified value.
     * 
     */
    public final static CampaignFilter<Integer> FROMTYPE = new CampaignFilter<Integer>("FromType", Integer.class);
    /**
     * Only retrieve campaign resources for which IsDeleted equals the specified value.
     * 
     */
    public final static CampaignFilter<Boolean> ISDELETED = new CampaignFilter<Boolean>("IsDeleted", Boolean.class);
    /**
     * Only retrieve campaigns which were started by the newsletter tool.
     * 
     */
    public final static CampaignFilter<Boolean> ISNEWSLETTERTOOL = new CampaignFilter<Boolean>("IsNewsletterTool", Boolean.class);
    /**
     * Only retrieve campaigns which were marked as starred.
     * 
     */
    public final static CampaignFilter<Boolean> ISSTARRED = new CampaignFilter<Boolean>("IsStarred", Boolean.class);
    /**
     * Set FromTS and ToTS timestamps to beginning of indicated period and current timestamp, respectively.
     * 
     */
    public final static CampaignFilter<String> PERIOD = new CampaignFilter<String>("Period", String.class);
    /**
     * Only retrieve campaigns with SendStartAt timestamp less than the specified value.
     * 
     */
    public final static CampaignFilter<Date> TOTS = new CampaignFilter<Date>("ToTS", Date.class);

    private CampaignFilter(String name, Class<?> type) {
        super(name, type);
    }

}
