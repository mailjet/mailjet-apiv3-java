package com.mailjet.api.model.v3.customtypes;

import java.util.Date;

public final class ManyContactsListRecipient {
	/**
	 * ID.
	 */
	private Long ID;
	/**
	 * IsActive.
	 */
	private boolean IsActive;
	/**
	 * IsUnsubscribed.
	 */
	private boolean IsUnsubscribed;
	/**
	 * UnsubscribedAt.
	 */
	private Date UnsubscribedAt;

	public Long getID() {
		return ID;
	}

	public boolean isIsActive() {
		return IsActive;
	}

	public boolean isIsUnsubscribed() {
		return IsUnsubscribed;
	}

	public Date getUnsubscribedAt() {
		return UnsubscribedAt;
	}

}
