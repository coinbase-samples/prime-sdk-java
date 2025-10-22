package com.coinbase.prime.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;

public class Portfolio {
    /**
     * The unique ID of the portfolio
     */
    private String id;

    /**
     * The name of the portfolio
     */
    private String name;

    /**
     * The ID of the entity to which the portfolio is associated
     */
    private String entityId;

    /**
     * The ID of the organization to which the portfolio is associated
     */
    private String organizationId;

    /**
     * The name of the entity to which the portfolio is associated
     */
    private String entityName;

    public Portfolio() {
    }

    public Portfolio(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.entityId = builder.entityId;
        this.organizationId = builder.organizationId;
        this.entityName = builder.entityName;
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
    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }
    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }
    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }
    public static class Builder {
        private String id;

        private String name;

        private String entityId;

        private String organizationId;

        private String entityName;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder entityId(String entityId) {
            this.entityId = entityId;
            return this;
        }

        public Builder organizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }

        public Builder entityName(String entityName) {
            this.entityName = entityName;
            return this;
        }

        public Portfolio build() {
            return new Portfolio(this);
        }
    }
}

