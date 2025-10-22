package com.coinbase.prime.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddressEntry {
    private String name;

    private String address;

    private List<String> chainIds;

    public AddressEntry() {
    }

    public AddressEntry(Builder builder) {
        this.name = builder.name;
        this.address = builder.address;
        this.chainIds = builder.chainIds;
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
    public List<String> getChainIds() {
        return chainIds;
    }

    public void setChainIds(List<String> chainIds) {
        this.chainIds = chainIds;
    }
    public static class Builder {
        private String name;

        private String address;

        private List<String> chainIds;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder chainIds(List<String> chainIds) {
            this.chainIds = chainIds;
            return this;
        }

        public AddressEntry build() {
            return new AddressEntry(this);
        }
    }
}

