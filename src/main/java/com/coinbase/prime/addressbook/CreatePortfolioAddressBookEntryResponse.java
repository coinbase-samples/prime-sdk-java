/*
 * Copyright 2024-present Coinbase Global, Inc.
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

package com.coinbase.prime.addressbook;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreatePortfolioAddressBookEntryResponse {
    @JsonProperty("activity_type")
    private String activityType;
    @JsonProperty("num_approvals_remaining")
    private Integer numApprovalsRemaining;
    @JsonProperty("activity_id")
    private String activityId;

    public CreatePortfolioAddressBookEntryResponse() {
    }

    public String getActivityType() {
        return activityType;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    public Integer getNumApprovalsRemaining() {
        return numApprovalsRemaining;
    }

    public void setNumApprovalsRemaining(Integer numApprovalsRemaining) {
        this.numApprovalsRemaining = numApprovalsRemaining;
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

}
