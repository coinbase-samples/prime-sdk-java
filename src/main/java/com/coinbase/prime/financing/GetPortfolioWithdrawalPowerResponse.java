package com.coinbase.prime.financing;

import com.coinbase.prime.model.WithdrawalPower;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetPortfolioWithdrawalPowerResponse {
    @JsonProperty("withdrawal_power")
    private WithdrawalPower withdrawalPower;

    public GetPortfolioWithdrawalPowerResponse() {
    }

    public GetPortfolioWithdrawalPowerResponse(GetPortfolioWithdrawalPowerResponse.Builder builder) {
        this.withdrawalPower = builder.withdrawalPower;
    }

    public WithdrawalPower getWithdrawalPower() {
        return withdrawalPower;
    }

    public void setWithdrawalPower(WithdrawalPower withdrawalPower) {
        this.withdrawalPower = withdrawalPower;
    }

    public static class Builder {
        private WithdrawalPower withdrawalPower;

        public Builder() {
        }

        public GetPortfolioWithdrawalPowerResponse.Builder withWithdrawalPower(WithdrawalPower withdrawalPower) {
            this.withdrawalPower = withdrawalPower;
            return this;
        }

        public GetPortfolioWithdrawalPowerResponse build() {
            return new GetPortfolioWithdrawalPowerResponse(this);
        }
    }
}
