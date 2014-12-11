package com.mailjet.api.client.impl;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import com.mailjet.api.client.MailJetApiCall;
import com.mailjet.api.client.MailJetApiCallException;
import com.mailjet.api.client.MailJetApiCallException.Error;
import com.mailjet.api.client.MailJetApiService;
import com.mailjet.api.client.config.MailJetClientConfiguration;
import com.mailjet.api.client.connect.MailJetConnectionProvider;
import com.mailjet.api.client.connect.MailJetConnectionProvider.MailJetApiCredentials;
import com.mailjet.api.client.connect.MailJetConnectionProvider.MailJetApiResponse;
import com.mailjet.api.client.model.MailJetResourceFilter;
import com.mailjet.api.client.model.MailJetResourceProperty;
import com.mailjet.api.client.model.ResultSet;
import com.mailjet.api.client.transform.DataTransformer;

/**
 * Implementation that get resource instances from MailJet API using filters.
 * 
 * @author MailJet
 * 
 * @param <CallResultType>
 *            type of the resource created
 */
final class RetrieveCallImpl<CallResultType> extends
		MailJetApiCallImpl<ResultSet<CallResultType>> implements
		MailJetApiCall.Retrieve<CallResultType> {

	private static final String ORDER_ASC = "ASC";
	private static final String ORDER_DESC = "DESC";
	private static final String SORT_ORDER_PARAM_NAME = "sort_order";
	private static final String SORT_PARAM_NAME = "sort";
	private static final String LIMIT_PARAM_NAME = "limit";
	private static final String OFFSET_PARAM_NAME = "offset";

	@SuppressWarnings("serial")
	private static final Set<String> RESERVED_PARAM_NAMES = new HashSet<String>() {
		{
			add(OFFSET_PARAM_NAME);
			add(LIMIT_PARAM_NAME);
			add(SORT_PARAM_NAME);
			add(SORT_ORDER_PARAM_NAME);
			add(STYLE_PARAM_NAME);
			add(FORMAT_PARAM_NAME);
		}
	};

	/**
	 * Constructor.
	 * 
	 * @param config
	 *            not null, client configuration
	 * @param dataMapper
	 *            not null, data mapper to use to map java objects to MailJet
	 *            API data format
	 * @param connectionProvider
	 *            not null, connection provider to MailJet API
	 * @param operation
	 *            not null, service to be invoked
	 */
	public RetrieveCallImpl(
			final MailJetClientConfiguration config,
			final MailJetConnectionProvider connectionProvider,
			final DataTransformer dataMapper,
			final MailJetApiService<?> operation) {
		super(config, connectionProvider, dataMapper, operation);
	}

	private Map<String, Object> filters = new LinkedHashMap<String, Object>();
	private int offset = 0;
	private int limit = -1;
	private MailJetResourceProperty<CallResultType,?> sortProperty = null;
	private boolean orderDesc = false;

	public MailJetApiCall.Retrieve<CallResultType> sortAscBy(
			final MailJetResourceProperty<CallResultType,?> property)
			throws MailJetApiCallException {
		assertThat(property != null,
				"You must specify non-null value as sort property.",
				Error.ClientMisuse);
		sortProperty = property;
		orderDesc = false;
		return this;
	}

	public MailJetApiCall.Retrieve<CallResultType> sortDescBy(
			final MailJetResourceProperty<CallResultType,?> property)
			throws MailJetApiCallException {
		assertThat(property != null,
				"You must specify non-null value as sort property.",
				Error.ClientMisuse);
		sortProperty = property;
		orderDesc = true;
		return this;
	}

	public MailJetApiCall.Retrieve<CallResultType> limitBy(final int value)
			throws MailJetApiCallException {
		assertThat(value > 0 || value == -1,
				"Limit must be positive integer or -1(no limit).",
				Error.ClientMisuse);
		this.limit = value;
		return this;
	}

	public MailJetApiCall.Retrieve<CallResultType> offsetBy(final int value)
			throws MailJetApiCallException {
		assertThat(value >= 0, "Offset must be non-negative integer.",
				Error.ClientMisuse);
		this.offset = value;
		return this;
	}

	public <DataType> MailJetApiCall.Retrieve<CallResultType> filterBy(
			final MailJetResourceFilter<CallResultType, DataType> objFilter,
			final DataType value) throws MailJetApiCallException {
		assertThat(objFilter != null,
				"You must specify non-null value as filter property.",
				Error.ClientMisuse);
		assertThat(objFilter.getName() != null,
				"You must specify non-null value for filter name.",
				Error.ClientMisuse);
//		assertThat(value != null, "You cannot filter with null value.",
//				Error.ClientMisuse);
		assertThat(!filters.containsKey(objFilter.getName()),
				"Value for filter already set.", Error.ClientMisuse);
		assertThat(!RESERVED_PARAM_NAMES.contains(objFilter.getName()),
				"Filter with specified name is not allowed.",
				Error.ClientMisuse);
		if(value != null) {
			filters.put(objFilter.getName(), value);
		}
		return this;
	}

	@Override
	protected URI buildURI() throws URISyntaxException,
			UnsupportedEncodingException {
		if (offset > 0) {
			this.filters.put(OFFSET_PARAM_NAME, String.valueOf(offset));
		}
		if (limit > 0) {
			this.filters.put(LIMIT_PARAM_NAME, String.valueOf(limit));
		}
		if (sortProperty != null) {
			this.filters.put(SORT_PARAM_NAME, sortProperty.getName());
			this.filters.put(SORT_ORDER_PARAM_NAME, orderDesc ? ORDER_DESC
					: ORDER_ASC);
		}
		return buildRequestURI(this.filters);
	}

	@Override
	protected MailJetApiResponse execute(
			final MailJetConnectionProvider connectionProvider,
			final DataTransformer transformer, final URI uri,
			final MailJetApiCredentials credentials)
			throws MailJetApiCallException {
		return connectionProvider.get(uri, credentials);
	}
	
	@Override
	protected boolean isSuccessfull(final int code) {
		return code == SUCCESS_OK;
	}
	
	@Override
	protected int maximumResponseObjects() {
		//return limit > 0 ? limit : Integer.MAX_VALUE; commented because metadata does not respect limit
		return Integer.MAX_VALUE;
	}

}
