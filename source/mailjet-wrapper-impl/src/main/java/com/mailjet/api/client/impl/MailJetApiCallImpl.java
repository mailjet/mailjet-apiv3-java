package com.mailjet.api.client.impl;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.mailjet.api.client.MailJetApiCallException;
import com.mailjet.api.client.MailJetApiCallException.Error;
import com.mailjet.api.client.MailJetApiService;
import com.mailjet.api.client.config.MailJetClientConfiguration;
import com.mailjet.api.client.connect.MailJetConnectionProvider;
import com.mailjet.api.client.connect.MailJetConnectionProvider.MailJetApiCredentials;
import com.mailjet.api.client.connect.MailJetConnectionProvider.MailJetApiResponse;
import com.mailjet.api.client.model.ResultSet;
import com.mailjet.api.client.transform.DataTransformer;
import com.mailjet.api.client.util.UriUtils;

/**
 * Template for executing a MailJet API call.
 * 
 * @author MailJet
 * 
 * @param <CallResultType>
 *            type of the result being produced by the call
 */
abstract class MailJetApiCallImpl<CallResultType> {
	/**
	 * Param used to specify format:json.
	 */
	protected static final String FORMAT_PARAM_NAME = "format";
	/**
	 * Param used to specify style: full, flat, legacy.
	 */
	protected static final String STYLE_PARAM_NAME = "style";
	/**
	 * Status code for 200.
	 */
	protected static final int SUCCESS_OK = 200;
	private final MailJetClientConfiguration config;
	private final DataTransformer dataMapper;
	private final MailJetConnectionProvider connectionProvider;
	private final MailJetApiService<?> operation;

	/**
	 * Constructor.
	 * 
	 * @param config
	 *            not null, client configuration
	 * @param operation
	 *            not null, requested operation
	 * @param dataMapper
	 *            not null, data mapper to use to map java objects to MailJet
	 *            API data format
	 * @param connectionProvider
	 *            not null, connection provider to MailJet API
	 */
	public MailJetApiCallImpl(final MailJetClientConfiguration config,
			final MailJetConnectionProvider connectionProvider,
			final DataTransformer dataMapper,
			final MailJetApiService<?> operation) {
		this.config = config;
		this.operation = operation;
		this.connectionProvider = connectionProvider;
		this.dataMapper = dataMapper;
	}

	/**
	 * Implementation employing "Template method pattern".
	 * 
	 * @return result of the call
	 * 
	 * @throws MailJetApiCallException
	 *             if request could not be successfully completed
	 */
	public final CallResultType execute() throws MailJetApiCallException {
		MailJetConnectionProvider connectionProvider = getConnectionProvider();
		DataTransformer dataTransformer = getDataMapper();
		URI uri = build();
		MailJetApiResponse response = execute(connectionProvider,
				dataTransformer, uri, getDefaultCredentials());
		if (!isSuccessfull(response.getStatus())) {
			Error error = Error.getByCode(response.getStatus());
			MailJetError details = dataTransformer.fromString(
					response.getContents(), MailJetError.class);
			throw new MailJetApiCallException(
					error,
					details != null ? (details.getErrorMessage() + " - " + details.getErrorInfo())
							: "");
		}
		return getSingleResult(operation, response.getContents());
	}

	/**
	 * Builds the request URI. Handles URISyntaxException by converting it to
	 * MailJetApiCallException.
	 * 
	 * @return not null, uri of the service
	 * @throws MailJetApiCallException
	 *             if an URI could not be produced
	 */
	private URI build() throws MailJetApiCallException {
		try {
			return buildURI();
		} catch (URISyntaxException e) {
			throw new MailJetApiCallException(Error.ClientMisconfiguration, e);
		} catch (UnsupportedEncodingException e) {
			throw new MailJetApiCallException(Error.ClientMisconfiguration, e);
		}
	}

	/**
	 * Method for concrete implementations to provide the URI of the resources
	 * being requested on the MailJet API for the concrete type of call.
	 * 
	 * @return not null, uri of the service
	 * @throws URISyntaxException
	 *             if an URI could not be produced
	 * @throws UnsupportedEncodingException
	 *             if an URI could not be produced
	 * @throws MailJetApiCallException
	 *             if URI could not be built because of wrong call setup
	 */
	protected abstract URI buildURI() throws URISyntaxException,
			UnsupportedEncodingException, MailJetApiCallException;

	/**
	 * Executes a call to the MailJet API.
	 * 
	 * @param connectionProvider
	 *            not null, connection provider to use to perform the request
	 * @param transformer
	 *            not null, data transformer to use to convert Java object to
	 *            MailJet API data format and vice versa
	 * @param uri
	 *            not null, uri to call
	 * @param credentials
	 *            not null, credentials to use
	 * @return not null, response from the MailJet API
	 * @throws MailJetApiCallException
	 *             thrown if the API call was unsuccessful
	 */
	protected abstract MailJetApiResponse execute(
			MailJetConnectionProvider connectionProvider,
			DataTransformer transformer, URI uri,
			MailJetApiCredentials credentials) throws MailJetApiCallException;

	/**
	 * Creates an URI and adds the URI parameters that are sent to MailJet API
	 * by default.
	 * 
	 * @param parameters
	 *            not null, query parameter
	 * @param segments
	 *            additional path segments to the base URL
	 * @return not null, the uri
	 * @throws URISyntaxException
	 *             if URL could not be build
	 * @throws UnsupportedEncodingException
	 *             if part of the URL could not be encoded with UTF-8
	 */
	protected final URI buildRequestURI(final Map<String, Object> parameters,
			final String... segments) throws URISyntaxException,
			UnsupportedEncodingException {
		HashMap<String, Object> params = new LinkedHashMap<String, Object>(
				parameters);
		if (attachDefaultParams()) {
			params.put(STYLE_PARAM_NAME, "flat");
			params.put(FORMAT_PARAM_NAME, "json");
		}
		String base = config.getBaseUrl();
		String uriString = base.endsWith("/") ? base.substring(0,
				base.length() - 1) : base;
		if ((base.substring(base.length() - 1).equals("/")))
		{
			uriString = base.substring(0, base.lastIndexOf("/"));
		}

		if (operation.getName().equals("sendmessage"))
		{
			if (base.contains("/REST"))
			{
				uriString = base.substring(0, base.indexOf("/REST"));
			}
			else if (base.contains("/send"))
			{
				uriString = base.substring(0, base.indexOf("/send"));
			}
			uriString += "/send/message";
		}
		else
		{
			uriString += "/" + operation.getName();
		}

		for (String segment : segments) {
			String encodedPathSegment = UriUtils.encodePathSegment(segment,
					"UTF-8");
			uriString += "/" + encodedPathSegment;
		}
		if (!params.isEmpty()) {
			Set<Entry<String, Object>> tuples = params.entrySet();
			Iterator<Entry<String, Object>> tuplesIterator = tuples.iterator();
			Entry<String, Object> firstTuple = tuplesIterator.next();

			uriString += ("?" + encodeTuple(firstTuple.getKey(),
					firstTuple.getValue()));

			for (Iterator<Entry<String, Object>> iterator = tuplesIterator; iterator
					.hasNext();) {
				Entry<String, Object> tuple = (Entry<String, Object>) iterator
						.next();
				uriString += ("&" + encodeTuple(tuple.getKey(),
						tuple.getValue()));
			}
		}
		return new URI(uriString);
	}

	/**
	 * Get data mapper for the call.
	 * 
	 * @return not null
	 */
	protected DataTransformer getDataMapper() {
		return dataMapper;
	}

	/**
	 * Get connection provider or the call.
	 * 
	 * @return not null
	 */
	protected MailJetConnectionProvider getConnectionProvider() {
		return connectionProvider;
	}

	/**
	 * Encode param/value tuple.
	 * 
	 * @param name
	 *            name of the param
	 * @param value
	 *            value of the param
	 * @return encoded string
	 * @throws UnsupportedEncodingException
	 *             if encoding is not supported
	 */
	private String encodeTuple(final String name, final Object value)
			throws UnsupportedEncodingException {
		String strValue = dataMapper.toString(value);
		return UriUtils.encodeQueryParam(name, "UTF-8")
				+ "="
				+ UriUtils.encodeQueryParam(
						strValue.startsWith("\"") ? strValue.substring(1,
								strValue.length() - 1) : strValue, "UTF-8");
	}

	/**
	 * Converts the MailJet API response result to the corresponding Java
	 * object(s).
	 * 
	 * @param operation
	 *            not null, the operation that was called
	 * @param result
	 *            not null, the response contents
	 * @return response object
	 * @throws MailJetApiCallException
	 *             if the returned data from MailJet API is more than expected
	 */
	@SuppressWarnings("unchecked")
	private CallResultType getSingleResult(
			final MailJetApiService<?> operation, final String result)
			throws MailJetApiCallException {
		DataTransformer dataTransformer = getDataMapper();
		ResultSet<?> results = dataTransformer.fromStringResultSet(result,
				operation.getResourceClass());
		int maximumResponseObjects = maximumResponseObjects();
		assertThat(
				results.getCount() <= maximumResponseObjects,
				String.format(
						"Returned object by MailJet API are more than expected. Maximum expected: %2$s; Returned: %1$s.",
						results.getCount(), maximumResponseObjects),
				Error.ClientInternalError);

		return (CallResultType) (maximumResponseObjects == 1 ? (results
				.isEmpty() ? null : results.iterator().next()) : results);
	}

	/**
	 * Implementations could specify the number of expected object to be
	 * returned by the API.
	 * 
	 * @return 0 to any positive integer
	 */
	protected int maximumResponseObjects() {
		return 1;
	}

	/**
	 * Implementations could specify the if the style and format parameters
	 * should be appended to URL query.
	 * 
	 * @return true if they should, false otherwise
	 */
	protected boolean attachDefaultParams() {
		return true;
	}

	/**
	 * Creates a credentials object with the default credentials provided with
	 * configuration.
	 * 
	 * @return not null, credentials
	 */
	private MailJetApiCredentials getDefaultCredentials() {
		return new MailJetConnectionProvider.MailJetApiCredentials(
				config.getDefaultApiKey(), config.getDefaultSecretKey());
	}

	/**
	 * Verifies that the condition holds. Throws if it doesn't.
	 * 
	 * @param condition
	 *            the condition to verify
	 * @param message
	 *            message of the thrown exception
	 * @param error
	 *            error to be signaled
	 * @throws MailJetApiCallException
	 *             thrown if condition is not true
	 */
	static void assertThat(final boolean condition, final String message,
			final Error error) throws MailJetApiCallException {
		if (!condition) {
			throw new MailJetApiCallException(error, message);
		}
	}

	/**
	 * Implementations should specify what are the successfull status codes.
	 * 
	 * @param code
	 *            code that was returned
	 * @return true if the code is means success, false otherwise
	 */
	protected abstract boolean isSuccessfull(int code);

	/**
	 * Class of the object corresponding to a generic MailJet API error
	 * response.
	 * 
	 * @author MailJet
	 * 
	 */
	static class MailJetError {
		/**
		 * Error info.
		 */
		private String ErrorInfo;
		/**
		 * Error details.
		 */
		private String ErrorMessage;
		/**
		 * Status code.
		 */
		private int StatusCode;

		/**
		 * Default constructor.
		 */
		public MailJetError() {
			// empty
		}

		/**
		 * Gets the error info.
		 * 
		 * @return the info
		 */
		String getErrorInfo() {
			return ErrorInfo;
		}

		/**
		 * Gets the error details.
		 * 
		 * @return the details
		 */
		String getErrorMessage() {
			return ErrorMessage;
		}

		/**
		 * Gets the status code.
		 * 
		 * @return the code
		 */
		int getStatusCode() {
			return StatusCode;
		}

	}
}
