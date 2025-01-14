// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AzureSearchIndexDataset;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AzureSearchIndexDatasetTests {
    @Test
    public void testDeserialize() {
        AzureSearchIndexDataset model =
            BinaryData
                .fromString(
                    "{\"type\":\"AzureSearchIndex\",\"typeProperties\":{},\"description\":\"liohrd\",\"linkedServiceName\":{\"referenceName\":\"fg\",\"parameters\":{}},\"parameters\":{\"bbnz\":{\"type\":\"Object\"},\"knapq\":{\"type\":\"Int\"},\"uicdhzbdybwwg\":{\"type\":\"Float\"}},\"annotations\":[],\"folder\":{\"name\":\"idmhmwf\"},\"\":{}}")
                .toObject(AzureSearchIndexDataset.class);
        Assertions.assertEquals("liohrd", model.description());
        Assertions.assertEquals("fg", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.OBJECT, model.parameters().get("bbnz").type());
        Assertions.assertEquals("idmhmwf", model.folder().name());
    }

    @Test
    public void testSerialize() {
        AzureSearchIndexDataset model =
            new AzureSearchIndexDataset()
                .withDescription("liohrd")
                .withLinkedServiceName(new LinkedServiceReference().withReferenceName("fg").withParameters(mapOf()))
                .withParameters(
                    mapOf(
                        "bbnz",
                        new ParameterSpecification().withType(ParameterType.OBJECT),
                        "knapq",
                        new ParameterSpecification().withType(ParameterType.INT),
                        "uicdhzbdybwwg",
                        new ParameterSpecification().withType(ParameterType.FLOAT)))
                .withAnnotations(Arrays.asList())
                .withFolder(new DatasetFolder().withName("idmhmwf"));
        model = BinaryData.fromObject(model).toObject(AzureSearchIndexDataset.class);
        Assertions.assertEquals("liohrd", model.description());
        Assertions.assertEquals("fg", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.OBJECT, model.parameters().get("bbnz").type());
        Assertions.assertEquals("idmhmwf", model.folder().name());
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
