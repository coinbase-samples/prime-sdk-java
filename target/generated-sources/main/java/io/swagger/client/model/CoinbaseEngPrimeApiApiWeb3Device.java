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
import io.swagger.client.model.CoinbaseEngPrimeApiApiDeviceOsName;
import io.swagger.client.model.CoinbaseEngPrimeApiApiDeviceState;
import java.io.IOException;

/**
 * CoinbaseEngPrimeApiApiWeb3Device
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-22T12:46:00.828-08:00")
public class CoinbaseEngPrimeApiApiWeb3Device {
  @SerializedName("device_id")
  private String deviceId = null;

  @SerializedName("user_id")
  private String userId = null;

  @SerializedName("complete")
  private Boolean complete = null;

  @SerializedName("state")
  private CoinbaseEngPrimeApiApiDeviceState state = null;

  @SerializedName("idfv")
  private String idfv = null;

  @SerializedName("model")
  private String model = null;

  @SerializedName("make")
  private String make = null;

  @SerializedName("os_name")
  private CoinbaseEngPrimeApiApiDeviceOsName osName = null;

  @SerializedName("os_version")
  private String osVersion = null;

  @SerializedName("enrolled_at")
  private String enrolledAt = null;

  @SerializedName("last_active_at")
  private String lastActiveAt = null;

  public CoinbaseEngPrimeApiApiWeb3Device deviceId(String deviceId) {
    this.deviceId = deviceId;
    return this;
  }

   /**
   * Get deviceId
   * @return deviceId
  **/
  @ApiModelProperty(value = "")
  public String getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }

  public CoinbaseEngPrimeApiApiWeb3Device userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(value = "")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public CoinbaseEngPrimeApiApiWeb3Device complete(Boolean complete) {
    this.complete = complete;
    return this;
  }

   /**
   * Get complete
   * @return complete
  **/
  @ApiModelProperty(value = "")
  public Boolean isComplete() {
    return complete;
  }

  public void setComplete(Boolean complete) {
    this.complete = complete;
  }

  public CoinbaseEngPrimeApiApiWeb3Device state(CoinbaseEngPrimeApiApiDeviceState state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")
  public CoinbaseEngPrimeApiApiDeviceState getState() {
    return state;
  }

  public void setState(CoinbaseEngPrimeApiApiDeviceState state) {
    this.state = state;
  }

  public CoinbaseEngPrimeApiApiWeb3Device idfv(String idfv) {
    this.idfv = idfv;
    return this;
  }

   /**
   * Get idfv
   * @return idfv
  **/
  @ApiModelProperty(value = "")
  public String getIdfv() {
    return idfv;
  }

  public void setIdfv(String idfv) {
    this.idfv = idfv;
  }

  public CoinbaseEngPrimeApiApiWeb3Device model(String model) {
    this.model = model;
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  @ApiModelProperty(value = "")
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public CoinbaseEngPrimeApiApiWeb3Device make(String make) {
    this.make = make;
    return this;
  }

   /**
   * Get make
   * @return make
  **/
  @ApiModelProperty(value = "")
  public String getMake() {
    return make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public CoinbaseEngPrimeApiApiWeb3Device osName(CoinbaseEngPrimeApiApiDeviceOsName osName) {
    this.osName = osName;
    return this;
  }

   /**
   * Get osName
   * @return osName
  **/
  @ApiModelProperty(value = "")
  public CoinbaseEngPrimeApiApiDeviceOsName getOsName() {
    return osName;
  }

  public void setOsName(CoinbaseEngPrimeApiApiDeviceOsName osName) {
    this.osName = osName;
  }

  public CoinbaseEngPrimeApiApiWeb3Device osVersion(String osVersion) {
    this.osVersion = osVersion;
    return this;
  }

   /**
   * Get osVersion
   * @return osVersion
  **/
  @ApiModelProperty(value = "")
  public String getOsVersion() {
    return osVersion;
  }

  public void setOsVersion(String osVersion) {
    this.osVersion = osVersion;
  }

  public CoinbaseEngPrimeApiApiWeb3Device enrolledAt(String enrolledAt) {
    this.enrolledAt = enrolledAt;
    return this;
  }

   /**
   * Get enrolledAt
   * @return enrolledAt
  **/
  @ApiModelProperty(value = "")
  public String getEnrolledAt() {
    return enrolledAt;
  }

  public void setEnrolledAt(String enrolledAt) {
    this.enrolledAt = enrolledAt;
  }

  public CoinbaseEngPrimeApiApiWeb3Device lastActiveAt(String lastActiveAt) {
    this.lastActiveAt = lastActiveAt;
    return this;
  }

   /**
   * Get lastActiveAt
   * @return lastActiveAt
  **/
  @ApiModelProperty(value = "")
  public String getLastActiveAt() {
    return lastActiveAt;
  }

  public void setLastActiveAt(String lastActiveAt) {
    this.lastActiveAt = lastActiveAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoinbaseEngPrimeApiApiWeb3Device coinbaseEngPrimeApiApiWeb3Device = (CoinbaseEngPrimeApiApiWeb3Device) o;
    return Objects.equals(this.deviceId, coinbaseEngPrimeApiApiWeb3Device.deviceId) &&
        Objects.equals(this.userId, coinbaseEngPrimeApiApiWeb3Device.userId) &&
        Objects.equals(this.complete, coinbaseEngPrimeApiApiWeb3Device.complete) &&
        Objects.equals(this.state, coinbaseEngPrimeApiApiWeb3Device.state) &&
        Objects.equals(this.idfv, coinbaseEngPrimeApiApiWeb3Device.idfv) &&
        Objects.equals(this.model, coinbaseEngPrimeApiApiWeb3Device.model) &&
        Objects.equals(this.make, coinbaseEngPrimeApiApiWeb3Device.make) &&
        Objects.equals(this.osName, coinbaseEngPrimeApiApiWeb3Device.osName) &&
        Objects.equals(this.osVersion, coinbaseEngPrimeApiApiWeb3Device.osVersion) &&
        Objects.equals(this.enrolledAt, coinbaseEngPrimeApiApiWeb3Device.enrolledAt) &&
        Objects.equals(this.lastActiveAt, coinbaseEngPrimeApiApiWeb3Device.lastActiveAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceId, userId, complete, state, idfv, model, make, osName, osVersion, enrolledAt, lastActiveAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoinbaseEngPrimeApiApiWeb3Device {\n");
    
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    complete: ").append(toIndentedString(complete)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    idfv: ").append(toIndentedString(idfv)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    make: ").append(toIndentedString(make)).append("\n");
    sb.append("    osName: ").append(toIndentedString(osName)).append("\n");
    sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
    sb.append("    enrolledAt: ").append(toIndentedString(enrolledAt)).append("\n");
    sb.append("    lastActiveAt: ").append(toIndentedString(lastActiveAt)).append("\n");
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

