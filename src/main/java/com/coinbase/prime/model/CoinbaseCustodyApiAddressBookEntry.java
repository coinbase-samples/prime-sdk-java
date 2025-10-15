// Copyright 2024-present Coinbase Global, Inc.
//
//  Licensed under the Apache License, Version 2.0 (the "License");
//  you may not use this file except in compliance with the License.
//  You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
//  Unless required by applicable law or agreed to in writing, software
//  distributed under the License is distributed on an "AS IS" BASIS,
//  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//  See the License for the specific language governing permissions and
//  limitations under the License.
package com.coinbase.prime.model;

import java.time.OffsetDateTime;

public class CoinbaseCustodyApiAddressBookEntry {
    private String id;

    private String currencySymbol;

    private String name;

    private String address;

    private String accountIdentifier;

    private String accountIdentifierName;

    private String state;

    private String explorerLink;

    private OffsetDateTime lastUsedAt;

    private OffsetDateTime addedAt;

    private CoinbaseCustodyApiDisplayUser addedBy;

    private String counterpartyId;

    public CoinbaseCustodyApiAddressBookEntry() {
    }

    public CoinbaseCustodyApiAddressBookEntry(Builder builder) {
        this.id = builder.id;
        this.currencySymbol = builder.currencySymbol;
        this.name = builder.name;
        this.address = builder.address;
        this.accountIdentifier = builder.accountIdentifier;
        this.accountIdentifierName = builder.accountIdentifierName;
        this.state = builder.state;
        this.explorerLink = builder.explorerLink;
        this.lastUsedAt = builder.lastUsedAt;
        this.addedAt = builder.addedAt;
        this.addedBy = builder.addedBy;
        this.counterpartyId = builder.counterpartyId;
    }

    public String getId() {
        return id;
    }

    public String getCurrencySymbol() {
        return currencySymbol;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getAccountIdentifier() {
        return accountIdentifier;
    }

    public String getAccountIdentifierName() {
        return accountIdentifierName;
    }

    public String getState() {
        return state;
    }

    public String getExplorerLink() {
        return explorerLink;
    }

    public OffsetDateTime getLastUsedAt() {
        return lastUsedAt;
    }

    public OffsetDateTime getAddedAt() {
        return addedAt;
    }

    public CoinbaseCustodyApiDisplayUser getAddedBy() {
        return addedBy;
    }

    public String getCounterpartyId() {
        return counterpartyId;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCurrencySymbol(String currencySymbol) {
        this.currencySymbol = currencySymbol;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAccountIdentifier(String accountIdentifier) {
        this.accountIdentifier = accountIdentifier;
    }

    public void setAccountIdentifierName(String accountIdentifierName) {
        this.accountIdentifierName = accountIdentifierName;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setExplorerLink(String explorerLink) {
        this.explorerLink = explorerLink;
    }

    public void setLastUsedAt(OffsetDateTime lastUsedAt) {
        this.lastUsedAt = lastUsedAt;
    }

    public void setAddedAt(OffsetDateTime addedAt) {
        this.addedAt = addedAt;
    }

    public void setAddedBy(CoinbaseCustodyApiDisplayUser addedBy) {
        this.addedBy = addedBy;
    }

    public void setCounterpartyId(String counterpartyId) {
        this.counterpartyId = counterpartyId;
    }

    public static class Builder {
        private String id;

        private String currencySymbol;

        private String name;

        private String address;

        private String accountIdentifier;

        private String accountIdentifierName;

        private String state;

        private String explorerLink;

        private OffsetDateTime lastUsedAt;

        private OffsetDateTime addedAt;

        private CoinbaseCustodyApiDisplayUser addedBy;

        private String counterpartyId;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder currencySymbol(String currencySymbol) {
            this.currencySymbol = currencySymbol;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder accountIdentifier(String accountIdentifier) {
            this.accountIdentifier = accountIdentifier;
            return this;
        }

        public Builder accountIdentifierName(String accountIdentifierName) {
            this.accountIdentifierName = accountIdentifierName;
            return this;
        }

        public Builder state(String state) {
            this.state = state;
            return this;
        }

        public Builder explorerLink(String explorerLink) {
            this.explorerLink = explorerLink;
            return this;
        }

        public Builder lastUsedAt(OffsetDateTime lastUsedAt) {
            this.lastUsedAt = lastUsedAt;
            return this;
        }

        public Builder addedAt(OffsetDateTime addedAt) {
            this.addedAt = addedAt;
            return this;
        }

        public Builder addedBy(CoinbaseCustodyApiDisplayUser addedBy) {
            this.addedBy = addedBy;
            return this;
        }

        public Builder counterpartyId(String counterpartyId) {
            this.counterpartyId = counterpartyId;
            return this;
        }

        public CoinbaseCustodyApiAddressBookEntry build() {
            return new CoinbaseCustodyApiAddressBookEntry(this);
        }
    }
}
