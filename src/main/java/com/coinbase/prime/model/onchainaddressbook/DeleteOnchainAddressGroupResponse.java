package com.coinbase.prime.model.onchainaddressbook;

import com.coinbase.prime.model.addressbook.AddressBookActivityType;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DeleteOnchainAddressGroupResponse {
    @JsonProperty("activity_type")
    private AddressBookActivityType activityType;

    @JsonProperty("num_approvals_remaining")
    private int numApprovalsRemaining;

    @JsonProperty("activity_id")
    private String activityId;

    public DeleteOnchainAddressGroupResponse() {
    }

    public DeleteOnchainAddressGroupResponse(DeleteOnchainAddressGroupResponse.Builder builder) {
        this.activityType = builder.activityType;
        this.numApprovalsRemaining = builder.numApprovalsRemaining;
        this.activityId = builder.activityId;
    }

    public AddressBookActivityType getActivityType() {
        return activityType;
    }

    public void setActivityType(AddressBookActivityType activityType) {
        this.activityType = activityType;
    }

    public int getNumApprovalsRemaining() {
        return numApprovalsRemaining;
    }

    public void setNumApprovalsRemaining(int numApprovalsRemaining) {
        this.numApprovalsRemaining = numApprovalsRemaining;
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public static class Builder {
        private AddressBookActivityType activityType;
        private int numApprovalsRemaining;
        private String activityId;

        public Builder() {
        }

        public DeleteOnchainAddressGroupResponse.Builder activityType(AddressBookActivityType activityType) {
            this.activityType = activityType;
            return this;
        }

        public DeleteOnchainAddressGroupResponse.Builder numApprovalsRemaining(int numApprovalsRemaining) {
            this.numApprovalsRemaining = numApprovalsRemaining;
            return this;
        }

        public DeleteOnchainAddressGroupResponse.Builder activityId(String activityId) {
            this.activityId = activityId;
            return this;
        }

        public DeleteOnchainAddressGroupResponse build() {
            return new DeleteOnchainAddressGroupResponse(this);
        }
    }
}
