package com.mailjet.client;

import com.mailjet.client.errors.*;

import com.mailjet.client.resource.ApiVersion;
import com.mailjet.client.resource.Emailv31;
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
	private static final int UNAUTHORIZED_STATUS = 401;

	private static final String UNEXPECTED_RESPONSE_MESSAGE = "Unexpected response from the server";
	private static final String UNAUTHORIZED_MESSAGE = "Unauthorized. Please,verify your access key or token for the given account";
	private static final String TOO_MANY_REQUESTS_EXCEPTION = "Too Many Requests";
	private static final String INTERNAL_SERVER_ERROR_GENERAL_EXCEPTION = "Internal Server Error: ";

	private MailjetResponseUtil() {
	}

	public static void validateMailjetResponse(MailjetRequest request, HttpResponse response) throws MailjetException {
		if (response == null) {
			throw new MailjetClientCommunicationException(UNEXPECTED_RESPONSE_MESSAGE);
		}

		int responseStatus = response.getStatus();
		String responseBody = response.getBodyAsString();

		if (responseStatus == TOO_MANY_REQUEST_STATUS) {
			throw new MailjetRateLimitException(TOO_MANY_REQUESTS_EXCEPTION);
		} else if (responseStatus == UNAUTHORIZED_STATUS) {
			throw new MailjetUnauthorizedException(UNAUTHORIZED_MESSAGE, responseStatus);
		} else if (responseStatus >= INTERNAL_SERVER_ERROR_STATUS) {
				throw new MailjetServerException(responseBody == null ? INTERNAL_SERVER_ERROR_GENERAL_EXCEPTION : responseBody);
		} else if (responseStatus >= BAD_REQUEST_ERROR_STATUS) { // Errors between 400 and 500, exclude 429 and 401
			if (!isResponseIndicatesPartialSuccess(request, response)) { // do not throw exception if the response still can be parsed and verified
				throw new MailjetClientRequestException(responseBody, responseStatus);
			}
		}
	}

	public static boolean isValidJSON(String json) {
		return json != null && json.trim().startsWith("{") && json.trim().endsWith("}");
	}

	/*
	* Specific API methods support partial success
	* like, if we send multiple emails in bulk
	* and the one is failed and other one sent successfully
	* server returns 400
	* */
	private static boolean isResponseIndicatesPartialSuccess(MailjetRequest request, HttpResponse response) {
		return response.getStatus() == BAD_REQUEST_ERROR_STATUS &&
				isValidJSON(response.getBodyAsString()) &&
				ApiVersion.V3_1.equals(request.getApiVersion()) &&
				Emailv31.resource.getResource().equals(request.getResource());
	}
}
