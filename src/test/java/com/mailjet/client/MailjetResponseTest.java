package com.mailjet.client;

import com.mailjet.client.errors.MailjetException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;

import static org.junit.Assert.*;

public class MailjetResponseTest {

    @Test
    public void testStatusAndRawResponse() {
        MailjetResponse resp = new MailjetResponse(201, "{\"foo\":1}");
        assertEquals(201, resp.getStatus());
        assertEquals("{\"foo\":1}", resp.getRawResponseContent());
    }

    @Test
    public void testGetData_prefersDataField() {
        MailjetResponse resp = new MailjetResponse(200, "{\"Data\":[10,20]}");
        JSONArray data = resp.getData();
        assertEquals(2, data.length());
        assertEquals(10, data.getInt(0));
        assertEquals(20, data.getInt(1));
    }

    @Test
    public void testGetData_prefersSentField() {
        MailjetResponse resp = new MailjetResponse(200, "{\"Sent\":[\"a\",\"b\"]}");
        JSONArray data = resp.getData();
        assertEquals(2, data.length());
        assertEquals("a", data.getString(0));
        assertEquals("b", data.getString(1));
    }

    @Test
    public void testGetData_prefersMessagesField() {
        MailjetResponse resp = new MailjetResponse(200, "{\"Messages\":[true,false]}");
        JSONArray data = resp.getData();
        assertEquals(2, data.length());
        assertTrue(data.getBoolean(0));
        assertFalse(data.getBoolean(1));
    }

    @Test
    public void testGetData_defaultWrapsObject() {
        MailjetResponse resp = new MailjetResponse(200, "{\"x\":42}");
        JSONArray data = resp.getData();
        assertEquals(1, data.length());
        JSONObject obj = data.getJSONObject(0);
        assertEquals(42, obj.getInt("x"));
    }

    @Test
    public void testGetTotal_presentAndAbsent() {
        assertEquals(5,
                new MailjetResponse(200, "{\"Total\":5}").getTotal());
        assertEquals(0,
                new MailjetResponse(200, "{}").getTotal());
    }

    @Test
    public void testGetCount_presentAndAbsent() {
        assertEquals(3,
                new MailjetResponse(200, "{\"Count\":3}").getCount());
        assertEquals(0,
                new MailjetResponse(200, "{}").getCount());
    }

    @Test
    public void testGetString_existingKey() throws MailjetException {
        MailjetResponse resp = new MailjetResponse(200, "{\"greeting\":\"hello\"}");
        assertEquals("hello", resp.getString("greeting"));
    }

    @Test
    public void testGetInt_existingKey() throws MailjetException {
        MailjetResponse resp = new MailjetResponse(200, "{\"n\":123}");
        assertEquals(123, resp.getInt("n"));
    }

    @Test
    public void testGetJSONArray_existingKey() throws MailjetException {
        MailjetResponse resp = new MailjetResponse(200, "{\"arr\":[1,2,3]}");
        JSONArray arr = resp.getJSONArray("arr");
        assertEquals(3, arr.length());
        assertEquals(2, arr.getInt(1));
    }

    @Test(expected = JSONException.class)
    public void testGetString_missingKeyThrowsJSONException() throws MailjetException {
        MailjetResponse resp = new MailjetResponse(200, "{\"foo\":\"bar\"}");
        resp.getString("missing");
    }

    @Test(expected = JSONException.class)
    public void testGetInt_missingKeyThrowsJSONException() throws MailjetException {
        MailjetResponse resp = new MailjetResponse(200, "{\"foo\":1}");
        resp.getInt("missing");
    }

    @Test(expected = JSONException.class)
    public void testGetJSONArray_missingKeyThrowsJSONException() throws MailjetException {
        MailjetResponse resp = new MailjetResponse(200, "{\"foo\":[ ]}");
        resp.getJSONArray("missing");
    }
}
