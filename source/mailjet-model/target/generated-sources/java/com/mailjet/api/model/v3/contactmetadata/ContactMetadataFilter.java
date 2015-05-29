
package com.mailjet.api.model.v3.contactmetadata;

import com.mailjet.api.client.model.MailJetResourceFilter;


/**
 * Class representing filter for  "contactmetadata" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
 * 
 */
public final class ContactMetadataFilter<DataType >
    extends MailJetResourceFilter<ContactMetadata, DataType>
{

    /**
     * Only retrieve contactmetadata resources for which DataType equals the specified value.
     * 
     */
    public final static ContactMetadataFilter<String> DATATYPE = new ContactMetadataFilter<String>("DataType", String.class);
    /**
     * Only retrieve contactmetadata resources for which Namespace equals the specified value.
     * 
     */
    public final static ContactMetadataFilter<String> NAMESPACE = new ContactMetadataFilter<String>("Namespace", String.class);

    private ContactMetadataFilter(String name, Class<?> type) {
        super(name, type);
    }

}
