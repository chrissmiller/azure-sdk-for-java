// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** SSIS embedded child package. */
@Fluent
public final class SsisChildPackage {
    /*
     * Path for embedded child package. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "packagePath", required = true)
    private Object packagePath;

    /*
     * Name for embedded child package.
     */
    @JsonProperty(value = "packageName")
    private String packageName;

    /*
     * Content for embedded child package. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "packageContent", required = true)
    private Object packageContent;

    /*
     * Last modified date for embedded child package.
     */
    @JsonProperty(value = "packageLastModifiedDate")
    private String packageLastModifiedDate;

    /**
     * Get the packagePath property: Path for embedded child package. Type: string (or Expression with resultType
     * string).
     *
     * @return the packagePath value.
     */
    public Object getPackagePath() {
        return this.packagePath;
    }

    /**
     * Set the packagePath property: Path for embedded child package. Type: string (or Expression with resultType
     * string).
     *
     * @param packagePath the packagePath value to set.
     * @return the SsisChildPackage object itself.
     */
    public SsisChildPackage setPackagePath(Object packagePath) {
        this.packagePath = packagePath;
        return this;
    }

    /**
     * Get the packageName property: Name for embedded child package.
     *
     * @return the packageName value.
     */
    public String getPackageName() {
        return this.packageName;
    }

    /**
     * Set the packageName property: Name for embedded child package.
     *
     * @param packageName the packageName value to set.
     * @return the SsisChildPackage object itself.
     */
    public SsisChildPackage setPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }

    /**
     * Get the packageContent property: Content for embedded child package. Type: string (or Expression with resultType
     * string).
     *
     * @return the packageContent value.
     */
    public Object getPackageContent() {
        return this.packageContent;
    }

    /**
     * Set the packageContent property: Content for embedded child package. Type: string (or Expression with resultType
     * string).
     *
     * @param packageContent the packageContent value to set.
     * @return the SsisChildPackage object itself.
     */
    public SsisChildPackage setPackageContent(Object packageContent) {
        this.packageContent = packageContent;
        return this;
    }

    /**
     * Get the packageLastModifiedDate property: Last modified date for embedded child package.
     *
     * @return the packageLastModifiedDate value.
     */
    public String getPackageLastModifiedDate() {
        return this.packageLastModifiedDate;
    }

    /**
     * Set the packageLastModifiedDate property: Last modified date for embedded child package.
     *
     * @param packageLastModifiedDate the packageLastModifiedDate value to set.
     * @return the SsisChildPackage object itself.
     */
    public SsisChildPackage setPackageLastModifiedDate(String packageLastModifiedDate) {
        this.packageLastModifiedDate = packageLastModifiedDate;
        return this;
    }
}
