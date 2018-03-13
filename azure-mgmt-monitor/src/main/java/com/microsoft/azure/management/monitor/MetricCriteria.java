/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The MetricCriteria model.
 */
public class MetricCriteria {
    /**
     * Name of the criteria.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Name of the metric.
     */
    @JsonProperty(value = "metricName", required = true)
    private String metricName;

    /**
     * Namespace of the metric.
     */
    @JsonProperty(value = "metricNamespace")
    private String metricNamespace;

    /**
     * the criteria operator.
     */
    @JsonProperty(value = "operator", required = true)
    private String operator;

    /**
     * the criteria time aggregation value.
     */
    @JsonProperty(value = "timeAggregation", required = true)
    private String timeAggregation;

    /**
     * the criteria threshold value that activates the alert.
     */
    @JsonProperty(value = "threshold", required = true)
    private double threshold;

    /**
     * List of dimension conditions.
     */
    @JsonProperty(value = "dimensions")
    private List<MetricDimension> dimensions;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the MetricCriteria object itself.
     */
    public MetricCriteria withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the metricName value.
     *
     * @return the metricName value
     */
    public String metricName() {
        return this.metricName;
    }

    /**
     * Set the metricName value.
     *
     * @param metricName the metricName value to set
     * @return the MetricCriteria object itself.
     */
    public MetricCriteria withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * Get the metricNamespace value.
     *
     * @return the metricNamespace value
     */
    public String metricNamespace() {
        return this.metricNamespace;
    }

    /**
     * Set the metricNamespace value.
     *
     * @param metricNamespace the metricNamespace value to set
     * @return the MetricCriteria object itself.
     */
    public MetricCriteria withMetricNamespace(String metricNamespace) {
        this.metricNamespace = metricNamespace;
        return this;
    }

    /**
     * Get the operator value.
     *
     * @return the operator value
     */
    public String operator() {
        return this.operator;
    }

    /**
     * Set the operator value.
     *
     * @param operator the operator value to set
     * @return the MetricCriteria object itself.
     */
    public MetricCriteria withOperator(String operator) {
        this.operator = operator;
        return this;
    }

    /**
     * Get the timeAggregation value.
     *
     * @return the timeAggregation value
     */
    public String timeAggregation() {
        return this.timeAggregation;
    }

    /**
     * Set the timeAggregation value.
     *
     * @param timeAggregation the timeAggregation value to set
     * @return the MetricCriteria object itself.
     */
    public MetricCriteria withTimeAggregation(String timeAggregation) {
        this.timeAggregation = timeAggregation;
        return this;
    }

    /**
     * Get the threshold value.
     *
     * @return the threshold value
     */
    public double threshold() {
        return this.threshold;
    }

    /**
     * Set the threshold value.
     *
     * @param threshold the threshold value to set
     * @return the MetricCriteria object itself.
     */
    public MetricCriteria withThreshold(double threshold) {
        this.threshold = threshold;
        return this;
    }

    /**
     * Get the dimensions value.
     *
     * @return the dimensions value
     */
    public List<MetricDimension> dimensions() {
        return this.dimensions;
    }

    /**
     * Set the dimensions value.
     *
     * @param dimensions the dimensions value to set
     * @return the MetricCriteria object itself.
     */
    public MetricCriteria withDimensions(List<MetricDimension> dimensions) {
        this.dimensions = dimensions;
        return this;
    }

}
