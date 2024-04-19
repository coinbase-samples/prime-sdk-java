package com.coinbase.prime.model.wallets;

import com.coinbase.prime.model.common.Pagination;

public class ListWalletsResponse {
    private Wallet[] wallets;
    private ListWalletsRequest request;
    private Pagination pagination;

    public ListWalletsResponse() {}

    public Wallet[] getWallets() {
        return wallets;
    }

    public void setWallets(Wallet[] wallets) {
        this.wallets = wallets;
    }

    public ListWalletsRequest getRequest() {
        return request;
    }

    public void setRequest(ListWalletsRequest request) {
        this.request = request;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }
}
