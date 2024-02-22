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
import io.swagger.client.model.CoinbaseEngPrimeApiApiAuthenticationExtensionsClientOutputs;
import java.io.IOException;

/**
 * CoinbaseEngPrimeApiApiPostFidoChallengeRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-22T12:46:00.828-08:00")
public class CoinbaseEngPrimeApiApiPostFidoChallengeRequest {
  @SerializedName("user_id")
  private String userId = null;

  @SerializedName("id")
  private byte[] id = null;

  @SerializedName("client_data_json")
  private byte[] clientDataJson = null;

  @SerializedName("authenticator_data")
  private byte[] authenticatorData = null;

  @SerializedName("signature")
  private byte[] signature = null;

  @SerializedName("user_handle")
  private byte[] userHandle = null;

  @SerializedName("extension_results")
  private CoinbaseEngPrimeApiApiAuthenticationExtensionsClientOutputs extensionResults = null;

  public CoinbaseEngPrimeApiApiPostFidoChallengeRequest userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * User UUID.
   * @return userId
  **/
  @ApiModelProperty(value = "User UUID.")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public CoinbaseEngPrimeApiApiPostFidoChallengeRequest id(byte[] id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public byte[] getId() {
    return id;
  }

  public void setId(byte[] id) {
    this.id = id;
  }

  public CoinbaseEngPrimeApiApiPostFidoChallengeRequest clientDataJson(byte[] clientDataJson) {
    this.clientDataJson = clientDataJson;
    return this;
  }

   /**
   * Get clientDataJson
   * @return clientDataJson
  **/
  @ApiModelProperty(value = "")
  public byte[] getClientDataJson() {
    return clientDataJson;
  }

  public void setClientDataJson(byte[] clientDataJson) {
    this.clientDataJson = clientDataJson;
  }

  public CoinbaseEngPrimeApiApiPostFidoChallengeRequest authenticatorData(byte[] authenticatorData) {
    this.authenticatorData = authenticatorData;
    return this;
  }

   /**
   * Get authenticatorData
   * @return authenticatorData
  **/
  @ApiModelProperty(value = "")
  public byte[] getAuthenticatorData() {
    return authenticatorData;
  }

  public void setAuthenticatorData(byte[] authenticatorData) {
    this.authenticatorData = authenticatorData;
  }

  public CoinbaseEngPrimeApiApiPostFidoChallengeRequest signature(byte[] signature) {
    this.signature = signature;
    return this;
  }

   /**
   * Get signature
   * @return signature
  **/
  @ApiModelProperty(value = "")
  public byte[] getSignature() {
    return signature;
  }

  public void setSignature(byte[] signature) {
    this.signature = signature;
  }

  public CoinbaseEngPrimeApiApiPostFidoChallengeRequest userHandle(byte[] userHandle) {
    this.userHandle = userHandle;
    return this;
  }

   /**
   * Get userHandle
   * @return userHandle
  **/
  @ApiModelProperty(value = "")
  public byte[] getUserHandle() {
    return userHandle;
  }

  public void setUserHandle(byte[] userHandle) {
    this.userHandle = userHandle;
  }

  public CoinbaseEngPrimeApiApiPostFidoChallengeRequest extensionResults(CoinbaseEngPrimeApiApiAuthenticationExtensionsClientOutputs extensionResults) {
    this.extensionResults = extensionResults;
    return this;
  }

   /**
   * Get extensionResults
   * @return extensionResults
  **/
  @ApiModelProperty(value = "")
  public CoinbaseEngPrimeApiApiAuthenticationExtensionsClientOutputs getExtensionResults() {
    return extensionResults;
  }

  public void setExtensionResults(CoinbaseEngPrimeApiApiAuthenticationExtensionsClientOutputs extensionResults) {
    this.extensionResults = extensionResults;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoinbaseEngPrimeApiApiPostFidoChallengeRequest coinbaseEngPrimeApiApiPostFidoChallengeRequest = (CoinbaseEngPrimeApiApiPostFidoChallengeRequest) o;
    return Objects.equals(this.userId, coinbaseEngPrimeApiApiPostFidoChallengeRequest.userId) &&
        Objects.equals(this.id, coinbaseEngPrimeApiApiPostFidoChallengeRequest.id) &&
        Objects.equals(this.clientDataJson, coinbaseEngPrimeApiApiPostFidoChallengeRequest.clientDataJson) &&
        Objects.equals(this.authenticatorData, coinbaseEngPrimeApiApiPostFidoChallengeRequest.authenticatorData) &&
        Objects.equals(this.signature, coinbaseEngPrimeApiApiPostFidoChallengeRequest.signature) &&
        Objects.equals(this.userHandle, coinbaseEngPrimeApiApiPostFidoChallengeRequest.userHandle) &&
        Objects.equals(this.extensionResults, coinbaseEngPrimeApiApiPostFidoChallengeRequest.extensionResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, id, clientDataJson, authenticatorData, signature, userHandle, extensionResults);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoinbaseEngPrimeApiApiPostFidoChallengeRequest {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    clientDataJson: ").append(toIndentedString(clientDataJson)).append("\n");
    sb.append("    authenticatorData: ").append(toIndentedString(authenticatorData)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    userHandle: ").append(toIndentedString(userHandle)).append("\n");
    sb.append("    extensionResults: ").append(toIndentedString(extensionResults)).append("\n");
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

