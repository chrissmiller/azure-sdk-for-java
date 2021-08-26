// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.purview;

import com.azure.core.util.Context;

/** Samples for Accounts ListKeys. */
public final class AccountsListKeysSamples {
    /*
     * operationId: Accounts_ListKeys
     * api-version: 2021-07-01
     * x-ms-examples: Accounts_ListKeys
     */
    /**
     * Sample code: Accounts_ListKeys.
     *
     * @param manager Entry point to PurviewManager.
     */
    public static void accountsListKeys(com.azure.resourcemanager.purview.PurviewManager manager) {
        manager.accounts().listKeysWithResponse("SampleResourceGroup", "account1", Context.NONE);
    }
}