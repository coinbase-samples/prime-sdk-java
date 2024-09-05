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

package com.coinbase.prime.model.transactions;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateWithdrawalResponse {
    @JsonProperty("activity_id")
    private String activityId;
    @JsonProperty("approval_url")
    private String approvalUrl;
    private String symbol;
    private String amount;
    private String fee;
    @JsonProperty("destination_type")
    private DestinationType destinationType;
    @JsonProperty("source_type")
    private String sourceType;
    @JsonProperty("blockchain_destination")
    private BlockchainAddress blockchainDestination;
    @JsonProperty("blockchain_source")
    private BlockchainAddress blockchainSource;
    @JsonProperty("transaction_id")
    private String transactionId;

    public CreateWithdrawalResponse() {
    }

    public CreateWithdrawalResponse(Builder builder) {
        this.activityId = builder.activityId;
        this.approvalUrl = builder.approvalUrl;
        this.symbol = builder.symbol;
        this.amount = builder.amount;
        this.fee = builder.fee;
        this.destinationType = builder.destinationType;
        this.sourceType = builder.sourceType;
        this.blockchainDestination = builder.blockchainDestination;
        this.blockchainSource = builder.blockchainSource;
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

    public DestinationType getDestinationType() {
        return destinationType;
    }

    public void setDestinationType(DestinationType destinationType) {
        this.destinationType = destinationType;
    }

    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public BlockchainAddress getBlockchainDestination() {
        return blockchainDestination;
    }

    public void setBlockchainDestination(BlockchainAddress blockchainDestination) {
        this.blockchainDestination = blockchainDestination;
    }

    public BlockchainAddress getBlockchainSource() {
        return blockchainSource;
    }

    public void setBlockchainSource(BlockchainAddress blockchainSource) {
        this.blockchainSource = blockchainSource;
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
        private DestinationType destinationType;
        private String sourceType;
        private BlockchainAddress blockchainDestination;
        private BlockchainAddress blockchainSource;
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

        public Builder destinationType(DestinationType destinationType) {
            this.destinationType = destinationType;
            return this;
        }

        public Builder sourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }

        public Builder blockchainDestination(BlockchainAddress blockchainDestination) {
            this.blockchainDestination = blockchainDestination;
            return this;
        }

        public Builder blockchainSource(BlockchainAddress blockchainSource) {
            this.blockchainSource = blockchainSource;
            return this;
        }

        public Builder transactionId(String transactionId) {
            this.transactionId = transactionId;
            return this;
        }

        public CreateWithdrawalResponse build() {
            return new CreateWithdrawalResponse(this);
        }
    }
}
