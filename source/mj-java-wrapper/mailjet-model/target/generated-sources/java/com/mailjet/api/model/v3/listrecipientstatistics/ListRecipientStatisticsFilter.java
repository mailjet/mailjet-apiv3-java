
package com.mailjet.api.model.v3.listrecipientstatistics;

import java.util.Date;
import com.mailjet.api.client.model.MailJetResourceFilter;


/**
 * Class representing filter for  "listrecipientstatistics" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:21 CEST 2014.
 * 
 */
public final class ListRecipientStatisticsFilter<DataType >
    extends MailJetResourceFilter<ListRecipientStatistics, DataType>
{

    /**
     * Only retrieve ListRecipient that have blocked messages.
     * 
     */
    public final static ListRecipientStatisticsFilter<Boolean> BLOCKED = new ListRecipientStatisticsFilter<Boolean>("Blocked", Boolean.class);
    /**
     * Only retrieve ListRecipient that have bounced messages.
     * 
     */
    public final static ListRecipientStatisticsFilter<Boolean> BOUNCED = new ListRecipientStatisticsFilter<Boolean>("Bounced", Boolean.class);
    /**
     * Only retrieve ListRecipient that have clicks registered for messages.
     * 
     */
    public final static ListRecipientStatisticsFilter<Boolean> CLICK = new ListRecipientStatisticsFilter<Boolean>("Click", Boolean.class);
    /**
     * Only retrieve ListRecipients for the indicated Contact ID.
     * 
     */
    public final static ListRecipientStatisticsFilter<Long> CONTACT = new ListRecipientStatisticsFilter<Long>("Contact", Long.class);
    /**
     * Only retrieve ListRecipients for the indicated ContactsList ID.
     * 
     */
    public final static ListRecipientStatisticsFilter<Long> CONTACTSLIST = new ListRecipientStatisticsFilter<Long>("ContactsList", Long.class);
    /**
     * Only retrieve listrecipientstatistics resources for which ListRecipient.IsActive equals the specified value.
     * 
     */
    public final static ListRecipientStatisticsFilter<Boolean> ISACTIVE = new ListRecipientStatisticsFilter<Boolean>("IsActive", Boolean.class);
    /**
     * Only retrieve listrecipientstatistics resources for which ListRecipient.IsUnsubscribed equals the specified value.
     * 
     */
    public final static ListRecipientStatisticsFilter<Boolean> ISUNSUBSCRIBED = new ListRecipientStatisticsFilter<Boolean>("IsUnsubscribed", Boolean.class);
    /**
     * Only retrieve Contactstatistics resources for which LastActivityAt equals the specified value.
     * 
     */
    public final static ListRecipientStatisticsFilter<Date> LASTACTIVITYAT = new ListRecipientStatisticsFilter<Date>("LastActivityAt", Date.class);
    /**
     * Only retrieve ListRecipient that have LastActivityAt less than this value.
     * 
     */
    public final static ListRecipientStatisticsFilter<Date> MAXLASTACTIVITYAT = new ListRecipientStatisticsFilter<Date>("MaxLastActivityAt", Date.class);
    /**
     * Only retrieve listrecipientstatistics resources for which ListRecipient.UnsubscribedAt is strictly less than the specified value.
     * 
     */
    public final static ListRecipientStatisticsFilter<Date> MAXUNSUBSCRIBEDAT = new ListRecipientStatisticsFilter<Date>("MaxUnsubscribedAt", Date.class);
    /**
     * Only retrieve ListRecipient that have LastActivityAt larger than this value.
     * 
     */
    public final static ListRecipientStatisticsFilter<Date> MINLASTACTIVITYAT = new ListRecipientStatisticsFilter<Date>("MinLastActivityAt", Date.class);
    /**
     * Only retrieve listrecipientstatistics resources for which ListRecipient.UnsubscribedAt is greater than or equal to the specified value.
     * 
     */
    public final static ListRecipientStatisticsFilter<Date> MINUNSUBSCRIBEDAT = new ListRecipientStatisticsFilter<Date>("MinUnsubscribedAt", Date.class);
    /**
     * Only retrieve ListRecipient that have opens registered for messages.
     * 
     */
    public final static ListRecipientStatisticsFilter<Boolean> OPEN = new ListRecipientStatisticsFilter<Boolean>("Open", Boolean.class);
    /**
     * Only retrieve ListRecipient that have queued messages.
     * 
     */
    public final static ListRecipientStatisticsFilter<Boolean> QUEUED = new ListRecipientStatisticsFilter<Boolean>("Queued", Boolean.class);
    /**
     * Only retrieve ListRecipient that have sent messages.
     * 
     */
    public final static ListRecipientStatisticsFilter<Boolean> SENT = new ListRecipientStatisticsFilter<Boolean>("Sent", Boolean.class);
    /**
     * Show extra data associated with contact. Default is not to show extra data.
     * 
     */
    public final static ListRecipientStatisticsFilter<Boolean> SHOWEXTRADATA = new ListRecipientStatisticsFilter<Boolean>("ShowExtraData", Boolean.class);
    /**
     * Only retrieve ListRecipient that have spam complaints.
     * 
     */
    public final static ListRecipientStatisticsFilter<Boolean> SPAM = new ListRecipientStatisticsFilter<Boolean>("Spam", Boolean.class);
    /**
     * Only retrieve ListRecipienttatistics resources for which Unsubscribed is nonzero.
     * 
     */
    public final static ListRecipientStatisticsFilter<Boolean> UNSUBSCRIBED = new ListRecipientStatisticsFilter<Boolean>("Unsubscribed", Boolean.class);

    private ListRecipientStatisticsFilter(String name, Class<?> type) {
        super(name, type);
    }

}
