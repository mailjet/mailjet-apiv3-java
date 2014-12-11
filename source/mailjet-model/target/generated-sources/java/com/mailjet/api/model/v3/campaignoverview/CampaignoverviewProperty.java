
package com.mailjet.api.model.v3.campaignoverview;

import com.mailjet.api.client.model.MailJetKeyProperty;
import com.mailjet.api.client.model.MailJetResourceProperty;


/**
 * Class defining property constants for "campaignoverview" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:20 CEST 2014.
 * 
 */
public final class CampaignoverviewProperty<DataType >
    extends MailJetResourceProperty<Campaignoverview, DataType>
{

    /**
     * 
     * 
     */
    public final static CampaignoverviewProperty<Long> CLICKEDCOUNT = new CampaignoverviewProperty<Long>("ClickedCount", Long.class);
    /**
     * 
     * 
     */
    public final static CampaignoverviewProperty<String> EDITMODE = new CampaignoverviewProperty<String>("EditMode", String.class);
    /**
     * 
     * 
     */
    public final static CampaignoverviewProperty<String> EDITTYPE = new CampaignoverviewProperty<String>("EditType", String.class);
    /**
     * 
     * 
     */
    public final static CampaignoverviewProperty.Key<Long> ID = new CampaignoverviewProperty.Key<Long>("ID", Long.class);
    /**
     * 
     * 
     */
    public final static CampaignoverviewProperty<String> IDTYPE = new CampaignoverviewProperty<String>("IDType", String.class);
    /**
     * 
     * 
     */
    public final static CampaignoverviewProperty<Long> OPENEDCOUNT = new CampaignoverviewProperty<Long>("OpenedCount", Long.class);
    /**
     * 
     * 
     */
    public final static CampaignoverviewProperty<Long> PROCESSEDCOUNT = new CampaignoverviewProperty<Long>("ProcessedCount", Long.class);
    /**
     * 
     * 
     */
    public final static CampaignoverviewProperty<Long> SENDTIMESTART = new CampaignoverviewProperty<Long>("SendTimeStart", Long.class);
    /**
     * 
     * 
     */
    public final static CampaignoverviewProperty<Boolean> STARRED = new CampaignoverviewProperty<Boolean>("Starred", Boolean.class);
    /**
     * 
     * 
     */
    public final static CampaignoverviewProperty<Integer> STATUS = new CampaignoverviewProperty<Integer>("Status", Integer.class);
    /**
     * 
     * 
     */
    public final static CampaignoverviewProperty<String> SUBJECT = new CampaignoverviewProperty<String>("Subject", String.class);
    /**
     * 
     * 
     */
    public final static CampaignoverviewProperty<String> TITLE = new CampaignoverviewProperty<String>("Title", String.class);

    private CampaignoverviewProperty(String name, Class<?> type) {
        super(name, type);
    }

    public static CampaignoverviewProperty<Object> ref(String name) {
        return new CampaignoverviewProperty<Object>(name, Object.class);
    }

    public final static class Key<KeyDataType >
        extends MailJetKeyProperty<Campaignoverview, KeyDataType>
    {


        private Key(String name, Class<?> type) {
            super(name, type);
        }

    }

}
