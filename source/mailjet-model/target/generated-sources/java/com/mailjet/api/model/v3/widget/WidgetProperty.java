
package com.mailjet.api.model.v3.widget;

import com.mailjet.api.client.model.MailJetKeyProperty;
import com.mailjet.api.client.model.MailJetResourceProperty;


/**
 * Class defining property constants for "widget" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:21 CEST 2014.
 * 
 */
public final class WidgetProperty<DataType >
    extends MailJetResourceProperty<Widget, DataType>
{

    /**
     * Timestamp when widget was created.
     * 
     */
    public final static WidgetProperty<Long> CREATEDAT = new WidgetProperty<Long>("CreatedAt", Long.class);
    /**
     * Reference to Sender address for this widget.
     * 
     */
    public final static WidgetProperty<Long> FROMID = new WidgetProperty<Long>("FromID", Long.class);
    /**
     * Unique numerical ID for this object.
     * 
     */
    public final static WidgetProperty.Key<Long> ID = new WidgetProperty.Key<Long>("ID", Long.class);
    /**
     * Is the widget still active.
     * 
     */
    public final static WidgetProperty<Boolean> ISACTIVE = new WidgetProperty<Boolean>("IsActive", Boolean.class);
    /**
     * Contactslist for which this widget handles subscriptions.
     * 
     */
    public final static WidgetProperty<Long> LISTID = new WidgetProperty<Long>("ListID", Long.class);
    /**
     * Locale in which the information in this record is recorded.
     * 
     */
    public final static WidgetProperty<String> LOCALE = new WidgetProperty<String>("Locale", String.class);
    /**
     * Name for this widget.
     * 
     */
    public final static WidgetProperty<String> NAME = new WidgetProperty<String>("Name", String.class);
    /**
     * Reply To email address for this widhet.
     * 
     */
    public final static WidgetProperty<String> REPLYTO = new WidgetProperty<String>("Replyto", String.class);
    /**
     * Sender name for this widget.
     * 
     */
    public final static WidgetProperty<String> SENDERNAME = new WidgetProperty<String>("Sendername", String.class);
    /**
     * Subject for this widget.
     * 
     */
    public final static WidgetProperty<String> SUBJECT = new WidgetProperty<String>("Subject", String.class);
    /**
     * Message to send when sending mail for this widget.
     * 
     */
    public final static WidgetProperty<Long> TEMPLATEID = new WidgetProperty<Long>("TemplateID", Long.class);

    private WidgetProperty(String name, Class<?> type) {
        super(name, type);
    }

    public static WidgetProperty<Object> ref(String name) {
        return new WidgetProperty<Object>(name, Object.class);
    }

    public final static class Key<KeyDataType >
        extends MailJetKeyProperty<Widget, KeyDataType>
    {


        private Key(String name, Class<?> type) {
            super(name, type);
        }

    }

}
