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

package com.coinbase.prime.activities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetEntityActivityByActivityIdRequest {
    @JsonProperty(required = true, value = "activity_id")
    private String activityId;

    private GetEntityActivityByActivityIdRequest(Builder builder) {
        this.activityId = builder.activityId;
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public static class Builder {
        private String activityId;

        public Builder activityId(String activityId) {
            this.activityId = activityId;
            return this;
        }

        public GetEntityActivityByActivityIdRequest build() {
            return new GetEntityActivityByActivityIdRequest(this);
        }
    }
}
