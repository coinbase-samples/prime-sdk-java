package com.coinbase.prime.model;

import com.coinbase.prime.model.AssetChange;
import com.coinbase.prime.model.EstimatedNetworkFees;
import com.coinbase.prime.model.Network;
import com.coinbase.prime.model.OnchainTransactionDetails;
import com.coinbase.prime.model.TransactionMetadata;
import com.coinbase.prime.model.enums.TransactionStatus;
import com.coinbase.prime.model.enums.TransactionType;
import com.coinbase.prime.model.TransferLocation;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Transaction {
    /**
     * The ID of the transaction
     */
    private String id;

    /**
     * The wallet ID of the transaction
     */
    private String walletId;

    /**
     * The portfolio ID of the transaction
     */
    private String portfolioId;

    private TransactionType type;

    private TransactionStatus status;

    /**
     * The asset symbol
     */
    private String symbol;

    /**
     * The transaction creation time (as a UTC timestamp)
     */
    private OffsetDateTime createdAt;

    /**
     * The transaction completion time (as a UTC timestamp)
     */
    private OffsetDateTime completedAt;

    /**
     * The transaction amount in whole units
     */
    private String amount;

    private TransferLocation transferFrom;

    private TransferLocation transferTo;

    /**
     * The blockchain network fees (in whole units) required in order to broadcast the transaction
     */
    private String networkFees;

    /**
     * The fees that the customer paid for the transaction (in whole units)
     */
    private String fees;

    /**
     * The asset in which fees will be paid
     */
    private String feeSymbol;

    /**
     * The cryptocurrency network transaction hashes/IDs generated upon broadcast
     */
    private List<String> blockchainIds;

    /**
     * The 8 character alphanumeric short form id for the transaction
     */
    private String transactionId;

    /**
     * The destination asset symbol
     */
    private String destinationSymbol;

    private EstimatedNetworkFees estimatedNetworkFees;

    /**
     * The network name specific to onchain/onchain wallet transactions
     */
    private String network;

    /**
     * The estimated asset changes (onchain)
     */
    private List<AssetChange> estimatedAssetChanges;

    private TransactionMetadata metadata;

    /**
     * The idempotency key associated with the transaction creation request
     */
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
        this.blockchainIds = builder.blockchainIds;
        this.transactionId = builder.transactionId;
        this.destinationSymbol = builder.destinationSymbol;
        this.estimatedNetworkFees = builder.estimatedNetworkFees;
        this.network = builder.network;
        this.estimatedAssetChanges = builder.estimatedAssetChanges;
        this.metadata = builder.metadata;
        this.idempotencyKey = builder.idempotencyKey;
        this.onchainDetails = builder.onchainDetails;
        this.networkInfo = builder.networkInfo;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getWalletId() {
        return walletId;
    }

    public void setWalletId(String walletId) {
        this.walletId = walletId;
    }
    public String getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }
    public TransactionType getType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }
    public TransactionStatus getStatus() {
        return status;
    }

    public void setStatus(TransactionStatus status) {
        this.status = status;
    }
    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }
    public OffsetDateTime getCompletedAt() {
        return completedAt;
    }

    public void setCompletedAt(OffsetDateTime completedAt) {
        this.completedAt = completedAt;
    }
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
    public TransferLocation getTransferFrom() {
        return transferFrom;
    }

    public void setTransferFrom(TransferLocation transferFrom) {
        this.transferFrom = transferFrom;
    }
    public TransferLocation getTransferTo() {
        return transferTo;
    }

    public void setTransferTo(TransferLocation transferTo) {
        this.transferTo = transferTo;
    }
    public String getNetworkFees() {
        return networkFees;
    }

    public void setNetworkFees(String networkFees) {
        this.networkFees = networkFees;
    }
    public String getFees() {
        return fees;
    }

    public void setFees(String fees) {
        this.fees = fees;
    }
    public String getFeeSymbol() {
        return feeSymbol;
    }

    public void setFeeSymbol(String feeSymbol) {
        this.feeSymbol = feeSymbol;
    }
    public List<String> getBlockchainIds() {
        return blockchainIds;
    }

    public void setBlockchainIds(List<String> blockchainIds) {
        this.blockchainIds = blockchainIds;
    }
    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
    public String getDestinationSymbol() {
        return destinationSymbol;
    }

    public void setDestinationSymbol(String destinationSymbol) {
        this.destinationSymbol = destinationSymbol;
    }
    public EstimatedNetworkFees getEstimatedNetworkFees() {
        return estimatedNetworkFees;
    }

    public void setEstimatedNetworkFees(EstimatedNetworkFees estimatedNetworkFees) {
        this.estimatedNetworkFees = estimatedNetworkFees;
    }
    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }
    public List<AssetChange> getEstimatedAssetChanges() {
        return estimatedAssetChanges;
    }

    public void setEstimatedAssetChanges(List<AssetChange> estimatedAssetChanges) {
        this.estimatedAssetChanges = estimatedAssetChanges;
    }
    public TransactionMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(TransactionMetadata metadata) {
        this.metadata = metadata;
    }
    public String getIdempotencyKey() {
        return idempotencyKey;
    }

    public void setIdempotencyKey(String idempotencyKey) {
        this.idempotencyKey = idempotencyKey;
    }
    public OnchainTransactionDetails getOnchainDetails() {
        return onchainDetails;
    }

    public void setOnchainDetails(OnchainTransactionDetails onchainDetails) {
        this.onchainDetails = onchainDetails;
    }
    public Network getNetworkInfo() {
        return networkInfo;
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

        private List<String> blockchainIds;

        private String transactionId;

        private String destinationSymbol;

        private EstimatedNetworkFees estimatedNetworkFees;

        private String network;

        private List<AssetChange> estimatedAssetChanges;

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

        public Builder blockchainIds(List<String> blockchainIds) {
            this.blockchainIds = blockchainIds;
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

        public Builder estimatedAssetChanges(List<AssetChange> estimatedAssetChanges) {
            this.estimatedAssetChanges = estimatedAssetChanges;
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

