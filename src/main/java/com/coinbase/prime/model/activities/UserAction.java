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
