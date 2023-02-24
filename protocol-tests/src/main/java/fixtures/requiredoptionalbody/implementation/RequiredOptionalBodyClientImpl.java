// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.requiredoptionalbody.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the RequiredOptionalBodyClient type. */
public final class RequiredOptionalBodyClientImpl {
    /** The proxy service used to perform REST calls. */
    private final RequiredOptionalBodyClientService service;

    /** server parameter. */
    private final String host;

    /**
     * Gets server parameter.
     *
     * @return the host value.
     */
    public String getHost() {
        return this.host;
    }

    /** The HTTP pipeline to send requests through. */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /** The serializer to serialize an object into a string. */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     *
     * @return the serializerAdapter value.
     */
    public SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /**
     * Initializes an instance of RequiredOptionalBodyClient client.
     *
     * @param host server parameter.
     */
    public RequiredOptionalBodyClientImpl(String host) {
        this(
                new HttpPipelineBuilder()
                        .policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy())
                        .build(),
                JacksonAdapter.createDefaultSerializerAdapter(),
                host);
    }

    /**
     * Initializes an instance of RequiredOptionalBodyClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param host server parameter.
     */
    public RequiredOptionalBodyClientImpl(HttpPipeline httpPipeline, String host) {
        this(httpPipeline, JacksonAdapter.createDefaultSerializerAdapter(), host);
    }

    /**
     * Initializes an instance of RequiredOptionalBodyClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param host server parameter.
     */
    public RequiredOptionalBodyClientImpl(HttpPipeline httpPipeline, SerializerAdapter serializerAdapter, String host) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.host = host;
        this.service =
                RestProxy.create(
                        RequiredOptionalBodyClientService.class, this.httpPipeline, this.getSerializerAdapter());
    }

    /**
     * The interface defining all the services for RequiredOptionalBodyClient to be used by the proxy service to perform
     * REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "RequiredOptionalBody")
    public interface RequiredOptionalBodyClientService {
        @Put("/body/required/object")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = ClientAuthenticationException.class,
                code = {401})
        @UnexpectedResponseExceptionType(
                value = ResourceNotFoundException.class,
                code = {404})
        @UnexpectedResponseExceptionType(
                value = ResourceModifiedException.class,
                code = {409})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<BinaryData>> createOrUpdateDeployment(
                @HostParam("$host") String host,
                @BodyParam("application/json") BinaryData deployment,
                @HeaderParam("Accept") String accept,
                RequestOptions requestOptions,
                Context context);

        @Put("/body/required/object")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = ClientAuthenticationException.class,
                code = {401})
        @UnexpectedResponseExceptionType(
                value = ResourceNotFoundException.class,
                code = {404})
        @UnexpectedResponseExceptionType(
                value = ResourceModifiedException.class,
                code = {409})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Response<BinaryData> createOrUpdateDeploymentSync(
                @HostParam("$host") String host,
                @BodyParam("application/json") BinaryData deployment,
                @HeaderParam("Accept") String accept,
                RequestOptions requestOptions,
                Context context);

        @Put("/body/optional/object")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = ClientAuthenticationException.class,
                code = {401})
        @UnexpectedResponseExceptionType(
                value = ResourceNotFoundException.class,
                code = {404})
        @UnexpectedResponseExceptionType(
                value = ResourceModifiedException.class,
                code = {409})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<BinaryData>> optionalObject(
                @HostParam("$host") String host,
                @HeaderParam("Accept") String accept,
                RequestOptions requestOptions,
                Context context);

        @Put("/body/optional/object")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = ClientAuthenticationException.class,
                code = {401})
        @UnexpectedResponseExceptionType(
                value = ResourceNotFoundException.class,
                code = {404})
        @UnexpectedResponseExceptionType(
                value = ResourceModifiedException.class,
                code = {409})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Response<BinaryData> optionalObjectSync(
                @HostParam("$host") String host,
                @HeaderParam("Accept") String accept,
                RequestOptions requestOptions,
                Context context);
    }

    /**
     * Creates or updates a deployment.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     deploymentId: String (Required)
     *     startDateTime: OffsetDateTime (Required)
     *     groupId: String (Required)
     *     deviceClassSubgroups (Optional): [
     *         String (Optional)
     *     ]
     *     isCanceled: Boolean (Optional)
     *     isRetried: Boolean (Optional)
     *     OperationFilterStatus: String(Running/NotStarted) (Required)
     *     tags (Optional): {
     *         String: String (Optional)
     *     }
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     deploymentId: String (Required)
     *     startDateTime: OffsetDateTime (Required)
     *     groupId: String (Required)
     *     deviceClassSubgroups (Optional): [
     *         String (Optional)
     *     ]
     *     isCanceled: Boolean (Optional)
     *     isRetried: Boolean (Optional)
     *     OperationFilterStatus: String(Running/NotStarted) (Required)
     *     tags (Optional): {
     *         String: String (Optional)
     *     }
     * }
     * }</pre>
     *
     * @param deployment The deployment properties.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return deployment metadata along with {@link Response} on successful completion of {@link Mono}.
     * @see <a href=https://docs.microsoft.com/azure/developer/java/sdk/overview>Rest API Documentation</a>
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> createOrUpdateDeploymentWithResponseAsync(
            BinaryData deployment, RequestOptions requestOptions) {
        final String accept = "application/json";
        return FluxUtil.withContext(
                context ->
                        service.createOrUpdateDeployment(this.getHost(), deployment, accept, requestOptions, context));
    }

    /**
     * Creates or updates a deployment.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     deploymentId: String (Required)
     *     startDateTime: OffsetDateTime (Required)
     *     groupId: String (Required)
     *     deviceClassSubgroups (Optional): [
     *         String (Optional)
     *     ]
     *     isCanceled: Boolean (Optional)
     *     isRetried: Boolean (Optional)
     *     OperationFilterStatus: String(Running/NotStarted) (Required)
     *     tags (Optional): {
     *         String: String (Optional)
     *     }
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     deploymentId: String (Required)
     *     startDateTime: OffsetDateTime (Required)
     *     groupId: String (Required)
     *     deviceClassSubgroups (Optional): [
     *         String (Optional)
     *     ]
     *     isCanceled: Boolean (Optional)
     *     isRetried: Boolean (Optional)
     *     OperationFilterStatus: String(Running/NotStarted) (Required)
     *     tags (Optional): {
     *         String: String (Optional)
     *     }
     * }
     * }</pre>
     *
     * @param deployment The deployment properties.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return deployment metadata along with {@link Response}.
     * @see <a href=https://docs.microsoft.com/azure/developer/java/sdk/overview>Rest API Documentation</a>
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> createOrUpdateDeploymentWithResponse(
            BinaryData deployment, RequestOptions requestOptions) {
        final String accept = "application/json";
        return service.createOrUpdateDeploymentSync(this.getHost(), deployment, accept, requestOptions, Context.NONE);
    }

    /**
     * optional object.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>Content-Type</td><td>String</td><td>No</td><td>The content type. Allowed values: "application/json".</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addHeader}
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     deploymentId: String (Required)
     *     startDateTime: OffsetDateTime (Required)
     *     groupId: String (Required)
     *     deviceClassSubgroups (Optional): [
     *         String (Optional)
     *     ]
     *     isCanceled: Boolean (Optional)
     *     isRetried: Boolean (Optional)
     *     OperationFilterStatus: String(Running/NotStarted) (Required)
     *     tags (Optional): {
     *         String: String (Optional)
     *     }
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     deploymentId: String (Required)
     *     startDateTime: OffsetDateTime (Required)
     *     groupId: String (Required)
     *     deviceClassSubgroups (Optional): [
     *         String (Optional)
     *     ]
     *     isCanceled: Boolean (Optional)
     *     isRetried: Boolean (Optional)
     *     OperationFilterStatus: String(Running/NotStarted) (Required)
     *     tags (Optional): {
     *         String: String (Optional)
     *     }
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return deployment metadata along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> optionalObjectWithResponseAsync(RequestOptions requestOptions) {
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.optionalObject(this.getHost(), accept, requestOptions, context));
    }

    /**
     * optional object.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>Content-Type</td><td>String</td><td>No</td><td>The content type. Allowed values: "application/json".</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addHeader}
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     deploymentId: String (Required)
     *     startDateTime: OffsetDateTime (Required)
     *     groupId: String (Required)
     *     deviceClassSubgroups (Optional): [
     *         String (Optional)
     *     ]
     *     isCanceled: Boolean (Optional)
     *     isRetried: Boolean (Optional)
     *     OperationFilterStatus: String(Running/NotStarted) (Required)
     *     tags (Optional): {
     *         String: String (Optional)
     *     }
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     deploymentId: String (Required)
     *     startDateTime: OffsetDateTime (Required)
     *     groupId: String (Required)
     *     deviceClassSubgroups (Optional): [
     *         String (Optional)
     *     ]
     *     isCanceled: Boolean (Optional)
     *     isRetried: Boolean (Optional)
     *     OperationFilterStatus: String(Running/NotStarted) (Required)
     *     tags (Optional): {
     *         String: String (Optional)
     *     }
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return deployment metadata along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> optionalObjectWithResponse(RequestOptions requestOptions) {
        final String accept = "application/json";
        return service.optionalObjectSync(this.getHost(), accept, requestOptions, Context.NONE);
    }
}
