
package com.mailjet.api.client.model;

import com.mailjet.api.client.model.metadata.EnumValue;


/**
 * Enumeration defining allowed values for "Runlevel"(Runlevel, used to indicate data is migrated and reduced performance is expected.) MailJet API property.
 * Automatically generated using the MailJet API metadata on Wed Nov 13 16:15:29 EET 2013.
 * 
 */
public enum TRunLevel {


    /**
     * Value "Normal".
     * 
     */
    @EnumValue("Normal")
    NORMAL,

    /**
     * Value "Softlock".
     * 
     */
    @EnumValue("Softlock")
    SOFTLOCK,

    /**
     * Value "Hardlock".
     * 
     */
    @EnumValue("Hardlock")
    HARDLOCK;

}
