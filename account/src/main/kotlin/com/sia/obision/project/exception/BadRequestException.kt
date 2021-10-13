package com.sia.obision.project.exception

import io.grpc.Status
import io.grpc.StatusException

class BadRequestException(description: String? = null) :
    StatusException(Status.INVALID_ARGUMENT.withDescription(description))
