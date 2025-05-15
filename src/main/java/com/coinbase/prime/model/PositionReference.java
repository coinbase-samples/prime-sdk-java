package com.coinbase.prime.model;

import com.coinbase.prime.model.enums.PositionReferenceType;

public class PositionReference {
    private String id;

    private PositionReferenceType type;

    public PositionReference() {
    }

    public PositionReference(String id, PositionReferenceType type) {
        this.id = id;
        this.type = type;
    }

    public PositionReference(Builder builder) {
        this.id = builder.id;
        this.type = builder.type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PositionReferenceType getType() {
        return type;
    }

    public void setType(PositionReferenceType type) {
        this.type = type;
    }

    public static class Builder {
        private String id;
        private PositionReferenceType type;

        public Builder() {
        }

        public Builder withId(String id) {
            this.id = id;
            return this;
        }

        public Builder withType(PositionReferenceType type) {
            this.type = type;
            return this;
        }

        public PositionReference build() {
            return new PositionReference(this);
        }
    }
}
