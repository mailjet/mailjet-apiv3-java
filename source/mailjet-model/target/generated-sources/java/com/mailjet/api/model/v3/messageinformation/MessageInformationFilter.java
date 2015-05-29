
package com.mailjet.api.model.v3.messageinformation;

import java.util.Date;
import com.mailjet.api.client.model.MailJetResourceFilter;


/**
 * Class representing filter for  "messageinformation" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
 * 
 */
public final class MessageInformationFilter<DataType >
    extends MailJetResourceFilter<MessageInformation, DataType>
{

    /**
     * Unique numerical ID for this object.
     * 
     */
    public final static MessageInformationFilter<Long> CAMPAIGNID = new MessageInformationFilter<Long>("CampaignID", Long.class);
    /**
     * Only retrieve campaigns with status equal to specified value.
     * 
     */
    public final static MessageInformationFilter<Short> CAMPAIGNSTATUS = new MessageInformationFilter<Short>("CampaignStatus", Short.class);
    /**
     * Only retrieve campaigns sent to specified Contacts list.
     * 
     */
    public final static MessageInformationFilter<Long> CONTACTSLIST = new MessageInformationFilter<Long>("ContactsList", Long.class);
    /**
     * Only retrieve campaigns with given Custom Value.
     * 
     */
    public final static MessageInformationFilter<String> CUSTOMCAMPAIGN = new MessageInformationFilter<String>("CustomCampaign", String.class);
    /**
     * Only retrieve campaigns with given From header.
     * 
     */
    public final static MessageInformationFilter<String> FROM = new MessageInformationFilter<String>("From", String.class);
    /**
     * Only retrieve campaigns with given domain in From header.
     * 
     */
    public final static MessageInformationFilter<String> FROMDOMAIN = new MessageInformationFilter<String>("FromDomain", String.class);
    /**
     * Only retrieve campaigns with this sender ID.
     * 
     */
    public final static MessageInformationFilter<Long> FROMID = new MessageInformationFilter<Long>("FromID", Long.class);
    /**
     * Only retrieve campaigns with SendStartAt after this timestamp.
     * 
     */
    public final static MessageInformationFilter<Date> FROMTS = new MessageInformationFilter<Date>("FromTS", Date.class);
    /**
     * Only retrieve campaigns with FromType equal to specified value.
     * 
     */
    public final static MessageInformationFilter<Integer> FROMTYPE = new MessageInformationFilter<Integer>("FromType", Integer.class);
    /**
     * Only retrieve campaigns where isDeleted matches the specified value.
     * 
     */
    public final static MessageInformationFilter<Boolean> ISDELETED = new MessageInformationFilter<Boolean>("IsDeleted", Boolean.class);
    /**
     * Only retrieve campaigns which were started by the newsletter tool.
     * 
     */
    public final static MessageInformationFilter<Boolean> ISNEWSLETTERTOOL = new MessageInformationFilter<Boolean>("IsNewsletterTool", Boolean.class);
    /**
     * Only retrieve campaigns which were marked as starred.
     * 
     */
    public final static MessageInformationFilter<Boolean> ISSTARRED = new MessageInformationFilter<Boolean>("IsStarred", Boolean.class);
    /**
     * Only retrieve messages with status equal to specified value.
     * 
     */
    public final static MessageInformationFilter<Long> MESSAGESTATUSID = new MessageInformationFilter<Long>("MessageStatusID", Long.class);
    /**
     * Set FromTS and ToTS timestamps to beginning of indicated period and current timestamp, respectively.
     * 
     */
    public final static MessageInformationFilter<String> PERIOD = new MessageInformationFilter<String>("Period", String.class);
    /**
     * Only retrieve campaigns with SendStartAt timestamp less than the specified value.
     * 
     */
    public final static MessageInformationFilter<Date> TOTS = new MessageInformationFilter<Date>("ToTS", Date.class);

    private MessageInformationFilter(String name, Class<?> type) {
        super(name, type);
    }

}
