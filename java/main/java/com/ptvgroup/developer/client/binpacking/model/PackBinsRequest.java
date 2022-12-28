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
import com.ptvgroup.developer.client.binpacking.model.Bin;
import com.ptvgroup.developer.client.binpacking.model.BinPackingOptions;
import com.ptvgroup.developer.client.binpacking.model.Item;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.ptvgroup.developer.client.binpacking.JSON;


/**
 * PackBinsRequest
 */
@JsonPropertyOrder({
  PackBinsRequest.JSON_PROPERTY_ITEMS,
  PackBinsRequest.JSON_PROPERTY_BINS,
  PackBinsRequest.JSON_PROPERTY_OPTIONS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-28T11:25:19.033913Z[Etc/UTC]")
public class PackBinsRequest {
  public static final String JSON_PROPERTY_ITEMS = "items";
  private List<Item> items = new ArrayList<>();

  public static final String JSON_PROPERTY_BINS = "bins";
  private List<Bin> bins = new ArrayList<>();

  public static final String JSON_PROPERTY_OPTIONS = "options";
  private BinPackingOptions options;


  public PackBinsRequest items(List<Item> items) {
    this.items = items;
    return this;
  }

  public PackBinsRequest addItemsItem(Item itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<Item> getItems() {
    return items;
  }


  public void setItems(List<Item> items) {
    this.items = items;
  }


  public PackBinsRequest bins(List<Bin> bins) {
    this.bins = bins;
    return this;
  }

  public PackBinsRequest addBinsItem(Bin binsItem) {
    this.bins.add(binsItem);
    return this;
  }

   /**
   * Get bins
   * @return bins
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_BINS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<Bin> getBins() {
    return bins;
  }


  public void setBins(List<Bin> bins) {
    this.bins = bins;
  }


  public PackBinsRequest options(BinPackingOptions options) {
    this.options = options;
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BinPackingOptions getOptions() {
    return options;
  }


  public void setOptions(BinPackingOptions options) {
    this.options = options;
  }


  /**
   * Return true if this PackBinsRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PackBinsRequest packBinsRequest = (PackBinsRequest) o;
    return Objects.equals(this.items, packBinsRequest.items) &&
        Objects.equals(this.bins, packBinsRequest.bins) &&
        Objects.equals(this.options, packBinsRequest.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, bins, options);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PackBinsRequest {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    bins: ").append(toIndentedString(bins)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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
