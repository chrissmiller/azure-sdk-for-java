// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement;

import com.azure.core.util.Context;
import com.azure.resourcemanager.apimanagement.models.GroupContract;

/** Samples for Group Update. */
public final class GroupUpdateSamples {
    /*
     * operationId: Group_Update
     * api-version: 2020-12-01
     * x-ms-examples: ApiManagementUpdateGroup
     */
    /**
     * Sample code: ApiManagementUpdateGroup.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementUpdateGroup(com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        GroupContract resource =
            manager.groups().getWithResponse("rg1", "apimService1", "tempgroup", Context.NONE).getValue();
        resource.update().withDisplayName("temp group").withIfMatch("*").apply();
    }
}