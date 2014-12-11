package com.mailjet.api.gen.impl;

import java.util.Date;

import com.mailjet.api.gen.CodeGeneratorContext;
import com.mailjet.api.gen.MailJetCodeGenerator;
import com.mailjet.api.gen.meta.ComponentMetadata;
import com.mailjet.api.gen.meta.ResourceMetadata;
import com.sun.codemodel.ClassType;
import com.sun.codemodel.JAnnotationUse;
import com.sun.codemodel.JClass;
import com.sun.codemodel.JDefinedClass;
import com.sun.codemodel.JEnumConstant;
import com.sun.codemodel.JMod;
import com.sun.codemodel.JType;

public class MailJetBeanInnerEnumTypesGeneratorImpl implements MailJetCodeGenerator<ComponentMetadata>{

	private ResourceMetadata resourceMetadata;

	public MailJetBeanInnerEnumTypesGeneratorImpl(ResourceMetadata metadata) {
		this.resourceMetadata = metadata;
	}

	public void generate(ComponentMetadata propertyMetadata, CodeGeneratorContext context) throws Exception {
			JClass resourceClass = context.getTypeForResource(resourceMetadata);
			if(resourceClass instanceof JDefinedClass ){
				JDefinedClass beanClass = (JDefinedClass) resourceClass;
				JDefinedClass enumClass = beanClass._class(JMod.PUBLIC | JMod.STATIC,
						propertyMetadata.getName(), ClassType.ENUM);
				enumClass.javadoc().add("Enumeration defining allowed values for \"" + propertyMetadata.getName() +"\"(" + propertyMetadata.getDescription() + ") MailJet API property.\nAutomatically generated using the MailJet API metadata on " + new Date() + "."); 
				JType generatedType = enumClass;
				for (String value : propertyMetadata.getAllowedValues()) {
					String constantName = MailJetBeanEnumTypesGeneratorImpl.getValidIdentifier(value).toUpperCase();
					JEnumConstant enumConstant = ((JDefinedClass)generatedType).enumConstant(constantName);
					JAnnotationUse annotate = enumConstant.annotate(com.mailjet.api.client.model.metadata.EnumValue.class);
					annotate.param("value", value);
					enumConstant.javadoc().add("Value \"" + value + "\".");
				}
				context.registerCustomTypeForResource(resourceMetadata, propertyMetadata, generatedType);
			}
		}
			
}
