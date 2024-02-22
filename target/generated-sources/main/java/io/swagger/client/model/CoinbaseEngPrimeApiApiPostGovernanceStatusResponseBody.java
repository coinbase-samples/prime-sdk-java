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
import io.swagger.client.model.CoinbaseCustodyApiSmartContract;
import io.swagger.client.model.CoinbaseCustodyApiSmartContractRelease;
import java.io.IOException;

/**
 * CoinbaseEngPrimeApiApiPostGovernanceStatusResponseBody
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-22T12:46:00.828-08:00")
public class CoinbaseEngPrimeApiApiPostGovernanceStatusResponseBody {
  @SerializedName("contract")
  private CoinbaseCustodyApiSmartContract contract = null;

  @SerializedName("release")
  private CoinbaseCustodyApiSmartContractRelease release = null;

  public CoinbaseEngPrimeApiApiPostGovernanceStatusResponseBody contract(CoinbaseCustodyApiSmartContract contract) {
    this.contract = contract;
    return this;
  }

   /**
   * Get contract
   * @return contract
  **/
  @ApiModelProperty(value = "")
  public CoinbaseCustodyApiSmartContract getContract() {
    return contract;
  }

  public void setContract(CoinbaseCustodyApiSmartContract contract) {
    this.contract = contract;
  }

  public CoinbaseEngPrimeApiApiPostGovernanceStatusResponseBody release(CoinbaseCustodyApiSmartContractRelease release) {
    this.release = release;
    return this;
  }

   /**
   * Get release
   * @return release
  **/
  @ApiModelProperty(value = "")
  public CoinbaseCustodyApiSmartContractRelease getRelease() {
    return release;
  }

  public void setRelease(CoinbaseCustodyApiSmartContractRelease release) {
    this.release = release;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoinbaseEngPrimeApiApiPostGovernanceStatusResponseBody coinbaseEngPrimeApiApiPostGovernanceStatusResponseBody = (CoinbaseEngPrimeApiApiPostGovernanceStatusResponseBody) o;
    return Objects.equals(this.contract, coinbaseEngPrimeApiApiPostGovernanceStatusResponseBody.contract) &&
        Objects.equals(this.release, coinbaseEngPrimeApiApiPostGovernanceStatusResponseBody.release);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contract, release);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoinbaseEngPrimeApiApiPostGovernanceStatusResponseBody {\n");
    
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
    sb.append("    release: ").append(toIndentedString(release)).append("\n");
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

