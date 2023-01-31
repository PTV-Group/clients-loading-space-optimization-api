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
import com.ptvgroup.developer.client.binpacking.model.StackingRestrictions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.ptvgroup.developer.client.binpacking.JSON;


/**
 * Defines all stacking options to be considered during the packing algorithm.
 */
@ApiModel(description = "Defines all stacking options to be considered during the packing algorithm.")
@JsonPropertyOrder({
  StackingOptions.JSON_PROPERTY_STACKING_RESTRICTIONS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-31T14:52:57.911967Z[Etc/UTC]")
public class StackingOptions {
  public static final String JSON_PROPERTY_STACKING_RESTRICTIONS = "stackingRestrictions";
  private List<StackingRestrictions> stackingRestrictions = null;


  public StackingOptions stackingRestrictions(List<StackingRestrictions> stackingRestrictions) {
    this.stackingRestrictions = stackingRestrictions;
    return this;
  }

  public StackingOptions addStackingRestrictionsItem(StackingRestrictions stackingRestrictionsItem) {
    if (this.stackingRestrictions == null) {
      this.stackingRestrictions = new ArrayList<>();
    }
    this.stackingRestrictions.add(stackingRestrictionsItem);
    return this;
  }

   /**
   * Defines all the stacking restrictions between items.
   * @return stackingRestrictions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Defines all the stacking restrictions between items.")
  @JsonProperty(JSON_PROPERTY_STACKING_RESTRICTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<StackingRestrictions> getStackingRestrictions() {
    return stackingRestrictions;
  }


  public void setStackingRestrictions(List<StackingRestrictions> stackingRestrictions) {
    this.stackingRestrictions = stackingRestrictions;
  }


  /**
   * Return true if this StackingOptions object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StackingOptions stackingOptions = (StackingOptions) o;
    return Objects.equals(this.stackingRestrictions, stackingOptions.stackingRestrictions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stackingRestrictions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StackingOptions {\n");
    sb.append("    stackingRestrictions: ").append(toIndentedString(stackingRestrictions)).append("\n");
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

