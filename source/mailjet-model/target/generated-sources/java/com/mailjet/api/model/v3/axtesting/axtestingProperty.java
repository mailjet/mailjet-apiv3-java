
package com.mailjet.api.model.v3.axtesting;

import java.math.BigDecimal;
import java.util.Date;
import com.mailjet.api.client.model.MailJetKeyProperty;
import com.mailjet.api.client.model.MailJetResourceProperty;
import com.mailjet.api.model.v3.customtypes.AXTestMode;
import com.mailjet.api.model.v3.customtypes.WinnerMethod;


/**
 * Class defining property constants for "axtesting" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:20 CEST 2014.
 * 
 */
public final class axtestingProperty<DataType >
    extends MailJetResourceProperty<axtesting, DataType>
{

    /**
     * 
     * 
     */
    public final static axtestingProperty<Long> CONTACTLISTID = new axtestingProperty<Long>("ContactListID", Long.class);
    /**
     * 
     * 
     */
    public final static axtestingProperty<Date> CREATEDAT = new axtestingProperty<Date>("CreatedAt", Date.class);
    /**
     * 
     * 
     */
    public final static axtestingProperty<Boolean> DELETED = new axtestingProperty<Boolean>("Deleted", Boolean.class);
    /**
     * 
     * 
     */
    public final static axtestingProperty.Key<Long> ID = new axtestingProperty.Key<Long>("ID", Long.class);
    /**
     * 
     * 
     */
    public final static axtestingProperty<AXTestMode> MODE = new axtestingProperty<AXTestMode>("Mode", AXTestMode.class);
    /**
     * 
     * 
     */
    public final static axtestingProperty<String> NAME = new axtestingProperty<String>("Name", String.class);
    /**
     * 
     * 
     */
    public final static axtestingProperty<BigDecimal> PERCENTAGE = new axtestingProperty<BigDecimal>("Percentage", BigDecimal.class);
    /**
     * 
     * 
     */
    public final static axtestingProperty<Date> REMAINDERAT = new axtestingProperty<Date>("RemainderAt", Date.class);
    /**
     * 
     * 
     */
    public final static axtestingProperty<Long> SEGMENTATIONID = new axtestingProperty<Long>("SegmentationID", Long.class);
    /**
     * 
     * 
     */
    public final static axtestingProperty<Boolean> STARRED = new axtestingProperty<Boolean>("Starred", Boolean.class);
    /**
     * 
     * 
     */
    public final static axtestingProperty<Date> STARTAT = new axtestingProperty<Date>("StartAt", Date.class);
    /**
     * 
     * 
     */
    public final static axtestingProperty<String> STATUS = new axtestingProperty<String>("Status", String.class);
    /**
     * 
     * 
     */
    public final static axtestingProperty<Short> STATUSCODE = new axtestingProperty<Short>("StatusCode", Short.class);
    /**
     * 
     * 
     */
    public final static axtestingProperty<String> STATUSSTRING = new axtestingProperty<String>("StatusString", String.class);
    /**
     * 
     * 
     */
    public final static axtestingProperty<BigDecimal> WINNERCLICKRATE = new axtestingProperty<BigDecimal>("WinnerClickRate", BigDecimal.class);
    /**
     * 
     * 
     */
    public final static axtestingProperty<Integer> WINNERID = new axtestingProperty<Integer>("WinnerID", Integer.class);
    /**
     * 
     * 
     */
    public final static axtestingProperty<WinnerMethod> WINNERMETHOD = new axtestingProperty<WinnerMethod>("WinnerMethod", WinnerMethod.class);
    /**
     * 
     * 
     */
    public final static axtestingProperty<BigDecimal> WINNEROPENRATE = new axtestingProperty<BigDecimal>("WinnerOpenRate", BigDecimal.class);
    /**
     * 
     * 
     */
    public final static axtestingProperty<BigDecimal> WINNERSPAMRATE = new axtestingProperty<BigDecimal>("WinnerSpamRate", BigDecimal.class);
    /**
     * 
     * 
     */
    public final static axtestingProperty<BigDecimal> WINNERUNSUBRATE = new axtestingProperty<BigDecimal>("WinnerUnsubRate", BigDecimal.class);

    private axtestingProperty(String name, Class<?> type) {
        super(name, type);
    }

    public static axtestingProperty<Object> ref(String name) {
        return new axtestingProperty<Object>(name, Object.class);
    }

    public final static class Key<KeyDataType >
        extends MailJetKeyProperty<axtesting, KeyDataType>
    {


        private Key(String name, Class<?> type) {
            super(name, type);
        }

    }

}
