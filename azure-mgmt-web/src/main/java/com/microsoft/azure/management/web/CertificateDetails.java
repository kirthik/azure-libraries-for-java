/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.web;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SSL certificate details.
 */
public class CertificateDetails {
    /**
     * Certificate Version.
     */
    @JsonProperty(value = "version", access = JsonProperty.Access.WRITE_ONLY)
    private Integer version;

    /**
     * Certificate Serial Number.
     */
    @JsonProperty(value = "serialNumber", access = JsonProperty.Access.WRITE_ONLY)
    private String serialNumber;

    /**
     * Certificate Thumbprint.
     */
    @JsonProperty(value = "thumbprint", access = JsonProperty.Access.WRITE_ONLY)
    private String thumbprint;

    /**
     * Certificate Subject.
     */
    @JsonProperty(value = "subject", access = JsonProperty.Access.WRITE_ONLY)
    private String subject;

    /**
     * Date Certificate is valid from.
     */
    @JsonProperty(value = "notBefore", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime notBefore;

    /**
     * Date Certificate is valid to.
     */
    @JsonProperty(value = "notAfter", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime notAfter;

    /**
     * Certificate Signature algorithm.
     */
    @JsonProperty(value = "signatureAlgorithm", access = JsonProperty.Access.WRITE_ONLY)
    private String signatureAlgorithm;

    /**
     * Certificate Issuer.
     */
    @JsonProperty(value = "issuer", access = JsonProperty.Access.WRITE_ONLY)
    private String issuer;

    /**
     * Raw certificate data.
     */
    @JsonProperty(value = "rawData", access = JsonProperty.Access.WRITE_ONLY)
    private String rawData;

    /**
     * Get the version value.
     *
     * @return the version value
     */
    public Integer version() {
        return this.version;
    }

    /**
     * Get the serialNumber value.
     *
     * @return the serialNumber value
     */
    public String serialNumber() {
        return this.serialNumber;
    }

    /**
     * Get the thumbprint value.
     *
     * @return the thumbprint value
     */
    public String thumbprint() {
        return this.thumbprint;
    }

    /**
     * Get the subject value.
     *
     * @return the subject value
     */
    public String subject() {
        return this.subject;
    }

    /**
     * Get the notBefore value.
     *
     * @return the notBefore value
     */
    public DateTime notBefore() {
        return this.notBefore;
    }

    /**
     * Get the notAfter value.
     *
     * @return the notAfter value
     */
    public DateTime notAfter() {
        return this.notAfter;
    }

    /**
     * Get the signatureAlgorithm value.
     *
     * @return the signatureAlgorithm value
     */
    public String signatureAlgorithm() {
        return this.signatureAlgorithm;
    }

    /**
     * Get the issuer value.
     *
     * @return the issuer value
     */
    public String issuer() {
        return this.issuer;
    }

    /**
     * Get the rawData value.
     *
     * @return the rawData value
     */
    public String rawData() {
        return this.rawData;
    }

}
