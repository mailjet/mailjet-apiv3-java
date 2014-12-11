
package com.mailjet.api.model.v3.useragentstatistics;

import com.mailjet.api.client.MailJetApiService;
import com.mailjet.api.client.model.ResourceOperationTypes;
import com.mailjet.api.client.model.metadata.Component;
import com.mailjet.api.client.model.metadata.Resource;


/**
 * Class representing "View statistics on User Agents. See total counts or filter per Campaign or Contacts List.API Key message Open/Click statistical data grouped per user agent (browser).".
 * 
 * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:21 CEST 2014.
 * 
 */
@Resource(name = "useragentstatistics", description = "View statistics on User Agents. See total counts or filter per Campaign or Contacts List.API Key message Open/Click statistical data grouped per user agent (browser).", allowedOperations = {
    ResourceOperationTypes.Get
})
public final class UserAgentStatistics {

    @Component(name = "Count", type = "Int64", defaultValue = "", required = false, description = "Number of clicks using this browser.")
    private Long Count;
    @Component(name = "DistinctCount", type = "Int64", defaultValue = "", required = false, description = "User of messages clicked using this browser.")
    private Long DistinctCount;
    @Component(name = "Platform", type = "AnsiString", defaultValue = "", required = true, description = "Platform on which the browser runs.")
    private String Platform;
    @Component(name = "UserAgent", type = "AnsiString", defaultValue = "", required = true, description = "Description of user agent.")
    private String UserAgent;
    /**
     * API Operation "List".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<UserAgentStatistics>> List = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<UserAgentStatistics>>(UserAgentStatistics.class, ResourceOperationTypes.Get);

    /**
     * Gets "Number of clicks using this browser." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getCount() {
        return Count;
    }

    /**
     * Sets the specified value to "Number of clicks using this browser." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public UserAgentStatistics setCount(Long value) {
        Count = value;
        return this;
    }

    /**
     * Gets "User of messages clicked using this browser." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getDistinctCount() {
        return DistinctCount;
    }

    /**
     * Sets the specified value to "User of messages clicked using this browser." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public UserAgentStatistics setDistinctCount(Long value) {
        DistinctCount = value;
        return this;
    }

    /**
     * Gets "Platform on which the browser runs." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getPlatform() {
        return Platform;
    }

    /**
     * Sets the specified value to "Platform on which the browser runs." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public UserAgentStatistics setPlatform(String value) {
        Platform = value;
        return this;
    }

    /**
     * Gets "Description of user agent." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getUserAgent() {
        return UserAgent;
    }

    /**
     * Sets the specified value to "Description of user agent." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public UserAgentStatistics setUserAgent(String value) {
        UserAgent = value;
        return this;
    }

}
