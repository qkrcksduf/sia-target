package com.sia.obision.project.param.target

import org.locationtech.jts.geom.Point
import java.sql.Timestamp

data class TargetParam(
  val id: String,
  val name: String,
  val mainCategory: String,
  val middleCategory: String,
  val subCategory: String,
  val mgrs: String,
  val geography: Point,
  val be: String,
  val jdpi: String,
  val createdTime: Timestamp
)
