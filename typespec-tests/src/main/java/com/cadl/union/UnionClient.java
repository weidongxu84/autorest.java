// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.cadl.union;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.core.util.polling.PollOperationDetails;
import com.azure.core.util.polling.SyncPoller;
import com.cadl.union.implementation.UnionFlattenOpsImpl;
import com.cadl.union.implementation.models.SendLongRequest;
import com.cadl.union.implementation.models.SendRequest;
import com.cadl.union.models.Result;
import com.cadl.union.models.SendLongOptions;
import com.cadl.union.models.User;

/**
 * Initializes a new instance of the synchronous UnionClient type.
 */
@ServiceClient(builder = UnionClientBuilder.class)
public final class UnionClient {
    @Generated
    private final UnionFlattenOpsImpl serviceClient;

    /**
     * Initializes an instance of UnionClient class.
     * 
     * @param serviceClient the service client implementation.
     */
    @Generated
    UnionClient(UnionFlattenOpsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * The send operation.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     user (Optional): {
     *         user: String (Required)
     *     }
     *     input: BinaryData (Required)
     * }
     * }</pre>
     * 
     * @param id The id parameter.
     * @param sendRequest The sendRequest parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> sendWithResponse(String id, BinaryData sendRequest, RequestOptions requestOptions) {
        return this.serviceClient.sendWithResponse(id, sendRequest, requestOptions);
    }

    /**
     * The sendLong operation.
     * <p><strong>Query Parameters</strong></p>
     * <table border="1">
     * <caption>Query Parameters</caption>
     * <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     * <tr><td>filter</td><td>String</td><td>No</td><td>The filter parameter</td></tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     user (Optional): {
     *         user: String (Required)
     *     }
     *     input: String (Required)
     *     dataInt: int (Required)
     *     dataUnion: BinaryData (Optional)
     *     dataLong: Long (Optional)
     *     data_float: Double (Optional)
     * }
     * }</pre>
     * 
     * @param id The id parameter.
     * @param sendLongRequest The sendLongRequest parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> sendLongWithResponse(String id, BinaryData sendLongRequest, RequestOptions requestOptions) {
        return this.serviceClient.sendLongWithResponse(id, sendLongRequest, requestOptions);
    }

    /**
     * The get operation.
     * <p><strong>Query Parameters</strong></p>
     * <table border="1">
     * <caption>Query Parameters</caption>
     * <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     * <tr><td>data</td><td>BinaryData</td><td>No</td><td>The data parameter</td></tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> getWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.getWithResponse(requestOptions);
    }

    /**
     * A long-running remote procedure call (RPC) operation.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     id: String (Required)
     *     status: String(NotStarted/Running/Succeeded/Failed/Canceled) (Required)
     *     error (Optional): {
     *         code: String (Required)
     *         message: String (Required)
     *         target: String (Optional)
     *         details (Optional): [
     *             (recursive schema, see above)
     *         ]
     *     }
     *     result (Optional): {
     *         name: String (Required)
     *         result (Optional): (recursive schema, see result above)
     *         data: BinaryData (Required)
     *     }
     * }
     * }</pre>
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link SyncPoller} for polling of provides status details for long running operations.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<BinaryData, BinaryData> beginGenerate(RequestOptions requestOptions) {
        return this.serviceClient.beginGenerate(requestOptions);
    }

    /**
     * The send operation.
     * 
     * @param id The id parameter.
     * @param input The input parameter.
     * @param user The user parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void send(String id, BinaryData input, User user) {
        // Generated convenience method for sendWithResponse
        RequestOptions requestOptions = new RequestOptions();
        SendRequest sendRequestObj = new SendRequest(input).setUser(user);
        BinaryData sendRequest = BinaryData.fromObject(sendRequestObj);
        sendWithResponse(id, sendRequest, requestOptions).getValue();
    }

    /**
     * The send operation.
     * 
     * @param id The id parameter.
     * @param input The input parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void send(String id, BinaryData input) {
        // Generated convenience method for sendWithResponse
        RequestOptions requestOptions = new RequestOptions();
        SendRequest sendRequestObj = new SendRequest(input);
        BinaryData sendRequest = BinaryData.fromObject(sendRequestObj);
        sendWithResponse(id, sendRequest, requestOptions).getValue();
    }

    /**
     * The sendLong operation.
     * 
     * @param options Options for sendLong API.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void sendLong(SendLongOptions options) {
        // Generated convenience method for sendLongWithResponse
        RequestOptions requestOptions = new RequestOptions();
        String id = options.getId();
        String filter = options.getFilter();
        SendLongRequest sendLongRequestObj
            = new SendLongRequest(options.getInput(), options.getDataInt()).setUser(options.getUser())
                .setDataUnion(options.getDataUnion())
                .setDataLong(options.getDataLong())
                .setDataFloat(options.getDataFloat());
        BinaryData sendLongRequest = BinaryData.fromObject(sendLongRequestObj);
        if (filter != null) {
            requestOptions.addQueryParam("filter", filter, false);
        }
        sendLongWithResponse(id, sendLongRequest, requestOptions).getValue();
    }

    /**
     * The get operation.
     * 
     * @param data The data parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void get(BinaryData data) {
        // Generated convenience method for getWithResponse
        RequestOptions requestOptions = new RequestOptions();
        if (data != null) {
            requestOptions.addQueryParam("data", String.valueOf(data), false);
        }
        getWithResponse(requestOptions).getValue();
    }

    /**
     * The get operation.
     * 
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void get() {
        // Generated convenience method for getWithResponse
        RequestOptions requestOptions = new RequestOptions();
        getWithResponse(requestOptions).getValue();
    }

    /**
     * A long-running remote procedure call (RPC) operation.
     * 
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of provides status details for long running operations.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<PollOperationDetails, Result> beginGenerate() {
        // Generated convenience method for beginGenerateWithModel
        RequestOptions requestOptions = new RequestOptions();
        return serviceClient.beginGenerateWithModel(requestOptions);
    }
}
