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
package com.amazonaws.services.amplifybackend.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.amplifybackend.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateBackendAuthUserPoolConfigMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateBackendAuthUserPoolConfigMarshaller {

    private static final MarshallingInfo<StructuredPojo> FORGOTPASSWORD_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("forgotPassword").build();
    private static final MarshallingInfo<StructuredPojo> MFA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("mfa").build();
    private static final MarshallingInfo<StructuredPojo> OAUTH_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("oAuth").build();
    private static final MarshallingInfo<StructuredPojo> PASSWORDPOLICY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("passwordPolicy").build();

    private static final UpdateBackendAuthUserPoolConfigMarshaller instance = new UpdateBackendAuthUserPoolConfigMarshaller();

    public static UpdateBackendAuthUserPoolConfigMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateBackendAuthUserPoolConfig updateBackendAuthUserPoolConfig, ProtocolMarshaller protocolMarshaller) {

        if (updateBackendAuthUserPoolConfig == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateBackendAuthUserPoolConfig.getForgotPassword(), FORGOTPASSWORD_BINDING);
            protocolMarshaller.marshall(updateBackendAuthUserPoolConfig.getMfa(), MFA_BINDING);
            protocolMarshaller.marshall(updateBackendAuthUserPoolConfig.getOAuth(), OAUTH_BINDING);
            protocolMarshaller.marshall(updateBackendAuthUserPoolConfig.getPasswordPolicy(), PASSWORDPOLICY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
