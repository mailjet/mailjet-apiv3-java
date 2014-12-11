
package com.mailjet.api.model.v3.contactstatistics;

import java.util.Date;
import com.mailjet.api.client.model.MailJetResourceFilter;


/**
 * Class representing filter for  "contactstatistics" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:21 CEST 2014.
 * 
 */
public final class ContactStatisticsFilter<DataType >
    extends MailJetResourceFilter<ContactStatistics, DataType>
{

    /**
     * Only retrieve contacts that have blocked messages.
     * 
     */
    public final static ContactStatisticsFilter<Boolean> BLOCKED = new ContactStatisticsFilter<Boolean>("Blocked", Boolean.class);
    /**
     * Only retrieve contacts that have bounced messages.
     * 
     */
    public final static ContactStatisticsFilter<Boolean> BOUNCED = new ContactStatisticsFilter<Boolean>("Bounced", Boolean.class);
    /**
     * Only retrieve contacts that have clicks registered for messages.
     * 
     */
    public final static ContactStatisticsFilter<Boolean> CLICK = new ContactStatisticsFilter<Boolean>("Click", Boolean.class);
    /**
     * Only retrieve Contactstatistics resources for which LastActivityAt equals the specified value.
     * 
     */
    public final static ContactStatisticsFilter<Date> LASTACTIVITYAT = new ContactStatisticsFilter<Date>("LastActivityAt", Date.class);
    /**
     * Only retrieve contacts that have LastActivityAt less than this value.
     * 
     */
    public final static ContactStatisticsFilter<Date> MAXLASTACTIVITYAT = new ContactStatisticsFilter<Date>("MaxLastActivityAt", Date.class);
    /**
     * Only retrieve contacts that have LastActivityAt larger than this value.
     * 
     */
    public final static ContactStatisticsFilter<Date> MINLASTACTIVITYAT = new ContactStatisticsFilter<Date>("MinLastActivityAt", Date.class);
    /**
     * Only retrieve contacts that have opens registered for messages.
     * 
     */
    public final static ContactStatisticsFilter<Boolean> OPEN = new ContactStatisticsFilter<Boolean>("Open", Boolean.class);
    /**
     * Only retrieve contacts that have queued messages.
     * 
     */
    public final static ContactStatisticsFilter<Boolean> QUEUED = new ContactStatisticsFilter<Boolean>("Queued", Boolean.class);
    /**
     * Only retrieve contacts that have sent messages.
     * 
     */
    public final static ContactStatisticsFilter<Boolean> SENT = new ContactStatisticsFilter<Boolean>("Sent", Boolean.class);
    /**
     * Only retrieve contacts that have spam complaints.
     * 
     */
    public final static ContactStatisticsFilter<Boolean> SPAM = new ContactStatisticsFilter<Boolean>("Spam", Boolean.class);
    /**
     * Only retrieve contactstatistics resources for which Unsubscribed is nonzero.
     * 
     */
    public final static ContactStatisticsFilter<Boolean> UNSUBSCRIBED = new ContactStatisticsFilter<Boolean>("Unsubscribed", Boolean.class);

    private ContactStatisticsFilter(String name, Class<?> type) {
        super(name, type);
    }

}
