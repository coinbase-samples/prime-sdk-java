package com.coinbase.prime.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;

public class CreateOnchainTransactionRequestEvmParams {
    /**
     * Option to disable dynamic gas price adjustment for EVM transactions prior to signing and broadcast. Defaults to false.
     */
    private Boolean disableDynamicGas;

    /**
     * Option to disable dynamic nonce when creating a transaction. Defaults to false.
     */
    private Boolean disableDynamicNonce;

    /**
     * Transaction ID to replace (for speed-up/cancel operations). Common use cases: 1) Gas Price Adjustments: When a transaction is stuck due to low gas price, a new transaction with the same nonce but higher gas price can be submitted to replace it. 2) Transaction Cancellation: A user might want to cancel a pending transaction by replacing it with a new transaction (often a 0-value transfer to themselves with higher gas price). Note: When using this field, the disable_dynamic_nonce option must be set to false because the nonce would be automatically managed by the system.
     */
    private String replacedTransactionId;

    /**
     * Chain ID for EVM transactions. (EVM-only)
     */
    private String chainId;

    /**
     * Network name for EVM transactions. (EVM-only)
     */
    private String networkName;

    public CreateOnchainTransactionRequestEvmParams() {
    }

    public CreateOnchainTransactionRequestEvmParams(Builder builder) {
        this.disableDynamicGas = builder.disableDynamicGas;
        this.disableDynamicNonce = builder.disableDynamicNonce;
        this.replacedTransactionId = builder.replacedTransactionId;
        this.chainId = builder.chainId;
        this.networkName = builder.networkName;
    }
    public Boolean getDisableDynamicGas() {
        return disableDynamicGas;
    }

    public void setDisableDynamicGas(Boolean disableDynamicGas) {
        this.disableDynamicGas = disableDynamicGas;
    }
    public Boolean getDisableDynamicNonce() {
        return disableDynamicNonce;
    }

    public void setDisableDynamicNonce(Boolean disableDynamicNonce) {
        this.disableDynamicNonce = disableDynamicNonce;
    }
    public String getReplacedTransactionId() {
        return replacedTransactionId;
    }

    public void setReplacedTransactionId(String replacedTransactionId) {
        this.replacedTransactionId = replacedTransactionId;
    }
    public String getChainId() {
        return chainId;
    }

    public void setChainId(String chainId) {
        this.chainId = chainId;
    }
    public String getNetworkName() {
        return networkName;
    }

    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }
    public static class Builder {
        private Boolean disableDynamicGas;

        private Boolean disableDynamicNonce;

        private String replacedTransactionId;

        private String chainId;

        private String networkName;

        public Builder disableDynamicGas(Boolean disableDynamicGas) {
            this.disableDynamicGas = disableDynamicGas;
            return this;
        }

        public Builder disableDynamicNonce(Boolean disableDynamicNonce) {
            this.disableDynamicNonce = disableDynamicNonce;
            return this;
        }

        public Builder replacedTransactionId(String replacedTransactionId) {
            this.replacedTransactionId = replacedTransactionId;
            return this;
        }

        public Builder chainId(String chainId) {
            this.chainId = chainId;
            return this;
        }

        public Builder networkName(String networkName) {
            this.networkName = networkName;
            return this;
        }

        public CreateOnchainTransactionRequestEvmParams build() {
            return new CreateOnchainTransactionRequestEvmParams(this);
        }
    }
}

