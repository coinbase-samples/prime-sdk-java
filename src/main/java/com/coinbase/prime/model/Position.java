package com.coinbase.prime.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Position {
    private String symbol;

    @JsonProperty("long")
    private String _long;

    @JsonProperty("short")
    private String _short;

    @JsonProperty("position_reference")
    private PositionReference positionReference;

    public Position() {
    }

    public Position(Builder builder) {
        this.symbol = builder.symbol;
        this._long = builder._long;
        this._short = builder._short;
        this.positionReference = builder.positionReference;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getLong() {
        return _long;
    }

    public void setLong(String _long) {
        this._long = _long;
    }

    public String getShort() {
        return _short;
    }

    public void setShort(String _short) {
        this._short = _short;
    }

    public PositionReference getPositionReference() {
        return positionReference;
    }

    public void setPositionReference(PositionReference positionReference) {
        this.positionReference = positionReference;
    }

    public static class Builder {
        private String symbol;
        private String _long;
        private String _short;
        private PositionReference positionReference;

        public Builder symbol(String symbol) {
            this.symbol = symbol;
            return this;
        }

        public Builder longPosition(String _long) {
            this._long = _long;
            return this;
        }

        public Builder shortPosition(String _short) {
            this._short = _short;
            return this;
        }

        public Builder positionReference(PositionReference positionReference) {
            this.positionReference = positionReference;
            return this;
        }

        public Position build() {
            return new Position(this);
        }
    }
}
