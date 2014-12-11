package com.mailjet.api.client;

import com.mailjet.api.client.model.MailJetKeyProperty;
import com.mailjet.api.client.model.MailJetResourceFilter;
import com.mailjet.api.client.model.MailJetResourceProperty;
import com.mailjet.api.client.model.ResultSet;

/**
 * Represents an executable request to MailJet API.
 * 
 * @author MailJet
 * 
 * @param <ResultType>
 *            type of the object returned by the call
 */
public interface MailJetApiCall<ResultType> {

	/**
	 * Invokes the requested operation on the MailJet API.
	 * 
	 * @return not null, result returned by the server
	 * 
	 * @throws MailJetApiCallException
	 *             thrown if the server response indicated an error during the
	 *             request processing: wrong input data, server error, etc.
	 */
	ResultType execute() throws MailJetApiCallException;

	/**
	 * Represents a call used to retrieve data identified by id from MailJet
	 * API.
	 * 
	 * @author MailJet
	 * 
	 * @param <ResultType>
	 *            result type of the response
	 */
	public interface RetrieveById<ResultType> extends
			MailJetApiCall<ResultType> {
		/**
		 * Sets the id of the object that will be impacted by the call.
		 * 
		 * @param property
		 *            not null, the key property that the identifier value
		 *            relates to to
		 * 
		 * @param id
		 *            not null, the id value;
		 * @param <DataType>
		 *            type of the identifier value
		 * 
		 * @return not null, call object parameterized with the object id
		 * @throws MailJetApiCallException
		 *             thrown if the supplied value is not valid id, e.g. null
		 * 
		 */
		<DataType> MailJetApiCall<ResultType> identifiedBy(
				MailJetKeyProperty<ResultType, DataType> property, DataType id)
				throws MailJetApiCallException;
	}

	/**
	 * Represents a call used to retrieve data by specifying filter criteria and
	 * with option to sort on specific data property. By default no limit or
	 * offset is applied.
	 * 
	 * @author MailJet
	 * 
	 * @param <ResultType>
	 *            result type of the response
	 */
	public interface Retrieve<ResultType> extends
			MailJetApiCall<ResultSet<ResultType>> {

		/**
		 * Sets a criteria that the data retrieved by the MailJet API must
		 * match. Subsequent invocation of this method on same
		 * {@link MailJetApiCall} instance and {@link MailJetResourceFilter}
		 * instance will replace previously specified value. Attempting to set
		 * filter twice or attempting to set reserved parameter name would
		 * result in an exception.
		 * 
		 * @param filter
		 *            not null, data property upon which the filter is applied
		 * @param value
		 *            not null, the value which the property must have
		 * 
		 * @param <FilterValueDataType>
		 *            result type of the response
		 * 
		 * @return not null, this object
		 * @throws MailJetApiCallException
		 *             thrown if at least one of the supplied parameters is not
		 *             valid id, e.g. null, already set, trying to set reserved
		 *             parameter value such as limit, offset, etc.
		 */
		<FilterValueDataType> Retrieve<ResultType> filterBy(
				MailJetResourceFilter<ResultType, FilterValueDataType> filter,
				FilterValueDataType value) throws MailJetApiCallException;

		/**
		 * Sets that data should be sorted ascending by the specified property.
		 * Subsequent invocation of a sorting method on same
		 * {@link MailJetApiCall} instance will override any previous sorting.
		 * 
		 * @param property
		 *            not null, the property should be used to sort the data
		 * @return not null, this object
		 * @throws MailJetApiCallException
		 *             thrown if the specified property is not valid, e.g. null
		 */
		Retrieve<ResultType> sortAscBy(
				MailJetResourceProperty<ResultType, ?> property)
				throws MailJetApiCallException;

		/**
		 * Sets that data should be sorted descending by the specified property.
		 * Subsequent invocation of a sorting method on same
		 * {@link MailJetApiCall} instance will override any previous sorting.
		 * 
		 * @param property
		 *            not null, the property should be used to sort the data
		 * @return not null, this object
		 * @throws MailJetApiCallException
		 *             thrown if the specified property is not valid, e.g. null
		 */
		Retrieve<ResultType> sortDescBy(
				MailJetResourceProperty<ResultType, ?> property)
				throws MailJetApiCallException;

		/**
		 * Sets the maximum count of MailJet API data objects that should be
		 * returned for this request. Defaults to 'no limit'. Subsequent
		 * invocations of this method on same {@link MailJetApiCall} instance
		 * will override previous value if set. Valid values are any positive
		 * integers or -1 meaning 'no limit'.
		 * 
		 * @param value
		 *            the limit value, use negative to disable limit
		 * @return not null, this object
		 * @throws MailJetApiCallException
		 *             thrown if the specified value is not valid
		 */
		Retrieve<ResultType> limitBy(int value) throws MailJetApiCallException;

		/**
		 * Sets the number of MailJet API data objects that should be skipped
		 * from the beginning of the result set. Defaults to '0'. Subsequent
		 * invocations of this method on same {@link MailJetApiCall} instance
		 * will override previous value if set. Valid values are any non
		 * negative integers.
		 * 
		 * @param value
		 *            the offset value, use negative to disable limit
		 * @return not null, this object
		 * @throws MailJetApiCallException
		 *             thrown if the specified value is not valid
		 */
		Retrieve<ResultType> offsetBy(int value) throws MailJetApiCallException;

	}

	/**
	 * Represents a call used to update existing data through MailJet API.
	 * 
	 * @author MailJet
	 * 
	 * @param <ResultType>
	 *            result type of the response
	 */
	public interface Update<ResultType> extends MailJetApiCall<ResultType> {
		/**
		 * Sets the id of the object that will be impacted by the call.
		 * 
		 * @param property
		 *            not null, the key property that the identifier value
		 *            relates to to
		 * 
		 * @param id
		 *            not null, the id value;
		 * @param <DataType>
		 *            type of the identifier value
		 * 
		 * @return not null, call object parameterized with the object id
		 * @throws MailJetApiCallException
		 *             thrown if the supplied value is not valid id, e.g. null
		 * 
		 */
		<DataType> Update<ResultType> identifiedBy(
				MailJetKeyProperty<ResultType, DataType> property, DataType id)
				throws MailJetApiCallException;

		/**
		 * Sets a new value for specific data property.
		 * 
		 * @param property
		 *            not null, data property to be updated
		 * @param value
		 *            new value to be applied to the specified property
		 * @param <PropertyDataType>
		 *            data type of the property that is being updated
		 * @return not null, this object
		 * @throws MailJetApiCallException
		 *             thrown if the specified property is not valid, e.g. null
		 */
		<PropertyDataType> Update<ResultType> property(
				MailJetResourceProperty<ResultType, PropertyDataType> property,
				PropertyDataType value) throws MailJetApiCallException;

	}

	/**
	 * Represents a call used to update existing data through MailJet API.
	 * 
	 * @author MailJet
	 * 
	 * @param <ResultType>
	 *            result type of the response
	 */
	public interface Create<ResultType> extends MailJetApiCall<ResultType> {
		/**
		 * Sets the value for specific data property.
		 * 
		 * @param property
		 *            not null, data property to be updated
		 * @param value
		 *            new value to be applied to the specified property
		 * @param <PropertyDataType>
		 *            data type of the property that is being set
		 * @return not null, this object
		 * @throws MailJetApiCallException
		 *             thrown if the specified property is not valid, e.g. null
		 */
		<PropertyDataType> Create<ResultType> property(
				MailJetResourceProperty<ResultType, PropertyDataType> property,
				PropertyDataType value) throws MailJetApiCallException;

	}

	/**
	 * Represents a call used to delete data identified by id from MailJet API.
	 * 
	 * @author MailJet
	 * 
	 * @param <ResultType>
	 *            result type of the response
	 */
	public interface Delete<ResultType> extends MailJetApiCall<Void> {
		/**
		 * Sets the id of the object that will be impacted by the call.
		 * 
		 * @param property
		 *            not null, the key property that the identifier value
		 *            relates to to
		 * 
		 * @param id
		 *            not null, the id value;
		 * @param <DataType>
		 *            type of the identifier value
		 * 
		 * @return not null, call object parameterized with the object id
		 * @throws MailJetApiCallException
		 *             thrown if the supplied value is not valid id, e.g. null
		 * 
		 */
		<DataType> Delete<ResultType> identifiedBy(
				MailJetKeyProperty<ResultType, DataType> property, DataType id)
				throws MailJetApiCallException;
	}

}
