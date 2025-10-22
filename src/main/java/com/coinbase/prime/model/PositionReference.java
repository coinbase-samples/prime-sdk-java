package com.coinbase.prime.model;

import com.coinbase.prime.model.enums.PositionReferenceType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;

public class PositionReference {
    /**
     * Reference ID
     */
    private String id;

    private PositionReferenceType type;

    public PositionReference() {
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

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder type(PositionReferenceType type) {
            this.type = type;
            return this;
        }

        public PositionReference build() {
            return new PositionReference(this);
        }
    }
}

