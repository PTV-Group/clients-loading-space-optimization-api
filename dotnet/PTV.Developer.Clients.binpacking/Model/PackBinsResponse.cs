/*
 * Loading Optimization
 *
 * With the Bin Packing service you can pack a number of items of various types into a number of bins of various types.
 *
 * The version of the OpenAPI document: 1.1
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = PTV.Developer.Clients.binpacking.Client.OpenAPIDateConverter;

namespace PTV.Developer.Clients.binpacking.Model
{
    /// <summary>
    /// Describes a packing solution.
    /// </summary>
    [DataContract(Name = "PackBinsResponse")]
    public partial class PackBinsResponse : IEquatable<PackBinsResponse>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PackBinsResponse" /> class.
        /// </summary>
        /// <param name="packedBins">List with one entry for each bin that was used for packing items in this solution..</param>
        /// <param name="itemsNotPacked">List of items and its quantities, that could not be processed in this request. .</param>
        public PackBinsResponse(List<PackedBin> packedBins = default(List<PackedBin>), List<ItemNotPacked> itemsNotPacked = default(List<ItemNotPacked>))
        {
            this.PackedBins = packedBins;
            this.ItemsNotPacked = itemsNotPacked;
        }

        /// <summary>
        /// List with one entry for each bin that was used for packing items in this solution.
        /// </summary>
        /// <value>List with one entry for each bin that was used for packing items in this solution.</value>
        [DataMember(Name = "packedBins", EmitDefaultValue = false)]
        public List<PackedBin> PackedBins { get; set; }

        /// <summary>
        /// List of items and its quantities, that could not be processed in this request. 
        /// </summary>
        /// <value>List of items and its quantities, that could not be processed in this request. </value>
        [DataMember(Name = "itemsNotPacked", EmitDefaultValue = false)]
        public List<ItemNotPacked> ItemsNotPacked { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PackBinsResponse {\n");
            sb.Append("  PackedBins: ").Append(PackedBins).Append("\n");
            sb.Append("  ItemsNotPacked: ").Append(ItemsNotPacked).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as PackBinsResponse);
        }

        /// <summary>
        /// Returns true if PackBinsResponse instances are equal
        /// </summary>
        /// <param name="input">Instance of PackBinsResponse to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PackBinsResponse input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.PackedBins == input.PackedBins ||
                    this.PackedBins != null &&
                    input.PackedBins != null &&
                    this.PackedBins.SequenceEqual(input.PackedBins)
                ) && 
                (
                    this.ItemsNotPacked == input.ItemsNotPacked ||
                    this.ItemsNotPacked != null &&
                    input.ItemsNotPacked != null &&
                    this.ItemsNotPacked.SequenceEqual(input.ItemsNotPacked)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.PackedBins != null)
                    hashCode = hashCode * 59 + this.PackedBins.GetHashCode();
                if (this.ItemsNotPacked != null)
                    hashCode = hashCode * 59 + this.ItemsNotPacked.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
