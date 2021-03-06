/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */
package com.microsoft.azure.management.sql.implementation;

import com.microsoft.azure.management.apigeneration.LangDefinition;
import com.microsoft.azure.management.resources.fluentcore.model.implementation.RefreshableWrapperImpl;
import com.microsoft.azure.management.sql.AutomaticTuningOptionModeDesired;
import com.microsoft.azure.management.sql.AutomaticTuningServerMode;
import com.microsoft.azure.management.sql.AutomaticTuningServerOptions;
import com.microsoft.azure.management.sql.SqlServerAutomaticTuning;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import rx.Observable;
import rx.functions.Func1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/**
 * Implementation for Azure SQL server automatic tuning.
 */
@LangDefinition
public class SqlServerAutomaticTuningImpl
    extends RefreshableWrapperImpl<ServerAutomaticTuningInner, SqlServerAutomaticTuning>
    implements
        SqlServerAutomaticTuning,
        SqlServerAutomaticTuning.Update {

    protected String key;
    private SqlServerManager sqlServerManager;
    private String resourceGroupName;
    private String sqlServerName;

    SqlServerAutomaticTuningImpl(SqlServerImpl server, ServerAutomaticTuningInner innerObject) {
        this(server.resourceGroupName(), server.name(), innerObject, server.manager());
    }

    SqlServerAutomaticTuningImpl(String resourceGroupName, String sqlServerName, ServerAutomaticTuningInner innerObject, SqlServerManager sqlServerManager) {
        super(innerObject);
        Objects.requireNonNull(innerObject);
        Objects.requireNonNull(sqlServerManager);
        this.sqlServerManager = sqlServerManager;
        this.resourceGroupName = resourceGroupName;
        this.sqlServerName = sqlServerName;

        this.key = UUID.randomUUID().toString();
    }

    @Override
    public String key() {
        return this.key;
    }

    @Override
    public AutomaticTuningServerMode desiredState() {
        return this.inner().desiredState();
    }

    @Override
    public AutomaticTuningServerMode actualState() {
        return this.inner().actualState();
    }

    @Override
    public Map<String, AutomaticTuningServerOptions> tuningOptions() {
        return Collections.unmodifiableMap(this.inner().options() != null ? this.inner().options() : new HashMap<String, AutomaticTuningServerOptions>());
    }

    @Override
    public SqlServerAutomaticTuningImpl withAutomaticTuningMode(AutomaticTuningServerMode desiredState) {
        this.inner().withDesiredState(desiredState);
        return this;
    }

    @Override
    public SqlServerAutomaticTuningImpl withAutomaticTuningOptions(String tuningOptionName, AutomaticTuningOptionModeDesired desiredState) {
        if (this.inner().options() == null) {
            this.inner().withOptions(new HashMap<String, AutomaticTuningServerOptions>());
        }
        AutomaticTuningServerOptions item = this.inner().options().get(tuningOptionName);
        this.inner().options()
            .put(tuningOptionName, item != null ? item.withDesiredState(desiredState) : new AutomaticTuningServerOptions().withDesiredState(desiredState));
        return this;
    }

    @Override
    public SqlServerAutomaticTuningImpl withAutomaticTuningOptions(Map<String, AutomaticTuningOptionModeDesired> tuningOptions) {
        if (tuningOptions != null) {
            for (Map.Entry<String, AutomaticTuningOptionModeDesired> option : tuningOptions.entrySet()) {
                this.withAutomaticTuningOptions(option.getKey(), option.getValue());
            }
        }
        return this;
    }

    @Override
    protected Observable<ServerAutomaticTuningInner> getInnerAsync() {
        return null;
    }

    @Override
    public SqlServerAutomaticTuning apply() {
        return this.applyAsync().toBlocking().last();
    }

    @Override
    public Observable<SqlServerAutomaticTuning> applyAsync() {
        final SqlServerAutomaticTuningImpl self = this;
        return this.sqlServerManager.inner().serverAutomaticTunings()
            .updateAsync(this.resourceGroupName, this.sqlServerName, this.inner())
            .map(new Func1<ServerAutomaticTuningInner, SqlServerAutomaticTuning>() {
                @Override
                public SqlServerAutomaticTuning call(ServerAutomaticTuningInner serverAutomaticTuningInner) {
                    self.setInner(serverAutomaticTuningInner);
                    return self;
                }
            });
    }

    @Override
    public ServiceFuture<SqlServerAutomaticTuning> applyAsync(ServiceCallback<SqlServerAutomaticTuning> callback) {
        return ServiceFuture.fromBody(applyAsync(), callback);
    }

    @Override
    public Update update() {
        return this;
    }
}