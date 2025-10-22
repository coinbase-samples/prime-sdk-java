package com.coinbase.prime.model;

import com.coinbase.prime.model.enums.OrderSide;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.Arrays;

public class Fill {
    /**
     * The unique ID of the fill
     */
    private String id;

    /**
     * The order ID of the fill
     */
    private String orderId;

    /**
     * The product ID of the fill
     */
    private String productId;

    /**
     * The client product ID of the fill indictating the settlment currency
     */
    private String clientProductId;

    private OrderSide side;

    /**
     * Filled size (in base asset units)
     */
    private String filledQuantity;

    /**
     * Filled value (in quote asset units)
     */
    private String filledValue;

    /**
     * The price of the fill
     */
    private String price;

    /**
     * The date and time of the fill
     */
    private OffsetDateTime time;

    /**
     * The commission incurred for the fill
     */
    private String commission;

    /**
     * The name of the venue
     */
    private String venue;

    /**
     * The venue fees incurred for the fill
     */
    private String venueFees;

    /**
     * The CES commission incurred for the fill
     */
    private String cesCommission;

    public Fill() {
    }

    public Fill(Builder builder) {
        this.id = builder.id;
        this.orderId = builder.orderId;
        this.productId = builder.productId;
        this.clientProductId = builder.clientProductId;
        this.side = builder.side;
        this.filledQuantity = builder.filledQuantity;
        this.filledValue = builder.filledValue;
        this.price = builder.price;
        this.time = builder.time;
        this.commission = builder.commission;
        this.venue = builder.venue;
        this.venueFees = builder.venueFees;
        this.cesCommission = builder.cesCommission;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
    public String getClientProductId() {
        return clientProductId;
    }

    public void setClientProductId(String clientProductId) {
        this.clientProductId = clientProductId;
    }
    public OrderSide getSide() {
        return side;
    }

    public void setSide(OrderSide side) {
        this.side = side;
    }
    public String getFilledQuantity() {
        return filledQuantity;
    }

    public void setFilledQuantity(String filledQuantity) {
        this.filledQuantity = filledQuantity;
    }
    public String getFilledValue() {
        return filledValue;
    }

    public void setFilledValue(String filledValue) {
        this.filledValue = filledValue;
    }
    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    public OffsetDateTime getTime() {
        return time;
    }

    public void setTime(OffsetDateTime time) {
        this.time = time;
    }
    public String getCommission() {
        return commission;
    }

    public void setCommission(String commission) {
        this.commission = commission;
    }
    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }
    public String getVenueFees() {
        return venueFees;
    }

    public void setVenueFees(String venueFees) {
        this.venueFees = venueFees;
    }
    public String getCesCommission() {
        return cesCommission;
    }

    public void setCesCommission(String cesCommission) {
        this.cesCommission = cesCommission;
    }
    public static class Builder {
        private String id;

        private String orderId;

        private String productId;

        private String clientProductId;

        private OrderSide side;

        private String filledQuantity;

        private String filledValue;

        private String price;

        private OffsetDateTime time;

        private String commission;

        private String venue;

        private String venueFees;

        private String cesCommission;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        public Builder productId(String productId) {
            this.productId = productId;
            return this;
        }

        public Builder clientProductId(String clientProductId) {
            this.clientProductId = clientProductId;
            return this;
        }

        public Builder side(OrderSide side) {
            this.side = side;
            return this;
        }

        public Builder filledQuantity(String filledQuantity) {
            this.filledQuantity = filledQuantity;
            return this;
        }

        public Builder filledValue(String filledValue) {
            this.filledValue = filledValue;
            return this;
        }

        public Builder price(String price) {
            this.price = price;
            return this;
        }

        public Builder time(OffsetDateTime time) {
            this.time = time;
            return this;
        }

        public Builder commission(String commission) {
            this.commission = commission;
            return this;
        }

        public Builder venue(String venue) {
            this.venue = venue;
            return this;
        }

        public Builder venueFees(String venueFees) {
            this.venueFees = venueFees;
            return this;
        }

        public Builder cesCommission(String cesCommission) {
            this.cesCommission = cesCommission;
            return this;
        }

        public Fill build() {
            return new Fill(this);
        }
    }
}

