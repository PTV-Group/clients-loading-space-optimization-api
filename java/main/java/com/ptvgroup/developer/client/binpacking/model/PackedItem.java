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
import com.ptvgroup.developer.client.binpacking.model.BoxDimensions;
import com.ptvgroup.developer.client.binpacking.model.ItemOrientation;
import com.ptvgroup.developer.client.binpacking.model.ItemPosition;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.ptvgroup.developer.client.binpacking.JSON;


/**
 * Describes how an item is packed into the bin. If Item.numberOfInstances is greater than one, several of this item are packed into the bin. 
 */
@ApiModel(description = "Describes how an item is packed into the bin. If Item.numberOfInstances is greater than one, several of this item are packed into the bin. ")
@JsonPropertyOrder({
  PackedItem.JSON_PROPERTY_ITEM_ID,
  PackedItem.JSON_PROPERTY_POSITION,
  PackedItem.JSON_PROPERTY_DIMENSIONS,
  PackedItem.JSON_PROPERTY_ORIENTATION
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-01T07:19:07.077191Z[Etc/UTC]")
public class PackedItem {
  public static final String JSON_PROPERTY_ITEM_ID = "itemId";
  private String itemId;

  public static final String JSON_PROPERTY_POSITION = "position";
  private ItemPosition position;

  public static final String JSON_PROPERTY_DIMENSIONS = "dimensions";
  private BoxDimensions dimensions;

  public static final String JSON_PROPERTY_ORIENTATION = "orientation";
  private ItemOrientation orientation;


  public PackedItem itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

   /**
   * ID of the item.
   * @return itemId
  **/
  @ApiModelProperty(required = true, value = "ID of the item.")
  @JsonProperty(JSON_PROPERTY_ITEM_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getItemId() {
    return itemId;
  }


  public void setItemId(String itemId) {
    this.itemId = itemId;
  }


  public PackedItem position(ItemPosition position) {
    this.position = position;
    return this;
  }

   /**
   * Get position
   * @return position
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_POSITION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ItemPosition getPosition() {
    return position;
  }


  public void setPosition(ItemPosition position) {
    this.position = position;
  }


  public PackedItem dimensions(BoxDimensions dimensions) {
    this.dimensions = dimensions;
    return this;
  }

   /**
   * Get dimensions
   * @return dimensions
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DIMENSIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BoxDimensions getDimensions() {
    return dimensions;
  }


  public void setDimensions(BoxDimensions dimensions) {
    this.dimensions = dimensions;
  }


  public PackedItem orientation(ItemOrientation orientation) {
    this.orientation = orientation;
    return this;
  }

   /**
   * Get orientation
   * @return orientation
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ORIENTATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ItemOrientation getOrientation() {
    return orientation;
  }


  public void setOrientation(ItemOrientation orientation) {
    this.orientation = orientation;
  }


  /**
   * Return true if this PackedItem object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PackedItem packedItem = (PackedItem) o;
    return Objects.equals(this.itemId, packedItem.itemId) &&
        Objects.equals(this.position, packedItem.position) &&
        Objects.equals(this.dimensions, packedItem.dimensions) &&
        Objects.equals(this.orientation, packedItem.orientation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, position, dimensions, orientation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PackedItem {\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
    sb.append("    orientation: ").append(toIndentedString(orientation)).append("\n");
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

