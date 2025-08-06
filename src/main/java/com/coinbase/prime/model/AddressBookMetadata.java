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
 * Metadata for address book entries
 */
public class AddressBookMetadata {
    @JsonProperty("total_entries")
    private Integer totalEntries;
    @JsonProperty("trusted_entries")
    private Integer trustedEntries;
    @JsonProperty("pending_approval")
    private Integer pendingApproval;
    @JsonProperty("last_updated")
    private String lastUpdated;
    @JsonProperty("creation_source")
    private String creationSource;
    @JsonProperty("risk_assessment")
    private String riskAssessment;
    
    public AddressBookMetadata() {
    }
    
    public AddressBookMetadata(Builder builder) {
        this.totalEntries = builder.totalEntries;
        this.trustedEntries = builder.trustedEntries;
        this.pendingApproval = builder.pendingApproval;
        this.lastUpdated = builder.lastUpdated;
        this.creationSource = builder.creationSource;
        this.riskAssessment = builder.riskAssessment;
    }
    
    public Integer getTotalEntries() {
        return totalEntries;
    }
    
    public void setTotalEntries(Integer totalEntries) {
        this.totalEntries = totalEntries;
    }
    
    public Integer getTrustedEntries() {
        return trustedEntries;
    }
    
    public void setTrustedEntries(Integer trustedEntries) {
        this.trustedEntries = trustedEntries;
    }
    
    public Integer getPendingApproval() {
        return pendingApproval;
    }
    
    public void setPendingApproval(Integer pendingApproval) {
        this.pendingApproval = pendingApproval;
    }
    
    public String getLastUpdated() {
        return lastUpdated;
    }
    
    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
    
    public String getCreationSource() {
        return creationSource;
    }
    
    public void setCreationSource(String creationSource) {
        this.creationSource = creationSource;
    }
    
    public String getRiskAssessment() {
        return riskAssessment;
    }
    
    public void setRiskAssessment(String riskAssessment) {
        this.riskAssessment = riskAssessment;
    }
    
    public static class Builder {
        private Integer totalEntries;
        private Integer trustedEntries;
        private Integer pendingApproval;
        private String lastUpdated;
        private String creationSource;
        private String riskAssessment;
        
        public Builder totalEntries(Integer totalEntries) {
            this.totalEntries = totalEntries;
            return this;
        }
        
        public Builder trustedEntries(Integer trustedEntries) {
            this.trustedEntries = trustedEntries;
            return this;
        }
        
        public Builder pendingApproval(Integer pendingApproval) {
            this.pendingApproval = pendingApproval;
            return this;
        }
        
        public Builder lastUpdated(String lastUpdated) {
            this.lastUpdated = lastUpdated;
            return this;
        }
        
        public Builder creationSource(String creationSource) {
            this.creationSource = creationSource;
            return this;
        }
        
        public Builder riskAssessment(String riskAssessment) {
            this.riskAssessment = riskAssessment;
            return this;
        }
        
        public AddressBookMetadata build() {
            return new AddressBookMetadata(this);
        }
    }
}