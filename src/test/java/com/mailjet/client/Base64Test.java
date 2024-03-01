package com.mailjet.client;

import junit.framework.TestCase;
import org.junit.Assert;

import static java.nio.charset.StandardCharsets.UTF_8;

public class Base64Test extends TestCase {
    public void test_should_base64_decode_provided_string() {
        // GIVEN
        String mock = "dGVzdDp0ZXN0w6lhJCTDoCk9Lyo=";

        // WHEN
        byte[] result = Base64.decode(mock);

        // THEN
        Assert.assertEquals("test:testéa$$à)=/*", new String(result));
    }

    public void test_should_base64_encode_provided_bytes_array() {
        // GIVEN
        byte[] mock = "test:testéa$$à)=/*".getBytes(UTF_8);

        // WHEN
        String result = Base64.encode(mock);

        // THEN
        Assert.assertEquals("dGVzdDp0ZXN0w6lhJCTDoCk9Lyo=", result);
    }
}
