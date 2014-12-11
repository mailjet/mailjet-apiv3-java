package com.mailjet.api.client.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.mailjet.api.client.MailJetApiClient;
import com.mailjet.api.client.connect.MailJetConnectionProvider;
import com.mailjet.api.client.transform.DataTransformer;

/**
 * Class defining the configuration properties supported by the Java MailJet API
 * client and facilitates the creation of {@link MailJetApiClient} based on the
 * specified property values.
 * 
 * @author MailJet
 * 
 */
public final class MailJetClientConfiguration {
	private static final String DEFAULT_TRANSFORMER_CLASS = "com.mailjet.api.client.transform.impl.GsonDataTransformerImpl";
	private static final String DEFAULT_PROVIDER_CLASS = "com.mailjet.api.client.connect.impl.HttpClientConnectionProviderImpl";
	private String baseUrl;
	private String defaultApiKey;
	private String defaultSecretKey;
	private String clientImplementation = "com.mailjet.api.client.impl.MailJetApiClientImpl";
	private String connectionProviderImplementation = DEFAULT_PROVIDER_CLASS;
	private String dataMapperImplementation = DEFAULT_TRANSFORMER_CLASS;

	private ClassLoader resourceClassLoader;

	/**
	 * Default constructor.
	 * 
	 */
	public MailJetClientConfiguration() {
		this.resourceClassLoader = MailJetClientConfiguration.class
				.getClassLoader();
	}

	/**
	 * Loads the configuration properties from the specified classpath resource.
	 * 
	 * @param fileName
	 *            not null, path to the configuration file on the classpath
	 * @return not null, this object
	 * @throws MailJetClientConfigurationException
	 *             thrown if the configuration could not be loaded from the
	 *             specified file
	 * 
	 */
	public MailJetClientConfiguration loadFromClassPath(final String fileName)
			throws MailJetClientConfigurationException {
		validateNotEmpty(fileName,
				"Non-empty classpath resource must be specified.");
		try {
			Properties properties = new Properties();
			InputStream confStream = resourceClassLoader
					.getResourceAsStream(fileName);
			validateNotNull(confStream, "Invalid classpath resource specified.");
			try {
				properties.load(confStream);
			} finally {
				confStream.close();
			}
			setBaseUrl(properties.getProperty("baseUrl"));
			setDefaultApiKey(properties.getProperty("defaultApiKey"));
			setDefaultSecretKey(properties.getProperty("defaultSecretKey"));
			if (properties.containsKey("connectionProviderImplementation")) {
				setConnectionProviderImplementation(properties
						.getProperty("connectionProviderImplementation"));
			}
			if (properties.containsKey("dataMapperImplementation")) {
				setDataMapperImplementation(properties
						.getProperty("dataMapperImplementation"));
			}
			return this;
		} catch (IOException e) {
			throw new MailJetClientConfigurationException(e);
		}

	}

	/**
	 * Loads the configuration properties from file name 'mailjet.properties'
	 * located on the the classpath.
	 * 
	 * @return not null, this object
	 * @throws MailJetClientConfigurationException
	 *             thrown if the configuration could not be loaded from the
	 *             default file
	 * 
	 */
	public MailJetClientConfiguration loadDefault()
			throws MailJetClientConfigurationException {
		loadFromClassPath("mailjet.properties");
		return this;
	}

	/**
	 * Creates a MailJet API Client based on the provided configuration.
	 * 
	 * @return not null, a client able to access MailJet API
	 * @throws MailJetClientConfigurationException
	 *             if a client could not be built from the configuration data
	 *             contained in this object, e.g. missing mandatory
	 *             configuration
	 */
	public MailJetApiClient buildClient()
			throws MailJetClientConfigurationException {
		return createObjectForClass(clientImplementation);
	}

	/**
	 * Creates a MailJet API Client based on the provided configuration.
	 * 
	 * @param dataMapper
	 *            not null, data mapper to use to map java objects to MailJet
	 *            API data format
	 * @param connectionProvider
	 *            not null, connection provider to MailJet API
	 * @return not null, a client able to access MailJet API
	 * @throws MailJetClientConfigurationException
	 *             if a client could not be built from the configuration data
	 *             contained in this object, e.g. missing mandatory
	 *             configuration
	 */
	public MailJetApiClient buildClient(
			final MailJetConnectionProvider connectionProvider,
			final DataTransformer dataMapper)
			throws MailJetClientConfigurationException {
		return createObjectForClass(clientImplementation, connectionProvider,
				dataMapper);
	}

	/**
	 * Gets the URL which the clients built by this configuration use to access
	 * the MailJet API.
	 * 
	 * @return a valid URL string at which the MailJet API can be accessed or
	 *         null if not set yet
	 */
	public String getBaseUrl() {
		return baseUrl;
	}

	/**
	 * Sets the URL which the clients built by this configuration should use to
	 * access the MailJet API.
	 * 
	 * @param baseUrl
	 *            not null, the URL of the MailJet API
	 * @return not null, this object
	 */
	public MailJetClientConfiguration setBaseUrl(final String baseUrl) {
		this.baseUrl = baseUrl;
		return this;
	}

	/**
	 * Gets the API key which the clients built by this configuration use by
	 * default to access the MailJet API.
	 * 
	 * @return the API key for MailJet API access or null if not set yet
	 */
	public String getDefaultApiKey() {
		return defaultApiKey;
	}

	/**
	 * Sets the API key which the clients built by this configuration should use
	 * by default to access the MailJet API.
	 * 
	 * @param defaultAPIKey
	 *            not null, API key provided by MailJet to access the API
	 * @return not null, this object
	 */
	public MailJetClientConfiguration setDefaultApiKey(
			final String defaultAPIKey) {
		this.defaultApiKey = defaultAPIKey;
		return this;
	}

	/**
	 * Gets the secret key which the clients built by this configuration use by
	 * default to access the MailJet API.
	 * 
	 * @return the secret key for MailJet API access or null if not set yet
	 */
	public String getDefaultSecretKey() {
		return defaultSecretKey;
	}

	/**
	 * Sets the secret key which the clients built by this configuration should
	 * use by default to access the MailJet API.
	 * 
	 * @param defaultSecretKey
	 *            not null, secret key provided by MailJet to access the API
	 * @return not null, this object
	 */
	public MailJetClientConfiguration setDefaultSecretKey(
			final String defaultSecretKey) {
		this.defaultSecretKey = defaultSecretKey;
		return this;
	}

	/**
	 * Validates that the passed object is not null. If null an
	 * {@link MailJetClientConfigurationException} is thrown with the supplied
	 * message.
	 * 
	 * @param object
	 *            the object to validate
	 * @param message
	 *            the message of the exception
	 * @throws MailJetClientConfigurationException
	 *             thrown if the validation fails
	 */
	private void validateNotNull(final Object object, final String message)
			throws MailJetClientConfigurationException {
		if (object == null) {
			throw new MailJetClientConfigurationException(message);
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
	private void validateNotEmpty(final String value, final String message)
			throws MailJetClientConfigurationException {
		if (value == null || value.length() == 0) {
			throw new MailJetClientConfigurationException(message);
		}
	}

	/**
	 * Setter is added only for testing purposes.
	 * 
	 * @param resourceClassLoader
	 *            not null, class loader to be used to lookup MailJet API Client
	 *            configuration
	 * @return not null, this object
	 */
	MailJetClientConfiguration setResourceClassLoader(
			final ClassLoader resourceClassLoader) {
		this.resourceClassLoader = resourceClassLoader;
		return this;
	}

	/**
	 * Clones the current configuration.
	 * 
	 * @return not null, same configuration data
	 */
	public MailJetClientConfiguration cloneConfiguration() {
		return new MailJetClientConfiguration()
				.setBaseUrl(getBaseUrl())
				.setDefaultApiKey(getDefaultApiKey())
				.setDefaultSecretKey(getDefaultSecretKey())
				.setConnectionProviderImplementation(
						getConnectionProviderImplementation())
				.setDataMapperImplementation(getDataMapperImplementation());
	}

	/**
	 * Sets the {@link MailJetApiClient} implementation to be used. The string
	 * should contain the fully qualified class name of the implementation
	 * class. The class must have a one argument constructor accepting
	 * {@link MailJetClientConfiguration}.
	 * 
	 * @param clientImplementation
	 *            not null, the fully qualified class name of the implementation
	 * @return not null, this object
	 */
	public MailJetClientConfiguration setClientImplementation(
			final String clientImplementation) {
		this.clientImplementation = clientImplementation;
		return this;
	}

	/**
	 * Creates an instance of the {@link MailJetApiClient} using the
	 * implementation specified in the configuration. The class must have a one
	 * argument constructor accepting {@link MailJetClientConfiguration}.
	 * 
	 * @param className
	 *            not null, the name of the class
	 * @param <T>
	 *            type of the object created
	 * 
	 * @return instance of the class
	 * @throws MailJetClientConfigurationException
	 *             thrown if the object could not be instantiated for some
	 *             reason, e.g. missing class, no default constructor, etc.
	 */
	@SuppressWarnings("unchecked")
	private <T> T createObjectForClass(final String className)
			throws MailJetClientConfigurationException {
		try {
			return (T) Class.forName(className)
					.getConstructor(MailJetClientConfiguration.class)
					.newInstance(this);
		} catch (Exception e) {
			throw new MailJetClientConfigurationException(e);
		}
	}

	/**
	 * Creates an instance of the {@link MailJetApiClient} using the
	 * implementation specified in the configuration. The class must have a one
	 * argument constructor accepting {@link MailJetClientConfiguration}.
	 * 
	 * @param className
	 *            not null, the name of the class
	 * @param dataMapper
	 *            not null, data mapper to use to map java objects to MailJet
	 *            API data format
	 * @param connectionProvider
	 *            not null, connection provider to MailJet API
	 * @param <T>
	 *            type of the object created
	 * 
	 * @return instance of the class
	 * @throws MailJetClientConfigurationException
	 *             thrown if the object could not be instantiated for some
	 *             reason, e.g. missing class, no default constructor, etc.
	 */
	@SuppressWarnings("unchecked")
	private <T> T createObjectForClass(final String className,
			final MailJetConnectionProvider connectionProvider,
			final DataTransformer dataMapper)
			throws MailJetClientConfigurationException {
		try {
			return (T) Class
					.forName(className)
					.getConstructor(MailJetClientConfiguration.class,
							MailJetConnectionProvider.class,
							DataTransformer.class)
					.newInstance(this, connectionProvider, dataMapper);
		} catch (Exception e) {
			throw new MailJetClientConfigurationException(e);
		}
	}

	/**
	 * Gets the fully qualified class name of {@link MailJetConnectionProvider}
	 * that the built client will use to call MailJet API.
	 * 
	 * @return not null, connection provider to MailJetAPI
	 */
	public String getConnectionProviderImplementation() {
		return connectionProviderImplementation;
	}

	/**
	 * Sets the fully qualified class name of {@link MailJetConnectionProvider}
	 * that the built client should use to access MailJet API.
	 * 
	 * @param connectionProviderImplementation
	 *            not null, connection provider to MailJet API
	 * 
	 * @return not null, this object
	 * 
	 */
	public MailJetClientConfiguration setConnectionProviderImplementation(
			final String connectionProviderImplementation) {
		this.connectionProviderImplementation = connectionProviderImplementation;
		return this;
	}

	/**
	 * Gets the fully qualified class name of {@link DataTransformer} that the
	 * built client will use to transform Java object data to format required by
	 * MailJet API.
	 * 
	 * @return the data transformer class name, null if not set
	 */
	public String getDataMapperImplementation() {
		return dataMapperImplementation;
	}

	/**
	 * Sets the fully qualified class name of {@link DataTransformer} that the
	 * built client should use to transform Java object data to format required
	 * by MailJet API.
	 * 
	 * @param dataMapperImplementation
	 *            not null, class name of the transformer to MailJet API data
	 *            format
	 * 
	 * @return not null, this object
	 * 
	 */
	public MailJetClientConfiguration setDataMapperImplementation(
			final String dataMapperImplementation) {
		this.dataMapperImplementation = dataMapperImplementation;
		return this;
	}

}
