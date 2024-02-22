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
import io.swagger.client.model.CoinbaseCustodyApiActiveValidator;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CoinbaseEngPrimeApiApiListActiveValidatorsResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-22T12:46:00.828-08:00")
public class CoinbaseEngPrimeApiApiListActiveValidatorsResponse {
  @SerializedName("validators")
  private List<CoinbaseCustodyApiActiveValidator> validators = new ArrayList<CoinbaseCustodyApiActiveValidator>();

  public CoinbaseEngPrimeApiApiListActiveValidatorsResponse validators(List<CoinbaseCustodyApiActiveValidator> validators) {
    this.validators = validators;
    return this;
  }

  public CoinbaseEngPrimeApiApiListActiveValidatorsResponse addValidatorsItem(CoinbaseCustodyApiActiveValidator validatorsItem) {
    this.validators.add(validatorsItem);
    return this;
  }

   /**
   * Get validators
   * @return validators
  **/
  @ApiModelProperty(required = true, value = "")
  public List<CoinbaseCustodyApiActiveValidator> getValidators() {
    return validators;
  }

  public void setValidators(List<CoinbaseCustodyApiActiveValidator> validators) {
    this.validators = validators;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoinbaseEngPrimeApiApiListActiveValidatorsResponse coinbaseEngPrimeApiApiListActiveValidatorsResponse = (CoinbaseEngPrimeApiApiListActiveValidatorsResponse) o;
    return Objects.equals(this.validators, coinbaseEngPrimeApiApiListActiveValidatorsResponse.validators);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validators);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoinbaseEngPrimeApiApiListActiveValidatorsResponse {\n");
    
    sb.append("    validators: ").append(toIndentedString(validators)).append("\n");
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

