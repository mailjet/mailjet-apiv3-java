package com.mailjet.api.model.v3.sendmessage;

import java.util.HashMap;

public class SendMessageRecipient
{
	/**
	 * 
	 */
	private String Email;
	
	/**
	 * 
	 */
	private String Name;
	
	/**
	 * 
	 */
	private HashMap<String, String> Vars;
	
	/**
	 * 
	 */
	public SendMessageRecipient()
	{
	}

	/**
	 * @param email
	 * @param Name
	 */
	public SendMessageRecipient(String email, String name)
	{
		this.Email = email;
		this.Name = name;
	}

	/**
	 * @param email
	 * @param Name
	 * @param Vars
	 */
	public SendMessageRecipient(String email, String name, HashMap<String, String> vars)
	{
		this.Email = email;
		this.Name = name;
		this.Vars = vars;
	}

	/**
	 * @return the email
	 */
	public String getEmail()
	{
		return Email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email)
	{
		this.Email = email;
	}

	/**
	 * @return the Name
	 */
	public String getName()
	{
		return Name;
	}

	/**
	 * @param Name the Name to set
	 */
	public void setName(String name)
	{
		this.Name = name;
	}

	/**
	 * @return the Vars
	 */
	public HashMap<String, String> getVars()
	{
		return Vars;
	}

	/**
	 * @param Vars the Vars to set
	 */
	public void setVars(HashMap<String, String> vars)
	{
		this.Vars = vars;
	}
	
	
}