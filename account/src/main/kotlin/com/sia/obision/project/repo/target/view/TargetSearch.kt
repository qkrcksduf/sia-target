package com.sia.obision.project.repo.target.view

import org.hibernate.annotations.Type
import org.locationtech.jts.geom.Point
import java.sql.Timestamp
import java.util.*

data class TargetSearch(
  val targetId: String,
  val name: String,
  @Type(type = "org.hibernate.type.PostgresUUIDType")
  val categoryId: UUID,
  val mainCategory: String,
  val middleCategory: String?,
  val subCategory: String?,
  val mgrs: String?,
//  val geography: Point?,
  val be: String?,
  val jdpi: String?,
  val createdTime: Timestamp,
  val isFavorite: Boolean
)
