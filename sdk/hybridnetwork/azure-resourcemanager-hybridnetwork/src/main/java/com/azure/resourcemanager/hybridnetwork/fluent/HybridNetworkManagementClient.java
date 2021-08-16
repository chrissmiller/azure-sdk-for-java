// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/** The interface for HybridNetworkManagementClient class. */
public interface HybridNetworkManagementClient {
    /**
     * Gets The ID of the target subscription.
     *
     * @return the subscriptionId value.
     */
    String getSubscriptionId();

    /**
     * Gets server parameter.
     *
     * @return the endpoint value.
     */
    String getEndpoint();

    /**
     * Gets Api Version.
     *
     * @return the apiVersion value.
     */
    String getApiVersion();

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    HttpPipeline getHttpPipeline();

    /**
     * Gets The default poll interval for long-running operation.
     *
     * @return the defaultPollInterval value.
     */
    Duration getDefaultPollInterval();

    /**
     * Gets the NetworkFunctionsClient object to access its operations.
     *
     * @return the NetworkFunctionsClient object.
     */
    NetworkFunctionsClient getNetworkFunctions();

    /**
     * Gets the DevicesClient object to access its operations.
     *
     * @return the DevicesClient object.
     */
    DevicesClient getDevices();

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    OperationsClient getOperations();

    /**
     * Gets the VendorsClient object to access its operations.
     *
     * @return the VendorsClient object.
     */
    VendorsClient getVendors();

    /**
     * Gets the VendorSkusClient object to access its operations.
     *
     * @return the VendorSkusClient object.
     */
    VendorSkusClient getVendorSkus();

    /**
     * Gets the VendorSkuPreviewsClient object to access its operations.
     *
     * @return the VendorSkuPreviewsClient object.
     */
    VendorSkuPreviewsClient getVendorSkuPreviews();

    /**
     * Gets the NetworkFunctionVendorsClient object to access its operations.
     *
     * @return the NetworkFunctionVendorsClient object.
     */
    NetworkFunctionVendorsClient getNetworkFunctionVendors();

    /**
     * Gets the NetworkFunctionVendorSkusClient object to access its operations.
     *
     * @return the NetworkFunctionVendorSkusClient object.
     */
    NetworkFunctionVendorSkusClient getNetworkFunctionVendorSkus();

    /**
     * Gets the VendorNetworkFunctionsClient object to access its operations.
     *
     * @return the VendorNetworkFunctionsClient object.
     */
    VendorNetworkFunctionsClient getVendorNetworkFunctions();

    /**
     * Gets the RoleInstancesClient object to access its operations.
     *
     * @return the RoleInstancesClient object.
     */
    RoleInstancesClient getRoleInstances();
}