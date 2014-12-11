package com.mailjet.api.gen.impl;

import com.mailjet.api.client.MailJetApiCallException;
import com.mailjet.api.client.MailJetApiCallException.Error;
import com.mailjet.api.client.MailJetApiClient;
import com.mailjet.api.client.config.MailJetClientConfiguration;
import com.mailjet.api.client.model.ResourceOperationTypes;
import com.mailjet.api.client.model.ResultSet;
import com.mailjet.api.gen.CodeGeneratorContext;
import com.mailjet.api.gen.MailJetCodeGenerator;
import com.mailjet.api.gen.meta.ResourceMetadata;
import com.sun.codemodel.ClassType;
import com.sun.codemodel.JBlock;
import com.sun.codemodel.JCatchBlock;
import com.sun.codemodel.JClass;
import com.sun.codemodel.JCodeModel;
import com.sun.codemodel.JConditional;
import com.sun.codemodel.JDefinedClass;
import com.sun.codemodel.JExpr;
import com.sun.codemodel.JExpression;
import com.sun.codemodel.JInvocation;
import com.sun.codemodel.JMethod;
import com.sun.codemodel.JMod;
import com.sun.codemodel.JTryBlock;
import com.sun.codemodel.JVar;

public class MailJetTestClassGeneratorImpl implements MailJetCodeGenerator<ResourceMetadata>{
	
	public void generate(ResourceMetadata resourceMetadata, CodeGeneratorContext context) throws Exception {
		
		JCodeModel cm = context.getCodeModel();
		JDefinedClass constantsClass = cm._class(JMod.PUBLIC | JMod.FINAL,
				context.generatedClassNameForResource(resourceMetadata, 
						"Test"), ClassType.CLASS);
		JClass resClass = (JClass)cm._ref(Class.forName(context.generatedClassNameForResource(resourceMetadata, "")));
		JClass propClass = (JClass)cm._ref(Class.forName(context.generatedClassNameForResource(resourceMetadata, "Property")));
		
		String idProperty = null;
		if(resourceMetadata.getProperty("ID") != null){
			idProperty = "ID";
		}
		
		ResourceOperationTypes[] operations = toEnum(resourceMetadata.getPublicOperations());
		for (ResourceOperationTypes resourceOperation : operations) {
			
			switch(resourceOperation){
			case Post:
				break;
			case Put:
				break;
			case Delete:
				break;
			case Get:
				JClass assertClass = cm.ref("org.junit.Assert");
				JBlock body = createTestMethod(cm, constantsClass, "List");
				JVar clientVar = createClient(cm, body);
				JVar listVar = body.decl(((JClass)cm._ref(ResultSet.class)).narrow(resClass), "listResult", 
						clientVar.invoke("createCall").arg(resClass.staticRef("List")).invoke("limitBy").arg(JExpr.lit(2)).invoke("execute"));
				if(idProperty != null){
					JConditional _if = body._if(listVar.invoke("isEmpty"));
					JBlock ifBlock = _if._then();
					addTry(cm, resClass, propClass, idProperty, assertClass,
							clientVar, ifBlock, JExpr.lit((long)Integer.MAX_VALUE));
					JInvocation getIdOfFirst = listVar.invoke("iterator").invoke("next").invoke("get" + idProperty);
					
					JConditional _elseif = _if._elseif(getIdOfFirst.gt(JExpr.lit(0)));
					_elseif
						._then()
						.add(clientVar.invoke("createCall").arg(resClass.staticRef("Get")).invoke("identifiedBy").arg(propClass.staticRef(idProperty)).arg(getIdOfFirst ).invoke("execute"));
					addTry(cm, resClass, propClass, idProperty, assertClass,
							clientVar, _elseif._else(), getIdOfFirst);
					//println(cm, clientVar.invoke("createCall").arg(resClass.staticRef("List")).invoke("limitBy").arg(JExpr.lit(2)).invoke("execute"));
				}
				break;	
			case GetById:
				break;
			}
		}
	}


	private void addTry(JCodeModel cm, JClass resClass, JClass propClass,
			String idProperty, JClass assertClass, JVar clientVar,
			JBlock ifBlock, JExpression val) {
		JTryBlock tryBlock = ifBlock._try();
		tryBlock.body()
			.add(clientVar.invoke("createCall").arg(resClass.staticRef("Get")).invoke("identifiedBy").arg(propClass.staticRef(idProperty)).arg(val).invoke("execute"))
			.add(assertClass.staticInvoke("fail"));
		JCatchBlock catchBlock = tryBlock._catch(cm.ref(MailJetApiCallException.class));
		JVar exParam = catchBlock.param("e");
		catchBlock.body().add(assertClass.staticInvoke("assertEquals").arg(cm.ref(Error.class).staticRef("NotFound")).arg(exParam.invoke("getError")));
	}


//	private void println(JCodeModel cm, JInvocation jInvocation) {
//		((JClass)cm._ref(System.class)).staticRef("out").invoke("println").arg(jInvocation);
//	}
	
	
	public JVar createClient(JCodeModel cm, JBlock body){
		JVar confVar = body.decl(cm._ref(MailJetClientConfiguration.class), "config");
		confVar.init(JExpr._new(cm._ref(MailJetClientConfiguration.class)));
		body.add(confVar.invoke("loadFromClassPath").arg(JExpr.lit("test_mailjet.properties")));
		return body.decl(cm._ref(MailJetApiClient.class), "client").init(confVar.invoke("buildClient"));
		
	}


	private JBlock createTestMethod(JCodeModel cm,
			JDefinedClass constantsClass, String name) {
		JMethod refMethod = constantsClass.method(JMod.PUBLIC, cm._ref(void.class), "test" + name);
		refMethod.annotate(cm.ref("org.junit.Test"));
		refMethod._throws(Exception.class);
		JBlock body = refMethod.body();
		return body;
	}
	
	private static ResourceOperationTypes[] toEnum(String operations) {
		String[] ops = operations.split(",");
		ResourceOperationTypes[] result = new ResourceOperationTypes[ops.length];
		for (int i = 0; i < ops.length; i++) {
			result[i] = ResourceOperationTypes.valueOf(ops[i].trim());
		}
		return result;
	}
	
}
