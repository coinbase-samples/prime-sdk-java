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
import io.swagger.client.model.CoinbaseTwsActionVerb;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * CoinbaseEngPrimeApiApiCreateTransactionV2Request
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-22T12:46:00.828-08:00")
public class CoinbaseEngPrimeApiApiCreateTransactionV2Request {
  @SerializedName("idempotency_key")
  private String idempotencyKey = null;

  @SerializedName("wallet_id")
  private String walletId = null;

  @SerializedName("portfolio_id")
  private String portfolioId = null;

  @SerializedName("action")
  private CoinbaseTwsActionVerb action = null;

  @SerializedName("options")
  private Map<String, String> options = null;

  public CoinbaseEngPrimeApiApiCreateTransactionV2Request idempotencyKey(String idempotencyKey) {
    this.idempotencyKey = idempotencyKey;
    return this;
  }

   /**
   * An idempotent key for the client to pass in
   * @return idempotencyKey
  **/
  @ApiModelProperty(required = true, value = "An idempotent key for the client to pass in")
  public String getIdempotencyKey() {
    return idempotencyKey;
  }

  public void setIdempotencyKey(String idempotencyKey) {
    this.idempotencyKey = idempotencyKey;
  }

  public CoinbaseEngPrimeApiApiCreateTransactionV2Request walletId(String walletId) {
    this.walletId = walletId;
    return this;
  }

   /**
   * The wallet to perform transact action with
   * @return walletId
  **/
  @ApiModelProperty(required = true, value = "The wallet to perform transact action with")
  public String getWalletId() {
    return walletId;
  }

  public void setWalletId(String walletId) {
    this.walletId = walletId;
  }

  public CoinbaseEngPrimeApiApiCreateTransactionV2Request portfolioId(String portfolioId) {
    this.portfolioId = portfolioId;
    return this;
  }

   /**
   * The portfolio to perform transaction action with
   * @return portfolioId
  **/
  @ApiModelProperty(required = true, value = "The portfolio to perform transaction action with")
  public String getPortfolioId() {
    return portfolioId;
  }

  public void setPortfolioId(String portfolioId) {
    this.portfolioId = portfolioId;
  }

  public CoinbaseEngPrimeApiApiCreateTransactionV2Request action(CoinbaseTwsActionVerb action) {
    this.action = action;
    return this;
  }

   /**
   * Transaction action to perform on the wallet
   * @return action
  **/
  @ApiModelProperty(required = true, value = "Transaction action to perform on the wallet")
  public CoinbaseTwsActionVerb getAction() {
    return action;
  }

  public void setAction(CoinbaseTwsActionVerb action) {
    this.action = action;
  }

  public CoinbaseEngPrimeApiApiCreateTransactionV2Request options(Map<String, String> options) {
    this.options = options;
    return this;
  }

  public CoinbaseEngPrimeApiApiCreateTransactionV2Request putOptionsItem(String key, String optionsItem) {
    if (this.options == null) {
      this.options = new HashMap<String, String>();
    }
    this.options.put(key, optionsItem);
    return this;
  }

   /**
   * Extra options for transaction creation
   * @return options
  **/
  @ApiModelProperty(value = "Extra options for transaction creation")
  public Map<String, String> getOptions() {
    return options;
  }

  public void setOptions(Map<String, String> options) {
    this.options = options;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoinbaseEngPrimeApiApiCreateTransactionV2Request coinbaseEngPrimeApiApiCreateTransactionV2Request = (CoinbaseEngPrimeApiApiCreateTransactionV2Request) o;
    return Objects.equals(this.idempotencyKey, coinbaseEngPrimeApiApiCreateTransactionV2Request.idempotencyKey) &&
        Objects.equals(this.walletId, coinbaseEngPrimeApiApiCreateTransactionV2Request.walletId) &&
        Objects.equals(this.portfolioId, coinbaseEngPrimeApiApiCreateTransactionV2Request.portfolioId) &&
        Objects.equals(this.action, coinbaseEngPrimeApiApiCreateTransactionV2Request.action) &&
        Objects.equals(this.options, coinbaseEngPrimeApiApiCreateTransactionV2Request.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idempotencyKey, walletId, portfolioId, action, options);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoinbaseEngPrimeApiApiCreateTransactionV2Request {\n");
    
    sb.append("    idempotencyKey: ").append(toIndentedString(idempotencyKey)).append("\n");
    sb.append("    walletId: ").append(toIndentedString(walletId)).append("\n");
    sb.append("    portfolioId: ").append(toIndentedString(portfolioId)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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

