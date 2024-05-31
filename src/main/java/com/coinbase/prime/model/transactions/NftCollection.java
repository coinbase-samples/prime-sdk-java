package com.coinbase.prime.model.transactions;

public class NftCollection {
    private String name;

    public NftCollection() {
    }

    public NftCollection(String name) {
        this.name = name;
    }

    public NftCollection(Builder builder) {
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

        public NftCollection build() {
            return new NftCollection(this);
        }
    }
}
