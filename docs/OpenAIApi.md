# OpenAIApi

All URIs are relative to *https://api.openai.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelFineTune**](OpenAIApi.md#cancelFineTune) | **POST** fine-tunes/{fine_tune_id}/cancel | Immediately cancel a fine-tune job. 
[**createAnswer**](OpenAIApi.md#createAnswer) | **POST** answers | Answers the specified question using the provided documents and examples.  The endpoint first [searches](/docs/api-reference/searches) over provided documents or files to find relevant context. The relevant context is combined with the provided examples and question to create the prompt for [completion](/docs/api-reference/completions). 
[**createClassification**](OpenAIApi.md#createClassification) | **POST** classifications | Classifies the specified &#x60;query&#x60; using provided examples.  The endpoint first [searches](/docs/api-reference/searches) over the labeled examples to select the ones most relevant for the particular query. Then, the relevant examples are combined with the query to construct a prompt to produce the final label via the [completions](/docs/api-reference/completions) endpoint.  Labeled examples can be provided via an uploaded &#x60;file&#x60;, or explicitly listed in the request using the &#x60;examples&#x60; parameter for quick tests and small scale use cases. 
[**createCompletion**](OpenAIApi.md#createCompletion) | **POST** completions | Creates a completion for the provided prompt and parameters
[**createEdit**](OpenAIApi.md#createEdit) | **POST** edits | Creates a new edit for the provided input, instruction, and parameters
[**createEmbedding**](OpenAIApi.md#createEmbedding) | **POST** embeddings | Creates an embedding vector representing the input text.
[**createFile**](OpenAIApi.md#createFile) | **POST** files | Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 
[**createFineTune**](OpenAIApi.md#createFineTune) | **POST** fine-tunes | Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
[**createImage**](OpenAIApi.md#createImage) | **POST** images/generations | Creates an image given a prompt.
[**createImageEdit**](OpenAIApi.md#createImageEdit) | **POST** images/edits | Creates an edited or extended image given an original image and a prompt.
[**createImageVariation**](OpenAIApi.md#createImageVariation) | **POST** images/variations | Creates a variation of a given image.
[**createModeration**](OpenAIApi.md#createModeration) | **POST** moderations | Classifies if text violates OpenAI&#39;s Content Policy
[**createSearch**](OpenAIApi.md#createSearch) | **POST** engines/{engine_id}/search | The search endpoint computes similarity scores between provided query and documents. Documents can be passed directly to the API if there are no more than 200 of them.  To go beyond the 200 document limit, documents can be processed offline and then used for efficient retrieval at query time. When &#x60;file&#x60; is set, the search endpoint searches over all the documents in the given file and returns up to the &#x60;max_rerank&#x60; number of documents. These documents will be returned along with their search scores.  The similarity score is a positive score that usually ranges from 0 to 300 (but can sometimes go higher), where a score above 200 usually means the document is semantically similar to the query. 
[**deleteFile**](OpenAIApi.md#deleteFile) | **DELETE** files/{file_id} | Delete a file.
[**deleteModel**](OpenAIApi.md#deleteModel) | **DELETE** models/{model} | Delete a fine-tuned model. You must have the Owner role in your organization.
[**downloadFile**](OpenAIApi.md#downloadFile) | **GET** files/{file_id}/content | Returns the contents of the specified file
[**listEngines**](OpenAIApi.md#listEngines) | **GET** engines | Lists the currently available (non-finetuned) models, and provides basic information about each one such as the owner and availability.
[**listFiles**](OpenAIApi.md#listFiles) | **GET** files | Returns a list of files that belong to the user&#39;s organization.
[**listFineTuneEvents**](OpenAIApi.md#listFineTuneEvents) | **GET** fine-tunes/{fine_tune_id}/events | Get fine-grained status updates for a fine-tune job. 
[**listFineTunes**](OpenAIApi.md#listFineTunes) | **GET** fine-tunes | List your organization&#39;s fine-tuning jobs 
[**listModels**](OpenAIApi.md#listModels) | **GET** models | Lists the currently available models, and provides basic information about each one such as the owner and availability.
[**retrieveEngine**](OpenAIApi.md#retrieveEngine) | **GET** engines/{engine_id} | Retrieves a model instance, providing basic information about it such as the owner and availability.
[**retrieveFile**](OpenAIApi.md#retrieveFile) | **GET** files/{file_id} | Returns information about a specific file.
[**retrieveFineTune**](OpenAIApi.md#retrieveFineTune) | **GET** fine-tunes/{fine_tune_id} | Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
[**retrieveModel**](OpenAIApi.md#retrieveModel) | **GET** models/{model} | Retrieves a model instance, providing basic information about the model such as the owner and permissioning.



Immediately cancel a fine-tune job. 

### Example
```kotlin
// Import classes:
//import org.openapi.client.kotlin.openai.*
//import org.openapi.client.kotlin.openai.infrastructure.*
//import org.openapi.client.kotlin.openai.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(OpenAIApi::class.java)
val fineTuneId : kotlin.String = ft-AF1WoRqd3aJAHsqc9NY7iL8F // kotlin.String | The ID of the fine-tune job to cancel 

launch(Dispatchers.IO) {
    val result : FineTune = webService.cancelFineTune(fineTuneId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fineTuneId** | **kotlin.String**| The ID of the fine-tune job to cancel  |

### Return type

[**FineTune**](FineTune.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Answers the specified question using the provided documents and examples.  The endpoint first [searches](/docs/api-reference/searches) over provided documents or files to find relevant context. The relevant context is combined with the provided examples and question to create the prompt for [completion](/docs/api-reference/completions). 

### Example
```kotlin
// Import classes:
//import org.openapi.client.kotlin.openai.*
//import org.openapi.client.kotlin.openai.infrastructure.*
//import org.openapi.client.kotlin.openai.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(OpenAIApi::class.java)
val createAnswerRequest : CreateAnswerRequest =  // CreateAnswerRequest | 

launch(Dispatchers.IO) {
    val result : CreateAnswerResponse = webService.createAnswer(createAnswerRequest)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createAnswerRequest** | [**CreateAnswerRequest**](CreateAnswerRequest.md)|  |

### Return type

[**CreateAnswerResponse**](CreateAnswerResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Classifies the specified &#x60;query&#x60; using provided examples.  The endpoint first [searches](/docs/api-reference/searches) over the labeled examples to select the ones most relevant for the particular query. Then, the relevant examples are combined with the query to construct a prompt to produce the final label via the [completions](/docs/api-reference/completions) endpoint.  Labeled examples can be provided via an uploaded &#x60;file&#x60;, or explicitly listed in the request using the &#x60;examples&#x60; parameter for quick tests and small scale use cases. 

### Example
```kotlin
// Import classes:
//import org.openapi.client.kotlin.openai.*
//import org.openapi.client.kotlin.openai.infrastructure.*
//import org.openapi.client.kotlin.openai.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(OpenAIApi::class.java)
val createClassificationRequest : CreateClassificationRequest =  // CreateClassificationRequest | 

launch(Dispatchers.IO) {
    val result : CreateClassificationResponse = webService.createClassification(createClassificationRequest)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createClassificationRequest** | [**CreateClassificationRequest**](CreateClassificationRequest.md)|  |

### Return type

[**CreateClassificationResponse**](CreateClassificationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Creates a completion for the provided prompt and parameters

### Example
```kotlin
// Import classes:
//import org.openapi.client.kotlin.openai.*
//import org.openapi.client.kotlin.openai.infrastructure.*
//import org.openapi.client.kotlin.openai.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(OpenAIApi::class.java)
val createCompletionRequest : CreateCompletionRequest =  // CreateCompletionRequest | 

launch(Dispatchers.IO) {
    val result : CreateCompletionResponse = webService.createCompletion(createCompletionRequest)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createCompletionRequest** | [**CreateCompletionRequest**](CreateCompletionRequest.md)|  |

### Return type

[**CreateCompletionResponse**](CreateCompletionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Creates a new edit for the provided input, instruction, and parameters

### Example
```kotlin
// Import classes:
//import org.openapi.client.kotlin.openai.*
//import org.openapi.client.kotlin.openai.infrastructure.*
//import org.openapi.client.kotlin.openai.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(OpenAIApi::class.java)
val createEditRequest : CreateEditRequest =  // CreateEditRequest | 

launch(Dispatchers.IO) {
    val result : CreateEditResponse = webService.createEdit(createEditRequest)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createEditRequest** | [**CreateEditRequest**](CreateEditRequest.md)|  |

### Return type

[**CreateEditResponse**](CreateEditResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Creates an embedding vector representing the input text.

### Example
```kotlin
// Import classes:
//import org.openapi.client.kotlin.openai.*
//import org.openapi.client.kotlin.openai.infrastructure.*
//import org.openapi.client.kotlin.openai.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(OpenAIApi::class.java)
val createEmbeddingRequest : CreateEmbeddingRequest =  // CreateEmbeddingRequest | 

launch(Dispatchers.IO) {
    val result : CreateEmbeddingResponse = webService.createEmbedding(createEmbeddingRequest)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createEmbeddingRequest** | [**CreateEmbeddingRequest**](CreateEmbeddingRequest.md)|  |

### Return type

[**CreateEmbeddingResponse**](CreateEmbeddingResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 

### Example
```kotlin
// Import classes:
//import org.openapi.client.kotlin.openai.*
//import org.openapi.client.kotlin.openai.infrastructure.*
//import org.openapi.client.kotlin.openai.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(OpenAIApi::class.java)
val file : java.io.File = BINARY_DATA_HERE // java.io.File | Name of the [JSON Lines](https://jsonlines.readthedocs.io/en/latest/) file to be uploaded.  If the `purpose` is set to \\\"fine-tune\\\", each line is a JSON record with \\\"prompt\\\" and \\\"completion\\\" fields representing your [training examples](/docs/guides/fine-tuning/prepare-training-data). 
val purpose : kotlin.String = purpose_example // kotlin.String | The intended purpose of the uploaded documents.  Use \\\"fine-tune\\\" for [Fine-tuning](/docs/api-reference/fine-tunes). This allows us to validate the format of the uploaded file. 

launch(Dispatchers.IO) {
    val result : OpenAIFile = webService.createFile(file, purpose)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **java.io.File**| Name of the [JSON Lines](https://jsonlines.readthedocs.io/en/latest/) file to be uploaded.  If the &#x60;purpose&#x60; is set to \\\&quot;fine-tune\\\&quot;, each line is a JSON record with \\\&quot;prompt\\\&quot; and \\\&quot;completion\\\&quot; fields representing your [training examples](/docs/guides/fine-tuning/prepare-training-data).  |
 **purpose** | **kotlin.String**| The intended purpose of the uploaded documents.  Use \\\&quot;fine-tune\\\&quot; for [Fine-tuning](/docs/api-reference/fine-tunes). This allows us to validate the format of the uploaded file.  |

### Return type

[**OpenAIFile**](OpenAIFile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json


Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 

### Example
```kotlin
// Import classes:
//import org.openapi.client.kotlin.openai.*
//import org.openapi.client.kotlin.openai.infrastructure.*
//import org.openapi.client.kotlin.openai.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(OpenAIApi::class.java)
val createFineTuneRequest : CreateFineTuneRequest =  // CreateFineTuneRequest | 

launch(Dispatchers.IO) {
    val result : FineTune = webService.createFineTune(createFineTuneRequest)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createFineTuneRequest** | [**CreateFineTuneRequest**](CreateFineTuneRequest.md)|  |

### Return type

[**FineTune**](FineTune.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Creates an image given a prompt.

### Example
```kotlin
// Import classes:
//import org.openapi.client.kotlin.openai.*
//import org.openapi.client.kotlin.openai.infrastructure.*
//import org.openapi.client.kotlin.openai.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(OpenAIApi::class.java)
val createImageRequest : CreateImageRequest =  // CreateImageRequest | 

launch(Dispatchers.IO) {
    val result : ImagesResponse = webService.createImage(createImageRequest)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createImageRequest** | [**CreateImageRequest**](CreateImageRequest.md)|  |

### Return type

[**ImagesResponse**](ImagesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Creates an edited or extended image given an original image and a prompt.

### Example
```kotlin
// Import classes:
//import org.openapi.client.kotlin.openai.*
//import org.openapi.client.kotlin.openai.infrastructure.*
//import org.openapi.client.kotlin.openai.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(OpenAIApi::class.java)
val image : java.io.File = BINARY_DATA_HERE // java.io.File | The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask.
val prompt : kotlin.String = prompt_example // kotlin.String | A text description of the desired image(s). The maximum length is 1000 characters.
val mask : java.io.File = BINARY_DATA_HERE // java.io.File | An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where `image` should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as `image`.
val n : kotlin.Int = 56 // kotlin.Int | The number of images to generate. Must be between 1 and 10.
val size : kotlin.String = size_example // kotlin.String | The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.
val responseFormat : kotlin.String = responseFormat_example // kotlin.String | The format in which the generated images are returned. Must be one of `url` or `b64_json`.
val user : kotlin.String = user_example // kotlin.String | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 

launch(Dispatchers.IO) {
    val result : ImagesResponse = webService.createImageEdit(image, prompt, mask, n, size, responseFormat, user)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **image** | **java.io.File**| The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask. |
 **prompt** | **kotlin.String**| A text description of the desired image(s). The maximum length is 1000 characters. |
 **mask** | **java.io.File**| An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where &#x60;image&#x60; should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as &#x60;image&#x60;. | [optional]
 **n** | **kotlin.Int**| The number of images to generate. Must be between 1 and 10. | [optional] [default to 1]
 **size** | **kotlin.String**| The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | [optional] [default to 1024x1024] [enum: 256x256, 512x512, 1024x1024]
 **responseFormat** | **kotlin.String**| The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. | [optional] [default to url] [enum: url, b64_json]
 **user** | **kotlin.String**| A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  | [optional]

### Return type

[**ImagesResponse**](ImagesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json


Creates a variation of a given image.

### Example
```kotlin
// Import classes:
//import org.openapi.client.kotlin.openai.*
//import org.openapi.client.kotlin.openai.infrastructure.*
//import org.openapi.client.kotlin.openai.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(OpenAIApi::class.java)
val image : java.io.File = BINARY_DATA_HERE // java.io.File | The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square.
val n : kotlin.Int = 56 // kotlin.Int | The number of images to generate. Must be between 1 and 10.
val size : kotlin.String = size_example // kotlin.String | The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.
val responseFormat : kotlin.String = responseFormat_example // kotlin.String | The format in which the generated images are returned. Must be one of `url` or `b64_json`.
val user : kotlin.String = user_example // kotlin.String | A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 

launch(Dispatchers.IO) {
    val result : ImagesResponse = webService.createImageVariation(image, n, size, responseFormat, user)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **image** | **java.io.File**| The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square. |
 **n** | **kotlin.Int**| The number of images to generate. Must be between 1 and 10. | [optional] [default to 1]
 **size** | **kotlin.String**| The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;. | [optional] [default to 1024x1024] [enum: 256x256, 512x512, 1024x1024]
 **responseFormat** | **kotlin.String**| The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. | [optional] [default to url] [enum: url, b64_json]
 **user** | **kotlin.String**| A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  | [optional]

### Return type

[**ImagesResponse**](ImagesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json


Classifies if text violates OpenAI&#39;s Content Policy

### Example
```kotlin
// Import classes:
//import org.openapi.client.kotlin.openai.*
//import org.openapi.client.kotlin.openai.infrastructure.*
//import org.openapi.client.kotlin.openai.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(OpenAIApi::class.java)
val createModerationRequest : CreateModerationRequest =  // CreateModerationRequest | 

launch(Dispatchers.IO) {
    val result : CreateModerationResponse = webService.createModeration(createModerationRequest)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createModerationRequest** | [**CreateModerationRequest**](CreateModerationRequest.md)|  |

### Return type

[**CreateModerationResponse**](CreateModerationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


The search endpoint computes similarity scores between provided query and documents. Documents can be passed directly to the API if there are no more than 200 of them.  To go beyond the 200 document limit, documents can be processed offline and then used for efficient retrieval at query time. When &#x60;file&#x60; is set, the search endpoint searches over all the documents in the given file and returns up to the &#x60;max_rerank&#x60; number of documents. These documents will be returned along with their search scores.  The similarity score is a positive score that usually ranges from 0 to 300 (but can sometimes go higher), where a score above 200 usually means the document is semantically similar to the query. 

### Example
```kotlin
// Import classes:
//import org.openapi.client.kotlin.openai.*
//import org.openapi.client.kotlin.openai.infrastructure.*
//import org.openapi.client.kotlin.openai.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(OpenAIApi::class.java)
val engineId : kotlin.String = davinci // kotlin.String | The ID of the engine to use for this request.  You can select one of `ada`, `babbage`, `curie`, or `davinci`.
val createSearchRequest : CreateSearchRequest =  // CreateSearchRequest | 

launch(Dispatchers.IO) {
    val result : CreateSearchResponse = webService.createSearch(engineId, createSearchRequest)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **engineId** | **kotlin.String**| The ID of the engine to use for this request.  You can select one of &#x60;ada&#x60;, &#x60;babbage&#x60;, &#x60;curie&#x60;, or &#x60;davinci&#x60;. |
 **createSearchRequest** | [**CreateSearchRequest**](CreateSearchRequest.md)|  |

### Return type

[**CreateSearchResponse**](CreateSearchResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Delete a file.

### Example
```kotlin
// Import classes:
//import org.openapi.client.kotlin.openai.*
//import org.openapi.client.kotlin.openai.infrastructure.*
//import org.openapi.client.kotlin.openai.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(OpenAIApi::class.java)
val fileId : kotlin.String = fileId_example // kotlin.String | The ID of the file to use for this request

launch(Dispatchers.IO) {
    val result : DeleteFileResponse = webService.deleteFile(fileId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileId** | **kotlin.String**| The ID of the file to use for this request |

### Return type

[**DeleteFileResponse**](DeleteFileResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Delete a fine-tuned model. You must have the Owner role in your organization.

### Example
```kotlin
// Import classes:
//import org.openapi.client.kotlin.openai.*
//import org.openapi.client.kotlin.openai.infrastructure.*
//import org.openapi.client.kotlin.openai.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(OpenAIApi::class.java)
val model : kotlin.String = curie:ft-acmeco-2021-03-03-21-44-20 // kotlin.String | The model to delete

launch(Dispatchers.IO) {
    val result : DeleteModelResponse = webService.deleteModel(model)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | **kotlin.String**| The model to delete |

### Return type

[**DeleteModelResponse**](DeleteModelResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Returns the contents of the specified file

### Example
```kotlin
// Import classes:
//import org.openapi.client.kotlin.openai.*
//import org.openapi.client.kotlin.openai.infrastructure.*
//import org.openapi.client.kotlin.openai.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(OpenAIApi::class.java)
val fileId : kotlin.String = fileId_example // kotlin.String | The ID of the file to use for this request

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.downloadFile(fileId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileId** | **kotlin.String**| The ID of the file to use for this request |

### Return type

**kotlin.String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Lists the currently available (non-finetuned) models, and provides basic information about each one such as the owner and availability.

### Example
```kotlin
// Import classes:
//import org.openapi.client.kotlin.openai.*
//import org.openapi.client.kotlin.openai.infrastructure.*
//import org.openapi.client.kotlin.openai.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(OpenAIApi::class.java)

launch(Dispatchers.IO) {
    val result : ListEnginesResponse = webService.listEngines()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListEnginesResponse**](ListEnginesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Returns a list of files that belong to the user&#39;s organization.

### Example
```kotlin
// Import classes:
//import org.openapi.client.kotlin.openai.*
//import org.openapi.client.kotlin.openai.infrastructure.*
//import org.openapi.client.kotlin.openai.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(OpenAIApi::class.java)

launch(Dispatchers.IO) {
    val result : ListFilesResponse = webService.listFiles()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListFilesResponse**](ListFilesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get fine-grained status updates for a fine-tune job. 

### Example
```kotlin
// Import classes:
//import org.openapi.client.kotlin.openai.*
//import org.openapi.client.kotlin.openai.infrastructure.*
//import org.openapi.client.kotlin.openai.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(OpenAIApi::class.java)
val fineTuneId : kotlin.String = ft-AF1WoRqd3aJAHsqc9NY7iL8F // kotlin.String | The ID of the fine-tune job to get events for. 
val stream : kotlin.Boolean = true // kotlin.Boolean | Whether to stream events for the fine-tune job. If set to true, events will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available. The stream will terminate with a `data: [DONE]` message when the job is finished (succeeded, cancelled, or failed).  If set to false, only events generated so far will be returned. 

launch(Dispatchers.IO) {
    val result : ListFineTuneEventsResponse = webService.listFineTuneEvents(fineTuneId, stream)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fineTuneId** | **kotlin.String**| The ID of the fine-tune job to get events for.  |
 **stream** | **kotlin.Boolean**| Whether to stream events for the fine-tune job. If set to true, events will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available. The stream will terminate with a &#x60;data: [DONE]&#x60; message when the job is finished (succeeded, cancelled, or failed).  If set to false, only events generated so far will be returned.  | [optional] [default to false]

### Return type

[**ListFineTuneEventsResponse**](ListFineTuneEventsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


List your organization&#39;s fine-tuning jobs 

### Example
```kotlin
// Import classes:
//import org.openapi.client.kotlin.openai.*
//import org.openapi.client.kotlin.openai.infrastructure.*
//import org.openapi.client.kotlin.openai.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(OpenAIApi::class.java)

launch(Dispatchers.IO) {
    val result : ListFineTunesResponse = webService.listFineTunes()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListFineTunesResponse**](ListFineTunesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Lists the currently available models, and provides basic information about each one such as the owner and availability.

### Example
```kotlin
// Import classes:
//import org.openapi.client.kotlin.openai.*
//import org.openapi.client.kotlin.openai.infrastructure.*
//import org.openapi.client.kotlin.openai.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(OpenAIApi::class.java)

launch(Dispatchers.IO) {
    val result : ListModelsResponse = webService.listModels()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListModelsResponse**](ListModelsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieves a model instance, providing basic information about it such as the owner and availability.

### Example
```kotlin
// Import classes:
//import org.openapi.client.kotlin.openai.*
//import org.openapi.client.kotlin.openai.infrastructure.*
//import org.openapi.client.kotlin.openai.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(OpenAIApi::class.java)
val engineId : kotlin.String = davinci // kotlin.String | The ID of the engine to use for this request 

launch(Dispatchers.IO) {
    val result : Engine = webService.retrieveEngine(engineId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **engineId** | **kotlin.String**| The ID of the engine to use for this request  |

### Return type

[**Engine**](Engine.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Returns information about a specific file.

### Example
```kotlin
// Import classes:
//import org.openapi.client.kotlin.openai.*
//import org.openapi.client.kotlin.openai.infrastructure.*
//import org.openapi.client.kotlin.openai.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(OpenAIApi::class.java)
val fileId : kotlin.String = fileId_example // kotlin.String | The ID of the file to use for this request

launch(Dispatchers.IO) {
    val result : OpenAIFile = webService.retrieveFile(fileId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileId** | **kotlin.String**| The ID of the file to use for this request |

### Return type

[**OpenAIFile**](OpenAIFile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 

### Example
```kotlin
// Import classes:
//import org.openapi.client.kotlin.openai.*
//import org.openapi.client.kotlin.openai.infrastructure.*
//import org.openapi.client.kotlin.openai.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(OpenAIApi::class.java)
val fineTuneId : kotlin.String = ft-AF1WoRqd3aJAHsqc9NY7iL8F // kotlin.String | The ID of the fine-tune job 

launch(Dispatchers.IO) {
    val result : FineTune = webService.retrieveFineTune(fineTuneId)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fineTuneId** | **kotlin.String**| The ID of the fine-tune job  |

### Return type

[**FineTune**](FineTune.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieves a model instance, providing basic information about the model such as the owner and permissioning.

### Example
```kotlin
// Import classes:
//import org.openapi.client.kotlin.openai.*
//import org.openapi.client.kotlin.openai.infrastructure.*
//import org.openapi.client.kotlin.openai.models.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(OpenAIApi::class.java)
val model : kotlin.String = text-davinci-001 // kotlin.String | The ID of the model to use for this request

launch(Dispatchers.IO) {
    val result : Model = webService.retrieveModel(model)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **model** | **kotlin.String**| The ID of the model to use for this request |

### Return type

[**Model**](Model.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

