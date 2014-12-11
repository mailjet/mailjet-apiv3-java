package com.mailjet.api.gen;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Set;

import com.google.gson.Gson;
import com.mailjet.api.gen.impl.CodeGeneratorContextImpl;
import com.mailjet.api.gen.impl.MailJetTestClassGeneratorImpl;
import com.mailjet.api.gen.meta.ApiMetadata;
import com.mailjet.api.gen.meta.ResourceMetadata;

public final class GenerateMailJetApiTests {
	
	public static void main(String[] args) throws Exception {
		new GenerateMailJetApiTests(args[0], args[1]);
	}

	public GenerateMailJetApiTests(String outputPath, String configPath) throws Exception {
		CodeGeneratorContext context = new CodeGeneratorContextImpl(configPath);
		ApiMetadata metadata = loadMetadata(configPath + "/metadata.json");
		
		Set<ResourceMetadata> resources = metadata.getResources();
		for (ResourceMetadata resourceMetadata : resources) {
			new MailJetTestClassGeneratorImpl().generate(resourceMetadata, context);
		}
		context.getCodeModel().build(new File(outputPath));
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
