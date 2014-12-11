package com.mailjet.api.gen;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Set;

import com.google.gson.Gson;
import com.mailjet.api.gen.impl.CodeGeneratorContextImpl;
import com.mailjet.api.gen.impl.MailJetBeanClassImplementorImpl;
import com.mailjet.api.gen.impl.MailJetFilterClassGeneratorImpl;
import com.mailjet.api.gen.impl.MailJetPropertyClassGeneratorImpl;
import com.mailjet.api.gen.meta.ApiMetadata;
import com.mailjet.api.gen.meta.ResourceMetadata;

public final class GenerateMailJetApiModel {
	
	public static void main(String[] args) throws Exception {
		new GenerateMailJetApiModel(args[0], args[1]);
	}

	public GenerateMailJetApiModel(String outputPath, String configDir) throws Exception {
		CodeGeneratorContext context = new CodeGeneratorContextImpl(configDir);
		ApiMetadata metadata = loadMetadata(configDir + "/metadata.json");
		
		Set<ResourceMetadata> resources = metadata.getResources();
		for (ResourceMetadata resourceMetadata : resources) {
			context.getTypeForResource(resourceMetadata);
		}
		for (ResourceMetadata resourceMetadata : resources) {
			new MailJetBeanClassImplementorImpl().generate(resourceMetadata, context);
			new MailJetPropertyClassGeneratorImpl().generate(resourceMetadata, context);
			new MailJetFilterClassGeneratorImpl().generate(resourceMetadata, context);
		}
		File destDir = new File(outputPath);
		destDir.mkdirs();
		context.getCodeModel().build(destDir);
	}
	
	private ApiMetadata loadMetadata(String fileName) throws IOException {
		InputStream resource = new FileInputStream(fileName);
		try {
			return new Gson().fromJson(new InputStreamReader(resource), ApiMetadata.class);
		} finally {
			resource.close();
		}
	}

}
