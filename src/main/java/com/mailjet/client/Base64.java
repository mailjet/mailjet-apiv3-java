package com.mailjet.client;



/** @deprecated Use {@link java.util.Base64} directly. */
@Deprecated
public class Base64 {

    /**
     * Translates the specified byte array into Base64 string.
     *
     * @param buf the byte array (not null)
     * @return the translated Base64 string (not null)
     */
    public static String encode(byte[] buf){
        return java.util.Base64.getEncoder().encodeToString(buf);
    }

    /**
     * Translates the specified Base64 string into a byte array.
     *
     * @param value the Base64 string (not null)
     * @return the byte array (not null)
     */
    public static byte[] decode(String value){
        return java.util.Base64.getDecoder().decode(value);
    }

}
