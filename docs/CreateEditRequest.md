
# CreateEditRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**model** | **kotlin.String** | ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of them. | 
**instruction** | **kotlin.String** | The instruction that tells the model how to edit the prompt. | 
**input** | **kotlin.String** | The input text to use as a starting point for the edit. |  [optional]
**n** | **kotlin.Int** | How many edits to generate for the input and instruction. |  [optional]
**temperature** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | What [sampling temperature](https://towardsdatascience.com/how-to-sample-from-language-models-682bceb97277) to use. Higher values means the model will take more risks. Try 0.9 for more creative applications, and 0 (argmax sampling) for ones with a well-defined answer.  We generally recommend altering this or &#x60;top_p&#x60; but not both.  |  [optional]
**topP** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or &#x60;temperature&#x60; but not both.  |  [optional]



