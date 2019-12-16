/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.labservices.v2018_10_15;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Settings related to creating an environment setting.
 */
public class EnvironmentSettingCreationParameters {
    /**
     * The resource specific settings.
     */
    @JsonProperty(value = "resourceSettingCreationParameters", required = true)
    private ResourceSettingCreationParameters resourceSettingCreationParameters;

    /**
     * Get the resource specific settings.
     *
     * @return the resourceSettingCreationParameters value
     */
    public ResourceSettingCreationParameters resourceSettingCreationParameters() {
        return this.resourceSettingCreationParameters;
    }

    /**
     * Set the resource specific settings.
     *
     * @param resourceSettingCreationParameters the resourceSettingCreationParameters value to set
     * @return the EnvironmentSettingCreationParameters object itself.
     */
    public EnvironmentSettingCreationParameters withResourceSettingCreationParameters(ResourceSettingCreationParameters resourceSettingCreationParameters) {
        this.resourceSettingCreationParameters = resourceSettingCreationParameters;
        return this;
    }

}