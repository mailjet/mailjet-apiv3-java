
package com.mailjet.api.model.v3.bouncestatistics;

import java.util.Date;
import com.mailjet.api.client.model.MailJetKeyProperty;
import com.mailjet.api.client.model.MailJetResourceProperty;


/**
 * Class defining property constants for "bouncestatistics" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
 * 
 */
public final class BounceStatisticsProperty<DataType >
    extends MailJetResourceProperty<BounceStatistics, DataType>
{

    /**
     * Timestamp of bounce.
     * 
     */
    public final static BounceStatisticsProperty<Date> BOUNCEDAT = new BounceStatisticsProperty<Date>("BouncedAt", Date.class);
    /**
     * Reference to Campaign for which bounce occurred.
     * 
     */
    public final static BounceStatisticsProperty<Long> CAMPAIGNID = new BounceStatisticsProperty<Long>("CampaignID", Long.class);
    /**
     * Reference to Contact for which bounce occurred.
     * 
     */
    public final static BounceStatisticsProperty<Long> CONTACTID = new BounceStatisticsProperty<Long>("ContactID", Long.class);
    /**
     * ID of the Message that led to this bounce.
     * 
     */
    public final static BounceStatisticsProperty.Key<Long> ID = new BounceStatisticsProperty.Key<Long>("ID", Long.class);
    /**
     * Is contact blocked.
     * 
     */
    public final static BounceStatisticsProperty<Boolean> ISBLOCKED = new BounceStatisticsProperty<Boolean>("IsBlocked", Boolean.class);
    /**
     * Is this a permanent bounce.
     * 
     */
    public final static BounceStatisticsProperty<Boolean> ISSTATEPERMANENT = new BounceStatisticsProperty<Boolean>("IsStatePermanent", Boolean.class);
    /**
     * Current state of the message causing the bounce.
     * 
     */
    public final static BounceStatisticsProperty<Long> STATEID = new BounceStatisticsProperty<Long>("StateID", Long.class);

    private BounceStatisticsProperty(String name, Class<?> type) {
        super(name, type);
    }

    public static BounceStatisticsProperty<Object> ref(String name) {
        return new BounceStatisticsProperty<Object>(name, Object.class);
    }

    public final static class Key<KeyDataType >
        extends MailJetKeyProperty<BounceStatistics, KeyDataType>
    {


        private Key(String name, Class<?> type) {
            super(name, type);
        }

    }

}
