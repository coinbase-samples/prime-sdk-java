/*
 * Copyright 2025-present Coinbase Global, Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.coinbase.prime.model;

import com.coinbase.prime.model.enums.SigningStatus;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OnchainDetails {
    @JsonProperty("signed_transaction")
    private String signedTransaction;
    @JsonProperty("risk_assessment")
    private RiskAssessment riskAssessment;
    @JsonProperty("chain_id")
    private String chainId;
    private String nonce;
    @JsonProperty("replaced_transaction_id")
    private String replacedTransactionId;
    @JsonProperty("destination_address")
    private String destinationAddress;
    @JsonProperty("skip_broadcast")
    private boolean skipBroadcast;
    @JsonProperty("failure_reason")
    private String failureReason;
    @JsonProperty("signing_status")
    private SigningStatus signingStatus;

    public OnchainDetails() {}

    public String getSignedTransaction() {
        return signedTransaction;
    }

    public void setSignedTransaction(String signedTransaction) {
        this.signedTransaction = signedTransaction;
    }

    public RiskAssessment getRiskAssessment() {
        return riskAssessment;
    }

    public void setRiskAssessment(RiskAssessment riskAssessment) {
        this.riskAssessment = riskAssessment;
    }

    public String getChainId() {
        return chainId;
    }

    public void setChainId(String chainId) {
        this.chainId = chainId;
    }

    public String getNonce() {
        return nonce;
    }

    public void setNonce(String nonce) {
        this.nonce = nonce;
    }

    public String getReplacedTransactionId() {
        return replacedTransactionId;
    }

    public void setReplacedTransactionId(String replacedTransactionId) {
        this.replacedTransactionId = replacedTransactionId;
    }

    public String getDestinationAddress() {
        return destinationAddress;
    }

    public void setDestinationAddress(String destinationAddress) {
        this.destinationAddress = destinationAddress;
    }

    public boolean isSkipBroadcast() {
        return skipBroadcast;
    }

    public void setSkipBroadcast(boolean skipBroadcast) {
        this.skipBroadcast = skipBroadcast;
    }

    public String getFailureReason() {
        return failureReason;
    }

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    public SigningStatus getSigningStatus() {
        return signingStatus;
    }

    public void setSigningStatus(SigningStatus signingStatus) {
        this.signingStatus = signingStatus;
    }
}
