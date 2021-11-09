package com.sia.obision.project

import com.sia.obision.project.service.AttachRouteService
import com.sia.obision.project.service.CategoryRouteService
import com.sia.obision.project.service.RecordRouteService
import com.sia.obision.project.service.TargetRouteService
import io.grpc.BindableService

fun projectGrpcServices(): List<BindableService> = listOf(
  TargetRouteService(),
  CategoryRouteService(),
  RecordRouteService(),
  AttachRouteService()
)