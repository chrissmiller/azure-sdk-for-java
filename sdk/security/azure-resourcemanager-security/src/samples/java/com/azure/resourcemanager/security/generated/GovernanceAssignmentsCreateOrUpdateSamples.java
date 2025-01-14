// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.resourcemanager.security.models.GovernanceAssignmentAdditionalData;
import com.azure.resourcemanager.security.models.GovernanceEmailNotification;
import com.azure.resourcemanager.security.models.RemediationEta;
import java.time.OffsetDateTime;

/** Samples for GovernanceAssignments CreateOrUpdate. */
public final class GovernanceAssignmentsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2022-01-01-preview/examples/GovernanceAssignments/PutGovernanceAssignment_example.json
     */
    /**
     * Sample code: Create Governance assignment.
     *
     * @param manager Entry point to SecurityManager.
     */
    public static void createGovernanceAssignment(com.azure.resourcemanager.security.SecurityManager manager) {
        manager
            .governanceAssignments()
            .define("6634ff9f-127b-4bf2-8e6e-b1737f5e789c")
            .withExistingAssessment(
                "subscriptions/c32e05d9-7207-4e22-bdf4-4f7d9c72e5fd/resourceGroups/compute_servers/providers/Microsoft.Compute/virtualMachines/win2012",
                "6b9421dd-5555-2251-9b3d-2be58e2f82cd")
            .withOwner("user@contoso.com")
            .withRemediationDueDate(OffsetDateTime.parse("2022-01-07T13:00:00.0000000Z"))
            .withRemediationEta(
                new RemediationEta()
                    .withEta(OffsetDateTime.parse("2022-01-08T13:00:00.0000000Z"))
                    .withJustification("Justification of ETA"))
            .withIsGracePeriod(true)
            .withGovernanceEmailNotification(
                new GovernanceEmailNotification()
                    .withDisableManagerEmailNotification(false)
                    .withDisableOwnerEmailNotification(false))
            .withAdditionalData(
                new GovernanceAssignmentAdditionalData()
                    .withTicketNumber(123123)
                    .withTicketLink("https://snow.com")
                    .withTicketStatus("Active"))
            .create();
    }
}
