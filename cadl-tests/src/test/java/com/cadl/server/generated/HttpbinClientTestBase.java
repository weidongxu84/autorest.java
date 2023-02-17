// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.cadl.server.generated;

import com.azure.core.http.HttpClient;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.test.TestBase;
import com.azure.core.test.TestMode;
import com.azure.core.util.Configuration;
import com.cadl.server.ContosoClient;
import com.cadl.server.ContosoClientBuilder;
import com.cadl.server.HttpbinClient;
import com.cadl.server.HttpbinClientBuilder;

class HttpbinClientTestBase extends TestBase {
    protected HttpbinClient httpbinClient;

    protected ContosoClient contosoClient;

    @Override
    protected void beforeTest() {
        HttpbinClientBuilder httpbinClientbuilder =
                new HttpbinClientBuilder()
                        .domain(Configuration.getGlobalConfiguration().get("DOMAIN", "httpbin"))
                        .tld(Configuration.getGlobalConfiguration().get("TLD", "org"))
                        .httpClient(HttpClient.createDefault())
                        .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.PLAYBACK) {
            httpbinClientbuilder.httpClient(interceptorManager.getPlaybackClient());
        } else if (getTestMode() == TestMode.RECORD) {
            httpbinClientbuilder.addPolicy(interceptorManager.getRecordPolicy());
        }
        httpbinClient = httpbinClientbuilder.buildClient();

        ContosoClientBuilder contosoClientbuilder =
                new ContosoClientBuilder()
                        .endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT", "endpoint"))
                        .httpClient(HttpClient.createDefault())
                        .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.PLAYBACK) {
            contosoClientbuilder.httpClient(interceptorManager.getPlaybackClient());
        } else if (getTestMode() == TestMode.RECORD) {
            contosoClientbuilder.addPolicy(interceptorManager.getRecordPolicy());
        }
        contosoClient = contosoClientbuilder.buildClient();
    }
}
