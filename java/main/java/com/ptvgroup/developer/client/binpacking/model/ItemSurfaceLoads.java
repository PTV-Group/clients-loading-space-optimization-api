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
 * Describes the surface loads in [g/cm²] on an item acting on each of its axis. If an axis is not provided it is assumed to be irrelevant and/or non-restrictive. 
 */
@ApiModel(description = "Describes the surface loads in [g/cm²] on an item acting on each of its axis. If an axis is not provided it is assumed to be irrelevant and/or non-restrictive. ")
@JsonPropertyOrder({
  ItemSurfaceLoads.JSON_PROPERTY_X,
  ItemSurfaceLoads.JSON_PROPERTY_Y,
  ItemSurfaceLoads.JSON_PROPERTY_Z
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-28T11:25:19.033913Z[Etc/UTC]")
public class ItemSurfaceLoads {
  public static final String JSON_PROPERTY_X = "x";
  private Double x;

  public static final String JSON_PROPERTY_Y = "y";
  private Double y;

  public static final String JSON_PROPERTY_Z = "z";
  private Double z;


  public ItemSurfaceLoads x(Double x) {
    this.x = x;
    return this;
  }

   /**
   * Surface load acting on the x-axis (width) of the item in [g/cm²].
   * minimum: 0
   * maximum: 80000000
   * @return x
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Surface load acting on the x-axis (width) of the item in [g/cm²].")
  @JsonProperty(JSON_PROPERTY_X)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getX() {
    return x;
  }


  public void setX(Double x) {
    this.x = x;
  }


  public ItemSurfaceLoads y(Double y) {
    this.y = y;
    return this;
  }

   /**
   * Surface load acting on the y-axis (height) of the item in [g/cm²].
   * minimum: 0
   * maximum: 80000000
   * @return y
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Surface load acting on the y-axis (height) of the item in [g/cm²].")
  @JsonProperty(JSON_PROPERTY_Y)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getY() {
    return y;
  }


  public void setY(Double y) {
    this.y = y;
  }


  public ItemSurfaceLoads z(Double z) {
    this.z = z;
    return this;
  }

   /**
   * Surface load acting on the z-axis (length) of the item in [g/cm²].
   * minimum: 0
   * maximum: 80000000
   * @return z
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Surface load acting on the z-axis (length) of the item in [g/cm²].")
  @JsonProperty(JSON_PROPERTY_Z)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getZ() {
    return z;
  }


  public void setZ(Double z) {
    this.z = z;
  }


  /**
   * Return true if this ItemSurfaceLoads object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemSurfaceLoads itemSurfaceLoads = (ItemSurfaceLoads) o;
    return Objects.equals(this.x, itemSurfaceLoads.x) &&
        Objects.equals(this.y, itemSurfaceLoads.y) &&
        Objects.equals(this.z, itemSurfaceLoads.z);
  }

  @Override
  public int hashCode() {
    return Objects.hash(x, y, z);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemSurfaceLoads {\n");
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

