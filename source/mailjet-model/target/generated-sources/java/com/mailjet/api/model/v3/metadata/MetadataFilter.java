
package com.mailjet.api.model.v3.metadata;

import com.mailjet.api.client.model.MailJetResourceFilter;


/**
 * Class representing filter for  "metadata" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
 * 
 */
public final class MetadataFilter<DataType >
    extends MailJetResourceFilter<Metadata, DataType>
{

    /**
     * Show only public resource.
     * 
     */
    public final static MetadataFilter<Boolean> PUBLICRESOURCES = new MetadataFilter<Boolean>("PublicResources", Boolean.class);
    /**
     * Show only read-only resources.
     * 
     */
    public final static MetadataFilter<Boolean> READONLYRESOURCES = new MetadataFilter<Boolean>("ReadOnlyResources", Boolean.class);
    /**
     * Show only resource with given name.
     * 
     */
    public final static MetadataFilter<String> RESOURCENAME = new MetadataFilter<String>("ResourceName", String.class);

    private MetadataFilter(String name, Class<?> type) {
        super(name, type);
    }

}
