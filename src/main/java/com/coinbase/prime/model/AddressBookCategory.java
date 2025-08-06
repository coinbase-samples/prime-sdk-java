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
 * Category information for address book entries
 */
public class AddressBookCategory {
    private String id;
    private String name;
    private String description;
    @JsonProperty("is_trusted")
    private Boolean isTrusted;
    @JsonProperty("risk_level")
    private String riskLevel;
    @JsonProperty("auto_approve")
    private Boolean autoApprove;
    
    public AddressBookCategory() {
    }
    
    public AddressBookCategory(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.description = builder.description;
        this.isTrusted = builder.isTrusted;
        this.riskLevel = builder.riskLevel;
        this.autoApprove = builder.autoApprove;
    }
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public Boolean getIsTrusted() {
        return isTrusted;
    }
    
    public void setIsTrusted(Boolean isTrusted) {
        this.isTrusted = isTrusted;
    }
    
    public String getRiskLevel() {
        return riskLevel;
    }
    
    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }
    
    public Boolean getAutoApprove() {
        return autoApprove;
    }
    
    public void setAutoApprove(Boolean autoApprove) {
        this.autoApprove = autoApprove;
    }
    
    public static class Builder {
        private String id;
        private String name;
        private String description;
        private Boolean isTrusted;
        private String riskLevel;
        private Boolean autoApprove;
        
        public Builder id(String id) {
            this.id = id;
            return this;
        }
        
        public Builder name(String name) {
            this.name = name;
            return this;
        }
        
        public Builder description(String description) {
            this.description = description;
            return this;
        }
        
        public Builder isTrusted(Boolean isTrusted) {
            this.isTrusted = isTrusted;
            return this;
        }
        
        public Builder riskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        
        public Builder autoApprove(Boolean autoApprove) {
            this.autoApprove = autoApprove;
            return this;
        }
        
        public AddressBookCategory build() {
            return new AddressBookCategory(this);
        }
    }
}