// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.VariableSpecification;
import com.azure.resourcemanager.datafactory.models.VariableType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class VariableSpecificationTests {
    @Test
    public void testDeserialize() {
        VariableSpecification model =
            BinaryData.fromString("{\"type\":\"String\"}").toObject(VariableSpecification.class);
        Assertions.assertEquals(VariableType.STRING, model.type());
    }

    @Test
    public void testSerialize() {
        VariableSpecification model = new VariableSpecification().withType(VariableType.STRING);
        model = BinaryData.fromObject(model).toObject(VariableSpecification.class);
        Assertions.assertEquals(VariableType.STRING, model.type());
    }
}
