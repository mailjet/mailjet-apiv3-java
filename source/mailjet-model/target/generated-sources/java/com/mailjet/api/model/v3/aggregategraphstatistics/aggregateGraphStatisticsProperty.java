
package com.mailjet.api.model.v3.aggregategraphstatistics;

import java.math.BigDecimal;
import com.mailjet.api.client.model.MailJetKeyProperty;
import com.mailjet.api.client.model.MailJetResourceProperty;


/**
 * Class defining property constants for "aggregategraphstatistics" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
 * 
 */
public final class aggregateGraphStatisticsProperty<DataType >
    extends MailJetResourceProperty<aggregateGraphStatistics, DataType>
{

    /**
     * 
     * 
     */
    public final static aggregateGraphStatisticsProperty<BigDecimal> BLOCKEDCOUNT = new aggregateGraphStatisticsProperty<BigDecimal>("BlockedCount", BigDecimal.class);
    /**
     * 
     * 
     */
    public final static aggregateGraphStatisticsProperty<BigDecimal> BLOCKEDSTDDEV = new aggregateGraphStatisticsProperty<BigDecimal>("BlockedStdDev", BigDecimal.class);
    /**
     * 
     * 
     */
    public final static aggregateGraphStatisticsProperty<BigDecimal> BOUNCEDCOUNT = new aggregateGraphStatisticsProperty<BigDecimal>("BouncedCount", BigDecimal.class);
    /**
     * 
     * 
     */
    public final static aggregateGraphStatisticsProperty<BigDecimal> BOUNCEDSTDDEV = new aggregateGraphStatisticsProperty<BigDecimal>("BouncedStdDev", BigDecimal.class);
    /**
     * 
     * 
     */
    public final static aggregateGraphStatisticsProperty<Integer> CAMPAIGNAGGREGATEID = new aggregateGraphStatisticsProperty<Integer>("CampaignAggregateID", Integer.class);
    /**
     * 
     * 
     */
    public final static aggregateGraphStatisticsProperty<BigDecimal> CLICKEDCOUNT = new aggregateGraphStatisticsProperty<BigDecimal>("ClickedCount", BigDecimal.class);
    /**
     * 
     * 
     */
    public final static aggregateGraphStatisticsProperty<BigDecimal> CLICKEDSTDDEV = new aggregateGraphStatisticsProperty<BigDecimal>("ClickedStdDev", BigDecimal.class);
    /**
     * 
     * 
     */
    public final static aggregateGraphStatisticsProperty<BigDecimal> OPENEDCOUNT = new aggregateGraphStatisticsProperty<BigDecimal>("OpenedCount", BigDecimal.class);
    /**
     * 
     * 
     */
    public final static aggregateGraphStatisticsProperty<BigDecimal> OPENEDSTDDEV = new aggregateGraphStatisticsProperty<BigDecimal>("OpenedStdDev", BigDecimal.class);
    /**
     * 
     * 
     */
    public final static aggregateGraphStatisticsProperty<Integer> REFTIMESTAMP = new aggregateGraphStatisticsProperty<Integer>("RefTimestamp", Integer.class);
    /**
     * 
     * 
     */
    public final static aggregateGraphStatisticsProperty<BigDecimal> SENTCOUNT = new aggregateGraphStatisticsProperty<BigDecimal>("SentCount", BigDecimal.class);
    /**
     * 
     * 
     */
    public final static aggregateGraphStatisticsProperty<BigDecimal> SENTSTDDEV = new aggregateGraphStatisticsProperty<BigDecimal>("SentStdDev", BigDecimal.class);
    /**
     * 
     * 
     */
    public final static aggregateGraphStatisticsProperty<BigDecimal> SPAMCOMPLAINTCOUNT = new aggregateGraphStatisticsProperty<BigDecimal>("SpamComplaintCount", BigDecimal.class);
    /**
     * 
     * 
     */
    public final static aggregateGraphStatisticsProperty<BigDecimal> SPAMCOMPLAINTSTDDEV = new aggregateGraphStatisticsProperty<BigDecimal>("SpamcomplaintStdDev", BigDecimal.class);
    /**
     * 
     * 
     */
    public final static aggregateGraphStatisticsProperty<BigDecimal> UNSUBSCRIBEDCOUNT = new aggregateGraphStatisticsProperty<BigDecimal>("UnsubscribedCount", BigDecimal.class);
    /**
     * 
     * 
     */
    public final static aggregateGraphStatisticsProperty<BigDecimal> UNSUBSCRIBEDSTDDEV = new aggregateGraphStatisticsProperty<BigDecimal>("UnsubscribedStdDev", BigDecimal.class);

    private aggregateGraphStatisticsProperty(String name, Class<?> type) {
        super(name, type);
    }

    public static aggregateGraphStatisticsProperty<Object> ref(String name) {
        return new aggregateGraphStatisticsProperty<Object>(name, Object.class);
    }

    public final static class Key<KeyDataType >
        extends MailJetKeyProperty<aggregateGraphStatistics, KeyDataType>
    {


        private Key(String name, Class<?> type) {
            super(name, type);
        }

    }

}
