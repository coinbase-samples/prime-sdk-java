/*
 * Copyright 2024-present Coinbase Global, Inc.
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

package com.coinbase.prime.model.commission;

public class GetPortfolioCommissionResponse {
    private Commission commission;
    private GetPortfolioCommissionRequest request;

    public GetPortfolioCommissionResponse() {
    }

    public GetPortfolioCommissionResponse(Builder builder) {
        this.commission = builder.commission;
        this.request = builder.request;
    }

    public Commission getCommission() {
        return commission;
    }

    public void setCommission(Commission commission) {
        this.commission = commission;
    }

    public GetPortfolioCommissionRequest getRequest() {
        return request;
    }

    public void setRequest(GetPortfolioCommissionRequest request) {
        this.request = request;
    }

    public static class Builder {
        private Commission commission;
        private GetPortfolioCommissionRequest request;

        public Builder() {
        }

        public Builder commission(Commission commission) {
            this.commission = commission;
            return this;
        }

        public Builder request(GetPortfolioCommissionRequest request) {
            this.request = request;
            return this;
        }

        public GetPortfolioCommissionResponse build() {
            return new GetPortfolioCommissionResponse(this);
        }
    }
}
