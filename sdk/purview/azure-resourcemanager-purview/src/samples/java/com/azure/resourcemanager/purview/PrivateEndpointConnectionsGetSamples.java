// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.purview;

import com.azure.core.util.Context;

/** Samples for PrivateEndpointConnections Get. */
public final class PrivateEndpointConnectionsGetSamples {
    /*
     * operationId: PrivateEndpointConnections_Get
     * api-version: 2021-07-01
     * x-ms-examples: PrivateEndpointConnections_Get
     */
    /**
     * Sample code: PrivateEndpointConnections_Get.
     *
     * @param manager Entry point to PurviewManager.
     */
    public static void privateEndpointConnectionsGet(com.azure.resourcemanager.purview.PurviewManager manager) {
        manager
            .privateEndpointConnections()
            .getWithResponse("SampleResourceGroup", "account1", "privateEndpointConnection1", Context.NONE);
    }
}