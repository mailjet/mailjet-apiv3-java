package com.mailjet.client;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guillaume
 */
public class Resource {
    
    private String _resource;
    private String _action;
    
    public Resource(String resource, String action) {
        _resource = resource;
        _action = action;
    }
    
    public Resource(String resource) {
        _resource = resource;
        _action = "";
    }
    
    public String getResource() {
        return _resource;
    }
    
    public String getAction() {
        return _action;
    }
}
