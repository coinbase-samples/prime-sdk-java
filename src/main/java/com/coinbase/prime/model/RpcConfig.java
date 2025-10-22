package com.coinbase.prime.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;

public class RpcConfig {
    /**
     * If true, transaction will not be broadcast to the network
     */
    private Boolean skipBroadcast;

    /**
     * Custom blockchain node RPC URL. (EVM-only)
     */
    private String url;

    public RpcConfig() {
    }

    public RpcConfig(Builder builder) {
        this.skipBroadcast = builder.skipBroadcast;
        this.url = builder.url;
    }
    public Boolean getSkipBroadcast() {
        return skipBroadcast;
    }

    public void setSkipBroadcast(Boolean skipBroadcast) {
        this.skipBroadcast = skipBroadcast;
    }
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    public static class Builder {
        private Boolean skipBroadcast;

        private String url;

        public Builder skipBroadcast(Boolean skipBroadcast) {
            this.skipBroadcast = skipBroadcast;
            return this;
        }

        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public RpcConfig build() {
            return new RpcConfig(this);
        }
    }
}

