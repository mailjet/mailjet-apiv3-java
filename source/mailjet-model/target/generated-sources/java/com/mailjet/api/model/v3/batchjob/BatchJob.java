
package com.mailjet.api.model.v3.batchjob;

import com.mailjet.api.client.MailJetApiService;
import com.mailjet.api.client.model.ResourceOperationTypes;
import com.mailjet.api.client.model.metadata.Component;
import com.mailjet.api.client.model.metadata.EnumValue;
import com.mailjet.api.client.model.metadata.Resource;


/**
 * Class representing "Batch jobs running on the Mailjet infrastructure. Currently not documented.".
 * 
 * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:20 CEST 2014.
 * 
 */
@Resource(name = "batchjob", description = "Batch jobs running on the Mailjet infrastructure. Currently not documented.", allowedOperations = {
    ResourceOperationTypes.Get,
    ResourceOperationTypes.Put,
    ResourceOperationTypes.Post
})
public final class BatchJob {

    @Component(name = "AliveAt", type = "Int64", defaultValue = "", required = false, description = "Timestamp indicating when batch process was last seen alive.")
    private Long AliveAt;
    @Component(name = "APIKey", type = "TAPIKey", defaultValue = "", required = false, description = "API key for which this batch job is destined.")
    private Long APIKeyID;
    @Component(name = "Blocksize", type = "LongInt", defaultValue = "", required = false, description = "Size of processing blocks (e.g. number of contacts to process as one block in a contact import job).")
    private Integer Blocksize;
    @Component(name = "Count", type = "LongInt", defaultValue = "", required = false, description = "Total number of items to process. (if applicable).")
    private Integer Count;
    @Component(name = "Current", type = "LongInt", defaultValue = "", required = false, description = "Current item being processed (if applicable).")
    private Integer Current;
    @Component(name = "Data", type = "TBaseData", defaultValue = "", required = true, description = "Reference to more data for this batch job.")
    private Long DataID;
    @Component(name = "Errcount", type = "LongInt", defaultValue = "", required = false, description = "Number of errors encountered.")
    private Integer Errcount;
    @Component(name = "ErrTreshold", type = "SmallInt", defaultValue = "", required = false, description = "Maximum amount of errors allowed before aborting the job (as a percentage %).")
    private Short ErrTreshold;
    @Component(name = "ID", type = "Int64", defaultValue = "", required = false, description = "Unique numerical ID for this object.")
    private Long ID;
    @Component(name = "JobEnd", type = "Int64", defaultValue = "", required = false, description = "Timestamp indicating when job was processed completely.")
    private Long JobEnd;
    @Component(name = "JobStart", type = "Int64", defaultValue = "", required = false, description = "Timestamp indicating when job processing was started.")
    private Long JobStart;
    @Component(name = "JobType", type = "AnsiString", defaultValue = "Unknown", required = true, description = "Type of job.")
    private BatchJob.JobType JobType;
    @Component(name = "Method", type = "AnsiString", defaultValue = "Unknown", required = false, description = "Method to use when handling job (e.g. contact import: force, noforce etc.).")
    private String Method;
    @Component(name = "RefId", type = "Int64", defaultValue = "", required = false, description = "Reference to object being handled (e.g. contact import: the contactslist ID.).")
    private Long RefId;
    @Component(name = "RequestAt", type = "Int64", defaultValue = "", required = false, description = "Timestamp when batch job request was submitted.")
    private Long RequestAt;
    @Component(name = "Status", type = "AnsiString", defaultValue = "Allocated", required = false, description = "Current status of the job. Can be set to Abort to cancel treatment.")
    private String Status;
    @Component(name = "Throttle", type = "LongInt", defaultValue = "", required = false, description = "General purpose processing speed limit indicator.")
    private Integer Throttle;
    /**
     * API Operation "List".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<BatchJob>> List = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<BatchJob>>(BatchJob.class, ResourceOperationTypes.Get);
    /**
     * API Operation "Get".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.RetrieveById<BatchJob>> Get = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.RetrieveById<BatchJob>>(BatchJob.class, ResourceOperationTypes.GetById);
    /**
     * API Operation "Update".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Update<BatchJob>> Update = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Update<BatchJob>>(BatchJob.class, ResourceOperationTypes.Put);
    /**
     * API Operation "Create".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Create<BatchJob>> Create = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Create<BatchJob>>(BatchJob.class, ResourceOperationTypes.Post);

    /**
     * Gets "Timestamp indicating when batch process was last seen alive." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getAliveAt() {
        return AliveAt;
    }

    /**
     * Sets the specified value to "Timestamp indicating when batch process was last seen alive." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public BatchJob setAliveAt(Long value) {
        AliveAt = value;
        return this;
    }

    /**
     * Gets "API key for which this batch job is destined." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getAPIKeyID() {
        return APIKeyID;
    }

    /**
     * Sets the specified value to "API key for which this batch job is destined." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public BatchJob setAPIKeyID(Long value) {
        APIKeyID = value;
        return this;
    }

    /**
     * Gets "Size of processing blocks (e.g. number of contacts to process as one block in a contact import job)." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Integer getBlocksize() {
        return Blocksize;
    }

    /**
     * Sets the specified value to "Size of processing blocks (e.g. number of contacts to process as one block in a contact import job)." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public BatchJob setBlocksize(Integer value) {
        Blocksize = value;
        return this;
    }

    /**
     * Gets "Total number of items to process. (if applicable)." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Integer getCount() {
        return Count;
    }

    /**
     * Sets the specified value to "Total number of items to process. (if applicable)." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public BatchJob setCount(Integer value) {
        Count = value;
        return this;
    }

    /**
     * Gets "Current item being processed (if applicable)." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Integer getCurrent() {
        return Current;
    }

    /**
     * Sets the specified value to "Current item being processed (if applicable)." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public BatchJob setCurrent(Integer value) {
        Current = value;
        return this;
    }

    /**
     * Gets "Reference to more data for this batch job." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getDataID() {
        return DataID;
    }

    /**
     * Sets the specified value to "Reference to more data for this batch job." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public BatchJob setDataID(Long value) {
        DataID = value;
        return this;
    }

    /**
     * Gets "Number of errors encountered." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Integer getErrcount() {
        return Errcount;
    }

    /**
     * Sets the specified value to "Number of errors encountered." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public BatchJob setErrcount(Integer value) {
        Errcount = value;
        return this;
    }

    /**
     * Gets "Maximum amount of errors allowed before aborting the job (as a percentage %)." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Short getErrTreshold() {
        return ErrTreshold;
    }

    /**
     * Sets the specified value to "Maximum amount of errors allowed before aborting the job (as a percentage %)." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public BatchJob setErrTreshold(Short value) {
        ErrTreshold = value;
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
    public BatchJob setID(Long value) {
        ID = value;
        return this;
    }

    /**
     * Gets "Timestamp indicating when job was processed completely." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getJobEnd() {
        return JobEnd;
    }

    /**
     * Sets the specified value to "Timestamp indicating when job was processed completely." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public BatchJob setJobEnd(Long value) {
        JobEnd = value;
        return this;
    }

    /**
     * Gets "Timestamp indicating when job processing was started." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getJobStart() {
        return JobStart;
    }

    /**
     * Sets the specified value to "Timestamp indicating when job processing was started." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public BatchJob setJobStart(Long value) {
        JobStart = value;
        return this;
    }

    /**
     * Gets "Type of job." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public BatchJob.JobType getJobType() {
        return JobType;
    }

    /**
     * Sets the specified value to "Type of job." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public BatchJob setJobType(BatchJob.JobType value) {
        JobType = value;
        return this;
    }

    /**
     * Gets "Method to use when handling job (e.g. contact import: force, noforce etc.)." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getMethod() {
        return Method;
    }

    /**
     * Sets the specified value to "Method to use when handling job (e.g. contact import: force, noforce etc.)." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public BatchJob setMethod(String value) {
        Method = value;
        return this;
    }

    /**
     * Gets "Reference to object being handled (e.g. contact import: the contactslist ID.)." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getRefId() {
        return RefId;
    }

    /**
     * Sets the specified value to "Reference to object being handled (e.g. contact import: the contactslist ID.)." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public BatchJob setRefId(Long value) {
        RefId = value;
        return this;
    }

    /**
     * Gets "Timestamp when batch job request was submitted." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Long getRequestAt() {
        return RequestAt;
    }

    /**
     * Sets the specified value to "Timestamp when batch job request was submitted." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public BatchJob setRequestAt(Long value) {
        RequestAt = value;
        return this;
    }

    /**
     * Gets "Current status of the job. Can be set to Abort to cancel treatment." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getStatus() {
        return Status;
    }

    /**
     * Sets the specified value to "Current status of the job. Can be set to Abort to cancel treatment." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public BatchJob setStatus(String value) {
        Status = value;
        return this;
    }

    /**
     * Gets "General purpose processing speed limit indicator." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Integer getThrottle() {
        return Throttle;
    }

    /**
     * Sets the specified value to "General purpose processing speed limit indicator." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public BatchJob setThrottle(Integer value) {
        Throttle = value;
        return this;
    }

    public String toString() {
        return ((BatchJob.class.getSimpleName()+"#")+ this.getID());
    }


    /**
     * Enumeration defining allowed values for "JobType"(Type of job.) MailJet API property.
     * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:20 CEST 2014.
     * 
     */
    public static enum JobType {


        /**
         * Value "Contact list import csv".
         * 
         */
        @EnumValue("Contact list import csv")
        CONTACT_LIST_IMPORT_CSV,

        /**
         * Value "Contact list import free format".
         * 
         */
        @EnumValue("Contact list import free format")
        CONTACT_LIST_IMPORT_FREE_FORMAT,

        /**
         * Value "Send newsletter".
         * 
         */
        @EnumValue("Send newsletter")
        SEND_NEWSLETTER,

        /**
         * Value "Send newsletter test".
         * 
         */
        @EnumValue("Send newsletter test")
        SEND_NEWSLETTER_TEST,

        /**
         * Value "Contacts export".
         * 
         */
        @EnumValue("Contacts export")
        CONTACTS_EXPORT,

        /**
         * Value "AXNL".
         * 
         */
        @EnumValue("AXNL")
        AXNL,

        /**
         * Value "AXNLTest".
         * 
         */
        @EnumValue("AXNLTest")
        AXNLTEST,

        /**
         * Value "AXNLAutoFinish".
         * 
         */
        @EnumValue("AXNLAutoFinish")
        AXNLAUTOFINISH,

        /**
         * Value "AXNLReminder".
         * 
         */
        @EnumValue("AXNLReminder")
        AXNLREMINDER;

    }

}
