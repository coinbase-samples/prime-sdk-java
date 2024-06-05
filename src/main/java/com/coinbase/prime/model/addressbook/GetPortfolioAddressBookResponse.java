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
