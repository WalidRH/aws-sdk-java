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
package com.amazonaws.services.ebs;

import javax.annotation.Generated;

import com.amazonaws.services.ebs.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AmazonEBS}. Convenient method forms pass through to the corresponding overload that
 * takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonEBS implements AmazonEBS {

    protected AbstractAmazonEBS() {
    }

    @Override
    public CompleteSnapshotResult completeSnapshot(CompleteSnapshotRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetSnapshotBlockResult getSnapshotBlock(GetSnapshotBlockRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListChangedBlocksResult listChangedBlocks(ListChangedBlocksRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListSnapshotBlocksResult listSnapshotBlocks(ListSnapshotBlocksRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutSnapshotBlockResult putSnapshotBlock(PutSnapshotBlockRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StartSnapshotResult startSnapshot(StartSnapshotRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void shutdown() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public com.amazonaws.ResponseMetadata getCachedResponseMetadata(com.amazonaws.AmazonWebServiceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

}
