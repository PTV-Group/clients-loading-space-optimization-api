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
import type { BoxDimensions } from './BoxDimensions';
import {
    BoxDimensionsFromJSON,
    BoxDimensionsFromJSONTyped,
    BoxDimensionsToJSON,
} from './BoxDimensions';
import type { ItemOrientation } from './ItemOrientation';
import {
    ItemOrientationFromJSON,
    ItemOrientationFromJSONTyped,
    ItemOrientationToJSON,
} from './ItemOrientation';
import type { ItemPosition } from './ItemPosition';
import {
    ItemPositionFromJSON,
    ItemPositionFromJSONTyped,
    ItemPositionToJSON,
} from './ItemPosition';

/**
 * Describes how an item is packed into the bin. If Item.numberOfInstances is greater than one, several of this item are packed into the bin.
 * @export
 * @interface PackedItem
 */
export interface PackedItem {
    /**
     * ID of the item.
     * @type {string}
     * @memberof PackedItem
     */
    itemId: string;
    /**
     * 
     * @type {ItemPosition}
     * @memberof PackedItem
     */
    position: ItemPosition;
    /**
     * 
     * @type {BoxDimensions}
     * @memberof PackedItem
     */
    dimensions: BoxDimensions;
    /**
     * 
     * @type {ItemOrientation}
     * @memberof PackedItem
     */
    orientation: ItemOrientation;
}

/**
 * Check if a given object implements the PackedItem interface.
 */
export function instanceOfPackedItem(value: object): boolean {
    let isInstance = true;
    isInstance = isInstance && "itemId" in value;
    isInstance = isInstance && "position" in value;
    isInstance = isInstance && "dimensions" in value;
    isInstance = isInstance && "orientation" in value;

    return isInstance;
}

export function PackedItemFromJSON(json: any): PackedItem {
    return PackedItemFromJSONTyped(json, false);
}

export function PackedItemFromJSONTyped(json: any, ignoreDiscriminator: boolean): PackedItem {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'itemId': json['itemId'],
        'position': ItemPositionFromJSON(json['position']),
        'dimensions': BoxDimensionsFromJSON(json['dimensions']),
        'orientation': ItemOrientationFromJSON(json['orientation']),
    };
}

export function PackedItemToJSON(value?: PackedItem | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'itemId': value.itemId,
        'position': ItemPositionToJSON(value.position),
        'dimensions': BoxDimensionsToJSON(value.dimensions),
        'orientation': ItemOrientationToJSON(value.orientation),
    };
}

