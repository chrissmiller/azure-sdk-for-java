// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.eventgrid.models.DeliveryAttributeMapping;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The properties for a event hub destination. */
@Fluent
public final class EventHubEventSubscriptionDestinationProperties {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(EventHubEventSubscriptionDestinationProperties.class);

    /*
     * The Azure Resource Id that represents the endpoint of an Event Hub
     * destination of an event subscription.
     */
    @JsonProperty(value = "resourceId")
    private String resourceId;

    /*
     * Delivery attribute details.
     */
    @JsonProperty(value = "deliveryAttributeMappings")
    private List<DeliveryAttributeMapping> deliveryAttributeMappings;

    /**
     * Get the resourceId property: The Azure Resource Id that represents the endpoint of an Event Hub destination of an
     * event subscription.
     *
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: The Azure Resource Id that represents the endpoint of an Event Hub destination of an
     * event subscription.
     *
     * @param resourceId the resourceId value to set.
     * @return the EventHubEventSubscriptionDestinationProperties object itself.
     */
    public EventHubEventSubscriptionDestinationProperties withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the deliveryAttributeMappings property: Delivery attribute details.
     *
     * @return the deliveryAttributeMappings value.
     */
    public List<DeliveryAttributeMapping> deliveryAttributeMappings() {
        return this.deliveryAttributeMappings;
    }

    /**
     * Set the deliveryAttributeMappings property: Delivery attribute details.
     *
     * @param deliveryAttributeMappings the deliveryAttributeMappings value to set.
     * @return the EventHubEventSubscriptionDestinationProperties object itself.
     */
    public EventHubEventSubscriptionDestinationProperties withDeliveryAttributeMappings(
        List<DeliveryAttributeMapping> deliveryAttributeMappings) {
        this.deliveryAttributeMappings = deliveryAttributeMappings;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (deliveryAttributeMappings() != null) {
            deliveryAttributeMappings().forEach(e -> e.validate());
        }
    }
}