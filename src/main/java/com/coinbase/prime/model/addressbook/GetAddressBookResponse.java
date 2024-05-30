package com.coinbase.prime.model.addressbook;

import com.coinbase.prime.model.common.Pagination;

public class GetAddressBookResponse {
    private GetAddressBookRequest request;
    private Address[] addresses;
    private Pagination pagination;

    public GetAddressBookResponse() {
    }

    public GetAddressBookResponse(Builder builder) {
        this.request = builder.request;
        this.addresses = builder.addresses;
        this.pagination = builder.pagination;
    }

    public GetAddressBookRequest getRequest() {
        return request;
    }

    public void setRequest(GetAddressBookRequest request) {
        this.request = request;
    }

    public Address[] getAddresses() {
        return addresses;
    }

    public void setAddresses(Address[] addresses) {
        this.addresses = addresses;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public static class Builder {
        private GetAddressBookRequest request;
        private Address[] addresses;
        private Pagination pagination;

        public Builder request(GetAddressBookRequest request) {
            this.request = request;
            return this;
        }

        public Builder addresses(Address[] addresses) {
            this.addresses = addresses;
            return this;
        }

        public Builder pagination(Pagination pagination) {
            this.pagination = pagination;
            return this;
        }

        public GetAddressBookResponse build() {
            return new GetAddressBookResponse(this);
        }
    }
}
