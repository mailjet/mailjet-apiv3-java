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
public class MailjetResponse extends JSONObject {
    
    public MailjetResponse(int status, JSONObject obj) {
        super(obj.toString());
        this.put("Status", status);
    }

    public MailjetResponse(JSONObject object) {
        super(object.toString());
    }
    
    public int getStatus() {
        return getInt("Status");
    }
    
    public JSONArray getData() {
        if (has("Data")) {
            return getJSONArray("Data");
        } else if (has("Sent")) {
            return getJSONArray("Sent");
        } else {
            return null;
        }
    }
    
    public int getTotal() {
        return getInt("Total");
    }
    
    public int getCount() {
        return getInt("Count");
    }
}
