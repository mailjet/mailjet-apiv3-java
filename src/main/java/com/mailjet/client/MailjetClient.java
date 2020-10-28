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

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;

import com.mailjet.client.errors.MailjetClientCommunicationException;
import org.json.JSONObject;

import com.mailjet.client.errors.MailjetException;
import com.turbomanage.httpclient.BasicHttpClient;
import com.turbomanage.httpclient.ConsoleRequestLogger;
import com.turbomanage.httpclient.HttpResponse;
import com.turbomanage.httpclient.ParameterMap;
import com.turbomanage.httpclient.RequestHandler;
import com.turbomanage.httpclient.RequestLogger;

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

    private String _apiKey;
    private String _apiSecret;
    private String _token;
    private static final String userAgent = "mailjet-apiv3-java/v4.5.0";
    private int _debug = 0;

    /**
     * Create a new Instance of the MailjetClient class and register the APIKEY/APISECRET
     * @param apiKey
     * @param apiSecret
     */
    public MailjetClient(String apiKey, String apiSecret) {
		initLogger(null);
        initBasicAuth(apiKey, apiSecret);
		initOptions(null);
    }

    /**
     * Create a new Instance of the MailjetClient class and register the APIKEY/APISECRET. Use custom request handler.
     * @param apiKey
     * @param apiSecret
     * @param handler
     */
    public MailjetClient(String apiKey, String apiSecret, RequestHandler handler) {
		initLogger(handler);
        initBasicAuth(apiKey, apiSecret);
		initOptions(null);
    }

    /**
     * Create a new Instance of the MailjetClient class and register the APIKEY/APISECRET. Use client options.
     * @param apiKey
     * @param apiSecret
     * @param options
     */
    public MailjetClient(String apiKey, String apiSecret, ClientOptions options) {
		initLogger(null);
        initBasicAuth(apiKey, apiSecret);
		initOptions(options);
    }

    /**
     * Create a new Instance of the MailjetClient class and register the APIKEY/APISECRET. Use custom request handler. Use client options.
     * @param apiKey
     * @param apiSecret
     * @param handler
     * @param options
     */
    public MailjetClient(String apiKey, String apiSecret, RequestHandler handler, ClientOptions options) {
		initLogger(handler);
        initBasicAuth(apiKey, apiSecret);
		initOptions(options);
    }

    /**
     * Create a new Instance of the MailjetClient class and register the Token
     * @param token
     */
    public MailjetClient(String token) {
		initLogger(null);
        initTokenAuth(token);
		initOptions(null);
    }

    /**
     * Create a new Instance of the MailjetClient class and register the Token. Use custom request handler.
     * @param token
     * @param handler
     */
    public MailjetClient(String token, RequestHandler handler) {
		initLogger(handler);
        initTokenAuth(token);
		initOptions(null);
    }

    /**
     * Create a new Instance of the MailjetClient class and register the Token. Use client options.
     * @param token
     * @param options
     */
    public MailjetClient(String token, ClientOptions options) {
		initLogger(null);
        initTokenAuth(token);
		initOptions(options);
    }

    /**
     * Create a new Instance of the MailjetClient class and register the Token. Use custom request handler. Use client options.
     * @param token
     * @param handler
     * @param options
     */
    public MailjetClient(String token, RequestHandler handler, ClientOptions options) {
		initLogger(handler);
        initTokenAuth(token);
		initOptions(options);
    }

    private void initBasicAuth(String apiKey, String apiSecret) {
        _apiKey = apiKey;
        _apiSecret = apiSecret;

        String authEncBytes = Base64.encode((_apiKey + ":" + _apiSecret).getBytes());

        _client
              .addHeader("Accept", "application/json")
              .addHeader("user-agent", this.userAgent)
              .addHeader("Authorization", "Basic " + authEncBytes);
        
    }

    private void initTokenAuth(String token) {
        _token = token;

        _client
              .addHeader("Accept", "application/json")
              .addHeader("user-agent", this.userAgent)
              .addHeader("Authorization", "Bearer " + token);
        
    }

	private void initLogger(RequestHandler handler) {
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
	}

	private void initOptions(ClientOptions options) {
		if (options != null) {
          setOptions(options);
        }
        else {
          setOptions(new ClientOptions());
        }
	}

    /**
     * Set the request logger
     * @param logger
     */
	public void setRequestLogger(RequestLogger logger) {
	    _client.setRequestLogger(logger);
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
     public MailjetResponse get(MailjetRequest request) throws MailjetException {
        try {
            String url = createUrl() + request.buildUrl();
            // TODO move API version from the client to the request itself to be able configuring it dynamically
            request.setApiVersion(this._options.getVersion());

            if (this._debug == NOCALL_DEBUG) {
                return new MailjetResponse(new JSONObject().put("url", url + request.queryString()));
            }

            ParameterMap p = new ParameterMap();
            p.putAll(request._filters);
            HttpResponse response = _client.get(url, p);

            MailjetResponseUtil.validateMailjetResponse(request, response);

            String json = MailjetResponseUtil.isValidJSON(response.getBodyAsString()) ?
                    response.getBodyAsString() : new JSONObject().put("status", response.getStatus()).toString();

            return new MailjetResponse(response.getStatus(), new JSONObject(json));

        } catch (UnsupportedEncodingException ex) {
            throw new MailjetClientCommunicationException("Internal Exception: Unsupported Encoding", ex);
        } catch (IOException | NullPointerException ex) {
            throw new MailjetClientCommunicationException("Connection Exception", ex);
        }
    }

    /**
     * perform a Mailjet POST request.
     * @param request
     * @return
     * @throws com.mailjet.client.errors.MailjetException
     */
    public MailjetResponse post(MailjetRequest request) throws MailjetException {
        try {
            String url = createUrl() + request.buildUrl();
            // TODO move API version from the client to the request itself to be able configuring it dynamically
            request.setApiVersion(this._options.getVersion());

            if (_debug == NOCALL_DEBUG) {
                return new MailjetResponse(new JSONObject()
                        .put("url", url)
                        .put("payload", request.getBody()));
            }

            HttpResponse response = _client.post(url, request.getContentType(), request.getBody().getBytes("UTF8"));

            MailjetResponseUtil.validateMailjetResponse(request, response);

            String json = MailjetResponseUtil.isValidJSON(response.getBodyAsString()) ?
                    response.getBodyAsString() : new JSONObject().put("status", response.getStatus()).toString();

            return new MailjetResponse(response.getStatus(), new JSONObject(json));

        } catch (UnsupportedEncodingException ex) {
            throw new MailjetClientCommunicationException("Internal Exception: Unsupported Encoding", ex);
        } catch (IOException | NullPointerException ex) {
            throw new MailjetClientCommunicationException("Connection Exception", ex);
        }
    }

    public MailjetResponse put(MailjetRequest request) throws MailjetException {
        try {
            String url = createUrl() + request.buildUrl();
            // TODO move API version from the client to the request itself to be able configuring it dynamically
            request.setApiVersion(this._options.getVersion());

            if (_debug == NOCALL_DEBUG) {
                return new MailjetResponse(new JSONObject()
                        .put("url", url)
                        .put("payload", request.getBody()));
            }

            HttpResponse response = _client.put(url, request.getContentType(), request.getBody().getBytes("UTF8"));

            MailjetResponseUtil.validateMailjetResponse(request, response);

            String json = MailjetResponseUtil.isValidJSON(response.getBodyAsString()) ?
                    response.getBodyAsString() : new JSONObject().put("status", response.getStatus()).toString();

            return new MailjetResponse(response.getStatus(), new JSONObject(json));

        } catch (UnsupportedEncodingException ex) {
            throw new MailjetClientCommunicationException("Internal Exception: Unsupported Encoding", ex);
        } catch (IOException | NullPointerException ex) {
            throw new MailjetClientCommunicationException("Connection Exception", ex);
        }
    }

    public MailjetResponse delete(MailjetRequest request) throws MailjetException {
        try {
            String url = createUrl() + request.buildUrl();
            // TODO move API version from the client to the request itself to be able configuring it dynamically
            request.setApiVersion(this._options.getVersion());

            if (_debug == NOCALL_DEBUG) {
               return new MailjetResponse(new JSONObject()
                       .put("url", url));
            }

            ParameterMap p = new ParameterMap();
            p.putAll(request._filters);
            HttpResponse response = _client.delete(url, p);

            MailjetResponseUtil.validateMailjetResponse(request, response);
            
            String json = MailjetResponseUtil.isValidJSON(response.getBodyAsString()) ?
                    response.getBodyAsString() : new JSONObject().put("status", response.getStatus()).toString();
            
            return new MailjetResponse(response.getStatus(), new JSONObject(json));

        } catch (UnsupportedEncodingException ex) {
            throw new MailjetClientCommunicationException("Internal Exception: Unsupported Encoding", ex);
        } catch (IOException | NullPointerException ex) {
            throw new MailjetClientCommunicationException("Connection Exception", ex);
        }
    }

    private void setOptions(ClientOptions options) {
        this._options = options;
        this._client.setReadTimeout(options.getTimeout());
    }

    private String createUrl() {
        return this._options.getBaseUrl() + '/' + _options.getVersion();
    }
 }
