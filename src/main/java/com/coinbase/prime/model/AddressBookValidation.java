/*
 * Copyright 2024-present Coinbase Global, Inc.
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

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Address validation information
 */
public class AddressBookValidation {
    @JsonProperty("is_valid")
    private Boolean isValid;
    @JsonProperty("validation_message")
    private String validationMessage;
    @JsonProperty("risk_score")
    private Double riskScore;
    @JsonProperty("compliance_check")
    private String complianceCheck;
    @JsonProperty("network_verified")
    private Boolean networkVerified;
    
    public AddressBookValidation() {
    }
    
    public AddressBookValidation(Builder builder) {
        this.isValid = builder.isValid;
        this.validationMessage = builder.validationMessage;
        this.riskScore = builder.riskScore;
        this.complianceCheck = builder.complianceCheck;
        this.networkVerified = builder.networkVerified;
    }
    
    public Boolean getIsValid() {
        return isValid;
    }
    
    public void setIsValid(Boolean isValid) {
        this.isValid = isValid;
    }
    
    public String getValidationMessage() {
        return validationMessage;
    }
    
    public void setValidationMessage(String validationMessage) {
        this.validationMessage = validationMessage;
    }
    
    public Double getRiskScore() {
        return riskScore;
    }
    
    public void setRiskScore(Double riskScore) {
        this.riskScore = riskScore;
    }
    
    public String getComplianceCheck() {
        return complianceCheck;
    }
    
    public void setComplianceCheck(String complianceCheck) {
        this.complianceCheck = complianceCheck;
    }
    
    public Boolean getNetworkVerified() {
        return networkVerified;
    }
    
    public void setNetworkVerified(Boolean networkVerified) {
        this.networkVerified = networkVerified;
    }
    
    public static class Builder {
        private Boolean isValid;
        private String validationMessage;
        private Double riskScore;
        private String complianceCheck;
        private Boolean networkVerified;
        
        public Builder isValid(Boolean isValid) {
            this.isValid = isValid;
            return this;
        }
        
        public Builder validationMessage(String validationMessage) {
            this.validationMessage = validationMessage;
            return this;
        }
        
        public Builder riskScore(Double riskScore) {
            this.riskScore = riskScore;
            return this;
        }
        
        public Builder complianceCheck(String complianceCheck) {
            this.complianceCheck = complianceCheck;
            return this;
        }
        
        public Builder networkVerified(Boolean networkVerified) {
            this.networkVerified = networkVerified;
            return this;
        }
        
        public AddressBookValidation build() {
            return new AddressBookValidation(this);
        }
    }
}