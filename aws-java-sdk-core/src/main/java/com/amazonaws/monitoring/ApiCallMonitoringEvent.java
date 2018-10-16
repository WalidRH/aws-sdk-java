/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.monitoring;

/**
 * A Monitoring Event that describes the results of an Api Call.
 */
public class ApiCallMonitoringEvent extends ApiMonitoringEvent {

    public static final String API_CALL_MONITORING_EVENT_TYPE = "ApiCall";

    private Integer attemptCount;
    private Long latency;
    private int apiCallTimeout;
    private int maxRetriesExceeded;

    @Override
    public ApiCallMonitoringEvent withApi(String api) {
        this.api = api;
        return this;
    }

    @Override
    public ApiCallMonitoringEvent withVersion(Integer version) {
        this.version = version;
        return this;
    }

    @Override
    public ApiCallMonitoringEvent withRegion(String region) {
        this.region = region;
        return this;
    }

    @Override
    public ApiCallMonitoringEvent withService(String service) {
        this.service = service;
        return this;
    }

    @Override
    public ApiCallMonitoringEvent withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * {@inheritDoc}
     *
     * <p>
     * This is when the request is first seen by the service client.
     */
    public ApiCallMonitoringEvent withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * @return The total number of attempts that were made by the service client to fulfill this request before succeeding or
     * failing.
     */
    public Integer getAttemptCount() {
        return attemptCount;
    }

    /**
     * Sets the attemptCount
     *
     * @param attemptCount The new attemptCount value.
     * @return This object for method chaining.
     */
    public ApiCallMonitoringEvent withAttemptCount(Integer attemptCount) {
        this.attemptCount = attemptCount;
        return this;
    }

    /**
     * @return The elapsed time, in milliseconds, between when the Api Call was begun and when a final response or error is
     * manifested to the caller.
     */
    public Long getLatency() {
        return latency;
    }

    /**
     * Sets the latency
     *
     * @param latency The new latency value.
     * @return This object for method chaining.
     */
    public ApiCallMonitoringEvent withLatency(Long latency) {
        this.latency = latency;
        return this;
    }

    /**
     * @return a boolean (0/1) value that is 0 unless the Api call failed due to hitting an Api Call time limit.
     */
    public int getApiCallTimeout() {
        return apiCallTimeout;
    }

    /**
     * Sets the api call timeout
     *
     * @param apiCallTimeout The new apiCallTimeout value.
     * @return This object for method chaining.
     */
    public ApiCallMonitoringEvent withApiCallTimeout(int apiCallTimeout) {
        this.apiCallTimeout = apiCallTimeout;
        return this;
    }

    /**
     * @return a boolean (0/1) value that is 0 unless the Api call failed and the final attempt returned a retryable error.
     */
    public int getMaxRetriesExceeded() {
        return maxRetriesExceeded;
    }

    /**
     * Sets the api call timeout
     *
     * @param maxRetriesExceeded The new maxRetriesExceeded value.
     * @return This object for method chaining.
     */
    public ApiCallMonitoringEvent withMaxRetriesExceeded(int maxRetriesExceeded) {
        this.maxRetriesExceeded = maxRetriesExceeded;
        return this;
    }

    @Override
    public String getType() {
        return API_CALL_MONITORING_EVENT_TYPE;
    }
}
