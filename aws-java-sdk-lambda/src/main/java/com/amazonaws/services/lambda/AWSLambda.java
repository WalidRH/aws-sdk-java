/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lambda;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.lambda.model.*;

/**
 * Interface for accessing AWS Lambda.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.lambda.AbstractAWSLambda} instead.
 * </p>
 * <p>
 * <fullname>AWS Lambda</fullname>
 * <p>
 * <b>Overview</b>
 * </p>
 * <p>
 * This is the <i>AWS Lambda API Reference</i>. The AWS Lambda Developer Guide provides additional information. For the
 * service overview, see <a href="http://docs.aws.amazon.com/lambda/latest/dg/welcome.html">What is AWS Lambda</a>, and
 * for information about how the service works, see <a
 * href="http://docs.aws.amazon.com/lambda/latest/dg/lambda-introduction.html">AWS Lambda: How it Works</a> in the
 * <b>AWS Lambda Developer Guide</b>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSLambda {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "lambda";

    /**
     * Overrides the default endpoint for this client ("lambda.us-east-1.amazonaws.com"). Callers can use this method to
     * control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "lambda.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "lambda.us-east-1.amazonaws.com"). If the protocol is not specified here, the default protocol from
     * this client's {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and a complete list of all available
     * endpoints for all AWS services, see: <a href=
     * "https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-choose-endpoint"
     * > https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-
     * choose-endpoint</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the client is created and before any
     * service requests are made. Changing it afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "lambda.us-east-1.amazonaws.com") or a full URL, including the protocol (ex:
     *        "lambda.us-east-1.amazonaws.com") of the region specific AWS endpoint this client will communicate with.
     * @deprecated use {@link AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration)} for
     *             example:
     *             {@code builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));}
     */
    @Deprecated
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AWSLambda#setEndpoint(String)}, sets the regional endpoint for this client's service
     * calls. Callers can use this method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol. To use http instead, specify it in the
     * {@link ClientConfiguration} supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the client is created and before any service
     * requests are made. Changing it afterwards creates inevitable race conditions for any service requests in transit
     * or retrying.</b>
     *
     * @param region
     *        The region this client will communicate with. See {@link Region#getRegion(com.amazonaws.regions.Regions)}
     *        for accessing a given region. Must not be null and must be a region where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see Region#isServiceSupported(String)
     * @deprecated use {@link AwsClientBuilder#setRegion(String)}
     */
    @Deprecated
    void setRegion(Region region);

    /**
     * <p>
     * Adds a permission to the resource policy associated with the specified AWS Lambda function. You use resource
     * policies to grant permissions to event sources that use the <i>push</i> model. In a <i>push</i> model, event
     * sources (such as Amazon S3 and custom applications) invoke your Lambda function. Each permission you add to the
     * resource policy allows an event source permission to invoke the Lambda function.
     * </p>
     * <p>
     * Permissions apply to the Amazon Resource Name (ARN) used to invoke the function, which can be unqualified (the
     * unpublished version of the function), or include a version or alias. If a client uses a version or alias to
     * invoke a function, use the <code>Qualifier</code> parameter to apply permissions to that ARN. For more
     * information about versioning, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS Lambda Function Versioning and
     * Aliases</a>.
     * </p>
     * <p>
     * This operation requires permission for the <code>lambda:AddPermission</code> action.
     * </p>
     * 
     * @param addPermissionRequest
     * @return Result of the AddPermission operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws ResourceConflictException
     *         The resource already exists.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @throws PolicyLengthExceededException
     *         Lambda function access policy is limited to 20 KB.
     * @throws TooManyRequestsException
     *         Request throughput limit exceeded
     * @throws PreconditionFailedException
     *         The RevisionId provided does not match the latest RevisionId for the Lambda function or alias. Call the
     *         <code>GetFunction</code> or the <code>GetAlias</code> API to retrieve the latest RevisionId for your
     *         resource.
     * @sample AWSLambda.AddPermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/AddPermission" target="_top">AWS API
     *      Documentation</a>
     */
    AddPermissionResult addPermission(AddPermissionRequest addPermissionRequest);

    /**
     * <p>
     * Creates an alias that points to the specified Lambda function version. For more information, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/aliases-intro.html">Introduction to AWS Lambda Aliases</a>.
     * </p>
     * <p>
     * Alias names are unique for a given function. This requires permission for the lambda:CreateAlias action.
     * </p>
     * 
     * @param createAliasRequest
     * @return Result of the CreateAlias operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws ResourceConflictException
     *         The resource already exists.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @throws TooManyRequestsException
     *         Request throughput limit exceeded
     * @sample AWSLambda.CreateAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/CreateAlias" target="_top">AWS API
     *      Documentation</a>
     */
    CreateAliasResult createAlias(CreateAliasRequest createAliasRequest);

    /**
     * <p>
     * Identifies a poll-based event source for a Lambda function. It can be either an Amazon Kinesis or DynamoDB
     * stream. AWS Lambda invokes the specified function when records are posted to the event source.
     * </p>
     * <p>
     * This association between a poll-based source and a Lambda function is called the event source mapping.
     * </p>
     * <p>
     * You provide mapping information (for example, which stream or SQS queue to read from and which Lambda function to
     * invoke) in the request body.
     * </p>
     * <p>
     * Amazon Kinesis or DynamoDB stream event sources can be associated with multiple AWS Lambda functions and a given
     * Lambda function can be associated with multiple AWS event sources. For Amazon SQS, you can configure multiple
     * queues as event sources for a single Lambda function, but an SQS queue can be mapped only to a single Lambda
     * function.
     * </p>
     * <p>
     * You can configure an SQS queue in an account separate from your Lambda function's account. Also the queue needs
     * to reside in the same AWS region as your function.
     * </p>
     * <p>
     * If you are using versioning, you can specify a specific function version or an alias via the function name
     * parameter. For more information about versioning, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS Lambda Function Versioning and
     * Aliases</a>.
     * </p>
     * <p>
     * This operation requires permission for the <code>lambda:CreateEventSourceMapping</code> action.
     * </p>
     * 
     * @param createEventSourceMappingRequest
     * @return Result of the CreateEventSourceMapping operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @throws ResourceConflictException
     *         The resource already exists.
     * @throws TooManyRequestsException
     *         Request throughput limit exceeded
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @sample AWSLambda.CreateEventSourceMapping
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/CreateEventSourceMapping"
     *      target="_top">AWS API Documentation</a>
     */
    CreateEventSourceMappingResult createEventSourceMapping(CreateEventSourceMappingRequest createEventSourceMappingRequest);

    /**
     * <p>
     * Creates a new Lambda function. The function configuration is created from the request parameters, and the code
     * for the function is provided by a .zip file. The function name is case-sensitive.
     * </p>
     * <p>
     * This operation requires permission for the <code>lambda:CreateFunction</code> action.
     * </p>
     * 
     * @param createFunctionRequest
     * @return Result of the CreateFunction operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws ResourceConflictException
     *         The resource already exists.
     * @throws TooManyRequestsException
     *         Request throughput limit exceeded
     * @throws CodeStorageExceededException
     *         You have exceeded your maximum total code size per account. <a
     *         href="http://docs.aws.amazon.com/lambda/latest/dg/limits.html">Limits</a>
     * @sample AWSLambda.CreateFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/CreateFunction" target="_top">AWS API
     *      Documentation</a>
     */
    CreateFunctionResult createFunction(CreateFunctionRequest createFunctionRequest);

    /**
     * <p>
     * Deletes the specified Lambda function alias. For more information, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/aliases-intro.html">Introduction to AWS Lambda Aliases</a>.
     * </p>
     * <p>
     * This requires permission for the lambda:DeleteAlias action.
     * </p>
     * 
     * @param deleteAliasRequest
     * @return Result of the DeleteAlias operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @throws TooManyRequestsException
     *         Request throughput limit exceeded
     * @sample AWSLambda.DeleteAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/DeleteAlias" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteAliasResult deleteAlias(DeleteAliasRequest deleteAliasRequest);

    /**
     * <p>
     * Removes an event source mapping. This means AWS Lambda will no longer invoke the function for events in the
     * associated source.
     * </p>
     * <p>
     * This operation requires permission for the <code>lambda:DeleteEventSourceMapping</code> action.
     * </p>
     * 
     * @param deleteEventSourceMappingRequest
     * @return Result of the DeleteEventSourceMapping operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @throws TooManyRequestsException
     *         Request throughput limit exceeded
     * @throws ResourceInUseException
     *         The operation conflicts with the resource's availability. For example, you attempted to update an
     *         EventSoure Mapping in CREATING, or tried to delete a EventSoure mapping currently in the UPDATING state.
     * @sample AWSLambda.DeleteEventSourceMapping
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/DeleteEventSourceMapping"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteEventSourceMappingResult deleteEventSourceMapping(DeleteEventSourceMappingRequest deleteEventSourceMappingRequest);

    /**
     * <p>
     * Deletes a Lambda function. To delete a specific function version, use the <code>Qualifier</code> parameter.
     * Otherwise, all versions and aliases are deleted. Event source mappings are not deleted.
     * </p>
     * <p>
     * This operation requires permission for the <code>lambda:DeleteFunction</code> action.
     * </p>
     * 
     * @param deleteFunctionRequest
     * @return Result of the DeleteFunction operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws TooManyRequestsException
     *         Request throughput limit exceeded
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @throws ResourceConflictException
     *         The resource already exists.
     * @sample AWSLambda.DeleteFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/DeleteFunction" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteFunctionResult deleteFunction(DeleteFunctionRequest deleteFunctionRequest);

    /**
     * <p>
     * Removes concurrent execution limits from this function. For more information, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/concurrent-executions.html">Managing Concurrency</a>.
     * </p>
     * 
     * @param deleteFunctionConcurrencyRequest
     * @return Result of the DeleteFunctionConcurrency operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws TooManyRequestsException
     *         Request throughput limit exceeded
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @sample AWSLambda.DeleteFunctionConcurrency
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/DeleteFunctionConcurrency"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteFunctionConcurrencyResult deleteFunctionConcurrency(DeleteFunctionConcurrencyRequest deleteFunctionConcurrencyRequest);

    /**
     * <p>
     * Retrieves details about your account's <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/limits.html">limits</a> and usage in a region.
     * </p>
     * 
     * @param getAccountSettingsRequest
     * @return Result of the GetAccountSettings operation returned by the service.
     * @throws TooManyRequestsException
     *         Request throughput limit exceeded
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @sample AWSLambda.GetAccountSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetAccountSettings" target="_top">AWS API
     *      Documentation</a>
     */
    GetAccountSettingsResult getAccountSettings(GetAccountSettingsRequest getAccountSettingsRequest);

    /**
     * <p>
     * Returns the specified alias information such as the alias ARN, description, and function version it is pointing
     * to. For more information, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/aliases-intro.html">Introduction to AWS Lambda Aliases</a>.
     * </p>
     * <p>
     * This requires permission for the <code>lambda:GetAlias</code> action.
     * </p>
     * 
     * @param getAliasRequest
     * @return Result of the GetAlias operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @throws TooManyRequestsException
     *         Request throughput limit exceeded
     * @sample AWSLambda.GetAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetAlias" target="_top">AWS API
     *      Documentation</a>
     */
    GetAliasResult getAlias(GetAliasRequest getAliasRequest);

    /**
     * <p>
     * Returns configuration information for the specified event source mapping (see <a>CreateEventSourceMapping</a>).
     * </p>
     * <p>
     * This operation requires permission for the <code>lambda:GetEventSourceMapping</code> action.
     * </p>
     * 
     * @param getEventSourceMappingRequest
     * @return Result of the GetEventSourceMapping operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @throws TooManyRequestsException
     *         Request throughput limit exceeded
     * @sample AWSLambda.GetEventSourceMapping
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetEventSourceMapping" target="_top">AWS
     *      API Documentation</a>
     */
    GetEventSourceMappingResult getEventSourceMapping(GetEventSourceMappingRequest getEventSourceMappingRequest);

    /**
     * <p>
     * Returns the configuration information of the Lambda function and a presigned URL link to the .zip file you
     * uploaded with <a>CreateFunction</a> so you can download the .zip file. Note that the URL is valid for up to 10
     * minutes. The configuration information is the same information you provided as parameters when uploading the
     * function.
     * </p>
     * <p>
     * Use the <code>Qualifier</code> parameter to retrieve a published version of the function. Otherwise, returns the
     * unpublished version (<code>$LATEST</code>). For more information, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS Lambda Function Versioning and
     * Aliases</a>.
     * </p>
     * <p>
     * This operation requires permission for the <code>lambda:GetFunction</code> action.
     * </p>
     * 
     * @param getFunctionRequest
     * @return Result of the GetFunction operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws TooManyRequestsException
     *         Request throughput limit exceeded
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @sample AWSLambda.GetFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetFunction" target="_top">AWS API
     *      Documentation</a>
     */
    GetFunctionResult getFunction(GetFunctionRequest getFunctionRequest);

    /**
     * <p>
     * Returns the configuration information of the Lambda function. This the same information you provided as
     * parameters when uploading the function by using <a>CreateFunction</a>.
     * </p>
     * <p>
     * If you are using the versioning feature, you can retrieve this information for a specific function version by
     * using the optional <code>Qualifier</code> parameter and specifying the function version or alias that points to
     * it. If you don't provide it, the API returns information about the $LATEST version of the function. For more
     * information about versioning, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS Lambda Function Versioning and
     * Aliases</a>.
     * </p>
     * <p>
     * This operation requires permission for the <code>lambda:GetFunctionConfiguration</code> operation.
     * </p>
     * 
     * @param getFunctionConfigurationRequest
     * @return Result of the GetFunctionConfiguration operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws TooManyRequestsException
     *         Request throughput limit exceeded
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @sample AWSLambda.GetFunctionConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetFunctionConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    GetFunctionConfigurationResult getFunctionConfiguration(GetFunctionConfigurationRequest getFunctionConfigurationRequest);

    /**
     * <p>
     * Returns the resource policy associated with the specified Lambda function.
     * </p>
     * <p>
     * This action requires permission for the <code>lambda:GetPolicy action.</code>
     * </p>
     * 
     * @param getPolicyRequest
     * @return Result of the GetPolicy operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws TooManyRequestsException
     *         Request throughput limit exceeded
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @sample AWSLambda.GetPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/GetPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    GetPolicyResult getPolicy(GetPolicyRequest getPolicyRequest);

    /**
     * <p>
     * Invokes a Lambda function. For an example, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/with-dynamodb-create-function.html#with-dbb-invoke-manually"
     * >Create the Lambda Function and Test It Manually</a>.
     * </p>
     * <p>
     * Specify just a function name to invoke the latest version of the function. To invoke a published version, use the
     * <code>Qualifier</code> parameter to specify a <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">version or alias</a>.
     * </p>
     * <p>
     * If you use the <code>RequestResponse</code> (synchronous) invocation option, the function will be invoked only
     * once. If you use the <code>Event</code> (asynchronous) invocation option, the function will be invoked at least
     * once in response to an event and the function must be idempotent to handle this.
     * </p>
     * <p>
     * For functions with a long timeout, your client may be disconnected during synchronous invocation while it waits
     * for a response. Configure your HTTP client, SDK, firewall, proxy, or operating system to allow for long
     * connections with timeout or keep-alive settings.
     * </p>
     * <p>
     * This operation requires permission for the <code>lambda:InvokeFunction</code> action.
     * </p>
     * <p>
     * The <code>TooManyRequestsException</code> noted below will return the following:
     * <code>ConcurrentInvocationLimitExceeded</code> will be returned if you have no functions with reserved
     * concurrency and have exceeded your account concurrent limit or if a function without reserved concurrency exceeds
     * the account's unreserved concurrency limit. <code>ReservedFunctionConcurrentInvocationLimitExceeded</code> will
     * be returned when a function with reserved concurrency exceeds its configured concurrency limit.
     * </p>
     * 
     * @param invokeRequest
     * @return Result of the Invoke operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws InvalidRequestContentException
     *         The request body could not be parsed as JSON.
     * @throws RequestTooLargeException
     *         The request payload exceeded the <code>Invoke</code> request body JSON input limit. For more information,
     *         see <a href="http://docs.aws.amazon.com/lambda/latest/dg/limits.html">Limits</a>.
     * @throws UnsupportedMediaTypeException
     *         The content type of the <code>Invoke</code> request body is not JSON.
     * @throws TooManyRequestsException
     *         Request throughput limit exceeded
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @throws EC2UnexpectedException
     *         AWS Lambda received an unexpected EC2 client exception while setting up for the Lambda function.
     * @throws SubnetIPAddressLimitReachedException
     *         AWS Lambda was not able to set up VPC access for the Lambda function because one or more configured
     *         subnets has no available IP addresses.
     * @throws ENILimitReachedException
     *         AWS Lambda was not able to create an Elastic Network Interface (ENI) in the VPC, specified as part of
     *         Lambda function configuration, because the limit for network interfaces has been reached.
     * @throws EC2ThrottledException
     *         AWS Lambda was throttled by Amazon EC2 during Lambda function initialization using the execution role
     *         provided for the Lambda function.
     * @throws EC2AccessDeniedException
     *         Need additional permissions to configure VPC settings.
     * @throws InvalidSubnetIDException
     *         The Subnet ID provided in the Lambda function VPC configuration is invalid.
     * @throws InvalidSecurityGroupIDException
     *         The Security Group ID provided in the Lambda function VPC configuration is invalid.
     * @throws InvalidZipFileException
     *         AWS Lambda could not unzip the deployment package.
     * @throws KMSDisabledException
     *         Lambda was unable to decrypt the environment variables because the KMS key used is disabled. Check the
     *         Lambda function's KMS key settings.
     * @throws KMSInvalidStateException
     *         Lambda was unable to decrypt the environment variables because the KMS key used is in an invalid state
     *         for Decrypt. Check the function's KMS key settings.
     * @throws KMSAccessDeniedException
     *         Lambda was unable to decrypt the environment variables because KMS access was denied. Check the Lambda
     *         function's KMS permissions.
     * @throws KMSNotFoundException
     *         Lambda was unable to decrypt the environment variables because the KMS key was not found. Check the
     *         function's KMS key settings.
     * @throws InvalidRuntimeException
     *         The runtime or runtime version specified is not supported.
     * @sample AWSLambda.Invoke
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/Invoke" target="_top">AWS API
     *      Documentation</a>
     */
    InvokeResult invoke(InvokeRequest invokeRequest);

    /**
     * <important>
     * <p>
     * For asynchronous function invocation, use <a>Invoke</a>.
     * </p>
     * </important>
     * <p>
     * Submits an invocation request to AWS Lambda. Upon receiving the request, Lambda executes the specified function
     * asynchronously. To see the logs generated by the Lambda function execution, see the CloudWatch Logs console.
     * </p>
     * <p>
     * This operation requires permission for the <code>lambda:InvokeFunction</code> action.
     * </p>
     * 
     * @param invokeAsyncRequest
     * @return Result of the InvokeAsync operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws InvalidRequestContentException
     *         The request body could not be parsed as JSON.
     * @throws InvalidRuntimeException
     *         The runtime or runtime version specified is not supported.
     * @sample AWSLambda.InvokeAsync
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/InvokeAsync" target="_top">AWS API
     *      Documentation</a>
     */
    @Deprecated
    InvokeAsyncResult invokeAsync(InvokeAsyncRequest invokeAsyncRequest);

    /**
     * <p>
     * Returns list of aliases created for a Lambda function. For each alias, the response includes information such as
     * the alias ARN, description, alias name, and the function version to which it points. For more information, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/aliases-intro.html">Introduction to AWS Lambda Aliases</a>.
     * </p>
     * <p>
     * This requires permission for the lambda:ListAliases action.
     * </p>
     * 
     * @param listAliasesRequest
     * @return Result of the ListAliases operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @throws TooManyRequestsException
     *         Request throughput limit exceeded
     * @sample AWSLambda.ListAliases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ListAliases" target="_top">AWS API
     *      Documentation</a>
     */
    ListAliasesResult listAliases(ListAliasesRequest listAliasesRequest);

    /**
     * <p>
     * Returns a list of event source mappings you created using the <code>CreateEventSourceMapping</code> (see
     * <a>CreateEventSourceMapping</a>).
     * </p>
     * <p>
     * For each mapping, the API returns configuration information. You can optionally specify filters to retrieve
     * specific event source mappings.
     * </p>
     * <p>
     * This operation requires permission for the <code>lambda:ListEventSourceMappings</code> action.
     * </p>
     * 
     * @param listEventSourceMappingsRequest
     * @return Result of the ListEventSourceMappings operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @throws TooManyRequestsException
     *         Request throughput limit exceeded
     * @sample AWSLambda.ListEventSourceMappings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ListEventSourceMappings" target="_top">AWS
     *      API Documentation</a>
     */
    ListEventSourceMappingsResult listEventSourceMappings(ListEventSourceMappingsRequest listEventSourceMappingsRequest);

    /**
     * Simplified method form for invoking the ListEventSourceMappings operation.
     *
     * @see #listEventSourceMappings(ListEventSourceMappingsRequest)
     */
    ListEventSourceMappingsResult listEventSourceMappings();

    /**
     * <p>
     * Returns a list of your Lambda functions. For each function, the response includes the function configuration
     * information. You must use <a>GetFunction</a> to retrieve the code for your function.
     * </p>
     * <p>
     * This operation requires permission for the <code>lambda:ListFunctions</code> action.
     * </p>
     * <p>
     * If you are using the versioning feature, you can list all of your functions or only <code>$LATEST</code>
     * versions. For information about the versioning feature, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS Lambda Function Versioning and
     * Aliases</a>.
     * </p>
     * 
     * @param listFunctionsRequest
     * @return Result of the ListFunctions operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws TooManyRequestsException
     *         Request throughput limit exceeded
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @sample AWSLambda.ListFunctions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ListFunctions" target="_top">AWS API
     *      Documentation</a>
     */
    ListFunctionsResult listFunctions(ListFunctionsRequest listFunctionsRequest);

    /**
     * Simplified method form for invoking the ListFunctions operation.
     *
     * @see #listFunctions(ListFunctionsRequest)
     */
    ListFunctionsResult listFunctions();

    /**
     * <p>
     * Returns a list of tags assigned to a function when supplied the function ARN (Amazon Resource Name). For more
     * information on Tagging, see <a href="http://docs.aws.amazon.com/lambda/latest/dg/tagging.html">Tagging Lambda
     * Functions</a> in the <b>AWS Lambda Developer Guide</b>.
     * </p>
     * 
     * @param listTagsRequest
     * @return Result of the ListTags operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @throws TooManyRequestsException
     *         Request throughput limit exceeded
     * @sample AWSLambda.ListTags
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ListTags" target="_top">AWS API
     *      Documentation</a>
     */
    ListTagsResult listTags(ListTagsRequest listTagsRequest);

    /**
     * <p>
     * Lists all versions of a function. For information about versioning, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS Lambda Function Versioning and
     * Aliases</a>.
     * </p>
     * 
     * @param listVersionsByFunctionRequest
     * @return Result of the ListVersionsByFunction operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @throws TooManyRequestsException
     *         Request throughput limit exceeded
     * @sample AWSLambda.ListVersionsByFunction
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/ListVersionsByFunction" target="_top">AWS
     *      API Documentation</a>
     */
    ListVersionsByFunctionResult listVersionsByFunction(ListVersionsByFunctionRequest listVersionsByFunctionRequest);

    /**
     * <p>
     * Publishes a version of your function from the current snapshot of $LATEST. That is, AWS Lambda takes a snapshot
     * of the function code and configuration information from $LATEST and publishes a new version. The code and
     * configuration cannot be modified after publication. For information about the versioning feature, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS Lambda Function Versioning and
     * Aliases</a>.
     * </p>
     * 
     * @param publishVersionRequest
     * @return Result of the PublishVersion operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @throws TooManyRequestsException
     *         Request throughput limit exceeded
     * @throws CodeStorageExceededException
     *         You have exceeded your maximum total code size per account. <a
     *         href="http://docs.aws.amazon.com/lambda/latest/dg/limits.html">Limits</a>
     * @throws PreconditionFailedException
     *         The RevisionId provided does not match the latest RevisionId for the Lambda function or alias. Call the
     *         <code>GetFunction</code> or the <code>GetAlias</code> API to retrieve the latest RevisionId for your
     *         resource.
     * @sample AWSLambda.PublishVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/PublishVersion" target="_top">AWS API
     *      Documentation</a>
     */
    PublishVersionResult publishVersion(PublishVersionRequest publishVersionRequest);

    /**
     * <p>
     * Sets a limit on the number of concurrent executions available to this function. It is a subset of your account's
     * total concurrent execution limit per region. Note that Lambda automatically reserves a buffer of 100 concurrent
     * executions for functions without any reserved concurrency limit. This means if your account limit is 1000, you
     * have a total of 900 available to allocate to individual functions. For more information, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/concurrent-executions.html">Managing Concurrency</a>.
     * </p>
     * 
     * @param putFunctionConcurrencyRequest
     * @return Result of the PutFunctionConcurrency operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws TooManyRequestsException
     *         Request throughput limit exceeded
     * @sample AWSLambda.PutFunctionConcurrency
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/PutFunctionConcurrency" target="_top">AWS
     *      API Documentation</a>
     */
    PutFunctionConcurrencyResult putFunctionConcurrency(PutFunctionConcurrencyRequest putFunctionConcurrencyRequest);

    /**
     * <p>
     * Removes permissions from a function. You can remove individual permissions from an resource policy associated
     * with a Lambda function by providing a statement ID that you provided when you added the permission. When you
     * remove permissions, disable the event source mapping or trigger configuration first to avoid errors.
     * </p>
     * <p>
     * Permissions apply to the Amazon Resource Name (ARN) used to invoke the function, which can be unqualified (the
     * unpublished version of the function), or include a version or alias. If a client uses a version or alias to
     * invoke a function, use the <code>Qualifier</code> parameter to apply permissions to that ARN. For more
     * information about versioning, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS Lambda Function Versioning and
     * Aliases</a>.
     * </p>
     * <p>
     * You need permission for the <code>lambda:RemovePermission</code> action.
     * </p>
     * 
     * @param removePermissionRequest
     * @return Result of the RemovePermission operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @throws TooManyRequestsException
     *         Request throughput limit exceeded
     * @throws PreconditionFailedException
     *         The RevisionId provided does not match the latest RevisionId for the Lambda function or alias. Call the
     *         <code>GetFunction</code> or the <code>GetAlias</code> API to retrieve the latest RevisionId for your
     *         resource.
     * @sample AWSLambda.RemovePermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/RemovePermission" target="_top">AWS API
     *      Documentation</a>
     */
    RemovePermissionResult removePermission(RemovePermissionRequest removePermissionRequest);

    /**
     * <p>
     * Creates a list of tags (key-value pairs) on the Lambda function. Requires the Lambda function ARN (Amazon
     * Resource Name). If a key is specified without a value, Lambda creates a tag with the specified key and a value of
     * null. For more information, see <a href="http://docs.aws.amazon.com/lambda/latest/dg/tagging.html">Tagging Lambda
     * Functions</a> in the <b>AWS Lambda Developer Guide</b>.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @throws TooManyRequestsException
     *         Request throughput limit exceeded
     * @sample AWSLambda.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes tags from a Lambda function. Requires the function ARN (Amazon Resource Name). For more information, see
     * <a href="http://docs.aws.amazon.com/lambda/latest/dg/tagging.html">Tagging Lambda Functions</a> in the <b>AWS
     * Lambda Developer Guide</b>.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @throws TooManyRequestsException
     *         Request throughput limit exceeded
     * @sample AWSLambda.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Using this API you can update the function version to which the alias points and the alias description. For more
     * information, see <a href="http://docs.aws.amazon.com/lambda/latest/dg/aliases-intro.html">Introduction to AWS
     * Lambda Aliases</a>.
     * </p>
     * <p>
     * This requires permission for the lambda:UpdateAlias action.
     * </p>
     * 
     * @param updateAliasRequest
     * @return Result of the UpdateAlias operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @throws TooManyRequestsException
     *         Request throughput limit exceeded
     * @throws PreconditionFailedException
     *         The RevisionId provided does not match the latest RevisionId for the Lambda function or alias. Call the
     *         <code>GetFunction</code> or the <code>GetAlias</code> API to retrieve the latest RevisionId for your
     *         resource.
     * @sample AWSLambda.UpdateAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/UpdateAlias" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateAliasResult updateAlias(UpdateAliasRequest updateAliasRequest);

    /**
     * <p>
     * You can update an event source mapping. This is useful if you want to change the parameters of the existing
     * mapping without losing your position in the stream. You can change which function will receive the stream
     * records, but to change the stream itself, you must create a new mapping.
     * </p>
     * <p>
     * If you disable the event source mapping, AWS Lambda stops polling. If you enable again, it will resume polling
     * from the time it had stopped polling, so you don't lose processing of any records. However, if you delete event
     * source mapping and create it again, it will reset.
     * </p>
     * <p>
     * This operation requires permission for the <code>lambda:UpdateEventSourceMapping</code> action.
     * </p>
     * 
     * @param updateEventSourceMappingRequest
     * @return Result of the UpdateEventSourceMapping operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @throws TooManyRequestsException
     *         Request throughput limit exceeded
     * @throws ResourceConflictException
     *         The resource already exists.
     * @throws ResourceInUseException
     *         The operation conflicts with the resource's availability. For example, you attempted to update an
     *         EventSoure Mapping in CREATING, or tried to delete a EventSoure mapping currently in the UPDATING state.
     * @sample AWSLambda.UpdateEventSourceMapping
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/UpdateEventSourceMapping"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateEventSourceMappingResult updateEventSourceMapping(UpdateEventSourceMappingRequest updateEventSourceMappingRequest);

    /**
     * <p>
     * Updates the code for the specified Lambda function. This operation must only be used on an existing Lambda
     * function and cannot be used to update the function configuration.
     * </p>
     * <p>
     * If you are using the versioning feature, note this API will always update the $LATEST version of your Lambda
     * function. For information about the versioning feature, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS Lambda Function Versioning and
     * Aliases</a>.
     * </p>
     * <p>
     * This operation requires permission for the <code>lambda:UpdateFunctionCode</code> action.
     * </p>
     * 
     * @param updateFunctionCodeRequest
     * @return Result of the UpdateFunctionCode operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @throws TooManyRequestsException
     *         Request throughput limit exceeded
     * @throws CodeStorageExceededException
     *         You have exceeded your maximum total code size per account. <a
     *         href="http://docs.aws.amazon.com/lambda/latest/dg/limits.html">Limits</a>
     * @throws PreconditionFailedException
     *         The RevisionId provided does not match the latest RevisionId for the Lambda function or alias. Call the
     *         <code>GetFunction</code> or the <code>GetAlias</code> API to retrieve the latest RevisionId for your
     *         resource.
     * @sample AWSLambda.UpdateFunctionCode
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/UpdateFunctionCode" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateFunctionCodeResult updateFunctionCode(UpdateFunctionCodeRequest updateFunctionCodeRequest);

    /**
     * <p>
     * Updates the configuration parameters for the specified Lambda function by using the values provided in the
     * request. You provide only the parameters you want to change. This operation must only be used on an existing
     * Lambda function and cannot be used to update the function's code.
     * </p>
     * <p>
     * If you are using the versioning feature, note this API will always update the $LATEST version of your Lambda
     * function. For information about the versioning feature, see <a
     * href="http://docs.aws.amazon.com/lambda/latest/dg/versioning-aliases.html">AWS Lambda Function Versioning and
     * Aliases</a>.
     * </p>
     * <p>
     * This operation requires permission for the <code>lambda:UpdateFunctionConfiguration</code> action.
     * </p>
     * 
     * @param updateFunctionConfigurationRequest
     * @return Result of the UpdateFunctionConfiguration operation returned by the service.
     * @throws ServiceException
     *         The AWS Lambda service encountered an internal error.
     * @throws ResourceNotFoundException
     *         The resource (for example, a Lambda function or access policy statement) specified in the request does
     *         not exist.
     * @throws InvalidParameterValueException
     *         One of the parameters in the request is invalid. For example, if you provided an IAM role for AWS Lambda
     *         to assume in the <code>CreateFunction</code> or the <code>UpdateFunctionConfiguration</code> API, that
     *         AWS Lambda is unable to assume you will get this exception.
     * @throws TooManyRequestsException
     *         Request throughput limit exceeded
     * @throws ResourceConflictException
     *         The resource already exists.
     * @throws PreconditionFailedException
     *         The RevisionId provided does not match the latest RevisionId for the Lambda function or alias. Call the
     *         <code>GetFunction</code> or the <code>GetAlias</code> API to retrieve the latest RevisionId for your
     *         resource.
     * @sample AWSLambda.UpdateFunctionConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/UpdateFunctionConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateFunctionConfigurationResult updateFunctionConfiguration(UpdateFunctionConfigurationRequest updateFunctionConfigurationRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}
