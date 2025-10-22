package com.coinbase.prime.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;

public class Network {
    /**
     * The network id: base, bitcoin, ethereum, solana etc
     */
    private String id;

    /**
     * The network type: mainnet, testnet, etc
     */
    private String type;

    public Network() {
    }

    public Network(Builder builder) {
        this.id = builder.id;
        this.type = builder.type;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public static class Builder {
        private String id;

        private String type;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Network build() {
            return new Network(this);
        }
    }
}

