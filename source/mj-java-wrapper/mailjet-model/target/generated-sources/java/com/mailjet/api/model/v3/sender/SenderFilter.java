
package com.mailjet.api.model.v3.sender;

import com.mailjet.api.client.model.MailJetResourceFilter;


/**
 * Class representing filter for  "sender" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:21 CEST 2014.
 * 
 */
public final class SenderFilter<DataType >
    extends MailJetResourceFilter<Sender, DataType>
{

    /**
     * 
     * 
     */
    public final static SenderFilter<Long> DNSID = new SenderFilter<Long>("DnsID", Long.class);
    /**
     * Only retrieve senders for which the email address domain matches the specified value.
     * 
     */
    public final static SenderFilter<String> DOMAIN = new SenderFilter<String>("Domain", String.class);
    /**
     * Only retrieve sender resources for which Email equals the specified value.
     * 
     */
    public final static SenderFilter<String> EMAIL = new SenderFilter<String>("Email", String.class);
    /**
     * Only retrieve senders for which the email address' local part matches the specified value.
     * 
     */
    public final static SenderFilter<String> LOCALPART = new SenderFilter<String>("LocalPart", String.class);
    /**
     * Also retrieve sender resources which were deleted.
     * 
     */
    public final static SenderFilter<Boolean> SHOWDELETED = new SenderFilter<Boolean>("ShowDeleted", Boolean.class);
    /**
     * Only retrieve sender resources for which Status equals the specified value.
     * 
     */
    public final static SenderFilter<String> STATUS = new SenderFilter<String>("Status", String.class);

    private SenderFilter(String name, Class<?> type) {
        super(name, type);
    }

}
