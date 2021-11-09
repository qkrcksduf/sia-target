package com.sia.proto.ex

import com.google.protobuf.Message
import com.google.protobuf.MessageLite
import com.google.protobuf.util.JsonFormat

inline fun <reified T : Message.Builder> T.parse(jsonString: String): T {
    JsonFormat.parser().merge(jsonString, this)
    return this
}

inline fun <reified T : Message.Builder> T.buildJson(): String = JsonFormat.printer().print(this)

inline fun <reified T : Message.Builder> T.setNotNull(any: Any?, setter: (T) -> Unit): T {
    if (any != null) {
        setter(this)
    }
    return this
}

fun <T : MessageLite, R> T.getIfExists(block: (T) -> R): R? =
    if (this == this.defaultInstanceForType) null else this.run(block)
fun <T, R> List<T>.mapIfExists(block: (T) -> R): List<R>? = if (this.isEmpty()) null else this.map(block)
fun <T, R> List<T>.mapNotNullIfExists(block: (T) -> R?): List<R>? = if (this.isEmpty()) null else this.mapNotNull(block)
fun <T> List<T>.getIfExists(): List<T>? = this.ifEmpty { null }
