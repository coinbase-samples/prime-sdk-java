package com.coinbase.prime.model;

import com.coinbase.prime.model.enums.FcmPositionSide;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.Arrays;

public class FcmPosition {
    /**
     * Product ID
     */
    private String productId;

    private FcmPositionSide side;

    /**
     * Number of contracts
     */
    private String numberOfContracts;

    /**
     * Daily realized PNL
     */
    private String dailyRealizedPnl;

    /**
     * Unrealized PNL
     */
    private String unrealizedPnl;

    /**
     * Current price of position
     */
    private String currentPrice;

    /**
     * Average entry price
     */
    private String avgEntryPrice;

    /**
     * Expiration time of position
     */
    private OffsetDateTime expirationTime;

    public FcmPosition() {
    }

    public FcmPosition(Builder builder) {
        this.productId = builder.productId;
        this.side = builder.side;
        this.numberOfContracts = builder.numberOfContracts;
        this.dailyRealizedPnl = builder.dailyRealizedPnl;
        this.unrealizedPnl = builder.unrealizedPnl;
        this.currentPrice = builder.currentPrice;
        this.avgEntryPrice = builder.avgEntryPrice;
        this.expirationTime = builder.expirationTime;
    }
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
    public FcmPositionSide getSide() {
        return side;
    }

    public void setSide(FcmPositionSide side) {
        this.side = side;
    }
    public String getNumberOfContracts() {
        return numberOfContracts;
    }

    public void setNumberOfContracts(String numberOfContracts) {
        this.numberOfContracts = numberOfContracts;
    }
    public String getDailyRealizedPnl() {
        return dailyRealizedPnl;
    }

    public void setDailyRealizedPnl(String dailyRealizedPnl) {
        this.dailyRealizedPnl = dailyRealizedPnl;
    }
    public String getUnrealizedPnl() {
        return unrealizedPnl;
    }

    public void setUnrealizedPnl(String unrealizedPnl) {
        this.unrealizedPnl = unrealizedPnl;
    }
    public String getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(String currentPrice) {
        this.currentPrice = currentPrice;
    }
    public String getAvgEntryPrice() {
        return avgEntryPrice;
    }

    public void setAvgEntryPrice(String avgEntryPrice) {
        this.avgEntryPrice = avgEntryPrice;
    }
    public OffsetDateTime getExpirationTime() {
        return expirationTime;
    }

    public void setExpirationTime(OffsetDateTime expirationTime) {
        this.expirationTime = expirationTime;
    }
    public static class Builder {
        private String productId;

        private FcmPositionSide side;

        private String numberOfContracts;

        private String dailyRealizedPnl;

        private String unrealizedPnl;

        private String currentPrice;

        private String avgEntryPrice;

        private OffsetDateTime expirationTime;

        public Builder productId(String productId) {
            this.productId = productId;
            return this;
        }

        public Builder side(FcmPositionSide side) {
            this.side = side;
            return this;
        }

        public Builder numberOfContracts(String numberOfContracts) {
            this.numberOfContracts = numberOfContracts;
            return this;
        }

        public Builder dailyRealizedPnl(String dailyRealizedPnl) {
            this.dailyRealizedPnl = dailyRealizedPnl;
            return this;
        }

        public Builder unrealizedPnl(String unrealizedPnl) {
            this.unrealizedPnl = unrealizedPnl;
            return this;
        }

        public Builder currentPrice(String currentPrice) {
            this.currentPrice = currentPrice;
            return this;
        }

        public Builder avgEntryPrice(String avgEntryPrice) {
            this.avgEntryPrice = avgEntryPrice;
            return this;
        }

        public Builder expirationTime(OffsetDateTime expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }

        public FcmPosition build() {
            return new FcmPosition(this);
        }
    }
}

