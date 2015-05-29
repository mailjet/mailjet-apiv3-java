
package com.mailjet.api.model.v3.openinformation;

import java.util.Date;
import com.mailjet.api.client.model.MailJetResourceFilter;


/**
 * Class representing filter for  "openinformation" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
 * 
 */
public final class OpenInformationFilter<DataType >
    extends MailJetResourceFilter<OpenInformation, DataType>
{

    /**
     * Unique numerical ID for this object.
     * 
     */
    public final static OpenInformationFilter<Long> CAMPAIGNID = new OpenInformationFilter<Long>("CampaignID", Long.class);
    /**
     * Only retrieve campaigns with status equal to specified value.
     * 
     */
    public final static OpenInformationFilter<Short> CAMPAIGNSTATUS = new OpenInformationFilter<Short>("CampaignStatus", Short.class);
    /**
     * Only retrieve campaigns sent to specified Contacts list.
     * 
     */
    public final static OpenInformationFilter<Long> CONTACTSLIST = new OpenInformationFilter<Long>("ContactsList", Long.class);
    /**
     * Only retrieve campaigns with given Custom Value.
     * 
     */
    public final static OpenInformationFilter<String> CUSTOMCAMPAIGN = new OpenInformationFilter<String>("CustomCampaign", String.class);
    /**
     * Only retrieve campaigns with given From header.
     * 
     */
    public final static OpenInformationFilter<String> FROM = new OpenInformationFilter<String>("From", String.class);
    /**
     * Only retrieve campaigns with given domain in From header.
     * 
     */
    public final static OpenInformationFilter<String> FROMDOMAIN = new OpenInformationFilter<String>("FromDomain", String.class);
    /**
     * Only retrieve campaigns with this sender ID.
     * 
     */
    public final static OpenInformationFilter<Long> FROMID = new OpenInformationFilter<Long>("FromID", Long.class);
    /**
     * Only retrieve campaigns with SendStartAt after this timestamp.
     * 
     */
    public final static OpenInformationFilter<Date> FROMTS = new OpenInformationFilter<Date>("FromTS", Date.class);
    /**
     * Only retrieve campaigns with FromType equal to specified value.
     * 
     */
    public final static OpenInformationFilter<Integer> FROMTYPE = new OpenInformationFilter<Integer>("FromType", Integer.class);
    /**
     * Only retrieve campaigns where isDeleted matches the specified value.
     * 
     */
    public final static OpenInformationFilter<Boolean> ISDELETED = new OpenInformationFilter<Boolean>("IsDeleted", Boolean.class);
    /**
     * Only retrieve campaigns which were started by the newsletter tool.
     * 
     */
    public final static OpenInformationFilter<Boolean> ISNEWSLETTERTOOL = new OpenInformationFilter<Boolean>("IsNewsletterTool", Boolean.class);
    /**
     * Only retrieve campaigns which were marked as starred.
     * 
     */
    public final static OpenInformationFilter<Boolean> ISSTARRED = new OpenInformationFilter<Boolean>("IsStarred", Boolean.class);
    /**
     * Only retrieve messages with status equal to specified value.
     * 
     */
    public final static OpenInformationFilter<Long> MESSAGESTATUSID = new OpenInformationFilter<Long>("MessageStatusID", Long.class);
    /**
     * Set FromTS and ToTS timestamps to beginning of indicated period and current timestamp, respectively.
     * 
     */
    public final static OpenInformationFilter<String> PERIOD = new OpenInformationFilter<String>("Period", String.class);
    /**
     * Only retrieve campaigns with SendStartAt timestamp less than the specified value.
     * 
     */
    public final static OpenInformationFilter<Date> TOTS = new OpenInformationFilter<Date>("ToTS", Date.class);

    private OpenInformationFilter(String name, Class<?> type) {
        super(name, type);
    }

}
