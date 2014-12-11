package com.mailjet.api.client.impl;

import com.mailjet.api.client.MailJetApiCall;
import com.mailjet.api.client.MailJetApiCall.RetrieveById;
import com.mailjet.api.client.MailJetApiService;
import com.mailjet.api.client.RetrieveByIdTest;
import com.mailjet.api.client.config.MailJetClientConfiguration;
import com.mailjet.api.client.connect.MailJetConnectionProvider;
import com.mailjet.api.client.model.ResourceOperationTypes;
import com.mailjet.api.client.transform.DataTransformer;
import com.mailjet.api.client.transform.impl.GsonDataTransformerImpl;

public class RetriveByIdCallImplTest extends RetrieveByIdTest {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public RetrieveById<?> createCall() {
		return new RetrieveByIdCallImpl(new MailJetClientConfiguration(), null,
				new GsonDataTransformerImpl(),
				new MailJetApiService<MailJetApiCall<?>>(Object.class,
						ResourceOperationTypes.Get));
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public <ResourceType> RetrieveById<ResourceType> createCall(
			MailJetClientConfiguration config,
			Class<ResourceType> resourceClass,
			MailJetConnectionProvider provider, DataTransformer transformer) {
		return new RetrieveByIdCallImpl(config, provider, transformer,
				new MailJetApiService<MailJetApiCall<ResourceType>>(
						resourceClass, ResourceOperationTypes.Get));
	}

	@Override
	protected DataTransformer createTestDataTransformer() {
		return new GsonDataTransformerImpl();
	};

}
