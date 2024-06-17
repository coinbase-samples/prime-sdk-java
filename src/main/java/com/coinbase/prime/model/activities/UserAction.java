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

package com.coinbase.prime.model.activities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserAction {
    private UserActionType action;
    @JsonProperty("user_id")
    private String userId;
    private String timestamp;

    public UserAction() {
    }

    public UserAction(Builder builder) {
        this.action = builder.action;
        this.userId = builder.userId;
        this.timestamp = builder.timestamp;
    }

    public UserActionType getAction() {
        return action;
    }

    public void setAction(UserActionType action) {
        this.action = action;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public static class Builder {
        private UserActionType action;
        private String userId;
        private String timestamp;

        public Builder action(UserActionType action) {
            this.action = action;
            return this;
        }

        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public Builder timestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public UserAction build() {
            return new UserAction(this);
        }
    }
}
