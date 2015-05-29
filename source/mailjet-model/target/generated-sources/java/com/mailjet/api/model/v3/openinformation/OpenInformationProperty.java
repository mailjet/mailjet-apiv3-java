
package com.mailjet.api.model.v3.openinformation;

import java.util.Date;
import com.mailjet.api.client.model.MailJetKeyProperty;
import com.mailjet.api.client.model.MailJetResourceProperty;


/**
 * Class defining property constants for "openinformation" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
 * 
 */
public final class OpenInformationProperty<DataType >
    extends MailJetResourceProperty<OpenInformation, DataType>
{

    /**
     * Timestamp indicating when the message arrived.
     * 
     */
    public final static OpenInformationProperty<Date> ARRIVEDAT = new OpenInformationProperty<Date>("ArrivedAt", Date.class);
    /**
     * Reference to Campaign in which message is sent.
     * 
     */
    public final static OpenInformationProperty<Long> CAMPAIGNID = new OpenInformationProperty<Long>("CampaignID", Long.class);
    /**
     * Reference to contact to which message was sent.
     * 
     */
    public final static OpenInformationProperty<Long> CONTACTID = new OpenInformationProperty<Long>("ContactID", Long.class);
    /**
     * Unique numerical ID for this object.
     * 
     */
    public final static OpenInformationProperty.Key<Long> ID = new OpenInformationProperty.Key<Long>("ID", Long.class);
    /**
     * Unique numerical ID for this object.
     * 
     */
    public final static OpenInformationProperty<Long> MESSAGEID = new OpenInformationProperty<Long>("MessageID", Long.class);
    /**
     * Timestamp of when then message was opened by the reader for the first time.
     * 
     */
    public final static OpenInformationProperty<Date> OPENEDAT = new OpenInformationProperty<Date>("OpenedAt", Date.class);
    /**
     * Reference to canonicalized User Agent based on UserAgentFull
     * 
     */
    public final static OpenInformationProperty<Long> USERAGENTID = new OpenInformationProperty<Long>("UserAgentID", Long.class);
    /**
     * Original User Agent string used to view this message.
     * 
     */
    public final static OpenInformationProperty<String> USERAGENTFULL = new OpenInformationProperty<String>("UserAgentFull", String.class);

    private OpenInformationProperty(String name, Class<?> type) {
        super(name, type);
    }

    public static OpenInformationProperty<Object> ref(String name) {
        return new OpenInformationProperty<Object>(name, Object.class);
    }

    public final static class Key<KeyDataType >
        extends MailJetKeyProperty<OpenInformation, KeyDataType>
    {


        private Key(String name, Class<?> type) {
            super(name, type);
        }

    }

}
