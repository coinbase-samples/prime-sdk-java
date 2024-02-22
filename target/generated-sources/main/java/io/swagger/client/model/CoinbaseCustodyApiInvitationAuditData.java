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
import io.swagger.client.model.CoinbaseCustodyApiInvitationRole;
import io.swagger.client.model.CoinbaseCustodyApiInvitationSecondaryRole;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * CoinbaseCustodyApiInvitationAuditData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-22T12:46:00.828-08:00")
public class CoinbaseCustodyApiInvitationAuditData {
  @SerializedName("id")
  private String id = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("role")
  private CoinbaseCustodyApiInvitationRole role = null;

  @SerializedName("vehicle_id")
  private String vehicleId = null;

  @SerializedName("vehicle_name")
  private String vehicleName = null;

  @SerializedName("secondary_roles")
  private List<CoinbaseCustodyApiInvitationSecondaryRole> secondaryRoles = new ArrayList<CoinbaseCustodyApiInvitationSecondaryRole>();

  @SerializedName("roles")
  private List<CoinbaseCustodyApiInvitationRole> roles = null;

  public CoinbaseCustodyApiInvitationAuditData id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CoinbaseCustodyApiInvitationAuditData email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(required = true, value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public CoinbaseCustodyApiInvitationAuditData role(CoinbaseCustodyApiInvitationRole role) {
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @ApiModelProperty(required = true, value = "")
  public CoinbaseCustodyApiInvitationRole getRole() {
    return role;
  }

  public void setRole(CoinbaseCustodyApiInvitationRole role) {
    this.role = role;
  }

  public CoinbaseCustodyApiInvitationAuditData vehicleId(String vehicleId) {
    this.vehicleId = vehicleId;
    return this;
  }

   /**
   * Get vehicleId
   * @return vehicleId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getVehicleId() {
    return vehicleId;
  }

  public void setVehicleId(String vehicleId) {
    this.vehicleId = vehicleId;
  }

  public CoinbaseCustodyApiInvitationAuditData vehicleName(String vehicleName) {
    this.vehicleName = vehicleName;
    return this;
  }

   /**
   * Get vehicleName
   * @return vehicleName
  **/
  @ApiModelProperty(required = true, value = "")
  public String getVehicleName() {
    return vehicleName;
  }

  public void setVehicleName(String vehicleName) {
    this.vehicleName = vehicleName;
  }

  public CoinbaseCustodyApiInvitationAuditData secondaryRoles(List<CoinbaseCustodyApiInvitationSecondaryRole> secondaryRoles) {
    this.secondaryRoles = secondaryRoles;
    return this;
  }

  public CoinbaseCustodyApiInvitationAuditData addSecondaryRolesItem(CoinbaseCustodyApiInvitationSecondaryRole secondaryRolesItem) {
    this.secondaryRoles.add(secondaryRolesItem);
    return this;
  }

   /**
   * Get secondaryRoles
   * @return secondaryRoles
  **/
  @ApiModelProperty(required = true, value = "")
  public List<CoinbaseCustodyApiInvitationSecondaryRole> getSecondaryRoles() {
    return secondaryRoles;
  }

  public void setSecondaryRoles(List<CoinbaseCustodyApiInvitationSecondaryRole> secondaryRoles) {
    this.secondaryRoles = secondaryRoles;
  }

  public CoinbaseCustodyApiInvitationAuditData roles(List<CoinbaseCustodyApiInvitationRole> roles) {
    this.roles = roles;
    return this;
  }

  public CoinbaseCustodyApiInvitationAuditData addRolesItem(CoinbaseCustodyApiInvitationRole rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<CoinbaseCustodyApiInvitationRole>();
    }
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * Get roles
   * @return roles
  **/
  @ApiModelProperty(value = "")
  public List<CoinbaseCustodyApiInvitationRole> getRoles() {
    return roles;
  }

  public void setRoles(List<CoinbaseCustodyApiInvitationRole> roles) {
    this.roles = roles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoinbaseCustodyApiInvitationAuditData coinbaseCustodyApiInvitationAuditData = (CoinbaseCustodyApiInvitationAuditData) o;
    return Objects.equals(this.id, coinbaseCustodyApiInvitationAuditData.id) &&
        Objects.equals(this.email, coinbaseCustodyApiInvitationAuditData.email) &&
        Objects.equals(this.role, coinbaseCustodyApiInvitationAuditData.role) &&
        Objects.equals(this.vehicleId, coinbaseCustodyApiInvitationAuditData.vehicleId) &&
        Objects.equals(this.vehicleName, coinbaseCustodyApiInvitationAuditData.vehicleName) &&
        Objects.equals(this.secondaryRoles, coinbaseCustodyApiInvitationAuditData.secondaryRoles) &&
        Objects.equals(this.roles, coinbaseCustodyApiInvitationAuditData.roles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, email, role, vehicleId, vehicleName, secondaryRoles, roles);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoinbaseCustodyApiInvitationAuditData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    vehicleId: ").append(toIndentedString(vehicleId)).append("\n");
    sb.append("    vehicleName: ").append(toIndentedString(vehicleName)).append("\n");
    sb.append("    secondaryRoles: ").append(toIndentedString(secondaryRoles)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
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

