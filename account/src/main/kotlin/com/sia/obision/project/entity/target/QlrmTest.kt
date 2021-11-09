package com.sia.obision.project.entity.target

import java.util.*
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Table
@Entity
data class QlrmTest(
    @Id
    val id: String,
    val name: String
//    @Column(columnDefinition = "uuid default uuid_generate_v4()")
//    val id: UUID? = null
)
