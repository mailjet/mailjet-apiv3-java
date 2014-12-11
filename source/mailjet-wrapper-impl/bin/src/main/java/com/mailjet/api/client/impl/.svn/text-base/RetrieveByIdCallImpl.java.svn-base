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
 * Implementation that gets using an id a resource instance on MailJet API.
 * 
 * @author MailJet
 * 
 * @param <CallResultType>
 *            type of the resource created
 */
final class RetrieveByIdCallImpl<CallResultType> extends
		IdCallImpl<CallResultType, CallResultType, RetrieveByIdCallImpl<CallResultType>>
		implements MailJetApiCall.RetrieveById<CallResultType> {

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
	RetrieveByIdCallImpl(
			final MailJetClientConfiguration config,
			final MailJetConnectionProvider connectionProvider,
			final DataTransformer dataMapper,
			final MailJetApiService<? extends MailJetApiCall<CallResultType>> operation) {
		super(config, connectionProvider, dataMapper, operation);
	}

	@Override
	protected MailJetApiResponse execute(
			final MailJetConnectionProvider connectionProvider,
			final DataTransformer dataTransformer, final URI uri,
			final MailJetApiCredentials credentials)
			throws MailJetApiCallException {
		return connectionProvider.get(uri, credentials);
	}
	
	@Override
	protected boolean isSuccessfull(final int code) {
		return code == SUCCESS_OK;
	}

}
