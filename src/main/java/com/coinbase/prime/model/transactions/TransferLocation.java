package com.coinbase.prime.model.transactions;

public class TransferLocation {
    private TransferLocationType type;
    private String value;

    public TransferLocation() {
    }

    public TransferLocation(TransferLocationType type, String value) {
        this.type = type;
        this.value = value;
    }

    public TransferLocation(Builder builder) {
        this.type = builder.type;
        this.value = builder.value;
    }

    public TransferLocationType getType() {
        return type;
    }

    public void setType(TransferLocationType type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public static class Builder {
        private TransferLocationType type;
        private String value;

        public Builder() {
        }

        public Builder type(TransferLocationType type) {
            this.type = type;
            return this;
        }

        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public TransferLocation build() {
            return new TransferLocation(this);
        }
    }
}
