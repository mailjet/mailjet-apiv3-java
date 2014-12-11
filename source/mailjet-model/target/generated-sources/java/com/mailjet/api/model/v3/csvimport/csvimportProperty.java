
package com.mailjet.api.model.v3.csvimport;

import java.util.Date;
import com.mailjet.api.client.model.MailJetKeyProperty;
import com.mailjet.api.client.model.MailJetResourceProperty;


/**
 * Class defining property constants for "csvimport" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:21 CEST 2014.
 * 
 */
public final class csvimportProperty<DataType >
    extends MailJetResourceProperty<csvimport, DataType>
{

    /**
     * Timestamp when the CSV import background job reported a status.
     * 
     */
    public final static csvimportProperty<Date> ALIVEAT = new csvimportProperty<Date>("AliveAt", Date.class);
    /**
     * Contacts list for which the import should be started.
     * 
     */
    public final static csvimportProperty<Long> CONTACTSLISTID = new csvimportProperty<Long>("ContactsListID", Long.class);
    /**
     * Number of contacts detected in the CSV file.
     * 
     */
    public final static csvimportProperty<Integer> COUNT = new csvimportProperty<Integer>("Count", Integer.class);
    /**
     * Number of processed contacts.
     * 
     */
    public final static csvimportProperty<Integer> CURRENT = new csvimportProperty<Integer>("Current", Integer.class);
    /**
     * ID of uploaded CSV data file.
     * 
     */
    public final static csvimportProperty<Long> DATAID = new csvimportProperty<Long>("DataID", Long.class);
    /**
     * Number of errors encountered so far.
     * 
     */
    public final static csvimportProperty<Integer> ERRCOUNT = new csvimportProperty<Integer>("Errcount", Integer.class);
    /**
     * Maximum number of errors that can occur before the job is aborted.
     * 
     */
    public final static csvimportProperty<Short> ERRTRESHOLD = new csvimportProperty<Short>("ErrTreshold", Short.class);
    /**
     * Unique ID of this CSV import file.
     * 
     */
    public final static csvimportProperty.Key<Long> ID = new csvimportProperty.Key<Long>("ID", Long.class);
    /**
     * a string with a JSON structure describing the import options in effect.
     * 
     */
    public final static csvimportProperty<String> IMPORTOPTIONS = new csvimportProperty<String>("ImportOptions", String.class);
    /**
     * When the job was ended.
     * 
     */
    public final static csvimportProperty<Date> JOBEND = new csvimportProperty<Date>("JobEnd", Date.class);
    /**
     * When the job was started.
     * 
     */
    public final static csvimportProperty<Date> JOBSTART = new csvimportProperty<Date>("JobStart", Date.class);
    /**
     * Method to use when importing a list of contacts.
     * 
     */
    public final static csvimportProperty<String> METHOD = new csvimportProperty<String>("Method", String.class);
    /**
     * Time when the job was registered.
     * 
     */
    public final static csvimportProperty<Date> REQUESTAT = new csvimportProperty<Date>("RequestAt", Date.class);
    /**
     * Current status of the job. If set during POST, the only allowed value is 'Upload'. During PUT, the only allowed value is 'Abort'.
     * 
     */
    public final static csvimportProperty<String> STATUS = new csvimportProperty<String>("Status", String.class);

    private csvimportProperty(String name, Class<?> type) {
        super(name, type);
    }

    public static csvimportProperty<Object> ref(String name) {
        return new csvimportProperty<Object>(name, Object.class);
    }

    public final static class Key<KeyDataType >
        extends MailJetKeyProperty<csvimport, KeyDataType>
    {


        private Key(String name, Class<?> type) {
            super(name, type);
        }

    }

}
