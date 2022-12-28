/*
 * Loading Optimization
 * With the Bin Packing service you can pack a number of items of various types into a number of bins of various types.
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ptvgroup.developer.client.binpacking.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.ptvgroup.developer.client.binpacking.JSON;


/**
 * Size of an item or bin.
 */
@ApiModel(description = "Size of an item or bin.")
@JsonPropertyOrder({
  BoxDimensions.JSON_PROPERTY_X,
  BoxDimensions.JSON_PROPERTY_Y,
  BoxDimensions.JSON_PROPERTY_Z
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-28T11:25:19.033913Z[Etc/UTC]")
public class BoxDimensions {
  public static final String JSON_PROPERTY_X = "x";
  private Integer x;

  public static final String JSON_PROPERTY_Y = "y";
  private Integer y;

  public static final String JSON_PROPERTY_Z = "z";
  private Integer z;


  public BoxDimensions x(Integer x) {
    this.x = x;
    return this;
  }

   /**
   * Extent along x-axis (width) in [cm].
   * minimum: 1
   * @return x
  **/
  @ApiModelProperty(required = true, value = "Extent along x-axis (width) in [cm].")
  @JsonProperty(JSON_PROPERTY_X)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getX() {
    return x;
  }


  public void setX(Integer x) {
    this.x = x;
  }


  public BoxDimensions y(Integer y) {
    this.y = y;
    return this;
  }

   /**
   * Extent along y-axis (height) in [cm].
   * minimum: 1
   * @return y
  **/
  @ApiModelProperty(required = true, value = "Extent along y-axis (height) in [cm].")
  @JsonProperty(JSON_PROPERTY_Y)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getY() {
    return y;
  }


  public void setY(Integer y) {
    this.y = y;
  }


  public BoxDimensions z(Integer z) {
    this.z = z;
    return this;
  }

   /**
   * Extent along z-axis (length) in [cm].
   * minimum: 1
   * @return z
  **/
  @ApiModelProperty(required = true, value = "Extent along z-axis (length) in [cm].")
  @JsonProperty(JSON_PROPERTY_Z)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getZ() {
    return z;
  }


  public void setZ(Integer z) {
    this.z = z;
  }


  /**
   * Return true if this BoxDimensions object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BoxDimensions boxDimensions = (BoxDimensions) o;
    return Objects.equals(this.x, boxDimensions.x) &&
        Objects.equals(this.y, boxDimensions.y) &&
        Objects.equals(this.z, boxDimensions.z);
  }

  @Override
  public int hashCode() {
    return Objects.hash(x, y, z);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoxDimensions {\n");
    sb.append("    x: ").append(toIndentedString(x)).append("\n");
    sb.append("    y: ").append(toIndentedString(y)).append("\n");
    sb.append("    z: ").append(toIndentedString(z)).append("\n");
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
