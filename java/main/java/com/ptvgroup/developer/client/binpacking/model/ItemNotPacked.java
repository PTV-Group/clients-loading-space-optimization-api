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
 * Describes a number of instances of an item that could not be packed into a bin. 
 */
@ApiModel(description = "Describes a number of instances of an item that could not be packed into a bin. ")
@JsonPropertyOrder({
  ItemNotPacked.JSON_PROPERTY_ID,
  ItemNotPacked.JSON_PROPERTY_NUMBER_OF_INSTANCES
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-28T11:25:19.033913Z[Etc/UTC]")
public class ItemNotPacked {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NUMBER_OF_INSTANCES = "numberOfInstances";
  private Integer numberOfInstances;


  public ItemNotPacked id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the item.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The ID of the item.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ItemNotPacked numberOfInstances(Integer numberOfInstances) {
    this.numberOfInstances = numberOfInstances;
    return this;
  }

   /**
   * Number of instances of the item that have not been packed.
   * minimum: 1
   * maximum: 10000
   * @return numberOfInstances
  **/
  @ApiModelProperty(required = true, value = "Number of instances of the item that have not been packed.")
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_INSTANCES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getNumberOfInstances() {
    return numberOfInstances;
  }


  public void setNumberOfInstances(Integer numberOfInstances) {
    this.numberOfInstances = numberOfInstances;
  }


  /**
   * Return true if this ItemNotPacked object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemNotPacked itemNotPacked = (ItemNotPacked) o;
    return Objects.equals(this.id, itemNotPacked.id) &&
        Objects.equals(this.numberOfInstances, itemNotPacked.numberOfInstances);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, numberOfInstances);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemNotPacked {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
