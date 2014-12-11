package com.mailjet.api.gen.impl;

import java.util.Date;

import com.mailjet.api.client.MailJetApiCall;
import com.mailjet.api.client.MailJetApiService;
import com.mailjet.api.client.model.ResourceOperationTypes;
import com.mailjet.api.gen.CodeGeneratorContext;
import com.mailjet.api.gen.MailJetCodeGenerator;
import com.mailjet.api.gen.meta.PropertyMetadata;
import com.mailjet.api.gen.meta.ResourceMetadata;
import com.sun.codemodel.JAnnotationArrayMember;
import com.sun.codemodel.JAnnotationUse;
import com.sun.codemodel.JClass;
import com.sun.codemodel.JCodeModel;
import com.sun.codemodel.JDefinedClass;
import com.sun.codemodel.JExpr;
import com.sun.codemodel.JFieldRef;
import com.sun.codemodel.JFieldVar;
import com.sun.codemodel.JMod;
import com.sun.codemodel.JType;

public class MailJetBeanClassImplementorImpl implements MailJetCodeGenerator<ResourceMetadata>{
	
	private static final String ID_PROPERTY = "ID";
	
	private static final String BEAN_CLASS_COMMENT = "Class representing \"%1$s\".\n\nAutomatically generated using the MailJet API metadata on %2$s.";
	private static final String RESOURCE_ANNOTATION_NAME = "name";
	private static final String RESOURCE_ANNOTATION_DESCRIPTION = "description";
	private static final String RESOURCE_ANNOTATION_ALLOWED_OP = "allowedOperations";
	private static final String RESOURCE_ANNOTATION_UNIQUE_KEY = "uniquekey";
	
	
	public void generate(ResourceMetadata resourceMetadata, CodeGeneratorContext context) throws Exception {
		JClass resClass = context.getTypeForResource(resourceMetadata);
		
		if(resClass instanceof JDefinedClass){
			JDefinedClass beanClass = (JDefinedClass)resClass;
			//javadoc
			String description = resourceMetadata.getDescription();
			beanClass
				.javadoc()
				.add(String.format(BEAN_CLASS_COMMENT, description, new Date()));
			
			//annotations
			JAnnotationUse resourceAnnotation = beanClass.annotate(com.mailjet.api.client.model.metadata.Resource.class);
			resourceAnnotation.param(RESOURCE_ANNOTATION_NAME, resourceMetadata.getName());
			if(description != null && !(description.length() == 0)){
				resourceAnnotation.param(RESOURCE_ANNOTATION_DESCRIPTION, description);
			}
			String publicOperations = resourceMetadata.getPublicOperations();
			if(publicOperations != null && !(publicOperations.length() == 0)){
				ResourceOperationTypes[] ops = toEnum(publicOperations);
				JAnnotationArrayMember paramArray = resourceAnnotation.paramArray(RESOURCE_ANNOTATION_ALLOWED_OP);
				for (ResourceOperationTypes operation : ops) {
						paramArray.param(operation);
				}
			}
			String uniqueKey = resourceMetadata.getUniqueKey();
			if(uniqueKey != null && !(resourceMetadata.getUniqueKey().length() == 0)){
				resourceAnnotation.param(RESOURCE_ANNOTATION_UNIQUE_KEY, resourceMetadata.getUniqueKey());
			}
			//properties generation
			boolean generateToStringOnID = false;
			for (PropertyMetadata propertyMetadata : resourceMetadata.getProperties()) {
				generateToStringOnID = generateToStringOnID || ID_PROPERTY.equals(propertyMetadata.getName());
				context.generateJavaPropertyForComponent(beanClass, resourceMetadata, propertyMetadata);
			}
			if(generateToStringOnID) {
				beanClass
					.method(JMod.PUBLIC, String.class, "toString")
					.body()
					._return(JExpr.dotclass(beanClass).invoke("getSimpleName").plus(JExpr.lit("#")).plus(JExpr._this().invoke("getID")));
			}
	
			generateOperationFileds(context, resourceMetadata, beanClass, beanClass, generateToStringOnID);
		}
	}
	
	private static ResourceOperationTypes[] toEnum(String operations) {
		String[] ops = operations.split(",");
		ResourceOperationTypes[] result = new ResourceOperationTypes[ops.length];
		for (int i = 0; i < ops.length; i++) {
			result[i] = ResourceOperationTypes.valueOf(ops[i].trim());
		}
		return result;
	}
	
	private static void generateOperationFileds(CodeGeneratorContext context,
			ResourceMetadata resourceMetadata, JDefinedClass operationsClass, JDefinedClass beanClass, boolean hasID) throws Exception {
		JCodeModel cm = context.getCodeModel();
		JClass enumClass = (JClass) cm._ref(ResourceOperationTypes.class);
		ResourceOperationTypes[] operations = toEnum(resourceMetadata.getPublicOperations());
		for (ResourceOperationTypes resourceOperation : operations) {
			JClass updateCallType = ((JClass) cm._ref(MailJetApiCall.Update.class)).narrow(beanClass);
			JClass createCallType = ((JClass) cm._ref(MailJetApiCall.Create.class)).narrow(beanClass);
			JClass listCallType = ((JClass) cm._ref(MailJetApiCall.Retrieve.class)).narrow(beanClass);
			JClass deleteCallType = ((JClass) cm._ref(MailJetApiCall.Delete.class)).narrow(beanClass);
			JClass getCallType = ((JClass) cm._ref(MailJetApiCall.RetrieveById.class)).narrow(beanClass);
			switch(resourceOperation){
				case Post:
					generateOperation(cm, resourceMetadata, operationsClass, enumClass,
							resourceOperation, createCallType, "Create", beanClass);
					break;
				case Put:
					generateOperation(cm, resourceMetadata, operationsClass, enumClass,
							resourceOperation, updateCallType, "Update", beanClass);
					break;
				case Delete:
					generateOperation(cm, resourceMetadata, operationsClass, enumClass,
							resourceOperation, deleteCallType, "Delete", beanClass);
					break;
				case Get:
					generateOperation(cm, resourceMetadata, operationsClass, enumClass,
							resourceOperation, listCallType, "List", beanClass);
					if(hasID){
						generateOperation(cm, resourceMetadata, operationsClass, enumClass,
								ResourceOperationTypes.GetById, getCallType, "Get", beanClass);
					}
					break;	
				case GetById:
					break;
			}
		}
	}

	private static void generateOperation(JCodeModel cm, ResourceMetadata resourceMetadata,
			JDefinedClass operationsClass, JClass enumClass,
			ResourceOperationTypes resourceOperation, JType narrowingType, String operationName, JDefinedClass beanClass) {
		narrowingType = ((JClass) cm._ref(MailJetApiService.class)).narrow(narrowingType);
		JFieldVar field = operationsClass.field(JMod.PUBLIC | JMod.STATIC | JMod.FINAL, 
				narrowingType, operationName);
		field.javadoc().add("API Operation \"" + operationName +"\".");
		JFieldRef resourceOpRef = enumClass.staticRef(resourceOperation.name());
		field.init(JExpr._new(narrowingType)
				.arg(JExpr.dotclass(beanClass))
				.arg(resourceOpRef));
	}

}
