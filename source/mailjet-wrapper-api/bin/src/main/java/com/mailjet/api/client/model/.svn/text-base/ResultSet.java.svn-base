package com.mailjet.api.client.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Class representing result data returned by the MailJet API. The result could
 * be iterated upon and the returned results are homogeneous.
 * 
 * @author MailJet
 * 
 * @param <ElementType>
 *            type of the elements in the container
 */
public final class ResultSet<ElementType> implements Iterable<ElementType> {
	private List<ElementType> Data;
	private int Count;
	private int Total;

	/**
	 * Builds a result set from a list.
	 * 
	 * @param items
	 *            not null, items in the result set
	 * @param count
	 *            count of items in the result set
	 * @param total
	 *            total number of items available on the server that are
	 *            eligable for the result but are not returned due to limit
	 *            and/or offset
	 */
	public ResultSet(final List<ElementType> items, final int count,
			final int total) {
		Data = new ArrayList<ElementType>(items);
		Count = count;
		Total = total;
	}

	public Iterator<ElementType> iterator() {
		return Data.iterator();
	}

	/**
	 * Gets the item count returned by the server.
	 * 
	 * @return item count
	 */
	public int getCount() {
		return Count;
	}

	/**
	 * Total number of items available on the server that are eligable for the
	 * result but are not returned due to limit and/or offset.
	 * 
	 * @return number returned by server
	 */
	public int getTotal() {
		return Total;
	}

	/**
	 * Tests if the result set is empty.
	 * 
	 * @return true if empty, false otherwise
	 */
	public boolean isEmpty() {
		return Count == 0;
	}

}
