package com.coinbase.prime.model.transactions;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Transaction {
    private String id;
    @JsonProperty("wallet_id")
    private String walletId;
    @JsonProperty("portfolio_id")
    private String portfolioId;
    private TransactionType type;
    private TransactionStatus status;
    private String symbol;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("completed_at")
    private String completedAt;
    private String amount;
    @JsonProperty("transfer_from")
    private TransferLocation transferFrom;
    @JsonProperty("transfer_to")
    private TransferLocation transferTo;
    @JsonProperty("network_fees")
    private String networkFees;
    private String fees;
    @JsonProperty("fee_symbol")
    private String feeSymbol;
    @JsonProperty("blockchain_ids")
    private String[] blockchainIds;
    @JsonProperty("transaction_id")
    private String transactionId;
    @JsonProperty("destination_symbol")
    private String destinationSymbol;
    @JsonProperty("estimated_network_fees")
    private EstimatedNetworkFees estimatedNetworkFees;
    private String network;
    @JsonProperty("estimated_asset_changes")
    private AssetChange[] estimatedAssetChanges;
    private TransactionMetadata metadata;

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
        this.estimatedAssetChanges = builder.estimatedAssetChanges;
        this.network = builder.network;
        this.metadata = builder.metadata;
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

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getCompletedAt() {
        return completedAt;
    }

    public void setCompletedAt(String completedAt) {
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

    public String[] getBlockchainIds() {
        return blockchainIds;
    }

    public void setBlockchainIds(String[] blockchainIds) {
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

    public TransactionMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(TransactionMetadata metadata) {
        this.metadata = metadata;
    }

    public AssetChange[] getEstimatedAssetChanges() {
        return estimatedAssetChanges;
    }

    public void setEstimatedAssetChanges(AssetChange[] estimatedAssetChanges) {
        this.estimatedAssetChanges = estimatedAssetChanges;
    }

    public static class Builder {
        private String id;
        private String walletId;
        private String portfolioId;
        private TransactionType type;
        private TransactionStatus status;
        private String symbol;
        private String createdAt;
        private String completedAt;
        private String amount;
        private TransferLocation transferFrom;
        private TransferLocation transferTo;
        private String networkFees;
        private String fees;
        private String feeSymbol;
        private String[] blockchainIds;
        private String transactionId;
        private String destinationSymbol;
        private EstimatedNetworkFees estimatedNetworkFees;
        private AssetChange[] estimatedAssetChanges;
        private String network;
        private TransactionMetadata metadata;

        public Builder() {
        }

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

        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder completedAt(String completedAt) {
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

        public Builder blockchainIds(String[] blockchainIds) {
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

        public Builder estimatedAssetChanges(AssetChange[] estimatedAssetChanges) {
            this.estimatedAssetChanges = estimatedAssetChanges;
            return this;
        }

        public Builder metadata(TransactionMetadata metadata) {
            this.metadata = metadata;
            return this;
        }

        public Transaction build() {
            return new Transaction(this);
        }
    }
}
