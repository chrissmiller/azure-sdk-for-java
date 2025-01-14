// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.machinelearning.fluent.QuotasClient;
import com.azure.resourcemanager.machinelearning.fluent.models.ResourceQuotaInner;
import com.azure.resourcemanager.machinelearning.fluent.models.UpdateWorkspaceQuotasResultInner;
import com.azure.resourcemanager.machinelearning.models.QuotaUpdateParameters;
import com.azure.resourcemanager.machinelearning.models.Quotas;
import com.azure.resourcemanager.machinelearning.models.ResourceQuota;
import com.azure.resourcemanager.machinelearning.models.UpdateWorkspaceQuotasResult;

public final class QuotasImpl implements Quotas {
    private static final ClientLogger LOGGER = new ClientLogger(QuotasImpl.class);

    private final QuotasClient innerClient;

    private final com.azure.resourcemanager.machinelearning.MachineLearningManager serviceManager;

    public QuotasImpl(
        QuotasClient innerClient, com.azure.resourcemanager.machinelearning.MachineLearningManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public UpdateWorkspaceQuotasResult update(String location, QuotaUpdateParameters parameters) {
        UpdateWorkspaceQuotasResultInner inner = this.serviceClient().update(location, parameters);
        if (inner != null) {
            return new UpdateWorkspaceQuotasResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<UpdateWorkspaceQuotasResult> updateWithResponse(
        String location, QuotaUpdateParameters parameters, Context context) {
        Response<UpdateWorkspaceQuotasResultInner> inner =
            this.serviceClient().updateWithResponse(location, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new UpdateWorkspaceQuotasResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<ResourceQuota> list(String location) {
        PagedIterable<ResourceQuotaInner> inner = this.serviceClient().list(location);
        return Utils.mapPage(inner, inner1 -> new ResourceQuotaImpl(inner1, this.manager()));
    }

    public PagedIterable<ResourceQuota> list(String location, Context context) {
        PagedIterable<ResourceQuotaInner> inner = this.serviceClient().list(location, context);
        return Utils.mapPage(inner, inner1 -> new ResourceQuotaImpl(inner1, this.manager()));
    }

    private QuotasClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.machinelearning.MachineLearningManager manager() {
        return this.serviceManager;
    }
}
