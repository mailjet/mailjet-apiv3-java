package com.mailjet.api.client.connect;

import java.net.URI;

import com.mailjet.api.client.MailJetApiCallException;
import com.mailjet.api.client.MailJetApiClient;

/**
 * Interface providing HTTP communication functionalities to the
 * {@link MailJetApiClient} instances. The aim is to provide the ability to switch
 * between implementations of HTTP communication libraries in case it's needed
 * by the library users.
 * 
 * @author MailJet
 * 
 */
public interface MailJetConnectionProvider {

	/**
	 * Executes a HTTP 'GET' request.
	 * 
	 * @param uri
	 *            not null, the URI requested
	 * @param authData
	 *            not null, credentials to be provided to the server
	 * @return not null, payload of the response without any processing
	 * @throws MailJetApiCallException
	 *             thrown if the request cannot be made due to technical reasons
	 */
	MailJetApiResponse get(URI uri, MailJetApiCredentials authData)
			throws MailJetApiCallException;

	/**
	 * Executes a HTTP 'POST' request.
	 * 
	 * @param uri
	 *            not null, the URI requested
	 * @param payload
	 *            not null, the payload of the request
	 * @param authData
	 *            not null, credentials to be provided to the server
	 * @return not null, payload of the response without any processing
	 * @throws MailJetApiCallException
	 *             thrown if the request cannot be made due to technical reasons
	 */
	MailJetApiResponse post(URI uri, String payload,
			MailJetApiCredentials authData) throws MailJetApiCallException;

	/**
	 * Executes a HTTP 'PUT' request.
	 * 
	 * @param uri
	 *            not null, the URI requested
	 * @param payload
	 *            not null, the payload of the request
	 * @param authData
	 *            not null, credentials to be provided to the server
	 * @return not null, payload of the response without any processing
	 * @throws MailJetApiCallException
	 *             thrown if the request cannot be made due to technical reasons
	 */
	MailJetApiResponse put(URI uri, String payload,
			MailJetApiCredentials authData) throws MailJetApiCallException;

	/**
	 * Executes a HTTP 'DELETE' request.
	 * 
	 * @param uri
	 *            not null, the URI requested
	 * @param authData
	 *            not null, credentials to be provided to the server
	 * @return not null, payload of the response without any processing
	 * @throws MailJetApiCallException
	 *             thrown if the request cannot be made due to technical reasons
	 */
	MailJetApiResponse delete(URI uri, MailJetApiCredentials authData)
			throws MailJetApiCallException;

	/**
	 * Class representing a response returned by the MailJet API.
	 * 
	 * @author MailJet
	 * 
	 */
	public final class MailJetApiResponse {
		private final String contents;
		private final int status;

		/**
		 * Constructor.
		 * 
		 * @param contents
		 *            data returned by the MailJet API
		 * @param status
		 *            status of the response
		 */
		public MailJetApiResponse(final String contents, final int status) {
			this.contents = contents;
			this.status = status;
		}

		/**
		 * Gets the status.
		 * 
		 * @return status value
		 */
		public int getStatus() {
			return status;
		}

		/**
		 * Gets the data returned by the MailJet API.
		 * 
		 * @return contents or null
		 */
		public String getContents() {
			return contents;
		}
	}

	/**
	 * Class to represent credentials provided by MailJet to API users.
	 * 
	 * @author MailJet
	 * 
	 */
	public final class MailJetApiCredentials {
		private String apiKey;
		private String secretKey;

		/**
		 * Constructor.
		 * 
		 * @param apiKey
		 *            key to be used
		 * @param secretKey
		 *            secret key to be used
		 */
		public MailJetApiCredentials(final String apiKey, final String secretKey) {
			this.apiKey = apiKey;
			this.secretKey = secretKey;
		}

		/**
		 * Gets the Api key value.
		 * 
		 * @return the value
		 */
		public String getApiKey() {
			return apiKey;
		}

		/**
		 * Gets the Secret key value.
		 * 
		 * @return the value
		 */
		public String getSecretKey() {
			return secretKey;
		}

		@Override
		public boolean equals(final Object other) {
			if (this == other) {
				return true;
			}
			if (!(other instanceof MailJetApiCredentials)) {
				return false;
			}
			final MailJetApiCredentials that = (MailJetApiCredentials) other;
			return equal(this.getApiKey(), that.getApiKey())
					&& equal(this.getSecretKey(), that.getSecretKey());
		}

		/**
		 * Checks if the two values are equal.
		 * 
		 * @param value1
		 *            first
		 * @param value2
		 *            second
		 * @return true if the strings are equal or both null
		 */
		private boolean equal(final String value1, final String value2) {
			return (value1 == null ? value2 == null : value1.equals(value2));
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result
					+ ((apiKey == null) ? 0 : apiKey.hashCode());
			result = prime * result
					+ ((secretKey == null) ? 0 : secretKey.hashCode());
			return result;

		}
	}

}
