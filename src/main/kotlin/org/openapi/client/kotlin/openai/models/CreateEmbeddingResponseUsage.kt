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
 * @param promptTokens 
 * @param totalTokens 
 */


data class CreateEmbeddingResponseUsage (

    @Json(name = "prompt_tokens")
    val promptTokens: kotlin.Int,

    @Json(name = "total_tokens")
    val totalTokens: kotlin.Int

)

