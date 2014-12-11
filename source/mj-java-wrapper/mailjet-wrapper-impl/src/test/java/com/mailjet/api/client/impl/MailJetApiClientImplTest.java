package com.mailjet.api.client.impl;

import java.net.URI;

import org.jmock.Expectations;
import org.junit.Assert;
import org.junit.Test;

import com.mailjet.api.MailJetBaseT;
import com.mailjet.api.client.MailJetApiCall;
import com.mailjet.api.client.MailJetApiCallException;
import com.mailjet.api.client.MailJetApiCallException.Error;
import com.mailjet.api.client.MailJetApiClient;
import com.mailjet.api.client.MailJetApiService;
import com.mailjet.api.client.config.MailJetClientConfiguration;
import com.mailjet.api.client.config.MailJetClientConfigurationException;
import com.mailjet.api.client.connect.MailJetConnectionProvider;
import com.mailjet.api.client.connect.MailJetConnectionProvider.MailJetApiCredentials;
import com.mailjet.api.client.connect.MailJetConnectionProvider.MailJetApiResponse;
import com.mailjet.api.client.model.TApiKey;
import com.mailjet.api.client.transform.DataTransformer;
import com.mailjet.api.client.transform.impl.GsonDataTransformerImpl;

/**
 * Tests for MailJet client implementation.
 * 
 * @author user
 * 
 */
public class MailJetApiClientImplTest extends MailJetBaseT {
	
	private static final String DEFAULT_PARAMS = "style=flat&format=json";
	
	/**
	 * Test create for null operation.
	 * 
	 * @throws Exception
	 *             not expected
	 */
	@Test
	public final void testCreateForNullOp() throws Exception {

		try {
			createClient().createCall(null);
		} catch (MailJetApiCallException e) {
			Assert.assertEquals(Error.ClientMisuse, e.getError());
		}
	}

	/**
	 * Test built from default.
	 * 
	 * @throws Exception
	 *             not expected
	 */
	@Test
	public final void testBuiltDefault() throws Exception {
		final MailJetConnectionProvider connProvider = context.mock(MailJetConnectionProvider.class);
		context.checking(new Expectations() {{
            oneOf (connProvider).get(new URI("http://file_dummy/apikey?" + DEFAULT_PARAMS), new MailJetApiCredentials("file_apiKey", "file_secretKey"));
            will(returnValue(emptyResponse()));
        }});
		
		try {
			new MailJetApiClientImpl(
					connProvider,
					new GsonDataTransformerImpl()).createCall(TApiKey.Get).execute();
		} catch (MailJetApiCallException e) {
			Assert.assertEquals(Error.ClientMisuse, e.getError());
		}
	}
	
	

	/**
	 * Test successful creation of create call.
	 * 
	 * @throws Exception
	 *             not expected
	 */
	@Test
	public final void testCreate() throws Exception {
		Assert.assertEquals(CreateCallImpl.class,
				createClient().createCall(TApiKey.Create).getClass());

	}

	/**
	 * Test successful creation of retrieve call.
	 * 
	 * @throws Exception
	 *             not expected
	 */
	@Test
	public final void testRetrieve() throws Exception {
		Assert.assertEquals(RetrieveCallImpl.class,
				createClient().createCall(TApiKey.Get).getClass());

	}

	/**
	 * Test successful creation of retrieve by id call.
	 * 
	 * @throws Exception
	 *             not expected
	 */
	@Test
	public final void testRetrieveById() throws Exception {
		Assert.assertEquals(RetrieveByIdCallImpl.class, createClient()
				.createCall(TApiKey.GetById).getClass());
	}

	/**
	 * Test successful creation of update call.
	 * 
	 * @throws Exception
	 *             not expected
	 */
	@Test
	public final void testUpdate() throws Exception {
		Assert.assertEquals(UpdateCallImpl.class,
				createClient().createCall(TApiKey.Update).getClass());

	}

	/**
	 * Test successful creation of delete call.
	 * 
	 * @throws Exception
	 *             not expected
	 */
	@Test
	public final void testDelete() throws Exception {
		Assert.assertEquals(DeleteCallImpl.class,
				createClient().createCall(TApiKey.Delete).getClass());
	}

	/**
	 * Test error is reported if a call to unknown operation should be created.
	 * 
	 * @throws Exception
	 *             not expected
	 */
	@Test
	public final void testUnknown() throws Exception {
		try {
			createClient().createCall(
					new MailJetApiService<MailJetApiCall<TApiKey>>(
							TApiKey.class, null));
		} catch (MailJetApiCallException e) {
			Assert.assertEquals(Error.ClientMisuse, e.getError());
		}

	}

	@Test(expected = MailJetClientConfigurationException.class)
	public final void testWrongClientSpecified() throws Exception {
		MailJetApiClientImpl.createObjectForClass("notExist");
	}
	
	@Test
	public final void testDefaultFileConfiguration() throws Exception {
		new MailJetApiClientImpl();
	}

	@Test
	public final void testCustomFileConfiguration() throws Exception {
		new MailJetApiClientImpl("mailjet.properties");
	}

	private final MailJetClientConfiguration createConfig() {
		return new MailJetClientConfiguration().setBaseUrl(baseURL)
				.setDefaultApiKey(defaultAPIKey)
				.setDefaultSecretKey(defaultSecretKey);
	}

	private final MailJetApiClient createClient()
			throws MailJetClientConfigurationException {
		return new MailJetApiClientImpl(createConfig(),
				context.mock(MailJetConnectionProvider.class),
				context.mock(DataTransformer.class));
	}
	
	private MailJetApiResponse emptyResponse() {
		return new MailJetConnectionProvider.MailJetApiResponse(
				"{Data:[{}]}", 200);
	}

	private final String baseURL = "http://dummy";
	private final String defaultAPIKey = "apiKey";
	private final String defaultSecretKey = "secretKey";

}
