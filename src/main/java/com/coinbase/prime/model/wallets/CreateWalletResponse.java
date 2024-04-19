package com.coinbase.prime.model.wallets;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateWalletResponse {
    @JsonProperty("activity_id")
    private String activityId;

    private String name;

    private String symbol;

    @JsonProperty("wallet_type")
    private WalletType type;

    private CreateWalletRequest request;

    public CreateWalletResponse() {
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public WalletType getType() {
        return type;
    }

    public void setType(WalletType type) {
        this.type = type;
    }

    public CreateWalletRequest getRequest() {
        return request;
    }

    public void setRequest(CreateWalletRequest request) {
        this.request = request;
    }
}
