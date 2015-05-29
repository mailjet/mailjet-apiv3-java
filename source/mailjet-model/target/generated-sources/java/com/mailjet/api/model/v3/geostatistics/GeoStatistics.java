
package com.mailjet.api.model.v3.geostatistics;

import com.mailjet.api.client.MailJetApiService;
import com.mailjet.api.client.model.ResourceOperationTypes;
import com.mailjet.api.client.model.metadata.Component;
import com.mailjet.api.client.model.metadata.Resource;


/**
 * Class representing "Message click/open statistics grouped per country".
 * 
 * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
 * 
 */
@Resource(name = "geostatistics", description = "Message click/open statistics grouped per country", allowedOperations = {
    ResourceOperationTypes.Get
}, uniquekey = "Country")
public final class GeoStatistics {

    @Component(name = "ClickedCount", type = "Int64", defaultValue = "", required = false, description = "Number of registered clicks.")
    private Long ClickedCount;
    @Component(name = "Country", type = "AnsiString", defaultValue = "", required = false, description = "Country.")
    private String Country;
    @Component(name = "OpenedCount", type = "Int64", defaultValue = "", required = false, description = "Number of message open registrations.")
    private Long OpenedCount;
    /**
     * API Operation "List".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<GeoStatistics>> List = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<GeoStatistics>>(GeoStatistics.class, ResourceOperationTypes.Get);

    /**
     * Gets "Number of registered clicks." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getClickedCount() {
        return ClickedCount;
    }

    /**
     * Sets the specified value to "Number of registered clicks." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public GeoStatistics setClickedCount(Long value) {
        ClickedCount = value;
        return this;
    }

    /**
     * Gets "Country." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getCountry() {
        return Country;
    }

    /**
     * Sets the specified value to "Country." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public GeoStatistics setCountry(String value) {
        Country = value;
        return this;
    }

    /**
     * Gets "Number of message open registrations." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getOpenedCount() {
        return OpenedCount;
    }

    /**
     * Sets the specified value to "Number of message open registrations." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public GeoStatistics setOpenedCount(Long value) {
        OpenedCount = value;
        return this;
    }

}
