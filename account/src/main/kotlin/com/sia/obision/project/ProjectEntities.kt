package com.sia.obision.project

import com.sia.obision.project.entity.target.*
import com.sia.obision.project.entity.target.Target
import kotlin.reflect.KClass

fun getProjectEntities(): List<KClass<out Any>> = listOf(
  Target::class,
  Category::class,
  Record::class,
  Attach::class
)