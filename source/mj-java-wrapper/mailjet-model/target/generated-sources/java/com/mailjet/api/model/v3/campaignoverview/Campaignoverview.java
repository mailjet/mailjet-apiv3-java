
package com.mailjet.api.model.v3.campaignoverview;

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
@Resource(name = "campaignoverview", allowedOperations = {
    ResourceOperationTypes.Get
})
public final class Campaignoverview {

    @Component(name = "ClickedCount", type = "Int64", defaultValue = "", required = false, description = "")
    private Long ClickedCount;
    @Component(name = "EditMode", type = "AnsiString", defaultValue = "", required = false, description = "")
    private String EditMode;
    @Component(name = "EditType", type = "AnsiString", defaultValue = "", required = false, description = "")
    private String EditType;
    @Component(name = "ID", type = "Int64", defaultValue = "", required = false, description = "")
    private Long ID;
    @Component(name = "IDType", type = "AnsiString", defaultValue = "", required = false, description = "")
    private String IDType;
    @Component(name = "OpenedCount", type = "Int64", defaultValue = "", required = false, description = "")
    private Long OpenedCount;
    @Component(name = "ProcessedCount", type = "Int64", defaultValue = "", required = false, description = "")
    private Long ProcessedCount;
    @Component(name = "SendTimeStart", type = "Int64", defaultValue = "", required = false, description = "")
    private Long SendTimeStart;
    @Component(name = "Starred", type = "Boolean", defaultValue = "false", required = false, description = "")
    private Boolean Starred;
    @Component(name = "Status", type = "LongInt", defaultValue = "", required = false, description = "")
    private Integer Status;
    @Component(name = "Subject", type = "AnsiString", defaultValue = "", required = false, description = "")
    private String Subject;
    @Component(name = "Title", type = "AnsiString", defaultValue = "", required = false, description = "")
    private String Title;
    /**
     * API Operation "List".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<Campaignoverview>> List = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<Campaignoverview>>(Campaignoverview.class, ResourceOperationTypes.Get);
    /**
     * API Operation "Get".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.RetrieveById<Campaignoverview>> Get = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.RetrieveById<Campaignoverview>>(Campaignoverview.class, ResourceOperationTypes.GetById);

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getClickedCount() {
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
    public Campaignoverview setClickedCount(Long value) {
        ClickedCount = value;
        return this;
    }

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getEditMode() {
        return EditMode;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Campaignoverview setEditMode(String value) {
        EditMode = value;
        return this;
    }

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getEditType() {
        return EditType;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Campaignoverview setEditType(String value) {
        EditType = value;
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
    public Campaignoverview setID(Long value) {
        ID = value;
        return this;
    }

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getIDType() {
        return IDType;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Campaignoverview setIDType(String value) {
        IDType = value;
        return this;
    }

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getOpenedCount() {
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
    public Campaignoverview setOpenedCount(Long value) {
        OpenedCount = value;
        return this;
    }

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getProcessedCount() {
        return ProcessedCount;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Campaignoverview setProcessedCount(Long value) {
        ProcessedCount = value;
        return this;
    }

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getSendTimeStart() {
        return SendTimeStart;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Campaignoverview setSendTimeStart(Long value) {
        SendTimeStart = value;
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
    public Campaignoverview setStarred(Boolean value) {
        Starred = value;
        return this;
    }

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Integer getStatus() {
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
    public Campaignoverview setStatus(Integer value) {
        Status = value;
        return this;
    }

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getSubject() {
        return Subject;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Campaignoverview setSubject(String value) {
        Subject = value;
        return this;
    }

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getTitle() {
        return Title;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Campaignoverview setTitle(String value) {
        Title = value;
        return this;
    }

    public String toString() {
        return ((Campaignoverview.class.getSimpleName()+"#")+ this.getID());
    }

}
