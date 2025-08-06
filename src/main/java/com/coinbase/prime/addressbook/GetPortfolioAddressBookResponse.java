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

package com.coinbase.prime.addressbook;

import com.coinbase.prime.model.AddressBookEntry;
import com.coinbase.prime.model.AddressBookMetadata;
import com.coinbase.prime.model.AddressBookSummary;
import com.coinbase.prime.model.Pagination;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetPortfolioAddressBookResponse {
    private AddressBookEntry[] addresses;
    private Pagination pagination;
    @JsonProperty("metadata")
    private AddressBookMetadata metadata;
    @JsonProperty("summary")
    private AddressBookSummary summary;

    public GetPortfolioAddressBookResponse() {
    }

    public GetPortfolioAddressBookResponse(Builder builder) {
        this.addresses = builder.addresses;
        this.pagination = builder.pagination;
        this.metadata = builder.metadata;
        this.summary = builder.summary;
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

    public AddressBookMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(AddressBookMetadata metadata) {
        this.metadata = metadata;
    }

    public AddressBookSummary getSummary() {
        return summary;
    }

    public void setSummary(AddressBookSummary summary) {
        this.summary = summary;
    }

    public static class Builder {
        private AddressBookEntry[] addresses;
        private Pagination pagination;
        private AddressBookMetadata metadata;
        private AddressBookSummary summary;

        public Builder addresses(AddressBookEntry[] addresses) {
            this.addresses = addresses;
            return this;
        }

        public Builder pagination(Pagination pagination) {
            this.pagination = pagination;
            return this;
        }

        public Builder metadata(AddressBookMetadata metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder summary(AddressBookSummary summary) {
            this.summary = summary;
            return this;
        }

        public GetPortfolioAddressBookResponse build() {
            return new GetPortfolioAddressBookResponse(this);
        }
    }
}
