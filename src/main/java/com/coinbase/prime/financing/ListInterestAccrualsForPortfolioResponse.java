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

package com.coinbase.prime.financing;

import com.coinbase.prime.model.Accrual;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ListInterestAccrualsForPortfolioResponse {
    @JsonProperty("total_notional_accrual")
    private String totalNotionalAccrual;

    private Accrual[] accruals;

    public ListInterestAccrualsForPortfolioResponse() {
    }

    public ListInterestAccrualsForPortfolioResponse(Builder builder) {
        this.totalNotionalAccrual = builder.totalNotionalAccrual;
        this.accruals = builder.accruals;
    }

    public String getTotalNotionalAccrual() {
        return totalNotionalAccrual;
    }

    public void setTotalNotionalAccrual(String totalNotionalAccrual) {
        this.totalNotionalAccrual = totalNotionalAccrual;
    }

    public Accrual[] getAccruals() {
        return accruals;
    }

    public void setAccruals(Accrual[] accruals) {
        this.accruals = accruals;
    }

    public static class Builder {
        private String totalNotionalAccrual;
        private Accrual[] accruals;

        public Builder() {
        }

        public Builder totalNotionalAccrual(String totalNotionalAccrual) {
            this.totalNotionalAccrual = totalNotionalAccrual;
            return this;
        }

        public Builder accruals(Accrual[] accruals) {
            this.accruals = accruals;
            return this;
        }

        public ListInterestAccrualsForPortfolioResponse build() {
            return new ListInterestAccrualsForPortfolioResponse(this);
        }
    }
}
