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
        responseObject = new JSONObject(rawResponse);
        this.rawResponse = rawResponse;
        this.status = status;
    }

    /**
     * @return Raw response string sent by Mailjet server
     */
    public String getRawResponseContent() { return rawResponse; }

    public JSONArray getData() {
        if (responseObject.has("Data")) {
            return responseObject.getJSONArray("Data");
        } else if (responseObject.has("Sent")) {
            return responseObject.getJSONArray("Sent");
        } else if (responseObject.has("Messages")) {
            return responseObject.getJSONArray("Messages");
        } else {
            return (new JSONArray()).put(responseObject);
        }
    }
    
    public int getTotal() {
        if (responseObject.has("Total")) {
            return responseObject.getInt("Total");
        } else {
            return 0;
        }
    }
    
    public String getString(String key) throws MailjetException {
        try {
            return responseObject.getString(key);
        } catch (NullPointerException e) {
           throw new MailjetException("No entry found for key: " + key);
        }
    }
    
    public int getInt(String key) throws MailjetException {
        try {
            return responseObject.getInt(key);
        } catch (NullPointerException e) {
            throw new MailjetException("No entry found for key: " + key);
        }
    }
    
    public JSONArray getJSONArray(String key) throws MailjetException {
        try {
            return responseObject.getJSONArray(key);
        } catch (NullPointerException e) { 
            throw new MailjetException("No entry found for key: " + key);
        }
    }
    
    public int getCount() {
        if (responseObject.has("Count")) {
            return responseObject.getInt("Count");
        } else {
            return 0;
        }
    }
}
