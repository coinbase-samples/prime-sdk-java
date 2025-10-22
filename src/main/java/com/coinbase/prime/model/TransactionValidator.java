package com.coinbase.prime.model;

import com.coinbase.prime.model.enums.ValidatorStatus;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;

public class TransactionValidator {
    /**
     * The ID of the transaction which staked to this validator
     */
    private String transactionId;

    /**
     * The address (public key) of the validator
     */
    private String validatorAddress;

    private ValidatorStatus validatorStatus;

    public TransactionValidator() {
    }

    public TransactionValidator(Builder builder) {
        this.transactionId = builder.transactionId;
        this.validatorAddress = builder.validatorAddress;
        this.validatorStatus = builder.validatorStatus;
    }
    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
    public String getValidatorAddress() {
        return validatorAddress;
    }

    public void setValidatorAddress(String validatorAddress) {
        this.validatorAddress = validatorAddress;
    }
    public ValidatorStatus getValidatorStatus() {
        return validatorStatus;
    }

    public void setValidatorStatus(ValidatorStatus validatorStatus) {
        this.validatorStatus = validatorStatus;
    }
    public static class Builder {
        private String transactionId;

        private String validatorAddress;

        private ValidatorStatus validatorStatus;

        public Builder transactionId(String transactionId) {
            this.transactionId = transactionId;
            return this;
        }

        public Builder validatorAddress(String validatorAddress) {
            this.validatorAddress = validatorAddress;
            return this;
        }

        public Builder validatorStatus(ValidatorStatus validatorStatus) {
            this.validatorStatus = validatorStatus;
            return this;
        }

        public TransactionValidator build() {
            return new TransactionValidator(this);
        }
    }
}

