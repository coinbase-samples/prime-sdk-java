package com.coinbase.prime.model.transactions;

public class NftItem {
    private String name;

    public NftItem() {
    }

    public NftItem(String name) {
        this.name = name;
    }

    public NftItem(Builder builder) {
        this.name = builder.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static class Builder {
        private String name;

        public Builder() {
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public NftItem build() {
            return new NftItem(this);
        }
    }
}
