package com.mailjet.client;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class MailjetRequestUtilTest {

    // encodeDecimal tests

    @Test
    public void encodeDecimal_nullReturnsNull() {
        assertNull(MailjetRequestUtil.encodeDecimal(null));
    }

    @Test
    public void encodeDecimal_scaleZeroAppendsDecimalPoint() {
        BigDecimal v = new BigDecimal("123");
        // scale == 0 → setScale(1) → "123.0"
        String encoded = MailjetRequestUtil.encodeDecimal(v);
        assertEquals("\f123.0\f", encoded);
    }

    @Test
    public void encodeDecimal_nonZeroScalePreservesScale() {
        BigDecimal v = new BigDecimal("45.67");
        // scale != 0 → keep "45.67"
        String encoded = MailjetRequestUtil.encodeDecimal(v);
        assertEquals("\f45.67\f", encoded);
    }

    // decodeDecimals tests

    @Test
    public void decodeDecimals_nullReturnsNull() {
        assertNull(MailjetRequestUtil.decodeDecimals(null));
    }

    @Test
    public void decodeDecimals_noEncodedSegmentsUnchanged() {
        String payload = "{\"value\":\"100\"}";
        assertEquals(payload, MailjetRequestUtil.decodeDecimals(payload));
    }

    @Test
    public void decodeDecimals_singleEncodedSegmentStripsMarkersAndQuotes() {
        String payload = "\"\\f123.0\\f\"";
        // matches the pattern "\"\\f(...)\f\"" → "$1"
        assertEquals("123.0", MailjetRequestUtil.decodeDecimals(payload));
    }

    @Test
    public void decodeDecimals_multipleEncodedSegmentsInJson() {
        String payload = "{\"price\":\"\\f12.34\\f\",\"qty\":\"\\f5\\f\"}";
        String decoded = MailjetRequestUtil.decodeDecimals(payload);
        // quotes around keys & values remain, only the \f markers & surrounding quotes are stripped
        assertEquals("{\"price\":12.34,\"qty\":5}", decoded);
    }

    @Test
    public void decodeDecimals_arrayOfEncodedNumbers() {
        String payload = "[\"\\f1\\f\",\"\\f2.2\\f\"]";
        String decoded = MailjetRequestUtil.decodeDecimals(payload);
        assertEquals("[1,2.2]", decoded);
    }
}