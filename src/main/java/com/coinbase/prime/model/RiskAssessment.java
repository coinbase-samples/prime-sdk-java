package com.coinbase.prime.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RiskAssessment {
    @JsonProperty("compliance_risk_detected")
    private boolean complianceRiskDetected;

    @JsonProperty("security_risk_detected")
    private boolean securityRiskDetected;
}
