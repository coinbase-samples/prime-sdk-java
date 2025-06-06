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

package com.coinbase.prime.financing;

import com.coinbase.prime.model.PostTradeCreditInformation;

public class GetPortfolioCreditInformationResponse {
    private PostTradeCreditInformation postTradeCredit;

    public GetPortfolioCreditInformationResponse() {
    }

    public GetPortfolioCreditInformationResponse(Builder builder) {
        this.postTradeCredit = builder.postTradeCredit;
    }

    public PostTradeCreditInformation getPostTradeCredit() {
        return postTradeCredit;
    }

    public void setPortfolioCreditInformation(PostTradeCreditInformation postTradeCredit) {
        this.postTradeCredit = postTradeCredit;
    }

    public static class Builder {
        private PostTradeCreditInformation postTradeCredit;

        public Builder() {
        }

        public Builder postTradeCredit(PostTradeCreditInformation postTradeCredit) {
            this.postTradeCredit = postTradeCredit;
            return this;
        }

        public GetPortfolioCreditInformationResponse build() {
            return new GetPortfolioCreditInformationResponse(this);
        }
    }
}
