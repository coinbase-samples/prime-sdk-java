package com.coinbase.prime.model;

import com.coinbase.prime.model.enums.VisibilityStatus;
import com.coinbase.prime.model.OnchainAsset;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;

public class OnchainBalance {
    private OnchainAsset asset;

    /**
     * The total amount in whole units with full precision.
     */
    private String amount;

    private VisibilityStatus visibilityStatus;

    public OnchainBalance() {
    }

    public OnchainBalance(Builder builder) {
        this.asset = builder.asset;
        this.amount = builder.amount;
        this.visibilityStatus = builder.visibilityStatus;
    }
    public OnchainAsset getAsset() {
        return asset;
    }

    public void setAsset(OnchainAsset asset) {
        this.asset = asset;
    }
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
    public VisibilityStatus getVisibilityStatus() {
        return visibilityStatus;
    }

    public void setVisibilityStatus(VisibilityStatus visibilityStatus) {
        this.visibilityStatus = visibilityStatus;
    }
    public static class Builder {
        private OnchainAsset asset;

        private String amount;

        private VisibilityStatus visibilityStatus;

        public Builder asset(OnchainAsset asset) {
            this.asset = asset;
            return this;
        }

        public Builder amount(String amount) {
            this.amount = amount;
            return this;
        }

        public Builder visibilityStatus(VisibilityStatus visibilityStatus) {
            this.visibilityStatus = visibilityStatus;
            return this;
        }

        public OnchainBalance build() {
            return new OnchainBalance(this);
        }
    }
}

