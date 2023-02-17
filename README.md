# org.openapi.client.kotlin.openai - Kotlin client library for OpenAI API

APIs for sampling from and fine-tuning language models

## Overview
This API client was generated by the [OpenAPI Generator](https://openapi-generator.tech) project.  By using the [openapi-spec](https://github.com/OAI/OpenAPI-Specification) from a remote server, you can easily generate an API client.
- GroupId: `org.openapi.client.kotlin.openai`
- ArtifactId: `kotlin-retrofit2-client-openai-api`
- API version: 1.1.0
- Build package: org.openapitools.codegen.languages.KotlinClientCodegen

## Favorite
- this library is a favorite one of WebFlux lovers
- kotlin
- neat and clean code
  - Retrofit2 - OpenFeign style
  - `ApiClient` is short and clear, without too much code
- Retrofit2 underneath sits on top of `OkHttp4`
- Reactive => kotlin coroutines
  - easily integrate with Spring WebFlux and `WebClient`
- only minor changes since code generated from OpenAPI Generator (language kotlin)
- [OpenAI API OpenAPI Spec](https://github.com/openai/openai-openapi/blob/master/openapi.yaml) originally from [OpenAI OpenAPI repo](https://github.com/openai/openai-openapi/)

## Requires

* Kotlin `1.8.10`
* Gradle `8.0`

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://api.openai.com/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*OpenAIApi* | [**cancelFineTune**](docs/OpenAIApi.md#cancelfinetune) | **POST** fine-tunes/{fine_tune_id}/cancel | Immediately cancel a fine-tune job. 
*OpenAIApi* | [**createAnswer**](docs/OpenAIApi.md#createanswer) | **POST** answers | Answers the specified question using the provided documents and examples.  The endpoint first [searches](/docs/api-reference/searches) over provided documents or files to find relevant context. The relevant context is combined with the provided examples and question to create the prompt for [completion](/docs/api-reference/completions). 
*OpenAIApi* | [**createClassification**](docs/OpenAIApi.md#createclassification) | **POST** classifications | Classifies the specified `query` using provided examples.  The endpoint first [searches](/docs/api-reference/searches) over the labeled examples to select the ones most relevant for the particular query. Then, the relevant examples are combined with the query to construct a prompt to produce the final label via the [completions](/docs/api-reference/completions) endpoint.  Labeled examples can be provided via an uploaded `file`, or explicitly listed in the request using the `examples` parameter for quick tests and small scale use cases. 
*OpenAIApi* | [**createCompletion**](docs/OpenAIApi.md#createcompletion) | **POST** completions | Creates a completion for the provided prompt and parameters
*OpenAIApi* | [**createEdit**](docs/OpenAIApi.md#createedit) | **POST** edits | Creates a new edit for the provided input, instruction, and parameters
*OpenAIApi* | [**createEmbedding**](docs/OpenAIApi.md#createembedding) | **POST** embeddings | Creates an embedding vector representing the input text.
*OpenAIApi* | [**createFile**](docs/OpenAIApi.md#createfile) | **POST** files | Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 
*OpenAIApi* | [**createFineTune**](docs/OpenAIApi.md#createfinetune) | **POST** fine-tunes | Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
*OpenAIApi* | [**createImage**](docs/OpenAIApi.md#createimage) | **POST** images/generations | Creates an image given a prompt.
*OpenAIApi* | [**createImageEdit**](docs/OpenAIApi.md#createimageedit) | **POST** images/edits | Creates an edited or extended image given an original image and a prompt.
*OpenAIApi* | [**createImageVariation**](docs/OpenAIApi.md#createimagevariation) | **POST** images/variations | Creates a variation of a given image.
*OpenAIApi* | [**createModeration**](docs/OpenAIApi.md#createmoderation) | **POST** moderations | Classifies if text violates OpenAI's Content Policy
*OpenAIApi* | [**createSearch**](docs/OpenAIApi.md#createsearch) | **POST** engines/{engine_id}/search | The search endpoint computes similarity scores between provided query and documents. Documents can be passed directly to the API if there are no more than 200 of them.  To go beyond the 200 document limit, documents can be processed offline and then used for efficient retrieval at query time. When `file` is set, the search endpoint searches over all the documents in the given file and returns up to the `max_rerank` number of documents. These documents will be returned along with their search scores.  The similarity score is a positive score that usually ranges from 0 to 300 (but can sometimes go higher), where a score above 200 usually means the document is semantically similar to the query. 
*OpenAIApi* | [**deleteFile**](docs/OpenAIApi.md#deletefile) | **DELETE** files/{file_id} | Delete a file.
*OpenAIApi* | [**deleteModel**](docs/OpenAIApi.md#deletemodel) | **DELETE** models/{model} | Delete a fine-tuned model. You must have the Owner role in your organization.
*OpenAIApi* | [**downloadFile**](docs/OpenAIApi.md#downloadfile) | **GET** files/{file_id}/content | Returns the contents of the specified file
*OpenAIApi* | [**listEngines**](docs/OpenAIApi.md#listengines) | **GET** engines | Lists the currently available (non-finetuned) models, and provides basic information about each one such as the owner and availability.
*OpenAIApi* | [**listFiles**](docs/OpenAIApi.md#listfiles) | **GET** files | Returns a list of files that belong to the user's organization.
*OpenAIApi* | [**listFineTuneEvents**](docs/OpenAIApi.md#listfinetuneevents) | **GET** fine-tunes/{fine_tune_id}/events | Get fine-grained status updates for a fine-tune job. 
*OpenAIApi* | [**listFineTunes**](docs/OpenAIApi.md#listfinetunes) | **GET** fine-tunes | List your organization's fine-tuning jobs 
*OpenAIApi* | [**listModels**](docs/OpenAIApi.md#listmodels) | **GET** models | Lists the currently available models, and provides basic information about each one such as the owner and availability.
*OpenAIApi* | [**retrieveEngine**](docs/OpenAIApi.md#retrieveengine) | **GET** engines/{engine_id} | Retrieves a model instance, providing basic information about it such as the owner and availability.
*OpenAIApi* | [**retrieveFile**](docs/OpenAIApi.md#retrievefile) | **GET** files/{file_id} | Returns information about a specific file.
*OpenAIApi* | [**retrieveFineTune**](docs/OpenAIApi.md#retrievefinetune) | **GET** fine-tunes/{fine_tune_id} | Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
*OpenAIApi* | [**retrieveModel**](docs/OpenAIApi.md#retrievemodel) | **GET** models/{model} | Retrieves a model instance, providing basic information about the model such as the owner and permissioning.


<a name="documentation-for-models"></a>
## Documentation for Models

 - [org.openapi.client.kotlin.openai.models.CreateAnswerRequest](docs/CreateAnswerRequest.md)
 - [org.openapi.client.kotlin.openai.models.CreateAnswerRequestStop](docs/CreateAnswerRequestStop.md)
 - [org.openapi.client.kotlin.openai.models.CreateAnswerResponse](docs/CreateAnswerResponse.md)
 - [org.openapi.client.kotlin.openai.models.CreateAnswerResponseSelectedDocumentsInner](docs/CreateAnswerResponseSelectedDocumentsInner.md)
 - [org.openapi.client.kotlin.openai.models.CreateClassificationRequest](docs/CreateClassificationRequest.md)
 - [org.openapi.client.kotlin.openai.models.CreateClassificationResponse](docs/CreateClassificationResponse.md)
 - [org.openapi.client.kotlin.openai.models.CreateClassificationResponseSelectedExamplesInner](docs/CreateClassificationResponseSelectedExamplesInner.md)
 - [org.openapi.client.kotlin.openai.models.CreateCompletionRequest](docs/CreateCompletionRequest.md)
 - [org.openapi.client.kotlin.openai.models.CreateCompletionRequestPrompt](docs/CreateCompletionRequestPrompt.md)
 - [org.openapi.client.kotlin.openai.models.CreateCompletionRequestStop](docs/CreateCompletionRequestStop.md)
 - [org.openapi.client.kotlin.openai.models.CreateCompletionResponse](docs/CreateCompletionResponse.md)
 - [org.openapi.client.kotlin.openai.models.CreateCompletionResponseChoicesInner](docs/CreateCompletionResponseChoicesInner.md)
 - [org.openapi.client.kotlin.openai.models.CreateCompletionResponseChoicesInnerLogprobs](docs/CreateCompletionResponseChoicesInnerLogprobs.md)
 - [org.openapi.client.kotlin.openai.models.CreateCompletionResponseUsage](docs/CreateCompletionResponseUsage.md)
 - [org.openapi.client.kotlin.openai.models.CreateEditRequest](docs/CreateEditRequest.md)
 - [org.openapi.client.kotlin.openai.models.CreateEditResponse](docs/CreateEditResponse.md)
 - [org.openapi.client.kotlin.openai.models.CreateEmbeddingRequest](docs/CreateEmbeddingRequest.md)
 - [org.openapi.client.kotlin.openai.models.CreateEmbeddingRequestInput](docs/CreateEmbeddingRequestInput.md)
 - [org.openapi.client.kotlin.openai.models.CreateEmbeddingResponse](docs/CreateEmbeddingResponse.md)
 - [org.openapi.client.kotlin.openai.models.CreateEmbeddingResponseDataInner](docs/CreateEmbeddingResponseDataInner.md)
 - [org.openapi.client.kotlin.openai.models.CreateEmbeddingResponseUsage](docs/CreateEmbeddingResponseUsage.md)
 - [org.openapi.client.kotlin.openai.models.CreateFineTuneRequest](docs/CreateFineTuneRequest.md)
 - [org.openapi.client.kotlin.openai.models.CreateImageRequest](docs/CreateImageRequest.md)
 - [org.openapi.client.kotlin.openai.models.CreateModerationRequest](docs/CreateModerationRequest.md)
 - [org.openapi.client.kotlin.openai.models.CreateModerationRequestInput](docs/CreateModerationRequestInput.md)
 - [org.openapi.client.kotlin.openai.models.CreateModerationResponse](docs/CreateModerationResponse.md)
 - [org.openapi.client.kotlin.openai.models.CreateModerationResponseResultsInner](docs/CreateModerationResponseResultsInner.md)
 - [org.openapi.client.kotlin.openai.models.CreateModerationResponseResultsInnerCategories](docs/CreateModerationResponseResultsInnerCategories.md)
 - [org.openapi.client.kotlin.openai.models.CreateModerationResponseResultsInnerCategoryScores](docs/CreateModerationResponseResultsInnerCategoryScores.md)
 - [org.openapi.client.kotlin.openai.models.CreateSearchRequest](docs/CreateSearchRequest.md)
 - [org.openapi.client.kotlin.openai.models.CreateSearchResponse](docs/CreateSearchResponse.md)
 - [org.openapi.client.kotlin.openai.models.CreateSearchResponseDataInner](docs/CreateSearchResponseDataInner.md)
 - [org.openapi.client.kotlin.openai.models.DeleteFileResponse](docs/DeleteFileResponse.md)
 - [org.openapi.client.kotlin.openai.models.DeleteModelResponse](docs/DeleteModelResponse.md)
 - [org.openapi.client.kotlin.openai.models.Engine](docs/Engine.md)
 - [org.openapi.client.kotlin.openai.models.FineTune](docs/FineTune.md)
 - [org.openapi.client.kotlin.openai.models.FineTuneEvent](docs/FineTuneEvent.md)
 - [org.openapi.client.kotlin.openai.models.ImagesResponse](docs/ImagesResponse.md)
 - [org.openapi.client.kotlin.openai.models.ImagesResponseDataInner](docs/ImagesResponseDataInner.md)
 - [org.openapi.client.kotlin.openai.models.ListEnginesResponse](docs/ListEnginesResponse.md)
 - [org.openapi.client.kotlin.openai.models.ListFilesResponse](docs/ListFilesResponse.md)
 - [org.openapi.client.kotlin.openai.models.ListFineTuneEventsResponse](docs/ListFineTuneEventsResponse.md)
 - [org.openapi.client.kotlin.openai.models.ListFineTunesResponse](docs/ListFineTunesResponse.md)
 - [org.openapi.client.kotlin.openai.models.ListModelsResponse](docs/ListModelsResponse.md)
 - [org.openapi.client.kotlin.openai.models.Model](docs/Model.md)
 - [org.openapi.client.kotlin.openai.models.OpenAIFile](docs/OpenAIFile.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

All endpoints do not require authorization.
