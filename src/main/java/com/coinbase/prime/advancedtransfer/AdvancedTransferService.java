/*
 * Copyright 2026-present Coinbase Global, Inc.
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

package com.coinbase.prime.advancedtransfer;

import com.coinbase.core.errors.CoinbaseClientException;
import com.coinbase.prime.errors.CoinbasePrimeException;

public interface AdvancedTransferService {
    /** List Advanced Transfers */
    ListAdvancedTransfersResponse listAdvancedTransfers(ListAdvancedTransfersRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    /** Create Advanced Transfer */
    CreateAdvancedTransferResponse createAdvancedTransfer(CreateAdvancedTransferRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    /** Cancel Advanced Transfer */
    CancelAdvancedTransferResponse cancelAdvancedTransfer(CancelAdvancedTransferRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    /** List transactions associated with an Advanced Transfer */
    ListAdvancedTransferTransactionsResponse listAdvancedTransferTransactions(ListAdvancedTransferTransactionsRequest request) throws CoinbaseClientException, CoinbasePrimeException;
    /** Get Portfolio Counterparty ID */
    GetPortfolioCounterpartyIdResponse getPortfolioCounterpartyId(GetPortfolioCounterpartyIdRequest request) throws CoinbaseClientException, CoinbasePrimeException;
}
