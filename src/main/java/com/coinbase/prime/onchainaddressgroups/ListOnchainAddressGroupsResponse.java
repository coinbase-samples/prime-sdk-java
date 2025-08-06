package com.coinbase.prime.onchainaddressgroups;

import com.coinbase.prime.model.AddressGroup;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Response for listing onchain address groups.
 */
public class ListOnchainAddressGroupsResponse {
    @JsonProperty("address_groups")
    private List<AddressGroup> addressGroups;

    public ListOnchainAddressGroupsResponse() {
    }

    public List<AddressGroup> getAddressGroups() {
        return addressGroups;
    }

    public void setAddressGroups(List<AddressGroup> addressGroups) {
        this.addressGroups = addressGroups;
    }
}