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
import io.swagger.client.model.CoinbaseEngPrimeApiApiGetPortfolioActivityResponse;
import io.swagger.client.model.CoinbaseEngPrimeApiApiHeartbeat;
import io.swagger.client.model.CoinbaseEngPrimeApiApiJsonPatch;
import java.io.IOException;

/**
 * CoinbaseEngPrimeApiApiGetPortfolioActivityStreamResponseBody
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-22T12:46:00.828-08:00")
public class CoinbaseEngPrimeApiApiGetPortfolioActivityStreamResponseBody {
  @SerializedName("snapshot")
  private CoinbaseEngPrimeApiApiGetPortfolioActivityResponse snapshot = null;

  @SerializedName("patch")
  private CoinbaseEngPrimeApiApiJsonPatch patch = null;

  @SerializedName("heartbeat")
  private CoinbaseEngPrimeApiApiHeartbeat heartbeat = null;

  public CoinbaseEngPrimeApiApiGetPortfolioActivityStreamResponseBody snapshot(CoinbaseEngPrimeApiApiGetPortfolioActivityResponse snapshot) {
    this.snapshot = snapshot;
    return this;
  }

   /**
   * Get snapshot
   * @return snapshot
  **/
  @ApiModelProperty(value = "")
  public CoinbaseEngPrimeApiApiGetPortfolioActivityResponse getSnapshot() {
    return snapshot;
  }

  public void setSnapshot(CoinbaseEngPrimeApiApiGetPortfolioActivityResponse snapshot) {
    this.snapshot = snapshot;
  }

  public CoinbaseEngPrimeApiApiGetPortfolioActivityStreamResponseBody patch(CoinbaseEngPrimeApiApiJsonPatch patch) {
    this.patch = patch;
    return this;
  }

   /**
   * Get patch
   * @return patch
  **/
  @ApiModelProperty(value = "")
  public CoinbaseEngPrimeApiApiJsonPatch getPatch() {
    return patch;
  }

  public void setPatch(CoinbaseEngPrimeApiApiJsonPatch patch) {
    this.patch = patch;
  }

  public CoinbaseEngPrimeApiApiGetPortfolioActivityStreamResponseBody heartbeat(CoinbaseEngPrimeApiApiHeartbeat heartbeat) {
    this.heartbeat = heartbeat;
    return this;
  }

   /**
   * Get heartbeat
   * @return heartbeat
  **/
  @ApiModelProperty(value = "")
  public CoinbaseEngPrimeApiApiHeartbeat getHeartbeat() {
    return heartbeat;
  }

  public void setHeartbeat(CoinbaseEngPrimeApiApiHeartbeat heartbeat) {
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
    CoinbaseEngPrimeApiApiGetPortfolioActivityStreamResponseBody coinbaseEngPrimeApiApiGetPortfolioActivityStreamResponseBody = (CoinbaseEngPrimeApiApiGetPortfolioActivityStreamResponseBody) o;
    return Objects.equals(this.snapshot, coinbaseEngPrimeApiApiGetPortfolioActivityStreamResponseBody.snapshot) &&
        Objects.equals(this.patch, coinbaseEngPrimeApiApiGetPortfolioActivityStreamResponseBody.patch) &&
        Objects.equals(this.heartbeat, coinbaseEngPrimeApiApiGetPortfolioActivityStreamResponseBody.heartbeat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(snapshot, patch, heartbeat);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoinbaseEngPrimeApiApiGetPortfolioActivityStreamResponseBody {\n");
    
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

