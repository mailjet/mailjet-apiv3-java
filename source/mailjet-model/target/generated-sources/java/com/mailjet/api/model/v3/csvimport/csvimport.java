
package com.mailjet.api.model.v3.csvimport;

import java.util.Date;
import com.mailjet.api.client.MailJetApiService;
import com.mailjet.api.client.model.ResourceOperationTypes;
import com.mailjet.api.client.model.metadata.Component;
import com.mailjet.api.client.model.metadata.Resource;


/**
 * Class representing "".
 * 
 * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:21 CEST 2014.
 * 
 */
@Resource(name = "csvimport", allowedOperations = {
    ResourceOperationTypes.Get,
    ResourceOperationTypes.Put,
    ResourceOperationTypes.Post
})
public final class csvimport {

    @Component(name = "AliveAt", type = "TRFC3339DateTime", defaultValue = "", required = false, description = "Timestamp when the CSV import background job reported a status.")
    private Date AliveAt;
    @Component(name = "ContactsList", type = "TContactsList", defaultValue = "", required = true, description = "Contacts list for which the import should be started.")
    private Long ContactsListID;
    @Component(name = "Count", type = "LongInt", defaultValue = "", required = false, description = "Number of contacts detected in the CSV file.")
    private Integer Count;
    @Component(name = "Current", type = "LongInt", defaultValue = "", required = false, description = "Number of processed contacts.")
    private Integer Current;
    @Component(name = "DataID", type = "Int64", defaultValue = "", required = true, description = "ID of uploaded CSV data file.")
    private Long DataID;
    @Component(name = "Errcount", type = "LongInt", defaultValue = "", required = false, description = "Number of errors encountered so far.")
    private Integer Errcount;
    @Component(name = "ErrTreshold", type = "SmallInt", defaultValue = "", required = false, description = "Maximum number of errors that can occur before the job is aborted.")
    private Short ErrTreshold;
    @Component(name = "ID", type = "Int64", defaultValue = "", required = false, description = "Unique ID of this CSV import file.")
    private Long ID;
    @Component(name = "ImportOptions", type = "AnsiString", defaultValue = "", required = false, description = "a string with a JSON structure describing the import options in effect.")
    private String ImportOptions;
    @Component(name = "JobEnd", type = "TRFC3339DateTime", defaultValue = "", required = false, description = "When the job was ended.")
    private Date JobEnd;
    @Component(name = "JobStart", type = "TRFC3339DateTime", defaultValue = "", required = false, description = "When the job was started.")
    private Date JobStart;
    @Component(name = "Method", type = "AnsiString", defaultValue = "Unknown", required = false, description = "Method to use when importing a list of contacts.")
    private String Method;
    @Component(name = "RequestAt", type = "TRFC3339DateTime", defaultValue = "", required = false, description = "Time when the job was registered.")
    private Date RequestAt;
    @Component(name = "Status", type = "AnsiString", defaultValue = "Upload", required = false, description = "Current status of the job. If set during POST, the only allowed value is 'Upload'. During PUT, the only allowed value is 'Abort'.")
    private String Status;
    /**
     * API Operation "List".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<csvimport>> List = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<csvimport>>(csvimport.class, ResourceOperationTypes.Get);
    /**
     * API Operation "Get".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.RetrieveById<csvimport>> Get = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.RetrieveById<csvimport>>(csvimport.class, ResourceOperationTypes.GetById);
    /**
     * API Operation "Update".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Update<csvimport>> Update = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Update<csvimport>>(csvimport.class, ResourceOperationTypes.Put);
    /**
     * API Operation "Create".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Create<csvimport>> Create = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Create<csvimport>>(csvimport.class, ResourceOperationTypes.Post);

    /**
     * Gets "Timestamp when the CSV import background job reported a status." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Date getAliveAt() {
        return AliveAt;
    }

    /**
     * Sets the specified value to "Timestamp when the CSV import background job reported a status." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public csvimport setAliveAt(Date value) {
        AliveAt = value;
        return this;
    }

    /**
     * Gets "Contacts list for which the import should be started." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getContactsListID() {
        return ContactsListID;
    }

    /**
     * Sets the specified value to "Contacts list for which the import should be started." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public csvimport setContactsListID(Long value) {
        ContactsListID = value;
        return this;
    }

    /**
     * Gets "Number of contacts detected in the CSV file." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Integer getCount() {
        return Count;
    }

    /**
     * Sets the specified value to "Number of contacts detected in the CSV file." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public csvimport setCount(Integer value) {
        Count = value;
        return this;
    }

    /**
     * Gets "Number of processed contacts." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Integer getCurrent() {
        return Current;
    }

    /**
     * Sets the specified value to "Number of processed contacts." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public csvimport setCurrent(Integer value) {
        Current = value;
        return this;
    }

    /**
     * Gets "ID of uploaded CSV data file." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getDataID() {
        return DataID;
    }

    /**
     * Sets the specified value to "ID of uploaded CSV data file." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public csvimport setDataID(Long value) {
        DataID = value;
        return this;
    }

    /**
     * Gets "Number of errors encountered so far." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Integer getErrcount() {
        return Errcount;
    }

    /**
     * Sets the specified value to "Number of errors encountered so far." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public csvimport setErrcount(Integer value) {
        Errcount = value;
        return this;
    }

    /**
     * Gets "Maximum number of errors that can occur before the job is aborted." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Short getErrTreshold() {
        return ErrTreshold;
    }

    /**
     * Sets the specified value to "Maximum number of errors that can occur before the job is aborted." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public csvimport setErrTreshold(Short value) {
        ErrTreshold = value;
        return this;
    }

    /**
     * Gets "Unique ID of this CSV import file." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getID() {
        return ID;
    }

    /**
     * Sets the specified value to "Unique ID of this CSV import file." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public csvimport setID(Long value) {
        ID = value;
        return this;
    }

    /**
     * Gets "a string with a JSON structure describing the import options in effect." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getImportOptions() {
        return ImportOptions;
    }

    /**
     * Sets the specified value to "a string with a JSON structure describing the import options in effect." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public csvimport setImportOptions(String value) {
        ImportOptions = value;
        return this;
    }

    /**
     * Gets "When the job was ended." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Date getJobEnd() {
        return JobEnd;
    }

    /**
     * Sets the specified value to "When the job was ended." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public csvimport setJobEnd(Date value) {
        JobEnd = value;
        return this;
    }

    /**
     * Gets "When the job was started." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Date getJobStart() {
        return JobStart;
    }

    /**
     * Sets the specified value to "When the job was started." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public csvimport setJobStart(Date value) {
        JobStart = value;
        return this;
    }

    /**
     * Gets "Method to use when importing a list of contacts." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getMethod() {
        return Method;
    }

    /**
     * Sets the specified value to "Method to use when importing a list of contacts." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public csvimport setMethod(String value) {
        Method = value;
        return this;
    }

    /**
     * Gets "Time when the job was registered." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Date getRequestAt() {
        return RequestAt;
    }

    /**
     * Sets the specified value to "Time when the job was registered." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public csvimport setRequestAt(Date value) {
        RequestAt = value;
        return this;
    }

    /**
     * Gets "Current status of the job. If set during POST, the only allowed value is 'Upload'. During PUT, the only allowed value is 'Abort'." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getStatus() {
        return Status;
    }

    /**
     * Sets the specified value to "Current status of the job. If set during POST, the only allowed value is 'Upload'. During PUT, the only allowed value is 'Abort'." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public csvimport setStatus(String value) {
        Status = value;
        return this;
    }

    public String toString() {
        return ((csvimport.class.getSimpleName()+"#")+ this.getID());
    }

}
