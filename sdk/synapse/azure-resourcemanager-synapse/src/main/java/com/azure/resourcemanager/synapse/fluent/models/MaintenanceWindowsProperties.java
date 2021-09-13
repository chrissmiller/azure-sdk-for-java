// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.synapse.models.MaintenanceWindowTimeRange;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Maintenance windows resource properties. */
@Fluent
public final class MaintenanceWindowsProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MaintenanceWindowsProperties.class);

    /*
     * The timeRanges property.
     */
    @JsonProperty(value = "timeRanges")
    private List<MaintenanceWindowTimeRange> timeRanges;

    /**
     * Get the timeRanges property: The timeRanges property.
     *
     * @return the timeRanges value.
     */
    public List<MaintenanceWindowTimeRange> timeRanges() {
        return this.timeRanges;
    }

    /**
     * Set the timeRanges property: The timeRanges property.
     *
     * @param timeRanges the timeRanges value to set.
     * @return the MaintenanceWindowsProperties object itself.
     */
    public MaintenanceWindowsProperties withTimeRanges(List<MaintenanceWindowTimeRange> timeRanges) {
        this.timeRanges = timeRanges;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (timeRanges() != null) {
            timeRanges().forEach(e -> e.validate());
        }
    }
}