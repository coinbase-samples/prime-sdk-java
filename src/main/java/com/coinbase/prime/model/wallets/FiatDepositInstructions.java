package com.coinbase.prime.model.wallets;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FiatDepositInstructions {
    private String id;
    private String name;
    private DepositType type;
    @JsonProperty("account_number")
    private String accountNumber;
    @JsonProperty("routing_number")
    private String routingNumber;
    @JsonProperty("reference_code")
    private String referenceCode;
}
