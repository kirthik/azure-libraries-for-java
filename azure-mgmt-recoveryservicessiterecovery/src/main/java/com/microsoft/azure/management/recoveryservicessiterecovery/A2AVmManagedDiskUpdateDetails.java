/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservicessiterecovery;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Azure VM managed disk update input details.
 */
public class A2AVmManagedDiskUpdateDetails {
    /**
     * The disk Id.
     */
    @JsonProperty(value = "diskId")
    private String diskId;

    /**
     * The target disk type before failover.
     */
    @JsonProperty(value = "recoveryTargetDiskAccountType")
    private String recoveryTargetDiskAccountType;

    /**
     * The replica disk type before failover.
     */
    @JsonProperty(value = "recoveryReplicaDiskAccountType")
    private String recoveryReplicaDiskAccountType;

    /**
     * Get the diskId value.
     *
     * @return the diskId value
     */
    public String diskId() {
        return this.diskId;
    }

    /**
     * Set the diskId value.
     *
     * @param diskId the diskId value to set
     * @return the A2AVmManagedDiskUpdateDetails object itself.
     */
    public A2AVmManagedDiskUpdateDetails withDiskId(String diskId) {
        this.diskId = diskId;
        return this;
    }

    /**
     * Get the recoveryTargetDiskAccountType value.
     *
     * @return the recoveryTargetDiskAccountType value
     */
    public String recoveryTargetDiskAccountType() {
        return this.recoveryTargetDiskAccountType;
    }

    /**
     * Set the recoveryTargetDiskAccountType value.
     *
     * @param recoveryTargetDiskAccountType the recoveryTargetDiskAccountType value to set
     * @return the A2AVmManagedDiskUpdateDetails object itself.
     */
    public A2AVmManagedDiskUpdateDetails withRecoveryTargetDiskAccountType(String recoveryTargetDiskAccountType) {
        this.recoveryTargetDiskAccountType = recoveryTargetDiskAccountType;
        return this;
    }

    /**
     * Get the recoveryReplicaDiskAccountType value.
     *
     * @return the recoveryReplicaDiskAccountType value
     */
    public String recoveryReplicaDiskAccountType() {
        return this.recoveryReplicaDiskAccountType;
    }

    /**
     * Set the recoveryReplicaDiskAccountType value.
     *
     * @param recoveryReplicaDiskAccountType the recoveryReplicaDiskAccountType value to set
     * @return the A2AVmManagedDiskUpdateDetails object itself.
     */
    public A2AVmManagedDiskUpdateDetails withRecoveryReplicaDiskAccountType(String recoveryReplicaDiskAccountType) {
        this.recoveryReplicaDiskAccountType = recoveryReplicaDiskAccountType;
        return this;
    }

}
