/*
 * Loading Optimization
 * With the Bin Packing service you can pack a number of items of various types into a number of bins of various types.
 *
 * The version of the OpenAPI document: 1.1
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


/**
 * Describes the position of an item in a bin.  The coordinate system is right-handed with x extending to the right, y pointing up and z pointing towards you. In terms of a truck (0,0,0) would be at the lower-left-corner of the opposing wall when looking through the back doors.  An item, for example a palette, placed there would be on the ground. It would also touch the left wall as well as the wall towards the drivers cabin. 
 */
@ApiModel(description = "Describes the position of an item in a bin.  The coordinate system is right-handed with x extending to the right, y pointing up and z pointing towards you. In terms of a truck (0,0,0) would be at the lower-left-corner of the opposing wall when looking through the back doors.  An item, for example a palette, placed there would be on the ground. It would also touch the left wall as well as the wall towards the drivers cabin. ")
@JsonPropertyOrder({
  ItemPosition.JSON_PROPERTY_X,
  ItemPosition.JSON_PROPERTY_Y,
  ItemPosition.JSON_PROPERTY_Z
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-17T10:21:27.576807Z[Etc/UTC]")
public class ItemPosition {
  public static final String JSON_PROPERTY_X = "x";
  private Integer x;

  public static final String JSON_PROPERTY_Y = "y";
  private Integer y;

  public static final String JSON_PROPERTY_Z = "z";
  private Integer z;

  public ItemPosition() { 
  }

  public ItemPosition x(Integer x) {
    this.x = x;
    return this;
  }

   /**
   * Offset along x-axis in [cm]. Equal to the shift along the width of the bin from left to right.
   * @return x
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Offset along x-axis in [cm]. Equal to the shift along the width of the bin from left to right.")
  @JsonProperty(JSON_PROPERTY_X)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getX() {
    return x;
  }


  @JsonProperty(JSON_PROPERTY_X)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setX(Integer x) {
    this.x = x;
  }


  public ItemPosition y(Integer y) {
    this.y = y;
    return this;
  }

   /**
   * Offset along y-axis in [cm]. Equal to the height from the floor of the bin.
   * @return y
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Offset along y-axis in [cm]. Equal to the height from the floor of the bin.")
  @JsonProperty(JSON_PROPERTY_Y)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getY() {
    return y;
  }


  @JsonProperty(JSON_PROPERTY_Y)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setY(Integer y) {
    this.y = y;
  }


  public ItemPosition z(Integer z) {
    this.z = z;
    return this;
  }

   /**
   * Offset along z-axis in [cm]. Equal to the shift along the length of the bin from back to front.
   * @return z
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Offset along z-axis in [cm]. Equal to the shift along the length of the bin from back to front.")
  @JsonProperty(JSON_PROPERTY_Z)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getZ() {
    return z;
  }


  @JsonProperty(JSON_PROPERTY_Z)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setZ(Integer z) {
    this.z = z;
  }


  /**
   * Return true if this ItemPosition object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemPosition itemPosition = (ItemPosition) o;
    return Objects.equals(this.x, itemPosition.x) &&
        Objects.equals(this.y, itemPosition.y) &&
        Objects.equals(this.z, itemPosition.z);
  }

  @Override
  public int hashCode() {
    return Objects.hash(x, y, z);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemPosition {\n");
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

