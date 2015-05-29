
package com.mailjet.api.model.v3.customtypes;

import com.mailjet.api.client.model.metadata.EnumValue;


/**
 * Enumeration defining allowed values for "EventType"(Type of event.) MailJet API property.
 * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
 * 
 */
public enum MessageEventType {


    /**
     * Value "sent".
     * 
     */
    @EnumValue("sent")
    SENT,

    /**
     * Value "opened".
     * 
     */
    @EnumValue("opened")
    OPENED,

    /**
     * Value "clicked".
     * 
     */
    @EnumValue("clicked")
    CLICKED,

    /**
     * Value "bounced".
     * 
     */
    @EnumValue("bounced")
    BOUNCED,

    /**
     * Value "blocked".
     * 
     */
    @EnumValue("blocked")
    BLOCKED,

    /**
     * Value "unsub".
     * 
     */
    @EnumValue("unsub")
    UNSUB;

}
