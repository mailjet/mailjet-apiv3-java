
package com.mailjet.api.model.v3.clickstatistics;

import java.util.Date;
import com.mailjet.api.client.model.MailJetKeyProperty;
import com.mailjet.api.client.model.MailJetResourceProperty;


/**
 * Class defining property constants for "clickstatistics" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:21 CEST 2014.
 * 
 */
public final class ClickStatisticsProperty<DataType >
    extends MailJetResourceProperty<ClickStatistics, DataType>
{

    /**
     * Timestamp of registration of click.
     * 
     */
    public final static ClickStatisticsProperty<Date> CLICKEDAT = new ClickStatisticsProperty<Date>("ClickedAt", Date.class);
    /**
     * Delay between registration of the click and sending of message.
     * 
     */
    public final static ClickStatisticsProperty<Long> CLICKEDDELAY = new ClickStatisticsProperty<Long>("ClickedDelay", Long.class);
    /**
     * Contact for which click was registered.
     * 
     */
    public final static ClickStatisticsProperty<Long> CONTACTID = new ClickStatisticsProperty<Long>("ContactID", Long.class);
    /**
     * Unique numerical ID for the click event.
     * 
     */
    public final static ClickStatisticsProperty.Key<Long> ID = new ClickStatisticsProperty.Key<Long>("ID", Long.class);
    /**
     * Reference to Message for which click was registered.
     * 
     */
    public final static ClickStatisticsProperty<Long> MESSAGEID = new ClickStatisticsProperty<Long>("MessageID", Long.class);
    /**
     * URL that was clicked.
     * 
     */
    public final static ClickStatisticsProperty<String> URL = new ClickStatisticsProperty<String>("Url", String.class);
    /**
     * User agent that was used to open the URL.
     * 
     */
    public final static ClickStatisticsProperty<Long> USERAGENTID = new ClickStatisticsProperty<Long>("UserAgentID", Long.class);

    private ClickStatisticsProperty(String name, Class<?> type) {
        super(name, type);
    }

    public static ClickStatisticsProperty<Object> ref(String name) {
        return new ClickStatisticsProperty<Object>(name, Object.class);
    }

    public final static class Key<KeyDataType >
        extends MailJetKeyProperty<ClickStatistics, KeyDataType>
    {


        private Key(String name, Class<?> type) {
            super(name, type);
        }

    }

}
