// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.kusto.fluent.models.ClusterPrincipalProperties;
import com.azure.resourcemanager.kusto.models.ClusterPrincipalRole;
import com.azure.resourcemanager.kusto.models.PrincipalType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ClusterPrincipalPropertiesTests {
    @Test
    public void testDeserialize() {
        ClusterPrincipalProperties model =
            BinaryData
                .fromString(
                    "{\"principalId\":\"kqsleyyvxy\",\"role\":\"AllDatabasesViewer\",\"tenantId\":\"k\",\"principalType\":\"App\",\"tenantName\":\"tpngjcrcczsqpjh\",\"principalName\":\"daj\",\"provisioningState\":\"Succeeded\",\"aadObjectId\":\"ounqecano\"}")
                .toObject(ClusterPrincipalProperties.class);
        Assertions.assertEquals("kqsleyyvxy", model.principalId());
        Assertions.assertEquals(ClusterPrincipalRole.ALL_DATABASES_VIEWER, model.role());
        Assertions.assertEquals("k", model.tenantId());
        Assertions.assertEquals(PrincipalType.APP, model.principalType());
    }

    @Test
    public void testSerialize() {
        ClusterPrincipalProperties model =
            new ClusterPrincipalProperties()
                .withPrincipalId("kqsleyyvxy")
                .withRole(ClusterPrincipalRole.ALL_DATABASES_VIEWER)
                .withTenantId("k")
                .withPrincipalType(PrincipalType.APP);
        model = BinaryData.fromObject(model).toObject(ClusterPrincipalProperties.class);
        Assertions.assertEquals("kqsleyyvxy", model.principalId());
        Assertions.assertEquals(ClusterPrincipalRole.ALL_DATABASES_VIEWER, model.role());
        Assertions.assertEquals("k", model.tenantId());
        Assertions.assertEquals(PrincipalType.APP, model.principalType());
    }
}
