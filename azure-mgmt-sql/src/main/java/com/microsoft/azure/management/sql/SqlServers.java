/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.sql;

import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Fluent;
import com.microsoft.azure.management.resources.fluentcore.arm.Region;
import com.microsoft.azure.management.resources.fluentcore.arm.collection.SupportsBatchDeletion;
import com.microsoft.azure.management.resources.fluentcore.arm.collection.SupportsDeletingByResourceGroup;
import com.microsoft.azure.management.resources.fluentcore.arm.collection.SupportsGettingByResourceGroup;
import com.microsoft.azure.management.resources.fluentcore.arm.collection.SupportsGettingById;
import com.microsoft.azure.management.resources.fluentcore.arm.collection.SupportsListingByResourceGroup;
import com.microsoft.azure.management.resources.fluentcore.arm.models.HasManager;
import com.microsoft.azure.management.resources.fluentcore.collection.SupportsBatchCreation;
import com.microsoft.azure.management.resources.fluentcore.collection.SupportsCreating;
import com.microsoft.azure.management.resources.fluentcore.collection.SupportsDeletingById;
import com.microsoft.azure.management.resources.fluentcore.collection.SupportsListing;
import com.microsoft.azure.management.resources.fluentcore.model.HasInner;
import com.microsoft.azure.management.sql.implementation.ServersInner;
import com.microsoft.azure.management.sql.implementation.SqlServerManager;
import rx.Observable;

import java.util.List;

/**
 *  Entry point to SQL Server management API.
 */
@Fluent
public interface SqlServers extends
        SupportsCreating<SqlServer.DefinitionStages.Blank>,
        SupportsListing<SqlServer>,
        SupportsListingByResourceGroup<SqlServer>,
        SupportsGettingByResourceGroup<SqlServer>,
        SupportsGettingById<SqlServer>,
        SupportsDeletingById,
        SupportsDeletingByResourceGroup,
        SupportsBatchCreation<SqlServer>,
        SupportsBatchDeletion,
        HasManager<SqlServerManager>,
        HasInner<ServersInner> {

    /**
     * @return the SQL Server Firewall Rules API entry point
     */
    @Beta(Beta.SinceVersion.V1_7_0)
    SqlFirewallRuleOperations firewallRules();

    /**
     * @return the SQL Server VirtualNetwork Rules API entry point
     */
    @Beta(Beta.SinceVersion.V1_8_0)
    SqlVirtualNetworkRuleOperations virtualNetworkRules();

    /**
     * @return the SQL Server DNS aliases API entry point
     */
    @Beta(Beta.SinceVersion.V1_8_0)
    SqlServerDnsAliasOperations dnsAliases();

    /**
     * @return the SQL Failover Group API entry point
     */
    @Beta(Beta.SinceVersion.V1_8_0)
    SqlFailoverGroupOperations failoverGroups();

    /**
     * @return the SQL Server Key entry point
     */
    @Beta(Beta.SinceVersion.V1_8_0)
    SqlServerKeyOperations serverKeys();

    /**
     * @return the SQL Server Elastic Pools API entry point
     */
    @Beta(Beta.SinceVersion.V1_7_0)
    SqlElasticPoolOperations elasticPools();

    /**
     * @return the SQL Server Database API entry point
     */
    @Beta(Beta.SinceVersion.V1_7_0)
    SqlDatabaseOperations databases();

    /**
     * Checks if the specified container registry name is valid and available.
     *
     * @param name the container registry name to check
     * @return whether the name is available and other info if not
     */
    @Beta(Beta.SinceVersion.V1_8_0)
    CheckNameAvailabilityResult checkNameAvailability(String name);

    /**
     * Checks if container registry name is valid and is not in use asynchronously.
     *
     * @param name the container registry name to check
     * @return a representation of the future computation of this call, returning whether the name is available or other info if not
     */
    @Beta(Beta.SinceVersion.V1_8_0)
    Observable<CheckNameAvailabilityResult> checkNameAvailabilityAsync(String name);

    /**
     * Gets the Azure SQL server capabilities for a given Azure region.
     *
     * @param region the location to get the Azure SQL server capabilities for
     * @return the server capabilities object
     */
    @Beta(Beta.SinceVersion.V1_8_0)
    RegionCapabilities getCapabilitiesByRegion(Region region);

    /**
     * Gets the Azure SQL server capabilities for a given Azure region asynchronously.
     *
     * @param region the location to get the Azure SQL server capabilities for
     * @return a representation of the future computation of this call, returning the server capabilities object
     */
    @Beta(Beta.SinceVersion.V1_8_0)
    Observable<RegionCapabilities> getCapabilitiesByRegionAsync(Region region);

    /**
     * Lists the Azure SQL server usages for a given Azure region.
     *
     * @param region the location to get the Azure SQL server usages for
     * @return the SQL usage object
     */
    @Beta(Beta.SinceVersion.V1_8_0)
    List<SqlSubscriptionUsageMetric> listUsageByRegion(Region region);

    /**
     * Lists the Azure SQL server usages for a given Azure region asynchronously.
     *
     * @param region the location to get the Azure SQL server usages for
     * @return a representation of the future computation of this call, returning the server usages object
     */
    @Beta(Beta.SinceVersion.V1_8_0)
    Observable<SqlSubscriptionUsageMetric> listUsageByRegionAsync(Region region);
}
