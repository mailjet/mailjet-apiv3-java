
package com.mailjet.api.model.v3.metadata;

import java.util.List;
import com.mailjet.api.client.model.MailJetKeyProperty;
import com.mailjet.api.client.model.MailJetResourceProperty;
import com.mailjet.api.model.v3.customtypes.Filter;
import com.mailjet.api.model.v3.customtypes.Property;


/**
 * Class defining property constants for "metadata" MailJet API resource.
 * 
 * Automatically generated using the MailJet API metadata on Fri May 29 16:21:19 CEST 2015.
 * 
 */
public final class MetadataProperty<DataType >
    extends MailJetResourceProperty<Metadata, DataType>
{

    /**
     * 
     * 
     */
    public final static MetadataProperty<List<Long>> ACTIONS = new MetadataProperty<List<Long>>("Actions", List.class);
    /**
     * 
     * 
     */
    public final static MetadataProperty<String> APIVERSION = new MetadataProperty<String>("APIVersion", String.class);
    /**
     * Description of resource.
     * 
     */
    public final static MetadataProperty<String> DESCRIPTION = new MetadataProperty<String>("Description", String.class);
    /**
     * Applicable filters for this resource.
     * 
     */
    public final static MetadataProperty<List<Filter>> FILTERS = new MetadataProperty<List<Filter>>("Filters", List.class);
    /**
     * Is the resource inherently read-only.
     * 
     */
    public final static MetadataProperty<Boolean> ISREADONLY = new MetadataProperty<Boolean>("IsReadOnly", Boolean.class);
    /**
     * Unique name of the resource.
     * 
     */
    public final static MetadataProperty.Key<String> NAME = new MetadataProperty.Key<String>("Name", String.class);
    /**
     * List of allowed operations in private API.
     * 
     */
    public final static MetadataProperty<String> PRIVATEOPERATIONS = new MetadataProperty<String>("PrivateOperations", String.class);
    /**
     * List of properties for this resource.
     * 
     */
    public final static MetadataProperty<List<Property>> PROPERTIES = new MetadataProperty<List<Property>>("Properties", List.class);
    /**
     * List of allowed operations in public API.
     * 
     */
    public final static MetadataProperty<String> PUBLICOPERATIONS = new MetadataProperty<String>("PublicOperations", String.class);
    /**
     * Information about the fields on which a list of this resource can be sorted.
     * 
     */
    public final static MetadataProperty<List<Long>> SORTINFO = new MetadataProperty<List<Long>>("SortInfo", List.class);
    /**
     * Name of the property which can be used as an alternative unique key in the URL (other than the ID).
     * 
     */
    public final static MetadataProperty<String> UNIQUEKEY = new MetadataProperty<String>("UniqueKey", String.class);

    private MetadataProperty(String name, Class<?> type) {
        super(name, type);
    }

    public static MetadataProperty<Object> ref(String name) {
        return new MetadataProperty<Object>(name, Object.class);
    }

    public final static class Key<KeyDataType >
        extends MailJetKeyProperty<Metadata, KeyDataType>
    {


        private Key(String name, Class<?> type) {
            super(name, type);
        }

    }

}
