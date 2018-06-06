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
	private Boolean _withoutNamespace;

	public Resource(String resource, String action, Boolean withoutNamespace) {
        _resource = resource;
        _action = action;
		_withoutNamespace = withoutNamespace;
	}
    
    public Resource(String resource, String action) {
        _resource = resource;
        _action = action;
		_withoutNamespace = false;
    }
    
    public Resource(String resource) {
        _resource = resource;
        _action = "";
		_withoutNamespace = false;
    }
    
    public String getResource() {
        return _resource;
    }
    
    public String getAction() {
        return _action;
    }

	public Boolean getWithoutNamespace() {
		return _withoutNamespace;
	}
}
