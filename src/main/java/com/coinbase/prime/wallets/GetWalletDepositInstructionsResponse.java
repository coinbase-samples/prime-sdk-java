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

package com.coinbase.prime.wallets;

import com.coinbase.prime.model.WalletCryptoDepositInstructions;
import com.coinbase.prime.model.WalletFiatDepositInstructions;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Get Wallet Deposit Instructions
 */
public class GetWalletDepositInstructionsResponse {
    @JsonProperty("crypto_instructions")
    private WalletCryptoDepositInstructions cryptoInstructions;

    @JsonProperty("fiat_instructions")
    private WalletFiatDepositInstructions fiatInstructions;

    public GetWalletDepositInstructionsResponse() {
    }

    public WalletCryptoDepositInstructions getCryptoInstructions() {
        return cryptoInstructions;
    }

    public void setCryptoInstructions(WalletCryptoDepositInstructions cryptoInstructions) {
        this.cryptoInstructions = cryptoInstructions;
    }

    public WalletFiatDepositInstructions getFiatInstructions() {
        return fiatInstructions;
    }

    public void setFiatInstructions(WalletFiatDepositInstructions fiatInstructions) {
        this.fiatInstructions = fiatInstructions;
    }

}
