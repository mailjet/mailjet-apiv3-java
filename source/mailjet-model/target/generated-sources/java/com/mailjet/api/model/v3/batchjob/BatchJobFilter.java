
package com.mailjet.api.model.v3.batchjob;

import java.util.Date;
import com.mailjet.api.client.model.MailJetResourceFilter;


/**
 * Class representing filter for  "batchjob" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
 * 
 */
public final class BatchJobFilter<DataType >
    extends MailJetResourceFilter<BatchJob, DataType>
{

    /**
     * Only retrieve batchjob resources for which APIKey ID equals the specified value.
     * 
     */
    public final static BatchJobFilter<Long> APIKEY = new BatchJobFilter<Long>("APIKey", Long.class);
    /**
     * Only retrieve batchjob resources for which Data ID equals the specified value.
     * 
     */
    public final static BatchJobFilter<Long> DATA = new BatchJobFilter<Long>("Data", Long.class);
    /**
     * Only retrieve batchjob resources for which JobType equals the specified value.
     * 
     */
    public final static BatchJobFilter<BatchJob.JobType> JOBTYPE = new BatchJobFilter<BatchJob.JobType>("JobType", BatchJob.JobType.class);
    /**
     * Maximum value for JobEnd Timestamp.
     * 
     */
    public final static BatchJobFilter<Date> MAXJOBEND = new BatchJobFilter<Date>("MaxJobEnd", Date.class);
    /**
     * Maximum value for JobStart Timestamp.
     * 
     */
    public final static BatchJobFilter<Date> MAXJOBSTART = new BatchJobFilter<Date>("MaxJobStart", Date.class);
    /**
     * Maximum value for MaxRequestAt Timestamp.
     * 
     */
    public final static BatchJobFilter<Date> MAXREQUESTAT = new BatchJobFilter<Date>("MaxRequestAt", Date.class);
    /**
     * Only retrieve batchjob resources for which Method equals the specified value.
     * 
     */
    public final static BatchJobFilter<String> METHOD = new BatchJobFilter<String>("Method", String.class);
    /**
     * Minimum value for JobEnd Timestamp.
     * 
     */
    public final static BatchJobFilter<Date> MINJOBEND = new BatchJobFilter<Date>("MinJobEnd", Date.class);
    /**
     * Minimum value for JobStart Timestamp.
     * 
     */
    public final static BatchJobFilter<Date> MINJOBSTART = new BatchJobFilter<Date>("MinJobStart", Date.class);
    /**
     * Minimum value for MaxRequestAt Timestamp.
     * 
     */
    public final static BatchJobFilter<Date> MINREQUESTAT = new BatchJobFilter<Date>("MinRequestAt", Date.class);
    /**
     * Only retrieve batchjob resources for which RefID equals the specified value.
     * 
     */
    public final static BatchJobFilter<Long> REFID = new BatchJobFilter<Long>("RefID", Long.class);
    /**
     * Only retrieve batchjob resources for which Status equals the specified value.
     * 
     */
    public final static BatchJobFilter<String> STATUS = new BatchJobFilter<String>("Status", String.class);

    private BatchJobFilter(String name, Class<?> type) {
        super(name, type);
    }

}
