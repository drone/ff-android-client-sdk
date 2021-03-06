/*
 * Harness feature flag analytics service
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: cf@harness.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package io.harness.cfsdk.cloud.analytics.model;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;

/**
 * KeyValue
 */
public class KeyValue {

    public static final String SERIALIZED_NAME_KEY = "key";
    @SerializedName(SERIALIZED_NAME_KEY)
    private String key;

    public static final String SERIALIZED_NAME_VALUE = "value";
    @SerializedName(SERIALIZED_NAME_VALUE)
    private String value;


    public KeyValue key(String key) {

        this.key = key;
        return this;
    }

    /**
     * Get key
     *
     * @return key
     **/
    @ApiModelProperty(required = true, value = "")
    public String getKey() {
        return key;
    }


    public void setKey(String key) {
        this.key = key;
    }

    public KeyValue value(String value) {

        this.value = value;
        return this;
    }

    /**
     * Get value
     * @return value
     **/
    @ApiModelProperty(required = true, value = "")
    public String getValue() {

        return value;
    }


    public void setValue(String value) {

        this.value = value;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KeyValue keyValue = (KeyValue) o;
        return Objects.equals(this.key, keyValue.key) &&
                Objects.equals(this.value, keyValue.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeyValue {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
