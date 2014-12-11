package com.mailjet.api.client.impl;

import com.mailjet.api.client.MailJetApiCall;
import com.mailjet.api.client.MailJetApiCall.Retrieve;
import com.mailjet.api.client.MailJetApiService;
import com.mailjet.api.client.RetrieveTest;
import com.mailjet.api.client.config.MailJetClientConfiguration;
import com.mailjet.api.client.connect.MailJetConnectionProvider;
import com.mailjet.api.client.model.ResourceOperationTypes;
import com.mailjet.api.client.transform.DataTransformer;
import com.mailjet.api.client.transform.impl.GsonDataTransformerImpl;

public class RetriveCallImplTest extends RetrieveTest {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Retrieve<Object> createCall() {
		return new RetrieveCallImpl(new MailJetClientConfiguration(), null,
				new GsonDataTransformerImpl(),
				new MailJetApiService<MailJetApiCall<?>>(Object.class,
						ResourceOperationTypes.Get));
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public <ResourceType> Retrieve<ResourceType> createCall(
			MailJetClientConfiguration config,
			Class<ResourceType> resourceClass,
			MailJetConnectionProvider provider, DataTransformer transformer) {
		return new RetrieveCallImpl(config, provider, transformer,
				new MailJetApiService<MailJetApiCall<ResourceType>>(
						resourceClass, ResourceOperationTypes.Get));
	}

	@Override
	protected DataTransformer createTestDataTransformer() {
		return new GsonDataTransformerImpl();
	};
}
