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

import com.coinbase.core.errors.CoinbaseClientException;
import com.coinbase.prime.model.TravelRuleParty;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import static com.coinbase.core.utils.Utils.isNullOrEmpty;

/**
 * Request to submit travel rule data for an existing deposit transaction.
 * <p>
 * <b>Beta:</b> This endpoint is in Beta. Contact your account manager for more information.
 */
public class SubmitDepositTravelRuleDataRequest {
    @JsonProperty(required = true, value = "portfolio_id")
    @JsonIgnore
    private String portfolioId;

    @JsonProperty(required = true, value = "transaction_id")
    @JsonIgnore
    private String transactionId;

    @JsonProperty("originator")
    private TravelRuleParty originator;

    @JsonProperty("beneficiary")
    private TravelRuleParty beneficiary;

    @JsonProperty("is_self")
    private Boolean isSelf;

    @JsonProperty("is_intermediary")
    private Boolean isIntermediary;

    @JsonProperty("opt_out_of_ownership_verification")
    private Boolean optOutOfOwnershipVerification;

    public SubmitDepositTravelRuleDataRequest() {
    }

    public SubmitDepositTravelRuleDataRequest(Builder builder) {
        this.portfolioId = builder.portfolioId;
        this.transactionId = builder.transactionId;
        this.originator = builder.originator;
        this.beneficiary = builder.beneficiary;
        this.isSelf = builder.isSelf;
        this.isIntermediary = builder.isIntermediary;
        this.optOutOfOwnershipVerification = builder.optOutOfOwnershipVerification;
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public TravelRuleParty getOriginator() {
        return originator;
    }

    public void setOriginator(TravelRuleParty originator) {
        this.originator = originator;
    }

    public TravelRuleParty getBeneficiary() {
        return beneficiary;
    }

    public void setBeneficiary(TravelRuleParty beneficiary) {
        this.beneficiary = beneficiary;
    }

    public Boolean getIsSelf() {
        return isSelf;
    }

    public void setIsSelf(Boolean isSelf) {
        this.isSelf = isSelf;
    }

    public Boolean getIsIntermediary() {
        return isIntermediary;
    }

    public void setIsIntermediary(Boolean isIntermediary) {
        this.isIntermediary = isIntermediary;
    }

    public Boolean getOptOutOfOwnershipVerification() {
        return optOutOfOwnershipVerification;
    }

    public void setOptOutOfOwnershipVerification(Boolean optOutOfOwnershipVerification) {
        this.optOutOfOwnershipVerification = optOutOfOwnershipVerification;
    }

    public static class Builder {
        private String portfolioId;
        private String transactionId;
        private TravelRuleParty originator;
        private TravelRuleParty beneficiary;
        private Boolean isSelf;
        private Boolean isIntermediary;
        private Boolean optOutOfOwnershipVerification;

        public Builder() {
        }

        public Builder portfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public Builder transactionId(String transactionId) {
            this.transactionId = transactionId;
            return this;
        }

        public Builder originator(TravelRuleParty originator) {
            this.originator = originator;
            return this;
        }

        public Builder beneficiary(TravelRuleParty beneficiary) {
            this.beneficiary = beneficiary;
            return this;
        }

        public Builder isSelf(Boolean isSelf) {
            this.isSelf = isSelf;
            return this;
        }

        public Builder isIntermediary(Boolean isIntermediary) {
            this.isIntermediary = isIntermediary;
            return this;
        }

        public Builder optOutOfOwnershipVerification(Boolean optOutOfOwnershipVerification) {
            this.optOutOfOwnershipVerification = optOutOfOwnershipVerification;
            return this;
        }

        public SubmitDepositTravelRuleDataRequest build() throws CoinbaseClientException {
            this.validate();
            return new SubmitDepositTravelRuleDataRequest(this);
        }

        private void validate() throws CoinbaseClientException {
            if (isNullOrEmpty(this.portfolioId)) {
                throw new CoinbaseClientException("PortfolioId cannot be null");
            }
            if (isNullOrEmpty(this.transactionId)) {
                throw new CoinbaseClientException("TransactionId cannot be null");
            }
        }
    }
}
