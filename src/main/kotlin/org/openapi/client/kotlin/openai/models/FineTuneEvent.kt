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


import com.squareup.moshi.Json

/**
 * 
 *
 * @param `object` 
 * @param createdAt 
 * @param level 
 * @param message 
 */


data class FineTuneEvent (

    @Json(name = "object")
    val `object`: kotlin.String,

    @Json(name = "created_at")
    val createdAt: kotlin.Int,

    @Json(name = "level")
    val level: kotlin.String,

    @Json(name = "message")
    val message: kotlin.String

)
