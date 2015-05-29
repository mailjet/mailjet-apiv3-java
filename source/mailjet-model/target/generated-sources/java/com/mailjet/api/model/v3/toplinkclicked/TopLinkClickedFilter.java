
package com.mailjet.api.model.v3.toplinkclicked;

import java.util.Date;
import com.mailjet.api.client.model.MailJetResourceFilter;


/**
 * Class representing filter for  "toplinkclicked" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
 * 
 */
public final class TopLinkClickedFilter<DataType >
    extends MailJetResourceFilter<TopLinkClicked, DataType>
{

    /**
     * 
     * 
     */
    public final static TopLinkClickedFilter<Boolean> ACTUALCLICKS = new TopLinkClickedFilter<Boolean>("ActualClicks", Boolean.class);
    /**
     * Unique numerical ID for this object.
     * 
     */
    public final static TopLinkClickedFilter<Long> CAMPAIGNID = new TopLinkClickedFilter<Long>("CampaignID", Long.class);
    /**
     * Only retrieve campaigns Status equals the specified value.
     * 
     */
    public final static TopLinkClickedFilter<Short> CAMPAIGNSTATUS = new TopLinkClickedFilter<Short>("CampaignStatus", Short.class);
    /**
     * Only retrieve messages to specified contact.
     * 
     */
    public final static TopLinkClickedFilter<Long> CONTACT = new TopLinkClickedFilter<Long>("Contact", Long.class);
    /**
     * Only retrieve campaigns sent to specified Contacts list.
     * 
     */
    public final static TopLinkClickedFilter<Long> CONTACTSLIST = new TopLinkClickedFilter<Long>("ContactsList", Long.class);
    /**
     * Only retrieve campaigns with given Custom Value.
     * 
     */
    public final static TopLinkClickedFilter<String> CUSTOMCAMPAIGN = new TopLinkClickedFilter<String>("CustomCampaign", String.class);
    /**
     * Only retrieve campaigns with given From header.
     * 
     */
    public final static TopLinkClickedFilter<String> FROM = new TopLinkClickedFilter<String>("From", String.class);
    /**
     * Only retrieve campaigns with given domain in From header.
     * 
     */
    public final static TopLinkClickedFilter<String> FROMDOMAIN = new TopLinkClickedFilter<String>("FromDomain", String.class);
    /**
     * Only retrieve campaigns with this sender ID.
     * 
     */
    public final static TopLinkClickedFilter<Long> FROMID = new TopLinkClickedFilter<Long>("FromID", Long.class);
    /**
     * Only retrieve campaigns with SendStartAt after this timestamp.
     * 
     */
    public final static TopLinkClickedFilter<Date> FROMTS = new TopLinkClickedFilter<Date>("FromTS", Date.class);
    /**
     * Only retrieve campaigns with FromType equal to specified value.
     * 
     */
    public final static TopLinkClickedFilter<Integer> FROMTYPE = new TopLinkClickedFilter<Integer>("FromType", Integer.class);
    /**
     * Only retrieve campaigns where isDeleted matches the specified value.
     * 
     */
    public final static TopLinkClickedFilter<Boolean> ISDELETED = new TopLinkClickedFilter<Boolean>("IsDeleted", Boolean.class);
    /**
     * Only retrieve campaigns which were started by the newsletter tool.
     * 
     */
    public final static TopLinkClickedFilter<Boolean> ISNEWSLETTERTOOL = new TopLinkClickedFilter<Boolean>("IsNewsletterTool", Boolean.class);
    /**
     * Only retrieve campaigns which were marked as starred.
     * 
     */
    public final static TopLinkClickedFilter<Boolean> ISSTARRED = new TopLinkClickedFilter<Boolean>("IsStarred", Boolean.class);
    /**
     * Only retrieve message corresponding to this ID.
     * 
     */
    public final static TopLinkClickedFilter<Long> MESSAGE = new TopLinkClickedFilter<Long>("Message", Long.class);
    /**
     * Set FromTS and ToTS timestamps to beginning of indicated period and current timestamp, respectively.
     * 
     */
    public final static TopLinkClickedFilter<String> PERIOD = new TopLinkClickedFilter<String>("Period", String.class);
    /**
     * Only retrieve campaigns with SendStartAt timestamp less than the specified value.
     * 
     */
    public final static TopLinkClickedFilter<Date> TOTS = new TopLinkClickedFilter<Date>("ToTS", Date.class);

    private TopLinkClickedFilter(String name, Class<?> type) {
        super(name, type);
    }

}
