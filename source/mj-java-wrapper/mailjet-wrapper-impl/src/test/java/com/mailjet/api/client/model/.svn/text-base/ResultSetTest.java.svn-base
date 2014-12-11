package com.mailjet.api.client.model;

import java.util.Collections;
import java.util.NoSuchElementException;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for {@link ResultSet}
 * 
 * @author MailJet
 * 
 */
public class ResultSetTest {

	@Test
	public void testCreation() {
		Object item = new Object();
		int count = 1;
		int total = 5;
		ResultSet<Object> resultSet = new ResultSet<Object>(
				Collections.singletonList(item), count, total);
		Assert.assertEquals(count, resultSet.getCount());
		Assert.assertEquals(total, resultSet.getTotal());
		Assert.assertSame(item, resultSet.iterator().next());
		Assert.assertFalse(resultSet.isEmpty());
	}
	
	@Test
	public void testCreationEmpty() {
		int count = 0;
		int total = 5;
		ResultSet<Object> resultSet = new ResultSet<Object>(
				Collections.emptyList(), count, total);
		Assert.assertEquals(count, resultSet.getCount());
		Assert.assertEquals(total, resultSet.getTotal());
		Assert.assertTrue(resultSet.isEmpty());
	}
	
	
	@Test(expected=NoSuchElementException.class)
	public void testCreationIterateEmpty() {
		int count = 0;
		int total = 5;
		ResultSet<Object> resultSet = new ResultSet<Object>(
				Collections.emptyList(), count, total);
		Assert.assertEquals(count, resultSet.getCount());
		Assert.assertEquals(total, resultSet.getTotal());
		Assert.assertTrue(resultSet.isEmpty());
		
		resultSet.iterator().next();
	}

}
