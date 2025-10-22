package com.coinbase.prime.model;

import com.coinbase.prime.model.enums.Action;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;

public class UserAction {
    private Action action;

    /**
     * Id of the user who executed the action
     */
    private String userId;

    /**
     * Time the action was taken
     */
    private String timestamp;

    public UserAction() {
    }

    public UserAction(Builder builder) {
        this.action = builder.action;
        this.userId = builder.userId;
        this.timestamp = builder.timestamp;
    }
    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
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
        private Action action;

        private String userId;

        private String timestamp;

        public Builder action(Action action) {
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

