// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SubResource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hybridnetwork.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Vendor resource. */
@Fluent
public final class VendorInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VendorInner.class);

    /*
     * Vendor properties.
     */
    @JsonProperty(value = "properties")
    private VendorPropertiesFormat innerProperties;

    /*
     * The system meta data relating to this resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get the innerProperties property: Vendor properties.
     *
     * @return the innerProperties value.
     */
    private VendorPropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: The system meta data relating to this resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the provisioningState property: The provisioning state of the vendor resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the skus property: A list of IDs of the vendor skus offered by the vendor.
     *
     * @return the skus value.
     */
    public List<SubResource> skus() {
        return this.innerProperties() == null ? null : this.innerProperties().skus();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}