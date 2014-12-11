package com.mailjet.api.client;

/**
 * Exception used by the MailJet API Wrapper library to signal errors returned
 * by the server, raised during the request preparation or data transmission.
 * The exception contains an instance of {@link Error} enumeration providing
 * additional information of the nature of the error.
 * 
 * @author MailJet
 * 
 */
public final class MailJetApiCallException extends Exception {
	private Error error;

	/**
	 * Constructor.
	 * 
	 * @param error
	 *            not null, type of the error that cause the exception
	 * 
	 * @param message
	 *            not null, message describing the error
	 */
	public MailJetApiCallException(final Error error, final String message) {
		super(message);
		this.error = error;
	}

	/**
	 * @param error
	 *            not null, type of the error that cause the exception
	 * @param cause
	 *            not null,
	 */
	public MailJetApiCallException(final Error error, final Throwable cause) {
		super(cause);
		this.error = error;
	}

	@Override
	public String getMessage() {
		return String.format("%1$s Details: %2$s", error, super.getMessage());
	}

	/**
	 * Gets the error that caused the exception.
	 * 
	 * @return error
	 */
	public Error getError() {
		return error;
	}

	private static final long serialVersionUID = -4636817804101796385L;

	/**
	 * Enumeration defining the possible reasons that could fail a MailJet API
	 * request and cause an exception of type {@link MailJetApiCallException}.
	 * 
	 * @author MailJet
	 * 
	 */
	public static enum Error {

		/**
		 * Enumeration value for HTTP response 304 Not Modified.
		 */
		ContentNotModified(304, "Nothing was modified."), /**
		 * Enumeration value
		 * for HTTP response 404 Not Found.
		 */
		NotFound(404, "The method your are trying to reach don't exists."),
		/**
		 * Enumeration value for HTTP response 500 Internal Server Error.
		 */
		ServerError(500, "Status returned when an unknow error occurs."),
		/**
		 * Enumeration value for HTTP response 405 Method Not Allowed.
		 */
		MethodNotAllowed(405,
				"You made a POST request instead of GET, or the reverse."),
		/**
		 * Enumeration value for HTTP response 401 Unauthorized.
		 */
		Unauthorized(401,
				"You have specified an incorrect ApiKey or username/password couple."),
		/**
		 * Enumeration value for HTTP response 400 Bad Request.
		 */
		BadRequest(400,
				"One or more arguments are missing or maybe mispelling."),
		/**
		 * Enumeration value for HTTP response with unsuccessful status code but
		 * not found in this enumeration.
		 */
		Unknown(-1, "Unexpected error. Check the cause in the stack trace."),
		/**
		 * Enumeration value for errors caused by unreachable server or
		 * interrupted communication, e.g. wrong MailJet API URL specified,
		 * network breakdown, etc.
		 */
		ServerUnavailable(-2,
				"Technical error in comunication with MailJet API."),
		/**
		 * Enumeration value for errors caused by incorrect configuration
		 * MailJet API Client configuration, e.g. MailJet API URL has bad format
		 */
		ClientMisconfiguration(-3,
				"The supplied MailJet API Client configuration is incorrect."),
		/**
		 * Enumeration value for errors caused by incorrect usage of the MailJet
		 * API Client e.g. trying to update object on the API without specifying
		 * the id of the object
		 */
		ClientMisuse(-4, "The MailJet API Client is incorrectly used."),
		
		/**
		 * Enumeration value for errors caused by internal error in the MailJet
		 * API Client.
		 */
		ClientInternalError(-5, "The MailJet API Client is incorrectly used.");

		private int code;
		private String description;

		/**
		 * Constructor for enum constants.
		 * 
		 * @param code
		 *            code of the constant
		 * @param description
		 *            details message
		 */
		private Error(final int code, final String description) {
			this.code = code;
			this.description = description;
		}

		@Override
		public String toString() {
			return String.format("Error '%1$s' - %2$s", code, description);
		}

		/**
		 * Lookups an error by it's code.
		 * 
		 * @param code
		 *            the value of the code
		 * @return the code representing the error or {@link Error#Unknown} if
		 *         the code is not associated with any value from the
		 *         enumeration
		 */
		public static Error getByCode(final int code) {
			for (Error error : Error.values()) {
				if (error.code == code) {
					return error;
				}
			}
			return Unknown;
		}
	}

}
