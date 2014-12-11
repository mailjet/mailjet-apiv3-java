
package com.mailjet.api.model.v3.widget;

import com.mailjet.api.client.model.MailJetResourceFilter;


/**
 * Class representing filter for  "widget" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:21 CEST 2014.
 * 
 */
public final class WidgetFilter<DataType >
    extends MailJetResourceFilter<Widget, DataType>
{

    /**
     * Only retrieve widgets where IsActive equals the specified value.
     * 
     */
    public final static WidgetFilter<Boolean> ACTIVE = new WidgetFilter<Boolean>("active", Boolean.class);
    /**
     * Only retrieve widgets for the specified API Key.
     * 
     */
    public final static WidgetFilter<Long> APIKEY = new WidgetFilter<Long>("APIKey", Long.class);
    /**
     * Only retrieve widgets for the specified contacts list.
     * 
     */
    public final static WidgetFilter<Long> CONTACTSLIST = new WidgetFilter<Long>("ContactsList", Long.class);
    /**
     * Only retrieve widget resources for which Locale equals the specified value.
     * 
     */
    public final static WidgetFilter<String> LOCALE = new WidgetFilter<String>("Locale", String.class);
    /**
     * Only retrieve widgets for the specified message template.
     * 
     */
    public final static WidgetFilter<Long> MESSAGETEMPLATE = new WidgetFilter<Long>("MessageTemplate", Long.class);
    /**
     * Only retrieve widgets for the specified sender.
     * 
     */
    public final static WidgetFilter<Long> SENDER = new WidgetFilter<Long>("Sender", Long.class);

    private WidgetFilter(String name, Class<?> type) {
        super(name, type);
    }

}
