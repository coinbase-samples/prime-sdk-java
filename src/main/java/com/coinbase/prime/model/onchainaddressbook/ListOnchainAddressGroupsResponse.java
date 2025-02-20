package com.coinbase.prime.model.onchainaddressbook;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ListOnchainAddressGroupsResponse {
    @JsonProperty("address_groups")
    private AddressGroup[] addressGroups;

    public ListOnchainAddressGroupsResponse() {
    }

    public ListOnchainAddressGroupsResponse(Builder builder) {
        this.addressGroups = builder.addressGroups;
    }

    public AddressGroup[] getAddressGroups() {
        return addressGroups;
    }

    public void setAddressGroups(AddressGroup[] addressGroups) {
        this.addressGroups = addressGroups;
    }

    public static class Builder {
        private AddressGroup[] addressGroups;

        public Builder() {
        }

        public Builder addressGroups(AddressGroup[] addressGroups) {
            this.addressGroups = addressGroups;
            return this;
        }

        public ListOnchainAddressGroupsResponse build() {
            return new ListOnchainAddressGroupsResponse(this);
        }
    }
}
