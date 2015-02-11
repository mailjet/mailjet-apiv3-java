package com.mailjet.api.gen.impl;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.mailjet.api.gen.CodeGeneratorContext;
import com.mailjet.api.gen.meta.ComponentMetadata;
import com.mailjet.api.gen.meta.ResourceMetadata;
import com.sun.codemodel.ClassType;
import com.sun.codemodel.JAnnotationUse;
import com.sun.codemodel.JBlock;
import com.sun.codemodel.JClass;
import com.sun.codemodel.JCodeModel;
import com.sun.codemodel.JDefinedClass;
import com.sun.codemodel.JDocComment;
import com.sun.codemodel.JExpr;
import com.sun.codemodel.JFieldVar;
import com.sun.codemodel.JMethod;
import com.sun.codemodel.JMod;
import com.sun.codemodel.JType;

public class CodeGeneratorContextImpl implements CodeGeneratorContext {

	private final static String PKG_NAME = "com.mailjet.api.model.v3.%1$s.%2$s";

	private Map<String, JType> knownTypes = new HashMap<String, JType>();
	private Map<String, JType> resourceTypes = new HashMap<String, JType>();
	private Map<String, JType> predefinedTypes = new HashMap<String, JType>();

	private List<String> dictionary = new ArrayList<String>();
	private JCodeModel context;

	public CodeGeneratorContextImpl(String configDir) throws Exception {
		this.dictionary = loadDictionary(configDir + "/dictionary.txt");
		this.context = new JCodeModel();
		knownTypes.putAll(loadPredefinedTypes(configDir + "/type.properties", this.context));
	}

	public JCodeModel getCodeModel() {
		return context;
	}

	public String generatedClassNameForResource(ResourceMetadata method,
			String suffix) {
		return String.format(PKG_NAME, method.getName(),
				camelCase(method.getName()) + suffix);
	}

	public String generateClassNameForComponentType(ComponentMetadata component) {
		return customTypeKey(component);
	}

	private String camelCase(String name) {
		for (String word : this.dictionary) {
			name = name.replaceAll(word, capitalizeFirst(word));
		}
		return name;
	}

	private Map<String, JType> loadPredefinedTypes(String fileName,
			JCodeModel cm) throws Exception {
		Properties properties = new Properties();
		InputStream typesStream = new FileInputStream(fileName);
		try {
			properties.load(typesStream);
			Map<String, JType> typeMap = new HashMap<String, JType>();
			for (Entry<Object, Object> entry : properties.entrySet()) {
				String type = entry.getValue().toString();
				Matcher matcher = Pattern.compile("([^<]*)<([^>]*)>").matcher(
						type);
				String key = normalizeKey(entry.getKey().toString());
				if (matcher.find()) {
					JClass cls = ((JClass) cm._ref(Class.forName(matcher
							.group(1)))).narrow(cm._ref(Class.forName(matcher
							.group(2))));
					predefinedTypes.put(key, cls);
					typeMap.put(key, cls);
				} else {
					typeMap.put(key, cm._ref(Class.forName(type)));
					predefinedTypes.put(key, cm._ref(Class.forName(type)));
				}
			}
			return typeMap;
		} finally {
			typesStream.close();
		}
		
	}

	private List<String> loadDictionary(String dictionaryFile) throws Exception {
		InputStream dictionaryStream = new FileInputStream(dictionaryFile);
		try {
			String content = new Scanner(dictionaryStream).useDelimiter("\\Z")
					.next();
			List<String> words = Arrays.asList(content.split("[\\r\\n]+"));
			Collections.sort(words);
			Collections.reverse(words);
			return words;
		} finally {
			dictionaryStream.close();
		}
	}
	
	public void registerCustomType(ComponentMetadata metadata, JType beanClass) {
		String key = customTypeKey(metadata);
		knownTypes.put(key, beanClass);
	}

	
	public void registerCustomTypeForResource(ResourceMetadata resourceMetadata,
			ComponentMetadata propertyMetadata, JType beanClass) {
		String key = customTypeForResourceKey(resourceMetadata, propertyMetadata);
		knownTypes.put(key, beanClass);
	}
	
	public void registerTypeForResource(ResourceMetadata metadata, JType beanClass) {
		String key = resourceKey(metadata);
		knownTypes.put(key, beanClass);
		resourceTypes.put(key, beanClass);
	}

	private String customTypeKey(ComponentMetadata metadata) {
		return normalizeKey(metadata.getDataType());
	}

	private String customTypeForResourceKey(ResourceMetadata resourceMetadata,
			ComponentMetadata propertyMetadata) {
		return normalizeKey(resourceMetadata.getName() + "." + propertyMetadata.getName());
	}
	
	private String resourceKey(ResourceMetadata metadata) {
		return metadata.getName().toLowerCase();
	}

	private String normalizeKey(String className) {
		return className.startsWith("T") ? className.substring(1)
				: className;
	}

	private static String capitalizeFirst(String value) {
		return value.substring(0, 1).toUpperCase() + value.substring(1);
	}

	public void generateJavaPropertyForComponent(JDefinedClass beanClass,
			ResourceMetadata resourceMetadata, ComponentMetadata metadata) throws Exception {
		JType type = getTypeForComponent(resourceMetadata, metadata);
		String name = metadata.getName();
		if(type == null){
			type = context.ref(Long.class);
			name = name + "ID";
		}
		String fieldName = name.equals("List") ? "_" + name : name;
		JFieldVar field = beanClass.field(JMod.PRIVATE, type, fieldName);
		if (metadata != null) {
			JAnnotationUse annotate = field
					.annotate(com.mailjet.api.client.model.metadata.Component.class);
			annotate.param("name", name);
			annotate.param("type", metadata.getDataType());
			annotate.param("defaultValue", metadata.getDefaultValue());
			annotate.param("required", metadata.getIsRequired());
			annotate.param("description", metadata.getDescription());
		}

		JMethod getterMethod = beanClass.method(JMod.PUBLIC, type, "get"
				+ capitalizeFirst(name));
		if (metadata != null) {
			JDocComment getDoc = getterMethod.javadoc();
			getDoc.add(String.format("Gets \"%1$s\" property.",
					metadata.getDescription()));
			getDoc.addReturn()
					.add("the value set for the property or null if value is not present");
		}
		JBlock block = getterMethod.body();
		block._return(field);
		// Create the setter method and set the JFieldVar previously defined
		// with the given parameter
		JMethod setterMethod = beanClass.method(JMod.PUBLIC, beanClass, "set"
				+ capitalizeFirst(name));
		setterMethod.param(type, "value");
		setterMethod.body().assign(field, JExpr.ref("value"))
				._return(JExpr._this());
		if (metadata != null) {
			JDocComment setDoc = setterMethod.javadoc();
			setDoc.add(String.format(
					"Sets the specified value to \"%1$s\" property.",
					metadata.getDescription()));
			setDoc.addParam("value").add("the new value for the property");
			setDoc.addReturn().add(
					"not null, the object on which this method was called ");
		}
	}

	public JType getTypeForComponent(ResourceMetadata metadata, ComponentMetadata component)
			throws Exception {
		//check if an inner enum should be generated for property
		JType jType = knownTypes.get(customTypeForResourceKey(metadata, component));
		if(jType == null && needsInnerType(component)){
			new MailJetBeanInnerEnumTypesGeneratorImpl(metadata).generate(component, this);
			jType = knownTypes.get(customTypeForResourceKey(metadata, component));
		}
		//check if custom type should be generated for property 
		if(jType == null){
			jType = knownTypes.get(customTypeKey(component));
			if (jType == null) {
				if (!component.getAllowedValues().isEmpty()) {
					new MailJetBeanEnumTypesGeneratorImpl().generate(component, this);
					jType = knownTypes.get(customTypeKey(component));
				}
			}
		}
		//assuming resource type
		if(jType == null){
			jType = knownTypes
					.get(normalizeKey(component.getDataType()).toLowerCase());
			//check if the data type is for list
			if(jType == null){
				if(component.getDataType().endsWith("List")){
					String key = normalizeKey(component.getDataType().substring(0, component.getDataType().length() - 4));
					if(predefinedTypes.containsKey(key)){
						jType = ((JClass)context._ref(List.class)).narrow(predefinedTypes.get(key));
					} else {
						jType = ((JClass)context._ref(List.class)).narrow(context._ref(Long.class));
					}
				} else {
					System.out.println("No type found for " + metadata.getName() +"."+ component.getName() + "[" + component.getDataType() + "]");
					//jType = context._ref(Long.class);
					return null;
				}
			} else {
				System.out.println("No type found for " + metadata.getName() +"."+ component.getName() + "[" + component.getDataType() + "]");
				//jType = context._ref(Long.class);
				return null;
			}
		}
		return jType;
	}
	
	public boolean isPredefinedType(ComponentMetadata component)
			throws Exception {
		return predefinedTypes.get(customTypeKey(component)) != null;
	}

	public boolean needsInnerType(ComponentMetadata component) throws Exception {
		return isPredefinedType(component)
				&& !component.getAllowedValues().isEmpty();
	}

	public JClass getTypeForResource(ResourceMetadata resourceMetadata) throws Exception {
		JClass resourceType = (JDefinedClass) knownTypes
				.get(resourceKey(resourceMetadata));
		if(resourceType == null) {
			resourceType = context.
					_class(JMod.PUBLIC | JMod.FINAL, generatedClassNameForResource(resourceMetadata, ""), ClassType.CLASS);
			registerTypeForResource(resourceMetadata, resourceType);
		}
		return resourceType;
	}

}
