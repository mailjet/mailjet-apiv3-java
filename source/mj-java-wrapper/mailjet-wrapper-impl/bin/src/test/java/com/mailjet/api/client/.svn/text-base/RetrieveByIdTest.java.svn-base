package com.mailjet.api.client;

import java.net.URI;
import java.net.URISyntaxException;

import org.jmock.Expectations;
import org.junit.Assert;
import org.junit.Test;

import com.mailjet.api.MailJetBaseT;
import com.mailjet.api.client.MailJetApiCall.RetrieveById;
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
public abstract class RetrieveByIdTest extends MailJetBaseT{

	private static final String MAILJET_URL = "http://base";
	
	private static final String DEFAULT_PARAMS = "style=flat&format=json";

	@Test
	public void testNullIdProperty() throws MailJetApiCallException {
		try {
			createCall().identifiedBy(null, 1);
			Assert.fail();
		} catch (MailJetApiCallException e) {
			Assert.assertEquals(Error.ClientMisuse, e.getError());
		}
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Test
	public void testNullIdPropertyName() throws MailJetApiCallException {
		try {
			createCall().identifiedBy(new MailJetKeyProperty(null, Integer.class), 1);
			Assert.fail();
		} catch (MailJetApiCallException e) {
			Assert.assertEquals(Error.ClientMisuse, e.getError());
		}
	}
	
	@Test
	public void testNullIdValue() throws MailJetApiCallException {
		try {
			createCall().identifiedBy(new MailJetKeyProperty<Object, Integer>("test", Integer.class), null);
			Assert.fail();
		} catch (MailJetApiCallException e) {
			Assert.assertEquals(Error.ClientMisuse, e.getError());
		}
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Test
	public void testSuccessfullIdPropertySet() throws MailJetApiCallException {
		Assert.assertNotNull(createCall().identifiedBy(new MailJetKeyProperty("test", Integer.class), 1));
	}
	
	@Test
	public void testExecuteWithoutId() throws MailJetApiCallException {
		try {
			createCall().execute();
			Assert.fail();
		} catch (MailJetApiCallException e) {
			Assert.assertEquals(Error.ClientMisuse, e.getError());
		}
	}
	

	/**
	 * Successfull invocation one result.
	 * @throws MailJetApiCallException
	 * @throws URISyntaxException
	 */
	@Test
	public void testSuccessfullWithOneResult() throws MailJetApiCallException, URISyntaxException {
		final MailJetConnectionProvider connProvider = context.mock(MailJetConnectionProvider.class);
		
		context.checking(new Expectations() {{
            oneOf (connProvider).get(new URI(MAILJET_URL + "/TestObject/value1?" + DEFAULT_PARAMS), defaultCredetials());
            will(returnValue(sampleResponse()));
        }});
		
		TestObject execute = createCall(
				getConfiguration(), TestObject.class, connProvider, createTestDataTransformer())
						.identifiedBy(new MailJetKeyProperty<TestObject, String>("test", String.class), "value1").execute();
		
		assertSampleResponse(execute);	
	}
	
	/**
	 * Successfull invocation no result.
	 * @throws MailJetApiCallException
	 * @throws URISyntaxException
	 */
	@Test
	public void testURLBuiltDefaultNoResult() throws MailJetApiCallException, URISyntaxException {
		final MailJetConnectionProvider connProvider = context.mock(MailJetConnectionProvider.class);
		
		context.checking(new Expectations() {{
            oneOf (connProvider).get(new URI(MAILJET_URL + "/TestObject/value1?" + DEFAULT_PARAMS), defaultCredetials());
            will(returnValue(sampleEmptyResponse()));
        }});
		
		TestObject execute = createCall(
				getConfiguration(), TestObject.class, connProvider, createTestDataTransformer())
						.identifiedBy(new MailJetKeyProperty<TestObject, String>("test", String.class), "value1").execute();
		
		Assert.assertNull(execute);	
	}
	
	/**
	 * Successfull invocation one result.
	 * @throws MailJetApiCallException
	 * @throws URISyntaxException
	 */
	@Test
	public void testFailWithMultipleResult() throws MailJetApiCallException, URISyntaxException {
		final MailJetConnectionProvider connProvider = context.mock(MailJetConnectionProvider.class);
		
		context.checking(new Expectations() {{
            oneOf (connProvider).get(new URI(MAILJET_URL + "/TestObject/value1?" + DEFAULT_PARAMS), defaultCredetials());
            will(returnValue(sampleMultiResponse()));
        }});
		
		try {
			createCall(
					getConfiguration(), TestObject.class, connProvider, createTestDataTransformer())
					.identifiedBy(new MailJetKeyProperty<TestObject, String>("test", String.class), "value1").execute();
			Assert.fail();
		} catch (MailJetApiCallException e) {
			Assert.assertEquals(Error.ClientInternalError, e.getError());
		}
		
	}
	
	@Test
	public void testURLBuiltResponseError() throws MailJetApiCallException, URISyntaxException {
		final MailJetConnectionProvider connProvider = context.mock(MailJetConnectionProvider.class);
		
		context.checking(new Expectations() {{
            oneOf (connProvider).get(new URI(MAILJET_URL + "/TestObject/value1?" + DEFAULT_PARAMS), defaultCredetials());
            will(returnValue(sampleErrorResponse()));
        }});
		
		
		try {
			createCall(
					getConfiguration(), TestObject.class, connProvider, createTestDataTransformer())
					.identifiedBy(new MailJetKeyProperty<TestObject, String>("test", String.class), "value1").execute();
			Assert.fail();
		} catch (MailJetApiCallException e) {
			Assert.assertEquals(Error.NotFound, e.getError());
		}
		
	}

	private void assertSampleResponse(TestObject object) {
		Assert.assertNotNull(object);	
		Assert.assertEquals("testValue", object.property);
		Assert.assertNull(object.property2);
	}
	
	private MailJetApiResponse sampleResponse() {
		return new MailJetConnectionProvider.MailJetApiResponse("{Count:1,Data:[{property:'testValue',unknown:'test'}]}", 200);
	}
	
	private MailJetApiResponse sampleErrorResponse() {
		return new MailJetConnectionProvider.MailJetApiResponse("{ErrorInfo:'info', ErrorMessage: 'message', Status:404}", 404);
	}
	
	private MailJetApiResponse sampleMultiResponse() {
		return new MailJetConnectionProvider.MailJetApiResponse("{Count:3,Data:[{property:'testValue'},{property:'testValue2'},{property:'testValue3'}]}", 200);
	}
	
	private MailJetApiResponse sampleEmptyResponse() {
		return new MailJetConnectionProvider.MailJetApiResponse("{Data:[]}", 200);
	}
	
	private MailJetApiCredentials defaultCredetials() {
		return new MailJetApiCredentials("key", "secret");
	}
	
	
	
	private MailJetClientConfiguration getConfiguration(){
		return new MailJetClientConfiguration()
			.setBaseUrl(MAILJET_URL)
			.setDefaultApiKey("key")
			.setDefaultSecretKey("secret");
	}
	
	protected abstract DataTransformer createTestDataTransformer();

	public abstract <ResourceType> RetrieveById<ResourceType> createCall();
	
	public abstract <ResourceType> RetrieveById<ResourceType> createCall(MailJetClientConfiguration config, Class<ResourceType> resourceClass, MailJetConnectionProvider provider, DataTransformer transformer);
	
	public static class TestObject{
		private String property;
		private String property2;
	}
}
