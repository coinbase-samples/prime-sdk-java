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
 * Configuration settings for address book management
 */
public class AddressBookConfiguration {
    @JsonProperty("requires_approval")
    private Boolean requiresApproval;
    @JsonProperty("auto_approve_trusted")
    private Boolean autoApproveTrusted;
    @JsonProperty("max_entries_per_currency")
    private Integer maxEntriesPerCurrency;
    @JsonProperty("trusted_networks_only")
    private Boolean trustedNetworksOnly;
    
    public AddressBookConfiguration() {
    }
    
    public AddressBookConfiguration(Builder builder) {
        this.requiresApproval = builder.requiresApproval;
        this.autoApproveTrusted = builder.autoApproveTrusted;
        this.maxEntriesPerCurrency = builder.maxEntriesPerCurrency;
        this.trustedNetworksOnly = builder.trustedNetworksOnly;
    }
    
    public Boolean getRequiresApproval() {
        return requiresApproval;
    }
    
    public void setRequiresApproval(Boolean requiresApproval) {
        this.requiresApproval = requiresApproval;
    }
    
    public Boolean getAutoApproveTrusted() {
        return autoApproveTrusted;
    }
    
    public void setAutoApproveTrusted(Boolean autoApproveTrusted) {
        this.autoApproveTrusted = autoApproveTrusted;
    }
    
    public Integer getMaxEntriesPerCurrency() {
        return maxEntriesPerCurrency;
    }
    
    public void setMaxEntriesPerCurrency(Integer maxEntriesPerCurrency) {
        this.maxEntriesPerCurrency = maxEntriesPerCurrency;
    }
    
    public Boolean getTrustedNetworksOnly() {
        return trustedNetworksOnly;
    }
    
    public void setTrustedNetworksOnly(Boolean trustedNetworksOnly) {
        this.trustedNetworksOnly = trustedNetworksOnly;
    }
    
    public static class Builder {
        private Boolean requiresApproval;
        private Boolean autoApproveTrusted;
        private Integer maxEntriesPerCurrency;
        private Boolean trustedNetworksOnly;
        
        public Builder requiresApproval(Boolean requiresApproval) {
            this.requiresApproval = requiresApproval;
            return this;
        }
        
        public Builder autoApproveTrusted(Boolean autoApproveTrusted) {
            this.autoApproveTrusted = autoApproveTrusted;
            return this;
        }
        
        public Builder maxEntriesPerCurrency(Integer maxEntriesPerCurrency) {
            this.maxEntriesPerCurrency = maxEntriesPerCurrency;
            return this;
        }
        
        public Builder trustedNetworksOnly(Boolean trustedNetworksOnly) {
            this.trustedNetworksOnly = trustedNetworksOnly;
            return this;
        }
        
        public AddressBookConfiguration build() {
            return new AddressBookConfiguration(this);
        }
    }
}