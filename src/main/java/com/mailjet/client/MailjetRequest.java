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
import java.net.MalformedURLException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/**
 *
 * @author Guillaume Badi - Mailjet
 */
public class MailjetRequest {

    /**
    * REST/DATA/send API. By default, the constructor will initialize it with REST
    * as most of the resources will use it
    */
    private String _path;

    /**
     * Mailjet resource string
     */
    private String _resource;

    /**
     * Mailjet resource action, if any
     */
    private String _action;

    private String _alt;

    /**
     * Resource ID
     */
    private Long _id;

    /**
     * Resource action ID
     */
    private long _actionId;

    private String _data;

    /**
     * Filters HashMap.
     * Every filter should be string values. So Integer will be cast into
     * Strings
     */
    HashMap<String, String> _filters =  new HashMap<>();

    /**
     * The request body is a JSONObject that will be cast into a String before the
     * call
     */
    JSONObject _body = new JSONObject();

    /**
     * Depending on whether the client used the first, second or third constructor,
     * the configuration might differ after.
     * TODO: find a cleaner way to manage that.
     */
    private int _configuration;

    /**
     * Make a Mailjet request with a single resource.
     * @param res
     */
    public MailjetRequest(Resource res) {
        this._path = "/REST";
        _configuration = 1;
        _resource = res.getResource();
        _action = res.getAction();
        _id = null;

        if (_resource.equals("send")) {
            _path = "";
        }
    }

    /**
     * In case of a simple view. Call a single resource with a single ID
     * @param res
     * @param id
     */
    public MailjetRequest(Resource res, long id) {
        this._path = "/REST";
        _resource = res.getResource();
        _action = res.getAction();
        _id = id;

        if (_action.equals("")) {
            _configuration = 2;
        } else {
            _configuration = 3;
        }
    }

    /**
     * In case of a simple view. Call a single resource with a single ID
     * @param res
     * @param id
     */
    public MailjetRequest(Resource res, String id) {
        this._path = "/REST";
        _resource = res.getResource();
        _action = res.getAction();
        _alt = id;

        if (_action.equals("")) {
            _configuration = 2;
        } else {
            _configuration = 3;
        }
    }

    /**
     * Build a Request with an actionID
     * @param res the resource object
     * @param id the resource ID
     * @param actionid the resource action ID
     */
    public MailjetRequest(Resource res, long id, long actionid) {
        this._path = "/REST";
        _resource = res.getResource();
        _action = res.getAction();
        _id = id;
        _actionId = actionid;
        _configuration = 4;
    }

    public MailjetRequest setData(String path) throws IOException {
        _data = new String(Files.readAllBytes(Paths.get(path)), StandardCharsets.UTF_8);
        System.out.println(_data);
        return this;
    }

    /**
     * Pass a String formatted json as the request body
     * @param json
     * @return the request itself
     */
    public MailjetRequest setBody(String json) {
        _body = new JSONObject(json);
        return this;
    }

        /**

     * Pass a JSONObject formatted json as the request body
     * @param json
     * @return the request itself
     */
    public MailjetRequest setBody(JSONObject json) {
        return setBody(json.toString());
    }

    /**
     * Use an HashMap to build the body
     * @param json
     * @return the request itself
     */
    public MailjetRequest setBody(HashMap<String, Object> json) {
        _body = new JSONObject(json);
        return this;
    }

    /**
     * Body getter
     * @return the stringified body
     */
    public String getBody() {
        return _data == null ? _body.toString() : Base64.encode(_data.getBytes());
    }

    /**
     * Body JSON getter
     * @return the body as JSONObject
     */
    public JSONObject getBodyJSON() {
        return _body;
    }

    /**
     * Returns the appropriate Content-Type according to the resource/action
     * @return Content-Type
     */
    public String getContentType() {
        if ("csvdata".equals(_action))
            return "text:csv";
        if ("csverror".equals(_action))
            return "text/plain";
        else
            return "application/json";
    }

    /**
     * Build the call URL with query string parameters
     * @return url
     * @throws MalformedURLException
     * @throws UnsupportedEncodingException
     */
    public String buildUrl() throws MalformedURLException, UnsupportedEncodingException {
        String base = (_resource.getWithoutNamespace() ? "" : _path) + '/' + _resource;
        String id = null;
        String url = null;

        if (_alt != null || _id != null) {
            id = _alt != null ? URLEncoder.encode(_alt, "UTF-8") : _id.toString();
        }

        if (id == null && !_action.equals(""))
            url = base + '/' + _action;
        else if (_action.equals("managemanycontacts") && id != null)
            url = base + '/' + _action + '/' + id;
        else if (_configuration == 1)
            url = base;
        else if (_configuration == 2)
            url = base + '/' + id;
        else if (_configuration == 3)
            url = base + '/' + id + '/' + _action;
        else if (_configuration == 4)
            url = base + '/' + id + '/' + _action + '/' + _actionId;

        return url;
    }

    /**
     * Append a value to the body[key]
     * @param key the key
     * @param value the value to be pushed
     * @return the Mailjet Request itslef
     */
    public MailjetRequest append(String key, Object value) {
        _body.append(key, value);
        return this;
    }

    /**
     * Add a String-String filter to the the _filters hash
     * @param key
     * @param value
     * @return the request itself
     */
    public MailjetRequest filter(String key, String value) {
        _filters.put(key, value);
        return this;
    }

    /**
     * Add a String/int filter to the _filters hash
     * @param key
     * @param value
     * @return the request itself
     */
    public MailjetRequest filter(String key, int value) {
        return filter(key, String.valueOf(value));
    }


    /**
     * Build a query string using the _filters hash
     * @return a query string
     * @throws UnsupportedEncodingException
     */
    public String queryString () throws UnsupportedEncodingException {
        StringBuilder sb = new StringBuilder();

        for (String key : _filters.keySet()) {
            String value = _filters.get(key);
            if(sb.length() > 0){
                sb.append('&');
            }
            if (sb.length() == 0) {
                sb.append('?');
            }
            sb.append(URLEncoder.encode(key, "UTF-8")).append('=').append(value.replace(' ', '+'));
        }

        return sb.toString();
    }

    /**
     * Add a property to the body JSONObject
     * @param key
     * @param value
     * @return the request itself
     */
    public MailjetRequest property(String key, Object value) {
        _body.put(key, value);
        return this;
    }

    @Override
    public String toString() {
        return new JSONObject()
                .put("Resource", _resource)
                .put("ID", _id)
                .put("Action", _action)
                .put("Action ID", _actionId)
                .put("Filters", _filters.toString())
                .put("Body", _body.toString())
                .toString();
    }
}
