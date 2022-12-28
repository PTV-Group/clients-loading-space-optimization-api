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
    StackingOptions,
    StackingOptionsFromJSON,
    StackingOptionsFromJSONTyped,
    StackingOptionsToJSON,
    Stop,
    StopFromJSON,
    StopFromJSONTyped,
    StopToJSON,
} from './';

/**
 * Allows customization of the bin packing operation.
 * @export
 * @interface BinPackingOptions
 */
export interface BinPackingOptions {
    /**
     * Specifies the sequence of items or group of items to be unloaded. The first element of this sequence will be unloaded first (and loaded last). Please note that this option can only be used the case a single bin is defined.
     * @type {Array<Stop>}
     * @memberof BinPackingOptions
     */
    unloadingSequence?: Array<Stop>;
    /**
     * 
     * @type {StackingOptions}
     * @memberof BinPackingOptions
     */
    stackingOptions?: StackingOptions;
}

export function BinPackingOptionsFromJSON(json: any): BinPackingOptions {
    return BinPackingOptionsFromJSONTyped(json, false);
}

export function BinPackingOptionsFromJSONTyped(json: any, ignoreDiscriminator: boolean): BinPackingOptions {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'unloadingSequence': !exists(json, 'unloadingSequence') ? undefined : ((json['unloadingSequence'] as Array<any>).map(StopFromJSON)),
        'stackingOptions': !exists(json, 'stackingOptions') ? undefined : StackingOptionsFromJSON(json['stackingOptions']),
    };
}

export function BinPackingOptionsToJSON(value?: BinPackingOptions | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'unloadingSequence': value.unloadingSequence === undefined ? undefined : ((value.unloadingSequence as Array<any>).map(StopToJSON)),
        'stackingOptions': StackingOptionsToJSON(value.stackingOptions),
    };
}


