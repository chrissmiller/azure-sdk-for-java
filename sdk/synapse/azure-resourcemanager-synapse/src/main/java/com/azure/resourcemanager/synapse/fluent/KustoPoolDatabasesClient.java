// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.synapse.fluent.models.DatabaseInner;

/** An instance of this class provides access to all the operations defined in KustoPoolDatabasesClient. */
public interface KustoPoolDatabasesClient {
    /**
     * Returns the list of databases of the given Kusto pool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list Kusto databases operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DatabaseInner> listByKustoPool(String resourceGroupName, String workspaceName, String kustoPoolName);

    /**
     * Returns the list of databases of the given Kusto pool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list Kusto databases operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DatabaseInner> listByKustoPool(
        String resourceGroupName, String workspaceName, String kustoPoolName, Context context);

    /**
     * Returns a database.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param databaseName The name of the database in the Kusto pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class representing a Kusto database.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DatabaseInner get(String resourceGroupName, String workspaceName, String kustoPoolName, String databaseName);

    /**
     * Returns a database.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param databaseName The name of the database in the Kusto pool.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class representing a Kusto database.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DatabaseInner> getWithResponse(
        String resourceGroupName, String workspaceName, String kustoPoolName, String databaseName, Context context);

    /**
     * Creates or updates a database.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param databaseName The name of the database in the Kusto pool.
     * @param parameters The database parameters supplied to the CreateOrUpdate operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class representing a Kusto database.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<DatabaseInner>, DatabaseInner> beginCreateOrUpdate(
        String resourceGroupName,
        String workspaceName,
        String kustoPoolName,
        String databaseName,
        DatabaseInner parameters);

    /**
     * Creates or updates a database.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param databaseName The name of the database in the Kusto pool.
     * @param parameters The database parameters supplied to the CreateOrUpdate operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class representing a Kusto database.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<DatabaseInner>, DatabaseInner> beginCreateOrUpdate(
        String resourceGroupName,
        String workspaceName,
        String kustoPoolName,
        String databaseName,
        DatabaseInner parameters,
        Context context);

    /**
     * Creates or updates a database.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param databaseName The name of the database in the Kusto pool.
     * @param parameters The database parameters supplied to the CreateOrUpdate operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class representing a Kusto database.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DatabaseInner createOrUpdate(
        String resourceGroupName,
        String workspaceName,
        String kustoPoolName,
        String databaseName,
        DatabaseInner parameters);

    /**
     * Creates or updates a database.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param databaseName The name of the database in the Kusto pool.
     * @param parameters The database parameters supplied to the CreateOrUpdate operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class representing a Kusto database.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DatabaseInner createOrUpdate(
        String resourceGroupName,
        String workspaceName,
        String kustoPoolName,
        String databaseName,
        DatabaseInner parameters,
        Context context);

    /**
     * Updates a database.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param databaseName The name of the database in the Kusto pool.
     * @param parameters The database parameters supplied to the Update operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class representing a Kusto database.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<DatabaseInner>, DatabaseInner> beginUpdate(
        String resourceGroupName,
        String workspaceName,
        String kustoPoolName,
        String databaseName,
        DatabaseInner parameters);

    /**
     * Updates a database.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param databaseName The name of the database in the Kusto pool.
     * @param parameters The database parameters supplied to the Update operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class representing a Kusto database.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<DatabaseInner>, DatabaseInner> beginUpdate(
        String resourceGroupName,
        String workspaceName,
        String kustoPoolName,
        String databaseName,
        DatabaseInner parameters,
        Context context);

    /**
     * Updates a database.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param databaseName The name of the database in the Kusto pool.
     * @param parameters The database parameters supplied to the Update operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class representing a Kusto database.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DatabaseInner update(
        String resourceGroupName,
        String workspaceName,
        String kustoPoolName,
        String databaseName,
        DatabaseInner parameters);

    /**
     * Updates a database.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param databaseName The name of the database in the Kusto pool.
     * @param parameters The database parameters supplied to the Update operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class representing a Kusto database.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DatabaseInner update(
        String resourceGroupName,
        String workspaceName,
        String kustoPoolName,
        String databaseName,
        DatabaseInner parameters,
        Context context);

    /**
     * Deletes the database with the given name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param databaseName The name of the database in the Kusto pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String workspaceName, String kustoPoolName, String databaseName);

    /**
     * Deletes the database with the given name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param databaseName The name of the database in the Kusto pool.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String workspaceName, String kustoPoolName, String databaseName, Context context);

    /**
     * Deletes the database with the given name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param databaseName The name of the database in the Kusto pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String workspaceName, String kustoPoolName, String databaseName);

    /**
     * Deletes the database with the given name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param kustoPoolName The name of the Kusto pool.
     * @param databaseName The name of the database in the Kusto pool.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(
        String resourceGroupName, String workspaceName, String kustoPoolName, String databaseName, Context context);
}