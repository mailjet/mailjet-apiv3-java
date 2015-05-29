
package com.mailjet.api.model.v3.campaignaggregate;

import java.util.Date;
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
@Resource(name = "campaignaggregate", allowedOperations = {
    ResourceOperationTypes.Get,
    ResourceOperationTypes.Put,
    ResourceOperationTypes.Post,
    ResourceOperationTypes.Delete
})
public final class Campaignaggregate {

    @Component(name = "CampaignIDS", type = "AnsiString", defaultValue = "", required = false, description = "")
    private String CampaignIDS;
    @Component(name = "ContactFilterID", type = "TContactFilter", defaultValue = "", required = false, description = "")
    private Long ContactFilterID;
    @Component(name = "ContactsListID", type = "TContactsList", defaultValue = "", required = false, description = "")
    private Long ContactsListID;
    @Component(name = "Final", type = "Boolean", defaultValue = "false", required = false, description = "")
    private Boolean Final;
    @Component(name = "FromDate", type = "TRFC3339DateTime", defaultValue = "", required = false, description = "")
    private Date FromDate;
    @Component(name = "ID", type = "Int64", defaultValue = "", required = false, description = "")
    private Long ID;
    @Component(name = "Keyword", type = "AnsiString", defaultValue = "", required = false, description = "")
    private String Keyword;
    @Component(name = "Name", type = "AnsiString", defaultValue = "", required = false, description = "")
    private String Name;
    @Component(name = "SenderID", type = "TSender", defaultValue = "", required = false, description = "")
    private Long SenderID;
    @Component(name = "ToDate", type = "TRFC3339DateTime", defaultValue = "", required = false, description = "")
    private Date ToDate;
    /**
     * API Operation "List".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<Campaignaggregate>> List = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<Campaignaggregate>>(Campaignaggregate.class, ResourceOperationTypes.Get);
    /**
     * API Operation "Get".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.RetrieveById<Campaignaggregate>> Get = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.RetrieveById<Campaignaggregate>>(Campaignaggregate.class, ResourceOperationTypes.GetById);
    /**
     * API Operation "Update".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Update<Campaignaggregate>> Update = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Update<Campaignaggregate>>(Campaignaggregate.class, ResourceOperationTypes.Put);
    /**
     * API Operation "Create".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Create<Campaignaggregate>> Create = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Create<Campaignaggregate>>(Campaignaggregate.class, ResourceOperationTypes.Post);
    /**
     * API Operation "Delete".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Delete<Campaignaggregate>> Delete = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Delete<Campaignaggregate>>(Campaignaggregate.class, ResourceOperationTypes.Delete);

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getCampaignIDS() {
        return CampaignIDS;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Campaignaggregate setCampaignIDS(String value) {
        CampaignIDS = value;
        return this;
    }

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getContactFilterID() {
        return ContactFilterID;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Campaignaggregate setContactFilterID(Long value) {
        ContactFilterID = value;
        return this;
    }

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getContactsListID() {
        return ContactsListID;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Campaignaggregate setContactsListID(Long value) {
        ContactsListID = value;
        return this;
    }

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Boolean getFinal() {
        return Final;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Campaignaggregate setFinal(Boolean value) {
        Final = value;
        return this;
    }

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Date getFromDate() {
        return FromDate;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Campaignaggregate setFromDate(Date value) {
        FromDate = value;
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
    public Campaignaggregate setID(Long value) {
        ID = value;
        return this;
    }

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getKeyword() {
        return Keyword;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Campaignaggregate setKeyword(String value) {
        Keyword = value;
        return this;
    }

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getName() {
        return Name;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Campaignaggregate setName(String value) {
        Name = value;
        return this;
    }

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getSenderID() {
        return SenderID;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Campaignaggregate setSenderID(Long value) {
        SenderID = value;
        return this;
    }

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Date getToDate() {
        return ToDate;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Campaignaggregate setToDate(Date value) {
        ToDate = value;
        return this;
    }

    public String toString() {
        return ((Campaignaggregate.class.getSimpleName()+"#")+ this.getID());
    }

}
