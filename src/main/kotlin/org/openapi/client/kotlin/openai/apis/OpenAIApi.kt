package org.openapi.client.kotlin.openai.apis

import org.openapi.client.kotlin.openai.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import com.squareup.moshi.Json

import org.openapi.client.kotlin.openai.models.CreateAnswerRequest
import org.openapi.client.kotlin.openai.models.CreateAnswerResponse
import org.openapi.client.kotlin.openai.models.CreateClassificationRequest
import org.openapi.client.kotlin.openai.models.CreateClassificationResponse
import org.openapi.client.kotlin.openai.models.CreateCompletionRequest
import org.openapi.client.kotlin.openai.models.CreateCompletionResponse
import org.openapi.client.kotlin.openai.models.CreateEditRequest
import org.openapi.client.kotlin.openai.models.CreateEditResponse
import org.openapi.client.kotlin.openai.models.CreateEmbeddingRequest
import org.openapi.client.kotlin.openai.models.CreateEmbeddingResponse
import org.openapi.client.kotlin.openai.models.CreateFineTuneRequest
import org.openapi.client.kotlin.openai.models.CreateImageRequest
import org.openapi.client.kotlin.openai.models.CreateModerationRequest
import org.openapi.client.kotlin.openai.models.CreateModerationResponse
import org.openapi.client.kotlin.openai.models.CreateSearchRequest
import org.openapi.client.kotlin.openai.models.CreateSearchResponse
import org.openapi.client.kotlin.openai.models.DeleteFileResponse
import org.openapi.client.kotlin.openai.models.DeleteModelResponse
import org.openapi.client.kotlin.openai.models.Engine
import org.openapi.client.kotlin.openai.models.FineTune
import org.openapi.client.kotlin.openai.models.ImagesResponse
import org.openapi.client.kotlin.openai.models.ListEnginesResponse
import org.openapi.client.kotlin.openai.models.ListFilesResponse
import org.openapi.client.kotlin.openai.models.ListFineTuneEventsResponse
import org.openapi.client.kotlin.openai.models.ListFineTunesResponse
import org.openapi.client.kotlin.openai.models.ListModelsResponse
import org.openapi.client.kotlin.openai.models.Model
import org.openapi.client.kotlin.openai.models.OpenAIFile

import okhttp3.MultipartBody

interface OpenAIApi {
    /**
     * Immediately cancel a fine-tune job. 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param fineTuneId The ID of the fine-tune job to cancel 
     * @return [FineTune]
     */
    @POST("fine-tunes/{fine_tune_id}/cancel")
    suspend fun cancelFineTune(@Path("fine_tune_id") fineTuneId: kotlin.String): Response<FineTune>

    /**
     * Answers the specified question using the provided documents and examples.  The endpoint first [searches](/docs/api-reference/searches) over provided documents or files to find relevant context. The relevant context is combined with the provided examples and question to create the prompt for [completion](/docs/api-reference/completions). 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param createAnswerRequest 
     * @return [CreateAnswerResponse]
     */
    @Deprecated("This api was deprecated")
    @POST("answers")
    suspend fun createAnswer(@Body createAnswerRequest: CreateAnswerRequest): Response<CreateAnswerResponse>

    /**
     * Classifies the specified &#x60;query&#x60; using provided examples.  The endpoint first [searches](/docs/api-reference/searches) over the labeled examples to select the ones most relevant for the particular query. Then, the relevant examples are combined with the query to construct a prompt to produce the final label via the [completions](/docs/api-reference/completions) endpoint.  Labeled examples can be provided via an uploaded &#x60;file&#x60;, or explicitly listed in the request using the &#x60;examples&#x60; parameter for quick tests and small scale use cases. 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param createClassificationRequest 
     * @return [CreateClassificationResponse]
     */
    @Deprecated("This api was deprecated")
    @POST("classifications")
    suspend fun createClassification(@Body createClassificationRequest: CreateClassificationRequest): Response<CreateClassificationResponse>

    /**
     * Creates a completion for the provided prompt and parameters
     * 
     * Responses:
     *  - 200: OK
     *
     * @param createCompletionRequest 
     * @return [CreateCompletionResponse]
     */
    @POST("completions")
    suspend fun createCompletion(@Body createCompletionRequest: CreateCompletionRequest): Response<CreateCompletionResponse>

    /**
     * Creates a new edit for the provided input, instruction, and parameters
     * 
     * Responses:
     *  - 200: OK
     *
     * @param createEditRequest 
     * @return [CreateEditResponse]
     */
    @POST("edits")
    suspend fun createEdit(@Body createEditRequest: CreateEditRequest): Response<CreateEditResponse>

    /**
     * Creates an embedding vector representing the input text.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param createEmbeddingRequest 
     * @return [CreateEmbeddingResponse]
     */
    @POST("embeddings")
    suspend fun createEmbedding(@Body createEmbeddingRequest: CreateEmbeddingRequest): Response<CreateEmbeddingResponse>

    /**
     * Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param file Name of the [JSON Lines](https://jsonlines.readthedocs.io/en/latest/) file to be uploaded.  If the &#x60;purpose&#x60; is set to \\\&quot;fine-tune\\\&quot;, each line is a JSON record with \\\&quot;prompt\\\&quot; and \\\&quot;completion\\\&quot; fields representing your [training examples](/docs/guides/fine-tuning/prepare-training-data). 
     * @param purpose The intended purpose of the uploaded documents.  Use \\\&quot;fine-tune\\\&quot; for [Fine-tuning](/docs/api-reference/fine-tunes). This allows us to validate the format of the uploaded file. 
     * @return [OpenAIFile]
     */
    @Multipart
    @POST("files")
    suspend fun createFile(@Part file: MultipartBody.Part, @Part("purpose") purpose: kotlin.String): Response<OpenAIFile>

    /**
     * Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param createFineTuneRequest 
     * @return [FineTune]
     */
    @POST("fine-tunes")
    suspend fun createFineTune(@Body createFineTuneRequest: CreateFineTuneRequest): Response<FineTune>

    /**
     * Creates an image given a prompt.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param createImageRequest 
     * @return [ImagesResponse]
     */
    @POST("images/generations")
    suspend fun createImage(@Body createImageRequest: CreateImageRequest): Response<ImagesResponse>


    /**
    * enum for parameter size
    */
    enum class PropertySize_createImageEdit(val value: kotlin.String) {
        @Json(name = "256x256") _256x256("256x256"),
        @Json(name = "512x512") _512x512("512x512"),
        @Json(name = "1024x1024") _1024x1024("1024x1024")
    }


    /**
    * enum for parameter responseFormat
    */
    enum class ResponseFormat_createImageEdit(val value: kotlin.String) {
        @Json(name = "url") url("url"),
        @Json(name = "b64_json") b64Json("b64_json")
    }

    /**
     * Creates an edited or extended image given an original image and a prompt.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param image The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask.
     * @param prompt A text description of the desired image(s). The maximum length is 1000 characters.
     * @param mask An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where &#x60;image&#x60; should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as &#x60;image&#x60;. (optional)
     * @param n The number of images to generate. Must be between 1 and 10. (optional, default to 1)
     * @param size The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. (optional, default to 1024x1024)
     * @param responseFormat The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. (optional, default to url)
     * @param user A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  (optional)
     * @return [ImagesResponse]
     */
    @Multipart
    @POST("images/edits")
    suspend fun createImageEdit(@Part image: MultipartBody.Part, @Part("prompt") prompt: kotlin.String, @Part mask: MultipartBody.Part? = null, @Part("n") n: kotlin.Int? = 1, @Part("size") size: CreateImageRequest.PropertySize? = CreateImageRequest.PropertySize._1024x1024, @Part("response_format") responseFormat: CreateImageRequest.ResponseFormat? = CreateImageRequest.ResponseFormat.url, @Part("user") user: kotlin.String? = null): Response<ImagesResponse>


    /**
    * enum for parameter size
    */
    enum class PropertySize_createImageVariation(val value: kotlin.String) {
        @Json(name = "256x256") _256x256("256x256"),
        @Json(name = "512x512") _512x512("512x512"),
        @Json(name = "1024x1024") _1024x1024("1024x1024")
    }


    /**
    * enum for parameter responseFormat
    */
    enum class ResponseFormat_createImageVariation(val value: kotlin.String) {
        @Json(name = "url") url("url"),
        @Json(name = "b64_json") b64Json("b64_json")
    }

    /**
     * Creates a variation of a given image.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param image The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square.
     * @param n The number of images to generate. Must be between 1 and 10. (optional, default to 1)
     * @param size The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. (optional, default to 1024x1024)
     * @param responseFormat The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. (optional, default to url)
     * @param user A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  (optional)
     * @return [ImagesResponse]
     */
    @Multipart
    @POST("images/variations")
    suspend fun createImageVariation(@Part image: MultipartBody.Part, @Part("n") n: kotlin.Int? = 1, @Part("size") size: CreateImageRequest.PropertySize? = CreateImageRequest.PropertySize._1024x1024, @Part("response_format") responseFormat: CreateImageRequest.ResponseFormat? = CreateImageRequest.ResponseFormat.url, @Part("user") user: kotlin.String? = null): Response<ImagesResponse>

    /**
     * Classifies if text violates OpenAI&#39;s Content Policy
     * 
     * Responses:
     *  - 200: OK
     *
     * @param createModerationRequest 
     * @return [CreateModerationResponse]
     */
    @POST("moderations")
    suspend fun createModeration(@Body createModerationRequest: CreateModerationRequest): Response<CreateModerationResponse>

    /**
     * The search endpoint computes similarity scores between provided query and documents. Documents can be passed directly to the API if there are no more than 200 of them.  To go beyond the 200 document limit, documents can be processed offline and then used for efficient retrieval at query time. When &#x60;file&#x60; is set, the search endpoint searches over all the documents in the given file and returns up to the &#x60;max_rerank&#x60; number of documents. These documents will be returned along with their search scores.  The similarity score is a positive score that usually ranges from 0 to 300 (but can sometimes go higher), where a score above 200 usually means the document is semantically similar to the query. 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param engineId The ID of the engine to use for this request.  You can select one of &#x60;ada&#x60;, &#x60;babbage&#x60;, &#x60;curie&#x60;, or &#x60;davinci&#x60;.
     * @param createSearchRequest 
     * @return [CreateSearchResponse]
     */
    @Deprecated("This api was deprecated")
    @POST("engines/{engine_id}/search")
    suspend fun createSearch(@Path("engine_id") engineId: kotlin.String, @Body createSearchRequest: CreateSearchRequest): Response<CreateSearchResponse>

    /**
     * Delete a file.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param fileId The ID of the file to use for this request
     * @return [DeleteFileResponse]
     */
    @DELETE("files/{file_id}")
    suspend fun deleteFile(@Path("file_id") fileId: kotlin.String): Response<DeleteFileResponse>

    /**
     * Delete a fine-tuned model. You must have the Owner role in your organization.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param model The model to delete
     * @return [DeleteModelResponse]
     */
    @DELETE("models/{model}")
    suspend fun deleteModel(@Path("model") model: kotlin.String): Response<DeleteModelResponse>

    /**
     * Returns the contents of the specified file
     * 
     * Responses:
     *  - 200: OK
     *
     * @param fileId The ID of the file to use for this request
     * @return [kotlin.String]
     */
    @GET("files/{file_id}/content")
    suspend fun downloadFile(@Path("file_id") fileId: kotlin.String): Response<kotlin.String>

    /**
     * Lists the currently available (non-finetuned) models, and provides basic information about each one such as the owner and availability.
     * 
     * Responses:
     *  - 200: OK
     *
     * @return [ListEnginesResponse]
     */
    @Deprecated("This api was deprecated")
    @GET("engines")
    suspend fun listEngines(): Response<ListEnginesResponse>

    /**
     * Returns a list of files that belong to the user&#39;s organization.
     * 
     * Responses:
     *  - 200: OK
     *
     * @return [ListFilesResponse]
     */
    @GET("files")
    suspend fun listFiles(): Response<ListFilesResponse>

    /**
     * Get fine-grained status updates for a fine-tune job. 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param fineTuneId The ID of the fine-tune job to get events for. 
     * @param stream Whether to stream events for the fine-tune job. If set to true, events will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available. The stream will terminate with a &#x60;data: [DONE]&#x60; message when the job is finished (succeeded, cancelled, or failed).  If set to false, only events generated so far will be returned.  (optional, default to false)
     * @return [ListFineTuneEventsResponse]
     */
    @GET("fine-tunes/{fine_tune_id}/events")
    suspend fun listFineTuneEvents(@Path("fine_tune_id") fineTuneId: kotlin.String, @Query("stream") stream: kotlin.Boolean? = false): Response<ListFineTuneEventsResponse>

    /**
     * List your organization&#39;s fine-tuning jobs 
     * 
     * Responses:
     *  - 200: OK
     *
     * @return [ListFineTunesResponse]
     */
    @GET("fine-tunes")
    suspend fun listFineTunes(): Response<ListFineTunesResponse>

    /**
     * Lists the currently available models, and provides basic information about each one such as the owner and availability.
     * 
     * Responses:
     *  - 200: OK
     *
     * @return [ListModelsResponse]
     */
    @GET("models")
    suspend fun listModels(): Response<ListModelsResponse>

    /**
     * Retrieves a model instance, providing basic information about it such as the owner and availability.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param engineId The ID of the engine to use for this request 
     * @return [Engine]
     */
    @Deprecated("This api was deprecated")
    @GET("engines/{engine_id}")
    suspend fun retrieveEngine(@Path("engine_id") engineId: kotlin.String): Response<Engine>

    /**
     * Returns information about a specific file.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param fileId The ID of the file to use for this request
     * @return [OpenAIFile]
     */
    @GET("files/{file_id}")
    suspend fun retrieveFile(@Path("file_id") fileId: kotlin.String): Response<OpenAIFile>

    /**
     * Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
     * 
     * Responses:
     *  - 200: OK
     *
     * @param fineTuneId The ID of the fine-tune job 
     * @return [FineTune]
     */
    @GET("fine-tunes/{fine_tune_id}")
    suspend fun retrieveFineTune(@Path("fine_tune_id") fineTuneId: kotlin.String): Response<FineTune>

    /**
     * Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
     * 
     * Responses:
     *  - 200: OK
     *
     * @param model The ID of the model to use for this request
     * @return [Model]
     */
    @GET("models/{model}")
    suspend fun retrieveModel(@Path("model") model: kotlin.String): Response<Model>

}
