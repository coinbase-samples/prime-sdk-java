package com.coinbase.prime.model.transactions;

public class AssetChange {
    private AssetChangeType type;
    private String symbol;
    private String amount;
    private NftCollection collection;
    private NftItem item;

    public AssetChange() {
    }

    public AssetChange(Builder builder) {
        this.type = builder.type;
        this.symbol = builder.symbol;
        this.amount = builder.amount;
        this.collection = builder.collection;
        this.item = builder.item;
    }

    public AssetChangeType getType() {
        return type;
    }

    public void setType(AssetChangeType type) {
        this.type = type;
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

    public NftCollection getCollection() {
        return collection;
    }

    public void setCollection(NftCollection collection) {
        this.collection = collection;
    }

    public NftItem getItem() {
        return item;
    }

    public void setItem(NftItem item) {
        this.item = item;
    }

    public static class Builder {
        private AssetChangeType type;
        private String symbol;
        private String amount;
        private NftCollection collection;
        private NftItem item;

        public Builder() {
        }

        public Builder type(AssetChangeType type) {
            this.type = type;
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

        public Builder collection(NftCollection collection) {
            this.collection = collection;
            return this;
        }

        public Builder item(NftItem item) {
            this.item = item;
            return this;
        }

        public AssetChange build() {
            return new AssetChange(this);
        }
    }
}
