// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.devcenter.fluent.models.DevBoxDefinitionInner;
import com.azure.resourcemanager.devcenter.models.DevBoxDefinition;
import com.azure.resourcemanager.devcenter.models.DevBoxDefinitionUpdate;
import com.azure.resourcemanager.devcenter.models.ImageReference;
import com.azure.resourcemanager.devcenter.models.ImageValidationErrorDetails;
import com.azure.resourcemanager.devcenter.models.ImageValidationStatus;
import com.azure.resourcemanager.devcenter.models.Sku;
import java.util.Collections;
import java.util.Map;

public final class DevBoxDefinitionImpl
    implements DevBoxDefinition, DevBoxDefinition.Definition, DevBoxDefinition.Update {
    private DevBoxDefinitionInner innerObject;

    private final com.azure.resourcemanager.devcenter.DevCenterManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public ImageValidationStatus imageValidationStatus() {
        return this.innerModel().imageValidationStatus();
    }

    public ImageValidationErrorDetails imageValidationErrorDetails() {
        return this.innerModel().imageValidationErrorDetails();
    }

    public ImageReference activeImageReference() {
        return this.innerModel().activeImageReference();
    }

    public ImageReference imageReference() {
        return this.innerModel().imageReference();
    }

    public Sku sku() {
        return this.innerModel().sku();
    }

    public String osStorageType() {
        return this.innerModel().osStorageType();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public DevBoxDefinitionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.devcenter.DevCenterManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String devCenterName;

    private String devBoxDefinitionName;

    private DevBoxDefinitionUpdate updateBody;

    public DevBoxDefinitionImpl withExistingDevcenter(String resourceGroupName, String devCenterName) {
        this.resourceGroupName = resourceGroupName;
        this.devCenterName = devCenterName;
        return this;
    }

    public DevBoxDefinition create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDevBoxDefinitions()
                .createOrUpdate(
                    resourceGroupName, devCenterName, devBoxDefinitionName, this.innerModel(), Context.NONE);
        return this;
    }

    public DevBoxDefinition create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDevBoxDefinitions()
                .createOrUpdate(resourceGroupName, devCenterName, devBoxDefinitionName, this.innerModel(), context);
        return this;
    }

    DevBoxDefinitionImpl(String name, com.azure.resourcemanager.devcenter.DevCenterManager serviceManager) {
        this.innerObject = new DevBoxDefinitionInner();
        this.serviceManager = serviceManager;
        this.devBoxDefinitionName = name;
    }

    public DevBoxDefinitionImpl update() {
        this.updateBody = new DevBoxDefinitionUpdate();
        return this;
    }

    public DevBoxDefinition apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDevBoxDefinitions()
                .update(resourceGroupName, devCenterName, devBoxDefinitionName, updateBody, Context.NONE);
        return this;
    }

    public DevBoxDefinition apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDevBoxDefinitions()
                .update(resourceGroupName, devCenterName, devBoxDefinitionName, updateBody, context);
        return this;
    }

    DevBoxDefinitionImpl(
        DevBoxDefinitionInner innerObject, com.azure.resourcemanager.devcenter.DevCenterManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.devCenterName = Utils.getValueFromIdByName(innerObject.id(), "devcenters");
        this.devBoxDefinitionName = Utils.getValueFromIdByName(innerObject.id(), "devboxdefinitions");
    }

    public DevBoxDefinition refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDevBoxDefinitions()
                .getWithResponse(resourceGroupName, devCenterName, devBoxDefinitionName, Context.NONE)
                .getValue();
        return this;
    }

    public DevBoxDefinition refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getDevBoxDefinitions()
                .getWithResponse(resourceGroupName, devCenterName, devBoxDefinitionName, context)
                .getValue();
        return this;
    }

    public DevBoxDefinitionImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public DevBoxDefinitionImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public DevBoxDefinitionImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateBody.withTags(tags);
            return this;
        }
    }

    public DevBoxDefinitionImpl withImageReference(ImageReference imageReference) {
        if (isInCreateMode()) {
            this.innerModel().withImageReference(imageReference);
            return this;
        } else {
            this.updateBody.withImageReference(imageReference);
            return this;
        }
    }

    public DevBoxDefinitionImpl withSku(Sku sku) {
        if (isInCreateMode()) {
            this.innerModel().withSku(sku);
            return this;
        } else {
            this.updateBody.withSku(sku);
            return this;
        }
    }

    public DevBoxDefinitionImpl withOsStorageType(String osStorageType) {
        if (isInCreateMode()) {
            this.innerModel().withOsStorageType(osStorageType);
            return this;
        } else {
            this.updateBody.withOsStorageType(osStorageType);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
