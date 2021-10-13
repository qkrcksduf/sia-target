package com.sia.obision.project.entity.target

import java.sql.Timestamp
import java.util.*
import javax.persistence.*

@Entity(name = "record")
@Table(name = "record")
data class Record(
  @Id
  @GeneratedValue
  @Column(columnDefinition = "uuid default uuid_generate_v4()")
  val id: UUID,
  val contents: String,
  val createdTime: Timestamp,
  val creator: String,
  val isFavorite: Boolean,

  @OneToMany(mappedBy = "record", fetch = FetchType.LAZY)
  val targetList: List<Target> = emptyList(),

  @OneToMany(mappedBy = "record", fetch = FetchType.LAZY)
  val attachList: List<Attach> = emptyList()
)
