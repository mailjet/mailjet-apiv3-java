
package com.mailjet.api.model.v3.metadata;

import com.mailjet.api.client.MailJetApiService;
import com.mailjet.api.client.model.ResourceOperationTypes;
import com.mailjet.api.client.model.metadata.Component;
import com.mailjet.api.client.model.metadata.Resource;
import com.mailjet.api.model.v3.customtypes.Filter;
import com.mailjet.api.model.v3.customtypes.Property;


/**
 * Class representing "Mailjet API meta data.".
 * 
 * Automatically generated using the MailJet API metadata on Fri Oct 10 15:32:21 CEST 2014.
 * 
 */
@Resource(name = "metadata", description = "Mailjet API meta data.", allowedOperations = {
    ResourceOperationTypes.Get
}, uniquekey = "Name")
public final class Metadata {

    @Component(name = "APIVersion", type = "AnsiString", defaultValue = "", required = false, description = "")
    private String APIVersion;
    @Component(name = "Description", type = "AnsiString", defaultValue = "", required = false, description = "Description of resource.")
    private String Description;
    @Component(name = "Filters", type = "TFilterList", defaultValue = "", required = false, description = "Applicable filters for this resource.")
    private java.util.List<Filter> Filters;
    @Component(name = "IsReadOnly", type = "Boolean", defaultValue = "false", required = false, description = "Is the resource inherently read-only.")
    private Boolean IsReadOnly;
    @Component(name = "Name", type = "AnsiString", defaultValue = "", required = false, description = "Unique name of the resource.")
    private String Name;
    @Component(name = "PrivateOperations", type = "TResourceOps", defaultValue = "", required = false, description = "List of allowed operations in private API.")
    private String PrivateOperations;
    @Component(name = "Properties", type = "TPropertyList", defaultValue = "", required = false, description = "List of properties for this resource.")
    private java.util.List<Property> Properties;
    @Component(name = "PublicOperations", type = "TResourceOps", defaultValue = "", required = false, description = "List of allowed operations in public API.")
    private String PublicOperations;
    @Component(name = "SortInfo", type = "TSortInfoList", defaultValue = "", required = false, description = "Information about the fields on which a list of this resource can be sorted.")
    private java.util.List<Long> SortInfo;
    @Component(name = "UniqueKey", type = "AnsiString", defaultValue = "", required = false, description = "Name of the property which can be used as an alternative unique key in the URL (other than the ID).")
    private String UniqueKey;
    /**
     * API Operation "List".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<Metadata>> List = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Retrieve<Metadata>>(Metadata.class, ResourceOperationTypes.Get);

    /**
     * Gets "" property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getAPIVersion() {
        return APIVersion;
    }

    /**
     * Sets the specified value to "" property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Metadata setAPIVersion(String value) {
        APIVersion = value;
        return this;
    }

    /**
     * Gets "Description of resource." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getDescription() {
        return Description;
    }

    /**
     * Sets the specified value to "Description of resource." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Metadata setDescription(String value) {
        Description = value;
        return this;
    }

    /**
     * Gets "Applicable filters for this resource." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public java.util.List<Filter> getFilters() {
        return Filters;
    }

    /**
     * Sets the specified value to "Applicable filters for this resource." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Metadata setFilters(java.util.List<Filter> value) {
        Filters = value;
        return this;
    }

    /**
     * Gets "Is the resource inherently read-only." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public Boolean getIsReadOnly() {
        return IsReadOnly;
    }

    /**
     * Sets the specified value to "Is the resource inherently read-only." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Metadata setIsReadOnly(Boolean value) {
        IsReadOnly = value;
        return this;
    }

    /**
     * Gets "Unique name of the resource." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getName() {
        return Name;
    }

    /**
     * Sets the specified value to "Unique name of the resource." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Metadata setName(String value) {
        Name = value;
        return this;
    }

    /**
     * Gets "List of allowed operations in private API." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getPrivateOperations() {
        return PrivateOperations;
    }

    /**
     * Sets the specified value to "List of allowed operations in private API." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Metadata setPrivateOperations(String value) {
        PrivateOperations = value;
        return this;
    }

    /**
     * Gets "List of properties for this resource." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public java.util.List<Property> getProperties() {
        return Properties;
    }

    /**
     * Sets the specified value to "List of properties for this resource." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Metadata setProperties(java.util.List<Property> value) {
        Properties = value;
        return this;
    }

    /**
     * Gets "List of allowed operations in public API." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getPublicOperations() {
        return PublicOperations;
    }

    /**
     * Sets the specified value to "List of allowed operations in public API." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Metadata setPublicOperations(String value) {
        PublicOperations = value;
        return this;
    }

    /**
     * Gets "Information about the fields on which a list of this resource can be sorted." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public java.util.List<Long> getSortInfo() {
        return SortInfo;
    }

    /**
     * Sets the specified value to "Information about the fields on which a list of this resource can be sorted." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Metadata setSortInfo(java.util.List<Long> value) {
        SortInfo = value;
        return this;
    }

    /**
     * Gets "Name of the property which can be used as an alternative unique key in the URL (other than the ID)." property.
     * 
     * @return
     *     the value set for the property or null if value is not present
     */
    public String getUniqueKey() {
        return UniqueKey;
    }

    /**
     * Sets the specified value to "Name of the property which can be used as an alternative unique key in the URL (other than the ID)." property.
     * 
     * @param value
     *     the new value for the property
     * @return
     *     not null, the object on which this method was called 
     */
    public Metadata setUniqueKey(String value) {
        UniqueKey = value;
        return this;
    }

}
