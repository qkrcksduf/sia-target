package com.sia.obision.project.entity.target

import org.hibernate.type.PostgresUUIDType
import java.util.*
import javax.persistence.*

@Table
@Entity
data class QlrmTest(
    @Id
    @GeneratedValue
    @Column(columnDefinition = "uuid default uuid_generate_v4()")
    val id: UUID,
    val name: String
//    @Column(columnDefinition = "uuid default uuid_generate_v4()")
//    val id: UUID? = null
)
