/*
 * Copyright 2025-present Coinbase Global, Inc.
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
 */

package com.coinbase.prime.model.onchainaddressbook;

import com.coinbase.prime.model.addressbook.AddressBookActivityType;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UpdateOnchainAddressBookEntryResponse {
    @JsonProperty("activity_type")
    private AddressBookActivityType activityType;

    @JsonProperty("num_approvals_remaining")
    private int numApprovalsRemaining;

    @JsonProperty("activity_id")
    private String activityId;

    public UpdateOnchainAddressBookEntryResponse() {
    }

    public UpdateOnchainAddressBookEntryResponse(UpdateOnchainAddressBookEntryResponse.Builder builder) {
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

        public UpdateOnchainAddressBookEntryResponse.Builder activityType(AddressBookActivityType activityType) {
            this.activityType = activityType;
            return this;
        }

        public UpdateOnchainAddressBookEntryResponse.Builder numApprovalsRemaining(int numApprovalsRemaining) {
            this.numApprovalsRemaining = numApprovalsRemaining;
            return this;
        }

        public UpdateOnchainAddressBookEntryResponse.Builder activityId(String activityId) {
            this.activityId = activityId;
            return this;
        }

        public UpdateOnchainAddressBookEntryResponse build() {
            return new UpdateOnchainAddressBookEntryResponse(this);
        }
    }
}
