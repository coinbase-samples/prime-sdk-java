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
import io.swagger.client.model.ScannerAttribute;
import io.swagger.client.model.ScannerCurrencyType;
import io.swagger.client.model.ScannerImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ScannerCurrency
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-22T12:46:00.828-08:00")
public class ScannerCurrency {
  @SerializedName("currency_type")
  private ScannerCurrencyType currencyType = null;

  @SerializedName("symbol")
  private String symbol = null;

  @SerializedName("contract_address")
  private String contractAddress = null;

  @SerializedName("decimals")
  private Integer decimals = null;

  @SerializedName("attributes")
  private List<ScannerAttribute> attributes = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("images")
  private List<ScannerImage> images = null;

  public ScannerCurrency currencyType(ScannerCurrencyType currencyType) {
    this.currencyType = currencyType;
    return this;
  }

   /**
   * Get currencyType
   * @return currencyType
  **/
  @ApiModelProperty(value = "")
  public ScannerCurrencyType getCurrencyType() {
    return currencyType;
  }

  public void setCurrencyType(ScannerCurrencyType currencyType) {
    this.currencyType = currencyType;
  }

  public ScannerCurrency symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

   /**
   * Get symbol
   * @return symbol
  **/
  @ApiModelProperty(value = "")
  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public ScannerCurrency contractAddress(String contractAddress) {
    this.contractAddress = contractAddress;
    return this;
  }

   /**
   * Get contractAddress
   * @return contractAddress
  **/
  @ApiModelProperty(value = "")
  public String getContractAddress() {
    return contractAddress;
  }

  public void setContractAddress(String contractAddress) {
    this.contractAddress = contractAddress;
  }

  public ScannerCurrency decimals(Integer decimals) {
    this.decimals = decimals;
    return this;
  }

   /**
   * Get decimals
   * @return decimals
  **/
  @ApiModelProperty(value = "")
  public Integer getDecimals() {
    return decimals;
  }

  public void setDecimals(Integer decimals) {
    this.decimals = decimals;
  }

  public ScannerCurrency attributes(List<ScannerAttribute> attributes) {
    this.attributes = attributes;
    return this;
  }

  public ScannerCurrency addAttributesItem(ScannerAttribute attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<ScannerAttribute>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @ApiModelProperty(value = "")
  public List<ScannerAttribute> getAttributes() {
    return attributes;
  }

  public void setAttributes(List<ScannerAttribute> attributes) {
    this.attributes = attributes;
  }

  public ScannerCurrency name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ScannerCurrency images(List<ScannerImage> images) {
    this.images = images;
    return this;
  }

  public ScannerCurrency addImagesItem(ScannerImage imagesItem) {
    if (this.images == null) {
      this.images = new ArrayList<ScannerImage>();
    }
    this.images.add(imagesItem);
    return this;
  }

   /**
   * Get images
   * @return images
  **/
  @ApiModelProperty(value = "")
  public List<ScannerImage> getImages() {
    return images;
  }

  public void setImages(List<ScannerImage> images) {
    this.images = images;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScannerCurrency scannerCurrency = (ScannerCurrency) o;
    return Objects.equals(this.currencyType, scannerCurrency.currencyType) &&
        Objects.equals(this.symbol, scannerCurrency.symbol) &&
        Objects.equals(this.contractAddress, scannerCurrency.contractAddress) &&
        Objects.equals(this.decimals, scannerCurrency.decimals) &&
        Objects.equals(this.attributes, scannerCurrency.attributes) &&
        Objects.equals(this.name, scannerCurrency.name) &&
        Objects.equals(this.images, scannerCurrency.images);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyType, symbol, contractAddress, decimals, attributes, name, images);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScannerCurrency {\n");
    
    sb.append("    currencyType: ").append(toIndentedString(currencyType)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    contractAddress: ").append(toIndentedString(contractAddress)).append("\n");
    sb.append("    decimals: ").append(toIndentedString(decimals)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
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

