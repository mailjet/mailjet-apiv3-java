package com.mailjet.api.client.impl;

import java.net.URI;

import com.mailjet.api.client.MailJetApiCall;
import com.mailjet.api.client.MailJetApiCallException;
import com.mailjet.api.client.MailJetApiService;
import com.mailjet.api.client.config.MailJetClientConfiguration;
import com.mailjet.api.client.connect.MailJetConnectionProvider;
import com.mailjet.api.client.connect.MailJetConnectionProvider.MailJetApiCredentials;
import com.mailjet.api.client.connect.MailJetConnectionProvider.MailJetApiResponse;
import com.mailjet.api.client.transform.DataTransformer;

/**
 * Implementation that deletes resource instance on MailJet API.
 * 
 * @author MailJet
 * 
 * @param <ResourceType>
 *            type of the resource deleted
 */
final class DeleteCallImpl<ResourceType> extends
		IdCallImpl<ResourceType, Void, MailJetApiCall.Delete<ResourceType>>
		implements MailJetApiCall.Delete<ResourceType> {

	private static final int NO_CONTENT_STATUS_CODE = 204;

	/**
	 * Constructor.
	 * 
	 * @param config
	 *            not null, client configuration
	 * @param dataMapper
	 *            not null, data mapper to use to map java objects to MailJet
	 *            API data format
	 * @param connectionProvider
	 *            not null, connection provider to MailJet API
	 * @param operation
	 *            not null, service to be invoked
	 */
	DeleteCallImpl(
			final MailJetClientConfiguration config,
			final MailJetConnectionProvider connectionProvider,
			final DataTransformer dataMapper,
			final MailJetApiService<?> operation) {
		super(config, connectionProvider, dataMapper, operation);
	}

	@Override
	protected MailJetApiResponse execute(
			final MailJetConnectionProvider connectionProvider,
			final DataTransformer dataTransformer, final URI uri,
			final MailJetApiCredentials credentials)
			throws MailJetApiCallException {
		return connectionProvider.delete(uri, credentials);
	}
	
	@Override
	protected boolean isSuccessfull(final int code) {
		return code == NO_CONTENT_STATUS_CODE;
	}
	
	@Override
	protected int maximumResponseObjects() {
		return 0;
	}
	
	@Override
	protected boolean attachDefaultParams() {
		return false;
	}

}
