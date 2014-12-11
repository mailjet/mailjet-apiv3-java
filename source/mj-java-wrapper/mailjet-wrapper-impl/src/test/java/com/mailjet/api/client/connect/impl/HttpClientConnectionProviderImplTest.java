package com.mailjet.api.client.connect.impl;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.Scanner;

import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.StatusLine;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.ContextAwareAuthScheme;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;
import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;
import org.jmock.Expectations;
import org.junit.Assert;
import org.junit.Test;

import com.mailjet.api.MailJetBaseT;
import com.mailjet.api.client.MailJetApiCallException;
import com.mailjet.api.client.MailJetApiCallException.Error;
import com.mailjet.api.client.connect.MailJetConnectionProvider.MailJetApiCredentials;
import com.mailjet.api.client.connect.MailJetConnectionProvider.MailJetApiResponse;
@SuppressWarnings("javadoc")
public class HttpClientConnectionProviderImplTest extends MailJetBaseT{
	private static final int CODE_200 = 200;
	private static final int CODE_204 = 204;
	private static final int CODE_404 = 404;
	private static final String BASE_URI = "http://base";
	private static final String RESPONSE_CONTENTS = "{response}";
	private static final String REQUEST_CONTENTS = "{request}";

	@Test
	public final void testGet() throws Exception{
		MailJetApiCredentials apiCredentials = new MailJetApiCredentials("apiKey", "secretKey");
		final URI uri = new URI(BASE_URI);
		final HttpClient httpClient = context.mock(HttpClient.class);
		// expectations
		final HttpResponse response = setupResponse(RESPONSE_CONTENTS, CODE_200);
        context.checking(new Expectations() {{
	            oneOf (httpClient)
	            	.execute(with(new HttpActionMatcher(HttpGet.class, uri)));will(returnValue(response));
        }});
		HttpClientConnectionProviderImpl providerImpl = new HttpClientConnectionProviderImpl(httpClient);
		MailJetApiResponse mailjetApiResponse = providerImpl.get(uri, apiCredentials);
		Assert.assertEquals(RESPONSE_CONTENTS, mailjetApiResponse.getContents());
		Assert.assertEquals(CODE_200, mailjetApiResponse.getStatus());
	}
	
	@Test
	public final void testGet204() throws Exception{
		MailJetApiCredentials apiCredentials = new MailJetApiCredentials("apiKey", "secretKey");
		final URI uri = new URI(BASE_URI);
		final HttpClient httpClient = context.mock(HttpClient.class);
		// expectations
		final HttpResponse response = setupEmptyResponse(RESPONSE_CONTENTS, CODE_204);
        context.checking(new Expectations() {{
	            oneOf (httpClient)
	            	.execute(with(new HttpActionMatcher(HttpGet.class, uri)));will(returnValue(response));
        }});
		HttpClientConnectionProviderImpl providerImpl = new HttpClientConnectionProviderImpl(httpClient);
		MailJetApiResponse mailjetApiResponse = providerImpl.get(uri, apiCredentials);
		Assert.assertEquals("{}", mailjetApiResponse.getContents());
		Assert.assertEquals(CODE_204, mailjetApiResponse.getStatus());
	}
	
	@Test
	public final void testGet_404() throws Exception{
		MailJetApiCredentials apiCredentials = new MailJetApiCredentials("apiKey", "secretKey");
		final URI uri = new URI(BASE_URI);
		final HttpClient httpClient = context.mock(HttpClient.class);
		// expectations
		final HttpResponse response = setupResponse(RESPONSE_CONTENTS, CODE_404);
        context.checking(new Expectations() {{
	            oneOf (httpClient)
	            	.execute(with(new HttpActionMatcher(HttpGet.class, uri)));will(returnValue(response));
        }});
		HttpClientConnectionProviderImpl providerImpl = new HttpClientConnectionProviderImpl(httpClient);
		MailJetApiResponse mailjetApiResponse = providerImpl.get(uri, apiCredentials);
		Assert.assertEquals(RESPONSE_CONTENTS, mailjetApiResponse.getContents());
		Assert.assertEquals(CODE_404, mailjetApiResponse.getStatus());
	}
	
	@Test
	public final void testGetThrowing() throws Exception{
		MailJetApiCredentials apiCredentials = new MailJetApiCredentials("apiKey", "secretKey");
		final URI uri = new URI(BASE_URI);
		final HttpClient httpClient = context.mock(HttpClient.class);
		// expectations
        context.checking(new Expectations() {{
	            oneOf (httpClient)
	            	.execute(with(new HttpActionMatcher(HttpGet.class, uri)));will(throwException(new IOException()));
        }});
		HttpClientConnectionProviderImpl providerImpl = new HttpClientConnectionProviderImpl(httpClient);
		try {
			providerImpl.get(uri, apiCredentials);
			Assert.fail();
		} catch (MailJetApiCallException e) {
			Assert.assertEquals(Error.ServerUnavailable, e.getError());
		}
	}
	
	@Test
	public final void testGetAuthProblem() throws Exception{
		final MailJetApiCredentials apiCredentials = new MailJetApiCredentials("apiKey", "secretKey");
		final URI uri = new URI(BASE_URI);
		final HttpClient httpClient = context.mock(HttpClient.class);
		final ContextAwareAuthScheme authScheme = context.mock(ContextAwareAuthScheme.class);
		// expectations
        context.checking(new Expectations() {{
	            oneOf (authScheme)
	            	.authenticate(
	            			with(equal(new UsernamePasswordCredentials(apiCredentials.getApiKey(), apiCredentials.getSecretKey()))), 
	            			with(new HttpActionMatcher(HttpGet.class, uri)), 
	            			with(equal((HttpContext)null)));will(throwException(new AuthenticationException()));
        }});
		HttpClientConnectionProviderImpl providerImpl = new HttpClientConnectionProviderImpl(httpClient);
		try {
			providerImpl.setAuthScheme(authScheme);
			providerImpl.get(uri, apiCredentials);
			Assert.fail();
		} catch (MailJetApiCallException e) {
			Assert.assertEquals(Error.ClientMisconfiguration, e.getError());
		}
	}
	
	@Test
	public final void testDelete() throws Exception{
		MailJetApiCredentials apiCredentials = new MailJetApiCredentials("apiKey", "secretKey");
		final URI uri = new URI(BASE_URI);
		final HttpClient httpClient = context.mock(HttpClient.class);
		// expectations
		final HttpResponse response = setupResponse(RESPONSE_CONTENTS, 200);
        context.checking(new Expectations() {{
	            oneOf (httpClient)
	            	.execute(with(new HttpActionMatcher(HttpDelete.class, uri)));will(returnValue(response));
        }});
		HttpClientConnectionProviderImpl providerImpl = new HttpClientConnectionProviderImpl(httpClient);
		MailJetApiResponse mailjetApiResponse = providerImpl.delete(uri, apiCredentials);
		Assert.assertEquals(RESPONSE_CONTENTS, mailjetApiResponse.getContents());
		Assert.assertEquals(CODE_200, mailjetApiResponse.getStatus());
	}
	
	@Test
	public final void testDeleteThrowing() throws Exception{
		MailJetApiCredentials apiCredentials = new MailJetApiCredentials("apiKey", "secretKey");
		final URI uri = new URI(BASE_URI);
		final HttpClient httpClient = context.mock(HttpClient.class);
		// expectations
        context.checking(new Expectations() {{
	            oneOf (httpClient)
	            	.execute(with(new HttpActionMatcher(HttpDelete.class, uri)));will(throwException(new IOException()));
        }});
		HttpClientConnectionProviderImpl providerImpl = new HttpClientConnectionProviderImpl(httpClient);
		try {
			providerImpl.delete(uri, apiCredentials);
			Assert.fail();
		} catch (MailJetApiCallException e) {
			Assert.assertEquals(Error.ServerUnavailable, e.getError());
		}
	}

	@Test
	public final void testPut() throws Exception{
		MailJetApiCredentials apiCredentials = new MailJetApiCredentials("apiKey", "secretKey");
		final URI uri = new URI(BASE_URI);
		final HttpClient httpClient = context.mock(HttpClient.class);
		// expectations
		final HttpResponse response = setupResponse(RESPONSE_CONTENTS, 200);
        context.checking(new Expectations() {{
	            oneOf (httpClient)
	            	.execute(with(new HttpActionMatcher(HttpPut.class, uri, REQUEST_CONTENTS)));will(returnValue(response));
        }});
		HttpClientConnectionProviderImpl providerImpl = new HttpClientConnectionProviderImpl(httpClient);
		MailJetApiResponse mailjetApiResponse = providerImpl.put(uri, REQUEST_CONTENTS, apiCredentials);
		Assert.assertEquals(RESPONSE_CONTENTS, mailjetApiResponse.getContents());
		Assert.assertEquals(CODE_200, mailjetApiResponse.getStatus());
	}
	
	@Test
	public final void testPutThrowing() throws Exception{
		MailJetApiCredentials apiCredentials = new MailJetApiCredentials("apiKey", "secretKey");
		final URI uri = new URI(BASE_URI);
		final HttpClient httpClient = context.mock(HttpClient.class);
		// expectations
        context.checking(new Expectations() {{
	            oneOf (httpClient)
	            	.execute(with(new HttpActionMatcher(HttpPut.class, uri)));will(throwException(new IOException()));
        }});
		HttpClientConnectionProviderImpl providerImpl = new HttpClientConnectionProviderImpl(httpClient);
		try {
			providerImpl.put(uri, REQUEST_CONTENTS, apiCredentials);
			Assert.fail();
		} catch (MailJetApiCallException e) {
			Assert.assertEquals(Error.ServerUnavailable, e.getError());
		}
	}
	
	@Test
	public final void testPost() throws Exception{
		MailJetApiCredentials apiCredentials = new MailJetApiCredentials("apiKey", "secretKey");
		final URI uri = new URI(BASE_URI);
		final HttpClient httpClient = context.mock(HttpClient.class);
		// expectations
		final HttpResponse response = setupResponse(RESPONSE_CONTENTS, 200);
        context.checking(new Expectations() {{
	            oneOf (httpClient)
	            	.execute(with(new HttpActionMatcher(HttpPost.class, uri, REQUEST_CONTENTS)));will(returnValue(response));
        }});
		HttpClientConnectionProviderImpl providerImpl = new HttpClientConnectionProviderImpl(httpClient);
		MailJetApiResponse mailjetApiResponse = providerImpl.post(uri, REQUEST_CONTENTS, apiCredentials);
		Assert.assertEquals(RESPONSE_CONTENTS, mailjetApiResponse.getContents());
		Assert.assertEquals(CODE_200, mailjetApiResponse.getStatus());
	}
	
	@Test
	public final void testPostThrowing() throws Exception{
		MailJetApiCredentials apiCredentials = new MailJetApiCredentials("apiKey", "secretKey");
		final URI uri = new URI(BASE_URI);
		final HttpClient httpClient = context.mock(HttpClient.class);
		// expectations
        context.checking(new Expectations() {{
	            oneOf (httpClient)
	            	.execute(with(new HttpActionMatcher(HttpPost.class, uri)));will(throwException(new IOException()));
        }});
		HttpClientConnectionProviderImpl providerImpl = new HttpClientConnectionProviderImpl(httpClient);
		try {
			providerImpl.post(uri, REQUEST_CONTENTS, apiCredentials);
			Assert.fail();
		} catch (MailJetApiCallException e) {
			Assert.assertEquals(Error.ServerUnavailable, e.getError());
		}
	}
	
	private HttpResponse setupResponse(final String responsePayload, final int statusCode) throws IOException {
		final HttpResponse response = context.mock(HttpResponse.class);
		final Header header = context.mock(Header.class);
		final HeaderElement contentTypeElement = context.mock(HeaderElement.class);
		final HttpEntity entity = context.mock(HttpEntity.class);
		final StatusLine status = context.mock(StatusLine.class);
		final InputStream responseStream = new ByteArrayInputStream(responsePayload.getBytes("UTF-8"));
		context.checking(new Expectations() {{
			allowing (status)
            	.getStatusCode();will(returnValue(statusCode));
            oneOf (entity)
            	.getContent();will(returnValue(responseStream));
            allowing (entity)
            	.getContentLength();will(returnValue(123L));
           	allowing (contentTypeElement)
            	.getName();will(returnValue("application/json"));
            allowing (contentTypeElement)
            	.getParameters();will(returnValue(new NameValuePair[0]));
            allowing (header)
            	.getElements();will(returnValue(new HeaderElement[]{contentTypeElement}));
            ignoring (entity);
            allowing (response)
            	.getStatusLine();will(returnValue(status));
            allowing (response)
            	.getEntity();will(returnValue(entity));	
		}});
		return response;
	}
	
	private HttpResponse setupEmptyResponse(final String responsePayload, final int statusCode) throws IOException {
		final HttpResponse response = context.mock(HttpResponse.class);
		final HttpEntity entity = context.mock(HttpEntity.class);
		final StatusLine status = context.mock(StatusLine.class);
		context.checking(new Expectations() {{
			allowing (status)
            	.getStatusCode();will(returnValue(statusCode));
            allowing (response)
            	.getStatusLine();will(returnValue(status));
            allowing (response)
            	.getEntity();will(returnValue(entity));	
            ignoring (entity);	
		}});
		return response;
	}

	static class HttpActionMatcher extends TypeSafeMatcher<HttpUriRequest> {
		private final Class<?> realClass;
		private final URI uri;
		private String requestContents;
		
		public HttpActionMatcher(final Class<?> realClass, final URI uri,
				final String requestContents) {
			this.realClass = realClass;
			this.uri = uri;
			this.requestContents = requestContents;
		}

		public HttpActionMatcher(final Class<?> realClass, final URI uri) {
			this(realClass, uri, null);
		}

		
		public void describeTo(final Description description) {
			
		}

		@Override
		protected boolean matchesSafely(final HttpUriRequest request) {
			return realClass.isAssignableFrom(request.getClass()) && request.getURI().equals(uri)
					&& (requestContents == null || getContent((HttpEntityEnclosingRequestBase)request).equals(requestContents)); 
		}

		private String getContent(final HttpEntityEnclosingRequestBase request) {
			try {
				return new Scanner(request.getEntity().getContent() ,"UTF-8").useDelimiter("\\A").next();
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}
	    
	}
}
