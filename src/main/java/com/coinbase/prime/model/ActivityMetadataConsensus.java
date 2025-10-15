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

public class ActivityMetadataConsensus {
    private String approvalDeadline;

    private Boolean hasPassedConsensus;

    public ActivityMetadataConsensus() {
    }

    public ActivityMetadataConsensus(Builder builder) {
        this.approvalDeadline = builder.approvalDeadline;
        this.hasPassedConsensus = builder.hasPassedConsensus;
    }

    public String getApprovalDeadline() {
        return approvalDeadline;
    }

    public Boolean isHasPassedConsensus() {
        return hasPassedConsensus;
    }

    public void setApprovalDeadline(String approvalDeadline) {
        this.approvalDeadline = approvalDeadline;
    }

    public void setHasPassedConsensus(Boolean hasPassedConsensus) {
        this.hasPassedConsensus = hasPassedConsensus;
    }

    public static class Builder {
        private String approvalDeadline;

        private Boolean hasPassedConsensus;

        public Builder approvalDeadline(String approvalDeadline) {
            this.approvalDeadline = approvalDeadline;
            return this;
        }

        public Builder hasPassedConsensus(Boolean hasPassedConsensus) {
            this.hasPassedConsensus = hasPassedConsensus;
            return this;
        }

        public ActivityMetadataConsensus build() {
            return new ActivityMetadataConsensus(this);
        }
    }
}
