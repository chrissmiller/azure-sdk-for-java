// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.resourcemanager.synapse.fluent.models.SparkConfigurationResourceInner;
import com.azure.resourcemanager.synapse.models.SparkConfigurationResource;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class SparkConfigurationResourceImpl implements SparkConfigurationResource {
    private SparkConfigurationResourceInner innerObject;

    private final com.azure.resourcemanager.synapse.SynapseManager serviceManager;

    SparkConfigurationResourceImpl(
        SparkConfigurationResourceInner innerObject, com.azure.resourcemanager.synapse.SynapseManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public String description() {
        return this.innerModel().description();
    }

    public Map<String, String> configs() {
        Map<String, String> inner = this.innerModel().configs();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public List<String> annotations() {
        List<String> inner = this.innerModel().annotations();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String notes() {
        return this.innerModel().notes();
    }

    public String createdBy() {
        return this.innerModel().createdBy();
    }

    public OffsetDateTime created() {
        return this.innerModel().created();
    }

    public SparkConfigurationResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.synapse.SynapseManager manager() {
        return this.serviceManager;
    }
}