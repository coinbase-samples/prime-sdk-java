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

package com.coinbase.prime.model.transactions;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateConversionResponse {
    @JsonProperty("activity_id")
    private String activityId;
    @JsonProperty("source_symbol")
    private String sourceSymbol;
    @JsonProperty("destination_symbol")
    private String destinationSymbol;
    private String amount;
    private String destination;
    private String source;
    private CreateConversionRequest request;

    public CreateConversionResponse() {
    }

    public CreateConversionResponse(Builder builder) {
        this.activityId = builder.activityId;
        this.sourceSymbol = builder.sourceSymbol;
        this.destinationSymbol = builder.destinationSymbol;
        this.amount = builder.amount;
        this.destination = builder.destination;
        this.source = builder.source;
        this.request = builder.request;
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public String getSourceSymbol() {
        return sourceSymbol;
    }

    public void setSourceSymbol(String sourceSymbol) {
        this.sourceSymbol = sourceSymbol;
    }

    public String getDestinationSymbol() {
        return destinationSymbol;
    }

    public void setDestinationSymbol(String destinationSymbol) {
        this.destinationSymbol = destinationSymbol;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public CreateConversionRequest getRequest() {
        return request;
    }

    public void setRequest(CreateConversionRequest request) {
        this.request = request;
    }

    public static class Builder {
        private String activityId;
        private String sourceSymbol;
        private String destinationSymbol;
        private String amount;
        private String destination;
        private String source;
        private CreateConversionRequest request;

        public Builder() {
        }

        public Builder activityId(String activityId) {
            this.activityId = activityId;
            return this;
        }

        public Builder sourceSymbol(String sourceSymbol) {
            this.sourceSymbol = sourceSymbol;
            return this;
        }

        public Builder destinationSymbol(String destinationSymbol) {
            this.destinationSymbol = destinationSymbol;
            return this;
        }

        public Builder amount(String amount) {
            this.amount = amount;
            return this;
        }

        public Builder destination(String destination) {
            this.destination = destination;
            return this;
        }

        public Builder source(String source) {
            this.source = source;
            return this;
        }

        public Builder request(CreateConversionRequest request) {
            this.request = request;
            return this;
        }

        public CreateConversionResponse build() {
            return new CreateConversionResponse(this);
        }
    }
}
