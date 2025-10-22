package com.coinbase.prime.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;

public class DisplayUser {
    /**
     * User UUID
     */
    private String id;

    /**
     * User full name
     */
    private String name;

    /**
     * User avatar URL
     */
    private String avatarUrl;

    public DisplayUser() {
    }

    public DisplayUser(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.avatarUrl = builder.avatarUrl;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }
    public static class Builder {
        private String id;

        private String name;

        private String avatarUrl;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder avatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }

        public DisplayUser build() {
            return new DisplayUser(this);
        }
    }
}

