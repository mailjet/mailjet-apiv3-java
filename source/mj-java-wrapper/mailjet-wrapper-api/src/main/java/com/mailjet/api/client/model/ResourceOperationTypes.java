package com.mailjet.api.client.model;

/**
 * Enumeration of the operations types that it is possible to execute on a
 * service from MailJet API.
 *
 * @author MailJet
 *
 */
public enum ResourceOperationTypes {
	/**
	 * Operation to list object on the MailJet API.
	 */
	Get, /**
	 * Operation to find object by id on the MailJet API.
	 */
	GetById,/**
	 * Operation to update object on the MailJet API.
	 */
	Put, /**
	 * Operation to create object on the MailJet API.
	 */
	Post, /**
	 * Operation to delete object on the MailJet API.
	 */
	Delete
}
