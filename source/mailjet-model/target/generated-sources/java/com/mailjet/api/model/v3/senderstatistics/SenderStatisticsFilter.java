
package com.mailjet.api.model.v3.senderstatistics;

import com.mailjet.api.client.model.MailJetResourceFilter;


/**
 * Class representing filter for  "senderstatistics" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
 * 
 */
public final class SenderStatisticsFilter<DataType >
    extends MailJetResourceFilter<SenderStatistics, DataType>
{

    /**
     * Only retrieve sender statistics for which the sender email address domain matches the specified value.
     * 
     */
    public final static SenderStatisticsFilter<String> DOMAIN = new SenderStatisticsFilter<String>("domain", String.class);
    /**
     * Only retrieve senders statistics for which the sender email address' local part matches the specified value.
     * 
     */
    public final static SenderStatisticsFilter<String> EMAIL = new SenderStatisticsFilter<String>("Email", String.class);
    /**
     * Only retrieve senderstatistics resources for which Sender equals the specified value.
     * 
     */
    public final static SenderStatisticsFilter<Long> SENDER = new SenderStatisticsFilter<Long>("Sender", Long.class);

    private SenderStatisticsFilter(String name, Class<?> type) {
        super(name, type);
    }

}
