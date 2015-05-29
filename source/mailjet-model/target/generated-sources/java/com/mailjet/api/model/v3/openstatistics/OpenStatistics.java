
package com.mailjet.api.model.v3.openstatistics;

import java.math.BigDecimal;
import com.mailjet.api.client.MailJetApiService;
import com.mailjet.api.client.model.ResourceOperationTypes;
import com.mailjet.api.client.model.metadata.Component;
import com.mailjet.api.client.model.metadata.Resource;


/**
 * Class representing "Retrieve statistics on e-mails opened at least once by their recipients.".
 * 
 * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
 * 
 */
@Resource(name = "openstatistics", description = "Retrieve statistics on e-mails opened at least once by their recipients.", allowedOperations = {
    ResourceOperationTypes.Get
})
public final class OpenStatistics {

    @Component(name = "OpenedCount", type = "Int64", defaultValue = "", required = false, description = "Number of message open registrations.")
    private Long OpenedCount;
    @Component(name = "OpenedDelay", type = "Currency", defaultValue = "", required = false, description = "Delay between delivery and open (in seconds).")
    private BigDecimal OpenedDelay;
    @Component(name = "ProcessedCount", type = "Int64", defaultValue = "", required = false, description = "Total number of messages processed by Mailjet.")
    private Long ProcessedCount;
    /**
     * API Operation "List".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<OpenStatistics>> List = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<OpenStatistics>>(OpenStatistics.class, ResourceOperationTypes.Get);

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
    public OpenStatistics setOpenedCount(Long value) {
        OpenedCount = value;
        return this;
    }

    /**
     * Gets "Delay between delivery and open (in seconds)." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public BigDecimal getOpenedDelay() {
        return OpenedDelay;
    }

    /**
     * Sets the specified value to "Delay between delivery and open (in seconds)." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public OpenStatistics setOpenedDelay(BigDecimal value) {
        OpenedDelay = value;
        return this;
    }

    /**
     * Gets "Total number of messages processed by Mailjet." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getProcessedCount() {
        return ProcessedCount;
    }

    /**
     * Sets the specified value to "Total number of messages processed by Mailjet." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public OpenStatistics setProcessedCount(Long value) {
        ProcessedCount = value;
        return this;
    }

}
