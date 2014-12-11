package com.mailjet.api.gen.impl;

import java.util.Date;

import com.mailjet.api.client.model.MailJetKeyProperty;
import com.mailjet.api.client.model.MailJetResourceProperty;
import com.mailjet.api.gen.CodeGeneratorContext;
import com.mailjet.api.gen.MailJetCodeGenerator;
import com.mailjet.api.gen.meta.PropertyMetadata;
import com.mailjet.api.gen.meta.ResourceMetadata;
import com.sun.codemodel.ClassType;
import com.sun.codemodel.JClass;
import com.sun.codemodel.JCodeModel;
import com.sun.codemodel.JDefinedClass;
import com.sun.codemodel.JExpr;
import com.sun.codemodel.JFieldVar;
import com.sun.codemodel.JMethod;
import com.sun.codemodel.JMod;
import com.sun.codemodel.JType;
import com.sun.codemodel.JTypeVar;
import com.sun.codemodel.JVar;

public class MailJetPropertyClassGeneratorImpl implements MailJetCodeGenerator<ResourceMetadata>{

	private static final String CLASS_COMMENT = "Class defining property constants for \"%1$s\" MailJet API resource.\n\nAutomatically generated using the MailJet API metadata on %2$s.";
	
	private final static String CONSTANT_CLASS_SUFFIX = "Property";
	
	public void generate(ResourceMetadata resourceMetadata, CodeGeneratorContext context) throws Exception {
		JCodeModel cm = context.getCodeModel();
		JDefinedClass constantsClass = cm._class(JMod.PUBLIC | JMod.FINAL,
				context.generatedClassNameForResource(resourceMetadata, 
						CONSTANT_CLASS_SUFFIX), ClassType.CLASS);
		JTypeVar typeVar = constantsClass.generify("DataType");		
		constantsClass._extends(
						((JClass)cm.ref(MailJetResourceProperty.class))
						.narrow(context.getTypeForResource(resourceMetadata))
						.narrow(typeVar)
						);
		
		JDefinedClass keyClass = constantsClass._class(JMod.PUBLIC | JMod.FINAL | JMod.STATIC,
				"Key", ClassType.CLASS);
		JTypeVar typeVarKey = keyClass.generify("KeyDataType");	
		keyClass._extends(
						((JClass)cm.ref(MailJetKeyProperty.class))
						.narrow(context.getTypeForResource(resourceMetadata))
						.narrow(typeVarKey)
						);
		
		constantsClass.javadoc()
			.add(String.format(CLASS_COMMENT, resourceMetadata.getName(), new Date()));
		JMethod constructor = constantsClass.constructor(JMod.PRIVATE);
		JVar nameParam = constructor.param(String.class, "name");
		JVar typeParam = constructor.param(((JClass)cm._ref(Class.class)).narrow(cm.wildcard()), "type");
		constructor.body().invoke("super").arg(nameParam).arg(typeParam);
		
		JMethod constructorKey = keyClass.constructor(JMod.PRIVATE);
		JVar nameParamKey = constructorKey.param(String.class, "name");
		JVar typeParamKey = constructorKey.param(((JClass)cm._ref(Class.class)).narrow(cm.wildcard()), "type");
		constructorKey.body().invoke("super").arg(nameParamKey).arg(typeParamKey);
		
		for (PropertyMetadata propertyMetadata : resourceMetadata.getProperties()) {
			String name = propertyMetadata.getName();
			JType type = context.getTypeForComponent(resourceMetadata, propertyMetadata);
			if(type == null){
				type = context.getCodeModel().ref(Long.class);
				name = name + "ID";
			}
			JClass superClass = constantsClass;
			if(resourceMetadata.isKeyProperty(propertyMetadata)){
				superClass = keyClass;
			}
			JClass narrowType = superClass.narrow(type);
			JFieldVar field = constantsClass.field(JMod.PUBLIC | JMod.STATIC | JMod.FINAL, 
					narrowType, genereateFieldName(name));
			field.javadoc().add(propertyMetadata.getDescription());
			field.init(JExpr._new(narrowType).arg(name).arg(JExpr.dotclass((JClass) type)));
		}
		
		JClass type = constantsClass.narrow(Object.class);
		JMethod refMethod = constantsClass.method(JMod.PUBLIC | JMod.STATIC, type, "ref");
		JVar param = refMethod.param(String.class, "name");
		refMethod.body()._return(JExpr._new(type).arg(param).arg(JExpr.dotclass((JClass) cm._ref(Object.class))));
//		if (metadata != null) {
//			JDocComment getDoc = getterMethod.javadoc();
//			getDoc.add(String.format("Gets \"%1$s\" property.",
//					metadata.getDescription()));
//			getDoc.addReturn()
//					.add("the value set for the property or null if value is not present");
//		}
//		JBlock block = getterMethod.body();
//		block._return(field);
	}
	
	private static String genereateFieldName(
			String name) {
		String[] camelCaseWords = name.split("(?=[A-Z])");
		StringBuilder builder = new StringBuilder();
		for (String word : camelCaseWords) {
			builder.append(word.toUpperCase());
		}
		return builder.toString();
	}
	
}
