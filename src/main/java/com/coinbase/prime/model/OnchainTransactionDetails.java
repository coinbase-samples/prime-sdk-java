// Copyright 2025-present Coinbase Global, Inc.
//
//  Licensed under the Apache License, Version 2.0 (the "License");
//  you may not use this file except in compliance with the License.
//  You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
//  Unless required by applicable law or agreed to in writing, software
//  distributed under the License is distributed on an "AS IS" BASIS,
//  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//  See the License for the specific language governing permissions and
//  limitations under the License.
package com.coinbase.prime.model;

import com.coinbase.prime.model.enums.SigningStatus;

public class OnchainTransactionDetails {
    private String signedTransaction;

    private RiskAssessment riskAssessment;

    private String chainId;

    /**
     * The transaction nonce. Only present for EVM-based blockchain transactions.
     */
    private String nonce;

    private String replacedTransactionId;

    private String destinationAddress;

    private Boolean skipBroadcast;

    private String failureReason;

    private SigningStatus signingStatus;

    public OnchainTransactionDetails() {
    }

    public OnchainTransactionDetails(Builder builder) {
        this.signedTransaction = builder.signedTransaction;
        this.riskAssessment = builder.riskAssessment;
        this.chainId = builder.chainId;
        this.nonce = builder.nonce;
        this.replacedTransactionId = builder.replacedTransactionId;
        this.destinationAddress = builder.destinationAddress;
        this.skipBroadcast = builder.skipBroadcast;
        this.failureReason = builder.failureReason;
        this.signingStatus = builder.signingStatus;
    }

    public String getSignedTransaction() {
        return signedTransaction;
    }

    public RiskAssessment getRiskAssessment() {
        return riskAssessment;
    }

    public String getChainId() {
        return chainId;
    }

    public String getNonce() {
        return nonce;
    }

    public String getReplacedTransactionId() {
        return replacedTransactionId;
    }

    public String getDestinationAddress() {
        return destinationAddress;
    }

    public Boolean isSkipBroadcast() {
        return skipBroadcast;
    }

    public String getFailureReason() {
        return failureReason;
    }

    public SigningStatus getSigningStatus() {
        return signingStatus;
    }

    public void setSignedTransaction(String signedTransaction) {
        this.signedTransaction = signedTransaction;
    }

    public void setRiskAssessment(RiskAssessment riskAssessment) {
        this.riskAssessment = riskAssessment;
    }

    public void setChainId(String chainId) {
        this.chainId = chainId;
    }

    public void setNonce(String nonce) {
        this.nonce = nonce;
    }

    public void setReplacedTransactionId(String replacedTransactionId) {
        this.replacedTransactionId = replacedTransactionId;
    }

    public void setDestinationAddress(String destinationAddress) {
        this.destinationAddress = destinationAddress;
    }

    public void setSkipBroadcast(Boolean skipBroadcast) {
        this.skipBroadcast = skipBroadcast;
    }

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    public void setSigningStatus(SigningStatus signingStatus) {
        this.signingStatus = signingStatus;
    }

    public static class Builder {
        private String signedTransaction;

        private RiskAssessment riskAssessment;

        private String chainId;

        private String nonce;

        private String replacedTransactionId;

        private String destinationAddress;

        private Boolean skipBroadcast;

        private String failureReason;

        private SigningStatus signingStatus;

        public Builder signedTransaction(String signedTransaction) {
            this.signedTransaction = signedTransaction;
            return this;
        }

        public Builder riskAssessment(RiskAssessment riskAssessment) {
            this.riskAssessment = riskAssessment;
            return this;
        }

        public Builder chainId(String chainId) {
            this.chainId = chainId;
            return this;
        }

        public Builder nonce(String nonce) {
            this.nonce = nonce;
            return this;
        }

        public Builder replacedTransactionId(String replacedTransactionId) {
            this.replacedTransactionId = replacedTransactionId;
            return this;
        }

        public Builder destinationAddress(String destinationAddress) {
            this.destinationAddress = destinationAddress;
            return this;
        }

        public Builder skipBroadcast(Boolean skipBroadcast) {
            this.skipBroadcast = skipBroadcast;
            return this;
        }

        public Builder failureReason(String failureReason) {
            this.failureReason = failureReason;
            return this;
        }

        public Builder signingStatus(SigningStatus signingStatus) {
            this.signingStatus = signingStatus;
            return this;
        }

        public OnchainTransactionDetails build() {
            return new OnchainTransactionDetails(this);
        }
    }
}
