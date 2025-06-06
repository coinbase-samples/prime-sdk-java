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

import com.coinbase.prime.model.CryptoDepositInstructions;
import com.coinbase.prime.model.FiatDepositInstructions;

public class GetWalletDepositInstructionsResponse {
    CryptoDepositInstructions cryptoDepositInstructions;
    FiatDepositInstructions fiatDepositInstructions;

    public GetWalletDepositInstructionsResponse() {
    }

    public GetWalletDepositInstructionsResponse(Builder builder) {
        this.cryptoDepositInstructions = builder.cryptoDepositInstructions;
        this.fiatDepositInstructions = builder.fiatDepositInstructions;
    }

    public CryptoDepositInstructions getCryptoDepositInstructions() {
        return cryptoDepositInstructions;
    }

    public void setCryptoDepositInstructions(CryptoDepositInstructions cryptoDepositInstructions) {
        this.cryptoDepositInstructions = cryptoDepositInstructions;
    }

    public FiatDepositInstructions getFiatDepositInstructions() {
        return fiatDepositInstructions;
    }

    public void setFiatDepositInstructions(FiatDepositInstructions fiatDepositInstructions) {
        this.fiatDepositInstructions = fiatDepositInstructions;
    }

    public static class Builder {
        private CryptoDepositInstructions cryptoDepositInstructions;
        private FiatDepositInstructions fiatDepositInstructions;

        public Builder() {
        }

        public Builder cryptoDepositInstructions(CryptoDepositInstructions cryptoDepositInstructions) {
            this.cryptoDepositInstructions = cryptoDepositInstructions;
            return this;
        }

        public Builder fiatDepositInstructions(FiatDepositInstructions fiatDepositInstructions) {
            this.fiatDepositInstructions = fiatDepositInstructions;
            return this;
        }

        public GetWalletDepositInstructionsResponse build() {
            return new GetWalletDepositInstructionsResponse(this);
        }
    }
}
