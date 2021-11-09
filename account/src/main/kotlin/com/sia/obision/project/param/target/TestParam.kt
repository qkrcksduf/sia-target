package com.sia.obision.project.param.target

import org.hibernate.annotations.Type
import java.util.*

data class TestParam(
//    @Type(type = "org.hibernate.type.PostgresUUIDType")
    val id: String,
    val name: String
) {
}
