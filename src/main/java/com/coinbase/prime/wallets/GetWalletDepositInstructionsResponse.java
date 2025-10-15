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

/**
 * Response object for retrieving wallet deposit instructions.
 * 
 * Contains both crypto and fiat deposit instructions for the specified wallet,
 * providing the necessary information for users to deposit funds.
 */
public class GetWalletDepositInstructionsResponse {
    /** Cryptocurrency deposit instructions for the wallet */
    WalletCryptoDepositInstructions cryptoDepositInstructions;
    /** Fiat currency deposit instructions for the wallet */
    WalletFiatDepositInstructions fiatDepositInstructions;

    public GetWalletDepositInstructionsResponse() {
    }

    public WalletCryptoDepositInstructions getCryptoDepositInstructions() {
        return cryptoDepositInstructions;
    }

    public void setCryptoDepositInstructions(WalletCryptoDepositInstructions cryptoDepositInstructions) {
        this.cryptoDepositInstructions = cryptoDepositInstructions;
    }

    public WalletFiatDepositInstructions getFiatDepositInstructions() {
        return fiatDepositInstructions;
    }

    public void setFiatDepositInstructions(WalletFiatDepositInstructions fiatDepositInstructions) {
        this.fiatDepositInstructions = fiatDepositInstructions;
    }

}
