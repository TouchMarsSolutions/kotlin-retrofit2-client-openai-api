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

import org.openapi.client.kotlin.openai.models.CreateChatCompletionResponseChoicesInner
import org.openapi.client.kotlin.openai.models.CreateCompletionResponseUsage

import com.squareup.moshi.Json

/**
 * 
 *
 * @param id 
 * @param `object` 
 * @param created 
 * @param model 
 * @param choices 
 * @param usage 
 */


data class CreateChatCompletionResponse (

    @Json(name = "id")
    val id: kotlin.String,

    @Json(name = "object")
    val `object`: kotlin.String,

    @Json(name = "created")
    val created: kotlin.Int,

    @Json(name = "model")
    val model: kotlin.String,

    @Json(name = "choices")
    val choices: List<CreateChatCompletionResponseChoicesInner>,

    @Json(name = "usage")
    val usage: CreateCompletionResponseUsage? = null

)
