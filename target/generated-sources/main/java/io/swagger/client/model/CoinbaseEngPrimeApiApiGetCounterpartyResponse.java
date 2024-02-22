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
import io.swagger.client.model.CoinbaseEngPrimeApiApiCounterparty;
import java.io.IOException;

/**
 * CoinbaseEngPrimeApiApiGetCounterpartyResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-22T12:46:00.828-08:00")
public class CoinbaseEngPrimeApiApiGetCounterpartyResponse {
  @SerializedName("counterparty")
  private CoinbaseEngPrimeApiApiCounterparty counterparty = null;

  public CoinbaseEngPrimeApiApiGetCounterpartyResponse counterparty(CoinbaseEngPrimeApiApiCounterparty counterparty) {
    this.counterparty = counterparty;
    return this;
  }

   /**
   * counterparty
   * @return counterparty
  **/
  @ApiModelProperty(required = true, value = "counterparty")
  public CoinbaseEngPrimeApiApiCounterparty getCounterparty() {
    return counterparty;
  }

  public void setCounterparty(CoinbaseEngPrimeApiApiCounterparty counterparty) {
    this.counterparty = counterparty;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoinbaseEngPrimeApiApiGetCounterpartyResponse coinbaseEngPrimeApiApiGetCounterpartyResponse = (CoinbaseEngPrimeApiApiGetCounterpartyResponse) o;
    return Objects.equals(this.counterparty, coinbaseEngPrimeApiApiGetCounterpartyResponse.counterparty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(counterparty);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoinbaseEngPrimeApiApiGetCounterpartyResponse {\n");
    
    sb.append("    counterparty: ").append(toIndentedString(counterparty)).append("\n");
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

