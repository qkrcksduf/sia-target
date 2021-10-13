package com.sia.obision.project.entity.target

import java.util.*
import javax.persistence.*

@Entity(name = "attach")
@Table(name = "attach")
data class Attach(
    @Id  
    @GeneratedValue  
    @Column(columnDefinition = "uuid default uuid_generate_v4()")  
    val id: UUID,
    val attachmentPath: String,

    @ManyToOne  
    @JoinColumn(name = "record")  
    val record: Record
)
