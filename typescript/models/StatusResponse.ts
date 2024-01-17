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
import type { CalculationStatus } from './CalculationStatus';
import {
    CalculationStatusFromJSON,
    CalculationStatusFromJSONTyped,
    CalculationStatusToJSON,
} from './CalculationStatus';

/**
 * Describes the status of a bin packing operation.
 * @export
 * @interface StatusResponse
 */
export interface StatusResponse {
    /**
     * 
     * @type {CalculationStatus}
     * @memberof StatusResponse
     */
    status?: CalculationStatus;
}

/**
 * Check if a given object implements the StatusResponse interface.
 */
export function instanceOfStatusResponse(value: object): boolean {
    let isInstance = true;

    return isInstance;
}

export function StatusResponseFromJSON(json: any): StatusResponse {
    return StatusResponseFromJSONTyped(json, false);
}

export function StatusResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): StatusResponse {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'status': !exists(json, 'status') ? undefined : CalculationStatusFromJSON(json['status']),
    };
}

export function StatusResponseToJSON(value?: StatusResponse | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'status': CalculationStatusToJSON(value.status),
    };
}

