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
import io.swagger.client.model.CoinbaseBrokerageProxyTradingApiTradeReportVenueFill;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CoinbaseBrokerageProxyTradingApiGetTradeReportVenueFillsResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-22T12:46:00.828-08:00")
public class CoinbaseBrokerageProxyTradingApiGetTradeReportVenueFillsResponse {
  @SerializedName("venue_fills")
  private List<CoinbaseBrokerageProxyTradingApiTradeReportVenueFill> venueFills = null;

  public CoinbaseBrokerageProxyTradingApiGetTradeReportVenueFillsResponse venueFills(List<CoinbaseBrokerageProxyTradingApiTradeReportVenueFill> venueFills) {
    this.venueFills = venueFills;
    return this;
  }

  public CoinbaseBrokerageProxyTradingApiGetTradeReportVenueFillsResponse addVenueFillsItem(CoinbaseBrokerageProxyTradingApiTradeReportVenueFill venueFillsItem) {
    if (this.venueFills == null) {
      this.venueFills = new ArrayList<CoinbaseBrokerageProxyTradingApiTradeReportVenueFill>();
    }
    this.venueFills.add(venueFillsItem);
    return this;
  }

   /**
   * Get venueFills
   * @return venueFills
  **/
  @ApiModelProperty(value = "")
  public List<CoinbaseBrokerageProxyTradingApiTradeReportVenueFill> getVenueFills() {
    return venueFills;
  }

  public void setVenueFills(List<CoinbaseBrokerageProxyTradingApiTradeReportVenueFill> venueFills) {
    this.venueFills = venueFills;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoinbaseBrokerageProxyTradingApiGetTradeReportVenueFillsResponse coinbaseBrokerageProxyTradingApiGetTradeReportVenueFillsResponse = (CoinbaseBrokerageProxyTradingApiGetTradeReportVenueFillsResponse) o;
    return Objects.equals(this.venueFills, coinbaseBrokerageProxyTradingApiGetTradeReportVenueFillsResponse.venueFills);
  }

  @Override
  public int hashCode() {
    return Objects.hash(venueFills);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoinbaseBrokerageProxyTradingApiGetTradeReportVenueFillsResponse {\n");
    
    sb.append("    venueFills: ").append(toIndentedString(venueFills)).append("\n");
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

