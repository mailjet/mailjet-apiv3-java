package com.mailjet.client;

import lombok.experimental.UtilityClass;

import java.net.HttpURLConnection;

/** Shared HTTP values used by the client transport and response validation. */
@UtilityClass
public class HttpConstants {
    public static final String APPLICATION_JSON = "application/json";
    public static final String TEXT_PLAIN = "text/plain";
    public static final String AUTHORIZATION = "Authorization";

    public static final int CREATED = HttpURLConnection.HTTP_CREATED;
    public static final int BAD_REQUEST = HttpURLConnection.HTTP_BAD_REQUEST;
    public static final int UNAUTHORIZED = HttpURLConnection.HTTP_UNAUTHORIZED;
    // HttpURLConnection has no constant for HTTP 429.
    public static final int TOO_MANY_REQUESTS = 429;
    public static final int INTERNAL_SERVER_ERROR = HttpURLConnection.HTTP_INTERNAL_ERROR;
}
