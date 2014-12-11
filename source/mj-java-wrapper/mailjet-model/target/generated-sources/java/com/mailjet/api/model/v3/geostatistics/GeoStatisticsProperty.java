
package com.mailjet.api.model.v3.geostatistics;

import com.mailjet.api.client.model.MailJetKeyProperty;
import com.mailjet.api.client.model.MailJetResourceProperty;


/**
 * Class defining property constants for "geostatistics" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:21 CEST 2014.
 * 
 */
public final class GeoStatisticsProperty<DataType >
    extends MailJetResourceProperty<GeoStatistics, DataType>
{

    /**
     * Number of registered clicks.
     * 
     */
    public final static GeoStatisticsProperty<Long> CLICKEDCOUNT = new GeoStatisticsProperty<Long>("ClickedCount", Long.class);
    /**
     * Country.
     * 
     */
    public final static GeoStatisticsProperty.Key<String> COUNTRY = new GeoStatisticsProperty.Key<String>("Country", String.class);
    /**
     * Number of message open registrations.
     * 
     */
    public final static GeoStatisticsProperty<Long> OPENEDCOUNT = new GeoStatisticsProperty<Long>("OpenedCount", Long.class);

    private GeoStatisticsProperty(String name, Class<?> type) {
        super(name, type);
    }

    public static GeoStatisticsProperty<Object> ref(String name) {
        return new GeoStatisticsProperty<Object>(name, Object.class);
    }

    public final static class Key<KeyDataType >
        extends MailJetKeyProperty<GeoStatistics, KeyDataType>
    {


        private Key(String name, Class<?> type) {
            super(name, type);
        }

    }

}
