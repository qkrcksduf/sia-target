package com.sia.obision.project.util

import com.sia.obision.project.exception.BadRequestException

fun specialCharacterCheck(vararg values: String) {
    for (value in values) {
        if (value.contains(Regex("[{}]"))) throw BadRequestException("""특수문자 '{'와 '}'는 입력이 불가능 합니다.""")
    }
}

fun specialCharacterReplace(value: String): String {
    return value.replace(Regex("'"), "''")
        .replace(Regex("\\\\"), """\\\\""")
        .replace(Regex("_"), """\\_""")
        .replace(Regex("%"), """\\%""")
}