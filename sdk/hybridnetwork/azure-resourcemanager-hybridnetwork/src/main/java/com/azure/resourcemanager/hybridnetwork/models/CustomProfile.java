// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Specifies the custom settings for the virtual machine. */
@Fluent
public final class CustomProfile {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CustomProfile.class);

    /*
     * Path for metadata configuration.
     */
    @JsonProperty(value = "metadataConfigurationPath")
    private String metadataConfigurationPath;

    /**
     * Get the metadataConfigurationPath property: Path for metadata configuration.
     *
     * @return the metadataConfigurationPath value.
     */
    public String metadataConfigurationPath() {
        return this.metadataConfigurationPath;
    }

    /**
     * Set the metadataConfigurationPath property: Path for metadata configuration.
     *
     * @param metadataConfigurationPath the metadataConfigurationPath value to set.
     * @return the CustomProfile object itself.
     */
    public CustomProfile withMetadataConfigurationPath(String metadataConfigurationPath) {
        this.metadataConfigurationPath = metadataConfigurationPath;
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