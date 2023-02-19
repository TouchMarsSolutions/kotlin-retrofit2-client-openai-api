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
 * @param id 
 * @param `object` 
 * @param createdAt 
 * @param updatedAt 
 * @param model 
 * @param fineTunedModel 
 * @param organizationId 
 * @param status 
 * @param hyperparams 
 * @param trainingFiles 
 * @param validationFiles 
 * @param resultFiles 
 * @param events 
 */


data class FineTune (

    @Json(name = "id")
    val id: kotlin.String,

    @Json(name = "object")
    val `object`: kotlin.String,

    @Json(name = "created_at")
    val createdAt: kotlin.Int,

    @Json(name = "updated_at")
    val updatedAt: kotlin.Int,

    @Json(name = "model")
    val model: kotlin.String,

    @Json(name = "fine_tuned_model")
    val fineTunedModel: kotlin.String?,

    @Json(name = "organization_id")
    val organizationId: kotlin.String,

    @Json(name = "status")
    val status: kotlin.String,

    @Json(name = "hyperparams")
    val hyperparams: kotlin.Any,

    @Json(name = "training_files")
    val trainingFiles: kotlin.collections.List<OpenAIFile>,

    @Json(name = "validation_files")
    val validationFiles: kotlin.collections.List<OpenAIFile>,

    @Json(name = "result_files")
    val resultFiles: kotlin.collections.List<OpenAIFile>,

    @Json(name = "events")
    val events: kotlin.collections.List<FineTuneEvent>? = null

)

