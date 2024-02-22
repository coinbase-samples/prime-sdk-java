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
import io.swagger.client.model.CoinbaseBrokerageProxyTradingApiGetDepthStreamBody;
import io.swagger.client.model.GrpcGatewayRuntimeStreamError;
import java.io.IOException;

/**
 * StreamResultOfCoinbaseBrokerageProxyTradingApiGetDepthStreamResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-22T12:46:00.828-08:00")
public class StreamResultOfCoinbaseBrokerageProxyTradingApiGetDepthStreamResponse {
  @SerializedName("result")
  private CoinbaseBrokerageProxyTradingApiGetDepthStreamBody result = null;

  @SerializedName("error")
  private GrpcGatewayRuntimeStreamError error = null;

  public StreamResultOfCoinbaseBrokerageProxyTradingApiGetDepthStreamResponse result(CoinbaseBrokerageProxyTradingApiGetDepthStreamBody result) {
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @ApiModelProperty(value = "")
  public CoinbaseBrokerageProxyTradingApiGetDepthStreamBody getResult() {
    return result;
  }

  public void setResult(CoinbaseBrokerageProxyTradingApiGetDepthStreamBody result) {
    this.result = result;
  }

  public StreamResultOfCoinbaseBrokerageProxyTradingApiGetDepthStreamResponse error(GrpcGatewayRuntimeStreamError error) {
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @ApiModelProperty(value = "")
  public GrpcGatewayRuntimeStreamError getError() {
    return error;
  }

  public void setError(GrpcGatewayRuntimeStreamError error) {
    this.error = error;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StreamResultOfCoinbaseBrokerageProxyTradingApiGetDepthStreamResponse streamResultOfCoinbaseBrokerageProxyTradingApiGetDepthStreamResponse = (StreamResultOfCoinbaseBrokerageProxyTradingApiGetDepthStreamResponse) o;
    return Objects.equals(this.result, streamResultOfCoinbaseBrokerageProxyTradingApiGetDepthStreamResponse.result) &&
        Objects.equals(this.error, streamResultOfCoinbaseBrokerageProxyTradingApiGetDepthStreamResponse.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, error);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StreamResultOfCoinbaseBrokerageProxyTradingApiGetDepthStreamResponse {\n");
    
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

