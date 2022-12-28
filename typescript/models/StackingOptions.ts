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
import {
    StackingRestrictions,
    StackingRestrictionsFromJSON,
    StackingRestrictionsFromJSONTyped,
    StackingRestrictionsToJSON,
} from './';

/**
 * Defines all stacking options to be considered during the packing algorithm.
 * @export
 * @interface StackingOptions
 */
export interface StackingOptions {
    /**
     * Defines all the stacking restrictions between items.
     * @type {Array<StackingRestrictions>}
     * @memberof StackingOptions
     */
    stackingRestrictions?: Array<StackingRestrictions>;
}

export function StackingOptionsFromJSON(json: any): StackingOptions {
    return StackingOptionsFromJSONTyped(json, false);
}

export function StackingOptionsFromJSONTyped(json: any, ignoreDiscriminator: boolean): StackingOptions {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'stackingRestrictions': !exists(json, 'stackingRestrictions') ? undefined : ((json['stackingRestrictions'] as Array<any>).map(StackingRestrictionsFromJSON)),
    };
}

export function StackingOptionsToJSON(value?: StackingOptions | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'stackingRestrictions': value.stackingRestrictions === undefined ? undefined : ((value.stackingRestrictions as Array<any>).map(StackingRestrictionsToJSON)),
    };
}


