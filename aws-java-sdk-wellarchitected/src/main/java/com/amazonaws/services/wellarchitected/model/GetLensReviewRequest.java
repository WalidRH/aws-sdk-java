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
package com.amazonaws.services.wellarchitected.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Input to get lens review.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/GetLensReview" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetLensReviewRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String workloadId;

    private String lensAlias;

    private Integer milestoneNumber;

    /**
     * @param workloadId
     */

    public void setWorkloadId(String workloadId) {
        this.workloadId = workloadId;
    }

    /**
     * @return
     */

    public String getWorkloadId() {
        return this.workloadId;
    }

    /**
     * @param workloadId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLensReviewRequest withWorkloadId(String workloadId) {
        setWorkloadId(workloadId);
        return this;
    }

    /**
     * @param lensAlias
     */

    public void setLensAlias(String lensAlias) {
        this.lensAlias = lensAlias;
    }

    /**
     * @return
     */

    public String getLensAlias() {
        return this.lensAlias;
    }

    /**
     * @param lensAlias
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLensReviewRequest withLensAlias(String lensAlias) {
        setLensAlias(lensAlias);
        return this;
    }

    /**
     * @param milestoneNumber
     */

    public void setMilestoneNumber(Integer milestoneNumber) {
        this.milestoneNumber = milestoneNumber;
    }

    /**
     * @return
     */

    public Integer getMilestoneNumber() {
        return this.milestoneNumber;
    }

    /**
     * @param milestoneNumber
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetLensReviewRequest withMilestoneNumber(Integer milestoneNumber) {
        setMilestoneNumber(milestoneNumber);
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
        if (getWorkloadId() != null)
            sb.append("WorkloadId: ").append(getWorkloadId()).append(",");
        if (getLensAlias() != null)
            sb.append("LensAlias: ").append(getLensAlias()).append(",");
        if (getMilestoneNumber() != null)
            sb.append("MilestoneNumber: ").append(getMilestoneNumber());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetLensReviewRequest == false)
            return false;
        GetLensReviewRequest other = (GetLensReviewRequest) obj;
        if (other.getWorkloadId() == null ^ this.getWorkloadId() == null)
            return false;
        if (other.getWorkloadId() != null && other.getWorkloadId().equals(this.getWorkloadId()) == false)
            return false;
        if (other.getLensAlias() == null ^ this.getLensAlias() == null)
            return false;
        if (other.getLensAlias() != null && other.getLensAlias().equals(this.getLensAlias()) == false)
            return false;
        if (other.getMilestoneNumber() == null ^ this.getMilestoneNumber() == null)
            return false;
        if (other.getMilestoneNumber() != null && other.getMilestoneNumber().equals(this.getMilestoneNumber()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWorkloadId() == null) ? 0 : getWorkloadId().hashCode());
        hashCode = prime * hashCode + ((getLensAlias() == null) ? 0 : getLensAlias().hashCode());
        hashCode = prime * hashCode + ((getMilestoneNumber() == null) ? 0 : getMilestoneNumber().hashCode());
        return hashCode;
    }

    @Override
    public GetLensReviewRequest clone() {
        return (GetLensReviewRequest) super.clone();
    }

}
