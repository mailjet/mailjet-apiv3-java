package com.mailjet.client;

import org.json.JSONObject;

import com.mailjet.client.errors.MailjetRateLimitException;
import com.mailjet.client.errors.MailjetServerException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;
import com.turbomanage.httpclient.HttpResponse;

/**
 *
 * @author y.vanov
 *
 */
public final class MailjetResponseUtil {

	private static final int TOO_MANY_REQUEST_STATUS = 429;
	private static final int INTERNAL_SERVER_ERROR_STATUS = 500;
	private static final int BAD_REQUEST_ERROR_STATUS = 400;

	private static final String STATUS_PROPERTY = "status";
	private static final String SOCKET_TIMEOUT_EXCEPTION = "Socket Timeout";
	private static final String TOO_MANY_REQUESTS_EXCEPTION = "Too Many Requests";
	private static final String INTERNAL_SERVER_ERROR_GENERAL_EXCEPTION = "Internal Server Error";

	private MailjetResponseUtil() {
	}

	public static void validateMailjetResponse(HttpResponse response)
			throws MailjetSocketTimeoutException, MailjetRateLimitException, MailjetServerException {
		if (response == null) {
			throw new MailjetSocketTimeoutException(SOCKET_TIMEOUT_EXCEPTION);
		} else if (response.getStatus() == TOO_MANY_REQUEST_STATUS) {
			throw new MailjetRateLimitException(TOO_MANY_REQUESTS_EXCEPTION);
		} else if (response.getStatus() >= INTERNAL_SERVER_ERROR_STATUS) {
			if (!isValidJSON(response.getBodyAsString())) {
				throw new MailjetServerException(INTERNAL_SERVER_ERROR_GENERAL_EXCEPTION);
			}
		} else if (response.getStatus() >= BAD_REQUEST_ERROR_STATUS) { // Errors between 400 and 500, exclude 429
			if (!isValidJSON(response.getBodyAsString())) {
				throw new MailjetServerException(response.getBodyAsString());
			}
		}
	}

	public static String parseResponseBodyToValidString(HttpResponse response) {
		return (response.getBodyAsString() != null && !response.getBodyAsString().trim().equals("")
				? response.getBodyAsString()
				: new JSONObject().put(STATUS_PROPERTY, response.getStatus()).toString());
	}

	public static boolean isValidJSON(String json) {
		return json != null && json.trim().startsWith("{");
	}

}
