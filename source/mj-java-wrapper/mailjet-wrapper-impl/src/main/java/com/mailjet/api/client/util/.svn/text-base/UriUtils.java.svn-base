package com.mailjet.api.client.util;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.util.BitSet;

/**
 * Utility class for URI encoding and decoding based on RFC 3986. Offers
 * encoding methods for the various URI components.
 * 
 * <p>
 * All {@code encode*(String, String} methods in this class operate in a similar
 * way:
 * <ul>
 * <li>Valid characters for the specific URI component as defined in RFC 3986
 * stay the same.
 * <li>All other characters are converted into one or more bytes in the given
 * encoding scheme. Each of the resulting bytes is written as a hexadecimal
 * string in the "<code>%<i>xy</i></code>" format.
 * </ul>
 * 
 */
public final class UriUtils {

	private static final int BITS_256 = 256;

	private static final BitSet SCHEME;

	private static final BitSet USER_INFO;

	private static final BitSet HOST;

	private static final BitSet PORT;

	private static final BitSet PATH;

	private static final BitSet SEGMENT;

	private static final BitSet QUERY;

	private static final BitSet QUERY_PARAM;

	private static final BitSet FRAGMENT;

	static {
		// variable names refer to RFC 3986, appendix A
		BitSet alpha = new BitSet(BITS_256);
		for (int i = 'a'; i <= 'z'; i++) {
			alpha.set(i);
		}
		for (int i = 'A'; i <= 'Z'; i++) {
			alpha.set(i);
		}
		BitSet digit = new BitSet(BITS_256);
		for (int i = '0'; i <= '9'; i++) {
			digit.set(i);
		}

		BitSet gendelims = new BitSet(BITS_256);
		gendelims.set(':');
		gendelims.set('/');
		gendelims.set('?');
		gendelims.set('#');
		gendelims.set('[');
		gendelims.set(']');
		gendelims.set('@');

		BitSet subdelims = new BitSet(BITS_256);
		subdelims.set('!');
		subdelims.set('$');
		subdelims.set('&');
		subdelims.set('\'');
		subdelims.set('(');
		subdelims.set(')');
		subdelims.set('*');
		subdelims.set('+');
		subdelims.set(',');
		subdelims.set(';');
		subdelims.set('=');

		BitSet reserved = new BitSet(BITS_256);
		reserved.or(gendelims);
		reserved.or(subdelims);

		BitSet unreserved = new BitSet(BITS_256);
		unreserved.or(alpha);
		unreserved.or(digit);
		unreserved.set('-');
		unreserved.set('.');
		unreserved.set('_');
		unreserved.set('~');

		SCHEME = new BitSet(BITS_256);
		SCHEME.or(alpha);
		SCHEME.or(digit);
		SCHEME.set('+');
		SCHEME.set('-');
		SCHEME.set('.');

		USER_INFO = new BitSet(BITS_256);
		USER_INFO.or(unreserved);
		USER_INFO.or(subdelims);
		USER_INFO.set(':');

		HOST = new BitSet(BITS_256);
		HOST.or(unreserved);
		HOST.or(subdelims);

		PORT = new BitSet(BITS_256);
		PORT.or(digit);

		BitSet pchar = new BitSet(BITS_256);
		pchar.or(unreserved);
		pchar.or(subdelims);
		pchar.set(':');
		pchar.set('@');

		SEGMENT = new BitSet(BITS_256);
		SEGMENT.or(pchar);

		PATH = new BitSet(BITS_256);
		PATH.or(SEGMENT);
		PATH.set('/');

		QUERY = new BitSet(BITS_256);
		QUERY.or(pchar);
		QUERY.set('/');
		QUERY.set('?');

		QUERY_PARAM = new BitSet(BITS_256);
		QUERY_PARAM.or(pchar);
		QUERY_PARAM.set('/');
		QUERY_PARAM.set('?');
		QUERY_PARAM.clear('=');
		QUERY_PARAM.clear('+');
		QUERY_PARAM.clear('&');

		FRAGMENT = new BitSet(BITS_256);
		FRAGMENT.or(pchar);
		FRAGMENT.set('/');
		FRAGMENT.set('?');
	}

	/**
	 * Private constructor to prevent instantiations.
	 */
	private UriUtils() {

	}

	/**
	 * Encodes the given URI path segment.
	 * 
	 * @param segment
	 *            the segment to be encoded
	 * @param encoding
	 *            the character encoding to encode to
	 * @return the encoded segment
	 * @throws UnsupportedEncodingException
	 *             when the given encoding parameter is not supported
	 */
	public static String encodePathSegment(final String segment,
			final String encoding) throws UnsupportedEncodingException {
		return encode(segment, encoding, SEGMENT);
	}

	/**
	 * Encodes the given URI query parameter.
	 * 
	 * @param queryParam
	 *            the query parameter to be encoded
	 * @param encoding
	 *            the character encoding to encode to
	 * @return the encoded query parameter
	 * @throws UnsupportedEncodingException
	 *             when the given encoding parameter is not supported
	 */
	public static String encodeQueryParam(final String queryParam,
			final String encoding) throws UnsupportedEncodingException {
		return encode(queryParam, encoding, QUERY_PARAM);
	}

	
	private static String encode(final String source, final String encoding,
			BitSet notEncoded) throws UnsupportedEncodingException {

		byte[] bytes = encode(source.getBytes(encoding), notEncoded);
		return new String(bytes, "US-ASCII");
	}

	private static byte[] encode(final byte[] source, final BitSet notEncoded) {
		ByteArrayOutputStream bos = new ByteArrayOutputStream(source.length * 2);
		for (int i = 0; i < source.length; i++) {
			int b = source[i];
			if (b < 0) {
				b += BITS_256;
			}
			if (notEncoded.get(b)) {
				bos.write(b);
			} else {
				bos.write('%');
				char hex1 = Character.toUpperCase(Character.forDigit(
						(b >> 4) & 0xF, 16));
				char hex2 = Character.toUpperCase(Character.forDigit(b & 0xF,
						16));
				bos.write(hex1);
				bos.write(hex2);
			}
		}
		return bos.toByteArray();
	}

}
