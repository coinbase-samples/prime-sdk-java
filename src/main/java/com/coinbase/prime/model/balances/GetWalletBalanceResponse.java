/*
 * *
 *  * Copyright 2024-present Coinbase Global, Inc.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *  http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package com.coinbase.prime.model.balances;

public class GetWalletBalanceResponse {
    private Balance balance;
    private GetWalletBalanceRequest request;

    public GetWalletBalanceResponse() {
    }

    public GetWalletBalanceResponse(Builder builder) {
        this.balance = builder.balance;
        this.request = builder.request;
    }

    public Balance getBalance() {
        return balance;
    }

    public void setBalance(Balance balance) {
        this.balance = balance;
    }

    public GetWalletBalanceRequest getRequest() {
        return request;
    }

    public void setRequest(GetWalletBalanceRequest request) {
        this.request = request;
    }

    public static class Builder {
        private Balance balance;
        private GetWalletBalanceRequest request;

        public Builder() {
        }

        public Builder balance(Balance balance) {
            this.balance = balance;
            return this;
        }

        public Builder request(GetWalletBalanceRequest request) {
            this.request = request;
            return this;
        }

        public GetWalletBalanceResponse build() {
            return new GetWalletBalanceResponse(this);
        }
    }
}
