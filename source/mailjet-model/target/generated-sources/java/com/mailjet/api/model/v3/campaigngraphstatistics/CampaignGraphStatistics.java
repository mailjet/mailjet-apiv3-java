
package com.mailjet.api.model.v3.campaigngraphstatistics;

import com.mailjet.api.client.MailJetApiService;
import com.mailjet.api.client.model.ResourceOperationTypes;
import com.mailjet.api.client.model.metadata.Component;
import com.mailjet.api.client.model.metadata.Resource;


/**
 * Class representing "".
 * 
 * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:20 CEST 2014.
 * 
 */
@Resource(name = "campaigngraphstatistics", allowedOperations = {
    ResourceOperationTypes.Get
})
public final class CampaignGraphStatistics {

    @Component(name = "Clickcount", type = "Int64", defaultValue = "", required = false, description = "")
    private Long Clickcount;
    @Component(name = "ID", type = "Int64", defaultValue = "", required = false, description = "")
    private Long ID;
    @Component(name = "Opencount", type = "Int64", defaultValue = "", required = false, description = "")
    private Long Opencount;
    @Component(name = "Spamcount", type = "Int64", defaultValue = "", required = false, description = "")
    private Long Spamcount;
    @Component(name = "Tick", type = "Int64", defaultValue = "", required = false, description = "")
    private Long Tick;
    @Component(name = "Unsubcount", type = "Int64", defaultValue = "", required = false, description = "")
    private Long Unsubcount;
    /**
     * API Operation "List".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<CampaignGraphStatistics>> List = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<CampaignGraphStatistics>>(CampaignGraphStatistics.class, ResourceOperationTypes.Get);
    /**
     * API Operation "Get".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.RetrieveById<CampaignGraphStatistics>> Get = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.RetrieveById<CampaignGraphStatistics>>(CampaignGraphStatistics.class, ResourceOperationTypes.GetById);

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getClickcount() {
        return Clickcount;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public CampaignGraphStatistics setClickcount(Long value) {
        Clickcount = value;
        return this;
    }

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getID() {
        return ID;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public CampaignGraphStatistics setID(Long value) {
        ID = value;
        return this;
    }

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getOpencount() {
        return Opencount;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public CampaignGraphStatistics setOpencount(Long value) {
        Opencount = value;
        return this;
    }

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getSpamcount() {
        return Spamcount;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public CampaignGraphStatistics setSpamcount(Long value) {
        Spamcount = value;
        return this;
    }

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getTick() {
        return Tick;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public CampaignGraphStatistics setTick(Long value) {
        Tick = value;
        return this;
    }

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getUnsubcount() {
        return Unsubcount;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public CampaignGraphStatistics setUnsubcount(Long value) {
        Unsubcount = value;
        return this;
    }

    public String toString() {
        return ((CampaignGraphStatistics.class.getSimpleName()+"#")+ this.getID());
    }

}
