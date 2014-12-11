package com.mailjet.api.client.impl;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import com.mailjet.api.client.MailJetApiCall;
import com.mailjet.api.client.MailJetApiCallException;
import com.mailjet.api.client.MailJetApiCallException.Error;
import com.mailjet.api.client.MailJetApiClient;
import com.mailjet.api.client.MailJetApiService;
import com.mailjet.api.client.config.MailJetClientConfiguration;
import com.mailjet.api.client.config.MailJetClientConfigurationException;
import com.mailjet.api.client.connect.MailJetConnectionProvider;
import com.mailjet.api.client.model.ResourceOperationTypes;
import com.mailjet.api.client.transform.DataTransformer;

/**
 * Default {@link MailJetApiClient} implementation which uses Google GSON and
 * Apache HTTPClient libraries.
 * 
 * @author MailJet
 * 
 */
public final class MailJetApiClientImpl implements MailJetApiClient {

	private final MailJetConnectionProvider connectionProvider;

	private final DataTransformer dataMapper;

	private final MailJetClientConfiguration config;

	/**
	 * Constructor.
	 * 
	 * @param config
	 *            not null, configuration used to access MailJet API
	 * @param connectionProvider
	 *            connection provider to use
	 * @param dataMapper
	 *            data transformer to use          
	 * @throws MailJetClientConfigurationException
	 *             thrown if a client could not be created with specified
	 *             configuration, e.g. bad baseUrl, etc.
	 */
	public MailJetApiClientImpl(final MailJetClientConfiguration config,
			final MailJetConnectionProvider connectionProvider,
			final DataTransformer dataMapper)
			throws MailJetClientConfigurationException {
		validateNotEmpty(
				config.getBaseUrl(),
				String.format("Value for \"%1$s\" is required.",
						config.getBaseUrl()));
		try {
			new URI(config.getBaseUrl());
		} catch (URISyntaxException e) {
			throw new MailJetClientConfigurationException(
					"Format of the URL of the MailJet API is invalid.", e);
		}

		validateNotEmpty(
				config.getDefaultApiKey(),
				String.format("Value for \"%1$s\" is required.",
						config.getDefaultApiKey()));
		validateNotEmpty(
				config.getDefaultSecretKey(),
				String.format("Value for \"%1$s\" is required.",
						config.getDefaultSecretKey()));
		this.connectionProvider = connectionProvider != null ? connectionProvider
				: (MailJetConnectionProvider) createObjectForClass(config
						.getConnectionProviderImplementation());
		this.dataMapper = dataMapper != null ? dataMapper
				: (DataTransformer) createObjectForClass(config
						.getDataMapperImplementation());
		this.config = config.cloneConfiguration();
	}

	/**
	 * Constructor.
	 * 
	 * @param config
	 *            not null, configuration used to access MailJet API
	 * @throws MailJetClientConfigurationException
	 *             thrown if a client could not be created with specified
	 *             configuration, e.g. bad baseUrl, etc.
	 */
	public MailJetApiClientImpl(final MailJetClientConfiguration config)
			throws MailJetClientConfigurationException {
		this(config, null, null);
	}

	/**
	 * Constructor that builds client from default configuration with custom
	 * connection provider and data mapper.
	 * 
	 * @param connectionProvider
	 *            connection provider to use
	 * @param dataMapper
	 *            data transformer to use
	 * @throws MailJetClientConfigurationException
	 *             if failed
	 */
	MailJetApiClientImpl(final MailJetConnectionProvider connectionProvider,
			final DataTransformer dataMapper)
			throws MailJetClientConfigurationException {
		this(new MailJetClientConfiguration().loadDefault(),
				connectionProvider, dataMapper);
	}

	/**
	 * Constructor. Creates a client reading it's configuration from default
	 * mailjet.properties files.
	 * 
	 * @throws MailJetClientConfigurationException
	 *             thrown if a client could not be created with specified
	 *             configuration, e.g. configuration file not found, bad
	 *             baseUrl, etc.
	 */
	public MailJetApiClientImpl() throws MailJetClientConfigurationException {
		this(new MailJetClientConfiguration().loadDefault());
	}

	/**
	 * Creates a MailJet API Client using configuration from specified file. See
	 * {@link MailJetClientConfiguration#loadFromClassPath(String)}.
	 * 
	 * @param fileName
	 *            not null, configuration data
	 * 
	 * @throws MailJetClientConfigurationException
	 *             if a client could not be built from the configuration data
	 *             contained in this object, e.g. missing mandatory
	 *             configuration
	 */
	public MailJetApiClientImpl(final String fileName)
			throws MailJetClientConfigurationException {
		this(new MailJetClientConfiguration().loadFromClassPath(fileName));
	}

	@SuppressWarnings("unchecked")
	public <CallResultType, CallType extends MailJetApiCall<CallResultType>> CallType createCall(
			final MailJetApiService<CallType> operation)
			throws MailJetApiCallException {
		MailJetApiCallImpl.assertThat(operation != null,
				"Cannot create call for null operation.", Error.ClientMisuse);
		if (ResourceOperationTypes.Get == operation.getOperation()) {
			return (CallType) new RetrieveCallImpl<CallResultType>(
					config,
					connectionProvider,
					dataMapper,
					(MailJetApiService<? extends MailJetApiCall<List<CallResultType>>>) operation);
		} else if (operation.getOperation() == ResourceOperationTypes.GetById) {
			return (CallType) new RetrieveByIdCallImpl<CallResultType>(config,
					connectionProvider, dataMapper, operation);
		} else if (operation.getOperation() == ResourceOperationTypes.Put) {
			return (CallType) new UpdateCallImpl<CallResultType>(config,
					connectionProvider, dataMapper, operation);
		} else if (operation.getOperation() == ResourceOperationTypes.Post) {
			return (CallType) new CreateCallImpl<CallResultType>(config,
					connectionProvider, dataMapper, operation);
		} else if (operation.getOperation() == ResourceOperationTypes.Delete) {
			return (CallType) new DeleteCallImpl<CallResultType>(config,
					connectionProvider, dataMapper, operation);
		}

		throw new MailJetApiCallException(
				Error.ClientMisuse,
				String.format(
						"The client doesn't support the requested service: (operation \"%1$s\" on recource \"%2$s\".)",
						operation.getOperation(), operation.getName()));
	}

	/**
	 * Creates an instance of the class identified by the name provided. This
	 * method helps to remove compilation dependancy to default JSON
	 * transformation and HTTP communication libraries used by MailJet API
	 * wrapper. The class must have a default no argument constructor with
	 * public access. This method is not private only for testing purposes!
	 * 
	 * @param className
	 *            not null, the name of the class
	 * @param <T>
	 *            type of the object created
	 * @return instance of the class
	 * @throws MailJetClientConfigurationException
	 *             thrown if the object could not be instantiated for some
	 *             reason, e.g. missing class, no default constructor, etc.
	 */
	@SuppressWarnings("unchecked")
	static <T> T createObjectForClass(final String className)
			throws MailJetClientConfigurationException {
		try {
			return (T) Class.forName(className).newInstance();
		} catch (Exception e) {
			throw new MailJetClientConfigurationException(e);
		}
	}

	/**
	 * Validates that the passed object is not null. If null an
	 * {@link IllegalArgumentException} is thrown with the supplied message.
	 * 
	 * @param value
	 *            the object to validate
	 * @param message
	 *            the message of the exception
	 * @throws MailJetClientConfigurationException
	 *             thrown if the validation fails
	 */
	private static void validateNotEmpty(final String value,
			final String message) throws MailJetClientConfigurationException {
		if (value == null || value.length() == 0) {
			throw new MailJetClientConfigurationException(message);
		}
	}

}
