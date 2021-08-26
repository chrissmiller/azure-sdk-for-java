// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement;

import com.azure.core.util.Context;

/** Samples for TenantAccess ListByService. */
public final class TenantAccessListByServiceSamples {
    /*
     * operationId: TenantAccess_ListByService
     * api-version: 2020-12-01
     * x-ms-examples: ApiManagementListTenantAccess
     */
    /**
     * Sample code: ApiManagementListTenantAccess.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementListTenantAccess(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager.tenantAccess().listByService("rg1", "apimService1", null, Context.NONE);
    }
}