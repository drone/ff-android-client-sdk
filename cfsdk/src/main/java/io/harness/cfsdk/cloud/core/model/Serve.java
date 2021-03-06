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

import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;

/**
 * Serve
 */
public class Serve {
  public static final String SERIALIZED_NAME_DISTRIBUTION = "distribution";
  @SerializedName(SERIALIZED_NAME_DISTRIBUTION)
  private Distribution distribution;

  public static final String SERIALIZED_NAME_VARIATION = "variation";
  @SerializedName(SERIALIZED_NAME_VARIATION)
  private String variation;


  public Serve distribution(Distribution distribution) {
    
    this.distribution = distribution;
    return this;
  }

   /**
   * Get distribution
   * @return distribution
  **/
  @androidx.annotation.Nullable
  @ApiModelProperty(value = "")

  public Distribution getDistribution() {
    return distribution;
  }


  public void setDistribution(Distribution distribution) {
    this.distribution = distribution;
  }


  public Serve variation(String variation) {
    
    this.variation = variation;
    return this;
  }

   /**
   * Get variation
   * @return variation
  **/
  @androidx.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVariation() {
    return variation;
  }


  public void setVariation(String variation) {
    this.variation = variation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Serve serve = (Serve) o;
    return Objects.equals(this.distribution, serve.distribution) &&
        Objects.equals(this.variation, serve.variation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(distribution, variation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Serve {\n");
    sb.append("    distribution: ").append(toIndentedString(distribution)).append("\n");
    sb.append("    variation: ").append(toIndentedString(variation)).append("\n");
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

