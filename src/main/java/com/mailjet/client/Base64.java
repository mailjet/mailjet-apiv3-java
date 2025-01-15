package com.mailjet.client;


import static java.nio.charset.StandardCharsets.UTF_8;

public class Base64 {

    /**
     * Translates the specified byte array into Base64 string.
     *
     * @param buf the byte array (not null)
     * @return the translated Base64 string (not null)
     */
    public static String encode(byte[] buf){
        return new String(java.util.Base64.getEncoder().encode(buf), UTF_8);
    }

    /**
     * Translates the specified Base64 string into a byte array.
     *
     * @param s the Base64 string (not null)
     * @return the byte array (not null)
     */
    public static byte[] decode(String s){
        return java.util.Base64.getDecoder().decode(s);
    }

}
