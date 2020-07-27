// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph2.callrecords.requests.extensions;
import com.microsoft.graph2.callrecords.requests.extensions.ICallRecordRequest;
import com.microsoft.graph2.callrecords.requests.extensions.CallRecordRequest;
import com.microsoft.graph2.callrecords.requests.extensions.ISessionCollectionRequestBuilder;
import com.microsoft.graph2.callrecords.requests.extensions.SessionCollectionRequestBuilder;
import com.microsoft.graph2.callrecords.requests.extensions.ISessionRequestBuilder;
import com.microsoft.graph2.callrecords.requests.extensions.SessionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEntityType2CollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.EntityType2CollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEntityType2RequestBuilder;
import com.microsoft.graph.requests.extensions.EntityType2RequestBuilder;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Call Record Request Builder.
 */
public class CallRecordRequestBuilder extends BaseRequestBuilder implements ICallRecordRequestBuilder {

    /**
     * The request builder for the CallRecord
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CallRecordRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the ICallRecordRequest instance
     */
    public ICallRecordRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the ICallRecordRequest instance
     */
    public ICallRecordRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new CallRecordRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public ISessionCollectionRequestBuilder sessions() {
        return new SessionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("sessions"), getClient(), null);
    }

    public ISessionRequestBuilder sessions(final String id) {
        return new SessionRequestBuilder(getRequestUrlWithAdditionalSegment("sessions") + "/" + id, getClient(), null);
    }
    public IEntityType2CollectionRequestBuilder recipients() {
        return new EntityType2CollectionRequestBuilder(getRequestUrlWithAdditionalSegment("recipients"), getClient(), null);
    }

    public IEntityType2RequestBuilder recipients(final String id) {
        return new EntityType2RequestBuilder(getRequestUrlWithAdditionalSegment("recipients") + "/" + id, getClient(), null);
    }
}

