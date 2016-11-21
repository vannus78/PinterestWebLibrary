/*
 * The MIT License
 *
 * Copyright 2016 Stefano Vannucci.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.pinterestweblibrary.types;

import com.pinterestweblibrary.types.commons.TypeClientContext;
import com.pinterestweblibrary.types.pin.TypeResource;
import com.pinterestweblibrary.types.pin.TypeResourceDataCache;
import com.pinterestweblibrary.types.pin.TypeResourceResponse;

/**
 *
 * @author Stefano Vannucci
 */
public class TypeResponsePin {
    private String request_identifier = "";
    private TypeResourceDataCache [] resource_data_cache = null;
    private TypeResource resource = new TypeResource();
    private TypeClientContext client_context = new TypeClientContext();
    private TypeResourceResponse resource_response = new TypeResourceResponse();

    public String getRequest_identifier() {
        return request_identifier;
    }

    public void setRequest_identifier(String request_identifier) {
        this.request_identifier = request_identifier;
    }

    public TypeResourceDataCache[] getResource_data_cache() {
        return resource_data_cache;
    }

    public void setResource_data_cache(TypeResourceDataCache[] resource_data_cache) {
        this.resource_data_cache = resource_data_cache;
    }

    public TypeResource getResource() {
        return resource;
    }

    public void setResource(TypeResource resource) {
        this.resource = resource;
    }

    public TypeClientContext getClient_context() {
        return client_context;
    }

    public void setClient_context(TypeClientContext client_context) {
        this.client_context = client_context;
    }

    public TypeResourceResponse getResource_response() {
        return resource_response;
    }

    public void setResource_response(TypeResourceResponse resource_response) {
        this.resource_response = resource_response;
    }
}
