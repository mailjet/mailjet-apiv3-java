package com.mailjet.api.client.impl;

import java.net.URI;
import java.util.LinkedHashMap;
import java.util.Map;

import com.mailjet.api.client.MailJetApiCall;
import com.mailjet.api.client.MailJetApiCallException;
import com.mailjet.api.client.MailJetApiCallException.Error;
import com.mailjet.api.client.MailJetApiService;
import com.mailjet.api.client.config.MailJetClientConfiguration;
import com.mailjet.api.client.connect.MailJetConnectionProvider;
import com.mailjet.api.client.connect.MailJetConnectionProvider.MailJetApiCredentials;
import com.mailjet.api.client.connect.MailJetConnectionProvider.MailJetApiResponse;
import com.mailjet.api.client.model.MailJetResourceProperty;
import com.mailjet.api.client.transform.DataTransformer;

/**
 * Implementation that updates an existing resource instance on MailJet API.
 * 
 * @author MailJet
 * 
 * @param <CallResultType>
 *            type of the resource created
 */
final class UpdateCallImpl<CallResultType> extends
		IdCallImpl<CallResultType,CallResultType, MailJetApiCall.Update<CallResultType>>
		implements MailJetApiCall.Update<CallResultType> {

	private Map<String, Object> properties = new LinkedHashMap<String, Object>();

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
	UpdateCallImpl(
			final MailJetClientConfiguration config,
			final MailJetConnectionProvider connectionProvider,
			final DataTransformer dataMapper,
			final MailJetApiService<? extends MailJetApiCall<CallResultType>> operation) {
		super(config, connectionProvider, dataMapper, operation);
	}

	public <PropertyDataType> com.mailjet.api.client.MailJetApiCall.Update<CallResultType> property(
			final MailJetResourceProperty<CallResultType,PropertyDataType> property,
			final PropertyDataType value) throws MailJetApiCallException {
		assertThat(property != null,
				"You must specify non-null value as property to update.",
				Error.ClientMisuse);
		assertThat(property.getName() != null,
				"You must specify non-null value for property name.",
				Error.ClientMisuse);
		assertThat(!properties.containsKey(property.getName()),
				"Value for property already set.", Error.ClientMisuse);
		properties.put(property.getName(), value == null ? "" : value);
		return this;
	}

	@Override
	protected MailJetApiResponse execute(
			final MailJetConnectionProvider connectionProvider,
			final DataTransformer dataTransformer, final URI uri,
			final MailJetApiCredentials credentials)
			throws MailJetApiCallException {
		assertThat(!properties.isEmpty(),
				"No properties for update were specified.", Error.ClientMisuse);
		return connectionProvider.put(uri,
				dataTransformer.toString(properties), credentials);
	}

	
	@Override
	protected boolean isSuccessfull(final int code) {
		return code == SUCCESS_OK;
	}
}
