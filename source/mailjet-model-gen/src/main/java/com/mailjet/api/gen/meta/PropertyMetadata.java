package com.mailjet.api.gen.meta;

import java.util.List;


public class PropertyMetadata extends ComponentMetadata{
	public PropertyMetadata() {
		
	}
	
	public PropertyMetadata(String dataType, String defaultValue,
			String description, Boolean isRequired, String name,
			List<String> allowedValues) {
		super(dataType, defaultValue, description, isRequired, name, allowedValues);
	}
}
