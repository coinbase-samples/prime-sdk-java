/*
 *
 *  Copyright 2024-present Coinbase Global, Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package com.coinbase.prime.model.orders;

public class CancelOrderResponse {
    private String id;
    private CancelOrderRequest request;

    public CancelOrderResponse() {
    }

    public CancelOrderResponse(Builder builder) {
        this.id = builder.id;
        this.request = builder.request;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CancelOrderRequest getRequest() {
        return request;
    }

    public void setRequest(CancelOrderRequest request) {
        this.request = request;
    }

    public static class Builder {
        private String id;
        private CancelOrderRequest request;

        public Builder() {
        }

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder request(CancelOrderRequest request) {
            this.request = request;
            return this;
        }

        public CancelOrderResponse build() {
            return new CancelOrderResponse(this);
        }
    }
}
