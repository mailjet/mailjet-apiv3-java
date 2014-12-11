package com.mailjet.api.gen.meta;

import java.util.ArrayList;
import java.util.List;

public class ComponentMetadata {
	private String DataType;
	private String DefaultValue;
	private String Description;
	private Boolean IsRequired;
	private String Name;
	private List<String> AllowedValues = new ArrayList<String>();
	
	public ComponentMetadata() {
		
	}
	
	
	
	public ComponentMetadata(String dataType, String defaultValue,
			String description, Boolean isRequired, String name,
			List<String> allowedValues) {
		DataType = dataType;
		DefaultValue = defaultValue;
		Description = description;
		IsRequired = isRequired;
		Name = name;
		AllowedValues = allowedValues;
	}



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
