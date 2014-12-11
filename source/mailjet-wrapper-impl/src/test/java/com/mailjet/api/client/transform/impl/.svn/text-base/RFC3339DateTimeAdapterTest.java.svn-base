package com.mailjet.api.client.transform.impl;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import org.junit.Assert;
import org.junit.Test;

import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
@SuppressWarnings("javadoc")
public class RFC3339DateTimeAdapterTest {
	
	@Test
	public final void testDeserializeOffset(){
		RFC3339DateTimeAdapter rfc3339DateTimeAdapter = new RFC3339DateTimeAdapter();
		
		Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("EET"));
		instance.set(2009, 01, 05, 11, 12, 13);
		instance.set(Calendar.MILLISECOND, 0);
		Date date = instance.getTime();
		
		Date deserializedDate = rfc3339DateTimeAdapter.deserialize(new JsonPrimitive("2009-02-05T11:12:13+02:00"), Date.class, null);
		
		Assert.assertEquals(date, deserializedDate);
	}
	

	@Test(expected=JsonParseException.class)
	public final void testDeserializeBad(){
		RFC3339DateTimeAdapter rfc3339DateTimeAdapter = new RFC3339DateTimeAdapter();
		
		rfc3339DateTimeAdapter.deserialize(new JsonPrimitive("bad"), Date.class, null);
		
	}
	
	@Test
	public final void testDeserializeEmpty(){
		RFC3339DateTimeAdapter rfc3339DateTimeAdapter = new RFC3339DateTimeAdapter();
		
		Assert.assertNull(rfc3339DateTimeAdapter.deserialize(new JsonPrimitive(""), Date.class, null));
		
	}
	public final void testDeserializeGMT(){
		RFC3339DateTimeAdapter rfc3339DateTimeAdapter = new RFC3339DateTimeAdapter();
		
		Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("EET"));
		instance.set(2009, 01, 05, 11 + 2, 12, 13);
		instance.set(Calendar.MILLISECOND, 0);
		Date date = instance.getTime();
		
		Date deserializedDate = rfc3339DateTimeAdapter.deserialize(new JsonPrimitive("2009-02-05T11:12:13Z"), Date.class, null);
		
		Assert.assertEquals(date, deserializedDate);
	}
	
	@Test
	public final void testSerializeOffset(){
		RFC3339DateTimeAdapter rfc3339DateTimeAdapter = new RFC3339DateTimeAdapter();
		
		Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		instance.set(2009, 01, 05, 11, 12, 13);
		instance.set(Calendar.MILLISECOND, 0);
		Date date = instance.getTime();
		
		JsonElement serializedDate = rfc3339DateTimeAdapter.serialize(date, Date.class, null);
		
		Assert.assertEquals("2009-02-05T11:12:13Z", serializedDate.getAsString());
	}
	
	@Test
	public final void testSerializeOffset2(){
		RFC3339DateTimeAdapter rfc3339DateTimeAdapter = new RFC3339DateTimeAdapter();
		
		Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("CET"));
		instance.set(2009, 01, 05, 11, 12, 13);
		instance.set(Calendar.MILLISECOND, 0);
		Date date = instance.getTime();
		
		JsonElement serializedDate = rfc3339DateTimeAdapter.serialize(date, Date.class, null);
		
		Assert.assertEquals("2009-02-05T10:12:13Z", serializedDate.getAsString());
	}
	
}
