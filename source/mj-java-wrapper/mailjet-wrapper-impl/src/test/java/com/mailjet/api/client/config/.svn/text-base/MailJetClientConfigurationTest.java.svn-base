package com.mailjet.api.client.config;

import java.io.IOException;
import java.io.InputStream;

import org.junit.Assert;
import org.junit.Test;

import com.mailjet.api.MailJetBaseT;
import com.mailjet.api.client.connect.MailJetConnectionProvider;
import com.mailjet.api.client.transform.DataTransformer;

@SuppressWarnings("javadoc")
public class MailJetClientConfigurationTest extends MailJetBaseT {

	@Test
	public final void testProgramaticConfiguration() {
		String baseURL = "http://dummy";
		String defaultAPIKey = "apiKey";
		String defaultSecretKey = "secretKey";
		String connectionProvider = "provider";
		String dataMapper = "mapper";
		MailJetClientConfiguration config = new MailJetClientConfiguration()
				.setBaseUrl(baseURL).setDefaultApiKey(defaultAPIKey)
				.setDefaultSecretKey(defaultSecretKey)
				.setConnectionProviderImplementation(connectionProvider)
				.setDataMapperImplementation(dataMapper);
		Assert.assertEquals(baseURL, config.getBaseUrl());
		Assert.assertEquals(defaultAPIKey, config.getDefaultApiKey());
		Assert.assertEquals(defaultSecretKey, config.getDefaultSecretKey());
		Assert.assertEquals(connectionProvider,
				config.getConnectionProviderImplementation());
		Assert.assertEquals(dataMapper, config.getDataMapperImplementation());
	}

	@Test
	public final void testDefaultFileConfiguration() throws Exception {
		String baseURL = "http://file_dummy";
		String defaultAPIKey = "file_apiKey";
		String defaultSecretKey = "file_secretKey";
		MailJetClientConfiguration config = new MailJetClientConfiguration()
				.loadDefault();
		Assert.assertEquals(baseURL, config.getBaseUrl());
		Assert.assertEquals(defaultAPIKey, config.getDefaultApiKey());
		Assert.assertEquals(defaultSecretKey, config.getDefaultSecretKey());
	}

	@Test
	public final void testCustomFileConfiguration() throws Exception {
		String baseURL = "http://custom_dummy";
		String defaultAPIKey = "custom_apiKey";
		String defaultSecretKey = "custom_secretKey";
		String providerImpl = "providerImpl";
		String mapprImpl = "dataMapperImpl";
		MailJetClientConfiguration config = new MailJetClientConfiguration()
				.loadFromClassPath("mailjet_custom.properties");
		Assert.assertEquals(baseURL, config.getBaseUrl());
		Assert.assertEquals(defaultAPIKey, config.getDefaultApiKey());
		Assert.assertEquals(defaultSecretKey, config.getDefaultSecretKey());
		Assert.assertEquals(providerImpl,
				config.getConnectionProviderImplementation());
		Assert.assertEquals(mapprImpl, config.getDataMapperImplementation());
	}

	@Test(expected = MailJetClientConfigurationException.class)
	public final void testNotExistFileConfiguration() throws Exception {
		new MailJetClientConfiguration()
				.loadFromClassPath("mailjet_not_exists.properties");
	}

	@Test(expected = MailJetClientConfigurationException.class)
	public final void testBadFileParamConfiguration() throws Exception {
		new MailJetClientConfiguration().loadFromClassPath(null);
	}

	@Test(expected = MailJetClientConfigurationException.class)
	public final void testEmptyFileParamConfiguration() throws Exception {
		new MailJetClientConfiguration().loadFromClassPath("");
	}

	@Test(expected = MailJetClientConfigurationException.class)
	public final void testMissingBaseURL() throws Exception {
		String defaultAPIKey = "apiKey";
		String defaultSecretKey = "secretKey";
		new MailJetClientConfiguration().setDefaultApiKey(defaultAPIKey)
				.setDefaultSecretKey(defaultSecretKey).buildClient();
	}

	@Test(expected = MailJetClientConfigurationException.class)
	public final void testMissingApiKey() throws Exception {
		String baseURL = "http://dummy";
		String defaultSecretKey = "secretKey";
		new MailJetClientConfiguration().setBaseUrl(baseURL)
				.setDefaultSecretKey(defaultSecretKey).buildClient();
	}

	@Test(expected = MailJetClientConfigurationException.class)
	public final void testMissingSecretKey() throws Exception {
		String baseURL = "http://dummy";
		String defaultAPIKey = "apiKey";
		new MailJetClientConfiguration().setBaseUrl(baseURL)
				.setDefaultApiKey(defaultAPIKey).buildClient();
	}

	@Test(expected = MailJetClientConfigurationException.class)
	public final void testBadURL() throws Exception {
		String baseURL = ":http://dummy";
		String defaultAPIKey = "apiKey";
		String defaultSecretKey = "secretKey";
		new MailJetClientConfiguration().setBaseUrl(baseURL)
				.setDefaultApiKey(defaultAPIKey)
				.setDefaultSecretKey(defaultSecretKey).buildClient();
	}

	@Test
	public final void testSuccessfullBuild() throws Exception {
		String baseURL = "http://dummy";
		String defaultAPIKey = "apiKey";
		String defaultSecretKey = "secretKey";
		MailJetClientConfiguration config = new MailJetClientConfiguration()
				.setBaseUrl(baseURL).setDefaultApiKey(defaultAPIKey)
				.setDefaultSecretKey(defaultSecretKey);
		Assert.assertNotNull(config.buildClient());
	}

	@Test(expected = MailJetClientConfigurationException.class)
	public final void testWrongClientSpecified() throws Exception {
		new MailJetClientConfiguration().loadDefault().setClientImplementation("missing")
				.buildClient();
	}

	@Test
	public final void testSuccessfullBuildWithCustomProviderAndMapper()
			throws Exception {
		new MailJetClientConfiguration()
				.loadDefault()
				.buildClient(context.mock(MailJetConnectionProvider.class),
						context.mock(DataTransformer.class));
	}

	@Test(expected = MailJetClientConfigurationException.class)
	public final void testWrongClientSpecifiedCustomBuild() throws Exception {
		new MailJetClientConfiguration()
				.loadDefault()
				.setClientImplementation("missing")
				.buildClient(context.mock(MailJetConnectionProvider.class),
						context.mock(DataTransformer.class));
	}

	@Test(expected = MailJetClientConfigurationException.class)
	public final void testIOErroLoadingConfig() throws Exception {
		MailJetClientConfiguration config = new MailJetClientConfiguration()
				.setResourceClassLoader(new ClassLoader() {
					@Override
					public InputStream getResourceAsStream(final String name) {
						InputStream resourceAsStream = MailJetClientConfiguration.class
								.getClassLoader().getResourceAsStream(
										"mailjet_custom.properties");
						try {
							resourceAsStream.close();
						} catch (IOException e) {
							throw new RuntimeException(e);
						}
						return resourceAsStream;
					}
				});
		config.loadDefault();
	}

}
