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

import com.coinbase.prime.model.BlockchainAddress;
import com.coinbase.prime.model.Pagination;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class ListWalletAddressesResponse {
    @JsonProperty("addresses")
    private List<BlockchainAddress> addresses;
    private Pagination pagination;

    public ListWalletAddressesResponse() {
    }

    public List<BlockchainAddress> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<BlockchainAddress> addresses) {
        this.addresses = addresses;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }
}