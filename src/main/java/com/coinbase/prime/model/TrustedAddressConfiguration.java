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
 * Configuration for trusted address management
 */
public class TrustedAddressConfiguration {
    @JsonProperty("enabled")
    private Boolean enabled;
    @JsonProperty("whitelist_only")
    private Boolean whitelistOnly;
    @JsonProperty("auto_trust_internal")
    private Boolean autoTrustInternal;
    @JsonProperty("trust_duration_hours")
    private Integer trustDurationHours;
    @JsonProperty("require_verification")
    private Boolean requireVerification;
    @JsonProperty("max_trusted_addresses")
    private Integer maxTrustedAddresses;
    
    public TrustedAddressConfiguration() {
    }
    
    public TrustedAddressConfiguration(Builder builder) {
        this.enabled = builder.enabled;
        this.whitelistOnly = builder.whitelistOnly;
        this.autoTrustInternal = builder.autoTrustInternal;
        this.trustDurationHours = builder.trustDurationHours;
        this.requireVerification = builder.requireVerification;
        this.maxTrustedAddresses = builder.maxTrustedAddresses;
    }
    
    public Boolean getEnabled() {
        return enabled;
    }
    
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
    
    public Boolean getWhitelistOnly() {
        return whitelistOnly;
    }
    
    public void setWhitelistOnly(Boolean whitelistOnly) {
        this.whitelistOnly = whitelistOnly;
    }
    
    public Boolean getAutoTrustInternal() {
        return autoTrustInternal;
    }
    
    public void setAutoTrustInternal(Boolean autoTrustInternal) {
        this.autoTrustInternal = autoTrustInternal;
    }
    
    public Integer getTrustDurationHours() {
        return trustDurationHours;
    }
    
    public void setTrustDurationHours(Integer trustDurationHours) {
        this.trustDurationHours = trustDurationHours;
    }
    
    public Boolean getRequireVerification() {
        return requireVerification;
    }
    
    public void setRequireVerification(Boolean requireVerification) {
        this.requireVerification = requireVerification;
    }
    
    public Integer getMaxTrustedAddresses() {
        return maxTrustedAddresses;
    }
    
    public void setMaxTrustedAddresses(Integer maxTrustedAddresses) {
        this.maxTrustedAddresses = maxTrustedAddresses;
    }
    
    public static class Builder {
        private Boolean enabled;
        private Boolean whitelistOnly;
        private Boolean autoTrustInternal;
        private Integer trustDurationHours;
        private Boolean requireVerification;
        private Integer maxTrustedAddresses;
        
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        
        public Builder whitelistOnly(Boolean whitelistOnly) {
            this.whitelistOnly = whitelistOnly;
            return this;
        }
        
        public Builder autoTrustInternal(Boolean autoTrustInternal) {
            this.autoTrustInternal = autoTrustInternal;
            return this;
        }
        
        public Builder trustDurationHours(Integer trustDurationHours) {
            this.trustDurationHours = trustDurationHours;
            return this;
        }
        
        public Builder requireVerification(Boolean requireVerification) {
            this.requireVerification = requireVerification;
            return this;
        }
        
        public Builder maxTrustedAddresses(Integer maxTrustedAddresses) {
            this.maxTrustedAddresses = maxTrustedAddresses;
            return this;
        }
        
        public TrustedAddressConfiguration build() {
            return new TrustedAddressConfiguration(this);
        }
    }
}