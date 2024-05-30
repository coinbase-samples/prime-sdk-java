package com.coinbase.prime.model.addressbook;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateAddressBookEntryRequest {
    @JsonProperty("portfolio_id")
    private String portfolioId;
    private String address;
    @JsonProperty("currency_symbol")
    private String currencySymbol;
    private String name;
    @JsonProperty("account_identifier")
    private String accountIdentifier;

    public CreateAddressBookEntryRequest() {
    }

    public CreateAddressBookEntryRequest(Builder builder) {
        this.portfolioId = builder.portfolioId;
        this.address = builder.address;
        this.currencySymbol = builder.currencySymbol;
        this.name = builder.name;
        this.accountIdentifier = builder.accountIdentifier;
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public String getAccountIdentifier() {
        return accountIdentifier;
    }

    public void setAccountIdentifier(String accountIdentifier) {
        this.accountIdentifier = accountIdentifier;
    }

    public static class Builder {
        private String portfolioId;
        private String address;
        private String currencySymbol;
        private String name;
        private String accountIdentifier;

        public Builder portfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
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

        public Builder accountIdentifier(String accountIdentifier) {
            this.accountIdentifier = accountIdentifier;
            return this;
        }

        public CreateAddressBookEntryRequest build() {
            return new CreateAddressBookEntryRequest(this);
        }
    }
}
