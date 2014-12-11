
package com.mailjet.api.model.v3.useragentstatistics;

import com.mailjet.api.client.model.MailJetKeyProperty;
import com.mailjet.api.client.model.MailJetResourceProperty;


/**
 * Class defining property constants for "useragentstatistics" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:21 CEST 2014.
 * 
 */
public final class UserAgentStatisticsProperty<DataType >
    extends MailJetResourceProperty<UserAgentStatistics, DataType>
{

    /**
     * Number of clicks using this browser.
     * 
     */
    public final static UserAgentStatisticsProperty<Long> COUNT = new UserAgentStatisticsProperty<Long>("Count", Long.class);
    /**
     * User of messages clicked using this browser.
     * 
     */
    public final static UserAgentStatisticsProperty<Long> DISTINCTCOUNT = new UserAgentStatisticsProperty<Long>("DistinctCount", Long.class);
    /**
     * Platform on which the browser runs.
     * 
     */
    public final static UserAgentStatisticsProperty<String> PLATFORM = new UserAgentStatisticsProperty<String>("Platform", String.class);
    /**
     * Description of user agent.
     * 
     */
    public final static UserAgentStatisticsProperty<String> USERAGENT = new UserAgentStatisticsProperty<String>("UserAgent", String.class);

    private UserAgentStatisticsProperty(String name, Class<?> type) {
        super(name, type);
    }

    public static UserAgentStatisticsProperty<Object> ref(String name) {
        return new UserAgentStatisticsProperty<Object>(name, Object.class);
    }

    public final static class Key<KeyDataType >
        extends MailJetKeyProperty<UserAgentStatistics, KeyDataType>
    {


        private Key(String name, Class<?> type) {
            super(name, type);
        }

    }

}
