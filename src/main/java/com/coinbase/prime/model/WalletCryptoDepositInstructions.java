package com.coinbase.prime.model;

import com.coinbase.prime.model.Network;
import com.coinbase.prime.model.enums.WalletDepositInstructionType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;

public class WalletCryptoDepositInstructions {
    /**
     * The ID of the wallet
     */
    private String id;

    /**
     * The name of the wallet
     */
    private String name;

    private WalletDepositInstructionType type;

    /**
     * The address of the wallet
     */
    private String address;

    /**
     * The tag/memo of the address, if applicable -- required for certain assets (e.g. XRP, XLM, etc.)
     */
    private String accountIdentifier;

    /**
     * The blockchain network&#39;s terminology for the unique identifier used to identify the receiver of the transaction (different blockchain networks use different names, such as &#x60;destination_tag&#x60; or &#x60;memo&#x60;)
     */
    private String accountIdentifierName;

    private Network network;

    public WalletCryptoDepositInstructions() {
    }

    public WalletCryptoDepositInstructions(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.type = builder.type;
        this.address = builder.address;
        this.accountIdentifier = builder.accountIdentifier;
        this.accountIdentifierName = builder.accountIdentifierName;
        this.network = builder.network;
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
    public String getAccountIdentifierName() {
        return accountIdentifierName;
    }

    public void setAccountIdentifierName(String accountIdentifierName) {
        this.accountIdentifierName = accountIdentifierName;
    }
    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }
    public static class Builder {
        private String id;

        private String name;

        private WalletDepositInstructionType type;

        private String address;

        private String accountIdentifier;

        private String accountIdentifierName;

        private Network network;

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

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder accountIdentifier(String accountIdentifier) {
            this.accountIdentifier = accountIdentifier;
            return this;
        }

        public Builder accountIdentifierName(String accountIdentifierName) {
            this.accountIdentifierName = accountIdentifierName;
            return this;
        }

        public Builder network(Network network) {
            this.network = network;
            return this;
        }

        public WalletCryptoDepositInstructions build() {
            return new WalletCryptoDepositInstructions(this);
        }
    }
}

