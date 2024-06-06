/*
 *
 *  Copyright 2024-present Coinbase Global, Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

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
