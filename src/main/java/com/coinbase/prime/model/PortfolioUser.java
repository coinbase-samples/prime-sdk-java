package com.coinbase.prime.model;

import com.coinbase.prime.model.enums.UserRole;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;

public class PortfolioUser {
    /**
     * The unique ID of the user.
     */
    private String id;

    /**
     * The name of the user.
     */
    private String name;

    /**
     * The email of the user.
     */
    private String email;

    /**
     * The portfolio to which this user and associated permissions are identified.
     */
    private String portfolioId;

    /**
     * The entity to which this user and associated permissions are identified.
     */
    private String entityId;

    private UserRole role;

    public PortfolioUser() {
    }

    public PortfolioUser(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.email = builder.email;
        this.portfolioId = builder.portfolioId;
        this.entityId = builder.entityId;
        this.role = builder.role;
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
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }
    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }
    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }
    public static class Builder {
        private String id;

        private String name;

        private String email;

        private String portfolioId;

        private String entityId;

        private UserRole role;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder portfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public Builder entityId(String entityId) {
            this.entityId = entityId;
            return this;
        }

        public Builder role(UserRole role) {
            this.role = role;
            return this;
        }

        public PortfolioUser build() {
            return new PortfolioUser(this);
        }
    }
}

