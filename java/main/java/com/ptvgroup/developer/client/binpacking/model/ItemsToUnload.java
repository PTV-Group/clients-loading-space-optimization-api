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
 * Defines the number of instances of an item to unload.
 */
@ApiModel(description = "Defines the number of instances of an item to unload.")
@JsonPropertyOrder({
  ItemsToUnload.JSON_PROPERTY_ITEM_ID,
  ItemsToUnload.JSON_PROPERTY_NUMBER_OF_INSTANCES
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-17T10:21:27.576807Z[Etc/UTC]")
public class ItemsToUnload {
  public static final String JSON_PROPERTY_ITEM_ID = "itemId";
  private String itemId;

  public static final String JSON_PROPERTY_NUMBER_OF_INSTANCES = "numberOfInstances";
  private Integer numberOfInstances = 1;

  public ItemsToUnload() { 
  }

  public ItemsToUnload itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

   /**
   * ID of the item.
   * @return itemId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "ID of the item.")
  @JsonProperty(JSON_PROPERTY_ITEM_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getItemId() {
    return itemId;
  }


  @JsonProperty(JSON_PROPERTY_ITEM_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setItemId(String itemId) {
    this.itemId = itemId;
  }


  public ItemsToUnload numberOfInstances(Integer numberOfInstances) {
    this.numberOfInstances = numberOfInstances;
    return this;
  }

   /**
   * The amount of instances of the item to unload.
   * minimum: 1
   * @return numberOfInstances
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The amount of instances of the item to unload.")
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_INSTANCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumberOfInstances() {
    return numberOfInstances;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_OF_INSTANCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberOfInstances(Integer numberOfInstances) {
    this.numberOfInstances = numberOfInstances;
  }


  /**
   * Return true if this ItemsToUnload object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemsToUnload itemsToUnload = (ItemsToUnload) o;
    return Objects.equals(this.itemId, itemsToUnload.itemId) &&
        Objects.equals(this.numberOfInstances, itemsToUnload.numberOfInstances);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, numberOfInstances);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemsToUnload {\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    numberOfInstances: ").append(toIndentedString(numberOfInstances)).append("\n");
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

