package com.mailjet.api.gen.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.mailjet.api.gen.CodeGeneratorContext;
import com.mailjet.api.gen.MailJetCodeGenerator;
import com.mailjet.api.gen.meta.ComponentMetadata;
import com.sun.codemodel.ClassType;
import com.sun.codemodel.JAnnotationUse;
import com.sun.codemodel.JCodeModel;
import com.sun.codemodel.JDefinedClass;
import com.sun.codemodel.JEnumConstant;
import com.sun.codemodel.JMod;
import com.sun.codemodel.JType;

public class MailJetBeanEnumTypesGeneratorImpl implements MailJetCodeGenerator<ComponentMetadata>{

	public void generate(ComponentMetadata propertyMetadata, CodeGeneratorContext context) throws Exception {
			JCodeModel cm = context.getCodeModel();
			
			JDefinedClass enumClass = cm._class(JMod.PUBLIC,
					"com.mailjet.api.model.v3.customtypes." + context.generateClassNameForComponentType(propertyMetadata), ClassType.ENUM);
			enumClass.javadoc().add("Enumeration defining allowed values for \"" + propertyMetadata.getName() +"\"(" + propertyMetadata.getDescription() + ") MailJet API property.\nAutomatically generated using the MailJet API metadata on " + new Date() + "."); 
			JType generatedType = enumClass;
			for (String value : propertyMetadata.getAllowedValues()) {
				String constantName = getValidIdentifier(value).toUpperCase();
				JEnumConstant enumConstant = ((JDefinedClass)generatedType).enumConstant(constantName);
				JAnnotationUse annotate = enumConstant.annotate(com.mailjet.api.client.model.metadata.EnumValue.class);
				annotate.param("value", value);
				enumConstant.javadoc().add("Value \"" + value + "\".");
			}
			System.out.println("Generated enum for: " + propertyMetadata.getDataType());
			context.registerCustomType(propertyMetadata, generatedType);
		}

	static String getValidIdentifier(String value) {
		if(!(value.length() == 0)) {
			String firstChar = value.substring(0, 1);
			String replacementFirst = replacements.get(firstChar);
			if(replacementFirst != null){
				String remaining = value.substring(1);
				return remaining.length() == 0 ? replacementFirst : replacementFirst + "_" + validRemaining( remaining);
			}
			return (Character.isJavaIdentifierStart(firstChar.charAt(0)) ? firstChar : '_') + validRemaining(value.substring(1)); 
		}
		return "blank";
	}
	
	private static String validRemaining(String value) {
		char[] identifierChars = value.toCharArray();
		char[] validChars = new char[identifierChars.length];
		for (int i = 0; i < identifierChars.length; i++) {
			validChars[i] = Character.isJavaIdentifierPart(identifierChars[i]) ? identifierChars[i] : '_'; 
		}
		return String.valueOf(validChars);
	}
	
	@SuppressWarnings("serial")
	private static Map<String, String> replacements = new HashMap<String, String>(){{
		put("-", "minus");put("+", "plus");put("*", "star");
		put("0", "_0");put("1", "_1");put("2", "_2");put("3", "_3");put("4", "_4");
		put("5", "_5");put("6", "_6");put("7", "_7");put("8", "_8");put("9", "_9");
	}};
	
}
