package com.sia.core.converter

import com.google.protobuf.Message
import com.google.protobuf.util.JsonFormat

inline fun <reified T : Message> T.toJson(): String = JsonFormat.printer().print(this)

inline fun <reified T : Message> T.toNotBlankJson(): String = JsonFormat.printer().print(this)
    .replace("\n", "").replace(" ", "")
