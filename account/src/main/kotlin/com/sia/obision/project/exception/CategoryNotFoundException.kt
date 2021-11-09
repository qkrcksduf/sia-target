package com.sia.obision.project.exception

import io.grpc.Status
import io.grpc.StatusException

class CategoryNotFoundException(description: String? = null) :
    StatusException(Status.NOT_FOUND.withDescription(description))
