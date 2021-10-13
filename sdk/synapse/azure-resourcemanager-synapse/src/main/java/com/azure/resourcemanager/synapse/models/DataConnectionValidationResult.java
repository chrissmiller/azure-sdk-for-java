// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The result returned from a data connection validation request. */
@Fluent
public final class DataConnectionValidationResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DataConnectionValidationResult.class);

    /*
     * A message which indicates a problem in data connection validation.
     */
    @JsonProperty(value = "errorMessage")
    private String errorMessage;

    /**
     * Get the errorMessage property: A message which indicates a problem in data connection validation.
     *
     * @return the errorMessage value.
     */
    public String errorMessage() {
        return this.errorMessage;
    }

    /**
     * Set the errorMessage property: A message which indicates a problem in data connection validation.
     *
     * @param errorMessage the errorMessage value to set.
     * @return the DataConnectionValidationResult object itself.
     */
    public DataConnectionValidationResult withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}