/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.managementgroups.implementation;

import com.microsoft.azure.management.managementgroups.OperationDisplay;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Operation supported by the Microsoft.Management resource provider.
 */
public class OperationInner {
    /**
     * Operation name: {provider}/{resource}/{operation}.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * The object that represents the operation.
     */
    @JsonProperty(value = "display")
    private OperationDisplay display;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the display value.
     *
     * @return the display value
     */
    public OperationDisplay display() {
        return this.display;
    }

    /**
     * Set the display value.
     *
     * @param display the display value to set
     * @return the OperationInner object itself.
     */
    public OperationInner withDisplay(OperationDisplay display) {
        this.display = display;
        return this;
    }

}
