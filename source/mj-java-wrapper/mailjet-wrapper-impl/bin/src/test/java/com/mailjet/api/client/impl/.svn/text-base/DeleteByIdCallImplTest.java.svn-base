package com.mailjet.api.client.impl;

import com.mailjet.api.client.DeleteTest;
import com.mailjet.api.client.MailJetApiCall;
import com.mailjet.api.client.MailJetApiCall.Delete;
import com.mailjet.api.client.MailJetApiService;
import com.mailjet.api.client.config.MailJetClientConfiguration;
import com.mailjet.api.client.connect.MailJetConnectionProvider;
import com.mailjet.api.client.model.ResourceOperationTypes;
import com.mailjet.api.client.transform.DataTransformer;
import com.mailjet.api.client.transform.impl.GsonDataTransformerImpl;

public class DeleteByIdCallImplTest extends DeleteTest {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Delete<?> createCall() {
		return new DeleteCallImpl(new MailJetClientConfiguration(), null,
				new GsonDataTransformerImpl(),
				new MailJetApiService<MailJetApiCall<?>>(Object.class,
						ResourceOperationTypes.Delete));
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public <ResourceType> Delete<ResourceType> createCall(
			MailJetClientConfiguration config,
			Class<ResourceType> resourceClass,
			MailJetConnectionProvider provider, DataTransformer transformer) {
		return new DeleteCallImpl(config, provider, transformer,
				new MailJetApiService<MailJetApiCall<ResourceType>>(
						resourceClass, ResourceOperationTypes.Delete));
	}

	@Override
	protected DataTransformer createTestDataTransformer() {
		return new GsonDataTransformerImpl();
	};

}
