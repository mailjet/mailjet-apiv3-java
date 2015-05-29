
package com.mailjet.api.model.v3.contactslist;

import com.mailjet.api.client.model.MailJetResourceFilter;


/**
 * Class representing filter for  "contactslist" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
 * 
 */
public final class ContactsListFilter<DataType >
    extends MailJetResourceFilter<ContactsList, DataType>
{

    /**
     * Only retrieve ContactsList resources for which Address equals the specified value.
     * 
     */
    public final static ContactsListFilter<String> ADDRESS = new ContactsListFilter<String>("Address", String.class);
    /**
     * Exclude ContactsList resources with specified ID from result.
     * 
     */
    public final static ContactsListFilter<Long> EXCLUDEID = new ContactsListFilter<Long>("ExcludeID", Long.class);
    /**
     * Only retrieve ContactsList resources for which IsDeleted equals the specified value.
     * 
     */
    public final static ContactsListFilter<Boolean> ISDELETED = new ContactsListFilter<Boolean>("IsDeleted", Boolean.class);
    /**
     * Only retrieve ContactsList resources for which Name equals the specified value.
     * 
     */
    public final static ContactsListFilter<String> NAME = new ContactsListFilter<String>("Name", String.class);

    private ContactsListFilter(String name, Class<?> type) {
        super(name, type);
    }

}
