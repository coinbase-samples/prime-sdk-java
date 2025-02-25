package com.coinbase.prime.model.assets;

public class NetworkDetails {
    private String id;
    private String type;

    public NetworkDetails() {}

    public NetworkDetails(Builder builder) {
        this.id = builder.id;
        this.type = builder.type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static class Builder {
        private String id;
        private String type;

        public Builder() {}

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public NetworkDetails build() {
            return new NetworkDetails(this);
        }
    }
} 