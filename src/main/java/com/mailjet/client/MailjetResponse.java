/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mailjet.client;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author Guillaume Badi
 */
public class MailjetResponse {
    
    private JSONObject _rawResponse;
    private int _status;

    public MailjetResponse(int status, JSONObject obj) {
        _rawResponse = obj;
        _status = status;
    }

    public MailjetResponse(JSONObject object) {
        _rawResponse = object;
        _status = 0;
    }
    
    public int getStatus() {
        return _status;
    }
    
    public JSONArray getData() {
        if (_rawResponse.has("Data")) {
            return _rawResponse.getJSONArray("Data");
        } else if (_rawResponse.has("Sent")) {
            return _rawResponse.getJSONArray("Sent");
        } else {
            return new JSONArray();
        }
    }
    
    public int getTotal() {
        if (_rawResponse.has("Total")) {
            return _rawResponse.getInt("Total");
        } else {
            return 0;
        }
    }
    
    public String getString(String key) {
        return _rawResponse.getString(key);
    }
    
    public int getInt(String key) {
        return _rawResponse.getInt(key);
    }
    
    public JSONArray getJSONArray(String key) {
        return _rawResponse.getJSONArray(key);
    }
    
    public int getCount() {
        if (_rawResponse.has("Count")) {
            return _rawResponse.getInt("Count");
        } else {
            return 0;
        }
    }
}
