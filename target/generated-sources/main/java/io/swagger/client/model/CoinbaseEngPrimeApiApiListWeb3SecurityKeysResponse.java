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
import io.swagger.client.model.CoinbaseEngPrimeApiApiWeb3SecurityKey;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CoinbaseEngPrimeApiApiListWeb3SecurityKeysResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-22T12:46:00.828-08:00")
public class CoinbaseEngPrimeApiApiListWeb3SecurityKeysResponse {
  @SerializedName("web3_security_keys")
  private List<CoinbaseEngPrimeApiApiWeb3SecurityKey> web3SecurityKeys = null;

  public CoinbaseEngPrimeApiApiListWeb3SecurityKeysResponse web3SecurityKeys(List<CoinbaseEngPrimeApiApiWeb3SecurityKey> web3SecurityKeys) {
    this.web3SecurityKeys = web3SecurityKeys;
    return this;
  }

  public CoinbaseEngPrimeApiApiListWeb3SecurityKeysResponse addWeb3SecurityKeysItem(CoinbaseEngPrimeApiApiWeb3SecurityKey web3SecurityKeysItem) {
    if (this.web3SecurityKeys == null) {
      this.web3SecurityKeys = new ArrayList<CoinbaseEngPrimeApiApiWeb3SecurityKey>();
    }
    this.web3SecurityKeys.add(web3SecurityKeysItem);
    return this;
  }

   /**
   * Get web3SecurityKeys
   * @return web3SecurityKeys
  **/
  @ApiModelProperty(value = "")
  public List<CoinbaseEngPrimeApiApiWeb3SecurityKey> getWeb3SecurityKeys() {
    return web3SecurityKeys;
  }

  public void setWeb3SecurityKeys(List<CoinbaseEngPrimeApiApiWeb3SecurityKey> web3SecurityKeys) {
    this.web3SecurityKeys = web3SecurityKeys;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoinbaseEngPrimeApiApiListWeb3SecurityKeysResponse coinbaseEngPrimeApiApiListWeb3SecurityKeysResponse = (CoinbaseEngPrimeApiApiListWeb3SecurityKeysResponse) o;
    return Objects.equals(this.web3SecurityKeys, coinbaseEngPrimeApiApiListWeb3SecurityKeysResponse.web3SecurityKeys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(web3SecurityKeys);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoinbaseEngPrimeApiApiListWeb3SecurityKeysResponse {\n");
    
    sb.append("    web3SecurityKeys: ").append(toIndentedString(web3SecurityKeys)).append("\n");
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

