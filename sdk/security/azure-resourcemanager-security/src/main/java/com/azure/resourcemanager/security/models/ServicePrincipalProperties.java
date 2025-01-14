// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Details of the service principal. */
@Fluent
public final class ServicePrincipalProperties {
    /*
     * Application ID of service principal.
     */
    @JsonProperty(value = "applicationId")
    private String applicationId;

    /*
     * A secret string that the application uses to prove its identity, also can be referred to as application password
     * (write only).
     */
    @JsonProperty(value = "secret")
    private String secret;

    /**
     * Get the applicationId property: Application ID of service principal.
     *
     * @return the applicationId value.
     */
    public String applicationId() {
        return this.applicationId;
    }

    /**
     * Set the applicationId property: Application ID of service principal.
     *
     * @param applicationId the applicationId value to set.
     * @return the ServicePrincipalProperties object itself.
     */
    public ServicePrincipalProperties withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * Get the secret property: A secret string that the application uses to prove its identity, also can be referred to
     * as application password (write only).
     *
     * @return the secret value.
     */
    public String secret() {
        return this.secret;
    }

    /**
     * Set the secret property: A secret string that the application uses to prove its identity, also can be referred to
     * as application password (write only).
     *
     * @param secret the secret value to set.
     * @return the ServicePrincipalProperties object itself.
     */
    public ServicePrincipalProperties withSecret(String secret) {
        this.secret = secret;
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
