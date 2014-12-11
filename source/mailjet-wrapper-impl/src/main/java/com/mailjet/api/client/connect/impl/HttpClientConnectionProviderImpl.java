package com.mailjet.api.client.connect.impl;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URI;
import java.nio.charset.Charset;

import org.apache.http.ConnectionClosedException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.ContextAwareAuthScheme;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.config.RequestConfig.Builder;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.auth.BasicScheme;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;

import com.mailjet.api.client.MailJetApiCallException;
import com.mailjet.api.client.MailJetApiCallException.Error;
import com.mailjet.api.client.connect.MailJetConnectionProvider;

/**
 * Implementation of the interface using the Apache HTTP Client library.
 * 
 * @author MailJet
 * 
 */
public final class HttpClientConnectionProviderImpl implements
		MailJetConnectionProvider {

	private static final int NO_CONTENT_STATUS_CODE = 204;

	private static final int DEFAULT_TIMEOUT = 15000;

	private static final String CHARSET = "UTF-8";

	private final HttpClient http;

	private final Builder requestConfig;

	private ContextAwareAuthScheme authScheme;

	/**
	 * Constructor for instantiating connection provider with externally created
	 * and configured {@link HttpClient} instance.
	 * 
	 * @param http
	 *            not null, http client to use
	 */
	public HttpClientConnectionProviderImpl(final HttpClient http) {
		RequestConfig config = buildRequestConfig(DEFAULT_TIMEOUT,
				DEFAULT_TIMEOUT);
		this.http = http;
		this.requestConfig = RequestConfig.copy(config);
		this.authScheme = new BasicScheme();
	}

	/**
	 * Constructor.
	 */
	public HttpClientConnectionProviderImpl() {
		this(HttpClientBuilder
				.create()
				.setDefaultRequestConfig(
						buildRequestConfig(DEFAULT_TIMEOUT, DEFAULT_TIMEOUT))
				.build());
	}

	/**
	 * Builds a request configuration with the specified timeouts.
	 * 
	 * @param connectTimeout
	 *            timeout for establishing the connection
	 * @param readTimeout
	 *            timeout for waiting for the response
	 * @return not null, configuration object with specified values
	 */
	private static RequestConfig buildRequestConfig(final int connectTimeout,
			final int readTimeout) {
		Builder rqConfigBuilder = RequestConfig.custom();
		rqConfigBuilder.setConnectTimeout(connectTimeout);
		rqConfigBuilder.setSocketTimeout(readTimeout);
		RequestConfig config = rqConfigBuilder.build();
		return config;
	}

	public MailJetApiResponse get(final URI url,
			final MailJetApiCredentials credentials)
			throws MailJetApiCallException {
		HttpGet get = new HttpGet(url);
		configure(get, credentials);
		try {
			return execute(get);
		} catch (IOException e) {
			throw new MailJetApiCallException(Error.ServerUnavailable, e);
		}
	}

	public MailJetApiResponse post(final URI url, final String payload,
			final MailJetApiCredentials credentials)
			throws MailJetApiCallException {
		HttpPost post = new HttpPost(url);
		configure(post, credentials);
		try {
			post.setEntity(new StringEntity(payload, CHARSET));
			return execute(post);
		} catch (IOException e) {
			throw new MailJetApiCallException(Error.ServerUnavailable, e);
		}
	}

	public MailJetApiResponse put(final URI url, final String payload,
			final MailJetApiCredentials credentials)
			throws MailJetApiCallException {
		HttpPut put = new HttpPut(url);
		configure(put, credentials);
		try {
			put.setEntity(new StringEntity(payload, CHARSET));
			return execute(put);
		} catch (IOException e) {
			throw new MailJetApiCallException(Error.ServerUnavailable, e);
		}
	}

	public MailJetApiResponse delete(final URI url,
			final MailJetApiCredentials credentials)
			throws MailJetApiCallException {
		HttpDelete delete = new HttpDelete(url);
		configure(delete, credentials);
		try {
			return execute(delete);
		} catch (IOException e) {
			throw new MailJetApiCallException(Error.ServerUnavailable, e);
		}
	}

	/**
	 * Executes the request.
	 * 
	 * @param request
	 *            not null
	 * @return not null, a response object containing the response payload an
	 *         the status code
	 * @throws IOException
	 *             if the request could not be completed succesfully
	 */
	private MailJetApiResponse execute(final HttpUriRequest request)
			throws IOException {
		System.out.println("MailJetApiResponse execute called");
		HttpResponse response = http.execute(request);
		System.out.println("Response = " + response.toString());
		StatusLine statusLine = response.getStatusLine();
		int statusCode = statusLine.getStatusCode();
		HttpEntity entity = response.getEntity();

		return new MailJetApiResponse(
				statusCode == NO_CONTENT_STATUS_CODE ? "{}" : getEntityContent(entity).trim(), statusCode);
	}

	private String getEntityContent(HttpEntity entity) throws IOException {
		final InputStream instream = entity.getContent();
		try {
			final ContentType contentType = ContentType.getOrDefault(entity);
			Charset charset = contentType.getCharset();
			if (charset == null) {
				charset = HTTP.DEF_CONTENT_CHARSET;
			}
			final StringBuilder b = new StringBuilder();
			final char[] tmp = new char[1024];
			final Reader reader = new InputStreamReader(instream, charset);
			try {
				int l;
				while ((l = reader.read(tmp)) != -1) {
					b.append(tmp, 0, l);
				}
			} catch (final ConnectionClosedException ignore) {
			}
			return b.toString();
		} finally {
			try {
			 instream.close();
			} catch (final ConnectionClosedException ignore) {
			}
		}
	}

	/**
	 * Applies HTTP Client configuration to the request object and the specified
	 * credentials with the selected authentication scheme.
	 * 
	 * @param req
	 *            not null, the request object
	 * @param credentials
	 *            credentials api credentials
	 * @throws MailJetApiCallException
	 *             if the authentication scheme is not compatible with the
	 *             credentials
	 */
	private void configure(final HttpRequestBase req,
			final MailJetApiCredentials credentials)
			throws MailJetApiCallException {
		req.setConfig(requestConfig.build());
		try {
			req.setHeader(authScheme.authenticate(
					new UsernamePasswordCredentials(credentials.getApiKey(),
							credentials.getSecretKey()), req, null));
		} catch (AuthenticationException e) {
			throw new MailJetApiCallException(Error.ClientMisconfiguration, e);
		}
	}

	/**
	 * Setter to specify alternative the the default basic authentication
	 * scheme.
	 * 
	 * @param authScheme
	 *            not null, the new authentication scheme
	 * @return not null, this object
	 */
	public HttpClientConnectionProviderImpl setAuthScheme(
			final ContextAwareAuthScheme authScheme) {
		this.authScheme = authScheme;
		return this;
	}

}
