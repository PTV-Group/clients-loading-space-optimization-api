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

/**
 * Defines the stacking restrictions:
 * * `ALL_ALLOWED` - All items can be stacked on top of this item.
 * * `ALL_PROHIBITED` - No further item may be stacked on top of this item.
 * * `ALLOWED` - Every listed items can be stacked on top of this item.
 * * `PROHIBITED` - None of the listed items may be stacked on top of this item.
 * @export
 * @enum {string}
 */
export enum StackingRestrictionType {
    ALL_ALLOWED = 'ALL_ALLOWED',
    ALL_PROHIBITED = 'ALL_PROHIBITED',
    ALLOWED = 'ALLOWED',
    PROHIBITED = 'PROHIBITED'
}

export function StackingRestrictionTypeFromJSON(json: any): StackingRestrictionType {
    return StackingRestrictionTypeFromJSONTyped(json, false);
}

export function StackingRestrictionTypeFromJSONTyped(json: any, ignoreDiscriminator: boolean): StackingRestrictionType {
    return json as StackingRestrictionType;
}

export function StackingRestrictionTypeToJSON(value?: StackingRestrictionType | null): any {
    return value as any;
}
