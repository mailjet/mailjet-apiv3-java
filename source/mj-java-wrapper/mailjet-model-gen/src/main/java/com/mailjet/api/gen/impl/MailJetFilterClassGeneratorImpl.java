package com.mailjet.api.gen.impl;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.mailjet.api.client.model.MailJetResourceFilter;
import com.mailjet.api.gen.CodeGeneratorContext;
import com.mailjet.api.gen.MailJetCodeGenerator;
import com.mailjet.api.gen.meta.FilterMetadata;
import com.mailjet.api.gen.meta.ResourceMetadata;
import com.sun.codemodel.ClassType;
import com.sun.codemodel.JClass;
import com.sun.codemodel.JDefinedClass;
import com.sun.codemodel.JExpr;
import com.sun.codemodel.JFieldVar;
import com.sun.codemodel.JMethod;
import com.sun.codemodel.JMod;
import com.sun.codemodel.JType;
import com.sun.codemodel.JTypeVar;
import com.sun.codemodel.JVar;

public class MailJetFilterClassGeneratorImpl implements MailJetCodeGenerator<ResourceMetadata>{

	private static final String CLASS_COMMENT = "Class representing filter for  \"%1$s\" MailJet API resource.\n\nAutomatically generated using the MailJet API metadata on %2$s.";
	private final static String FILTER_CLASS_SUFFIX = "Filter";
	
	public void generate(ResourceMetadata resourceMetadata, CodeGeneratorContext context) throws Exception {
		JDefinedClass filterBeanClass = context.getCodeModel()._class(JMod.PUBLIC | JMod.FINAL,
				context.generatedClassNameForResource(resourceMetadata, FILTER_CLASS_SUFFIX), ClassType.CLASS);
		JClass superClass = (JClass)context.getCodeModel()._ref(MailJetResourceFilter.class);
		JTypeVar typeVar = filterBeanClass
			.generify("DataType");
		filterBeanClass._extends(superClass.narrow(context.getTypeForResource(resourceMetadata)).narrow(typeVar))
			.javadoc()
			.add(String.format(CLASS_COMMENT, resourceMetadata.getName(), new Date()));
		
	JMethod constructor = filterBeanClass.constructor(JMod.PRIVATE);
	JVar nameParam = constructor.param(String.class, "name");
	JVar typeParam = constructor.param(((JClass)context.getCodeModel()._ref(Class.class)).narrow(context.getCodeModel().wildcard()), "type");
	constructor.body().invoke("super").arg(nameParam).arg(typeParam);
	
		Set<String> processedFilters = new HashSet<String>();
		
		for (FilterMetadata filterMetadata : resourceMetadata.getFilters()) {
			String name = filterMetadata.getName();
			JType type = context.getTypeForComponent(resourceMetadata, filterMetadata);
			if(type == null){
				type = context.getCodeModel().ref(Long.class);
				name = name + "ID";
			}
			if(!processedFilters.contains(name)){
				JClass narrowType = filterBeanClass.narrow(type);
				JFieldVar field = filterBeanClass.field(JMod.PUBLIC | JMod.STATIC | JMod.FINAL, 
						narrowType, genereateFieldName(name));
				field.javadoc().add(filterMetadata.getDescription());
				field.init(JExpr._new(narrowType).arg(name).arg(JExpr.dotclass((JClass) type)));
				processedFilters.add(name);
			} else {
				System.out.println(String.format("WARN: Filter '%1$s' defined twice for resource '%2$s'", name, resourceMetadata.getName()));
			}
		}
		
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
