/*
 * Loading Optimization
 *
 * With the Bin Packing service you can pack a number of items of various types into a number of bins of various types.
 *
 * The version of the OpenAPI document: 1.0
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
    /// Defines all stacking options to be considered during the packing algorithm.
    /// </summary>
    [DataContract(Name = "StackingOptions")]
    public partial class StackingOptions : IEquatable<StackingOptions>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="StackingOptions" /> class.
        /// </summary>
        /// <param name="stackingRestrictions">Defines all the stacking restrictions between items..</param>
        public StackingOptions(List<StackingRestrictions> stackingRestrictions = default(List<StackingRestrictions>))
        {
            this.StackingRestrictions = stackingRestrictions;
        }

        /// <summary>
        /// Defines all the stacking restrictions between items.
        /// </summary>
        /// <value>Defines all the stacking restrictions between items.</value>
        [DataMember(Name = "stackingRestrictions", EmitDefaultValue = false)]
        public List<StackingRestrictions> StackingRestrictions { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class StackingOptions {\n");
            sb.Append("  StackingRestrictions: ").Append(StackingRestrictions).Append("\n");
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
            return this.Equals(input as StackingOptions);
        }

        /// <summary>
        /// Returns true if StackingOptions instances are equal
        /// </summary>
        /// <param name="input">Instance of StackingOptions to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(StackingOptions input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.StackingRestrictions == input.StackingRestrictions ||
                    this.StackingRestrictions != null &&
                    input.StackingRestrictions != null &&
                    this.StackingRestrictions.SequenceEqual(input.StackingRestrictions)
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
                if (this.StackingRestrictions != null)
                    hashCode = hashCode * 59 + this.StackingRestrictions.GetHashCode();
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
