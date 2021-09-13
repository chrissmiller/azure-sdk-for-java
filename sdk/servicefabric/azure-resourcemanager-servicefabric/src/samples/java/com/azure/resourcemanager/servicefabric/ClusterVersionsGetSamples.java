// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric;

import com.azure.core.util.Context;

/** Samples for ClusterVersions Get. */
public final class ClusterVersionsGetSamples {
    /*
     * operationId: ClusterVersions_Get
     * api-version: 2021-06-01
     * x-ms-examples: Get cluster version
     */
    /**
     * Sample code: Get cluster version.
     *
     * @param manager Entry point to ServiceFabricManager.
     */
    public static void getClusterVersion(com.azure.resourcemanager.servicefabric.ServiceFabricManager manager) {
        manager.clusterVersions().getWithResponse("eastus", "6.1.480.9494", Context.NONE);
    }
}