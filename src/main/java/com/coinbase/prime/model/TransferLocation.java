package com.coinbase.prime.model;

import com.coinbase.prime.model.enums.TransferLocationType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;

public class TransferLocation {
    private TransferLocationType type;

    /**
     * The value of the transfer location: payment method ID, wallet ID or crypto address
     */
    private String value;

    /**
     * The crypto address of the transfer location
     */
    private String address;

    /**
     * The tag/memo of the address, if applicable -- required for certain assets (e.g. XRP, XLM, etc.)
     */
    private String accountIdentifier;

    public TransferLocation() {
    }

    public TransferLocation(Builder builder) {
        this.type = builder.type;
        this.value = builder.value;
        this.address = builder.address;
        this.accountIdentifier = builder.accountIdentifier;
    }
    public TransferLocationType getType() {
        return type;
    }

    public void setType(TransferLocationType type) {
        this.type = type;
    }
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
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
        private TransferLocationType type;

        private String value;

        private String address;

        private String accountIdentifier;

        public Builder type(TransferLocationType type) {
            this.type = type;
            return this;
        }

        public Builder value(String value) {
            this.value = value;
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

        public TransferLocation build() {
            return new TransferLocation(this);
        }
    }
}

