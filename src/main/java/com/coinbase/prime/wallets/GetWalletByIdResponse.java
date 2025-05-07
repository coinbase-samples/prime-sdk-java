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

package com.coinbase.prime.wallets;

import com.coinbase.prime.model.Wallet;

public class GetWalletByIdResponse {
    private Wallet wallet;

    public GetWalletByIdResponse() {}

    public GetWalletByIdResponse(Builder builder) {
        this.wallet = builder.wallet;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    public static class Builder {
        private Wallet wallet;

        public Builder() {}

        public Builder wallet(Wallet wallet) {
            this.wallet = wallet;
            return this;
        }

        public GetWalletByIdResponse build() {
            return new GetWalletByIdResponse(this);
        }
    }
}
