package com.mailjet.api.model.v3.customtypes;

import java.math.BigDecimal;

public class SpamAssassinRule {
	private Long HitCount;
	private Long ID;
	private String Name;
	private BigDecimal Score;

	public Long getHitCount() {
		return HitCount;
	}

	public Long getID() {
		return ID;
	}

	public String getName() {
		return Name;
	}

	public BigDecimal getScore() {
		return Score;
	}

}
