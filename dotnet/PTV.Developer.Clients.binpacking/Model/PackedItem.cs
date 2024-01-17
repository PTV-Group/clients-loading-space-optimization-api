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
    /// Describes how an item is packed into the bin. If Item.numberOfInstances is greater than one, several of this item are packed into the bin. 
    /// </summary>
    [DataContract(Name = "PackedItem")]
    public partial class PackedItem : IEquatable<PackedItem>, IValidatableObject
    {

        /// <summary>
        /// Gets or Sets Orientation
        /// </summary>
        [DataMember(Name = "orientation", IsRequired = true, EmitDefaultValue = true)]
        public ItemOrientation Orientation { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="PackedItem" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected PackedItem() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="PackedItem" /> class.
        /// </summary>
        /// <param name="itemId">ID of the item. (required).</param>
        /// <param name="position">position (required).</param>
        /// <param name="dimensions">dimensions (required).</param>
        /// <param name="orientation">orientation (required).</param>
        public PackedItem(string itemId = default(string), ItemPosition position = default(ItemPosition), BoxDimensions dimensions = default(BoxDimensions), ItemOrientation orientation = default(ItemOrientation))
        {
            // to ensure "itemId" is required (not null)
            if (itemId == null)
            {
                throw new ArgumentNullException("itemId is a required property for PackedItem and cannot be null");
            }
            this.ItemId = itemId;
            // to ensure "position" is required (not null)
            if (position == null)
            {
                throw new ArgumentNullException("position is a required property for PackedItem and cannot be null");
            }
            this.Position = position;
            // to ensure "dimensions" is required (not null)
            if (dimensions == null)
            {
                throw new ArgumentNullException("dimensions is a required property for PackedItem and cannot be null");
            }
            this.Dimensions = dimensions;
            this.Orientation = orientation;
        }

        /// <summary>
        /// ID of the item.
        /// </summary>
        /// <value>ID of the item.</value>
        [DataMember(Name = "itemId", IsRequired = true, EmitDefaultValue = true)]
        public string ItemId { get; set; }

        /// <summary>
        /// Gets or Sets Position
        /// </summary>
        [DataMember(Name = "position", IsRequired = true, EmitDefaultValue = true)]
        public ItemPosition Position { get; set; }

        /// <summary>
        /// Gets or Sets Dimensions
        /// </summary>
        [DataMember(Name = "dimensions", IsRequired = true, EmitDefaultValue = true)]
        public BoxDimensions Dimensions { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class PackedItem {\n");
            sb.Append("  ItemId: ").Append(ItemId).Append("\n");
            sb.Append("  Position: ").Append(Position).Append("\n");
            sb.Append("  Dimensions: ").Append(Dimensions).Append("\n");
            sb.Append("  Orientation: ").Append(Orientation).Append("\n");
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
            return this.Equals(input as PackedItem);
        }

        /// <summary>
        /// Returns true if PackedItem instances are equal
        /// </summary>
        /// <param name="input">Instance of PackedItem to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PackedItem input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.ItemId == input.ItemId ||
                    (this.ItemId != null &&
                    this.ItemId.Equals(input.ItemId))
                ) && 
                (
                    this.Position == input.Position ||
                    (this.Position != null &&
                    this.Position.Equals(input.Position))
                ) && 
                (
                    this.Dimensions == input.Dimensions ||
                    (this.Dimensions != null &&
                    this.Dimensions.Equals(input.Dimensions))
                ) && 
                (
                    this.Orientation == input.Orientation ||
                    this.Orientation.Equals(input.Orientation)
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
                if (this.ItemId != null)
                {
                    hashCode = (hashCode * 59) + this.ItemId.GetHashCode();
                }
                if (this.Position != null)
                {
                    hashCode = (hashCode * 59) + this.Position.GetHashCode();
                }
                if (this.Dimensions != null)
                {
                    hashCode = (hashCode * 59) + this.Dimensions.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Orientation.GetHashCode();
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
