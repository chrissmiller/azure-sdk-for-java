// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Pool change request. */
@Fluent
public final class PoolChangeRequest {
    /*
     * Resource id of the pool to move volume to
     */
    @JsonProperty(value = "newPoolResourceId", required = true)
    private String newPoolResourceId;

    /**
     * Get the newPoolResourceId property: Resource id of the pool to move volume to.
     *
     * @return the newPoolResourceId value.
     */
    public String newPoolResourceId() {
        return this.newPoolResourceId;
    }

    /**
     * Set the newPoolResourceId property: Resource id of the pool to move volume to.
     *
     * @param newPoolResourceId the newPoolResourceId value to set.
     * @return the PoolChangeRequest object itself.
     */
    public PoolChangeRequest withNewPoolResourceId(String newPoolResourceId) {
        this.newPoolResourceId = newPoolResourceId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (newPoolResourceId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property newPoolResourceId in model PoolChangeRequest"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(PoolChangeRequest.class);
}
