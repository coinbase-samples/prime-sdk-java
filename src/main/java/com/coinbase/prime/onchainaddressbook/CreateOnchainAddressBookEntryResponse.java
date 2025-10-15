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

package com.coinbase.prime.onchainaddressbook;

import com.coinbase.prime.model.enums.CustodyActivityType;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateOnchainAddressBookEntryResponse {
    @JsonProperty("activity_type")
    private CustodyActivityType activityType;

    @JsonProperty("num_approvals_remaining")
    private int numApprovalsRemaining;

    @JsonProperty("activity_id")
    private String activityId;

    public CreateOnchainAddressBookEntryResponse() {
    }

    public CustodyActivityType getActivityType() {
        return activityType;
    }

    public void setActivityType(CustodyActivityType activityType) {
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

}
