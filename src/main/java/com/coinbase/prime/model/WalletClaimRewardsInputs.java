package com.coinbase.prime.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;

public class WalletClaimRewardsInputs {
    /**
     * Optional amount to claim rewards (ETH only). If omitted, the wallet will claim the maximum amount available
     */
    private String amount;

    public WalletClaimRewardsInputs() {
    }

    public WalletClaimRewardsInputs(Builder builder) {
        this.amount = builder.amount;
    }
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
    public static class Builder {
        private String amount;

        public Builder amount(String amount) {
            this.amount = amount;
            return this;
        }

        public WalletClaimRewardsInputs build() {
            return new WalletClaimRewardsInputs(this);
        }
    }
}

