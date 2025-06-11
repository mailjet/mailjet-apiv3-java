package com.mailjet.client;

import com.mailjet.client.enums.ApiAuthenticationType;
import com.mailjet.client.enums.ApiVersion;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class MailjetRequestTest {

    private Resource resNoAction;
    private Resource resWithAction;
    private Resource resCsvData;
    private Resource resCsvError;
    private Resource resWithoutNs;
    private Resource resSend;

    @Before
    public void setUp() {
        ApiVersion version = ApiVersion.V3_1;
        ApiAuthenticationType auth = ApiAuthenticationType.Basic;

        // no action, default withoutNamespace=false
        resNoAction    = new Resource("foo",     "",       version, auth);
        // with action, default withoutNamespace=false
        resWithAction  = new Resource("foo",   "act",     version, auth);
        // csvdata action, default withoutNamespace=false
        resCsvData     = new Resource("foo", "csvdata",    version, auth);
        // csverror action, default withoutNamespace=false
        resCsvError    = new Resource("foo", "csverror",    version, auth);
        // explicitly withoutNamespace=true
        resWithoutNs   = new Resource("bar",     "",       version, auth, true);
        // "send" resource (path="" special case), default withoutNamespace=false
        resSend        = new Resource("send",    "",       version, auth);
    }

    @Test
    public void testBasicConstructorAndGetters() {
        MailjetRequest rq = new MailjetRequest(resNoAction);
        assertEquals("foo", rq.getResource());
        assertEquals(ApiVersion.V3_1, rq.getApiVersion());
        assertEquals(ApiAuthenticationType.Basic, rq.getAuthenticationType());
        assertEquals("application/json", rq.getContentType());
        assertNull(rq.getAttachment());
    }

    @Test
    public void testBuildUrl_config1_andSendPath() throws UnsupportedEncodingException {
        // config1: no ID, no action
        String u1 = new MailjetRequest(resNoAction).buildUrl("https://api");
        assertEquals("https://api/v3.1/REST/foo", u1);

        // special "send" resource resets path to ""
        String u2 = new MailjetRequest(resSend).buildUrl("https://api/");
        assertEquals("https://api/v3.1/send", u2);
    }

    @Test
    public void testBuildUrl_config2_withLongId_andStringId() throws UnsupportedEncodingException {
        // config2 via long
        String u1 = new MailjetRequest(resNoAction, 77L).buildUrl("https://api/");
        assertEquals("https://api/v3.1/REST/foo/77", u1);

        // config2 via String (and URL-encoding)
        String u2 = new MailjetRequest(resNoAction, "a b/c").buildUrl("https://api");
        String encoded = URLEncoder.encode("a b/c", "UTF-8");
        assertEquals("https://api/v3.1/REST/foo/" + encoded, u2);
    }

    @Test
    public void testBuildUrl_config3_and4_withAction() throws UnsupportedEncodingException {
        // config3: long id + action
        String u3 = new MailjetRequest(resWithAction, 5L).buildUrl("https://api/");
        assertEquals("https://api/v3.1/REST/foo/5/act", u3);

        // config4: id + action + actionId
        String u4 = new MailjetRequest(resWithAction, 5L, 99L).buildUrl("https://api/");
        assertEquals("https://api/v3.1/REST/foo/5/act/99", u4);
    }

    @Test
    public void testCsvdataAndCsverror_pathsAndContentType() throws UnsupportedEncodingException {
        // csvdata path
        String uCsv = new MailjetRequest(resCsvData, 123L).buildUrl("https://api/");
        // OkHttp allows ':' unencoded in path segments
        assertTrue(uCsv.endsWith("/DATA/foo/123/csvdata/text:plain"));
        assertEquals("text/plain", new MailjetRequest(resCsvData).getContentType());

        // csverror content type
        assertEquals("text/plain", new MailjetRequest(resCsvError).getContentType());
    }

    @Test
    public void testBuildUrl_actionOnly_branch() throws UnsupportedEncodingException {
        // branch: id == null && _action nonempty
        // config=_configuration==1 but action!=""
        String url = new MailjetRequest(resWithAction).buildUrl("https://api/");
        // should be .../REST/foo/act
        assertEquals("https://api/v3.1/REST/foo/act", url);
    }

    @Test
    public void testBuildUrl_manageManyContacts_branch() throws UnsupportedEncodingException {
        // branch: _action.equals("managemanycontacts") && id != null
        Resource r = new Resource(
                "foo",
                "managemanycontacts",
                ApiVersion.V3_1,
                ApiAuthenticationType.Basic
        );
        // pass an id so the manageManyContacts path is taken
        String url = new MailjetRequest(r, 77L).buildUrl("https://api/");
        assertEquals("https://api/v3.1/REST/foo/managemanycontacts/77", url);
    }

    @Test
    public void testSetData_andGetBody_base64_encodesFile() throws IOException {
        Path tmp = Files.createTempFile("mj-", ".txt");
        Files.write(tmp, "hello".getBytes(StandardCharsets.UTF_8));

        MailjetRequest rq = new MailjetRequest(resNoAction);
        rq.setData(tmp.toString());
        String body = rq.getBody();

        assertEquals(
                java.util.Base64.getEncoder().encodeToString("hello".getBytes(StandardCharsets.UTF_8)),
                body
        );
        Files.delete(tmp);
    }

    @Test
    public void testAttachFile_andGetAttachment() {
        File f = new File("dummy.bin");
        MailjetRequest rq = new MailjetRequest(resNoAction).attachFile(f);
        assertSame(f, rq.getAttachment());
    }

    @Test
    public void testSetBody_overloads_andGetBodyJSON() {
        MailjetRequest rq = new MailjetRequest(resNoAction);

        // String
        rq.setBody("{\"n\":2.50}");
        JSONObject j1 = rq.getBodyJSON();
        assertEquals(2.50, j1.getDouble("n"), 0.0);

        // JSONObject
        JSONObject fooo = new JSONObject().put("x","y");
        rq.setBody(fooo);
        assertEquals("y", rq.getBodyJSON().getString("x"));

        // HashMap
        HashMap<String,Object> map = new HashMap<>();
        map.put("k", 123);
        rq.setBody(map);
        assertEquals(123, rq.getBodyJSON().getInt("k"));
    }

    @Test
    public void testAppend_property_andGetBody() {
        MailjetRequest rq = new MailjetRequest(resNoAction);
        rq.append("arr", "one")
                .append("arr", "two")
                .property("foo", 42);

        JSONObject body = rq.getBodyJSON();
        JSONArray arr = body.getJSONArray("arr");
        assertEquals(2, arr.length());
        assertEquals("one", arr.getString(0));
        assertEquals("two", arr.getString(1));
        assertEquals(42, body.getInt("foo"));

        String out = rq.getBody();
        assertTrue(out.contains("\"foo\":42"));
        assertTrue(out.contains("\"arr\":[\"one\",\"two\"]"));
    }

    @Test
    public void testFilter_andQueryString_multiple() throws UnsupportedEncodingException {
        MailjetRequest rq = new MailjetRequest(resNoAction);
        rq.filter("a", "b c").filter("d", 7);

        String qs = rq.queryString();
        // must start with '?' and contain both kv pairs
        assertTrue(qs.startsWith("?"));
        assertTrue(qs.contains("a=b+c"));
        assertTrue(qs.contains("d=7"));
    }

    @Test
    public void testToString_includesExpectedFields() {
        MailjetRequest rq = new MailjetRequest(resWithoutNs);
        rq.filter("f","v").append("x","y");

        String ts = rq.toString();
        JSONObject top = new JSONObject(ts);

        assertEquals("bar", top.getString("Resource"));
        assertTrue(top.has("Filters"));
        assertTrue(top.has("Body"));
        assertEquals("y", new JSONObject(top.getString("Body")).getJSONArray("x").getString(0));
    }
}