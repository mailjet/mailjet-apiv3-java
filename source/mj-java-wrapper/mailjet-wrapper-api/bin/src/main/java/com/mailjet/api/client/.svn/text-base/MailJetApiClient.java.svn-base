package com.mailjet.api.client;

/**
 * 
 * The interface representing the MailJet API wrapper. It could be used to send
 * requests to MailJet API and receive responses. The wrapper is factory of
 * executable call objects {@link MailJetApiCall} which can be parameterized
 * depending on the nature of the request being generated.
 * 
 * Implementations of that interface do not guarantee any thread safety!
 * 
 * @author MailJet
 * 
 */
public interface MailJetApiClient {
	/**
	 * Creates an executable call based on the MailJet API operation that is
	 * request.
	 * 
	 * @param service
	 *            not null, information of the operation that is requested
	 * @param <ResultType>
	 *            type of the output produced from calls to that service
	 * @param <CallType>
	 *            type of call to this service
	 * @return not null, a call object that could be parameterized before
	 *         execution
	 * @throws MailJetApiCallException
	 *             thrown if method was not specified(null value was passed)
	 */
	<ResultType, CallType extends MailJetApiCall<ResultType>> CallType createCall(
			MailJetApiService<CallType> service)
			throws MailJetApiCallException;
}
