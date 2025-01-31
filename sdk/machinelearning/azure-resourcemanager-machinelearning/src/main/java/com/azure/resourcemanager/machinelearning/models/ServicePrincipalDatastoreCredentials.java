// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.UUID;

/** Service Principal datastore credentials configuration. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "credentialsType")
@JsonTypeName("ServicePrincipal")
@Fluent
public final class ServicePrincipalDatastoreCredentials extends DatastoreCredentials {
    /*
     * Authority URL used for authentication.
     */
    @JsonProperty(value = "authorityUrl")
    private String authorityUrl;

    /*
     * [Required] Service principal client ID.
     */
    @JsonProperty(value = "clientId", required = true)
    private UUID clientId;

    /*
     * Resource the service principal has access to.
     */
    @JsonProperty(value = "resourceUrl")
    private String resourceUrl;

    /*
     * [Required] Service principal secrets.
     */
    @JsonProperty(value = "secrets", required = true)
    private ServicePrincipalDatastoreSecrets secrets;

    /*
     * [Required] ID of the tenant to which the service principal belongs.
     */
    @JsonProperty(value = "tenantId", required = true)
    private UUID tenantId;

    /**
     * Get the authorityUrl property: Authority URL used for authentication.
     *
     * @return the authorityUrl value.
     */
    public String authorityUrl() {
        return this.authorityUrl;
    }

    /**
     * Set the authorityUrl property: Authority URL used for authentication.
     *
     * @param authorityUrl the authorityUrl value to set.
     * @return the ServicePrincipalDatastoreCredentials object itself.
     */
    public ServicePrincipalDatastoreCredentials withAuthorityUrl(String authorityUrl) {
        this.authorityUrl = authorityUrl;
        return this;
    }

    /**
     * Get the clientId property: [Required] Service principal client ID.
     *
     * @return the clientId value.
     */
    public UUID clientId() {
        return this.clientId;
    }

    /**
     * Set the clientId property: [Required] Service principal client ID.
     *
     * @param clientId the clientId value to set.
     * @return the ServicePrincipalDatastoreCredentials object itself.
     */
    public ServicePrincipalDatastoreCredentials withClientId(UUID clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Get the resourceUrl property: Resource the service principal has access to.
     *
     * @return the resourceUrl value.
     */
    public String resourceUrl() {
        return this.resourceUrl;
    }

    /**
     * Set the resourceUrl property: Resource the service principal has access to.
     *
     * @param resourceUrl the resourceUrl value to set.
     * @return the ServicePrincipalDatastoreCredentials object itself.
     */
    public ServicePrincipalDatastoreCredentials withResourceUrl(String resourceUrl) {
        this.resourceUrl = resourceUrl;
        return this;
    }

    /**
     * Get the secrets property: [Required] Service principal secrets.
     *
     * @return the secrets value.
     */
    public ServicePrincipalDatastoreSecrets secrets() {
        return this.secrets;
    }

    /**
     * Set the secrets property: [Required] Service principal secrets.
     *
     * @param secrets the secrets value to set.
     * @return the ServicePrincipalDatastoreCredentials object itself.
     */
    public ServicePrincipalDatastoreCredentials withSecrets(ServicePrincipalDatastoreSecrets secrets) {
        this.secrets = secrets;
        return this;
    }

    /**
     * Get the tenantId property: [Required] ID of the tenant to which the service principal belongs.
     *
     * @return the tenantId value.
     */
    public UUID tenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenantId property: [Required] ID of the tenant to which the service principal belongs.
     *
     * @param tenantId the tenantId value to set.
     * @return the ServicePrincipalDatastoreCredentials object itself.
     */
    public ServicePrincipalDatastoreCredentials withTenantId(UUID tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (clientId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property clientId in model ServicePrincipalDatastoreCredentials"));
        }
        if (secrets() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property secrets in model ServicePrincipalDatastoreCredentials"));
        } else {
            secrets().validate();
        }
        if (tenantId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property tenantId in model ServicePrincipalDatastoreCredentials"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ServicePrincipalDatastoreCredentials.class);
}
