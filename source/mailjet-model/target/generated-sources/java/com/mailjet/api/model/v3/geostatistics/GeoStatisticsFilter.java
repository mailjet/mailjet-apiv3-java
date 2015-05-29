
package com.mailjet.api.model.v3.geostatistics;

import java.util.Date;
import com.mailjet.api.client.model.MailJetResourceFilter;


/**
 * Class representing filter for  "geostatistics" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
 * 
 */
public final class GeoStatisticsFilter<DataType >
    extends MailJetResourceFilter<GeoStatistics, DataType>
{

    /**
     * Unique numerical ID for this object.
     * 
     */
    public final static GeoStatisticsFilter<Long> CAMPAIGNID = new GeoStatisticsFilter<Long>("CampaignID", Long.class);
    /**
     * Only retrieve campaigns with status equal to specified value.
     * 
     */
    public final static GeoStatisticsFilter<Short> CAMPAIGNSTATUS = new GeoStatisticsFilter<Short>("CampaignStatus", Short.class);
    /**
     * Only retrieve campaigns sent to specified Contacts list.
     * 
     */
    public final static GeoStatisticsFilter<Long> CONTACTSLIST = new GeoStatisticsFilter<Long>("ContactsList", Long.class);
    /**
     * Only retrieve campaigns with given Custom Value.
     * 
     */
    public final static GeoStatisticsFilter<String> CUSTOMCAMPAIGN = new GeoStatisticsFilter<String>("CustomCampaign", String.class);
    /**
     * Only retrieve campaigns with given From header.
     * 
     */
    public final static GeoStatisticsFilter<String> FROM = new GeoStatisticsFilter<String>("From", String.class);
    /**
     * Only retrieve campaigns with given domain in From header.
     * 
     */
    public final static GeoStatisticsFilter<String> FROMDOMAIN = new GeoStatisticsFilter<String>("FromDomain", String.class);
    /**
     * Only retrieve campaigns with this sender ID.
     * 
     */
    public final static GeoStatisticsFilter<Long> FROMID = new GeoStatisticsFilter<Long>("FromID", Long.class);
    /**
     * Only retrieve campaigns with SendStartAt after this timestamp.
     * 
     */
    public final static GeoStatisticsFilter<Date> FROMTS = new GeoStatisticsFilter<Date>("FromTS", Date.class);
    /**
     * Only retrieve campaigns with FromType equal to specified value.
     * 
     */
    public final static GeoStatisticsFilter<Integer> FROMTYPE = new GeoStatisticsFilter<Integer>("FromType", Integer.class);
    /**
     * Only retrieve campaigns where isDeleted matches the specified value.
     * 
     */
    public final static GeoStatisticsFilter<Boolean> ISDELETED = new GeoStatisticsFilter<Boolean>("IsDeleted", Boolean.class);
    /**
     * Only retrieve campaigns which were started by the newsletter tool.
     * 
     */
    public final static GeoStatisticsFilter<Boolean> ISNEWSLETTERTOOL = new GeoStatisticsFilter<Boolean>("IsNewsletterTool", Boolean.class);
    /**
     * Only retrieve campaigns which were marked as starred.
     * 
     */
    public final static GeoStatisticsFilter<Boolean> ISSTARRED = new GeoStatisticsFilter<Boolean>("IsStarred", Boolean.class);
    /**
     * Only retrieve messages with status equal to specified value.
     * 
     */
    public final static GeoStatisticsFilter<Long> MESSAGESTATUSID = new GeoStatisticsFilter<Long>("MessageStatusID", Long.class);
    /**
     * Set FromTS and ToTS timestamps to beginning of indicated period and current timestamp, respectively.
     * 
     */
    public final static GeoStatisticsFilter<String> PERIOD = new GeoStatisticsFilter<String>("Period", String.class);
    /**
     * Only retrieve campaigns with SendStartAt timestamp less than the specified value.
     * 
     */
    public final static GeoStatisticsFilter<Date> TOTS = new GeoStatisticsFilter<Date>("ToTS", Date.class);

    private GeoStatisticsFilter(String name, Class<?> type) {
        super(name, type);
    }

}
