// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import com.azure.resourcemanager.datafactory.models.SalesforceMarketingCloudLinkedService;
import com.azure.resourcemanager.datafactory.models.SecretBase;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class SalesforceMarketingCloudLinkedServiceTests {
    @Test
    public void testDeserialize() {
        SalesforceMarketingCloudLinkedService model =
            BinaryData
                .fromString(
                    "{\"type\":\"SalesforceMarketingCloud\",\"typeProperties\":{\"clientSecret\":{\"type\":\"SecretBase\"}},\"connectVia\":{\"referenceName\":\"avaqogfkbebau\",\"parameters\":{}},\"description\":\"txxwpfh\",\"parameters\":{\"rt\":{\"type\":\"SecureString\"},\"gmeboywhczz\":{\"type\":\"Int\"}},\"annotations\":[],\"\":{}}")
                .toObject(SalesforceMarketingCloudLinkedService.class);
        Assertions.assertEquals("avaqogfkbebau", model.connectVia().referenceName());
        Assertions.assertEquals("txxwpfh", model.description());
        Assertions.assertEquals(ParameterType.SECURE_STRING, model.parameters().get("rt").type());
    }

    @Test
    public void testSerialize() {
        SalesforceMarketingCloudLinkedService model =
            new SalesforceMarketingCloudLinkedService()
                .withConnectVia(
                    new IntegrationRuntimeReference().withReferenceName("avaqogfkbebau").withParameters(mapOf()))
                .withDescription("txxwpfh")
                .withParameters(
                    mapOf(
                        "rt",
                        new ParameterSpecification().withType(ParameterType.SECURE_STRING),
                        "gmeboywhczz",
                        new ParameterSpecification().withType(ParameterType.INT)))
                .withAnnotations(Arrays.asList())
                .withClientSecret(new SecretBase());
        model = BinaryData.fromObject(model).toObject(SalesforceMarketingCloudLinkedService.class);
        Assertions.assertEquals("avaqogfkbebau", model.connectVia().referenceName());
        Assertions.assertEquals("txxwpfh", model.description());
        Assertions.assertEquals(ParameterType.SECURE_STRING, model.parameters().get("rt").type());
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
