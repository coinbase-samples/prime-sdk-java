package com.coinbase.prime.model.addressbook;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateAddressBookEntryResponse {
    @JsonProperty("activity_type")
    private AddressBookActivityType activityType;
    @JsonProperty("num_approvals_remaining")
    private Integer numApprovalsRemaining;
    @JsonProperty("activity_id")
    private String activityId;
    private CreateAddressBookEntryRequest request;

    public CreateAddressBookEntryResponse() {
    }

    public CreateAddressBookEntryResponse(Builder builder) {
        this.activityType = builder.activityType;
        this.numApprovalsRemaining = builder.numApprovalsRemaining;
        this.activityId = builder.activityId;
        this.request = builder.request;
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

    public CreateAddressBookEntryRequest getRequest() {
        return request;
    }

    public void setRequest(CreateAddressBookEntryRequest request) {
        this.request = request;
    }

    public static class Builder {
        private AddressBookActivityType activityType;
        private Integer numApprovalsRemaining;
        private String activityId;
        private CreateAddressBookEntryRequest request;

        public Builder activityType(AddressBookActivityType activityType) {
            this.activityType = activityType;
            return this;
        }

        public Builder numApprovalsRemaining(int numApprovalsRemaining) {
            this.numApprovalsRemaining = numApprovalsRemaining;
            return this;
        }

        public Builder activityId(String activityId) {
            this.activityId = activityId;
            return this;
        }

        public Builder request(CreateAddressBookEntryRequest request) {
            this.request = request;
            return this;
        }

        public CreateAddressBookEntryResponse build() {
            return new CreateAddressBookEntryResponse(this);
        }
    }
}
