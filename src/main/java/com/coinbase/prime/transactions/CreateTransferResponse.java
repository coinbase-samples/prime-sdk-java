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

package com.coinbase.prime.transactions;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateTransferResponse {
    @JsonProperty("activity_id")
    private String activityId;
    @JsonProperty("approval_url")
    private String approvalUrl;
    private String symbol;
    private String amount;
    private String fee;
    @JsonProperty("destination_address")
    private String destinationAddress;
    @JsonProperty("destination_type")
    private String destinationType;
    @JsonProperty("source_address")
    private String sourceAddress;
    @JsonProperty("transaction_id")
    private String transactionId;

    public CreateTransferResponse() {
    }

    public CreateTransferResponse(Builder builder) {
        this.activityId = builder.activityId;
        this.approvalUrl = builder.approvalUrl;
        this.symbol = builder.symbol;
        this.amount = builder.amount;
        this.fee = builder.fee;
        this.destinationAddress = builder.destinationAddress;
        this.destinationType = builder.destinationType;
        this.sourceAddress = builder.sourceAddress;
        this.transactionId = builder.transactionId;
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public String getApprovalUrl() {
        return approvalUrl;
    }

    public void setApprovalUrl(String approvalUrl) {
        this.approvalUrl = approvalUrl;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public String getDestinationAddress() {
        return destinationAddress;
    }

    public void setDestinationAddress(String destinationAddress) {
        this.destinationAddress = destinationAddress;
    }

    public String getDestinationType() {
        return destinationType;
    }

    public void setDestinationType(String destinationType) {
        this.destinationType = destinationType;
    }

    public String getSourceAddress() {
        return sourceAddress;
    }

    public void setSourceAddress(String sourceAddress) {
        this.sourceAddress = sourceAddress;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public static class Builder {
        private String activityId;
        private String approvalUrl;
        private String symbol;
        private String amount;
        private String fee;
        private String destinationAddress;
        private String destinationType;
        private String sourceAddress;
        private String transactionId;

        public Builder() {
        }

        public Builder activityId(String activityId) {
            this.activityId = activityId;
            return this;
        }

        public Builder approvalUrl(String approvalUrl) {
            this.approvalUrl = approvalUrl;
            return this;
        }

        public Builder symbol(String symbol) {
            this.symbol = symbol;
            return this;
        }

        public Builder amount(String amount) {
            this.amount = amount;
            return this;
        }

        public Builder fee(String fee) {
            this.fee = fee;
            return this;
        }

        public Builder destinationAddress(String destinationAddress) {
            this.destinationAddress = destinationAddress;
            return this;
        }

        public Builder destinationType(String destinationType) {
            this.destinationType = destinationType;
            return this;
        }

        public Builder sourceAddress(String sourceAddress) {
            this.sourceAddress = sourceAddress;
            return this;
        }

        public Builder transactionId(String transactionId) {
            this.transactionId = transactionId;
            return this;
        }

        public CreateTransferResponse build() {
            return new CreateTransferResponse(this);
        }
    }
}
