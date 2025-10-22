package com.coinbase.prime.model;

import com.coinbase.prime.model.enums.MarginAddOnType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;

public class MarginAddOn {
    /**
     * margin add on amount
     */
    private String amount;

    private MarginAddOnType addOnType;

    public MarginAddOn() {
    }

    public MarginAddOn(Builder builder) {
        this.amount = builder.amount;
        this.addOnType = builder.addOnType;
    }
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
    public MarginAddOnType getAddOnType() {
        return addOnType;
    }

    public void setAddOnType(MarginAddOnType addOnType) {
        this.addOnType = addOnType;
    }
    public static class Builder {
        private String amount;

        private MarginAddOnType addOnType;

        public Builder amount(String amount) {
            this.amount = amount;
            return this;
        }

        public Builder addOnType(MarginAddOnType addOnType) {
            this.addOnType = addOnType;
            return this;
        }

        public MarginAddOn build() {
            return new MarginAddOn(this);
        }
    }
}

