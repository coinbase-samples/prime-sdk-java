package com.coinbase.prime.financing;

import com.coinbase.prime.model.Locate;

public class ListExistingLocatesResponse {
    private Locate[] locates;

    public ListExistingLocatesResponse() {
    }

    public ListExistingLocatesResponse(Builder builder) {
        this.locates = builder.locates;
    }

    public Locate[] getLocates() {
        return locates;
    }

    public void setLocates(Locate[] locates) {
        this.locates = locates;
    }

    public static class Builder {
        private Locate[] locates;

        public Builder() {
        }

        public Builder locates(Locate[] locates) {
            this.locates = locates;
            return this;
        }

        public ListExistingLocatesResponse build() {
            return new ListExistingLocatesResponse(this);
        }
    }
}
