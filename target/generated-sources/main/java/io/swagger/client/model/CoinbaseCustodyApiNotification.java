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

/**
 * CoinbaseCustodyApiNotification
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-22T12:46:00.828-08:00")
public class CoinbaseCustodyApiNotification {
  @SerializedName("id")
  private String id = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("body")
  private String body = null;

  @SerializedName("criteria")
  private String criteria = null;

  @SerializedName("active")
  private Boolean active = null;

  @SerializedName("end_date")
  private String endDate = null;

  @SerializedName("start_date")
  private String startDate = null;

  @SerializedName("dismissible")
  private Boolean dismissible = null;

  @SerializedName("category")
  private String category = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("cta_label")
  private String ctaLabel = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("secondary_cta_label")
  private String secondaryCtaLabel = null;

  @SerializedName("secondary_cta_url")
  private String secondaryCtaUrl = null;

  @SerializedName("show_once")
  private Boolean showOnce = null;

  @SerializedName("content_title")
  private String contentTitle = null;

  public CoinbaseCustodyApiNotification id(String id) {
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

  public CoinbaseCustodyApiNotification title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(required = true, value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public CoinbaseCustodyApiNotification body(String body) {
    this.body = body;
    return this;
  }

   /**
   * Get body
   * @return body
  **/
  @ApiModelProperty(value = "")
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public CoinbaseCustodyApiNotification criteria(String criteria) {
    this.criteria = criteria;
    return this;
  }

   /**
   * Get criteria
   * @return criteria
  **/
  @ApiModelProperty(value = "")
  public String getCriteria() {
    return criteria;
  }

  public void setCriteria(String criteria) {
    this.criteria = criteria;
  }

  public CoinbaseCustodyApiNotification active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @ApiModelProperty(value = "")
  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public CoinbaseCustodyApiNotification endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @ApiModelProperty(value = "")
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public CoinbaseCustodyApiNotification startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @ApiModelProperty(value = "")
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public CoinbaseCustodyApiNotification dismissible(Boolean dismissible) {
    this.dismissible = dismissible;
    return this;
  }

   /**
   * Get dismissible
   * @return dismissible
  **/
  @ApiModelProperty(value = "")
  public Boolean isDismissible() {
    return dismissible;
  }

  public void setDismissible(Boolean dismissible) {
    this.dismissible = dismissible;
  }

  public CoinbaseCustodyApiNotification category(String category) {
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @ApiModelProperty(value = "")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public CoinbaseCustodyApiNotification url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(value = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public CoinbaseCustodyApiNotification ctaLabel(String ctaLabel) {
    this.ctaLabel = ctaLabel;
    return this;
  }

   /**
   * Get ctaLabel
   * @return ctaLabel
  **/
  @ApiModelProperty(value = "")
  public String getCtaLabel() {
    return ctaLabel;
  }

  public void setCtaLabel(String ctaLabel) {
    this.ctaLabel = ctaLabel;
  }

  public CoinbaseCustodyApiNotification type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public CoinbaseCustodyApiNotification secondaryCtaLabel(String secondaryCtaLabel) {
    this.secondaryCtaLabel = secondaryCtaLabel;
    return this;
  }

   /**
   * Get secondaryCtaLabel
   * @return secondaryCtaLabel
  **/
  @ApiModelProperty(value = "")
  public String getSecondaryCtaLabel() {
    return secondaryCtaLabel;
  }

  public void setSecondaryCtaLabel(String secondaryCtaLabel) {
    this.secondaryCtaLabel = secondaryCtaLabel;
  }

  public CoinbaseCustodyApiNotification secondaryCtaUrl(String secondaryCtaUrl) {
    this.secondaryCtaUrl = secondaryCtaUrl;
    return this;
  }

   /**
   * Get secondaryCtaUrl
   * @return secondaryCtaUrl
  **/
  @ApiModelProperty(value = "")
  public String getSecondaryCtaUrl() {
    return secondaryCtaUrl;
  }

  public void setSecondaryCtaUrl(String secondaryCtaUrl) {
    this.secondaryCtaUrl = secondaryCtaUrl;
  }

  public CoinbaseCustodyApiNotification showOnce(Boolean showOnce) {
    this.showOnce = showOnce;
    return this;
  }

   /**
   * Get showOnce
   * @return showOnce
  **/
  @ApiModelProperty(value = "")
  public Boolean isShowOnce() {
    return showOnce;
  }

  public void setShowOnce(Boolean showOnce) {
    this.showOnce = showOnce;
  }

  public CoinbaseCustodyApiNotification contentTitle(String contentTitle) {
    this.contentTitle = contentTitle;
    return this;
  }

   /**
   * Get contentTitle
   * @return contentTitle
  **/
  @ApiModelProperty(value = "")
  public String getContentTitle() {
    return contentTitle;
  }

  public void setContentTitle(String contentTitle) {
    this.contentTitle = contentTitle;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoinbaseCustodyApiNotification coinbaseCustodyApiNotification = (CoinbaseCustodyApiNotification) o;
    return Objects.equals(this.id, coinbaseCustodyApiNotification.id) &&
        Objects.equals(this.title, coinbaseCustodyApiNotification.title) &&
        Objects.equals(this.body, coinbaseCustodyApiNotification.body) &&
        Objects.equals(this.criteria, coinbaseCustodyApiNotification.criteria) &&
        Objects.equals(this.active, coinbaseCustodyApiNotification.active) &&
        Objects.equals(this.endDate, coinbaseCustodyApiNotification.endDate) &&
        Objects.equals(this.startDate, coinbaseCustodyApiNotification.startDate) &&
        Objects.equals(this.dismissible, coinbaseCustodyApiNotification.dismissible) &&
        Objects.equals(this.category, coinbaseCustodyApiNotification.category) &&
        Objects.equals(this.url, coinbaseCustodyApiNotification.url) &&
        Objects.equals(this.ctaLabel, coinbaseCustodyApiNotification.ctaLabel) &&
        Objects.equals(this.type, coinbaseCustodyApiNotification.type) &&
        Objects.equals(this.secondaryCtaLabel, coinbaseCustodyApiNotification.secondaryCtaLabel) &&
        Objects.equals(this.secondaryCtaUrl, coinbaseCustodyApiNotification.secondaryCtaUrl) &&
        Objects.equals(this.showOnce, coinbaseCustodyApiNotification.showOnce) &&
        Objects.equals(this.contentTitle, coinbaseCustodyApiNotification.contentTitle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, body, criteria, active, endDate, startDate, dismissible, category, url, ctaLabel, type, secondaryCtaLabel, secondaryCtaUrl, showOnce, contentTitle);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoinbaseCustodyApiNotification {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    criteria: ").append(toIndentedString(criteria)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    dismissible: ").append(toIndentedString(dismissible)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    ctaLabel: ").append(toIndentedString(ctaLabel)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    secondaryCtaLabel: ").append(toIndentedString(secondaryCtaLabel)).append("\n");
    sb.append("    secondaryCtaUrl: ").append(toIndentedString(secondaryCtaUrl)).append("\n");
    sb.append("    showOnce: ").append(toIndentedString(showOnce)).append("\n");
    sb.append("    contentTitle: ").append(toIndentedString(contentTitle)).append("\n");
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

