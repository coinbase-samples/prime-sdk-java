// Copyright 2024-present Coinbase Global, Inc.
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

public class ShortCollateral {
    private String oldBalance;

    private String newBalance;

    private String loanInterestRate;

    private String collateralInterestRate;

    public ShortCollateral() {
    }

    public ShortCollateral(Builder builder) {
        this.oldBalance = builder.oldBalance;
        this.newBalance = builder.newBalance;
        this.loanInterestRate = builder.loanInterestRate;
        this.collateralInterestRate = builder.collateralInterestRate;
    }

    public String getOldBalance() {
        return oldBalance;
    }

    public String getNewBalance() {
        return newBalance;
    }

    public String getLoanInterestRate() {
        return loanInterestRate;
    }

    public String getCollateralInterestRate() {
        return collateralInterestRate;
    }

    public void setOldBalance(String oldBalance) {
        this.oldBalance = oldBalance;
    }

    public void setNewBalance(String newBalance) {
        this.newBalance = newBalance;
    }

    public void setLoanInterestRate(String loanInterestRate) {
        this.loanInterestRate = loanInterestRate;
    }

    public void setCollateralInterestRate(String collateralInterestRate) {
        this.collateralInterestRate = collateralInterestRate;
    }

    public static class Builder {
        private String oldBalance;

        private String newBalance;

        private String loanInterestRate;

        private String collateralInterestRate;

        public Builder oldBalance(String oldBalance) {
            this.oldBalance = oldBalance;
            return this;
        }

        public Builder newBalance(String newBalance) {
            this.newBalance = newBalance;
            return this;
        }

        public Builder loanInterestRate(String loanInterestRate) {
            this.loanInterestRate = loanInterestRate;
            return this;
        }

        public Builder collateralInterestRate(String collateralInterestRate) {
            this.collateralInterestRate = collateralInterestRate;
            return this;
        }

        public ShortCollateral build() {
            return new ShortCollateral(this);
        }
    }
}
