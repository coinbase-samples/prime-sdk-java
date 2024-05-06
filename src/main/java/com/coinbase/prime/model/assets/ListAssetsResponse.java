package com.coinbase.prime.model.assets;

public class ListAssetsResponse {
    private Asset[] assets;
    private ListAssetsRequest request;

    public ListAssetsResponse() {
    }

    public ListAssetsResponse(Builder builder) {
        this.assets = builder.assets;
        this.request = builder.request;
    }

    public Asset[] getAssets() {
        return assets;
    }

    public void setAssets(Asset[] assets) {
        this.assets = assets;
    }

    public ListAssetsRequest getRequest() {
        return request;
    }

    public void setRequest(ListAssetsRequest request) {
        this.request = request;
    }

    public static class Builder {
        private Asset[] assets;
        private ListAssetsRequest request;

        public Builder() {
        }

        public Builder assets(Asset[] assets) {
            this.assets = assets;
            return this;
        }

        public Builder request(ListAssetsRequest request) {
            this.request = request;
            return this;
        }

        public ListAssetsResponse build() {
            return new ListAssetsResponse(this);
        }
    }
}
