package com.mailjet.api.model.v3.sendmessage;

import java.util.ArrayList;
import java.util.HashMap;

import com.mailjet.api.client.model.MailJetKeyProperty;
import com.mailjet.api.client.model.MailJetResourceProperty;

/**
 * @author Mailjet_GP
 *
 * @param <DataType>
 */
public final class SendMessageProperty<DataType >
	extends MailJetResourceProperty<SendMessage, DataType>
{
	public final static SendMessageProperty<String> FROMEMAIL = new SendMessageProperty<String>("FromEmail", String.class);
	
	public final static SendMessageProperty<String> FROMNAME = new SendMessageProperty<String>("FromName", String.class);
	
	public final static SendMessageProperty<String> SENDER = new SendMessageProperty<String>("Sender", String.class);
	
	public final static SendMessageProperty<ArrayList<SendMessageRecipient>> RECIPIENTS = new SendMessageProperty<ArrayList<SendMessageRecipient>>("Recipients", ArrayList.class);
	
	public final static SendMessageProperty<String> SUBJECT = new SendMessageProperty<String>("Subject", String.class);
	
	public final static SendMessageProperty<String> TEXTPART = new SendMessageProperty<String>("Text-part", String.class);
	
	public final static SendMessageProperty<String> HTMLPART = new SendMessageProperty<String>("Html-part", String.class);
	
	public final static SendMessageProperty<Integer> MJPRIO = new SendMessageProperty<Integer>("Mj-prio", Integer.class);
	
	public final static SendMessageProperty<String> MJCAMPAIGN = new SendMessageProperty<String>("Mj-campaign", String.class);
	
	public final static SendMessageProperty<Integer> MJDEDUPLICATECAMPAIGN = new SendMessageProperty<Integer>("Mj-deduplicateCampaign", Integer.class);
	
	public final static SendMessageProperty<Integer> MJTRACKOPEN = new SendMessageProperty<Integer>("Mj-trackopen", Integer.class);
	
	public final static SendMessageProperty<Integer> MJTRACKCLICK = new SendMessageProperty<Integer>("Mj-trackclick", Integer.class);
	
	public final static SendMessageProperty<String> MJCUSTOMID = new SendMessageProperty<String>("Mj-CustomID", String.class);
	
	public final static SendMessageProperty<String> MJEVENTPAYLOAD = new SendMessageProperty<String>("Mj-EventPayload", String.class);
	
	public final static SendMessageProperty<HashMap<String, String>> HEADER = new SendMessageProperty<HashMap<String, String>>("Headers", HashMap.class);
	
	public final static SendMessageProperty<HashMap<String, String>> VARS = new SendMessageProperty<HashMap<String, String>>("Vars", HashMap.class);
	
	public final static SendMessageProperty<ArrayList<HashMap<String, String>>> ATTACHMENTS = new SendMessageProperty<ArrayList<HashMap<String, String>>>("Attachments", ArrayList.class);
	
	public final static SendMessageProperty<ArrayList<HashMap<String, String>>> INLINEATTACHMENTS = new SendMessageProperty<ArrayList<HashMap<String, String>>>("Inline_attachments", ArrayList.class);
	
	private SendMessageProperty(String name, Class<?> type)
	{
		super(name, type);
	}

	public static SendMessageProperty<Object> ref(String name)
	{
		return new SendMessageProperty<Object>(name, Object.class);
	}
	
	public final static class Key<KeyDataType >
    	extends MailJetKeyProperty<SendMessage, KeyDataType>
	{
	     private Key(String name, Class<?> type)
	     {
	         super(name, type);
	     }
	}
}
