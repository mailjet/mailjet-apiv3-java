
package com.mailjet.api.model.v3.openstatistics;

import java.math.BigDecimal;
import com.mailjet.api.client.model.MailJetKeyProperty;
import com.mailjet.api.client.model.MailJetResourceProperty;


/**
 * Class defining property constants for "openstatistics" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
 * 
 */
public final class OpenStatisticsProperty<DataType >
    extends MailJetResourceProperty<OpenStatistics, DataType>
{

    /**
     * Number of message open registrations.
     * 
     */
    public final static OpenStatisticsProperty<Long> OPENEDCOUNT = new OpenStatisticsProperty<Long>("OpenedCount", Long.class);
    /**
     * Delay between delivery and open (in seconds).
     * 
     */
    public final static OpenStatisticsProperty<BigDecimal> OPENEDDELAY = new OpenStatisticsProperty<BigDecimal>("OpenedDelay", BigDecimal.class);
    /**
     * Total number of messages processed by Mailjet.
     * 
     */
    public final static OpenStatisticsProperty<Long> PROCESSEDCOUNT = new OpenStatisticsProperty<Long>("ProcessedCount", Long.class);

    private OpenStatisticsProperty(String name, Class<?> type) {
        super(name, type);
    }

    public static OpenStatisticsProperty<Object> ref(String name) {
        return new OpenStatisticsProperty<Object>(name, Object.class);
    }

    public final static class Key<KeyDataType >
        extends MailJetKeyProperty<OpenStatistics, KeyDataType>
    {


        private Key(String name, Class<?> type) {
            super(name, type);
        }

    }

}
