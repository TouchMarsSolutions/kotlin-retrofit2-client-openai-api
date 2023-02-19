package org.openapi.client.kotlin.openai.infrastructure

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import okio.Buffer

class UnwrapAdapter<T>(
    private val delegateAdapter: JsonAdapter<T>,
    private val key: String
) : JsonAdapter<T>() {

    override fun fromJson(reader: JsonReader): T? {
        var result: T? = null
        when (reader.peek()) {
            JsonReader.Token.BEGIN_OBJECT -> {
                reader.beginObject()
                while (reader.hasNext()) {
                    if (reader.nextName() == key) {
                        result = delegateAdapter.fromJson(reader)
                    } else {
                        reader.skipValue()
                    }
                }
                reader.endObject()
            }
            JsonReader.Token.BEGIN_ARRAY -> {
                val list = mutableListOf<String>()
                reader.beginArray()
                while (reader.hasNext()) {
                    list.add(reader.nextString())
                }
                reader.endArray()
                val source = Buffer().writeUtf8(list.joinToString(",","[","]"))
                val arrayReader = JsonReader.of(source)
                result = delegateAdapter.fromJson(arrayReader)
            }
            else -> {
                result = delegateAdapter.fromJson(reader)
            }
        }
        return result
    }

    override fun toJson(writer: JsonWriter, value: T?) {
        delegateAdapter.toJson(writer, value)
            .takeIf { key.isEmpty() } ?: writer.name(key)    }
}
