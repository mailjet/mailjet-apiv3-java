package com.mailjet.api.client.impl;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collections;

import com.mailjet.api.client.MailJetApiCallException;
import com.mailjet.api.client.MailJetApiService;
import com.mailjet.api.client.MailJetApiCallException.Error;
import com.mailjet.api.client.config.MailJetClientConfiguration;
import com.mailjet.api.client.connect.MailJetConnectionProvider;
import com.mailjet.api.client.model.MailJetKeyProperty;
import com.mailjet.api.client.transform.DataTransformer;

/**
 * Abstract parent for all calls that require id to be set in order to make a
 * call.
 * 
 * @author MaillJet
 * 
 * @param <ResourceType>
 *            type of the resource
 * @param <CallResultType>
 *            type of call return
 * @param <CallType>
 *            type of call
 */
abstract class IdCallImpl<ResourceType, CallResultType, CallType> extends
		MailJetApiCallImpl<CallResultType> {

	private Object id;

	/**
	 * Constructor.
	 * 
	 * @param config
	 *            not null, client configuration
	 * @param operation
	 *            not null, service to be invoked
	 * @param dataMapper
	 *            not null, data mapper to use to map java objects to MailJet
	 *            API data format
	 * @param connectionProvider
	 *            not null, connection provider to MailJet API
	 */
	IdCallImpl(final MailJetClientConfiguration config,
			final MailJetConnectionProvider connectionProvider,
			final DataTransformer dataMapper,
			final MailJetApiService<?> operation) {
		super(config, connectionProvider, dataMapper, operation);
	}

	/**
	 * Sets the id of the call.
	 * 
	 * @param property
	 *            not null, the key property that the identifier value relates
	 *            to to
	 * 
	 * @param id
	 *            not null, id of the resource
	 * @param <DataType>
	 *            type of the identifier value supplied
	 * 
	 * @return this object
	 * @throws MailJetApiCallException
	 *             thrown if the value is null
	 */
	@SuppressWarnings("unchecked")
	public final <DataType> CallType identifiedBy(
			final MailJetKeyProperty<ResourceType, DataType> property,
			final DataType id) throws MailJetApiCallException {
		assertThat(property != null, "Ientifier property must not be null.",
				Error.ClientMisuse);
		assertThat(property.getName() != null,
				"Identifier property name must not be null.",
				Error.ClientMisuse);
		assertThat(id != null, "Identifier value must not be null.",
				Error.ClientMisuse);
		assertThat(this.id == null,
				"Identifier value already set for this call.",
				Error.ClientMisuse);
		this.id = id;
		return (CallType) this;
	}

	@Override
	protected final URI buildURI() throws URISyntaxException,
			UnsupportedEncodingException, MailJetApiCallException {
		assertThat(id != null,
				"Could not execute update request without specyfing an ID.",
				Error.ClientMisuse);
		return buildRequestURI(Collections.<String, Object> emptyMap(), getId()
				.toString());
	}

	/**
	 * Gets the id of the resource affected by the call.
	 * 
	 * @return the id value, null if not set
	 */
	protected final Object getId() {
		return id;
	}

}
