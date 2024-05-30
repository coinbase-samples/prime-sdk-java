package com.coinbase.prime.model.balances;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Web3WalletAsset {
    private String network;
    @JsonProperty("contract_address")
    private String contractAddress;
    private String symbol;
    @JsonProperty("token_id")
    private String tokenId;
}
