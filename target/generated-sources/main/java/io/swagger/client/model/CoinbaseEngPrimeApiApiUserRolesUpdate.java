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
import io.swagger.client.model.CoinbaseCustodyApiUserChangeCategory;
import io.swagger.client.model.CoinbaseCustodyApiUserChangeRole;
import io.swagger.client.model.CoinbaseCustodyApiUserChangeSecondaryRole;
import io.swagger.client.model.CoinbaseEngPrimeApiApiHierarchy;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CoinbaseEngPrimeApiApiUserRolesUpdate
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-22T12:46:00.828-08:00")
public class CoinbaseEngPrimeApiApiUserRolesUpdate {
  @SerializedName("hierarchy")
  private CoinbaseEngPrimeApiApiHierarchy hierarchy = null;

  @SerializedName("category")
  private CoinbaseCustodyApiUserChangeCategory category = null;

  @SerializedName("roles")
  private List<CoinbaseCustodyApiUserChangeRole> roles = null;

  @SerializedName("secondary_roles")
  private List<CoinbaseCustodyApiUserChangeSecondaryRole> secondaryRoles = null;

  public CoinbaseEngPrimeApiApiUserRolesUpdate hierarchy(CoinbaseEngPrimeApiApiHierarchy hierarchy) {
    this.hierarchy = hierarchy;
    return this;
  }

   /**
   * Get hierarchy
   * @return hierarchy
  **/
  @ApiModelProperty(value = "")
  public CoinbaseEngPrimeApiApiHierarchy getHierarchy() {
    return hierarchy;
  }

  public void setHierarchy(CoinbaseEngPrimeApiApiHierarchy hierarchy) {
    this.hierarchy = hierarchy;
  }

  public CoinbaseEngPrimeApiApiUserRolesUpdate category(CoinbaseCustodyApiUserChangeCategory category) {
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @ApiModelProperty(value = "")
  public CoinbaseCustodyApiUserChangeCategory getCategory() {
    return category;
  }

  public void setCategory(CoinbaseCustodyApiUserChangeCategory category) {
    this.category = category;
  }

  public CoinbaseEngPrimeApiApiUserRolesUpdate roles(List<CoinbaseCustodyApiUserChangeRole> roles) {
    this.roles = roles;
    return this;
  }

  public CoinbaseEngPrimeApiApiUserRolesUpdate addRolesItem(CoinbaseCustodyApiUserChangeRole rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<CoinbaseCustodyApiUserChangeRole>();
    }
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * Get roles
   * @return roles
  **/
  @ApiModelProperty(value = "")
  public List<CoinbaseCustodyApiUserChangeRole> getRoles() {
    return roles;
  }

  public void setRoles(List<CoinbaseCustodyApiUserChangeRole> roles) {
    this.roles = roles;
  }

  public CoinbaseEngPrimeApiApiUserRolesUpdate secondaryRoles(List<CoinbaseCustodyApiUserChangeSecondaryRole> secondaryRoles) {
    this.secondaryRoles = secondaryRoles;
    return this;
  }

  public CoinbaseEngPrimeApiApiUserRolesUpdate addSecondaryRolesItem(CoinbaseCustodyApiUserChangeSecondaryRole secondaryRolesItem) {
    if (this.secondaryRoles == null) {
      this.secondaryRoles = new ArrayList<CoinbaseCustodyApiUserChangeSecondaryRole>();
    }
    this.secondaryRoles.add(secondaryRolesItem);
    return this;
  }

   /**
   * Get secondaryRoles
   * @return secondaryRoles
  **/
  @ApiModelProperty(value = "")
  public List<CoinbaseCustodyApiUserChangeSecondaryRole> getSecondaryRoles() {
    return secondaryRoles;
  }

  public void setSecondaryRoles(List<CoinbaseCustodyApiUserChangeSecondaryRole> secondaryRoles) {
    this.secondaryRoles = secondaryRoles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoinbaseEngPrimeApiApiUserRolesUpdate coinbaseEngPrimeApiApiUserRolesUpdate = (CoinbaseEngPrimeApiApiUserRolesUpdate) o;
    return Objects.equals(this.hierarchy, coinbaseEngPrimeApiApiUserRolesUpdate.hierarchy) &&
        Objects.equals(this.category, coinbaseEngPrimeApiApiUserRolesUpdate.category) &&
        Objects.equals(this.roles, coinbaseEngPrimeApiApiUserRolesUpdate.roles) &&
        Objects.equals(this.secondaryRoles, coinbaseEngPrimeApiApiUserRolesUpdate.secondaryRoles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hierarchy, category, roles, secondaryRoles);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoinbaseEngPrimeApiApiUserRolesUpdate {\n");
    
    sb.append("    hierarchy: ").append(toIndentedString(hierarchy)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    secondaryRoles: ").append(toIndentedString(secondaryRoles)).append("\n");
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

