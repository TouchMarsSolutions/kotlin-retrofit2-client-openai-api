/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapi.client.kotlin.openai.models

import org.openapi.client.kotlin.openai.models.Model

import com.squareup.moshi.Json

/**
 * 
 *
 * @param `object` 
 * @param `data` 
 */


data class ListModelsResponse (

    @Json(name = "object")
    val `object`: kotlin.String,

    @Json(name = "data")
    val `data`: kotlin.collections.List<Model>

)

