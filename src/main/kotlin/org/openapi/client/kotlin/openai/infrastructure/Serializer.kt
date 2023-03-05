package org.openapi.client.kotlin.openai.infrastructure

import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import java.math.BigDecimal

object Serializer {

    @JvmStatic
    val moshiBuilder: Moshi.Builder = Moshi.Builder()
//        .add(OffsetDateTimeAdapter())
//        .add(LocalDateTimeAdapter())
//        .add(LocalDateAdapter())
//        .add(UUIDAdapter())
//        .add(ByteArrayAdapter())
//        .add(URIAdapter())
//        .add(BigIntegerAdapter())
//        .add(BigDecimalAdapter())
        .add(BigDecimal::class.java, BigDecimalAdapter())
        .addLast(KotlinJsonAdapterFactory())

    @JvmStatic
    val moshi: Moshi by lazy {
        moshiBuilder.build()
    }
}
