package com.mailjet.api.model.v3.customtypes;

import java.util.List;

public class SpamAssassinRuleList {
	private Long ID;
	private List<SpamAssassinRule> Items;

	public Long getID() {
		return ID;
	}

	public List<SpamAssassinRule> getItems() {
		return Items;
	}

}
