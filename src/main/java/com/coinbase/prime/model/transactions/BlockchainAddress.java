package com.coinbase.prime.model.transactions;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BlockchainAddress {
    private String address;
    @JsonProperty("account_identifier")
    private String accountIdentifier;

    public BlockchainAddress() {
    }

    public BlockchainAddress(Builder builder) {
        this.address = builder.address;
        this.accountIdentifier = builder.accountIdentifier;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAccountIdentifier() {
        return accountIdentifier;
    }

    public void setAccountIdentifier(String accountIdentifier) {
        this.accountIdentifier = accountIdentifier;
    }

    public static class Builder {
        private String address;
        private String accountIdentifier;

        public Builder() {
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder accountIdentifier(String accountIdentifier) {
            this.accountIdentifier = accountIdentifier;
            return this;
        }

        public BlockchainAddress build() {
            return new BlockchainAddress(this);
        }
    }
}
