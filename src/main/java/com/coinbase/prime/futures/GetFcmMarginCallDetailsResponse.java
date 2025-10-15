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

package com.coinbase.prime.futures;

import com.coinbase.prime.model.FcmMarginCall;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class GetFcmMarginCallDetailsResponse {
    @JsonProperty("margin_calls")
    private List<FcmMarginCall> marginCalls;

    public GetFcmMarginCallDetailsResponse() {
    }

    public GetFcmMarginCallDetailsResponse(Builder builder) {
        this.marginCalls = builder.marginCalls;
    }

    public List<FcmMarginCall> getMarginCalls() {
        return marginCalls;
    }

    public void setMarginCalls(List<FcmMarginCall> marginCalls) {
        this.marginCalls = marginCalls;
    }

    public static class Builder {
        private List<FcmMarginCall> marginCalls;

        public Builder() {
        }

        public Builder marginCalls(List<FcmMarginCall> marginCalls) {
            this.marginCalls = marginCalls;
            return this;
        }

        public GetFcmMarginCallDetailsResponse build() {
            return new GetFcmMarginCallDetailsResponse(this);
        }
    }
}
