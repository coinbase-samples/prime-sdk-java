package com.coinbase.prime.model.wallets;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CryptoDepositInstructions {
    private String id;
    private String name;
    private String address;
    private DepositType type;
    @JsonProperty("account_identifier")
    private String accountIdentifier;

    public CryptoDepositInstructions() {
    }

    public CryptoDepositInstructions(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.address = builder.address;
        this.type = builder.type;
        this.accountIdentifier = builder.accountIdentifier;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public DepositType getType() {
        return type;
    }

    public void setType(DepositType type) {
        this.type = type;
    }

    public String getAccountIdentifier() {
        return accountIdentifier;
    }

    public void setAccountIdentifier(String accountIdentifier) {
        this.accountIdentifier = accountIdentifier;
    }

    public static class Builder {
        private String id;
        private String name;
        private String address;
        private DepositType type;
        private String accountIdentifier;

        public Builder() {
        }

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder type(DepositType type) {
            this.type = type;
            return this;
        }

        public Builder accountIdentifier(String accountIdentifier) {
            this.accountIdentifier = accountIdentifier;
            return this;
        }

        public CryptoDepositInstructions build() {
            return new CryptoDepositInstructions(this);
        }
    }
}
