package com.coinbase.prime.model;

import com.coinbase.prime.model.enums.WalletDepositInstructionType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;

public class WalletFiatDepositInstructions {
    private String id;

    private String name;

    private WalletDepositInstructionType type;

    private String accountNumber;

    private String routingNumber;

    private String referenceCode;

    public WalletFiatDepositInstructions() {
    }

    public WalletFiatDepositInstructions(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.type = builder.type;
        this.accountNumber = builder.accountNumber;
        this.routingNumber = builder.routingNumber;
        this.referenceCode = builder.referenceCode;
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
    public WalletDepositInstructionType getType() {
        return type;
    }

    public void setType(WalletDepositInstructionType type) {
        this.type = type;
    }
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getRoutingNumber() {
        return routingNumber;
    }

    public void setRoutingNumber(String routingNumber) {
        this.routingNumber = routingNumber;
    }
    public String getReferenceCode() {
        return referenceCode;
    }

    public void setReferenceCode(String referenceCode) {
        this.referenceCode = referenceCode;
    }
    public static class Builder {
        private String id;

        private String name;

        private WalletDepositInstructionType type;

        private String accountNumber;

        private String routingNumber;

        private String referenceCode;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder type(WalletDepositInstructionType type) {
            this.type = type;
            return this;
        }

        public Builder accountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
            return this;
        }

        public Builder routingNumber(String routingNumber) {
            this.routingNumber = routingNumber;
            return this;
        }

        public Builder referenceCode(String referenceCode) {
            this.referenceCode = referenceCode;
            return this;
        }

        public WalletFiatDepositInstructions build() {
            return new WalletFiatDepositInstructions(this);
        }
    }
}

