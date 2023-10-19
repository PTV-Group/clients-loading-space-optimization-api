/* tslint:disable */
/* eslint-disable */
/**
 * Loading Optimization
 * With the Bin Packing service you can pack a number of items of various types into a number of bins of various types.
 *
 * The version of the OpenAPI document: 1.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { exists, mapValues } from '../runtime';
/**
 * Describes a number of instances of an item that could not be packed into a bin.
 * @export
 * @interface ItemNotPacked
 */
export interface ItemNotPacked {
    /**
     * The ID of the item.
     * @type {string}
     * @memberof ItemNotPacked
     */
    id: string;
    /**
     * Number of instances of the item that have not been packed.
     * @type {number}
     * @memberof ItemNotPacked
     */
    numberOfInstances: number;
}

export function ItemNotPackedFromJSON(json: any): ItemNotPacked {
    return ItemNotPackedFromJSONTyped(json, false);
}

export function ItemNotPackedFromJSONTyped(json: any, ignoreDiscriminator: boolean): ItemNotPacked {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'id': json['id'],
        'numberOfInstances': json['numberOfInstances'],
    };
}

export function ItemNotPackedToJSON(value?: ItemNotPacked | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'id': value.id,
        'numberOfInstances': value.numberOfInstances,
    };
}


