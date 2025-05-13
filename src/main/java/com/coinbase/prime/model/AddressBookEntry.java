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

package com.coinbase.prime.model;

import com.coinbase.prime.model.enums.AddressBookType;
import com.fasterxml.jackson.annotation.JsonProperty;

public class AddressBookEntry {
    private String id;
    @JsonProperty("currency_symbol")
    private String currencySymbol;
    private String name;
    private String address;
    @JsonProperty("account_identifier")
    private String accountIdentifier;
    @JsonProperty("account_identifier_name")
    private String accountIdentifierName;
    private String state;
    @JsonProperty("explorer_link")
    private String explorerLink;
    @JsonProperty("last_used_at")
    private String lastUsedAt;
    @JsonProperty("added_at")
    private String addedAt;
    @JsonProperty("added_by")
    private DisplayUser addedBy;
    private AddressBookType type;
    @JsonProperty("counterparty_id")
    private String counterpartyId;

    public AddressBookEntry() {
    }

    public AddressBookEntry(Builder builder) {
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
        this.type = builder.type;
        this.counterpartyId = builder.counterpartyId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCurrencySymbol() {
        return currencySymbol;
    }

    public void setCurrencySymbol(String currencySymbol) {
        this.currencySymbol = currencySymbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAccountIdentifier() {
        return accountIdentifier;
    }

    public void setAccountIdentifier(String accountIdentifier) {
        this.accountIdentifier = accountIdentifier;
    }

    public String getAccountIdentifierName() {
        return accountIdentifierName;
    }

    public void setAccountIdentifierName(String accountIdentifierName) {
        this.accountIdentifierName = accountIdentifierName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getExplorerLink() {
        return explorerLink;
    }

    public void setExplorerLink(String explorerLink) {
        this.explorerLink = explorerLink;
    }

    public String getLastUsedAt() {
        return lastUsedAt;
    }

    public void setLastUsedAt(String lastUsedAt) {
        this.lastUsedAt = lastUsedAt;
    }

    public String getAddedAt() {
        return addedAt;
    }

    public void setAddedAt(String addedAt) {
        this.addedAt = addedAt;
    }

    public DisplayUser getAddedBy() {
        return addedBy;
    }

    public void setAddedBy(DisplayUser addedBy) {
        this.addedBy = addedBy;
    }

    public AddressBookType getType() {
        return type;
    }

    public void setType(AddressBookType type) {
        this.type = type;
    }

    public String getCounterpartyId() {
        return counterpartyId;
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
        private String lastUsedAt;
        private String addedAt;
        private DisplayUser addedBy;
        private AddressBookType type;
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

        public Builder lastUsedAt(String lastUsedAt) {
            this.lastUsedAt = lastUsedAt;
            return this;
        }

        public Builder addedAt(String addedAt) {
            this.addedAt = addedAt;
            return this;
        }

        public Builder addedBy(DisplayUser addedBy) {
            this.addedBy = addedBy;
            return this;
        }

        public Builder type(AddressBookType type) {
            this.type = type;
            return this;
        }

        public Builder counterpartyId(String counterpartyId) {
            this.counterpartyId = counterpartyId;
            return this;
        }

        public AddressBookEntry build() {
            return new AddressBookEntry(this);
        }
    }
}
