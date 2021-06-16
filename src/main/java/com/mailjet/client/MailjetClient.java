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
import java.util.concurrent.CompletableFuture;

import com.mailjet.client.errors.MailjetClientCommunicationException;
import com.mailjet.client.errors.MailjetUnauthorizedException;
import okhttp3.*;
import org.json.JSONObject;

import com.mailjet.client.errors.MailjetException;

/**
 *
 * @author Guillaume Badi - Mailjet
 */
public class MailjetClient {

    private ClientOptions _options;
    private OkHttpClient _client;

    private static final String userAgent = "mailjet-apiv3-java/v5.1.1";

    /**
     * Deprecated - please, use MailjetClient(ClientOptions clientOptions) ctor instead
     * Create a new Instance of the MailjetClient class with given APIKEY/APISECRET
     * @param apiKey api key
     * @param apiSecret api secret key
     */
    @Deprecated()
    public MailjetClient(String apiKey, String apiSecret) {
        this(ClientOptions
                .builder()
                .apiKey(apiKey)
                .apiSecretKey(apiSecret)
                .build());
    }

    /**
     * Deprecated - please, use MailjetClient(ClientOptions clientOptions) ctor instead
     * Create a new Instance of the MailjetClient class with given bearer token
     * @param token bearer token to authenticate SMS API calls
     */
    @Deprecated()
    public MailjetClient(String token) {
        this(ClientOptions
                .builder()
                .bearerAccessToken(token)
                .build());
    }

    /**
     * Create a new Instance of the MailjetClient class with given options
     * @param clientOptions object that contains options for the given client instance
     */
    public MailjetClient(ClientOptions clientOptions) {
        _options = clientOptions;
        _client = clientOptions.getOkHttpClient() == null ?
                MailjetClient.createDefaultOkHttpClient() :
                clientOptions.getOkHttpClient();
    }

    /**
     * performs GET request.
     * @param request request to be sent to Mailjet server
     * @return MailjetResponse with parameters of the response
     * @throws com.mailjet.client.errors.MailjetException in case of unsuccessfull response status code
     */
     public MailjetResponse get(MailjetRequest request) throws MailjetException {

         try (final Response okHttpResponse = getGetCall(request).execute()) {
             return parseResponse(request, okHttpResponse);
        } catch (IOException ex) {
            throw new MailjetClientCommunicationException("Connection Exception", ex);
        }
    }

    /**
     * async version of {@link #get(MailjetRequest)} method
     * performs GET request.
     * @param request request to be sent to Mailjet server
     * @return CompletableFuture with MailjetResponse response, or exception thrown during the call/response parsing
     * @throws com.mailjet.client.errors.MailjetException in case of unsuccessfull call
     */
    public CompletableFuture<MailjetResponse> getAsync(MailjetRequest request) throws MailjetException {
        final CompletableFuture<MailjetResponse> resultFuture = new CompletableFuture<>();

        getGetCall(request).enqueue(getAsyncCallback(request, resultFuture));

        return resultFuture;
    }

    private Call getGetCall(MailjetRequest request) throws MailjetException {
        final Request okHttpRequest = getPreconfiguredRequestBuilder(request)
                .get()
                .build();

        return _client.newCall(okHttpRequest);
    }

    /**
     * performs POST request.
     * @param request request to be sent to Mailjet server
     * @return MailjetResponse with parameters of the response
     * @throws com.mailjet.client.errors.MailjetException in case of unsuccessfull response status code
     */
    public MailjetResponse post(MailjetRequest request) throws MailjetException {

        try (final Response okHttpResponse = getPostCall(request).execute()) {
            return parseResponse(request, okHttpResponse);
        } catch (IOException ex) {
            throw new MailjetClientCommunicationException("Connection Exception", ex);
        }
    }

    /**
     * async version of {@link #post(MailjetRequest)} method
     * performs POST request.
     * @param request request to be sent to Mailjet server
     * @return CompletableFuture with MailjetResponse response, or exception thrown during the call/response parsing
     * @throws com.mailjet.client.errors.MailjetException in case of unsuccessfull call
     */
    public CompletableFuture<MailjetResponse> postAsync(MailjetRequest request) throws MailjetException {
        final CompletableFuture<MailjetResponse> resultFuture = new CompletableFuture<>();

        getPostCall(request).enqueue(getAsyncCallback(request, resultFuture));

        return resultFuture;
    }

    private Call getPostCall(MailjetRequest request) throws MailjetException {
        final byte[] bodyContent;
        try {
            bodyContent = request.getBody().getBytes("UTF8");
        } catch (UnsupportedEncodingException e) {
            throw new MailjetClientCommunicationException("Connection Exception", e);
        }

        final RequestBody requestBody = RequestBody.create(
                MediaType.parse(request.getContentType()), bodyContent);

        final Request okHttpRequest = getPreconfiguredRequestBuilder(request)
                .post(requestBody)
                .build();

        return _client.newCall(okHttpRequest);
    }

    /**
     * performs PUT request.
     * @param request request to be sent to Mailjet server
     * @return MailjetResponse with parameters of the response
     * @throws com.mailjet.client.errors.MailjetException in case of unsuccess response status code
     */
    public MailjetResponse put(MailjetRequest request) throws MailjetException {

        try (final Response okHttpResponse = getPutCall(request).execute()) {
            return parseResponse(request, okHttpResponse);
        } catch (IOException ex) {
            throw new MailjetClientCommunicationException("Connection Exception", ex);
        }
    }

    /**
     * async version of {@link #put(MailjetRequest)} method
     * performs PUT request.
     * @param request request to be sent to Mailjet server
     * @return CompletableFuture with MailjetResponse response, or exception thrown during the call/response parsing
     * @throws com.mailjet.client.errors.MailjetException in case of unsuccessfull call
     */
    public CompletableFuture<MailjetResponse> putAsync(MailjetRequest request) throws MailjetException {
        final CompletableFuture<MailjetResponse> resultFuture = new CompletableFuture<>();

        getPutCall(request).enqueue(getAsyncCallback(request, resultFuture));

        return resultFuture;
    }

    private Call getPutCall(MailjetRequest request) throws MailjetException {
        final byte[] bodyContent;
        try {
            bodyContent = request.getBody().getBytes("UTF8");
        } catch (UnsupportedEncodingException e) {
            throw new MailjetClientCommunicationException("Connection Exception", e);
        }

        final RequestBody requestBody = RequestBody.create(
                MediaType.parse(request.getContentType()), bodyContent);

        final Request okHttpRequest = getPreconfiguredRequestBuilder(request)
                .put(requestBody)
                .build();

        return _client.newCall(okHttpRequest);
    }

    /**
     * performs DELETE request.
     * @param request request to be sent to Mailjet server
     * @return MailjetResponse with parameters of the response
     * @throws com.mailjet.client.errors.MailjetException in case of unsuccess response status code
     */
    public MailjetResponse delete(MailjetRequest request) throws MailjetException {

        try (final Response okHttpResponse = getDeleteCall(request).execute()) {
            return parseResponse(request, okHttpResponse);
        } catch (IOException ex) {
            throw new MailjetClientCommunicationException("Connection Exception", ex);
        }
    }

    /**
     * async version of {@link #delete(MailjetRequest)} method
     * performs DELETE request.
     * @param request request to be sent to Mailjet server
     * @return CompletableFuture with MailjetResponse with response
     * @throws com.mailjet.client.errors.MailjetException in case of unsuccessfull call
     */
    public CompletableFuture<MailjetResponse> deleteAsync(MailjetRequest request) throws MailjetException {

        final CompletableFuture<MailjetResponse> resultFuture = new CompletableFuture<>();

        getDeleteCall(request).enqueue(getAsyncCallback(request, resultFuture));

        return resultFuture;
    }

    private Call getDeleteCall(MailjetRequest request) throws MailjetException {
        final Request okHttpRequest = getPreconfiguredRequestBuilder(request)
                .delete()
                .build();

        return _client.newCall(okHttpRequest);
    }

    private Callback getAsyncCallback(MailjetRequest request, CompletableFuture<MailjetResponse> completableFuture){
        return new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                completableFuture.completeExceptionally(new MailjetClientCommunicationException("Connection Exception", e));
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                try {
                    completableFuture.complete(parseResponse(request, response));
                } catch (MailjetException e) {
                    completableFuture.completeExceptionally(e);
                }
            }
        };
    }

    private MailjetResponse parseResponse(MailjetRequest request, Response okHttpResponse) throws IOException, MailjetException {

        final int responseStatusCode = okHttpResponse.code();
        final String responseBody = okHttpResponse.body().string();

        MailjetResponseUtil.validateMailjetResponse(request, responseStatusCode, responseBody);

        final String json = MailjetResponseUtil.isValidJSON(responseBody) ?
                responseBody : new JSONObject().put("status", responseStatusCode).toString();

        return new MailjetResponse(responseStatusCode, json);
    }

    private static OkHttpClient createDefaultOkHttpClient(){
        return new OkHttpClient
                .Builder()
                .build();
    }

    private Request.Builder getPreconfiguredRequestBuilder(MailjetRequest request) throws MailjetException {

        final String url;
        try {
            url = request.buildUrl(this._options.getBaseUrl());
        } catch (UnsupportedEncodingException e) {
            throw new MailjetClientCommunicationException("Connection Exception", e);
        }

        final Request.Builder builder = new Request
                .Builder()
                .addHeader("Accept", "application/json")
                .addHeader("User-Agent", this.userAgent)
                .url(url);

        switch (request.getAuthenticationType()){
            case Basic:
                if (_options.getApiKey() == null || _options.getApiSecretKey() == null)
                    throw new MailjetUnauthorizedException("To do a request to MailJet api, api key and api secret should be set");

                final String authEncBytes = Base64.encode((_options.getApiKey() + ":" + _options.getApiSecretKey()).getBytes());
                builder.addHeader("Authorization", "Basic " + authEncBytes);
                break;

            case Bearer:
                if (_options.getBearerAccessToken() == null)
                    throw new MailjetUnauthorizedException("To do a request to MailJet api, api access token should be set");

                builder.addHeader("Authorization", "Bearer " + _options.getBearerAccessToken());
                break;
        }

        return builder;
    }
 }
