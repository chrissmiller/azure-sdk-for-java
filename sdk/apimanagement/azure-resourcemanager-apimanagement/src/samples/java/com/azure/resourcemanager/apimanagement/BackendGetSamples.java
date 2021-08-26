// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement;

import com.azure.core.util.Context;

/** Samples for Backend Get. */
public final class BackendGetSamples {
    /*
     * operationId: Backend_Get
     * api-version: 2020-12-01
     * x-ms-examples: ApiManagementGetBackend
     */
    /**
     * Sample code: ApiManagementGetBackend.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementGetBackend(com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager.backends().getWithResponse("rg1", "apimService1", "sfbackend", Context.NONE);
    }
}