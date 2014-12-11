package com.mailjet.api.model.v3.customtypes;

import java.util.List;

public final class Filter{
	private String DataType;
	private String DefaultValue;
	private String Description;
	private Boolean IsRequired;
	private String Name;
	private List<String> AllowedValues;
	
	public String getDataType() {
		return DataType;
	}

	public String getDefaultValue() {
		return DefaultValue;
	}

	public String getDescription() {
		return Description;
	}

	public Boolean getIsRequired() {
		return IsRequired;
	}

	public String getName() {
		return Name;
	}
	
	public List<String> getAllowedValues() {
		return AllowedValues;
	}
}
