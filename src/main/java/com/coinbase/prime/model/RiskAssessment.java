package com.coinbase.prime.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;

public class RiskAssessment {
    /**
     * Indicates if the transaction has been flagged for compliance concerns
     */
    private Boolean complianceRiskDetected;

    /**
     * Indicates if the transaction has been flagged for security concerns
     */
    private Boolean securityRiskDetected;

    public RiskAssessment() {
    }

    public RiskAssessment(Builder builder) {
        this.complianceRiskDetected = builder.complianceRiskDetected;
        this.securityRiskDetected = builder.securityRiskDetected;
    }
    public Boolean getComplianceRiskDetected() {
        return complianceRiskDetected;
    }

    public void setComplianceRiskDetected(Boolean complianceRiskDetected) {
        this.complianceRiskDetected = complianceRiskDetected;
    }
    public Boolean getSecurityRiskDetected() {
        return securityRiskDetected;
    }

    public void setSecurityRiskDetected(Boolean securityRiskDetected) {
        this.securityRiskDetected = securityRiskDetected;
    }
    public static class Builder {
        private Boolean complianceRiskDetected;

        private Boolean securityRiskDetected;

        public Builder complianceRiskDetected(Boolean complianceRiskDetected) {
            this.complianceRiskDetected = complianceRiskDetected;
            return this;
        }

        public Builder securityRiskDetected(Boolean securityRiskDetected) {
            this.securityRiskDetected = securityRiskDetected;
            return this;
        }

        public RiskAssessment build() {
            return new RiskAssessment(this);
        }
    }
}

