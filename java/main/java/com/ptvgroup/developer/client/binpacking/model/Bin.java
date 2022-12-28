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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.ptvgroup.developer.client.binpacking.JSON;


/**
 * Bin
 */
@JsonPropertyOrder({
  Bin.JSON_PROPERTY_ID,
  Bin.JSON_PROPERTY_NUMBER_OF_INSTANCES,
  Bin.JSON_PROPERTY_DIMENSIONS,
  Bin.JSON_PROPERTY_MAXIMUM_VOLUME_CAPACITY,
  Bin.JSON_PROPERTY_MAXIMUM_WEIGHT_CAPACITY
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-28T11:25:19.033913Z[Etc/UTC]")
public class Bin {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NUMBER_OF_INSTANCES = "numberOfInstances";
  private Integer numberOfInstances = 1;

  public static final String JSON_PROPERTY_DIMENSIONS = "dimensions";
  private BoxDimensions dimensions;

  public static final String JSON_PROPERTY_MAXIMUM_VOLUME_CAPACITY = "maximumVolumeCapacity";
  private Integer maximumVolumeCapacity;

  public static final String JSON_PROPERTY_MAXIMUM_WEIGHT_CAPACITY = "maximumWeightCapacity";
  private Integer maximumWeightCapacity;


  public Bin id(String id) {
    this.id = id;
    return this;
  }

   /**
   * User provided ID for this bin. Must be unique.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "User provided ID for this bin. Must be unique.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Bin numberOfInstances(Integer numberOfInstances) {
    this.numberOfInstances = numberOfInstances;
    return this;
  }

   /**
   * Number of instances of this bin available for packing.
   * minimum: 1
   * maximum: 1000
   * @return numberOfInstances
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of instances of this bin available for packing.")
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_INSTANCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumberOfInstances() {
    return numberOfInstances;
  }


  public void setNumberOfInstances(Integer numberOfInstances) {
    this.numberOfInstances = numberOfInstances;
  }


  public Bin dimensions(BoxDimensions dimensions) {
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


  public Bin maximumVolumeCapacity(Integer maximumVolumeCapacity) {
    this.maximumVolumeCapacity = maximumVolumeCapacity;
    return this;
  }

   /**
   * Maximum accumulated volume of items that can be packed into a single bin irrespective of bin dimensions in [cm³]. This value must never exceed the natural inner volume specified by dimensions. If not given, defaults to the natural inner volume specified by dimensions.
   * minimum: 0
   * @return maximumVolumeCapacity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Maximum accumulated volume of items that can be packed into a single bin irrespective of bin dimensions in [cm³]. This value must never exceed the natural inner volume specified by dimensions. If not given, defaults to the natural inner volume specified by dimensions.")
  @JsonProperty(JSON_PROPERTY_MAXIMUM_VOLUME_CAPACITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaximumVolumeCapacity() {
    return maximumVolumeCapacity;
  }


  public void setMaximumVolumeCapacity(Integer maximumVolumeCapacity) {
    this.maximumVolumeCapacity = maximumVolumeCapacity;
  }


  public Bin maximumWeightCapacity(Integer maximumWeightCapacity) {
    this.maximumWeightCapacity = maximumWeightCapacity;
    return this;
  }

   /**
   * Maximum accumulated weight of items that can be packed into a single bin in [g]. If not given the weight capacity is assumed to be the maximum value.
   * minimum: 0
   * maximum: 80000000
   * @return maximumWeightCapacity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Maximum accumulated weight of items that can be packed into a single bin in [g]. If not given the weight capacity is assumed to be the maximum value.")
  @JsonProperty(JSON_PROPERTY_MAXIMUM_WEIGHT_CAPACITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaximumWeightCapacity() {
    return maximumWeightCapacity;
  }


  public void setMaximumWeightCapacity(Integer maximumWeightCapacity) {
    this.maximumWeightCapacity = maximumWeightCapacity;
  }


  /**
   * Return true if this Bin object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Bin bin = (Bin) o;
    return Objects.equals(this.id, bin.id) &&
        Objects.equals(this.numberOfInstances, bin.numberOfInstances) &&
        Objects.equals(this.dimensions, bin.dimensions) &&
        Objects.equals(this.maximumVolumeCapacity, bin.maximumVolumeCapacity) &&
        Objects.equals(this.maximumWeightCapacity, bin.maximumWeightCapacity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, numberOfInstances, dimensions, maximumVolumeCapacity, maximumWeightCapacity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Bin {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    numberOfInstances: ").append(toIndentedString(numberOfInstances)).append("\n");
    sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
    sb.append("    maximumVolumeCapacity: ").append(toIndentedString(maximumVolumeCapacity)).append("\n");
    sb.append("    maximumWeightCapacity: ").append(toIndentedString(maximumWeightCapacity)).append("\n");
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
