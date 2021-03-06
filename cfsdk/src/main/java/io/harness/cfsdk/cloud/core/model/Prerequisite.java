/*
 * Harness feature flag service client apis
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: cf@harness.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.harness.cfsdk.cloud.core.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;

/**
 * Prerequisite
 */
public class Prerequisite {
  public static final String SERIALIZED_NAME_FEATURE = "feature";
  @SerializedName(SERIALIZED_NAME_FEATURE)
  private String feature;

  public static final String SERIALIZED_NAME_VARIATIONS = "variations";
  @SerializedName(SERIALIZED_NAME_VARIATIONS)
  private List<String> variations = new ArrayList<>();


  public Prerequisite feature(String feature) {
    
    this.feature = feature;
    return this;
  }

   /**
   * Get feature
   * @return feature
  **/
  @ApiModelProperty(required = true, value = "")

  public String getFeature() {
    return feature;
  }


  public void setFeature(String feature) {
    this.feature = feature;
  }


  public Prerequisite variations(List<String> variations) {
    
    this.variations = variations;
    return this;
  }

  public Prerequisite addVariationsItem(String variationsItem) {
    this.variations.add(variationsItem);
    return this;
  }

   /**
   * Get variations
   * @return variations
  **/
  @ApiModelProperty(required = true, value = "")

  public List<String> getVariations() {
    return variations;
  }


  public void setVariations(List<String> variations) {
    this.variations = variations;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Prerequisite prerequisite = (Prerequisite) o;
    return Objects.equals(this.feature, prerequisite.feature) &&
        Objects.equals(this.variations, prerequisite.variations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feature, variations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Prerequisite {\n");
    sb.append("    feature: ").append(toIndentedString(feature)).append("\n");
    sb.append("    variations: ").append(toIndentedString(variations)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

