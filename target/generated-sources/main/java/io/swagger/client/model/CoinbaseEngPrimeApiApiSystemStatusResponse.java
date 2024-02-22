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
import io.swagger.client.model.CoinbaseEngPrimeApiApiSystemStatus;
import java.io.IOException;

/**
 * CoinbaseEngPrimeApiApiSystemStatusResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-22T12:46:00.828-08:00")
public class CoinbaseEngPrimeApiApiSystemStatusResponse {
  @SerializedName("overall_status")
  private CoinbaseEngPrimeApiApiSystemStatus overallStatus = null;

  @SerializedName("analytics_status")
  private CoinbaseEngPrimeApiApiSystemStatus analyticsStatus = null;

  @SerializedName("trade_status")
  private CoinbaseEngPrimeApiApiSystemStatus tradeStatus = null;

  @SerializedName("cancel_only_mode_status")
  private CoinbaseEngPrimeApiApiSystemStatus cancelOnlyModeStatus = null;

  public CoinbaseEngPrimeApiApiSystemStatusResponse overallStatus(CoinbaseEngPrimeApiApiSystemStatus overallStatus) {
    this.overallStatus = overallStatus;
    return this;
  }

   /**
   * Get overallStatus
   * @return overallStatus
  **/
  @ApiModelProperty(required = true, value = "")
  public CoinbaseEngPrimeApiApiSystemStatus getOverallStatus() {
    return overallStatus;
  }

  public void setOverallStatus(CoinbaseEngPrimeApiApiSystemStatus overallStatus) {
    this.overallStatus = overallStatus;
  }

  public CoinbaseEngPrimeApiApiSystemStatusResponse analyticsStatus(CoinbaseEngPrimeApiApiSystemStatus analyticsStatus) {
    this.analyticsStatus = analyticsStatus;
    return this;
  }

   /**
   * Get analyticsStatus
   * @return analyticsStatus
  **/
  @ApiModelProperty(required = true, value = "")
  public CoinbaseEngPrimeApiApiSystemStatus getAnalyticsStatus() {
    return analyticsStatus;
  }

  public void setAnalyticsStatus(CoinbaseEngPrimeApiApiSystemStatus analyticsStatus) {
    this.analyticsStatus = analyticsStatus;
  }

  public CoinbaseEngPrimeApiApiSystemStatusResponse tradeStatus(CoinbaseEngPrimeApiApiSystemStatus tradeStatus) {
    this.tradeStatus = tradeStatus;
    return this;
  }

   /**
   * Get tradeStatus
   * @return tradeStatus
  **/
  @ApiModelProperty(required = true, value = "")
  public CoinbaseEngPrimeApiApiSystemStatus getTradeStatus() {
    return tradeStatus;
  }

  public void setTradeStatus(CoinbaseEngPrimeApiApiSystemStatus tradeStatus) {
    this.tradeStatus = tradeStatus;
  }

  public CoinbaseEngPrimeApiApiSystemStatusResponse cancelOnlyModeStatus(CoinbaseEngPrimeApiApiSystemStatus cancelOnlyModeStatus) {
    this.cancelOnlyModeStatus = cancelOnlyModeStatus;
    return this;
  }

   /**
   * Get cancelOnlyModeStatus
   * @return cancelOnlyModeStatus
  **/
  @ApiModelProperty(required = true, value = "")
  public CoinbaseEngPrimeApiApiSystemStatus getCancelOnlyModeStatus() {
    return cancelOnlyModeStatus;
  }

  public void setCancelOnlyModeStatus(CoinbaseEngPrimeApiApiSystemStatus cancelOnlyModeStatus) {
    this.cancelOnlyModeStatus = cancelOnlyModeStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoinbaseEngPrimeApiApiSystemStatusResponse coinbaseEngPrimeApiApiSystemStatusResponse = (CoinbaseEngPrimeApiApiSystemStatusResponse) o;
    return Objects.equals(this.overallStatus, coinbaseEngPrimeApiApiSystemStatusResponse.overallStatus) &&
        Objects.equals(this.analyticsStatus, coinbaseEngPrimeApiApiSystemStatusResponse.analyticsStatus) &&
        Objects.equals(this.tradeStatus, coinbaseEngPrimeApiApiSystemStatusResponse.tradeStatus) &&
        Objects.equals(this.cancelOnlyModeStatus, coinbaseEngPrimeApiApiSystemStatusResponse.cancelOnlyModeStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(overallStatus, analyticsStatus, tradeStatus, cancelOnlyModeStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoinbaseEngPrimeApiApiSystemStatusResponse {\n");
    
    sb.append("    overallStatus: ").append(toIndentedString(overallStatus)).append("\n");
    sb.append("    analyticsStatus: ").append(toIndentedString(analyticsStatus)).append("\n");
    sb.append("    tradeStatus: ").append(toIndentedString(tradeStatus)).append("\n");
    sb.append("    cancelOnlyModeStatus: ").append(toIndentedString(cancelOnlyModeStatus)).append("\n");
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

