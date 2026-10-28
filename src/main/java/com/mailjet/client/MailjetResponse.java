/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mailjet.client;

import com.mailjet.client.errors.MailjetException;
import org.json.JSONArray;
import org.json.JSONObject;

import lombok.Getter;

/**
 *
 * @author Guillaume Badi
 */
public class MailjetResponse {

    private static final String MISSING_ENTRY_MESSAGE = "No entry found for key: ";
    
    private final JSONObject responseObject;
    private final String rawResponse;
    /**
     * -- GETTER --
     *
     * @return HTTP status code returned by Mailjet server
     */
    @Getter
    private final int status;

    public MailjetResponse(int status, String rawResponse) {
        this(status, rawResponse, new JSONObject(rawResponse));
    }

    MailjetResponse(int status, String rawResponse, JSONObject responseObject) {
        this.responseObject = responseObject;
        this.rawResponse = rawResponse;
        this.status = status;
    }

    /**
     * @return Raw response string sent by Mailjet server
     */
    public String getRawResponseContent() { return rawResponse; }

    public JSONArray getData() {
        if (responseObject.has(ResponseFields.DATA)) {
            return responseObject.getJSONArray(ResponseFields.DATA);
        } else if (responseObject.has(ResponseFields.SENT)) {
            return responseObject.getJSONArray(ResponseFields.SENT);
        } else if (responseObject.has(ResponseFields.MESSAGES)) {
            return responseObject.getJSONArray(ResponseFields.MESSAGES);
        } else {
            return (new JSONArray()).put(responseObject);
        }
    }
    
    public int getTotal() {
        if (responseObject.has(ResponseFields.TOTAL)) {
            return responseObject.getInt(ResponseFields.TOTAL);
        } else {
            return 0;
        }
    }
    
    public String getString(String key) throws MailjetException {
        try {
            return responseObject.getString(key);
        } catch (NullPointerException e) {
           throw new MailjetException(MISSING_ENTRY_MESSAGE + key);
        }
    }
    
    public int getInt(String key) throws MailjetException {
        try {
            return responseObject.getInt(key);
        } catch (NullPointerException e) {
            throw new MailjetException(MISSING_ENTRY_MESSAGE + key);
        }
    }
    
    public JSONArray getJSONArray(String key) throws MailjetException {
        try {
            return responseObject.getJSONArray(key);
        } catch (NullPointerException e) { 
            throw new MailjetException(MISSING_ENTRY_MESSAGE + key);
        }
    }
    
    public int getCount() {
        if (responseObject.has(ResponseFields.COUNT)) {
            return responseObject.getInt(ResponseFields.COUNT);
        } else {
            return 0;
        }
    }
}
