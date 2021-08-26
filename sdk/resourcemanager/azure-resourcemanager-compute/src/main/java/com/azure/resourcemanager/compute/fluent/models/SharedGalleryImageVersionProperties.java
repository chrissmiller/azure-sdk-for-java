// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Describes the properties of a gallery image version. */
@Fluent
public final class SharedGalleryImageVersionProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SharedGalleryImageVersionProperties.class);

    /*
     * The published date of the gallery image version Definition. This
     * property can be used for decommissioning purposes. This property is
     * updatable.
     */
    @JsonProperty(value = "publishedDate")
    private OffsetDateTime publishedDate;

    /*
     * The end of life date of the gallery image version Definition. This
     * property can be used for decommissioning purposes. This property is
     * updatable.
     */
    @JsonProperty(value = "endOfLifeDate")
    private OffsetDateTime endOfLifeDate;

    /**
     * Get the publishedDate property: The published date of the gallery image version Definition. This property can be
     * used for decommissioning purposes. This property is updatable.
     *
     * @return the publishedDate value.
     */
    public OffsetDateTime publishedDate() {
        return this.publishedDate;
    }

    /**
     * Set the publishedDate property: The published date of the gallery image version Definition. This property can be
     * used for decommissioning purposes. This property is updatable.
     *
     * @param publishedDate the publishedDate value to set.
     * @return the SharedGalleryImageVersionProperties object itself.
     */
    public SharedGalleryImageVersionProperties withPublishedDate(OffsetDateTime publishedDate) {
        this.publishedDate = publishedDate;
        return this;
    }

    /**
     * Get the endOfLifeDate property: The end of life date of the gallery image version Definition. This property can
     * be used for decommissioning purposes. This property is updatable.
     *
     * @return the endOfLifeDate value.
     */
    public OffsetDateTime endOfLifeDate() {
        return this.endOfLifeDate;
    }

    /**
     * Set the endOfLifeDate property: The end of life date of the gallery image version Definition. This property can
     * be used for decommissioning purposes. This property is updatable.
     *
     * @param endOfLifeDate the endOfLifeDate value to set.
     * @return the SharedGalleryImageVersionProperties object itself.
     */
    public SharedGalleryImageVersionProperties withEndOfLifeDate(OffsetDateTime endOfLifeDate) {
        this.endOfLifeDate = endOfLifeDate;
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