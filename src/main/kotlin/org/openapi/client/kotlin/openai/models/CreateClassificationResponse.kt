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
 * @param model 
 * @param searchModel 
 * @param completion 
 * @param label 
 * @param selectedExamples 
 */


data class CreateClassificationResponse (

    @Json(name = "object")
    val `object`: kotlin.String? = null,

    @Json(name = "model")
    val model: kotlin.String? = null,

    @Json(name = "search_model")
    val searchModel: kotlin.String? = null,

    @Json(name = "completion")
    val completion: kotlin.String? = null,

    @Json(name = "label")
    val label: kotlin.String? = null,

    @Json(name = "selected_examples")
    val selectedExamples: kotlin.collections.List<CreateClassificationResponseSelectedExamplesInner>? = null

)

