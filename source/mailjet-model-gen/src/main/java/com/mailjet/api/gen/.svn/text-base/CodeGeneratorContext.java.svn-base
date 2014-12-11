package com.mailjet.api.gen;

import com.mailjet.api.gen.meta.ComponentMetadata;
import com.mailjet.api.gen.meta.ResourceMetadata;
import com.sun.codemodel.JClass;
import com.sun.codemodel.JCodeModel;
import com.sun.codemodel.JDefinedClass;
import com.sun.codemodel.JType;

public interface CodeGeneratorContext {

	JCodeModel getCodeModel();

	String generatedClassNameForResource(ResourceMetadata resource, String suffix);

	String generateClassNameForComponentType(ComponentMetadata component);

	void registerCustomType(ComponentMetadata metadata, JType beanClass);
	
	void registerCustomTypeForResource(ResourceMetadata metadata, ComponentMetadata component, JType beanClass);
	
	void registerTypeForResource(ResourceMetadata metadata, JType beanClass);
	
	void generateJavaPropertyForComponent(JDefinedClass beanClass, ResourceMetadata resourceMetadata, ComponentMetadata metadata) throws Exception;

	JType getTypeForComponent(ResourceMetadata metadata, ComponentMetadata component) throws Exception;
	
	boolean needsInnerType(ComponentMetadata component) throws Exception;
	
	JClass getTypeForResource(ResourceMetadata resourceMetadata) throws Exception;
}