package com.coinbase.prime.model.portfolio;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Portfolio {
    private String id;

    private String name;

    @JsonProperty("entity_id")
    private String entityId;

    @JsonProperty("organization_id")
    private String organizationId;

    @JsonProperty("entity_name")
    private String entityName;

    public Portfolio(String id, String name, String entityId, String organizationId, String entityName) {
        this.id = id;
        this.name = name;
        this.entityId = entityId;
        this.organizationId = organizationId;
        this.entityName = entityName;
    }

    public Portfolio() {}

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

    public String getName() {
        return name;
    }

    public String getEntityId() {
        return entityId;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public String getEntityName() {
        return entityName;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
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

        public Builder() {
        }

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

