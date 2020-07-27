// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Entity Type3Reference Request.
 */
public class EntityType3ReferenceRequest extends BaseRequest implements IEntityType3ReferenceRequest {

    /**
     * The request for the EntityType3
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EntityType3ReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EntityType3.class);
    }

    public void delete(final ICallback<EntityType3> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public EntityType3 delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IEntityType3ReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (EntityType3ReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IEntityType3ReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (EntityType3ReferenceRequest)this;
    }
    /**
     * Puts the EntityType3
     *
     * @param srcEntityType3 the EntityType3 reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(EntityType3 srcEntityType3, final ICallback<EntityType3> callback) {
        send(HttpMethod.PUT, callback, srcEntityType3);
    }

    /**
     * Puts the EntityType3
     *
     * @param srcEntityType3 the EntityType3 reference to PUT
     * @return the EntityType3
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public EntityType3 put(EntityType3 srcEntityType3) throws ClientException {
        return send(HttpMethod.PUT, srcEntityType3);
    }
}
