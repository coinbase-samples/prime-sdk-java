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

import com.coinbase.prime.model.Pagination;
import com.coinbase.prime.model.Wallet;

/**
 * Response object for listing all wallets associated with a portfolio.
 * 
 * Contains an array of wallets and pagination information for the wallet listing.
 */
public class ListWalletsResponse {
    /** Array of wallets associated with the portfolio */
    private Wallet[] wallets;
    /** Pagination information for the wallet listing */
    private Pagination pagination;

    public ListWalletsResponse() {}

    public Wallet[] getWallets() {
        return wallets;
    }

    public void setWallets(Wallet[] wallets) {
        this.wallets = wallets;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }
}
