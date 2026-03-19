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

package com.coinbase.prime.transactions;

import com.coinbase.prime.model.enums.DestinationType;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response object for creating a wallet transfer.
 * 
 * Contains the details of the transfer request including activity ID, approval URL,
 * transfer amounts, addresses, and transaction information.
 */
public class CreateWalletTransferResponse {
    /** The activity ID for the transfer */
    @JsonProperty("activity_id")
    private String activityId;
    /** A URL to the activity associated with this transfer for approval */
    @JsonProperty("approval_url")
    private String approvalUrl;
    /** The symbol of the transferred asset */
    private String symbol;
    /** The amount being transferred */
    private String amount;
    /** The fee associated with the transfer */
    private String fee;
    /** The destination address for the transfer */
    @JsonProperty("destination_address")
    private String destinationAddress;
    /** The type of the destination (e.g., WALLET, EXCHANGE) */
    @JsonProperty("destination_type")
    private DestinationType destinationType;
    /** The source address for the transfer */
    @JsonProperty("source_address")
    private String sourceAddress;
    /** The type of the source (e.g., WALLET, EXCHANGE) */
    @JsonProperty("source_type")
    private DestinationType sourceType;
    /** The unique identifier for the transfer transaction */
    @JsonProperty("transaction_id")
    private String transactionId;

    public CreateWalletTransferResponse() {
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public String getApprovalUrl() {
        return approvalUrl;
    }

    public void setApprovalUrl(String approvalUrl) {
        this.approvalUrl = approvalUrl;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public String getDestinationAddress() {
        return destinationAddress;
    }

    public void setDestinationAddress(String destinationAddress) {
        this.destinationAddress = destinationAddress;
    }

    public DestinationType getDestinationType() {
        return destinationType;
    }

    public void setDestinationType(DestinationType destinationType) {
        this.destinationType = destinationType;
    }

    public String getSourceAddress() {
        return sourceAddress;
    }

    public void setSourceAddress(String sourceAddress) {
        this.sourceAddress = sourceAddress;
    }

    public DestinationType getSourceType() {
        return sourceType;
    }

    public void setSourceType(DestinationType sourceType) {
        this.sourceType = sourceType;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

}
