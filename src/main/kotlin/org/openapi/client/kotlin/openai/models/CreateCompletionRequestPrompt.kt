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
 * The prompt(s) to generate completions for, encoded as a string, array of strings, array of tokens, or array of token arrays.  Note that <|endoftext|> is the document separator that the model sees during training, so if a prompt is not specified the model will generate as if from the beginning of a new document. 
 *
 */


data class CreateCompletionRequestPrompt (private val value: Any): ValueOnly {
    init {
        require(value is String || value is Array<*>) {
            "value must be initialized with a String or an Array of Strings"
        }
    }

    override fun getValue(): Any {
        return value
    }
}

