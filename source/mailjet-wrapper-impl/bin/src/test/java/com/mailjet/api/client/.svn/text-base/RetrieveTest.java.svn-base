package com.mailjet.api.client;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Iterator;

import org.jmock.Expectations;
import org.junit.Assert;
import org.junit.Test;

import com.mailjet.api.MailJetBaseT;
import com.mailjet.api.client.MailJetApiCall.Retrieve;
import com.mailjet.api.client.MailJetApiCallException.Error;
import com.mailjet.api.client.config.MailJetClientConfiguration;
import com.mailjet.api.client.connect.MailJetConnectionProvider;
import com.mailjet.api.client.connect.MailJetConnectionProvider.MailJetApiCredentials;
import com.mailjet.api.client.connect.MailJetConnectionProvider.MailJetApiResponse;
import com.mailjet.api.client.model.MailJetResourceFilter;
import com.mailjet.api.client.model.MailJetResourceProperty;
import com.mailjet.api.client.model.ResultSet;
import com.mailjet.api.client.transform.DataTransformer;

/**
 * Tests that {@link MailJetApiCall} implementations must pass.
 * 
 * @author MailJet
 * 
 */
public abstract class RetrieveTest extends MailJetBaseT{

	private static final String MAILJET_URL = "http://base";
	
	private static final String DEFAULT_PARAMS = "style=flat&format=json";

	@Test
	public void testNullFilter() throws MailJetApiCallException {
		try {
			createCall().filterBy(null, new Object()).execute();
			Assert.fail();
		} catch (MailJetApiCallException e) {
			Assert.assertEquals(Error.ClientMisuse, e.getError());
		}
	}

	@Test
	public void testNullFilterName() throws MailJetApiCallException {
		try {
			createCall().filterBy(
					new MailJetResourceFilter<Object, String>(null, String.class),
					"value");
			Assert.fail();
		} catch (MailJetApiCallException e) {
			Assert.assertEquals(Error.ClientMisuse, e.getError());
		}
	}
	
	@Test
	public void testReservedFilterName() throws MailJetApiCallException {
		String[] reservedWords = new String[]{"offset", "style", "format", "sort", "sort_order", "limit"};
		for (String word : reservedWords) {
			testForWord(word);
		}
	}
	

	private void testForWord(String name) {
		try {
			createCall().filterBy(
					new MailJetResourceFilter<Object, String>(name, String.class),
					"value");
			Assert.fail();
		} catch (MailJetApiCallException e) {
			Assert.assertEquals(Error.ClientMisuse, e.getError());
		}
	}
	
	/**
	 * Filter could not be set twice.
	 * @throws MailJetApiCallException
	 * @throws URISyntaxException
	 */
	@Test
	public void testURLBuiltDefaultFilterRepeated() throws MailJetApiCallException, URISyntaxException {
		try {
			createCall()
					.filterBy(
					new MailJetResourceFilter<Object, String>("test", String.class),
					"value")
					.filterBy(
					new MailJetResourceFilter<Object, String>("test", String.class),
					"value");
			Assert.fail();
		} catch (MailJetApiCallException e) {
			Assert.assertEquals(Error.ClientMisuse, e.getError());
		}
	}

	@Test
	public void testNullSortAscBy() throws MailJetApiCallException {
		try {
			createCall().sortAscBy(null);
			Assert.fail();
		} catch (MailJetApiCallException e) {
			Assert.assertEquals(Error.ClientMisuse, e.getError());
		}
	}

	@Test
	public void testNullSortDescBy() throws MailJetApiCallException {
		try {
			createCall().sortDescBy(null);
			Assert.fail();
		} catch (MailJetApiCallException e) {
			Assert.assertEquals(Error.ClientMisuse, e.getError());
		}
	}

	@Test
	public void testBadLimitNegative() throws MailJetApiCallException {
		try {
			createCall().limitBy(-2);
			Assert.fail();
		} catch (MailJetApiCallException e) {
			Assert.assertEquals(Error.ClientMisuse, e.getError());
		}
	}

	@Test
	public void testBadLimitZero() throws MailJetApiCallException {
		try {
			createCall().limitBy(0);
			Assert.fail();
		} catch (MailJetApiCallException e) {
			Assert.assertEquals(Error.ClientMisuse, e.getError());
		}
	}

	@Test
	public void testLimitMinus1() throws MailJetApiCallException {
		Assert.assertNotNull(createCall().limitBy(-1));
	}
	
	@Test
	public void testLimitPositive() throws MailJetApiCallException {
		Assert.assertNotNull(createCall().limitBy(1));
	}

	@Test
	public void testBadOffsetNegative() throws MailJetApiCallException {
		try {
			createCall().offsetBy(-2);
			Assert.fail();
		} catch (MailJetApiCallException e) {
			Assert.assertEquals(Error.ClientMisuse, e.getError());
		}
	}

	@Test
	public void testOffsetZero() throws MailJetApiCallException {
		Assert.assertNotNull(createCall().offsetBy(0));
	}

	@Test
	public void testOffsetPositive() throws MailJetApiCallException {
		Assert.assertNotNull(createCall().offsetBy(1));
	}
	
	/**
	 * No filter only default parameters appended.
	 * @throws MailJetApiCallException
	 * @throws URISyntaxException
	 */
	@Test
	public void testURLBuiltDefaultNoFilter() throws MailJetApiCallException, URISyntaxException {
		final MailJetConnectionProvider connProvider = context.mock(MailJetConnectionProvider.class);
		
		context.checking(new Expectations() {{
            oneOf (connProvider).get(new URI(MAILJET_URL + "/TestObject?" + DEFAULT_PARAMS), defaultCredetials());
            will(returnValue(sampleResponse()));
        }});

		ResultSet<TestObject> execute = createCall(
				getConfiguration(), TestObject.class, connProvider, createTestDataTransformer())
				.execute();
		
		
		assertSampleResponse(execute);	
	}

	@Test
	public void testBuildNullFilterValueIgnored() throws MailJetApiCallException, URISyntaxException {
		final MailJetConnectionProvider connProvider = context.mock(MailJetConnectionProvider.class);
		
		context.checking(new Expectations() {{
            oneOf (connProvider).get(new URI(MAILJET_URL + "/TestObject?" + DEFAULT_PARAMS), defaultCredetials());
            will(returnValue(sampleResponse()));
        }});
		
		
		ResultSet<TestObject> execute = createCall(
				getConfiguration(), TestObject.class, connProvider, createTestDataTransformer())
			.filterBy(new MailJetResourceFilter<TestObject, String>("filter1", String.class), null).execute();
		
		
		assertSampleResponse(execute);	
	}
	
	/**
	 * One filter defined
	 * @throws MailJetApiCallException
	 * @throws URISyntaxException
	 */
	@Test
	public void testURLBuiltDefaultOneFilter() throws MailJetApiCallException, URISyntaxException {
		final MailJetConnectionProvider connProvider = context.mock(MailJetConnectionProvider.class);
		
		context.checking(new Expectations() {{
            oneOf (connProvider).get(new URI(MAILJET_URL + "/TestObject?filter1=value1&" + DEFAULT_PARAMS), defaultCredetials());
            will(returnValue(sampleResponse()));
        }});
		
		
		ResultSet<TestObject> execute = createCall(
				getConfiguration(), TestObject.class, connProvider, createTestDataTransformer())
			.filterBy(new MailJetResourceFilter<TestObject, String>("filter1", String.class), "value1").execute();
		
		
		assertSampleResponse(execute);	
	}
	
	/**
	 * More than one filter value is sent to server.
	 * @throws MailJetApiCallException
	 * @throws URISyntaxException
	 */
	@Test
	public void testURLBuiltDefaultMoreThanOneFilter() throws MailJetApiCallException, URISyntaxException {
		final MailJetConnectionProvider connProvider = context.mock(MailJetConnectionProvider.class);
		
		context.checking(new Expectations() {{
            oneOf (connProvider).get(new URI(MAILJET_URL + "/TestObject?filter1=value1&filter2=value2&" + DEFAULT_PARAMS), defaultCredetials());
            will(returnValue(sampleResponse()));
        }});
		
		
		ResultSet<TestObject> execute = createCall(
				getConfiguration(), TestObject.class, connProvider, createTestDataTransformer())
			.filterBy(new MailJetResourceFilter<TestObject, String>("filter1", String.class), "value1")
			.filterBy(new MailJetResourceFilter<TestObject, String>("filter2", String.class), "value2")
			.execute();
		
		
		assertSampleResponse(execute);	
	}
	
	/**
	 * Test with boolean filter defined
	 * @throws MailJetApiCallException
	 * @throws URISyntaxException
	 */
	@Test
	public void testURLBuiltDefaultOneBoolFilter() throws MailJetApiCallException, URISyntaxException {
		final MailJetConnectionProvider connProvider = context.mock(MailJetConnectionProvider.class);
		
		context.checking(new Expectations() {{
            oneOf (connProvider).get(new URI(MAILJET_URL + "/TestObject?filter1=true&" + DEFAULT_PARAMS), defaultCredetials());
            will(returnValue(sampleResponse()));
        }});
		
		
		ResultSet<TestObject> execute = createCall(
				getConfiguration(), TestObject.class, connProvider, createTestDataTransformer())
			.filterBy(new MailJetResourceFilter<TestObject, Boolean>("filter1", Boolean.class), true).execute();
		
		
		assertSampleResponse(execute);	
	}
	
	/**
	 * Offset an Limit set.
	 * @throws MailJetApiCallException
	 * @throws URISyntaxException
	 */
	@Test
	public void testURLBuiltOffsetLimit() throws MailJetApiCallException, URISyntaxException {
		final MailJetConnectionProvider connProvider = context.mock(MailJetConnectionProvider.class);
		
		context.checking(new Expectations() {{
            oneOf (connProvider).get(new URI(MAILJET_URL + "/TestObject?offset=1&limit=2&" + DEFAULT_PARAMS), defaultCredetials());
            will(returnValue(sampleResponse()));
        }});
		
		
		ResultSet<TestObject> execute = createCall(
				getConfiguration(), TestObject.class, connProvider, createTestDataTransformer())
			.offsetBy(1)
			.limitBy(2)
			.execute();
		
		
		assertSampleResponse(execute);	
	}
	
	/**
	 * Default offset and no limit not sent.
	 * @throws MailJetApiCallException
	 * @throws URISyntaxException
	 */
	@Test
	public void testURLBuiltOffsetLimitDefaultsNotSent() throws MailJetApiCallException, URISyntaxException {
		final MailJetConnectionProvider connProvider = context.mock(MailJetConnectionProvider.class);
		
		context.checking(new Expectations() {{
            oneOf (connProvider).get(new URI(MAILJET_URL + "/TestObject?" + DEFAULT_PARAMS), defaultCredetials());
            will(returnValue(sampleResponse()));
        }});
		
		
		ResultSet<TestObject> execute = createCall(
				getConfiguration(), TestObject.class, connProvider, createTestDataTransformer())
			.offsetBy(0)
			.limitBy(-1)
			.execute();
		
		
		assertSampleResponse(execute);	
	}
	
	/**
	 * Sort asc.
	 * @throws MailJetApiCallException
	 * @throws URISyntaxException
	 */
	@Test
	public void testURLBuiltSortAsc() throws MailJetApiCallException, URISyntaxException {
		final MailJetConnectionProvider connProvider = context.mock(MailJetConnectionProvider.class);
		
		context.checking(new Expectations() {{
            oneOf (connProvider).get(new URI(MAILJET_URL + "/TestObject?sort=property1&sort_order=ASC&" + DEFAULT_PARAMS), defaultCredetials());
            will(returnValue(sampleResponse()));
        }});
		
		
		ResultSet<TestObject> execute = createCall(
				getConfiguration(), TestObject.class, connProvider, createTestDataTransformer())
			.sortAscBy(new MailJetResourceProperty<TestObject, String>("property1", String.class))
			.execute();
		
		
		assertSampleResponse(execute);	
	}
	
	
	
	/**
	 * Sort desc.
	 * @throws MailJetApiCallException
	 * @throws URISyntaxException
	 */
	@Test
	public void testURLBuiltSortDesc() throws MailJetApiCallException, URISyntaxException {
		final MailJetConnectionProvider connProvider = context.mock(MailJetConnectionProvider.class);
		
		context.checking(new Expectations() {{
            oneOf (connProvider).get(new URI(MAILJET_URL + "/TestObject?sort=property1&sort_order=DESC&" + DEFAULT_PARAMS), defaultCredetials());
            will(returnValue(sampleResponse()));
        }});
		
		
		ResultSet<TestObject> execute = createCall(
				getConfiguration(), TestObject.class, connProvider, createTestDataTransformer())
			.sortDescBy(new MailJetResourceProperty<TestObject, String>("property1", String.class))
			.execute();
		
		
		assertSampleResponse(execute);	
	}
	
	/**
	 * Test empty response is handled properly.
	 * @throws MailJetApiCallException
	 * @throws URISyntaxException
	 */
	@Test
	public void testURLBuiltBaseUrlEndsWithSlash() throws MailJetApiCallException, URISyntaxException {
		final MailJetConnectionProvider connProvider = context.mock(MailJetConnectionProvider.class);
		
		context.checking(new Expectations() {{
            oneOf (connProvider).get(new URI(MAILJET_URL + "/TestObject?" + DEFAULT_PARAMS), defaultCredetials());
            will(returnValue(sampleEmptyResponse()));
        }});
		
		MailJetClientConfiguration configuration = getConfiguration();
		ResultSet<TestObject> execute = createCall(
				getConfiguration().setBaseUrl(configuration.getBaseUrl() + "/"), TestObject.class, connProvider, createTestDataTransformer())
			.execute();
		
		
		Assert.assertTrue(execute.isEmpty());
	}
	
	/**
	 * Test empty response is handled properly.
	 * @throws MailJetApiCallException
	 * @throws URISyntaxException
	 */
	@Test
	public void testURLBuiltResponseEmpty() throws MailJetApiCallException, URISyntaxException {
		final MailJetConnectionProvider connProvider = context.mock(MailJetConnectionProvider.class);
		
		context.checking(new Expectations() {{
            oneOf (connProvider).get(new URI(MAILJET_URL + "/TestObject?" + DEFAULT_PARAMS), defaultCredetials());
            will(returnValue(sampleEmptyResponse()));
        }});
		
		
		ResultSet<TestObject> execute = createCall(
				getConfiguration(), TestObject.class, connProvider, createTestDataTransformer())
			.execute();
		
		
		Assert.assertTrue(execute.isEmpty());
	}
	
	/**
	 * Test multi object response is handled properly.
	 * @throws MailJetApiCallException
	 * @throws URISyntaxException
	 */
	@Test
	public void testURLBuiltResponseMulti() throws MailJetApiCallException, URISyntaxException {
		final MailJetConnectionProvider connProvider = context.mock(MailJetConnectionProvider.class);
		
		context.checking(new Expectations() {{
            oneOf (connProvider).get(new URI(MAILJET_URL + "/TestObject?" + DEFAULT_PARAMS), defaultCredetials());
            will(returnValue(sampleMultiResponse()));
        }});
		
		
		ResultSet<TestObject> execute = createCall(
				getConfiguration(), TestObject.class, connProvider, createTestDataTransformer())
			.execute();
		
		
		assertSampleMultiResponse(execute);
	}
	
	/**
	 * Test empty response is handled properly.
	 * @throws MailJetApiCallException
	 * @throws URISyntaxException
	 */
	@Test
	public void testURLBuiltResponseError() throws MailJetApiCallException, URISyntaxException {
		final MailJetConnectionProvider connProvider = context.mock(MailJetConnectionProvider.class);
		
		context.checking(new Expectations() {{
            oneOf (connProvider).get(new URI(MAILJET_URL + "/TestObject?" + DEFAULT_PARAMS), defaultCredetials());
            will(returnValue(sampleErrorResponse()));
        }});
		
		
		try {
			createCall(
					getConfiguration(), TestObject.class, connProvider, createTestDataTransformer())
				.execute();
			Assert.fail();
		} catch (MailJetApiCallException e) {
			Assert.assertEquals(Error.NotFound, e.getError());
		}
		
	}
	
	private void assertSampleResponse(ResultSet<TestObject> execute) {
		Assert.assertEquals(1, execute.getCount());	
		Assert.assertEquals("testValue", execute.iterator().next().property);
	}
	
	private void assertSampleMultiResponse(ResultSet<TestObject> execute) {
		Assert.assertEquals(3, execute.getCount());	
		Iterator<TestObject> iterator = execute.iterator();
		Assert.assertEquals("testValue", iterator.next().property);
		Assert.assertEquals("testValue2", iterator.next().property);
		Assert.assertEquals("testValue3", iterator.next().property);
	}
	
	private MailJetApiResponse sampleResponse() {
		return new MailJetConnectionProvider.MailJetApiResponse("{Count:1,Data:[{property:'testValue'}]}", 200);
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

	public abstract Retrieve<Object> createCall();
	
	public abstract <ResourceType> Retrieve<ResourceType> createCall(MailJetClientConfiguration config, Class<ResourceType> resourceClass, MailJetConnectionProvider provider, DataTransformer transformer);
	
	public static class TestObject{
		private String property;
	}
}
