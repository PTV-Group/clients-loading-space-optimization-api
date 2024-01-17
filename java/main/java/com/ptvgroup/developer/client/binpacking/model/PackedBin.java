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
import com.ptvgroup.developer.client.binpacking.model.PackedItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Describes a bin packed with items. If Bin.numberOfInstances is greater than one, multiple packed bins with the same PackedBin.binId might be part of a response. 
 */
@ApiModel(description = "Describes a bin packed with items. If Bin.numberOfInstances is greater than one, multiple packed bins with the same PackedBin.binId might be part of a response. ")
@JsonPropertyOrder({
  PackedBin.JSON_PROPERTY_BIN_ID,
  PackedBin.JSON_PROPERTY_PACKED_ITEMS,
  PackedBin.JSON_PROPERTY_TOTAL_ITEMS_VOLUME,
  PackedBin.JSON_PROPERTY_TOTAL_ITEMS_WEIGHT,
  PackedBin.JSON_PROPERTY_USED_WEIGHT_CAPACITY,
  PackedBin.JSON_PROPERTY_USED_VOLUME_CAPACITY,
  PackedBin.JSON_PROPERTY_LOADING_METERS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-17T10:21:27.576807Z[Etc/UTC]")
public class PackedBin {
  public static final String JSON_PROPERTY_BIN_ID = "binId";
  private String binId;

  public static final String JSON_PROPERTY_PACKED_ITEMS = "packedItems";
  private List<PackedItem> packedItems = new ArrayList<>();

  public static final String JSON_PROPERTY_TOTAL_ITEMS_VOLUME = "totalItemsVolume";
  private Integer totalItemsVolume;

  public static final String JSON_PROPERTY_TOTAL_ITEMS_WEIGHT = "totalItemsWeight";
  private Integer totalItemsWeight;

  public static final String JSON_PROPERTY_USED_WEIGHT_CAPACITY = "usedWeightCapacity";
  private Double usedWeightCapacity;

  public static final String JSON_PROPERTY_USED_VOLUME_CAPACITY = "usedVolumeCapacity";
  private Double usedVolumeCapacity;

  public static final String JSON_PROPERTY_LOADING_METERS = "loadingMeters";
  private Double loadingMeters;

  public PackedBin() { 
  }

  public PackedBin binId(String binId) {
    this.binId = binId;
    return this;
  }

   /**
   * ID of the bin.
   * @return binId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "ID of the bin.")
  @JsonProperty(JSON_PROPERTY_BIN_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getBinId() {
    return binId;
  }


  @JsonProperty(JSON_PROPERTY_BIN_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBinId(String binId) {
    this.binId = binId;
  }


  public PackedBin packedItems(List<PackedItem> packedItems) {
    this.packedItems = packedItems;
    return this;
  }

  public PackedBin addPackedItemsItem(PackedItem packedItemsItem) {
    this.packedItems.add(packedItemsItem);
    return this;
  }

   /**
   * List of items that were packed into this bin.
   * @return packedItems
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "List of items that were packed into this bin.")
  @JsonProperty(JSON_PROPERTY_PACKED_ITEMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<PackedItem> getPackedItems() {
    return packedItems;
  }


  @JsonProperty(JSON_PROPERTY_PACKED_ITEMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPackedItems(List<PackedItem> packedItems) {
    this.packedItems = packedItems;
  }


  public PackedBin totalItemsVolume(Integer totalItemsVolume) {
    this.totalItemsVolume = totalItemsVolume;
    return this;
  }

   /**
   * Accumulated volume of the items packed into the bin in [cm³]. This is the raw sum and does not try to capture wasted volume (e.g. gaps).
   * minimum: 0
   * @return totalItemsVolume
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Accumulated volume of the items packed into the bin in [cm³]. This is the raw sum and does not try to capture wasted volume (e.g. gaps).")
  @JsonProperty(JSON_PROPERTY_TOTAL_ITEMS_VOLUME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getTotalItemsVolume() {
    return totalItemsVolume;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_ITEMS_VOLUME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTotalItemsVolume(Integer totalItemsVolume) {
    this.totalItemsVolume = totalItemsVolume;
  }


  public PackedBin totalItemsWeight(Integer totalItemsWeight) {
    this.totalItemsWeight = totalItemsWeight;
    return this;
  }

   /**
   * Accumulated weight of items packed into this bin in [g].
   * minimum: 0
   * @return totalItemsWeight
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Accumulated weight of items packed into this bin in [g].")
  @JsonProperty(JSON_PROPERTY_TOTAL_ITEMS_WEIGHT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getTotalItemsWeight() {
    return totalItemsWeight;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_ITEMS_WEIGHT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTotalItemsWeight(Integer totalItemsWeight) {
    this.totalItemsWeight = totalItemsWeight;
  }


  public PackedBin usedWeightCapacity(Double usedWeightCapacity) {
    this.usedWeightCapacity = usedWeightCapacity;
    return this;
  }

   /**
   * Percent of maximumWeightCapacity and the accumulated weight of the items packed into this bin (totalItemsWeight). Not returned if maximumWeightCapacity was not specified. 
   * minimum: 0
   * maximum: 100
   * @return usedWeightCapacity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Percent of maximumWeightCapacity and the accumulated weight of the items packed into this bin (totalItemsWeight). Not returned if maximumWeightCapacity was not specified. ")
  @JsonProperty(JSON_PROPERTY_USED_WEIGHT_CAPACITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getUsedWeightCapacity() {
    return usedWeightCapacity;
  }


  @JsonProperty(JSON_PROPERTY_USED_WEIGHT_CAPACITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsedWeightCapacity(Double usedWeightCapacity) {
    this.usedWeightCapacity = usedWeightCapacity;
  }


  public PackedBin usedVolumeCapacity(Double usedVolumeCapacity) {
    this.usedVolumeCapacity = usedVolumeCapacity;
    return this;
  }

   /**
   * Percent of maximumVolumeCapacity and the accumulated volume of the items packed into this bin (totalItemsVolume). 
   * minimum: 0
   * maximum: 100
   * @return usedVolumeCapacity
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Percent of maximumVolumeCapacity and the accumulated volume of the items packed into this bin (totalItemsVolume). ")
  @JsonProperty(JSON_PROPERTY_USED_VOLUME_CAPACITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getUsedVolumeCapacity() {
    return usedVolumeCapacity;
  }


  @JsonProperty(JSON_PROPERTY_USED_VOLUME_CAPACITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUsedVolumeCapacity(Double usedVolumeCapacity) {
    this.usedVolumeCapacity = usedVolumeCapacity;
  }


  public PackedBin loadingMeters(Double loadingMeters) {
    this.loadingMeters = loadingMeters;
    return this;
  }

   /**
   * Item extent along the z-axis (length) from the back wall of the bin in [m]. 
   * minimum: 0
   * @return loadingMeters
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Item extent along the z-axis (length) from the back wall of the bin in [m]. ")
  @JsonProperty(JSON_PROPERTY_LOADING_METERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getLoadingMeters() {
    return loadingMeters;
  }


  @JsonProperty(JSON_PROPERTY_LOADING_METERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLoadingMeters(Double loadingMeters) {
    this.loadingMeters = loadingMeters;
  }


  /**
   * Return true if this PackedBin object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PackedBin packedBin = (PackedBin) o;
    return Objects.equals(this.binId, packedBin.binId) &&
        Objects.equals(this.packedItems, packedBin.packedItems) &&
        Objects.equals(this.totalItemsVolume, packedBin.totalItemsVolume) &&
        Objects.equals(this.totalItemsWeight, packedBin.totalItemsWeight) &&
        Objects.equals(this.usedWeightCapacity, packedBin.usedWeightCapacity) &&
        Objects.equals(this.usedVolumeCapacity, packedBin.usedVolumeCapacity) &&
        Objects.equals(this.loadingMeters, packedBin.loadingMeters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(binId, packedItems, totalItemsVolume, totalItemsWeight, usedWeightCapacity, usedVolumeCapacity, loadingMeters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PackedBin {\n");
    sb.append("    binId: ").append(toIndentedString(binId)).append("\n");
    sb.append("    packedItems: ").append(toIndentedString(packedItems)).append("\n");
    sb.append("    totalItemsVolume: ").append(toIndentedString(totalItemsVolume)).append("\n");
    sb.append("    totalItemsWeight: ").append(toIndentedString(totalItemsWeight)).append("\n");
    sb.append("    usedWeightCapacity: ").append(toIndentedString(usedWeightCapacity)).append("\n");
    sb.append("    usedVolumeCapacity: ").append(toIndentedString(usedVolumeCapacity)).append("\n");
    sb.append("    loadingMeters: ").append(toIndentedString(loadingMeters)).append("\n");
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

