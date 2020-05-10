package com.github.abigail830.bookmytime.infrastructure.util

import com.google.gson.GsonBuilder
import java.lang.reflect.Type

object JsonUtil {
    private val DEFAULT_GSON = GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create()
    private val WITHOUT_ENCODE_GSON = GsonBuilder().disableHtmlEscaping().create()
    fun <T> toObject(json: String?, obj: Type?): T {
        return DEFAULT_GSON.fromJson(json, obj)
    }

    fun <T> toObject(json: String?, obj: Class<T>?): T {
        return DEFAULT_GSON.fromJson(json, obj)
    }

    fun toJson(obj: Any?): String {
        return DEFAULT_GSON.toJson(obj)
    }

    fun toJsonWithoutEncode(obj: Any?): String {
        return WITHOUT_ENCODE_GSON.toJson(obj)
    }
}