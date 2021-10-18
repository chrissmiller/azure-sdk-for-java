// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.videoanalyzer.models;

import com.azure.resourcemanager.videoanalyzer.fluent.models.VideoContentTokenInner;
import java.time.OffsetDateTime;

/** An immutable client-side representation of VideoContentToken. */
public interface VideoContentToken {
    /**
     * Gets the expirationDate property: The content token expiration date in ISO8601 format (eg. 2021-01-01T00:00:00Z).
     *
     * @return the expirationDate value.
     */
    OffsetDateTime expirationDate();

    /**
     * Gets the token property: The content token value to be added to the video content URL as the value for the
     * "token" query string parameter. The token is specific to a single video.
     *
     * @return the token value.
     */
    String token();

    /**
     * Gets the inner com.azure.resourcemanager.videoanalyzer.fluent.models.VideoContentTokenInner object.
     *
     * @return the inner object.
     */
    VideoContentTokenInner innerModel();
}