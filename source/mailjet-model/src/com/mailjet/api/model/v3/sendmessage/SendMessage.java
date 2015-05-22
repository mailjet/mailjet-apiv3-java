package com.mailjet.api.model.v3.sendmessage;

import java.util.ArrayList;
import java.util.HashMap;

import com.mailjet.api.client.MailJetApiService;
import com.mailjet.api.client.model.ResourceOperationTypes;
import com.mailjet.api.client.model.metadata.Component;
import com.mailjet.api.client.model.metadata.Resource;
import com.mailjet.api.model.v3.sendmessage.SendMessageRecipient;


/**
 * @author Mailjet_GP
 *
 */
@Resource(name = "sendmessage", description = "Send API implementation.", allowedOperations = {
	    ResourceOperationTypes.Post
})
public final class SendMessage
{
    @Component(name = "FromEmail", type = "String", defaultValue = "", required = true, description = "")
	private String fromEmail;
    @Component(name = "FromName", type = "String", defaultValue = "", required = false, description = "")
    private String fromName;
    @Component(name = "Sender", type = "String", defaultValue = "", required = false, description = "")
	private String sender;
	
	// Can contain a single recipient...
    @Component(name = "Recipients", type = "ArrayList<SendMessageRecipient>", defaultValue = "", required = true, description = "")
	private ArrayList<SendMessageRecipient> recipients;		
    @Component(name = "Subject", type = "String", defaultValue = "", required = true, description = "")
	private String subject;
    @Component(name = "Text-part", type = "String", defaultValue = "", required = false, description = "")
	private String textPart;
    @Component(name = "Html-part", type = "String", defaultValue = "", required = true, description = "")
	private String htmlPart;
	
    @Component(name = "Mj-prio", type = "Integer", defaultValue = "", required = false, description = "")
	private Integer mjPrio;
    @Component(name = "Mj-campaign", type = "String", defaultValue = "", required = false, description = "")
	private String	mjCampaign;
    @Component(name = "Mj-deduplicatecampaign", type = "Integer", defaultValue = "", required = false, description = "")
	private Integer mjDeduplicateCampaign;
	@Component(name = "Mj-trackopen", type = "Integer", defaultValue = "", required = false, description = "")
	private Integer mjTrackOpen;
	@Component(name = "Mj-trackclick", type = "Integer", defaultValue = "", required = false, description = "")
	private Integer mjTrackClick;
	
    @Component(name = "Headers", type = "HashMap<String, String>", defaultValue = "", required = false, description = "")
	private HashMap<String, String> headers;
	@Component(name = "Vars", type = "HashMap<String, String>", defaultValue = "", required = false, description = "")
	private HashMap<String, String> vars;

	@Component(name = "Attachments", type = "ArrayList<HashMap<String, String>>", defaultValue = "", required = false, description = "")
	private ArrayList<HashMap<String, String>> attachments;
	@Component(name = "Inline_attachments", type = "ArrayList<HashMap<String, String>>", defaultValue = "", required = false, description = "")
	private ArrayList<HashMap<String, String>> inlineAttachments;

	// TODO : Add support for multiple message blocks. See specs for "more" details.
	
	/**
     * API Operation "Create".
     * 
     */
    public final static MailJetApiService<com.mailjet.api.client.MailJetApiCall.Create<SendMessage>> Create = new MailJetApiService<com.mailjet.api.client.MailJetApiCall.Create<SendMessage>>(SendMessage.class, ResourceOperationTypes.Post);

	/**
	 * @return the fromEmail
	 */
	public String getFromEmail()
	{
		return fromEmail;
	}

	/**
	 * @param fromEmail the fromEmail to set
	 */
	public void setFromEmail(String fromEmail)
	{
		this.fromEmail = fromEmail;
	}

	/**
	 * @return the fromName
	 */
	public String getFromName()
	{
		return fromName;
	}

	/**
	 * @param fromName the fromName to set
	 */
	public void setFromName(String fromName)
	{
		this.fromName = fromName;
	}

	/**
	 * @return the sender
	 */
	public String getSender()
	{
		return sender;
	}

	/**
	 * @param sender the sender to set
	 */
	public void setSender(String sender)
	{
		this.sender = sender;
	}

	/**
	 * @return the recipients
	 */
	public ArrayList<SendMessageRecipient> getRecipients()
	{
		return recipients;
	}

	/**
	 * @param recipients the recipients to set
	 */
	public void setRecipients(ArrayList<SendMessageRecipient> recipients)
	{
		this.recipients = recipients;
	}

	/**
	 * @return the subject
	 */
	public String getSubject()
	{
		return subject;
	}

	/**
	 * @param subject the subject to set
	 */
	public void setSubject(String subject)
	{
		this.subject = subject;
	}

	/**
	 * @return the textPart
	 */
	public String getTextPart()
	{
		return textPart;
	}

	/**
	 * @param textPart the textPart to set
	 */
	public void setTextPart(String textPart)
	{
		this.textPart = textPart;
	}

	/**
	 * @return the htmlPart
	 */
	public String getHtmlPart()
	{
		return htmlPart;
	}

	/**
	 * @param htmlPart the htmlPart to set
	 */
	public void setHtmlPart(String htmlPart)
	{
		this.htmlPart = htmlPart;
	}

	/**
	 * @return the mjPrio
	 */
	public Integer getMjPrio()
	{
		return mjPrio;
	}

	/**
	 * @param mjPrio the mjPrio to set
	 */
	public void setMjPrio(Integer mjPrio)
	{
		this.mjPrio = mjPrio;
	}

	/**
	 * @return the mjCampaign
	 */
	public String getMjCampaign()
	{
		return mjCampaign;
	}

	/**
	 * @param mjCampaign the mjCampaign to set
	 */
	public void setMjCampaign(String mjCampaign)
	{
		this.mjCampaign = mjCampaign;
	}

	/**
	 * @return the mjDeduplicateCampaign
	 */
	public Integer getMjDeduplicateCampaign()
	{
		return mjDeduplicateCampaign;
	}

	/**
	 * @param mjDeduplicateCampaign the mjDeduplicateCampaign to set
	 */
	public void setMjDeduplicateCampaign(Integer mjDeduplicateCampaign)
	{
		this.mjDeduplicateCampaign = mjDeduplicateCampaign;
	}

	/**
	 * @return the mjTrackOpen
	 */
	public Integer getMjTrackOpen()
	{
		return mjTrackOpen;
	}

	/**
	 * @param mjTrackOpen the mjTrackOpen to set
	 */
	public void setMjTrackOpen(Integer mjTrackOpen)
	{
		this.mjTrackOpen = mjTrackOpen;
	}

	/**
	 * @return the mjTrackClick
	 */
	public Integer getMjTrackClick()
	{
		return mjTrackClick;
	}

	/**
	 * @param mjTrackClick the mjTrackClick to set
	 */
	public void setMjTrackClick(Integer mjTrackClick)
	{
		this.mjTrackClick = mjTrackClick;
	}

	/**
	 * @return the headers
	 */
	public HashMap<String, String> getHeaders()
	{
		return headers;
	}

	/**
	 * @param headers the headers to set
	 */
	public void setHeaders(HashMap<String, String> headers)
	{
		this.headers = headers;
	}

	/**
	 * @return the vars
	 */
	public HashMap<String, String> getVars()
	{
		return vars;
	}

	/**
	 * @param vars the vars to set
	 */
	public void setVars(HashMap<String, String> vars)
	{
		this.vars = vars;
	}

	/**
	 * @return the attachments
	 */
	public ArrayList<HashMap<String, String>> getAttachments()
	{
		return attachments;
	}

	/**
	 * @param attachments the attachments to set
	 */
	public void setAttachments(ArrayList<HashMap<String, String>> attachments)
	{
		this.attachments = attachments;
	}

	/**
	 * @return the inlineAttachments
	 */
	public ArrayList<HashMap<String, String>> getInlineAttachments()
	{
		return inlineAttachments;
	}

	/**
	 * @param inlineAttachments the inlineAttachments to set
	 */
	public void setInlineAttachments(
			ArrayList<HashMap<String, String>> inlineAttachments)
	{
		this.inlineAttachments = inlineAttachments;
	}

}