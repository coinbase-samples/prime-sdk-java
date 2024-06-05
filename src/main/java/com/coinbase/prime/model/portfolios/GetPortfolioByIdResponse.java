/*
 * *
 *  * Copyright 2024-present Coinbase Global, Inc.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *  http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package com.coinbase.prime.model.portfolios;

public class GetPortfolioByIdResponse {
    private Portfolio portfolio;
    private GetPortfolioByIdRequest request;

    public GetPortfolioByIdResponse(Portfolio portfolio, GetPortfolioByIdRequest request) {
        this.portfolio = portfolio;
        this.request = request;
    }

    public GetPortfolioByIdResponse(Builder builder) {
        this.portfolio = builder.portfolio;
        this.request = builder.request;
    }

    public GetPortfolioByIdResponse() {}

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public GetPortfolioByIdRequest getRequest() {
        return request;
    }

    public void setRequest(GetPortfolioByIdRequest request) {
        this.request = request;
    }

    public static class Builder {
        private Portfolio portfolio;
        private GetPortfolioByIdRequest request;

        public Builder() {
        }

        public Builder portfolio(Portfolio portfolio) {
            this.portfolio = portfolio;
            return this;
        }

        public Builder request(GetPortfolioByIdRequest request) {
            this.request = request;
            return this;
        }

        public GetPortfolioByIdResponse build() {
            return new GetPortfolioByIdResponse(this);
        }
    }
}
