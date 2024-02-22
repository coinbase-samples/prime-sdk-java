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
import java.util.ArrayList;
import java.util.List;

/**
 * CoinbaseEngPrimeApiApiFavoriteProductsUpdate
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-22T12:46:00.828-08:00")
public class CoinbaseEngPrimeApiApiFavoriteProductsUpdate {
  @SerializedName("favorite_products")
  private List<String> favoriteProducts = new ArrayList<String>();

  public CoinbaseEngPrimeApiApiFavoriteProductsUpdate favoriteProducts(List<String> favoriteProducts) {
    this.favoriteProducts = favoriteProducts;
    return this;
  }

  public CoinbaseEngPrimeApiApiFavoriteProductsUpdate addFavoriteProductsItem(String favoriteProductsItem) {
    this.favoriteProducts.add(favoriteProductsItem);
    return this;
  }

   /**
   * List of productIds that the user has favorited
   * @return favoriteProducts
  **/
  @ApiModelProperty(required = true, value = "List of productIds that the user has favorited")
  public List<String> getFavoriteProducts() {
    return favoriteProducts;
  }

  public void setFavoriteProducts(List<String> favoriteProducts) {
    this.favoriteProducts = favoriteProducts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoinbaseEngPrimeApiApiFavoriteProductsUpdate coinbaseEngPrimeApiApiFavoriteProductsUpdate = (CoinbaseEngPrimeApiApiFavoriteProductsUpdate) o;
    return Objects.equals(this.favoriteProducts, coinbaseEngPrimeApiApiFavoriteProductsUpdate.favoriteProducts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(favoriteProducts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoinbaseEngPrimeApiApiFavoriteProductsUpdate {\n");
    
    sb.append("    favoriteProducts: ").append(toIndentedString(favoriteProducts)).append("\n");
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

