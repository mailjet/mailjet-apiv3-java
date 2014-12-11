package com.mailjet.api.client.impl;

import com.mailjet.api.client.MailJetApiCall;
import com.mailjet.api.client.MailJetApiCall.Update;
import com.mailjet.api.client.MailJetApiService;
import com.mailjet.api.client.UpdateTest;
import com.mailjet.api.client.config.MailJetClientConfiguration;
import com.mailjet.api.client.connect.MailJetConnectionProvider;
import com.mailjet.api.client.model.ResourceOperationTypes;
import com.mailjet.api.client.transform.DataTransformer;
import com.mailjet.api.client.transform.impl.GsonDataTransformerImpl;

public class UpdateCallImplTest extends UpdateTest {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public Update<?> createCall() {
		return new UpdateCallImpl(
				new MailJetClientConfiguration().setBaseUrl(MAILJET_URL), null,
				new GsonDataTransformerImpl(),
				new MailJetApiService<MailJetApiCall<?>>(Object.class,
						ResourceOperationTypes.Put));
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public <ResourceType> Update<ResourceType> createCall(
			MailJetClientConfiguration config,
			Class<ResourceType> resourceClass,
			MailJetConnectionProvider provider, DataTransformer transformer) {
		return new UpdateCallImpl(config, provider, transformer,
				new MailJetApiService<MailJetApiCall<ResourceType>>(
						resourceClass, ResourceOperationTypes.Put));
	}

	@Override
	protected DataTransformer createTestDataTransformer() {
		return new GsonDataTransformerImpl();
	};

}
