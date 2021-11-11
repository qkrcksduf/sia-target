package com.sia.obision.project.param.target

import lombok.NoArgsConstructor
import org.hibernate.type.PostgresUUIDType

@NoArgsConstructor
data class TestParam(
    val id: String,
    val name: String
) {
}
