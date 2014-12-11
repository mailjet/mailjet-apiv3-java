
package com.mailjet.api.model.v3.toplinkclicked;

import com.mailjet.api.client.MailJetApiService;
import com.mailjet.api.client.model.ResourceOperationTypes;
import com.mailjet.api.client.model.metadata.Component;
import com.mailjet.api.client.model.metadata.Resource;


/**
 * Class representing "Top links clicked historgram.".
 * 
 * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:21 CEST 2014.
 * 
 */
@Resource(name = "toplinkclicked", description = "Top links clicked historgram.", allowedOperations = {
    ResourceOperationTypes.Get
})
public final class TopLinkClicked {

    @Component(name = "ClickedCount", type = "Int64", defaultValue = "", required = false, description = "Number of registered clicks.")
    private Long ClickedCount;
    @Component(name = "ID", type = "Int64", defaultValue = "", required = false, description = "Unique numerical ID for this object.")
    private Long ID;
    @Component(name = "LinkId", type = "Int64", defaultValue = "", required = false, description = "Unique ID for the link.")
    private Long LinkId;
    @Component(name = "Url", type = "AnsiString", defaultValue = "", required = false, description = "Actual link clicked.")
    private String Url;
    /**
     * API Operation "List".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<TopLinkClicked>> List = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<TopLinkClicked>>(TopLinkClicked.class, ResourceOperationTypes.Get);
    /**
     * API Operation "Get".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.RetrieveById<TopLinkClicked>> Get = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.RetrieveById<TopLinkClicked>>(TopLinkClicked.class, ResourceOperationTypes.GetById);

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
    public TopLinkClicked setClickedCount(Long value) {
        ClickedCount = value;
        return this;
    }

    /**
     * Gets "Unique numerical ID for this object." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getID() {
        return ID;
    }

    /**
     * Sets the specified value to "Unique numerical ID for this object." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public TopLinkClicked setID(Long value) {
        ID = value;
        return this;
    }

    /**
     * Gets "Unique ID for the link." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getLinkId() {
        return LinkId;
    }

    /**
     * Sets the specified value to "Unique ID for the link." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public TopLinkClicked setLinkId(Long value) {
        LinkId = value;
        return this;
    }

    /**
     * Gets "Actual link clicked." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getUrl() {
        return Url;
    }

    /**
     * Sets the specified value to "Actual link clicked." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public TopLinkClicked setUrl(String value) {
        Url = value;
        return this;
    }

    public String toString() {
        return ((TopLinkClicked.class.getSimpleName()+"#")+ this.getID());
    }

}
