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
import java.io.IOException;

/**
 * CoinbasePaymentsCommonPaymentMethodsLiquidityPool
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-22T12:46:00.828-08:00")
public class CoinbasePaymentsCommonPaymentMethodsLiquidityPool {
  @SerializedName("network")
  private String network = null;

  @SerializedName("pool")
  private String pool = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("account_id")
  private String accountId = null;

  @SerializedName("from_address")
  private String fromAddress = null;

  public CoinbasePaymentsCommonPaymentMethodsLiquidityPool network(String network) {
    this.network = network;
    return this;
  }

   /**
   * Get network
   * @return network
  **/
  @ApiModelProperty(value = "")
  public String getNetwork() {
    return network;
  }

  public void setNetwork(String network) {
    this.network = network;
  }

  public CoinbasePaymentsCommonPaymentMethodsLiquidityPool pool(String pool) {
    this.pool = pool;
    return this;
  }

   /**
   * Get pool
   * @return pool
  **/
  @ApiModelProperty(value = "")
  public String getPool() {
    return pool;
  }

  public void setPool(String pool) {
    this.pool = pool;
  }

  public CoinbasePaymentsCommonPaymentMethodsLiquidityPool currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @ApiModelProperty(value = "")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public CoinbasePaymentsCommonPaymentMethodsLiquidityPool accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @ApiModelProperty(value = "")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public CoinbasePaymentsCommonPaymentMethodsLiquidityPool fromAddress(String fromAddress) {
    this.fromAddress = fromAddress;
    return this;
  }

   /**
   * Get fromAddress
   * @return fromAddress
  **/
  @ApiModelProperty(value = "")
  public String getFromAddress() {
    return fromAddress;
  }

  public void setFromAddress(String fromAddress) {
    this.fromAddress = fromAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoinbasePaymentsCommonPaymentMethodsLiquidityPool coinbasePaymentsCommonPaymentMethodsLiquidityPool = (CoinbasePaymentsCommonPaymentMethodsLiquidityPool) o;
    return Objects.equals(this.network, coinbasePaymentsCommonPaymentMethodsLiquidityPool.network) &&
        Objects.equals(this.pool, coinbasePaymentsCommonPaymentMethodsLiquidityPool.pool) &&
        Objects.equals(this.currency, coinbasePaymentsCommonPaymentMethodsLiquidityPool.currency) &&
        Objects.equals(this.accountId, coinbasePaymentsCommonPaymentMethodsLiquidityPool.accountId) &&
        Objects.equals(this.fromAddress, coinbasePaymentsCommonPaymentMethodsLiquidityPool.fromAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(network, pool, currency, accountId, fromAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoinbasePaymentsCommonPaymentMethodsLiquidityPool {\n");
    
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    pool: ").append(toIndentedString(pool)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    fromAddress: ").append(toIndentedString(fromAddress)).append("\n");
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

