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
import io.swagger.client.model.CoinbaseBrokerageProxyCommonHeartbeat;
import io.swagger.client.model.CoinbaseBrokerageProxyCommonJsonPatch;
import io.swagger.client.model.CoinbaseBrokerageProxyTradingApiCandles;
import java.io.IOException;

/**
 * CoinbaseBrokerageProxyTradingApiGetCandlesStreamBody
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-22T12:46:00.828-08:00")
public class CoinbaseBrokerageProxyTradingApiGetCandlesStreamBody {
  @SerializedName("snapshot")
  private CoinbaseBrokerageProxyTradingApiCandles snapshot = null;

  @SerializedName("patch")
  private CoinbaseBrokerageProxyCommonJsonPatch patch = null;

  @SerializedName("heartbeat")
  private CoinbaseBrokerageProxyCommonHeartbeat heartbeat = null;

  public CoinbaseBrokerageProxyTradingApiGetCandlesStreamBody snapshot(CoinbaseBrokerageProxyTradingApiCandles snapshot) {
    this.snapshot = snapshot;
    return this;
  }

   /**
   * Get snapshot
   * @return snapshot
  **/
  @ApiModelProperty(value = "")
  public CoinbaseBrokerageProxyTradingApiCandles getSnapshot() {
    return snapshot;
  }

  public void setSnapshot(CoinbaseBrokerageProxyTradingApiCandles snapshot) {
    this.snapshot = snapshot;
  }

  public CoinbaseBrokerageProxyTradingApiGetCandlesStreamBody patch(CoinbaseBrokerageProxyCommonJsonPatch patch) {
    this.patch = patch;
    return this;
  }

   /**
   * Get patch
   * @return patch
  **/
  @ApiModelProperty(value = "")
  public CoinbaseBrokerageProxyCommonJsonPatch getPatch() {
    return patch;
  }

  public void setPatch(CoinbaseBrokerageProxyCommonJsonPatch patch) {
    this.patch = patch;
  }

  public CoinbaseBrokerageProxyTradingApiGetCandlesStreamBody heartbeat(CoinbaseBrokerageProxyCommonHeartbeat heartbeat) {
    this.heartbeat = heartbeat;
    return this;
  }

   /**
   * Get heartbeat
   * @return heartbeat
  **/
  @ApiModelProperty(value = "")
  public CoinbaseBrokerageProxyCommonHeartbeat getHeartbeat() {
    return heartbeat;
  }

  public void setHeartbeat(CoinbaseBrokerageProxyCommonHeartbeat heartbeat) {
    this.heartbeat = heartbeat;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoinbaseBrokerageProxyTradingApiGetCandlesStreamBody coinbaseBrokerageProxyTradingApiGetCandlesStreamBody = (CoinbaseBrokerageProxyTradingApiGetCandlesStreamBody) o;
    return Objects.equals(this.snapshot, coinbaseBrokerageProxyTradingApiGetCandlesStreamBody.snapshot) &&
        Objects.equals(this.patch, coinbaseBrokerageProxyTradingApiGetCandlesStreamBody.patch) &&
        Objects.equals(this.heartbeat, coinbaseBrokerageProxyTradingApiGetCandlesStreamBody.heartbeat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(snapshot, patch, heartbeat);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoinbaseBrokerageProxyTradingApiGetCandlesStreamBody {\n");
    
    sb.append("    snapshot: ").append(toIndentedString(snapshot)).append("\n");
    sb.append("    patch: ").append(toIndentedString(patch)).append("\n");
    sb.append("    heartbeat: ").append(toIndentedString(heartbeat)).append("\n");
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

