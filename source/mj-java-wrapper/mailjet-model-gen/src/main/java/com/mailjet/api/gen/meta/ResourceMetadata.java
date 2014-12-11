package com.mailjet.api.gen.meta;

import java.util.Set;

public final class ResourceMetadata {
	private String Description;
	private Boolean IsReadOnly;
	private String Name;
	private String PublicOperations;
	private String UniqueKey;

	private Set<FilterMetadata> Filters;
	private Set<PropertyMetadata> Properties;

	public String getDescription() {
		return Description;
	}

	public Boolean getIsReadOnly() {
		return IsReadOnly;
	}

	public String getName() {
		return Name;
	}

	public String getPublicOperations() {
		return PublicOperations;
	}

	public String getUniqueKey() {
		return UniqueKey;
	}

	public Set<FilterMetadata> getFilters() {
		return Filters;
	}

	public Set<PropertyMetadata> getProperties() {
		return Properties;
	}
	
	public PropertyMetadata getProperty(String name) {
		for (PropertyMetadata property : Properties) {
			if(property.getName().equals(name)){
				return property;
			}
		}
		return null;
	}
	
	public FilterMetadata getFilter(String name) {
		for (FilterMetadata filter : Filters) {
			if(filter.getName().equals(name)){
				return filter;
			}
		}
		return null;
	}
	
	public boolean isKeyProperty(PropertyMetadata metadata) {
		if("ID".equals(metadata.getName()) && getProperty("ID") != null){
			return true;
		}
		String uk = getUniqueKey();
		if(uk != null && !(uk.length() == 0)){
			String[] uniqueKeys = uk.split("\\|");
			for (String keyName : uniqueKeys) {
				if(metadata.getName().equals(keyName)){
					return true;
				}
			}
		}
		return false;
	}

}
