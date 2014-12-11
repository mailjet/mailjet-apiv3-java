package com.mailjet.api.client.impl;

import com.mailjet.api.client.MailJetApiCall;
import com.mailjet.api.client.MailJetApiCall.Create;
import com.mailjet.api.client.MailJetApiService;
import com.mailjet.api.client.CreateTest;
import com.mailjet.api.client.config.MailJetClientConfiguration;
import com.mailjet.api.client.connect.MailJetConnectionProvider;
import com.mailjet.api.client.model.ResourceOperationTypes;
import com.mailjet.api.client.transform.DataTransformer;
import com.mailjet.api.client.transform.impl.GsonDataTransformerImpl;

public class CreateCallImplTest extends CreateTest{

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Create<?> createCall() {
		return new CreateCallImpl(
				new MailJetClientConfiguration().setBaseUrl(MAILJET_URL), null, new GsonDataTransformerImpl(), new MailJetApiService<MailJetApiCall<?>>(Object.class, ResourceOperationTypes.Post));
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public <ResourceType> Create<ResourceType> createCall(MailJetClientConfiguration config, Class<ResourceType> resourceClass, MailJetConnectionProvider provider, DataTransformer transformer) {
		return new CreateCallImpl(
				config, provider, transformer, new MailJetApiService<MailJetApiCall<ResourceType>>(resourceClass, ResourceOperationTypes.Post));
	}
	
	@Override
	protected DataTransformer createTestDataTransformer() {
		return new GsonDataTransformerImpl();
	};

}
