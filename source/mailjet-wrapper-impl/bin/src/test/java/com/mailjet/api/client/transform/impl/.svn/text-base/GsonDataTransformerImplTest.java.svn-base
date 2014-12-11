package com.mailjet.api.client.transform.impl;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import org.junit.Assert;
import org.junit.Test;

import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.mailjet.api.client.model.TApiKey;
import com.mailjet.api.client.model.TCustomStatus;
import com.mailjet.api.client.model.TRunLevel;
import com.mailjet.api.client.model.metadata.Component;
import com.mailjet.api.client.model.metadata.EnumValue;
@SuppressWarnings("javadoc")
public class GsonDataTransformerImplTest {
	@Test
	public final void testSerializeObject(){
		TApiKey apiKey = 
				new TApiKey()
				.setAPIKey("key1")
				.setCreatedAt(createDate(2013, 11, 12, 19, 8, 1))
				.setCustomStatus(TCustomStatus.DOWN)
				.setExpiredAt(createDate(2013, 11, 12, 19, 9, 1))
				.setID(1L)
				.setIsActive(true)
				.setIsMaster(false)
				.setIsSenderAllowed(true)
				.setLastUpdateAt(createDate(2013, 11, 12, 19, 10, 1))
				.setName("name1")
				.setRunlevel(TRunLevel.NORMAL);
		String serialized = new GsonDataTransformerImpl().toString(apiKey);
		
		Assert.assertEquals("{" +
				keyValue("APIKey", apiKey.getAPIKey()) + "," +
				keyValue("CreatedAt", "2013-11-12T19:08:01Z") + "," +
				keyValue("CustomStatus", "down") + "," +
				keyValue("ExpiredAt", "2013-11-12T19:09:01Z") + "," +
				keyValue("ID", 1) + "," +
				keyValue("IsActive", true) + "," +
				keyValue("IsMaster", false) + "," +
				keyValue("IsSenderAllowed", true) + "," +
				keyValue("LastUpdateAt", "2013-11-12T19:10:01Z") + "," +
				keyValue("Name", apiKey.getName()) + "," +
				keyValue("Runlevel", "Normal") +
				"}", serialized);
		
	}
	
	@Test
	public final void testSerializeObjectNullProperties(){
		TApiKey apiKey = 
				new TApiKey()
				.setAPIKey("");
		String serialized = new GsonDataTransformerImpl().toString(apiKey);
		
		Assert.assertEquals("{" + keyValue("APIKey","") + "}", serialized);
		
	}
	
	@Test
	public final void testDeserializeObject(){
		String serialized = "{" +
				keyValue("APIKey", "key1") + "," +
				keyValue("CreatedAt", "2013-11-12T19:08:01Z") + "," +
				keyValue("CustomStatus", "suspend") + "," +
				keyValue("ExpiredAt", "2013-11-12T19:09:01Z") + "," +
				keyValue("IsActive", true) + "," +
				keyValue("IsMaster", false) + "," +
				keyValue("IsSenderAllowed", true) + "," +
				keyValue("LastUpdateAt", "2013-11-12T19:10:01Z") + "," +
				keyValue("Name", "name1") + "," +
				keyValue("Runlevel", "Softlock") + "," +
				keyValue("ID", 1) +
				"}";
		
		TApiKey deserialized = new GsonDataTransformerImpl().fromString(serialized, TApiKey.class);
		
		Assert.assertEquals("key1", deserialized.getAPIKey());
		Assert.assertEquals("name1", deserialized.getName());
		Assert.assertEquals(createDate(2013, 11, 12, 19, 8, 1), deserialized.getCreatedAt());
		Assert.assertEquals(TCustomStatus.SUSPEND, deserialized.getCustomStatus());
		Assert.assertEquals(TRunLevel.SOFTLOCK, deserialized.getRunlevel());
		Assert.assertEquals(createDate(2013, 11, 12, 19, 9, 1), deserialized.getExpiredAt());
		Assert.assertEquals(true, deserialized.getIsActive());
		Assert.assertEquals(false, deserialized.getIsMaster());
		Assert.assertEquals(true, deserialized.getIsSenderAllowed());
		Assert.assertEquals(createDate(2013, 11, 12, 19, 10, 1), deserialized.getLastUpdateAt());
		Assert.assertEquals(new Long(1L), deserialized.getID());
		
	}
	
	@Test
	public final void testDeserializeNullValues(){
		String serialized = "{}";
		
		TApiKey deserialized = new GsonDataTransformerImpl().fromString(serialized, TApiKey.class);
		Assert.assertNull(deserialized.getAPIKey());
		Assert.assertNull(deserialized.getName());
		Assert.assertNull(deserialized.getCreatedAt());
		Assert.assertNull(deserialized.getCustomStatus());
		Assert.assertNull(deserialized.getRunlevel());
		Assert.assertNull(deserialized.getExpiredAt());
		Assert.assertNull(deserialized.getIsActive());
		Assert.assertNull(deserialized.getIsMaster());
		Assert.assertNull(deserialized.getIsSenderAllowed());
		Assert.assertNull(deserialized.getLastUpdateAt());
		Assert.assertNull(deserialized.getID());
	}
	
	@Test
	public final void testDeserializeBadEnumValue(){
		String serialized = "{" + keyValue("CustomStatus", "worng") + "}";
		
		TApiKey deserialized = new GsonDataTransformerImpl().fromString(serialized, TApiKey.class);
		Assert.assertNull(deserialized.getCustomStatus());
	}
	
	@Test(expected=JsonSyntaxException.class)
	public final void testDeserializeBadNumber(){
		String serialized = "{"  + keyValue("ID", "ABC") + "}";
		new GsonDataTransformerImpl().fromString(serialized, TApiKey.class);
	}
	
	@Test(expected=JsonParseException.class)
	public final void testDeserializeBadDate(){
		String serialized = "{"  + keyValue("CreatedAt", "2013-11-1219:08:01Z") + "}";
		new GsonDataTransformerImpl().fromString(serialized, TApiKey.class);
	}
	
	@Test
	public final void testDeserializeBadBoolean(){
		String serialized = "{"  + keyValue("IsMaster", "wrong") + "}";
		TApiKey deserialized = new GsonDataTransformerImpl().fromString(serialized, TApiKey.class);
		Assert.assertEquals(false, deserialized.getIsMaster());
	}
	
	@Test
	public final void testTypedListEmpty(){
		List<TApiKey> deserialized = new GsonDataTransformerImpl().typedList(Collections.EMPTY_LIST, TApiKey.class);
		Assert.assertTrue(deserialized.isEmpty());
	}
	
	@Test
	public final void testTypedListWithNull(){
		List<TApiKey> list = new GsonDataTransformerImpl().typedList(Collections.singletonList(null), TApiKey.class);
		Assert.assertTrue(list.isEmpty());
	}
	
	@Test
	public final void testTypedListNotEmpty(){
		String serialized1 = "{" +
				keyValue("APIKey", "key1") + "," +
				keyValue("CreatedAt", "2013-11-12T19:08:01Z") + "," +
				keyValue("CustomStatus", TCustomStatus.SUSPEND.toString()) + "," +
				keyValue("ExpiredAt", "2013-11-12T19:09:01Z") + "," +
				keyValue("IsActive", true) + "," +
				keyValue("IsMaster", false) + "," +
				keyValue("IsSenderAllowed", true) + "," +
				keyValue("LastUpdateAt", "2013-11-12T19:10:01Z") + "," +
				keyValue("Name", "name1") + "," +
				keyValue("Runlevel", TRunLevel.SOFTLOCK.toString()) + "," +
				keyValue("ID", 1) +
				"}";
		String serialized2 = "{" +
				keyValue("APIKey", "key1") + "," +
				keyValue("CreatedAt", "2013-11-12T19:08:01Z") + "," +
				keyValue("CustomStatus", TCustomStatus.SUSPEND.toString()) + "," +
				keyValue("ExpiredAt", "2013-11-12T19:09:01Z") + "," +
				keyValue("IsActive", true) + "," +
				keyValue("IsMaster", false) + "," +
				keyValue("IsSenderAllowed", true) + "," +
				keyValue("LastUpdateAt", "2013-11-12T19:10:01Z") + "," +
				keyValue("Name", "name1") + "," +
				keyValue("Runlevel", TRunLevel.SOFTLOCK.toString()) + "," +
				keyValue("ID", 1) +
				"}";
		GsonDataTransformerImpl gsonDataTransformerImpl = new GsonDataTransformerImpl();
		JsonElement apiKeyData1 = gsonDataTransformerImpl.fromString(serialized1, JsonElement.class);
		JsonElement apiKeyData2 = gsonDataTransformerImpl.fromString(serialized2, JsonElement.class);
		List<TApiKey> deserialized = gsonDataTransformerImpl.typedList(Arrays.asList(apiKeyData1, apiKeyData2), TApiKey.class);
		Assert.assertEquals(2, deserialized.size());
	}
	
	@Test(expected=NullPointerException.class)
	public final void testTypedListNull(){
		new GsonDataTransformerImpl().typedList(null, TApiKey.class);
	}
	
	@Test
	public final void testSerializeObjectNoAnno(){
		ApiKeyNoAnno apiKey = 
				new ApiKeyNoAnno()
				.setAPIKey("key1")
				.setCreatedAt(createDate(2013, 11, 12, 19, 8, 1))
				.setCustomStatus(TCustomStatus.DOWN)
				.setExpiredAt(createDate(2013, 11, 12, 19, 9, 1))
				.setID(1L)
				.setIsActive(true)
				.setIsMaster(false)
				.setIsSenderAllowed(true)
				.setLastUpdateAt(createDate(2013, 11, 12, 19, 10, 1))
				.setName("name1")
				.setRunlevel(TRunLevel.NORMAL);
		String serialized = new GsonDataTransformerImpl().toString(apiKey);
		
		Assert.assertEquals("{" +
				keyValue("APIKey", apiKey.getAPIKey()) + "," +
				keyValue("CreatedAt", "2013-11-12T19:08:01Z") + "," +
				keyValue("CustomStatus", "down") + "," +
				keyValue("ExpiredAt", "2013-11-12T19:09:01Z") + "," +
				keyValue("ID", 1) + "," +
				keyValue("IsActive", true) + "," +
				keyValue("IsMaster", false) + "," +
				keyValue("IsSenderAllowed", true) + "," +
				keyValue("LastUpdateAt", "2013-11-12T19:10:01Z") + "," +
				keyValue("Name", apiKey.getName()) + "," +
				keyValue("Runlevel", "Normal") +
				"}", serialized);
		
	}
	
	@Test
	public final void testDeserializeObjectNoAnno(){
		String serialized = "{" +
				keyValue("APIKey", "key1") + "," +
				keyValue("CreatedAt", "2013-11-12T19:08:01Z") + "," +
				keyValue("CustomStatus", "suspend") + "," +
				keyValue("ExpiredAt", "2013-11-12T19:09:01Z") + "," +
				keyValue("IsActive", true) + "," +
				keyValue("IsMaster", false) + "," +
				keyValue("IsSenderAllowed", true) + "," +
				keyValue("LastUpdateAt", "2013-11-12T19:10:01Z") + "," +
				keyValue("Name", "name1") + "," +
				keyValue("Runlevel", "Softlock") + "," +
				keyValue("ID", 1) +
				"}";
		
		ApiKeyNoAnno deserialized = new GsonDataTransformerImpl().fromString(serialized, ApiKeyNoAnno.class);
		
		Assert.assertEquals("key1", deserialized.getAPIKey());
		Assert.assertEquals("name1", deserialized.getName());
		Assert.assertEquals(createDate(2013, 11, 12, 19, 8, 1), deserialized.getCreatedAt());
		Assert.assertEquals(TCustomStatus.SUSPEND, deserialized.getCustomStatus());
		Assert.assertEquals(TRunLevel.SOFTLOCK, deserialized.getRunlevel());
		Assert.assertEquals(createDate(2013, 11, 12, 19, 9, 1), deserialized.getExpiredAt());
		Assert.assertEquals(true, deserialized.getIsActive());
		Assert.assertEquals(false, deserialized.getIsMaster());
		Assert.assertEquals(true, deserialized.getIsSenderAllowed());
		Assert.assertEquals(createDate(2013, 11, 12, 19, 10, 1), deserialized.getLastUpdateAt());
		Assert.assertEquals(new Long(1L), deserialized.getID());
	}
	
	public static class TestObject{
		@Component(name="test:id", type = "AnsiString")
		private String id;
	}
	


	@Test
	public final void testDeserializeCustomFieldName(){
		String serialized = "{" +
				keyValue("test:id", "test") +
				"}";
		
		TestObject deserialized = new GsonDataTransformerImpl().fromString(serialized, TestObject.class);
		
		Assert.assertEquals("test", deserialized.id);
	}
	
	enum TestEnum{
		@EnumValue("a:b") A_B, AB
	}
	
	@Test
	public final void testSerializeEnumValues(){
		Assert.assertEquals("\"a:b\"", new GsonDataTransformerImpl().toString(TestEnum.A_B));
		Assert.assertEquals("\"AB\"", new GsonDataTransformerImpl().toString(TestEnum.AB));
		Assert.assertEquals("null", new GsonDataTransformerImpl().toString(null));
	}
	
	@Test
	public final void testDeserializeEnumValues(){
		
		GsonDataTransformerImpl impl = new GsonDataTransformerImpl();
		
		Assert.assertEquals(TestEnum.A_B, impl.fromString("\"a:b\"", TestEnum.class));
		Assert.assertEquals(TestEnum.AB, impl.fromString("AB", TestEnum.class));
		Assert.assertEquals(TestEnum.AB, impl.fromString("\"AB\"", TestEnum.class));
		Assert.assertNull(impl.fromString("null", TestEnum.class));
	}
	
	@Test
	public final void testSerializeCustomFieldName(){
		TestObject obj = new TestObject();
		obj.id = "idtest";
		
		Assert.assertEquals("{" +
				keyValue("test:id", "idtest") +
				"}", new GsonDataTransformerImpl().toString(obj));
	}
	
	private String keyValue(final String key, final String value){
		return "\"" + key + "\":\"" + value + "\"";
	}
	
	private String keyValue(final String key, final boolean value){
		return "\"" + key + "\":" + value;
	}
	
	private String keyValue(final String key, final Number value){
		return "\"" + key + "\":" + value;
	}
	
	private Date createDate(final int year, final int month, final int day, final int hour, final int minute, final int second){
		Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		instance.set(year, month - 1, day, hour, minute, second);
		instance.set(Calendar.MILLISECOND, 0);
		return instance.getTime();
	}
	
}
