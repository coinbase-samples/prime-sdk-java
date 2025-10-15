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

package com.coinbase.prime.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class XmLoan {
    @JsonProperty("loan_id")
    private String loanId;

    @JsonProperty("principal_currency")
    private String principalCurrency;

    @JsonProperty("initial_principal_amount")
    private String initialPrincipalAmount;

    @JsonProperty("outstanding_principal")
    private String outstandingPrincipal;

    @JsonProperty("outstanding_interest")
    private String outstandingInterest;

    @JsonProperty("created_at")
    private String createdAt;

    @JsonProperty("maturity_date")
    private String maturityDate;

    public XmLoan() {
    }

    public String getLoanId() {
        return loanId;
    }

    public void setLoanId(String loanId) {
        this.loanId = loanId;
    }

    public String getPrincipalCurrency() {
        return principalCurrency;
    }

    public void setPrincipalCurrency(String principalCurrency) {
        this.principalCurrency = principalCurrency;
    }

    public String getInitialPrincipalAmount() {
        return initialPrincipalAmount;
    }

    public void setInitialPrincipalAmount(String initialPrincipalAmount) {
        this.initialPrincipalAmount = initialPrincipalAmount;
    }

    public String getOutstandingPrincipal() {
        return outstandingPrincipal;
    }

    public void setOutstandingPrincipal(String outstandingPrincipal) {
        this.outstandingPrincipal = outstandingPrincipal;
    }

    public String getOutstandingInterest() {
        return outstandingInterest;
    }

    public void setOutstandingInterest(String outstandingInterest) {
        this.outstandingInterest = outstandingInterest;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getMaturityDate() {
        return maturityDate;
    }

    public void setMaturityDate(String maturityDate) {
        this.maturityDate = maturityDate;
    }
}
