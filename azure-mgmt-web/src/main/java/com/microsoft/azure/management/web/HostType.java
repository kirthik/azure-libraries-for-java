/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.web;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for HostType.
 */
public enum HostType {
    /** Enum value Standard. */
    STANDARD("Standard"),

    /** Enum value Repository. */
    REPOSITORY("Repository");

    /** The actual serialized value for a HostType instance. */
    private String value;

    HostType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a HostType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed HostType object, or null if unable to parse.
     */
    @JsonCreator
    public static HostType fromString(String value) {
        HostType[] items = HostType.values();
        for (HostType item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
