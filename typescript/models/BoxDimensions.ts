/* tslint:disable */
/* eslint-disable */
/**
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

import { exists, mapValues } from '../runtime';
/**
 * Size of an item or bin.
 * @export
 * @interface BoxDimensions
 */
export interface BoxDimensions {
    /**
     * Extent along x-axis (width) in [cm].
     * @type {number}
     * @memberof BoxDimensions
     */
    x: number;
    /**
     * Extent along y-axis (height) in [cm].
     * @type {number}
     * @memberof BoxDimensions
     */
    y: number;
    /**
     * Extent along z-axis (length) in [cm].
     * @type {number}
     * @memberof BoxDimensions
     */
    z: number;
}

export function BoxDimensionsFromJSON(json: any): BoxDimensions {
    return BoxDimensionsFromJSONTyped(json, false);
}

export function BoxDimensionsFromJSONTyped(json: any, ignoreDiscriminator: boolean): BoxDimensions {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'x': json['x'],
        'y': json['y'],
        'z': json['z'],
    };
}

export function BoxDimensionsToJSON(value?: BoxDimensions | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'x': value.x,
        'y': value.y,
        'z': value.z,
    };
}


