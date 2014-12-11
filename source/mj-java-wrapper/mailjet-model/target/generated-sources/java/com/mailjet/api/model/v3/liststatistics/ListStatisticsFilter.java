
package com.mailjet.api.model.v3.liststatistics;

import com.mailjet.api.client.model.MailJetResourceFilter;


/**
 * Class representing filter for  "liststatistics" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:21 CEST 2014.
 * 
 */
public final class ListStatisticsFilter<DataType >
    extends MailJetResourceFilter<ListStatistics, DataType>
{

    /**
     * Filter list address.
     * 
     */
    public final static ListStatisticsFilter<String> ADDRESS = new ListStatisticsFilter<String>("Address", String.class);
    /**
     * Should the ActiveUnsubscribedCount property be calculated?.
     * 
     */
    public final static ListStatisticsFilter<Boolean> CALCACTIVEUNSUB = new ListStatisticsFilter<Boolean>("CalcActiveUnsub", Boolean.class);
    /**
     * Unique numerical ID for this object.
     * 
     */
    public final static ListStatisticsFilter<Long> EXCLUDEID = new ListStatisticsFilter<Long>("ExcludeID", Long.class);
    /**
     * Only retrieve ListStatistics resources for which IsDeleted equals the specified value.
     * 
     */
    public final static ListStatisticsFilter<Boolean> ISDELETED = new ListStatisticsFilter<Boolean>("IsDeleted", Boolean.class);
    /**
     * Only retrieve ListStatistics resources for which Name equals the specified value.
     * 
     */
    public final static ListStatisticsFilter<String> NAME = new ListStatisticsFilter<String>("Name", String.class);

    private ListStatisticsFilter(String name, Class<?> type) {
        super(name, type);
    }

}
