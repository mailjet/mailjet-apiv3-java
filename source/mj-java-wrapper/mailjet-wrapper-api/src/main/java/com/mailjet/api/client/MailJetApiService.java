package com.mailjet.api.client;

import com.mailjet.api.client.model.ResourceOperationTypes;
import com.mailjet.api.client.model.metadata.Resource;

/**
 * Class representing service(resource + operation) provided by MailJet API.
 *
 * @author MailJet
 *
 * @param <CallType>
 *            type of the call produced for this method
 */
public final class MailJetApiService<CallType extends MailJetApiCall<?>> {
	private final ResourceOperationTypes operation;
	private final String name;
	private final Class<?> resourceClass;

	/**
	 * Constructor.
	 *
	 * @param resourceClass
	 *            not null, class of the MailJet API resource that the service
	 *            access
	 * @param operation
	 *            not null, the HTTP method used by this API service
	 */
	public MailJetApiService(final Class<?> resourceClass,
			final ResourceOperationTypes operation) {
		this.operation = operation;
		Resource annotation = resourceClass.getAnnotation(Resource.class);
		this.name = annotation != null ? annotation.name() : resourceClass.getSimpleName();
		this.resourceClass = resourceClass;
	}

	/**
	 * Gets the HTTP method used by this API service.
	 *
	 * @return not null
	 */
	public ResourceOperationTypes getOperation() {
		return operation;
	}

	/**
	 * Gets the name of the service.
	 *
	 * @return not null
	 */
	public String getName() {
		return name;
	}

	/**
	 * Gets the {@link Class} of the Java class mapped to the MailJet API
	 * resource.
	 *
	 * @return not null, the class
	 */
	public Class<?> getResourceClass() {
		return resourceClass;
	}

}
