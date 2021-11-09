package com.sia.obision.project.exception

import io.grpc.Status
import io.grpc.StatusException

class IdDuplicationException(description: String? = null) :
    StatusException(Status.ALREADY_EXISTS.withDescription(description))
