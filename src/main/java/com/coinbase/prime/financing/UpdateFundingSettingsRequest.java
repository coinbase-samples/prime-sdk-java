/*
 * Copyright 2026-present Coinbase Global, Inc.
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

package com.coinbase.prime.financing;

import com.coinbase.core.errors.CoinbaseClientException;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import static com.coinbase.core.utils.Utils.isNullOrEmpty;

/**
 * Update Funding Settings (Beta)
 */
public class UpdateFundingSettingsRequest {
    @JsonProperty(required = true, value = "entity_id")
    @JsonIgnore
    private String entityId;

    @JsonProperty("designated_funding_portfolio_id")
    private String designatedFundingPortfolioId;

    @JsonProperty("automatic_conversion_enabled")
    private Boolean automaticConversionEnabled;

    @JsonProperty("automatic_loan_enabled")
    private Boolean automaticLoanEnabled;

    @JsonProperty("automatic_excess_return_enabled")
    private Boolean automaticExcessReturnEnabled;

    @JsonProperty("excess_funds_target_amount")
    private String excessFundsTargetAmount;

    public UpdateFundingSettingsRequest() {
    }

    public UpdateFundingSettingsRequest(Builder builder) {
        this.entityId = builder.entityId;
        this.designatedFundingPortfolioId = builder.designatedFundingPortfolioId;
        this.automaticConversionEnabled = builder.automaticConversionEnabled;
        this.automaticLoanEnabled = builder.automaticLoanEnabled;
        this.automaticExcessReturnEnabled = builder.automaticExcessReturnEnabled;
        this.excessFundsTargetAmount = builder.excessFundsTargetAmount;
    }

    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public String getDesignatedFundingPortfolioId() {
        return designatedFundingPortfolioId;
    }

    public void setDesignatedFundingPortfolioId(String designatedFundingPortfolioId) {
        this.designatedFundingPortfolioId = designatedFundingPortfolioId;
    }

    public Boolean getAutomaticConversionEnabled() {
        return automaticConversionEnabled;
    }

    public void setAutomaticConversionEnabled(Boolean automaticConversionEnabled) {
        this.automaticConversionEnabled = automaticConversionEnabled;
    }

    public Boolean getAutomaticLoanEnabled() {
        return automaticLoanEnabled;
    }

    public void setAutomaticLoanEnabled(Boolean automaticLoanEnabled) {
        this.automaticLoanEnabled = automaticLoanEnabled;
    }

    public Boolean getAutomaticExcessReturnEnabled() {
        return automaticExcessReturnEnabled;
    }

    public void setAutomaticExcessReturnEnabled(Boolean automaticExcessReturnEnabled) {
        this.automaticExcessReturnEnabled = automaticExcessReturnEnabled;
    }

    public String getExcessFundsTargetAmount() {
        return excessFundsTargetAmount;
    }

    public void setExcessFundsTargetAmount(String excessFundsTargetAmount) {
        this.excessFundsTargetAmount = excessFundsTargetAmount;
    }

    public static class Builder {
        private String entityId;
        private String designatedFundingPortfolioId;
        private Boolean automaticConversionEnabled;
        private Boolean automaticLoanEnabled;
        private Boolean automaticExcessReturnEnabled;
        private String excessFundsTargetAmount;

        public Builder() {
        }

        public Builder entityId(String entityId) {
            this.entityId = entityId;
            return this;
        }

        public Builder designatedFundingPortfolioId(String designatedFundingPortfolioId) {
            this.designatedFundingPortfolioId = designatedFundingPortfolioId;
            return this;
        }

        public Builder automaticConversionEnabled(Boolean automaticConversionEnabled) {
            this.automaticConversionEnabled = automaticConversionEnabled;
            return this;
        }

        public Builder automaticLoanEnabled(Boolean automaticLoanEnabled) {
            this.automaticLoanEnabled = automaticLoanEnabled;
            return this;
        }

        public Builder automaticExcessReturnEnabled(Boolean automaticExcessReturnEnabled) {
            this.automaticExcessReturnEnabled = automaticExcessReturnEnabled;
            return this;
        }

        public Builder excessFundsTargetAmount(String excessFundsTargetAmount) {
            this.excessFundsTargetAmount = excessFundsTargetAmount;
            return this;
        }

        public UpdateFundingSettingsRequest build() throws CoinbaseClientException {
            validate();
            return new UpdateFundingSettingsRequest(this);
        }

        private void validate() throws CoinbaseClientException {
            if (isNullOrEmpty(this.entityId)) {
                throw new CoinbaseClientException("EntityId is required");
            }
        }
    }
}
