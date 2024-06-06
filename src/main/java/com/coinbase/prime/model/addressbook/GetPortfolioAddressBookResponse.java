/*
 *
 *  Copyright 2024-present Coinbase Global, Inc.
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
 *
 */

package com.coinbase.prime.model.addressbook;

import com.coinbase.prime.model.common.Pagination;

public class GetPortfolioAddressBookResponse {
    private GetPortfolioAddressBookRequest request;
    private AddressBookEntry[] addresses;
    private Pagination pagination;

    public GetPortfolioAddressBookResponse() {
    }

    public GetPortfolioAddressBookResponse(Builder builder) {
        this.request = builder.request;
        this.addresses = builder.addresses;
        this.pagination = builder.pagination;
    }

    public GetPortfolioAddressBookRequest getRequest() {
        return request;
    }

    public void setRequest(GetPortfolioAddressBookRequest request) {
        this.request = request;
    }

    public AddressBookEntry[] getAddresses() {
        return addresses;
    }

    public void setAddresses(AddressBookEntry[] addresses) {
        this.addresses = addresses;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public static class Builder {
        private GetPortfolioAddressBookRequest request;
        private AddressBookEntry[] addresses;
        private Pagination pagination;

        public Builder request(GetPortfolioAddressBookRequest request) {
            this.request = request;
            return this;
        }

        public Builder addresses(AddressBookEntry[] addresses) {
            this.addresses = addresses;
            return this;
        }

        public Builder pagination(Pagination pagination) {
            this.pagination = pagination;
            return this;
        }

        public GetPortfolioAddressBookResponse build() {
            return new GetPortfolioAddressBookResponse(this);
        }
    }
}
