package com.coinbase.prime.model.portfolio;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostTradeCredit {
    private String portfolioId;
    private String currency;
    private String limit;
    private String utilized;
    private String available;
    private boolean frozen;
    @JsonProperty("amounts_due")
    private PostTradeCreditAmountDue[] amountsDue;

    public PostTradeCredit() {}
    public PostTradeCredit(Builder builder) {
        this.portfolioId = builder.portfolioId;
        this.currency = builder.currency;
        this.limit = builder.limit;
        this.utilized = builder.utilized;
        this.available = builder.available;
        this.frozen = builder.frozen;
        this.amountsDue = builder.amountsDue;
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public String getUtilized() {
        return utilized;
    }

    public void setUtilized(String utilized) {
        this.utilized = utilized;
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }

    public boolean isFrozen() {
        return frozen;
    }

    public void setFrozen(boolean frozen) {
        this.frozen = frozen;
    }

    public PostTradeCreditAmountDue[] getAmountsDue() {
        return amountsDue;
    }

    public void setAmountsDue(PostTradeCreditAmountDue[] amountsDue) {
        this.amountsDue = amountsDue;
    }

    public static class Builder {
        private String portfolioId;
        private String currency;
        private String limit;
        private String utilized;
        private String available;
        private boolean frozen;
        private PostTradeCreditAmountDue[] amountsDue;

        public Builder() {}

        public Builder portfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public Builder currency(String currency) {
            this.currency = currency;
            return this;
        }

        public Builder limit(String limit) {
            this.limit = limit;
            return this;
        }

        public Builder utilized(String utilized) {
            this.utilized = utilized;
            return this;
        }

        public Builder available(String available) {
            this.available = available;
            return this;
        }

        public Builder frozen(boolean frozen) {
            this.frozen = frozen;
            return this;
        }

        public Builder amountsDue(PostTradeCreditAmountDue[] amountsDue) {
            this.amountsDue = amountsDue;
            return this;
        }

        public PostTradeCredit build() {
            return new PostTradeCredit(this);
        }
    }
}
