/*
 * Copyright 2025-present Coinbase Global, Inc.
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
 */

package com.coinbase.prime.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Rpc {
    @JsonProperty("skip_broadcast")
    private boolean skipBroadcast;

    private String url;

    public Rpc() {
    }

    public Rpc(Builder builder) {
        this.skipBroadcast = builder.skipBroadcast;
        this.url = builder.url;
    }

    public boolean isSkipBroadcast() {
        return skipBroadcast;
    }

    public void setSkipBroadcast(boolean skipBroadcast) {
        this.skipBroadcast = skipBroadcast;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public static class Builder {
        private boolean skipBroadcast;
        private String url;

        public Builder() {
        }

        public Builder skipBroadcast(boolean skipBroadcast) {
            this.skipBroadcast = skipBroadcast;
            return this;
        }

        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public Rpc build() {
            return new Rpc(this);
        }
    }
}
