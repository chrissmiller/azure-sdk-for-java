// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.videoanalyzer.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** A custom preset for encoding audio with the AAC codec. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type")
@JsonTypeName("#Microsoft.VideoAnalyzer.AudioEncoderAac")
@Fluent
public final class AudioEncoderAac extends AudioEncoderBase {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AudioEncoderAac.class);

    /** {@inheritDoc} */
    @Override
    public AudioEncoderAac withBitrateKbps(String bitrateKbps) {
        super.withBitrateKbps(bitrateKbps);
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
    }
}