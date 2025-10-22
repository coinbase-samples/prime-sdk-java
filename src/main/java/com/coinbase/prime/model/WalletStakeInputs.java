package com.coinbase.prime.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;

public class WalletStakeInputs {
    /**
     * Optional amount to stake (ETH only). If omitted, the wallet will stake the maximum amount available
     */
    private String amount;

    /**
     * Optional validator address, defaults to Coinbase validator. For SOL, must be the vote account address. Ignored for ETH.
     */
    private String validatorAddress;

    public WalletStakeInputs() {
    }

    public WalletStakeInputs(Builder builder) {
        this.amount = builder.amount;
        this.validatorAddress = builder.validatorAddress;
    }
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
    public String getValidatorAddress() {
        return validatorAddress;
    }

    public void setValidatorAddress(String validatorAddress) {
        this.validatorAddress = validatorAddress;
    }
    public static class Builder {
        private String amount;

        private String validatorAddress;

        public Builder amount(String amount) {
            this.amount = amount;
            return this;
        }

        public Builder validatorAddress(String validatorAddress) {
            this.validatorAddress = validatorAddress;
            return this;
        }

        public WalletStakeInputs build() {
            return new WalletStakeInputs(this);
        }
    }
}

