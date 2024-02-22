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
import io.swagger.client.model.CoinbaseEngPrimeApiApiToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CoinbaseEngPrimeApiApiYieldFarm
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-22T12:46:00.828-08:00")
public class CoinbaseEngPrimeApiApiYieldFarm {
  @SerializedName("farming")
  private List<CoinbaseEngPrimeApiApiToken> farming = null;

  @SerializedName("leveraged_farming")
  private List<CoinbaseEngPrimeApiApiToken> leveragedFarming = null;

  @SerializedName("yield")
  private List<CoinbaseEngPrimeApiApiToken> yield = null;

  public CoinbaseEngPrimeApiApiYieldFarm farming(List<CoinbaseEngPrimeApiApiToken> farming) {
    this.farming = farming;
    return this;
  }

  public CoinbaseEngPrimeApiApiYieldFarm addFarmingItem(CoinbaseEngPrimeApiApiToken farmingItem) {
    if (this.farming == null) {
      this.farming = new ArrayList<CoinbaseEngPrimeApiApiToken>();
    }
    this.farming.add(farmingItem);
    return this;
  }

   /**
   * Get farming
   * @return farming
  **/
  @ApiModelProperty(value = "")
  public List<CoinbaseEngPrimeApiApiToken> getFarming() {
    return farming;
  }

  public void setFarming(List<CoinbaseEngPrimeApiApiToken> farming) {
    this.farming = farming;
  }

  public CoinbaseEngPrimeApiApiYieldFarm leveragedFarming(List<CoinbaseEngPrimeApiApiToken> leveragedFarming) {
    this.leveragedFarming = leveragedFarming;
    return this;
  }

  public CoinbaseEngPrimeApiApiYieldFarm addLeveragedFarmingItem(CoinbaseEngPrimeApiApiToken leveragedFarmingItem) {
    if (this.leveragedFarming == null) {
      this.leveragedFarming = new ArrayList<CoinbaseEngPrimeApiApiToken>();
    }
    this.leveragedFarming.add(leveragedFarmingItem);
    return this;
  }

   /**
   * Get leveragedFarming
   * @return leveragedFarming
  **/
  @ApiModelProperty(value = "")
  public List<CoinbaseEngPrimeApiApiToken> getLeveragedFarming() {
    return leveragedFarming;
  }

  public void setLeveragedFarming(List<CoinbaseEngPrimeApiApiToken> leveragedFarming) {
    this.leveragedFarming = leveragedFarming;
  }

  public CoinbaseEngPrimeApiApiYieldFarm yield(List<CoinbaseEngPrimeApiApiToken> yield) {
    this.yield = yield;
    return this;
  }

  public CoinbaseEngPrimeApiApiYieldFarm addYieldItem(CoinbaseEngPrimeApiApiToken yieldItem) {
    if (this.yield == null) {
      this.yield = new ArrayList<CoinbaseEngPrimeApiApiToken>();
    }
    this.yield.add(yieldItem);
    return this;
  }

   /**
   * Get yield
   * @return yield
  **/
  @ApiModelProperty(value = "")
  public List<CoinbaseEngPrimeApiApiToken> getYield() {
    return yield;
  }

  public void setYield(List<CoinbaseEngPrimeApiApiToken> yield) {
    this.yield = yield;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoinbaseEngPrimeApiApiYieldFarm coinbaseEngPrimeApiApiYieldFarm = (CoinbaseEngPrimeApiApiYieldFarm) o;
    return Objects.equals(this.farming, coinbaseEngPrimeApiApiYieldFarm.farming) &&
        Objects.equals(this.leveragedFarming, coinbaseEngPrimeApiApiYieldFarm.leveragedFarming) &&
        Objects.equals(this.yield, coinbaseEngPrimeApiApiYieldFarm.yield);
  }

  @Override
  public int hashCode() {
    return Objects.hash(farming, leveragedFarming, yield);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoinbaseEngPrimeApiApiYieldFarm {\n");
    
    sb.append("    farming: ").append(toIndentedString(farming)).append("\n");
    sb.append("    leveragedFarming: ").append(toIndentedString(leveragedFarming)).append("\n");
    sb.append("    yield: ").append(toIndentedString(yield)).append("\n");
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

