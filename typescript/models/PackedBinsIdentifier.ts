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
 * 
 * @export
 * @interface PackedBinsIdentifier
 */
export interface PackedBinsIdentifier {
    /**
     * The ID of the packed bins.
     * @type {string}
     * @memberof PackedBinsIdentifier
     */
    id: string;
}

export function PackedBinsIdentifierFromJSON(json: any): PackedBinsIdentifier {
    return PackedBinsIdentifierFromJSONTyped(json, false);
}

export function PackedBinsIdentifierFromJSONTyped(json: any, ignoreDiscriminator: boolean): PackedBinsIdentifier {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'id': json['id'],
    };
}

export function PackedBinsIdentifierToJSON(value?: PackedBinsIdentifier | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'id': value.id,
    };
}

