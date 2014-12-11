package com.mailjet.api.client;

import java.net.URI;
import java.net.URISyntaxException;

import org.jmock.Expectations;
import org.junit.Assert;
import org.junit.Test;

import com.mailjet.api.MailJetBaseT;
import com.mailjet.api.client.MailJetApiCall.Delete;
import com.mailjet.api.client.MailJetApiCallException.Error;
import com.mailjet.api.client.config.MailJetClientConfiguration;
import com.mailjet.api.client.connect.MailJetConnectionProvider;
import com.mailjet.api.client.connect.MailJetConnectionProvider.MailJetApiCredentials;
import com.mailjet.api.client.connect.MailJetConnectionProvider.MailJetApiResponse;
import com.mailjet.api.client.model.MailJetKeyProperty;
import com.mailjet.api.client.transform.DataTransformer;

/**
 * Tests that {@link MailJetApiCall} implementations must pass.
 * 
 * @author MailJet
 * 
 */
public abstract class DeleteTest extends MailJetBaseT {

	private static final String MAILJET_URL = "http://base";

	/**
	 * Tests null id property is passed.
	 */
	@Test
	public void testNullIdProperty() {
		try {
			createCall().identifiedBy(null, 1);
			Assert.fail();
		} catch (MailJetApiCallException e) {
			Assert.assertEquals(Error.ClientMisuse, e.getError());
		}
	}

	/**
	 * Tests null id property name passed.
	 */
	@Test
	public void testNullIdPropertyName() {
		try {
			createCall()
					.identifiedBy(
							new MailJetKeyProperty<Object, Integer>(null,
									Integer.class), 1);
			Assert.fail();
		} catch (MailJetApiCallException e) {
			Assert.assertEquals(Error.ClientMisuse, e.getError());
		}
	}

	/**
	 * Tests null id value is passed.
	 * 
	 * @throws MailJetApiCallException
	 */
	@Test
	public void testNullIdValue() throws MailJetApiCallException {
		try {
			createCall().identifiedBy(
					new MailJetKeyProperty<Object, Integer>("test",
							Integer.class), null);
			Assert.fail();
		} catch (MailJetApiCallException e) {
			Assert.assertEquals(Error.ClientMisuse, e.getError());
		}
	}

	/**
	 * Tests successful creation when everything is set up.
	 * 
	 * @throws MailJetApiCallException
	 */
	@Test
	public void testSuccessfullIdPropertySet() throws MailJetApiCallException {
		Assert.assertNotNull(createCall().identifiedBy(
				new MailJetKeyProperty<Object, Integer>("test", Integer.class),
				1));
	}

	/**
	 * Tests execution without id set.
	 */
	@Test
	public void testExecuteWithoutId() {
		try {
			createCall().execute();
			Assert.fail();
		} catch (MailJetApiCallException e) {
			Assert.assertEquals(Error.ClientMisuse, e.getError());
		}
	}

	/**
	 * Successfull invocation one result.
	 * 
	 * @throws MailJetApiCallException
	 * @throws URISyntaxException
	 */
	@Test
	public void testSuccessfullWithOneResult() throws MailJetApiCallException,
			URISyntaxException {
		final MailJetConnectionProvider connProvider = context
				.mock(MailJetConnectionProvider.class);

		context.checking(new Expectations() {
			{
				oneOf(connProvider).delete(
						new URI(MAILJET_URL + "/TestObject/value1"),
						defaultCredetials());
				will(returnValue(sampleResponse()));
			}
		});

		createCall(getConfiguration(), TestObject.class, connProvider,
				createTestDataTransformer())
				.identifiedBy(
						new MailJetKeyProperty<TestObject, String>("test",
								String.class), "value1").execute();

	}

	/**
	 * Successfull invocation no result.
	 * 
	 * @throws MailJetApiCallException
	 * @throws URISyntaxException
	 */
	@Test
	public void testURLBuiltDefaultNoResult() throws MailJetApiCallException,
			URISyntaxException {
		final MailJetConnectionProvider connProvider = context
				.mock(MailJetConnectionProvider.class);

		context.checking(new Expectations() {
			{
				oneOf(connProvider).delete(
						new URI(MAILJET_URL + "/TestObject/value1"),
						defaultCredetials());
				will(returnValue(sampleEmptyResponse()));
			}
		});

		createCall(getConfiguration(), TestObject.class, connProvider,
				createTestDataTransformer())
				.identifiedBy(
						new MailJetKeyProperty<TestObject, String>("test",
								String.class), "value1").execute();

	}

	/**
	 * Fails with 200 response.
	 * 
	 * @throws MailJetApiCallException
	 * @throws URISyntaxException
	 */
	@Test
	public void testFailWithMultipleResult() throws MailJetApiCallException,
			URISyntaxException {
		final MailJetConnectionProvider connProvider = context
				.mock(MailJetConnectionProvider.class);

		context.checking(new Expectations() {
			{
				oneOf(connProvider).delete(
						new URI(MAILJET_URL + "/TestObject/value1"),
						defaultCredetials());
				will(returnValue(sample200Response()));
			}
		});

		try {
			createCall(getConfiguration(), TestObject.class, connProvider,
					createTestDataTransformer()).identifiedBy(
					new MailJetKeyProperty<TestObject, String>("test",
							String.class), "value1").execute();
			Assert.fail();
		} catch (MailJetApiCallException e) {
			Assert.assertEquals(Error.Unknown, e.getError());
		}

	}

	/**
	 * Test result when API returns error.
	 * 
	 * @throws MailJetApiCallException
	 * @throws URISyntaxException
	 */
	@Test
	public void testResponseError() throws MailJetApiCallException,
			URISyntaxException {
		final MailJetConnectionProvider connProvider = context
				.mock(MailJetConnectionProvider.class);

		context.checking(new Expectations() {
			{
				oneOf(connProvider).delete(
						new URI(MAILJET_URL + "/TestObject/value1"),
						defaultCredetials());
				will(returnValue(sampleErrorResponse()));
			}
		});

		try {
			createCall(getConfiguration(), TestObject.class, connProvider,
					createTestDataTransformer()).identifiedBy(
					new MailJetKeyProperty<TestObject, String>("test",
							String.class), "value1").execute();
			Assert.fail();
		} catch (MailJetApiCallException e) {
			Assert.assertEquals(Error.NotFound, e.getError());
		}

	}

	private MailJetApiResponse sampleResponse() {
		return new MailJetConnectionProvider.MailJetApiResponse(
				"{Data:[{property:'testValue',unknown:'test'}]}", 204);
	}

	private MailJetApiResponse sampleErrorResponse() {
		return new MailJetConnectionProvider.MailJetApiResponse(
				"{ErrorInfo:'info', ErrorMessage: 'message', Status:404}", 404);
	}

	private MailJetApiResponse sample200Response() {
		return new MailJetConnectionProvider.MailJetApiResponse(
				"{Data:[{property:'testValue'},{property:'testValue2'},{property:'testValue3'}]}",
				200);
	}

	private MailJetApiResponse sampleEmptyResponse() {
		return new MailJetConnectionProvider.MailJetApiResponse("{Data:[]}",
				204);
	}

	private MailJetApiCredentials defaultCredetials() {
		return new MailJetApiCredentials("key", "secret");
	}

	private MailJetClientConfiguration getConfiguration() {
		return new MailJetClientConfiguration().setBaseUrl(MAILJET_URL)
				.setDefaultApiKey("key").setDefaultSecretKey("secret");
	}
	
	protected abstract DataTransformer createTestDataTransformer();

	/**
	 * Implementations should return a call that is expected to fail before
	 * calling the MailJet API.
	 * 
	 * @return not null
	 */
	public abstract <ResourceType> Delete<ResourceType> createCall();

	/**
	 * Creates call with specified parameters
	 * 
	 * @param config
	 * @param resourceClass
	 * @param provider
	 * @param transformer
	 * @return not null
	 */
	public abstract <ResourceType> Delete<ResourceType> createCall(
			MailJetClientConfiguration config,
			Class<ResourceType> resourceClass,
			MailJetConnectionProvider provider, DataTransformer transformer);

	/**
	 * Sample object to test with.
	 * 
	 * @author MailJet
	 * 
	 */
	public static class TestObject {
		
	}
}
