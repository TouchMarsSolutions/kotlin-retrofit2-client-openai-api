package org.openapi.client.kotlin.openai.infrastructure

import com.squareup.moshi.FromJson
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.ToJson
import java.math.BigDecimal


class BigDecimalAdapter : JsonAdapter<BigDecimal>() {

    @FromJson
    override fun fromJson(reader: JsonReader): BigDecimal? {
        return reader.nextString().toBigDecimalOrNull()
    }

    @ToJson
    override fun toJson(writer: JsonWriter, value: BigDecimal?) {
        if (value == null) {
            writer.nullValue()
            return
        }
        writer.value(value)
    }
}
