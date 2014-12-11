
package com.mailjet.api.model.v3.batchjob;

import com.mailjet.api.client.model.MailJetKeyProperty;
import com.mailjet.api.client.model.MailJetResourceProperty;


/**
 * Class defining property constants for "batchjob" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:20 CEST 2014.
 * 
 */
public final class BatchJobProperty<DataType >
    extends MailJetResourceProperty<BatchJob, DataType>
{

    /**
     * Timestamp indicating when batch process was last seen alive.
     * 
     */
    public final static BatchJobProperty<Long> ALIVEAT = new BatchJobProperty<Long>("AliveAt", Long.class);
    /**
     * API key for which this batch job is destined.
     * 
     */
    public final static BatchJobProperty<Long> APIKEYID = new BatchJobProperty<Long>("APIKeyID", Long.class);
    /**
     * Size of processing blocks (e.g. number of contacts to process as one block in a contact import job).
     * 
     */
    public final static BatchJobProperty<Integer> BLOCKSIZE = new BatchJobProperty<Integer>("Blocksize", Integer.class);
    /**
     * Total number of items to process. (if applicable).
     * 
     */
    public final static BatchJobProperty<Integer> COUNT = new BatchJobProperty<Integer>("Count", Integer.class);
    /**
     * Current item being processed (if applicable).
     * 
     */
    public final static BatchJobProperty<Integer> CURRENT = new BatchJobProperty<Integer>("Current", Integer.class);
    /**
     * Reference to more data for this batch job.
     * 
     */
    public final static BatchJobProperty<Long> DATAID = new BatchJobProperty<Long>("DataID", Long.class);
    /**
     * Number of errors encountered.
     * 
     */
    public final static BatchJobProperty<Integer> ERRCOUNT = new BatchJobProperty<Integer>("Errcount", Integer.class);
    /**
     * Maximum amount of errors allowed before aborting the job (as a percentage %).
     * 
     */
    public final static BatchJobProperty<Short> ERRTRESHOLD = new BatchJobProperty<Short>("ErrTreshold", Short.class);
    /**
     * Unique numerical ID for this object.
     * 
     */
    public final static BatchJobProperty.Key<Long> ID = new BatchJobProperty.Key<Long>("ID", Long.class);
    /**
     * Timestamp indicating when job was processed completely.
     * 
     */
    public final static BatchJobProperty<Long> JOBEND = new BatchJobProperty<Long>("JobEnd", Long.class);
    /**
     * Timestamp indicating when job processing was started.
     * 
     */
    public final static BatchJobProperty<Long> JOBSTART = new BatchJobProperty<Long>("JobStart", Long.class);
    /**
     * Type of job.
     * 
     */
    public final static BatchJobProperty<BatchJob.JobType> JOBTYPE = new BatchJobProperty<BatchJob.JobType>("JobType", BatchJob.JobType.class);
    /**
     * Method to use when handling job (e.g. contact import: force, noforce etc.).
     * 
     */
    public final static BatchJobProperty<String> METHOD = new BatchJobProperty<String>("Method", String.class);
    /**
     * Reference to object being handled (e.g. contact import: the contactslist ID.).
     * 
     */
    public final static BatchJobProperty<Long> REFID = new BatchJobProperty<Long>("RefId", Long.class);
    /**
     * Timestamp when batch job request was submitted.
     * 
     */
    public final static BatchJobProperty<Long> REQUESTAT = new BatchJobProperty<Long>("RequestAt", Long.class);
    /**
     * Current status of the job. Can be set to Abort to cancel treatment.
     * 
     */
    public final static BatchJobProperty<String> STATUS = new BatchJobProperty<String>("Status", String.class);
    /**
     * General purpose processing speed limit indicator.
     * 
     */
    public final static BatchJobProperty<Integer> THROTTLE = new BatchJobProperty<Integer>("Throttle", Integer.class);

    private BatchJobProperty(String name, Class<?> type) {
        super(name, type);
    }

    public static BatchJobProperty<Object> ref(String name) {
        return new BatchJobProperty<Object>(name, Object.class);
    }

    public final static class Key<KeyDataType >
        extends MailJetKeyProperty<BatchJob, KeyDataType>
    {


        private Key(String name, Class<?> type) {
            super(name, type);
        }

    }

}
