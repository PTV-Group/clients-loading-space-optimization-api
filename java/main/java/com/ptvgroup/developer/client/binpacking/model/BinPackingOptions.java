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
import com.ptvgroup.developer.client.binpacking.model.StackingOptions;
import com.ptvgroup.developer.client.binpacking.model.Stop;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Allows customization of the bin packing operation.
 */
@ApiModel(description = "Allows customization of the bin packing operation.")
@JsonPropertyOrder({
  BinPackingOptions.JSON_PROPERTY_UNLOADING_SEQUENCE,
  BinPackingOptions.JSON_PROPERTY_STACKING_OPTIONS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-17T10:21:27.576807Z[Etc/UTC]")
public class BinPackingOptions {
  public static final String JSON_PROPERTY_UNLOADING_SEQUENCE = "unloadingSequence";
  private List<Stop> unloadingSequence = null;

  public static final String JSON_PROPERTY_STACKING_OPTIONS = "stackingOptions";
  private StackingOptions stackingOptions;

  public BinPackingOptions() { 
  }

  public BinPackingOptions unloadingSequence(List<Stop> unloadingSequence) {
    this.unloadingSequence = unloadingSequence;
    return this;
  }

  public BinPackingOptions addUnloadingSequenceItem(Stop unloadingSequenceItem) {
    if (this.unloadingSequence == null) {
      this.unloadingSequence = new ArrayList<>();
    }
    this.unloadingSequence.add(unloadingSequenceItem);
    return this;
  }

   /**
   * Specifies the sequence of items or group of items to be unloaded. The first element of this sequence will be unloaded first (and loaded last). By default items of a stop will not be stacked on top of items of the subsequent stop. This may be useful when unloading all items of a stop with a hand truck. To change this behavior specify &#39;stackOnTopOfNextStops&#39;. Please note that this option can only be used the case a single bin is defined.
   * @return unloadingSequence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the sequence of items or group of items to be unloaded. The first element of this sequence will be unloaded first (and loaded last). By default items of a stop will not be stacked on top of items of the subsequent stop. This may be useful when unloading all items of a stop with a hand truck. To change this behavior specify 'stackOnTopOfNextStops'. Please note that this option can only be used the case a single bin is defined.")
  @JsonProperty(JSON_PROPERTY_UNLOADING_SEQUENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Stop> getUnloadingSequence() {
    return unloadingSequence;
  }


  @JsonProperty(JSON_PROPERTY_UNLOADING_SEQUENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnloadingSequence(List<Stop> unloadingSequence) {
    this.unloadingSequence = unloadingSequence;
  }


  public BinPackingOptions stackingOptions(StackingOptions stackingOptions) {
    this.stackingOptions = stackingOptions;
    return this;
  }

   /**
   * Get stackingOptions
   * @return stackingOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STACKING_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StackingOptions getStackingOptions() {
    return stackingOptions;
  }


  @JsonProperty(JSON_PROPERTY_STACKING_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStackingOptions(StackingOptions stackingOptions) {
    this.stackingOptions = stackingOptions;
  }


  /**
   * Return true if this BinPackingOptions object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BinPackingOptions binPackingOptions = (BinPackingOptions) o;
    return Objects.equals(this.unloadingSequence, binPackingOptions.unloadingSequence) &&
        Objects.equals(this.stackingOptions, binPackingOptions.stackingOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unloadingSequence, stackingOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BinPackingOptions {\n");
    sb.append("    unloadingSequence: ").append(toIndentedString(unloadingSequence)).append("\n");
    sb.append("    stackingOptions: ").append(toIndentedString(stackingOptions)).append("\n");
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

