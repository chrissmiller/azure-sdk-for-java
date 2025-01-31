// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.UserProperty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class UserPropertyTests {
    @Test
    public void testDeserialize() {
        UserProperty model = BinaryData.fromString("{\"name\":\"bfovasrruvwbhsq\"}").toObject(UserProperty.class);
        Assertions.assertEquals("bfovasrruvwbhsq", model.name());
    }

    @Test
    public void testSerialize() {
        UserProperty model = new UserProperty().withName("bfovasrruvwbhsq");
        model = BinaryData.fromObject(model).toObject(UserProperty.class);
        Assertions.assertEquals("bfovasrruvwbhsq", model.name());
    }
}
