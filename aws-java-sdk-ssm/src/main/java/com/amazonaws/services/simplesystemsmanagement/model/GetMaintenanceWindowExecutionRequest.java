/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/GetMaintenanceWindowExecution" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMaintenanceWindowExecutionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the maintenance window execution that includes the task.
     * </p>
     */
    private String windowExecutionId;

    /**
     * <p>
     * The ID of the maintenance window execution that includes the task.
     * </p>
     * 
     * @param windowExecutionId
     *        The ID of the maintenance window execution that includes the task.
     */

    public void setWindowExecutionId(String windowExecutionId) {
        this.windowExecutionId = windowExecutionId;
    }

    /**
     * <p>
     * The ID of the maintenance window execution that includes the task.
     * </p>
     * 
     * @return The ID of the maintenance window execution that includes the task.
     */

    public String getWindowExecutionId() {
        return this.windowExecutionId;
    }

    /**
     * <p>
     * The ID of the maintenance window execution that includes the task.
     * </p>
     * 
     * @param windowExecutionId
     *        The ID of the maintenance window execution that includes the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMaintenanceWindowExecutionRequest withWindowExecutionId(String windowExecutionId) {
        setWindowExecutionId(windowExecutionId);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getWindowExecutionId() != null)
            sb.append("WindowExecutionId: ").append(getWindowExecutionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMaintenanceWindowExecutionRequest == false)
            return false;
        GetMaintenanceWindowExecutionRequest other = (GetMaintenanceWindowExecutionRequest) obj;
        if (other.getWindowExecutionId() == null ^ this.getWindowExecutionId() == null)
            return false;
        if (other.getWindowExecutionId() != null && other.getWindowExecutionId().equals(this.getWindowExecutionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWindowExecutionId() == null) ? 0 : getWindowExecutionId().hashCode());
        return hashCode;
    }

    @Override
    public GetMaintenanceWindowExecutionRequest clone() {
        return (GetMaintenanceWindowExecutionRequest) super.clone();
    }

}
