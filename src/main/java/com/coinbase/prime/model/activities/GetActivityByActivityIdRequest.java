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

package com.coinbase.prime.model.activities;

import com.coinbase.core.errors.CoinbaseClientException;
import com.coinbase.core.http.CoinbaseGetRequest;
import com.fasterxml.jackson.annotation.JsonProperty;

import static com.coinbase.core.utils.Utils.isNullOrEmpty;

public class GetActivityByActivityIdRequest extends CoinbaseGetRequest {
    @JsonProperty(required = true, value = "portfolio_id")
    private String portfolioId;
    @JsonProperty(required = true, value = "activity_id")
    private String activityId;

    public GetActivityByActivityIdRequest() {
    }

    public GetActivityByActivityIdRequest(Builder builder) {
        this.portfolioId = builder.portfolioId;
        this.activityId = builder.activityId;
    }

    @Override
    protected String getQueryString() {
        return "";
    }

    @Override
    public String getPath() {
        return String.format("/portfolios/%s/activities/%s", this.getPortfolioId(), this.getActivityId());
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public static class Builder {
        private String portfolioId;
        private String activityId;

        public Builder() {
        }

        public Builder activityId(String activityId) {
            this.activityId = activityId;
            return this;
        }

        public GetActivityByActivityIdRequest build() throws CoinbaseClientException {
            this.validate();
            return new GetActivityByActivityIdRequest(this);
        }

        private void validate() {
            if (isNullOrEmpty(activityId)) {
                throw new CoinbaseClientException("ActivityId is required");
            }

            if (isNullOrEmpty(portfolioId)) {
                throw new CoinbaseClientException("PortfolioId is required");
            }
        }
    }
}
