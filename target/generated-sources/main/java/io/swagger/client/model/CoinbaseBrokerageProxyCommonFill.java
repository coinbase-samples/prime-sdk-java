/*
 * Coinbase Prime REST API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.CoinbaseBrokerageProxyCommonCommissionModel;
import io.swagger.client.model.CoinbaseBrokerageProxyCommonFillMetadata;
import io.swagger.client.model.CoinbaseBrokerageProxyCommonLiquidityIndicator;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * CoinbaseBrokerageProxyCommonFill
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-22T12:46:00.828-08:00")
public class CoinbaseBrokerageProxyCommonFill {
  @SerializedName("entry_id")
  private String entryId = null;

  @SerializedName("trade_id")
  private String tradeId = null;

  @SerializedName("order_id")
  private String orderId = null;

  @SerializedName("trade_time")
  private OffsetDateTime tradeTime = null;

  @SerializedName("trade_type")
  private String tradeType = null;

  @SerializedName("price")
  private String price = null;

  @SerializedName("size")
  private String size = null;

  @SerializedName("commission")
  private String commission = null;

  @SerializedName("venue_id")
  private String venueId = null;

  @SerializedName("venue_name")
  private String venueName = null;

  @SerializedName("product_id")
  private String productId = null;

  @SerializedName("sequence_timestamp")
  private OffsetDateTime sequenceTimestamp = null;

  @SerializedName("liquidity_indicator")
  private CoinbaseBrokerageProxyCommonLiquidityIndicator liquidityIndicator = null;

  @SerializedName("metadata")
  private CoinbaseBrokerageProxyCommonFillMetadata metadata = null;

  @SerializedName("size_in_quote")
  private Boolean sizeInQuote = null;

  @SerializedName("all_in_commission_details_client_commission")
  private String allInCommissionDetailsClientCommission = null;

  @SerializedName("cost_plus_commission_details_client_commission")
  private String costPlusCommissionDetailsClientCommission = null;

  @SerializedName("cost_plus_commission_details_venue_commission")
  private String costPlusCommissionDetailsVenueCommission = null;

  @SerializedName("commission_model")
  private CoinbaseBrokerageProxyCommonCommissionModel commissionModel = null;

  @SerializedName("all_in_commission_details_ces_commission")
  private String allInCommissionDetailsCesCommission = null;

  @SerializedName("cost_plus_commission_details_ces_commission")
  private String costPlusCommissionDetailsCesCommission = null;

  @SerializedName("base_size")
  private String baseSize = null;

  @SerializedName("quote_size")
  private String quoteSize = null;

  @SerializedName("is_dust_eligible")
  private Boolean isDustEligible = null;

  public CoinbaseBrokerageProxyCommonFill entryId(String entryId) {
    this.entryId = entryId;
    return this;
  }

   /**
   * Get entryId
   * @return entryId
  **/
  @ApiModelProperty(value = "")
  public String getEntryId() {
    return entryId;
  }

  public void setEntryId(String entryId) {
    this.entryId = entryId;
  }

  public CoinbaseBrokerageProxyCommonFill tradeId(String tradeId) {
    this.tradeId = tradeId;
    return this;
  }

   /**
   * Get tradeId
   * @return tradeId
  **/
  @ApiModelProperty(value = "")
  public String getTradeId() {
    return tradeId;
  }

  public void setTradeId(String tradeId) {
    this.tradeId = tradeId;
  }

  public CoinbaseBrokerageProxyCommonFill orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * Get orderId
   * @return orderId
  **/
  @ApiModelProperty(value = "")
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public CoinbaseBrokerageProxyCommonFill tradeTime(OffsetDateTime tradeTime) {
    this.tradeTime = tradeTime;
    return this;
  }

   /**
   * Get tradeTime
   * @return tradeTime
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getTradeTime() {
    return tradeTime;
  }

  public void setTradeTime(OffsetDateTime tradeTime) {
    this.tradeTime = tradeTime;
  }

  public CoinbaseBrokerageProxyCommonFill tradeType(String tradeType) {
    this.tradeType = tradeType;
    return this;
  }

   /**
   * Get tradeType
   * @return tradeType
  **/
  @ApiModelProperty(value = "")
  public String getTradeType() {
    return tradeType;
  }

  public void setTradeType(String tradeType) {
    this.tradeType = tradeType;
  }

  public CoinbaseBrokerageProxyCommonFill price(String price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @ApiModelProperty(value = "")
  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  public CoinbaseBrokerageProxyCommonFill size(String size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @ApiModelProperty(value = "")
  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public CoinbaseBrokerageProxyCommonFill commission(String commission) {
    this.commission = commission;
    return this;
  }

   /**
   * Get commission
   * @return commission
  **/
  @ApiModelProperty(value = "")
  public String getCommission() {
    return commission;
  }

  public void setCommission(String commission) {
    this.commission = commission;
  }

  public CoinbaseBrokerageProxyCommonFill venueId(String venueId) {
    this.venueId = venueId;
    return this;
  }

   /**
   * Get venueId
   * @return venueId
  **/
  @ApiModelProperty(value = "")
  public String getVenueId() {
    return venueId;
  }

  public void setVenueId(String venueId) {
    this.venueId = venueId;
  }

  public CoinbaseBrokerageProxyCommonFill venueName(String venueName) {
    this.venueName = venueName;
    return this;
  }

   /**
   * Get venueName
   * @return venueName
  **/
  @ApiModelProperty(value = "")
  public String getVenueName() {
    return venueName;
  }

  public void setVenueName(String venueName) {
    this.venueName = venueName;
  }

  public CoinbaseBrokerageProxyCommonFill productId(String productId) {
    this.productId = productId;
    return this;
  }

   /**
   * Get productId
   * @return productId
  **/
  @ApiModelProperty(value = "")
  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  public CoinbaseBrokerageProxyCommonFill sequenceTimestamp(OffsetDateTime sequenceTimestamp) {
    this.sequenceTimestamp = sequenceTimestamp;
    return this;
  }

   /**
   * Get sequenceTimestamp
   * @return sequenceTimestamp
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getSequenceTimestamp() {
    return sequenceTimestamp;
  }

  public void setSequenceTimestamp(OffsetDateTime sequenceTimestamp) {
    this.sequenceTimestamp = sequenceTimestamp;
  }

  public CoinbaseBrokerageProxyCommonFill liquidityIndicator(CoinbaseBrokerageProxyCommonLiquidityIndicator liquidityIndicator) {
    this.liquidityIndicator = liquidityIndicator;
    return this;
  }

   /**
   * Get liquidityIndicator
   * @return liquidityIndicator
  **/
  @ApiModelProperty(value = "")
  public CoinbaseBrokerageProxyCommonLiquidityIndicator getLiquidityIndicator() {
    return liquidityIndicator;
  }

  public void setLiquidityIndicator(CoinbaseBrokerageProxyCommonLiquidityIndicator liquidityIndicator) {
    this.liquidityIndicator = liquidityIndicator;
  }

  public CoinbaseBrokerageProxyCommonFill metadata(CoinbaseBrokerageProxyCommonFillMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(value = "")
  public CoinbaseBrokerageProxyCommonFillMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(CoinbaseBrokerageProxyCommonFillMetadata metadata) {
    this.metadata = metadata;
  }

  public CoinbaseBrokerageProxyCommonFill sizeInQuote(Boolean sizeInQuote) {
    this.sizeInQuote = sizeInQuote;
    return this;
  }

   /**
   * Get sizeInQuote
   * @return sizeInQuote
  **/
  @ApiModelProperty(value = "")
  public Boolean isSizeInQuote() {
    return sizeInQuote;
  }

  public void setSizeInQuote(Boolean sizeInQuote) {
    this.sizeInQuote = sizeInQuote;
  }

  public CoinbaseBrokerageProxyCommonFill allInCommissionDetailsClientCommission(String allInCommissionDetailsClientCommission) {
    this.allInCommissionDetailsClientCommission = allInCommissionDetailsClientCommission;
    return this;
  }

   /**
   * Get allInCommissionDetailsClientCommission
   * @return allInCommissionDetailsClientCommission
  **/
  @ApiModelProperty(value = "")
  public String getAllInCommissionDetailsClientCommission() {
    return allInCommissionDetailsClientCommission;
  }

  public void setAllInCommissionDetailsClientCommission(String allInCommissionDetailsClientCommission) {
    this.allInCommissionDetailsClientCommission = allInCommissionDetailsClientCommission;
  }

  public CoinbaseBrokerageProxyCommonFill costPlusCommissionDetailsClientCommission(String costPlusCommissionDetailsClientCommission) {
    this.costPlusCommissionDetailsClientCommission = costPlusCommissionDetailsClientCommission;
    return this;
  }

   /**
   * Get costPlusCommissionDetailsClientCommission
   * @return costPlusCommissionDetailsClientCommission
  **/
  @ApiModelProperty(value = "")
  public String getCostPlusCommissionDetailsClientCommission() {
    return costPlusCommissionDetailsClientCommission;
  }

  public void setCostPlusCommissionDetailsClientCommission(String costPlusCommissionDetailsClientCommission) {
    this.costPlusCommissionDetailsClientCommission = costPlusCommissionDetailsClientCommission;
  }

  public CoinbaseBrokerageProxyCommonFill costPlusCommissionDetailsVenueCommission(String costPlusCommissionDetailsVenueCommission) {
    this.costPlusCommissionDetailsVenueCommission = costPlusCommissionDetailsVenueCommission;
    return this;
  }

   /**
   * Get costPlusCommissionDetailsVenueCommission
   * @return costPlusCommissionDetailsVenueCommission
  **/
  @ApiModelProperty(value = "")
  public String getCostPlusCommissionDetailsVenueCommission() {
    return costPlusCommissionDetailsVenueCommission;
  }

  public void setCostPlusCommissionDetailsVenueCommission(String costPlusCommissionDetailsVenueCommission) {
    this.costPlusCommissionDetailsVenueCommission = costPlusCommissionDetailsVenueCommission;
  }

  public CoinbaseBrokerageProxyCommonFill commissionModel(CoinbaseBrokerageProxyCommonCommissionModel commissionModel) {
    this.commissionModel = commissionModel;
    return this;
  }

   /**
   * Get commissionModel
   * @return commissionModel
  **/
  @ApiModelProperty(value = "")
  public CoinbaseBrokerageProxyCommonCommissionModel getCommissionModel() {
    return commissionModel;
  }

  public void setCommissionModel(CoinbaseBrokerageProxyCommonCommissionModel commissionModel) {
    this.commissionModel = commissionModel;
  }

  public CoinbaseBrokerageProxyCommonFill allInCommissionDetailsCesCommission(String allInCommissionDetailsCesCommission) {
    this.allInCommissionDetailsCesCommission = allInCommissionDetailsCesCommission;
    return this;
  }

   /**
   * Get allInCommissionDetailsCesCommission
   * @return allInCommissionDetailsCesCommission
  **/
  @ApiModelProperty(value = "")
  public String getAllInCommissionDetailsCesCommission() {
    return allInCommissionDetailsCesCommission;
  }

  public void setAllInCommissionDetailsCesCommission(String allInCommissionDetailsCesCommission) {
    this.allInCommissionDetailsCesCommission = allInCommissionDetailsCesCommission;
  }

  public CoinbaseBrokerageProxyCommonFill costPlusCommissionDetailsCesCommission(String costPlusCommissionDetailsCesCommission) {
    this.costPlusCommissionDetailsCesCommission = costPlusCommissionDetailsCesCommission;
    return this;
  }

   /**
   * Get costPlusCommissionDetailsCesCommission
   * @return costPlusCommissionDetailsCesCommission
  **/
  @ApiModelProperty(value = "")
  public String getCostPlusCommissionDetailsCesCommission() {
    return costPlusCommissionDetailsCesCommission;
  }

  public void setCostPlusCommissionDetailsCesCommission(String costPlusCommissionDetailsCesCommission) {
    this.costPlusCommissionDetailsCesCommission = costPlusCommissionDetailsCesCommission;
  }

  public CoinbaseBrokerageProxyCommonFill baseSize(String baseSize) {
    this.baseSize = baseSize;
    return this;
  }

   /**
   * Get baseSize
   * @return baseSize
  **/
  @ApiModelProperty(value = "")
  public String getBaseSize() {
    return baseSize;
  }

  public void setBaseSize(String baseSize) {
    this.baseSize = baseSize;
  }

  public CoinbaseBrokerageProxyCommonFill quoteSize(String quoteSize) {
    this.quoteSize = quoteSize;
    return this;
  }

   /**
   * Get quoteSize
   * @return quoteSize
  **/
  @ApiModelProperty(value = "")
  public String getQuoteSize() {
    return quoteSize;
  }

  public void setQuoteSize(String quoteSize) {
    this.quoteSize = quoteSize;
  }

  public CoinbaseBrokerageProxyCommonFill isDustEligible(Boolean isDustEligible) {
    this.isDustEligible = isDustEligible;
    return this;
  }

   /**
   * Get isDustEligible
   * @return isDustEligible
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsDustEligible() {
    return isDustEligible;
  }

  public void setIsDustEligible(Boolean isDustEligible) {
    this.isDustEligible = isDustEligible;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoinbaseBrokerageProxyCommonFill coinbaseBrokerageProxyCommonFill = (CoinbaseBrokerageProxyCommonFill) o;
    return Objects.equals(this.entryId, coinbaseBrokerageProxyCommonFill.entryId) &&
        Objects.equals(this.tradeId, coinbaseBrokerageProxyCommonFill.tradeId) &&
        Objects.equals(this.orderId, coinbaseBrokerageProxyCommonFill.orderId) &&
        Objects.equals(this.tradeTime, coinbaseBrokerageProxyCommonFill.tradeTime) &&
        Objects.equals(this.tradeType, coinbaseBrokerageProxyCommonFill.tradeType) &&
        Objects.equals(this.price, coinbaseBrokerageProxyCommonFill.price) &&
        Objects.equals(this.size, coinbaseBrokerageProxyCommonFill.size) &&
        Objects.equals(this.commission, coinbaseBrokerageProxyCommonFill.commission) &&
        Objects.equals(this.venueId, coinbaseBrokerageProxyCommonFill.venueId) &&
        Objects.equals(this.venueName, coinbaseBrokerageProxyCommonFill.venueName) &&
        Objects.equals(this.productId, coinbaseBrokerageProxyCommonFill.productId) &&
        Objects.equals(this.sequenceTimestamp, coinbaseBrokerageProxyCommonFill.sequenceTimestamp) &&
        Objects.equals(this.liquidityIndicator, coinbaseBrokerageProxyCommonFill.liquidityIndicator) &&
        Objects.equals(this.metadata, coinbaseBrokerageProxyCommonFill.metadata) &&
        Objects.equals(this.sizeInQuote, coinbaseBrokerageProxyCommonFill.sizeInQuote) &&
        Objects.equals(this.allInCommissionDetailsClientCommission, coinbaseBrokerageProxyCommonFill.allInCommissionDetailsClientCommission) &&
        Objects.equals(this.costPlusCommissionDetailsClientCommission, coinbaseBrokerageProxyCommonFill.costPlusCommissionDetailsClientCommission) &&
        Objects.equals(this.costPlusCommissionDetailsVenueCommission, coinbaseBrokerageProxyCommonFill.costPlusCommissionDetailsVenueCommission) &&
        Objects.equals(this.commissionModel, coinbaseBrokerageProxyCommonFill.commissionModel) &&
        Objects.equals(this.allInCommissionDetailsCesCommission, coinbaseBrokerageProxyCommonFill.allInCommissionDetailsCesCommission) &&
        Objects.equals(this.costPlusCommissionDetailsCesCommission, coinbaseBrokerageProxyCommonFill.costPlusCommissionDetailsCesCommission) &&
        Objects.equals(this.baseSize, coinbaseBrokerageProxyCommonFill.baseSize) &&
        Objects.equals(this.quoteSize, coinbaseBrokerageProxyCommonFill.quoteSize) &&
        Objects.equals(this.isDustEligible, coinbaseBrokerageProxyCommonFill.isDustEligible);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entryId, tradeId, orderId, tradeTime, tradeType, price, size, commission, venueId, venueName, productId, sequenceTimestamp, liquidityIndicator, metadata, sizeInQuote, allInCommissionDetailsClientCommission, costPlusCommissionDetailsClientCommission, costPlusCommissionDetailsVenueCommission, commissionModel, allInCommissionDetailsCesCommission, costPlusCommissionDetailsCesCommission, baseSize, quoteSize, isDustEligible);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoinbaseBrokerageProxyCommonFill {\n");
    
    sb.append("    entryId: ").append(toIndentedString(entryId)).append("\n");
    sb.append("    tradeId: ").append(toIndentedString(tradeId)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    tradeTime: ").append(toIndentedString(tradeTime)).append("\n");
    sb.append("    tradeType: ").append(toIndentedString(tradeType)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    commission: ").append(toIndentedString(commission)).append("\n");
    sb.append("    venueId: ").append(toIndentedString(venueId)).append("\n");
    sb.append("    venueName: ").append(toIndentedString(venueName)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    sequenceTimestamp: ").append(toIndentedString(sequenceTimestamp)).append("\n");
    sb.append("    liquidityIndicator: ").append(toIndentedString(liquidityIndicator)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    sizeInQuote: ").append(toIndentedString(sizeInQuote)).append("\n");
    sb.append("    allInCommissionDetailsClientCommission: ").append(toIndentedString(allInCommissionDetailsClientCommission)).append("\n");
    sb.append("    costPlusCommissionDetailsClientCommission: ").append(toIndentedString(costPlusCommissionDetailsClientCommission)).append("\n");
    sb.append("    costPlusCommissionDetailsVenueCommission: ").append(toIndentedString(costPlusCommissionDetailsVenueCommission)).append("\n");
    sb.append("    commissionModel: ").append(toIndentedString(commissionModel)).append("\n");
    sb.append("    allInCommissionDetailsCesCommission: ").append(toIndentedString(allInCommissionDetailsCesCommission)).append("\n");
    sb.append("    costPlusCommissionDetailsCesCommission: ").append(toIndentedString(costPlusCommissionDetailsCesCommission)).append("\n");
    sb.append("    baseSize: ").append(toIndentedString(baseSize)).append("\n");
    sb.append("    quoteSize: ").append(toIndentedString(quoteSize)).append("\n");
    sb.append("    isDustEligible: ").append(toIndentedString(isDustEligible)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

