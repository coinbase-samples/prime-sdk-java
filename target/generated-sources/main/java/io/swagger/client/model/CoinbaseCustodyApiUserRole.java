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
import io.swagger.client.model.CoinbaseCustodyApiPermission;
import io.swagger.client.model.CoinbaseCustodyApiRole;
import io.swagger.client.model.CoinbaseCustodyApiSecondaryRole;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CoinbaseCustodyApiUserRole
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-22T12:46:00.828-08:00")
public class CoinbaseCustodyApiUserRole {
  @SerializedName("role_name")
  private String roleName = null;

  @SerializedName("organization_id")
  private String organizationId = null;

  @SerializedName("vehicle_id")
  private String vehicleId = null;

  @SerializedName("portfolio_id")
  private String portfolioId = null;

  @SerializedName("permissions")
  private List<CoinbaseCustodyApiPermission> permissions = null;

  @SerializedName("role")
  private CoinbaseCustodyApiRole role = null;

  @SerializedName("secondary_roles")
  private List<CoinbaseCustodyApiSecondaryRole> secondaryRoles = null;

  public CoinbaseCustodyApiUserRole roleName(String roleName) {
    this.roleName = roleName;
    return this;
  }

   /**
   * Get roleName
   * @return roleName
  **/
  @ApiModelProperty(value = "")
  public String getRoleName() {
    return roleName;
  }

  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }

  public CoinbaseCustodyApiUserRole organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

   /**
   * Get organizationId
   * @return organizationId
  **/
  @ApiModelProperty(value = "")
  public String getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  public CoinbaseCustodyApiUserRole vehicleId(String vehicleId) {
    this.vehicleId = vehicleId;
    return this;
  }

   /**
   * Get vehicleId
   * @return vehicleId
  **/
  @ApiModelProperty(value = "")
  public String getVehicleId() {
    return vehicleId;
  }

  public void setVehicleId(String vehicleId) {
    this.vehicleId = vehicleId;
  }

  public CoinbaseCustodyApiUserRole portfolioId(String portfolioId) {
    this.portfolioId = portfolioId;
    return this;
  }

   /**
   * Get portfolioId
   * @return portfolioId
  **/
  @ApiModelProperty(value = "")
  public String getPortfolioId() {
    return portfolioId;
  }

  public void setPortfolioId(String portfolioId) {
    this.portfolioId = portfolioId;
  }

  public CoinbaseCustodyApiUserRole permissions(List<CoinbaseCustodyApiPermission> permissions) {
    this.permissions = permissions;
    return this;
  }

  public CoinbaseCustodyApiUserRole addPermissionsItem(CoinbaseCustodyApiPermission permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<CoinbaseCustodyApiPermission>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

   /**
   * Get permissions
   * @return permissions
  **/
  @ApiModelProperty(value = "")
  public List<CoinbaseCustodyApiPermission> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<CoinbaseCustodyApiPermission> permissions) {
    this.permissions = permissions;
  }

  public CoinbaseCustodyApiUserRole role(CoinbaseCustodyApiRole role) {
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @ApiModelProperty(value = "")
  public CoinbaseCustodyApiRole getRole() {
    return role;
  }

  public void setRole(CoinbaseCustodyApiRole role) {
    this.role = role;
  }

  public CoinbaseCustodyApiUserRole secondaryRoles(List<CoinbaseCustodyApiSecondaryRole> secondaryRoles) {
    this.secondaryRoles = secondaryRoles;
    return this;
  }

  public CoinbaseCustodyApiUserRole addSecondaryRolesItem(CoinbaseCustodyApiSecondaryRole secondaryRolesItem) {
    if (this.secondaryRoles == null) {
      this.secondaryRoles = new ArrayList<CoinbaseCustodyApiSecondaryRole>();
    }
    this.secondaryRoles.add(secondaryRolesItem);
    return this;
  }

   /**
   * Get secondaryRoles
   * @return secondaryRoles
  **/
  @ApiModelProperty(value = "")
  public List<CoinbaseCustodyApiSecondaryRole> getSecondaryRoles() {
    return secondaryRoles;
  }

  public void setSecondaryRoles(List<CoinbaseCustodyApiSecondaryRole> secondaryRoles) {
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
    CoinbaseCustodyApiUserRole coinbaseCustodyApiUserRole = (CoinbaseCustodyApiUserRole) o;
    return Objects.equals(this.roleName, coinbaseCustodyApiUserRole.roleName) &&
        Objects.equals(this.organizationId, coinbaseCustodyApiUserRole.organizationId) &&
        Objects.equals(this.vehicleId, coinbaseCustodyApiUserRole.vehicleId) &&
        Objects.equals(this.portfolioId, coinbaseCustodyApiUserRole.portfolioId) &&
        Objects.equals(this.permissions, coinbaseCustodyApiUserRole.permissions) &&
        Objects.equals(this.role, coinbaseCustodyApiUserRole.role) &&
        Objects.equals(this.secondaryRoles, coinbaseCustodyApiUserRole.secondaryRoles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roleName, organizationId, vehicleId, portfolioId, permissions, role, secondaryRoles);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoinbaseCustodyApiUserRole {\n");
    
    sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    vehicleId: ").append(toIndentedString(vehicleId)).append("\n");
    sb.append("    portfolioId: ").append(toIndentedString(portfolioId)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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

