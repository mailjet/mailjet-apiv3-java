package com.mailjet.api.client.transform.impl;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.Assert;
import org.junit.Test;
@SuppressWarnings("javadoc")
public class InternetDateFormatTest {
	@Test
	public final void testCreationDefault() {
		new InternetDateFormat();
	}

//	@Test
//	public final void testCreationOffset() {
//		InternetDateFormat internetDateFormat = new InternetDateFormat(true, 3);
//		Calendar instance = Calendar.getInstance();
//		instance.set(2009, 01, 05, 11, 12, 13);
//		instance.set(Calendar.MILLISECOND, 123);
//		Date date = instance.getTime();
//		Assert.assertEquals("2009-02-05T11:12:13.123+02:00",
//				internetDateFormat.format(date));
//
//	}
	
//	@Test
//	public final void testCreationNoMilis() {
//		InternetDateFormat internetDateFormat = new InternetDateFormat(true, 0);
//		Calendar instance = Calendar.getInstance();
//		instance.set(2009, 01, 05, 11, 12, 13);
//		instance.set(Calendar.MILLISECOND, 0);
//		Date date = instance.getTime();
//		Assert.assertEquals("2009-02-05T11:12:13+02:00",
//				internetDateFormat.format(date));
//
//	}
	
	@Test(expected=IllegalArgumentException.class)
	public final void testCreationNoBadMilis1() {
		new InternetDateFormat(true, -1);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public final void testCreationNoBadMilis2() {
		new InternetDateFormat(true, 4);
	}

//	@Test
//	public final void testCreationNoOffset() {
//		InternetDateFormat internetDateFormat = new InternetDateFormat(false, 3);
//		Calendar instance = Calendar.getInstance();
//		instance.set(2009, 01, 05, 11, 12, 13);
//		instance.set(Calendar.MILLISECOND, 123);
//		Date date = instance.getTime();
//		Assert.assertEquals("2009-02-05T09:12:13.123Z",
//				internetDateFormat.format(date));
//
//	}

	@Test
	public final void testCreationCETOffset() {
		InternetDateFormat internetDateFormat = new InternetDateFormat(
				TimeZone.getTimeZone("CET"), Locale.ENGLISH, true, 3);
		Calendar instance = Calendar.getInstance();
		instance.set(2009, 01, 05, 11, 12, 13);
		instance.set(Calendar.MILLISECOND, 123);
		Date date = instance.getTime();

		Assert.assertEquals("2009-02-05T11:12:13.123+01:00",
				internetDateFormat.format(date));

	}
	
	@Test
	public final void testCreationESTOffset() {
		InternetDateFormat internetDateFormat = new InternetDateFormat(
				TimeZone.getTimeZone("EST"), Locale.ENGLISH, true, 3);
		Calendar instance = Calendar.getInstance();
		instance.set(2009, 01, 05, 11, 12, 13);
		instance.set(Calendar.MILLISECOND, 123);
		Date date = instance.getTime();

		Assert.assertEquals("2009-02-05T11:12:13.123-05:00",
				internetDateFormat.format(date));

	}

	@Test
	public final void testCreationEETNoOffset() {
		InternetDateFormat internetDateFormat = new InternetDateFormat(
				TimeZone.getTimeZone("EST"), Locale.ENGLISH, false, 3);
		Calendar instance = Calendar.getInstance();
		instance.set(2009, 01, 05, 11, 12, 13);
		instance.set(Calendar.MILLISECOND, 123);
		Date date = instance.getTime();

		Assert.assertEquals("2009-02-05T16:12:13.123Z",
				internetDateFormat.format(date));

	}
	
	@Test
	public final void testParseGMTOffset() throws ParseException {
		InternetDateFormat internetDateFormat = new InternetDateFormat(true, 3);
		Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		instance.set(2009, 01, 05, 11, 12, 13);
		instance.set(Calendar.MILLISECOND, 123);
		Assert.assertEquals(instance.getTimeInMillis(),
				internetDateFormat.parse("2009-02-05T11:12:13.123Z").getTime());

	}
	
	@Test
	public final void testParseCETOffset() throws ParseException {
		InternetDateFormat internetDateFormat = new InternetDateFormat(true, 3);
		Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("CET"));
		instance.set(2009, 01, 05, 12, 12, 13);
		instance.set(Calendar.MILLISECOND, 123);
		Assert.assertEquals(instance.getTimeInMillis(),
				internetDateFormat.parse("2009-02-05T11:12:13.123Z").getTime());

	}
	
	@Test
	public final void testParseNoOffset() throws ParseException {
		InternetDateFormat internetDateFormat = new InternetDateFormat(false, 3);
		Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("CET"));
		instance.set(2009, 01, 05, 12, 12, 13);
		instance.set(Calendar.MILLISECOND, 123);
		Assert.assertEquals(instance.getTimeInMillis(),
				internetDateFormat.parse("2009-02-05T11:12:13.123Z").getTime());

	}
	
	@Test
	public final void testParseNoOffsetNoMillis() throws ParseException {
		InternetDateFormat internetDateFormat = new InternetDateFormat(false, 3);
		Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("CET"));
		instance.set(2009, 01, 05, 12, 12, 13);
		instance.set(Calendar.MILLISECOND, 0);
		Assert.assertEquals(instance.getTimeInMillis(),
				internetDateFormat.parse("2009-02-05T11:12:13Z").getTime());

	}
	
	@Test
	public final void testParseNoOffsetOneMillis() throws ParseException {
		InternetDateFormat internetDateFormat = new InternetDateFormat(false, 1);
		Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("CET"));
		instance.set(2009, 01, 05, 12, 12, 13);
		instance.set(Calendar.MILLISECOND, 100);
		Assert.assertEquals(instance.getTimeInMillis(),
				internetDateFormat.parse("2009-02-05T11:12:13.1Z").getTime());

	}
	
	@Test
	public final void testParseNoOffsetTwoMillis() throws ParseException {
		InternetDateFormat internetDateFormat = new InternetDateFormat(false, 1);
		Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("CET"));
		instance.set(2009, 01, 05, 12, 12, 13);
		instance.set(Calendar.MILLISECOND, 120);
		Assert.assertEquals(instance.getTimeInMillis(),
				internetDateFormat.parse("2009-02-05T11:12:13.12Z").getTime());

	}
	
	@Test
	public final void testParseNoOffsetPlus() throws ParseException {
		InternetDateFormat internetDateFormat = new InternetDateFormat(false, 3);
		Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("CET"));
		instance.set(2009, 01, 05, 11, 12, 13);
		instance.set(Calendar.MILLISECOND, 123);
		Assert.assertEquals(instance.getTimeInMillis(),
				internetDateFormat.parse("2009-02-05T11:12:13.123+01:00").getTime());

	}
	
	@Test
	public final void testParseCETOffsetPlus() throws ParseException {
		InternetDateFormat internetDateFormat = new InternetDateFormat(TimeZone.getTimeZone("CET"), Locale.ENGLISH, true, 3);
		Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("CET"));
		instance.set(2009, 01, 05, 11, 12, 13);
		instance.set(Calendar.MILLISECOND, 123);
		Assert.assertEquals(instance.getTimeInMillis(),
				internetDateFormat.parse("2009-02-05T11:12:13.123+01:00").getTime());

	}
	
	@Test
	public final void testParseNoOffsetNegative() throws ParseException {
		InternetDateFormat internetDateFormat = new InternetDateFormat( false, 3);
		Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("EST"));
		instance.set(2009, 01, 05, 11, 12, 13);
		instance.set(Calendar.MILLISECOND, 123);
		Assert.assertEquals(instance.getTimeInMillis(),
				internetDateFormat.parse("2009-02-05T11:12:13.123-05:00").getTime());

	}
	
	@Test(expected=ParseException.class)
	public final void testBadInput() throws ParseException {
		InternetDateFormat internetDateFormat = new InternetDateFormat( false, 3);
		internetDateFormat.parse("2009-0205T11:12:13.123-05:00");
	}
	
	@Test(expected=ParseException.class)
	public final void testBadInput2() throws ParseException {
		InternetDateFormat internetDateFormat = new InternetDateFormat( false, 3);
		internetDateFormat.parse("2009-0a-05T11:12:13.123-05:00");
	}
	
	@Test(expected=ParseException.class)
	public final void testBadInput3() throws ParseException {
		InternetDateFormat internetDateFormat = new InternetDateFormat( false, 3);
		internetDateFormat.parse("2009-01-05T11:12:13.12");
	}
	
}
