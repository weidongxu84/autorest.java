// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.encode.bytes;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ServiceClientBuilder;
import com.azure.core.client.traits.ConfigurationTrait;
import com.azure.core.client.traits.HttpTrait;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.HttpPipelinePosition;
import com.azure.core.http.policy.AddDatePolicy;
import com.azure.core.http.policy.AddHeadersFromContextPolicy;
import com.azure.core.http.policy.AddHeadersPolicy;
import com.azure.core.http.policy.HttpLoggingPolicy;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.policy.HttpPolicyProviders;
import com.azure.core.http.policy.RequestIdPolicy;
import com.azure.core.http.policy.RetryOptions;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.util.ClientOptions;
import com.azure.core.util.Configuration;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.builder.ClientBuilderUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.serializer.JacksonAdapter;
import com.encode.bytes.implementation.BytesClientImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * A builder for creating a new instance of the BytesClient type.
 */
@ServiceClientBuilder(
    serviceClients = {
        QueryClient.class,
        PropertyClient.class,
        HeaderClient.class,
        RequestBodyClient.class,
        ResponseBodyClient.class,
        QueryAsyncClient.class,
        PropertyAsyncClient.class,
        HeaderAsyncClient.class,
        RequestBodyAsyncClient.class,
        ResponseBodyAsyncClient.class })
public final class BytesClientBuilder implements HttpTrait<BytesClientBuilder>, ConfigurationTrait<BytesClientBuilder> {
    @Generated
    private static final String SDK_NAME = "name";

    @Generated
    private static final String SDK_VERSION = "version";

    @Generated
    private static final Map<String, String> PROPERTIES = CoreUtils.getProperties("encode-bytes.properties");

    @Generated
    private final List<HttpPipelinePolicy> pipelinePolicies;

    /**
     * Create an instance of the BytesClientBuilder.
     */
    @Generated
    public BytesClientBuilder() {
        this.pipelinePolicies = new ArrayList<>();
    }

    /*
     * The HTTP pipeline to send requests through.
     */
    @Generated
    private HttpPipeline pipeline;

    /**
     * {@inheritDoc}.
     */
    @Generated
    @Override
    public BytesClientBuilder pipeline(HttpPipeline pipeline) {
        if (this.pipeline != null && pipeline == null) {
            LOGGER.atInfo().log("HttpPipeline is being set to 'null' when it was previously configured.");
        }
        this.pipeline = pipeline;
        return this;
    }

    /*
     * The HTTP client used to send the request.
     */
    @Generated
    private HttpClient httpClient;

    /**
     * {@inheritDoc}.
     */
    @Generated
    @Override
    public BytesClientBuilder httpClient(HttpClient httpClient) {
        this.httpClient = httpClient;
        return this;
    }

    /*
     * The logging configuration for HTTP requests and responses.
     */
    @Generated
    private HttpLogOptions httpLogOptions;

    /**
     * {@inheritDoc}.
     */
    @Generated
    @Override
    public BytesClientBuilder httpLogOptions(HttpLogOptions httpLogOptions) {
        this.httpLogOptions = httpLogOptions;
        return this;
    }

    /*
     * The client options such as application ID and custom headers to set on a request.
     */
    @Generated
    private ClientOptions clientOptions;

    /**
     * {@inheritDoc}.
     */
    @Generated
    @Override
    public BytesClientBuilder clientOptions(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
        return this;
    }

    /*
     * The retry options to configure retry policy for failed requests.
     */
    @Generated
    private RetryOptions retryOptions;

    /**
     * {@inheritDoc}.
     */
    @Generated
    @Override
    public BytesClientBuilder retryOptions(RetryOptions retryOptions) {
        this.retryOptions = retryOptions;
        return this;
    }

    /**
     * {@inheritDoc}.
     */
    @Generated
    @Override
    public BytesClientBuilder addPolicy(HttpPipelinePolicy customPolicy) {
        Objects.requireNonNull(customPolicy, "'customPolicy' cannot be null.");
        pipelinePolicies.add(customPolicy);
        return this;
    }

    /*
     * The configuration store that is used during construction of the service client.
     */
    @Generated
    private Configuration configuration;

    /**
     * {@inheritDoc}.
     */
    @Generated
    @Override
    public BytesClientBuilder configuration(Configuration configuration) {
        this.configuration = configuration;
        return this;
    }

    /*
     * The retry policy that will attempt to retry failed requests, if applicable.
     */
    @Generated
    private RetryPolicy retryPolicy;

    /**
     * Sets The retry policy that will attempt to retry failed requests, if applicable.
     * 
     * @param retryPolicy the retryPolicy value.
     * @return the BytesClientBuilder.
     */
    @Generated
    public BytesClientBuilder retryPolicy(RetryPolicy retryPolicy) {
        this.retryPolicy = retryPolicy;
        return this;
    }

    /**
     * Builds an instance of BytesClientImpl with the provided parameters.
     * 
     * @return an instance of BytesClientImpl.
     */
    @Generated
    private BytesClientImpl buildInnerClient() {
        this.validateClient();
        HttpPipeline localPipeline = (pipeline != null) ? pipeline : createHttpPipeline();
        BytesClientImpl client = new BytesClientImpl(localPipeline, JacksonAdapter.createDefaultSerializerAdapter());
        return client;
    }

    @Generated
    private void validateClient() {
        // This method is invoked from 'buildInnerClient'/'buildClient' method.
        // Developer can customize this method, to validate that the necessary conditions are met for the new client.
    }

    @Generated
    private HttpPipeline createHttpPipeline() {
        Configuration buildConfiguration
            = (configuration == null) ? Configuration.getGlobalConfiguration() : configuration;
        HttpLogOptions localHttpLogOptions = this.httpLogOptions == null ? new HttpLogOptions() : this.httpLogOptions;
        ClientOptions localClientOptions = this.clientOptions == null ? new ClientOptions() : this.clientOptions;
        List<HttpPipelinePolicy> policies = new ArrayList<>();
        String clientName = PROPERTIES.getOrDefault(SDK_NAME, "UnknownName");
        String clientVersion = PROPERTIES.getOrDefault(SDK_VERSION, "UnknownVersion");
        String applicationId = CoreUtils.getApplicationId(localClientOptions, localHttpLogOptions);
        policies.add(new UserAgentPolicy(applicationId, clientName, clientVersion, buildConfiguration));
        policies.add(new RequestIdPolicy());
        policies.add(new AddHeadersFromContextPolicy());
        HttpHeaders headers = CoreUtils.createHttpHeadersFromClientOptions(localClientOptions);
        if (headers != null) {
            policies.add(new AddHeadersPolicy(headers));
        }
        this.pipelinePolicies.stream()
            .filter(p -> p.getPipelinePosition() == HttpPipelinePosition.PER_CALL)
            .forEach(p -> policies.add(p));
        HttpPolicyProviders.addBeforeRetryPolicies(policies);
        policies.add(ClientBuilderUtil.validateAndGetRetryPolicy(retryPolicy, retryOptions, new RetryPolicy()));
        policies.add(new AddDatePolicy());
        this.pipelinePolicies.stream()
            .filter(p -> p.getPipelinePosition() == HttpPipelinePosition.PER_RETRY)
            .forEach(p -> policies.add(p));
        HttpPolicyProviders.addAfterRetryPolicies(policies);
        policies.add(new HttpLoggingPolicy(localHttpLogOptions));
        HttpPipeline httpPipeline = new HttpPipelineBuilder().policies(policies.toArray(new HttpPipelinePolicy[0]))
            .httpClient(httpClient)
            .clientOptions(localClientOptions)
            .build();
        return httpPipeline;
    }

    /**
     * Builds an instance of QueryAsyncClient class.
     * 
     * @return an instance of QueryAsyncClient.
     */
    @Generated
    public QueryAsyncClient buildQueryAsyncClient() {
        return new QueryAsyncClient(buildInnerClient().getQueries());
    }

    /**
     * Builds an instance of PropertyAsyncClient class.
     * 
     * @return an instance of PropertyAsyncClient.
     */
    @Generated
    public PropertyAsyncClient buildPropertyAsyncClient() {
        return new PropertyAsyncClient(buildInnerClient().getProperties());
    }

    /**
     * Builds an instance of HeaderAsyncClient class.
     * 
     * @return an instance of HeaderAsyncClient.
     */
    @Generated
    public HeaderAsyncClient buildHeaderAsyncClient() {
        return new HeaderAsyncClient(buildInnerClient().getHeaders());
    }

    /**
     * Builds an instance of RequestBodyAsyncClient class.
     * 
     * @return an instance of RequestBodyAsyncClient.
     */
    @Generated
    public RequestBodyAsyncClient buildRequestBodyAsyncClient() {
        return new RequestBodyAsyncClient(buildInnerClient().getRequestBodies());
    }

    /**
     * Builds an instance of ResponseBodyAsyncClient class.
     * 
     * @return an instance of ResponseBodyAsyncClient.
     */
    @Generated
    public ResponseBodyAsyncClient buildResponseBodyAsyncClient() {
        return new ResponseBodyAsyncClient(buildInnerClient().getResponseBodies());
    }

    /**
     * Builds an instance of QueryClient class.
     * 
     * @return an instance of QueryClient.
     */
    @Generated
    public QueryClient buildQueryClient() {
        return new QueryClient(buildInnerClient().getQueries());
    }

    /**
     * Builds an instance of PropertyClient class.
     * 
     * @return an instance of PropertyClient.
     */
    @Generated
    public PropertyClient buildPropertyClient() {
        return new PropertyClient(buildInnerClient().getProperties());
    }

    /**
     * Builds an instance of HeaderClient class.
     * 
     * @return an instance of HeaderClient.
     */
    @Generated
    public HeaderClient buildHeaderClient() {
        return new HeaderClient(buildInnerClient().getHeaders());
    }

    /**
     * Builds an instance of RequestBodyClient class.
     * 
     * @return an instance of RequestBodyClient.
     */
    @Generated
    public RequestBodyClient buildRequestBodyClient() {
        return new RequestBodyClient(buildInnerClient().getRequestBodies());
    }

    /**
     * Builds an instance of ResponseBodyClient class.
     * 
     * @return an instance of ResponseBodyClient.
     */
    @Generated
    public ResponseBodyClient buildResponseBodyClient() {
        return new ResponseBodyClient(buildInnerClient().getResponseBodies());
    }

    private static final ClientLogger LOGGER = new ClientLogger(BytesClientBuilder.class);
}
