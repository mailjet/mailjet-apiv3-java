
package com.mailjet.api.model.v3.axtesting;

import java.math.BigDecimal;
import java.util.Date;
import com.mailjet.api.client.MailJetApiService;
import com.mailjet.api.client.model.ResourceOperationTypes;
import com.mailjet.api.client.model.metadata.Component;
import com.mailjet.api.client.model.metadata.Resource;
import com.mailjet.api.model.v3.customtypes.AXTestMode;


/**
 * Class representing "".
 * 
 * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
 * 
 */
@Resource(name = "axtesting", allowedOperations = {
    ResourceOperationTypes.Get,
    ResourceOperationTypes.Put,
    ResourceOperationTypes.Post,
    ResourceOperationTypes.Delete
})
public final class axtesting {

    @Component(name = "ContactListID", type = "TContactsList", defaultValue = "", required = false, description = "")
    private Long ContactListID;
    @Component(name = "CreatedAt", type = "TRFC3339DateTime", defaultValue = "", required = false, description = "")
    private Date CreatedAt;
    @Component(name = "Deleted", type = "Boolean", defaultValue = "false", required = false, description = "")
    private Boolean Deleted;
    @Component(name = "ID", type = "Int64", defaultValue = "", required = false, description = "")
    private Long ID;
    @Component(name = "Mode", type = "TAXTestMode", defaultValue = "automatic", required = false, description = "")
    private AXTestMode Mode;
    @Component(name = "Name", type = "AnsiString", defaultValue = "", required = false, description = "")
    private String Name;
    @Component(name = "Percentage", type = "Double", defaultValue = "", required = false, description = "")
    private BigDecimal Percentage;
    @Component(name = "RemainderAt", type = "TRFC3339DateTime", defaultValue = "", required = false, description = "")
    private Date RemainderAt;
    @Component(name = "SegmentationID", type = "TContactFilter", defaultValue = "", required = false, description = "")
    private Long SegmentationID;
    @Component(name = "Starred", type = "Boolean", defaultValue = "false", required = false, description = "")
    private Boolean Starred;
    @Component(name = "StartAt", type = "TRFC3339DateTime", defaultValue = "", required = false, description = "")
    private Date StartAt;
    @Component(name = "Status", type = "AnsiString", defaultValue = "", required = false, description = "")
    private String Status;
    @Component(name = "StatusCode", type = "SmallInt", defaultValue = "", required = false, description = "")
    private Short StatusCode;
    @Component(name = "StatusString", type = "AnsiString", defaultValue = "", required = false, description = "")
    private String StatusString;
    @Component(name = "WinnerClickRate", type = "Double", defaultValue = "", required = false, description = "")
    private BigDecimal WinnerClickRate;
    @Component(name = "WinnerID", type = "LongInt", defaultValue = "", required = false, description = "")
    private Integer WinnerID;
    @Component(name = "WinnerMethod", type = "TWinnerMethod", defaultValue = "OpenRate", required = false, description = "")
    private com.mailjet.api.model.v3.customtypes.WinnerMethod WinnerMethod;
    @Component(name = "WinnerOpenRate", type = "Double", defaultValue = "", required = false, description = "")
    private BigDecimal WinnerOpenRate;
    @Component(name = "WinnerSpamRate", type = "Double", defaultValue = "", required = false, description = "")
    private BigDecimal WinnerSpamRate;
    @Component(name = "WinnerUnsubRate", type = "Double", defaultValue = "", required = false, description = "")
    private BigDecimal WinnerUnsubRate;
    /**
     * API Operation "List".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<axtesting>> List = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<axtesting>>(axtesting.class, ResourceOperationTypes.Get);
    /**
     * API Operation "Get".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.RetrieveById<axtesting>> Get = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.RetrieveById<axtesting>>(axtesting.class, ResourceOperationTypes.GetById);
    /**
     * API Operation "Update".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Update<axtesting>> Update = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Update<axtesting>>(axtesting.class, ResourceOperationTypes.Put);
    /**
     * API Operation "Create".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Create<axtesting>> Create = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Create<axtesting>>(axtesting.class, ResourceOperationTypes.Post);
    /**
     * API Operation "Delete".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Delete<axtesting>> Delete = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Delete<axtesting>>(axtesting.class, ResourceOperationTypes.Delete);

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getContactListID() {
        return ContactListID;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public axtesting setContactListID(Long value) {
        ContactListID = value;
        return this;
    }

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Date getCreatedAt() {
        return CreatedAt;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public axtesting setCreatedAt(Date value) {
        CreatedAt = value;
        return this;
    }

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Boolean getDeleted() {
        return Deleted;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public axtesting setDeleted(Boolean value) {
        Deleted = value;
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
    public axtesting setID(Long value) {
        ID = value;
        return this;
    }

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public AXTestMode getMode() {
        return Mode;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public axtesting setMode(AXTestMode value) {
        Mode = value;
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
    public axtesting setName(String value) {
        Name = value;
        return this;
    }

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public BigDecimal getPercentage() {
        return Percentage;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public axtesting setPercentage(BigDecimal value) {
        Percentage = value;
        return this;
    }

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Date getRemainderAt() {
        return RemainderAt;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public axtesting setRemainderAt(Date value) {
        RemainderAt = value;
        return this;
    }

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getSegmentationID() {
        return SegmentationID;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public axtesting setSegmentationID(Long value) {
        SegmentationID = value;
        return this;
    }

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Boolean getStarred() {
        return Starred;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public axtesting setStarred(Boolean value) {
        Starred = value;
        return this;
    }

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Date getStartAt() {
        return StartAt;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public axtesting setStartAt(Date value) {
        StartAt = value;
        return this;
    }

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getStatus() {
        return Status;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public axtesting setStatus(String value) {
        Status = value;
        return this;
    }

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Short getStatusCode() {
        return StatusCode;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public axtesting setStatusCode(Short value) {
        StatusCode = value;
        return this;
    }

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getStatusString() {
        return StatusString;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public axtesting setStatusString(String value) {
        StatusString = value;
        return this;
    }

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public BigDecimal getWinnerClickRate() {
        return WinnerClickRate;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public axtesting setWinnerClickRate(BigDecimal value) {
        WinnerClickRate = value;
        return this;
    }

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Integer getWinnerID() {
        return WinnerID;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public axtesting setWinnerID(Integer value) {
        WinnerID = value;
        return this;
    }

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public com.mailjet.api.model.v3.customtypes.WinnerMethod getWinnerMethod() {
        return WinnerMethod;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public axtesting setWinnerMethod(com.mailjet.api.model.v3.customtypes.WinnerMethod value) {
        WinnerMethod = value;
        return this;
    }

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public BigDecimal getWinnerOpenRate() {
        return WinnerOpenRate;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public axtesting setWinnerOpenRate(BigDecimal value) {
        WinnerOpenRate = value;
        return this;
    }

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public BigDecimal getWinnerSpamRate() {
        return WinnerSpamRate;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public axtesting setWinnerSpamRate(BigDecimal value) {
        WinnerSpamRate = value;
        return this;
    }

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public BigDecimal getWinnerUnsubRate() {
        return WinnerUnsubRate;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public axtesting setWinnerUnsubRate(BigDecimal value) {
        WinnerUnsubRate = value;
        return this;
    }

    public String toString() {
        return ((axtesting.class.getSimpleName()+"#")+ this.getID());
    }

}
