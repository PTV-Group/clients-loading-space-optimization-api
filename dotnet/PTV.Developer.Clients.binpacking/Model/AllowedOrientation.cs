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
    /// Defines AllowedOrientation
    /// </summary>
    
    [JsonConverter(typeof(StringEnumConverter))]
    
    public enum AllowedOrientation
    {
        /// <summary>
        /// Enum ORIGINAL for value: ORIGINAL
        /// </summary>
        [EnumMember(Value = "ORIGINAL")]
        ORIGINAL = 1,

        /// <summary>
        /// Enum X for value: X
        /// </summary>
        [EnumMember(Value = "X")]
        X = 2,

        /// <summary>
        /// Enum Y for value: Y
        /// </summary>
        [EnumMember(Value = "Y")]
        Y = 3,

        /// <summary>
        /// Enum Z for value: Z
        /// </summary>
        [EnumMember(Value = "Z")]
        Z = 4,

        /// <summary>
        /// Enum XZ for value: XZ
        /// </summary>
        [EnumMember(Value = "XZ")]
        XZ = 5,

        /// <summary>
        /// Enum YZ for value: YZ
        /// </summary>
        [EnumMember(Value = "YZ")]
        YZ = 6

    }

}