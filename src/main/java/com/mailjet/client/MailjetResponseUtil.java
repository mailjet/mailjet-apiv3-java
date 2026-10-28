package com.mailjet.client;

import lombok.experimental.UtilityClass;

import com.mailjet.client.enums.ApiVersion;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import com.mailjet.client.errors.*;

import com.mailjet.client.resource.Emailv31;

/**
 *
 * @author y.vanov
 *
 */
@UtilityClass
public class MailjetResponseUtil {

    /** Retained for compatibility; use {@link HttpConstants#CREATED}. */
    public static final int CREATED_STATUS = HttpConstants.CREATED;

	private static final String UNAUTHORIZED_MESSAGE = "Unauthorized. Please,verify your access key and access secret key or token for the given account";
	private static final String TOO_MANY_REQUESTS_EXCEPTION = "Too Many Requests";
	private static final String INTERNAL_SERVER_ERROR_GENERAL_EXCEPTION = "Internal Server Error: ";

	public static void validateMailjetResponse(MailjetRequest request, int responseCode, String responseBody) throws MailjetException {
        validateMailjetResponse(request, responseCode, responseBody, isValidJSON(responseBody));
    }

    static void validateMailjetResponse(MailjetRequest request, int responseCode, String responseBody, boolean validJson) throws MailjetException {
		if (responseCode == HttpConstants.TOO_MANY_REQUESTS) {
			throw new MailjetRateLimitException(TOO_MANY_REQUESTS_EXCEPTION);
		} else if (responseCode == HttpConstants.UNAUTHORIZED) {
			throw new MailjetUnauthorizedException(UNAUTHORIZED_MESSAGE);
		} else if (responseCode >= HttpConstants.INTERNAL_SERVER_ERROR) {
				throw new MailjetServerException(responseBody == null ? INTERNAL_SERVER_ERROR_GENERAL_EXCEPTION : responseBody);
		} else if (responseCode >= HttpConstants.BAD_REQUEST) { // Errors between 400 and 500, exclude 429 and 401
			if (!isResponseIndicatesPartialSuccess(request, responseCode, validJson)) { // do not throw exception if the response still can be parsed and verified
				throw new MailjetClientRequestException(responseBody, responseCode);
			}
		}
	}

	public static boolean isValidJSON(String json) {
		return parseJsonObject(json) != null;
	}

    static JSONObject parseJsonObject(String json) {
        if (json == null) {
            return null;
        }
        try {
            JSONTokener tokener = new JSONTokener(json);
            Object value = tokener.nextValue();
            return value instanceof JSONObject && tokener.nextClean() == 0 ? (JSONObject) value : null;
        } catch (JSONException e) {
            return null;
        }
    }

	/**
	* Specific API methods support partial success
	* like, if we send multiple emails in bulk
	* and the one is failed and other one sent successfully
	* server returns 400
	* */
	private static boolean isResponseIndicatesPartialSuccess(MailjetRequest request, int responseCode, boolean validJson) {
		return responseCode == HttpConstants.BAD_REQUEST &&
				validJson &&
				ApiVersion.V3_1.equals(request.getApiVersion()) &&
				Emailv31.resource.getResource().equals(request.getResource());
	}
}
