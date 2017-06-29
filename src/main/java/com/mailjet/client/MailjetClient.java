/*
 * Copyright (C) 2015 Mailjet Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.mailjet.client;

import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;
import com.turbomanage.httpclient.BasicHttpClient;
import com.turbomanage.httpclient.BasicRequestHandler;
import com.turbomanage.httpclient.ConsoleRequestLogger;
import com.turbomanage.httpclient.HttpResponse;
import com.turbomanage.httpclient.ParameterMap;
import com.turbomanage.httpclient.RequestLogger;
import com.turbomanage.httpclient.RequestHandler;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import org.json.JSONObject;
import com.mailjet.client.ClientOptions;

/**
 *
 * @author Guillaume Badi - Mailjet
 */
public class MailjetClient {

    public static final int NO_DEBUG = 0;
    public static final int VERBOSE_DEBUG = 1;
    public static final int NOCALL_DEBUG = 2;

    private ClientOptions _options;
    private BasicHttpClient _client;
    private BasicRequestHandler _handler;

    private String _apiKey;
    private String _apiSecret;
    private int _debug = 0;

    /**
     * Create a new Instance of the MailjetClient class and register the APIKEY/APISECRET
     * @param apiKey
     * @param apiSecret
     * @param handler
     * @param options
     */
    public MailjetClient(String apiKey, String apiSecret) {
        init(apiKey, apiSecret, null, null);
    }

    public MailjetClient(String apiKey, String apiSecret, RequestHandler handler) {
        init(apiKey, apiSecret, handler, null);
    }

    public MailjetClient(String apiKey, String apiSecret, ClientOptions options) {
        init(apiKey, apiSecret, null, options);
    }

    public MailjetClient(String apiKey, String apiSecret, RequestHandler handler, ClientOptions options) {
        init(apiKey, apiSecret, handler, options);
    }

    private void init(String apiKey, String apiSecret, RequestHandler handler, ClientOptions options) {
        _apiKey = apiKey;
        _apiSecret = apiSecret;

        if (handler == null) {
            /**
            * Provide an Empty logger to the client.
            * The user can enable it with .setDebug()
            */
            RequestLogger logger = new RequestLogger() {

                @Override
                public boolean isLoggingEnabled() {
                    return false;
                }

                @Override
                public void log(String string) {}

                @Override
                public void logRequest(HttpURLConnection hurlc, Object o) throws IOException {}

                @Override
                public void logResponse(HttpResponse hr) {}
            };
            _client = new BasicHttpClient();
            _client.setRequestLogger(logger);
        } else {
            _client = new BasicHttpClient("", handler);
        }

        String authEncBytes = Base64.encode((_apiKey + ":" + _apiSecret).getBytes());

        _client
              .addHeader("Accept", "application/json")
              .addHeader("user-agent", "mailjet-apiv3-java/v4.1.0")
              .addHeader("Authorization", "Basic " + authEncBytes);
        if (options != null) {
          setOptions(options);
        }
        else {
          setOptions(new ClientOptions());
        }
    }

    /**
     * Set the debug level
     * @param debug:
     *  VERBOSE_DEBUG: prints every URL/payload.
     *  NOCALL_DEBUG: returns the URL + payload in a JSONObject.
     *  NO_DEBUG: usual call.
     */
    public void setDebug(int debug) {
        _debug = debug;

        if (_debug == VERBOSE_DEBUG) {
            _client.setRequestLogger(new ConsoleRequestLogger());
        }
    }

    /**
     * Perform a get Request on a Mailjet endpoint
     * @param request
     * @return MailjetResponse
     * @throws MailjetException
     */
     public MailjetResponse get(MailjetRequest request) throws MailjetException, MailjetSocketTimeoutException {
        try {
            String url = createUrl() + request.buildUrl();

            if (this._debug == NOCALL_DEBUG) {
                return new MailjetResponse(new JSONObject().put("url", url + request.queryString()));
            }

            ParameterMap p = new ParameterMap();
            p.putAll(request._filters);
            HttpResponse response = _client.get(url, p);

            if (response == null) {
                throw new MailjetSocketTimeoutException("Socket Timeout");
            }

            String json = (response.getBodyAsString() != null && !(response.getBodyAsString().equals("")) ?
                    response.getBodyAsString() : new JSONObject().put("status", response.getStatus()).toString());

            return new MailjetResponse(
                    response.getStatus(),
                    new JSONObject(json)
            );
        } catch (MalformedURLException ex) {
            throw new MailjetException("Internal Exception: Malformed URL");
        } catch (UnsupportedEncodingException ex) {
            throw new MailjetException("Internal Exception: Unsupported Encoding");
        } catch (NullPointerException e) {
            throw new MailjetException("Connection Exception");
        }
    }

    /**
     * perform a Mailjet POST request.
     * @param request
     * @return
     * @throws com.mailjet.client.errors.MailjetException
     */
    public MailjetResponse post(MailjetRequest request) throws MailjetException, MailjetSocketTimeoutException {
        try {
            String url = createUrl() + request.buildUrl();

            if (_debug == NOCALL_DEBUG) {
                return new MailjetResponse(new JSONObject()
                        .put("url", url)
                        .put("payload", request.getBody()));
            }

            HttpResponse response;
            String json;

            response = _client.post(url, request.getContentType(), request.getBody().getBytes("UTF8"));

            if (response == null) {
                throw new MailjetSocketTimeoutException("Socket Timeout");
            }

            json = (response.getBodyAsString() != null ?
                    response.getBodyAsString() : new JSONObject().put("status", response.getStatus()).toString());
            return new MailjetResponse(response.getStatus(), new JSONObject(json));
        } catch (MalformedURLException ex) {
            throw new MailjetException("Internal Exception: Malformed Url");
        } catch (UnsupportedEncodingException ex) {
            throw new MailjetException("Internal Exception: Unsupported Encoding");
        } catch (NullPointerException e) {
            throw new MailjetException("Connection Exception");
        }
    }

    public MailjetResponse put(MailjetRequest request) throws MailjetException, MailjetSocketTimeoutException {
        try {
            String url = createUrl() + request.buildUrl();
            HttpResponse response;

            if (_debug == NOCALL_DEBUG) {
                return new MailjetResponse(new JSONObject()
                        .put("url", url)
                        .put("payload", request.getBody()));
            }

            response = _client.put(url, request.getContentType(), request.getBody().getBytes("UTF8"));

            if (response == null) {
                throw new MailjetSocketTimeoutException("Socket Timeout");
            }

            return new MailjetResponse(response.getStatus(), new JSONObject(response.getBodyAsString()));
        } catch (MalformedURLException ex) {
            throw new MailjetException("Internal Exception: Malformed Url");
        } catch (UnsupportedEncodingException ex) {
            throw new MailjetException("Internal Exception: Unsupported Encoding");
        } catch (NullPointerException e) {
            throw new MailjetException("Connection Exception");
        }
    }

    public MailjetResponse delete(MailjetRequest request) throws MailjetException, MailjetSocketTimeoutException {
        try {
            String url = createUrl() + request.buildUrl();
            HttpResponse response;
            String json;

            if (_debug == NOCALL_DEBUG) {
               return new MailjetResponse(new JSONObject()
                       .put("url", url));
            }

            ParameterMap p = new ParameterMap();
            p.putAll(request._filters);
            response = _client.delete(url, p);

            if (response == null) {
                throw new MailjetSocketTimeoutException("Socket Timeout");
            }

            json = (response.getBodyAsString() != null && !response.getBodyAsString().trim().equals("") ?
                    response.getBodyAsString() : new JSONObject().put("status", response.getStatus()).toString());
            return new MailjetResponse(response.getStatus(), new JSONObject(json));
        } catch (MalformedURLException ex) {
            throw new MailjetException("Internal Exception: Malformed Url");
        } catch (UnsupportedEncodingException ex) {
            throw new MailjetException("Internal Exception: Unsupported Encoding");
        } catch (NullPointerException e) {
            throw new MailjetException("Connection Exception");
        }
    }

    private void setOptions(ClientOptions options) {
        this._options = options;
    }

    private String createUrl() {
        return this._options.getBaseUrl() + '/' + _options.getVersion();
    }
 }
