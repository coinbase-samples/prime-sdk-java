// Copyright 2024-present Coinbase Global, Inc.
//
//  Licensed under the Apache License, Version 2.0 (the "License");
//  you may not use this file except in compliance with the License.
//  You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
//  Unless required by applicable law or agreed to in writing, software
//  distributed under the License is distributed on an "AS IS" BASIS,
//  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//  See the License for the specific language governing permissions and
//  limitations under the License.
package com.coinbase.prime.model;

import com.coinbase.prime.model.enums.TransactionStatus;
import com.coinbase.prime.model.enums.TransactionType;
import java.time.OffsetDateTime;

public class Transaction {
    private String id;

    private String walletId;

    private String portfolioId;

    private TransactionType type;

    private TransactionStatus status;

    private String symbol;

    private OffsetDateTime createdAt;

    private OffsetDateTime completedAt;

    private String amount;

    private TransferLocation transferFrom;

    private TransferLocation transferTo;

    private String networkFees;

    private String fees;

    private String feeSymbol;

    private String transactionId;

    private String destinationSymbol;

    private EstimatedNetworkFees estimatedNetworkFees;

    private String network;

    private TransactionMetadata metadata;

    private String idempotencyKey;

    private OnchainTransactionDetails onchainDetails;

    private Network networkInfo;

    public Transaction() {
    }

    public Transaction(Builder builder) {
        this.id = builder.id;
        this.walletId = builder.walletId;
        this.portfolioId = builder.portfolioId;
        this.type = builder.type;
        this.status = builder.status;
        this.symbol = builder.symbol;
        this.createdAt = builder.createdAt;
        this.completedAt = builder.completedAt;
        this.amount = builder.amount;
        this.transferFrom = builder.transferFrom;
        this.transferTo = builder.transferTo;
        this.networkFees = builder.networkFees;
        this.fees = builder.fees;
        this.feeSymbol = builder.feeSymbol;
        this.transactionId = builder.transactionId;
        this.destinationSymbol = builder.destinationSymbol;
        this.estimatedNetworkFees = builder.estimatedNetworkFees;
        this.network = builder.network;
        this.metadata = builder.metadata;
        this.idempotencyKey = builder.idempotencyKey;
        this.onchainDetails = builder.onchainDetails;
        this.networkInfo = builder.networkInfo;
    }

    public String getId() {
        return id;
    }

    public String getWalletId() {
        return walletId;
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public TransactionType getType() {
        return type;
    }

    public TransactionStatus getStatus() {
        return status;
    }

    public String getSymbol() {
        return symbol;
    }

    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public OffsetDateTime getCompletedAt() {
        return completedAt;
    }

    public String getAmount() {
        return amount;
    }

    public TransferLocation getTransferFrom() {
        return transferFrom;
    }

    public TransferLocation getTransferTo() {
        return transferTo;
    }

    public String getNetworkFees() {
        return networkFees;
    }

    public String getFees() {
        return fees;
    }

    public String getFeeSymbol() {
        return feeSymbol;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public String getDestinationSymbol() {
        return destinationSymbol;
    }

    public EstimatedNetworkFees getEstimatedNetworkFees() {
        return estimatedNetworkFees;
    }

    public String getNetwork() {
        return network;
    }

    public TransactionMetadata getMetadata() {
        return metadata;
    }

    public String getIdempotencyKey() {
        return idempotencyKey;
    }

    public OnchainTransactionDetails getOnchainDetails() {
        return onchainDetails;
    }

    public Network getNetworkInfo() {
        return networkInfo;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setWalletId(String walletId) {
        this.walletId = walletId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }

    public void setStatus(TransactionStatus status) {
        this.status = status;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setCompletedAt(OffsetDateTime completedAt) {
        this.completedAt = completedAt;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void setTransferFrom(TransferLocation transferFrom) {
        this.transferFrom = transferFrom;
    }

    public void setTransferTo(TransferLocation transferTo) {
        this.transferTo = transferTo;
    }

    public void setNetworkFees(String networkFees) {
        this.networkFees = networkFees;
    }

    public void setFees(String fees) {
        this.fees = fees;
    }

    public void setFeeSymbol(String feeSymbol) {
        this.feeSymbol = feeSymbol;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public void setDestinationSymbol(String destinationSymbol) {
        this.destinationSymbol = destinationSymbol;
    }

    public void setEstimatedNetworkFees(EstimatedNetworkFees estimatedNetworkFees) {
        this.estimatedNetworkFees = estimatedNetworkFees;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public void setMetadata(TransactionMetadata metadata) {
        this.metadata = metadata;
    }

    public void setIdempotencyKey(String idempotencyKey) {
        this.idempotencyKey = idempotencyKey;
    }

    public void setOnchainDetails(OnchainTransactionDetails onchainDetails) {
        this.onchainDetails = onchainDetails;
    }

    public void setNetworkInfo(Network networkInfo) {
        this.networkInfo = networkInfo;
    }

    public static class Builder {
        private String id;

        private String walletId;

        private String portfolioId;

        private TransactionType type;

        private TransactionStatus status;

        private String symbol;

        private OffsetDateTime createdAt;

        private OffsetDateTime completedAt;

        private String amount;

        private TransferLocation transferFrom;

        private TransferLocation transferTo;

        private String networkFees;

        private String fees;

        private String feeSymbol;

        private String transactionId;

        private String destinationSymbol;

        private EstimatedNetworkFees estimatedNetworkFees;

        private String network;

        private TransactionMetadata metadata;

        private String idempotencyKey;

        private OnchainTransactionDetails onchainDetails;

        private Network networkInfo;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder walletId(String walletId) {
            this.walletId = walletId;
            return this;
        }

        public Builder portfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public Builder type(TransactionType type) {
            this.type = type;
            return this;
        }

        public Builder status(TransactionStatus status) {
            this.status = status;
            return this;
        }

        public Builder symbol(String symbol) {
            this.symbol = symbol;
            return this;
        }

        public Builder createdAt(OffsetDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder completedAt(OffsetDateTime completedAt) {
            this.completedAt = completedAt;
            return this;
        }

        public Builder amount(String amount) {
            this.amount = amount;
            return this;
        }

        public Builder transferFrom(TransferLocation transferFrom) {
            this.transferFrom = transferFrom;
            return this;
        }

        public Builder transferTo(TransferLocation transferTo) {
            this.transferTo = transferTo;
            return this;
        }

        public Builder networkFees(String networkFees) {
            this.networkFees = networkFees;
            return this;
        }

        public Builder fees(String fees) {
            this.fees = fees;
            return this;
        }

        public Builder feeSymbol(String feeSymbol) {
            this.feeSymbol = feeSymbol;
            return this;
        }

        public Builder transactionId(String transactionId) {
            this.transactionId = transactionId;
            return this;
        }

        public Builder destinationSymbol(String destinationSymbol) {
            this.destinationSymbol = destinationSymbol;
            return this;
        }

        public Builder estimatedNetworkFees(EstimatedNetworkFees estimatedNetworkFees) {
            this.estimatedNetworkFees = estimatedNetworkFees;
            return this;
        }

        public Builder network(String network) {
            this.network = network;
            return this;
        }

        public Builder metadata(TransactionMetadata metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder idempotencyKey(String idempotencyKey) {
            this.idempotencyKey = idempotencyKey;
            return this;
        }

        public Builder onchainDetails(OnchainTransactionDetails onchainDetails) {
            this.onchainDetails = onchainDetails;
            return this;
        }

        public Builder networkInfo(Network networkInfo) {
            this.networkInfo = networkInfo;
            return this;
        }

        public Transaction build() {
            return new Transaction(this);
        }
    }
}
