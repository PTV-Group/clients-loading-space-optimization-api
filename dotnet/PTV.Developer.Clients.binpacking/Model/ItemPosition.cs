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
    /// Describes the position of an item in a bin.  The coordinate system is right-handed with x extending to the right, y pointing up and z pointing towards you. In terms of a truck (0,0,0) would be at the lower-left-corner of the opposing wall when looking through the back doors.  An item, for example a palette, placed there would be on the ground. It would also touch the left wall as well as the wall towards the drivers cabin. 
    /// </summary>
    [DataContract(Name = "ItemPosition")]
    public partial class ItemPosition : IEquatable<ItemPosition>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ItemPosition" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ItemPosition() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ItemPosition" /> class.
        /// </summary>
        /// <param name="x">Offset along x-axis in [cm]. Equal to the shift along the width of the bin from left to right. (required).</param>
        /// <param name="y">Offset along y-axis in [cm]. Equal to the height from the floor of the bin. (required).</param>
        /// <param name="z">Offset along z-axis in [cm]. Equal to the shift along the length of the bin from back to front. (required).</param>
        public ItemPosition(int x = default(int), int y = default(int), int z = default(int))
        {
            this.X = x;
            this.Y = y;
            this.Z = z;
        }

        /// <summary>
        /// Offset along x-axis in [cm]. Equal to the shift along the width of the bin from left to right.
        /// </summary>
        /// <value>Offset along x-axis in [cm]. Equal to the shift along the width of the bin from left to right.</value>
        [DataMember(Name = "x", IsRequired = true, EmitDefaultValue = true)]
        public int X { get; set; }

        /// <summary>
        /// Offset along y-axis in [cm]. Equal to the height from the floor of the bin.
        /// </summary>
        /// <value>Offset along y-axis in [cm]. Equal to the height from the floor of the bin.</value>
        [DataMember(Name = "y", IsRequired = true, EmitDefaultValue = true)]
        public int Y { get; set; }

        /// <summary>
        /// Offset along z-axis in [cm]. Equal to the shift along the length of the bin from back to front.
        /// </summary>
        /// <value>Offset along z-axis in [cm]. Equal to the shift along the length of the bin from back to front.</value>
        [DataMember(Name = "z", IsRequired = true, EmitDefaultValue = true)]
        public int Z { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ItemPosition {\n");
            sb.Append("  X: ").Append(X).Append("\n");
            sb.Append("  Y: ").Append(Y).Append("\n");
            sb.Append("  Z: ").Append(Z).Append("\n");
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
            return this.Equals(input as ItemPosition);
        }

        /// <summary>
        /// Returns true if ItemPosition instances are equal
        /// </summary>
        /// <param name="input">Instance of ItemPosition to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ItemPosition input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.X == input.X ||
                    this.X.Equals(input.X)
                ) && 
                (
                    this.Y == input.Y ||
                    this.Y.Equals(input.Y)
                ) && 
                (
                    this.Z == input.Z ||
                    this.Z.Equals(input.Z)
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
                hashCode = (hashCode * 59) + this.X.GetHashCode();
                hashCode = (hashCode * 59) + this.Y.GetHashCode();
                hashCode = (hashCode * 59) + this.Z.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        public IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
