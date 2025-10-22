package com.coinbase.prime.model;

import com.coinbase.prime.model.AmountDue;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PostTradeCreditInformation {
    /**
     * The unique ID of the portfolio
     */
    private String portfolioId;

    /**
     * The currency symbol credit is denoted in
     */
    private String currency;

    /**
     * The maximum credit limit
     */
    private String limit;

    /**
     * The amount of credit used
     */
    private String utilized;

    /**
     * The amount of credit available
     */
    private String available;

    /**
     * Whether or not a portfolio is frozen due to balance outstanding or other reason
     */
    private Boolean frozen;

    /**
     * The reason why the portfolio is frozen
     */
    private String frozenReason;

    private List<AmountDue> amountsDue;

    /**
     * Whether the portfolio has credit enabled
     */
    private Boolean enabled;

    /**
     * The amount of adjusted credit used
     */
    private String adjustedCreditUtilized;

    /**
     * The amount of adjusted portfolio equity
     */
    private String adjustedPortfolioEquity;

    public PostTradeCreditInformation() {
    }

    public PostTradeCreditInformation(Builder builder) {
        this.portfolioId = builder.portfolioId;
        this.currency = builder.currency;
        this.limit = builder.limit;
        this.utilized = builder.utilized;
        this.available = builder.available;
        this.frozen = builder.frozen;
        this.frozenReason = builder.frozenReason;
        this.amountsDue = builder.amountsDue;
        this.enabled = builder.enabled;
        this.adjustedCreditUtilized = builder.adjustedCreditUtilized;
        this.adjustedPortfolioEquity = builder.adjustedPortfolioEquity;
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
    public Boolean getFrozen() {
        return frozen;
    }

    public void setFrozen(Boolean frozen) {
        this.frozen = frozen;
    }
    public String getFrozenReason() {
        return frozenReason;
    }

    public void setFrozenReason(String frozenReason) {
        this.frozenReason = frozenReason;
    }
    public List<AmountDue> getAmountsDue() {
        return amountsDue;
    }

    public void setAmountsDue(List<AmountDue> amountsDue) {
        this.amountsDue = amountsDue;
    }
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
    public String getAdjustedCreditUtilized() {
        return adjustedCreditUtilized;
    }

    public void setAdjustedCreditUtilized(String adjustedCreditUtilized) {
        this.adjustedCreditUtilized = adjustedCreditUtilized;
    }
    public String getAdjustedPortfolioEquity() {
        return adjustedPortfolioEquity;
    }

    public void setAdjustedPortfolioEquity(String adjustedPortfolioEquity) {
        this.adjustedPortfolioEquity = adjustedPortfolioEquity;
    }
    public static class Builder {
        private String portfolioId;

        private String currency;

        private String limit;

        private String utilized;

        private String available;

        private Boolean frozen;

        private String frozenReason;

        private List<AmountDue> amountsDue;

        private Boolean enabled;

        private String adjustedCreditUtilized;

        private String adjustedPortfolioEquity;

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

        public Builder frozen(Boolean frozen) {
            this.frozen = frozen;
            return this;
        }

        public Builder frozenReason(String frozenReason) {
            this.frozenReason = frozenReason;
            return this;
        }

        public Builder amountsDue(List<AmountDue> amountsDue) {
            this.amountsDue = amountsDue;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder adjustedCreditUtilized(String adjustedCreditUtilized) {
            this.adjustedCreditUtilized = adjustedCreditUtilized;
            return this;
        }

        public Builder adjustedPortfolioEquity(String adjustedPortfolioEquity) {
            this.adjustedPortfolioEquity = adjustedPortfolioEquity;
            return this;
        }

        public PostTradeCreditInformation build() {
            return new PostTradeCreditInformation(this);
        }
    }
}

