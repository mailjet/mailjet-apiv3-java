package com.mailjet.client;

import java.math.BigDecimal;

/**
 * 
 * @author s.stoyanov
 *
 */
public final class MailjetRequestUtil {

	private MailjetRequestUtil() {
	}
	
	public static String encodeDecimal(BigDecimal value) {
		return value != null ? "\f" + (value.scale() != 0 ? value : value.setScale(1)).toString() + "\f" : null;
	}
	
	public static String decodeDecimals(String payload) {
		return payload != null ? payload.replaceAll("\"\\\\f([^\"]+)\\\\f\"", "$1") : null;
	}
	
}
