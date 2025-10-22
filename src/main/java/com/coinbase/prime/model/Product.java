package com.coinbase.prime.model;

import com.coinbase.prime.model.enums.ProductPermissions;
import com.coinbase.prime.model.RFQProductDetails;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Product {
    /**
     * The product ID, written as &#x60;BASE-QUOTE&#x60;
     */
    private String id;

    /**
     * The smallest permitted unit of denomination for the base asset (varies by product)
     */
    private String baseIncrement;

    /**
     * The smallest permitted unit of denomination for the quote asset (varies by product)
     */
    private String quoteIncrement;

    /**
     * The minimum size (in base asset units) for which an order can be placed
     */
    private String baseMinSize;

    /**
     * The minimum size (in quote asset units) for which an order can be placed
     */
    private String quoteMinSize;

    /**
     * The maximum size (in base asset units) for which an order can be placed
     */
    private String baseMaxSize;

    /**
     * The maximum size (in quote asset units) for which an order can be placed
     */
    private String quoteMaxSize;

    /**
     * Permissions given to the user for a product
     */
    private List<ProductPermissions> permissions;

    /**
     * The smallest permitted price increment for the product
     */
    private String priceIncrement;

    private RFQProductDetails rfqProductDetails;

    public Product() {
    }

    public Product(Builder builder) {
        this.id = builder.id;
        this.baseIncrement = builder.baseIncrement;
        this.quoteIncrement = builder.quoteIncrement;
        this.baseMinSize = builder.baseMinSize;
        this.quoteMinSize = builder.quoteMinSize;
        this.baseMaxSize = builder.baseMaxSize;
        this.quoteMaxSize = builder.quoteMaxSize;
        this.permissions = builder.permissions;
        this.priceIncrement = builder.priceIncrement;
        this.rfqProductDetails = builder.rfqProductDetails;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getBaseIncrement() {
        return baseIncrement;
    }

    public void setBaseIncrement(String baseIncrement) {
        this.baseIncrement = baseIncrement;
    }
    public String getQuoteIncrement() {
        return quoteIncrement;
    }

    public void setQuoteIncrement(String quoteIncrement) {
        this.quoteIncrement = quoteIncrement;
    }
    public String getBaseMinSize() {
        return baseMinSize;
    }

    public void setBaseMinSize(String baseMinSize) {
        this.baseMinSize = baseMinSize;
    }
    public String getQuoteMinSize() {
        return quoteMinSize;
    }

    public void setQuoteMinSize(String quoteMinSize) {
        this.quoteMinSize = quoteMinSize;
    }
    public String getBaseMaxSize() {
        return baseMaxSize;
    }

    public void setBaseMaxSize(String baseMaxSize) {
        this.baseMaxSize = baseMaxSize;
    }
    public String getQuoteMaxSize() {
        return quoteMaxSize;
    }

    public void setQuoteMaxSize(String quoteMaxSize) {
        this.quoteMaxSize = quoteMaxSize;
    }
    public List<ProductPermissions> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<ProductPermissions> permissions) {
        this.permissions = permissions;
    }
    public String getPriceIncrement() {
        return priceIncrement;
    }

    public void setPriceIncrement(String priceIncrement) {
        this.priceIncrement = priceIncrement;
    }
    public RFQProductDetails getRfqProductDetails() {
        return rfqProductDetails;
    }

    public void setRfqProductDetails(RFQProductDetails rfqProductDetails) {
        this.rfqProductDetails = rfqProductDetails;
    }
    public static class Builder {
        private String id;

        private String baseIncrement;

        private String quoteIncrement;

        private String baseMinSize;

        private String quoteMinSize;

        private String baseMaxSize;

        private String quoteMaxSize;

        private List<ProductPermissions> permissions;

        private String priceIncrement;

        private RFQProductDetails rfqProductDetails;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder baseIncrement(String baseIncrement) {
            this.baseIncrement = baseIncrement;
            return this;
        }

        public Builder quoteIncrement(String quoteIncrement) {
            this.quoteIncrement = quoteIncrement;
            return this;
        }

        public Builder baseMinSize(String baseMinSize) {
            this.baseMinSize = baseMinSize;
            return this;
        }

        public Builder quoteMinSize(String quoteMinSize) {
            this.quoteMinSize = quoteMinSize;
            return this;
        }

        public Builder baseMaxSize(String baseMaxSize) {
            this.baseMaxSize = baseMaxSize;
            return this;
        }

        public Builder quoteMaxSize(String quoteMaxSize) {
            this.quoteMaxSize = quoteMaxSize;
            return this;
        }

        public Builder permissions(List<ProductPermissions> permissions) {
            this.permissions = permissions;
            return this;
        }

        public Builder priceIncrement(String priceIncrement) {
            this.priceIncrement = priceIncrement;
            return this;
        }

        public Builder rfqProductDetails(RFQProductDetails rfqProductDetails) {
            this.rfqProductDetails = rfqProductDetails;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }
}

