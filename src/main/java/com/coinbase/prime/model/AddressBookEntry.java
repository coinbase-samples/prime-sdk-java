package com.coinbase.prime.model;

import com.coinbase.prime.model.enums.AddressBookType;
import com.coinbase.prime.model.DisplayUser;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.Arrays;

public class AddressBookEntry {
    /**
     * UUID identifying this address book entry
     */
    private String id;

    /**
     * Currency symbol
     */
    private String currencySymbol;

    /**
     * Name for this address book entry
     */
    private String name;

    /**
     * Cryptocurrency address
     */
    private String address;

    /**
     * Memo or destination tag for currencies which support them
     */
    private String accountIdentifier;

    /**
     * Name of the account identifier. For instance Destination Tag
     */
    private String accountIdentifierName;

    /**
     * State of this address book entry
     */
    private String state;

    /**
     * Link to a blockchain explorer
     */
    private String explorerLink;

    /**
     * When this entry was last used for a transaction
     */
    private OffsetDateTime lastUsedAt;

    /**
     * When this entry was added to the address book
     */
    private OffsetDateTime addedAt;

    private DisplayUser addedBy;

    private AddressBookType type;

    /**
     * counterparty id
     */
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
    public OffsetDateTime getLastUsedAt() {
        return lastUsedAt;
    }

    public void setLastUsedAt(OffsetDateTime lastUsedAt) {
        this.lastUsedAt = lastUsedAt;
    }
    public OffsetDateTime getAddedAt() {
        return addedAt;
    }

    public void setAddedAt(OffsetDateTime addedAt) {
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

        private OffsetDateTime lastUsedAt;

        private OffsetDateTime addedAt;

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

        public Builder lastUsedAt(OffsetDateTime lastUsedAt) {
            this.lastUsedAt = lastUsedAt;
            return this;
        }

        public Builder addedAt(OffsetDateTime addedAt) {
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

