package com.coinbase.prime.model.portfolio;

public class Portfolio {
    private String id;
    private String name;
    private String entityId;
    private String organizationId;

    public Portfolio(String id, String name, String entityId, String organizationId) {
        this.id = id;
        this.name = name;
        this.entityId = entityId;
        this.organizationId = organizationId;
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
}

