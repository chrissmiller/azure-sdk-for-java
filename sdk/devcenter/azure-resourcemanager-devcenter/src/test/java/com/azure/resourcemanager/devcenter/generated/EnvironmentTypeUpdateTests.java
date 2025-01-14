// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devcenter.models.EnvironmentTypeUpdate;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class EnvironmentTypeUpdateTests {
    @Test
    public void testDeserialize() {
        EnvironmentTypeUpdate model =
            BinaryData
                .fromString("{\"tags\":{\"rpabg\":\"phoxus\",\"xywpmueefjzwfqkq\":\"epsbjtazqu\"}}")
                .toObject(EnvironmentTypeUpdate.class);
        Assertions.assertEquals("phoxus", model.tags().get("rpabg"));
    }

    @Test
    public void testSerialize() {
        EnvironmentTypeUpdate model =
            new EnvironmentTypeUpdate().withTags(mapOf("rpabg", "phoxus", "xywpmueefjzwfqkq", "epsbjtazqu"));
        model = BinaryData.fromObject(model).toObject(EnvironmentTypeUpdate.class);
        Assertions.assertEquals("phoxus", model.tags().get("rpabg"));
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
