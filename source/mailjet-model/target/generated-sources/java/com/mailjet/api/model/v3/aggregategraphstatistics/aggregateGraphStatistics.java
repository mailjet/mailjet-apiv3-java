
package com.mailjet.api.model.v3.aggregategraphstatistics;

import java.math.BigDecimal;
import com.mailjet.api.client.MailJetApiService;
import com.mailjet.api.client.model.ResourceOperationTypes;
import com.mailjet.api.client.model.metadata.Component;
import com.mailjet.api.client.model.metadata.Resource;


/**
 * Class representing "".
 * 
 * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
 * 
 */
@Resource(name = "aggregategraphstatistics", allowedOperations = {
    ResourceOperationTypes.Get
})
public final class aggregateGraphStatistics {

    @Component(name = "BlockedCount", type = "Double", defaultValue = "", required = false, description = "")
    private BigDecimal BlockedCount;
    @Component(name = "BlockedStdDev", type = "Double", defaultValue = "", required = false, description = "")
    private BigDecimal BlockedStdDev;
    @Component(name = "BouncedCount", type = "Double", defaultValue = "", required = false, description = "")
    private BigDecimal BouncedCount;
    @Component(name = "BouncedStdDev", type = "Double", defaultValue = "", required = false, description = "")
    private BigDecimal BouncedStdDev;
    @Component(name = "CampaignAggregateID", type = "LongInt", defaultValue = "", required = false, description = "")
    private Integer CampaignAggregateID;
    @Component(name = "ClickedCount", type = "Double", defaultValue = "", required = false, description = "")
    private BigDecimal ClickedCount;
    @Component(name = "ClickedStdDev", type = "Double", defaultValue = "", required = false, description = "")
    private BigDecimal ClickedStdDev;
    @Component(name = "OpenedCount", type = "Double", defaultValue = "", required = false, description = "")
    private BigDecimal OpenedCount;
    @Component(name = "OpenedStdDev", type = "Double", defaultValue = "", required = false, description = "")
    private BigDecimal OpenedStdDev;
    @Component(name = "RefTimestamp", type = "LongInt", defaultValue = "", required = false, description = "")
    private Integer RefTimestamp;
    @Component(name = "SentCount", type = "Double", defaultValue = "", required = false, description = "")
    private BigDecimal SentCount;
    @Component(name = "SentStdDev", type = "Double", defaultValue = "", required = false, description = "")
    private BigDecimal SentStdDev;
    @Component(name = "SpamComplaintCount", type = "Double", defaultValue = "", required = false, description = "")
    private BigDecimal SpamComplaintCount;
    @Component(name = "SpamcomplaintStdDev", type = "Double", defaultValue = "", required = false, description = "")
    private BigDecimal SpamcomplaintStdDev;
    @Component(name = "UnsubscribedCount", type = "Double", defaultValue = "", required = false, description = "")
    private BigDecimal UnsubscribedCount;
    @Component(name = "UnsubscribedStdDev", type = "Double", defaultValue = "", required = false, description = "")
    private BigDecimal UnsubscribedStdDev;
    /**
     * API Operation "List".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<aggregateGraphStatistics>> List = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<aggregateGraphStatistics>>(aggregateGraphStatistics.class, ResourceOperationTypes.Get);

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public BigDecimal getBlockedCount() {
        return BlockedCount;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public aggregateGraphStatistics setBlockedCount(BigDecimal value) {
        BlockedCount = value;
        return this;
    }

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public BigDecimal getBlockedStdDev() {
        return BlockedStdDev;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public aggregateGraphStatistics setBlockedStdDev(BigDecimal value) {
        BlockedStdDev = value;
        return this;
    }

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public BigDecimal getBouncedCount() {
        return BouncedCount;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public aggregateGraphStatistics setBouncedCount(BigDecimal value) {
        BouncedCount = value;
        return this;
    }

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public BigDecimal getBouncedStdDev() {
        return BouncedStdDev;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public aggregateGraphStatistics setBouncedStdDev(BigDecimal value) {
        BouncedStdDev = value;
        return this;
    }

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Integer getCampaignAggregateID() {
        return CampaignAggregateID;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public aggregateGraphStatistics setCampaignAggregateID(Integer value) {
        CampaignAggregateID = value;
        return this;
    }

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public BigDecimal getClickedCount() {
        return ClickedCount;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public aggregateGraphStatistics setClickedCount(BigDecimal value) {
        ClickedCount = value;
        return this;
    }

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public BigDecimal getClickedStdDev() {
        return ClickedStdDev;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public aggregateGraphStatistics setClickedStdDev(BigDecimal value) {
        ClickedStdDev = value;
        return this;
    }

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public BigDecimal getOpenedCount() {
        return OpenedCount;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public aggregateGraphStatistics setOpenedCount(BigDecimal value) {
        OpenedCount = value;
        return this;
    }

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public BigDecimal getOpenedStdDev() {
        return OpenedStdDev;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public aggregateGraphStatistics setOpenedStdDev(BigDecimal value) {
        OpenedStdDev = value;
        return this;
    }

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Integer getRefTimestamp() {
        return RefTimestamp;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public aggregateGraphStatistics setRefTimestamp(Integer value) {
        RefTimestamp = value;
        return this;
    }

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public BigDecimal getSentCount() {
        return SentCount;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public aggregateGraphStatistics setSentCount(BigDecimal value) {
        SentCount = value;
        return this;
    }

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public BigDecimal getSentStdDev() {
        return SentStdDev;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public aggregateGraphStatistics setSentStdDev(BigDecimal value) {
        SentStdDev = value;
        return this;
    }

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public BigDecimal getSpamComplaintCount() {
        return SpamComplaintCount;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public aggregateGraphStatistics setSpamComplaintCount(BigDecimal value) {
        SpamComplaintCount = value;
        return this;
    }

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public BigDecimal getSpamcomplaintStdDev() {
        return SpamcomplaintStdDev;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public aggregateGraphStatistics setSpamcomplaintStdDev(BigDecimal value) {
        SpamcomplaintStdDev = value;
        return this;
    }

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public BigDecimal getUnsubscribedCount() {
        return UnsubscribedCount;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public aggregateGraphStatistics setUnsubscribedCount(BigDecimal value) {
        UnsubscribedCount = value;
        return this;
    }

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public BigDecimal getUnsubscribedStdDev() {
        return UnsubscribedStdDev;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public aggregateGraphStatistics setUnsubscribedStdDev(BigDecimal value) {
        UnsubscribedStdDev = value;
        return this;
    }

}
