package com.mailjet.client;

import lombok.experimental.UtilityClass;

import java.math.BigDecimal;
import java.util.regex.Pattern;

@UtilityClass
public class MailjetRequestUtil {

    // Match only JSON numbers inside legacy markers; leave ordinary strings untouched.
    private static final Pattern LEGACY_DECIMAL = Pattern.compile(
            "\"\\\\f(-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][+-]?[0-9]+)?)\\\\f\"");

    /**
     * @deprecated Pass BigDecimal directly to MailjetRequest.property instead.
     * @param value decimal value
     * @return legacy encoded decimal
     */
    @Deprecated
    public static String encodeDecimal(BigDecimal value) {
        return value != null ? "\f" + (value.scale() != 0 ? value : value.setScale(1)) + "\f" : null;
    }

    /**
     * Converts legacy decimal markers to JSON numbers for backward compatibility.
     * @param payload JSON payload
     * @return payload with legacy decimal strings converted to numbers
     */
    public static String decodeDecimals(String payload) {
        return payload == null ? null : LEGACY_DECIMAL.matcher(payload).replaceAll("$1");
    }
}
