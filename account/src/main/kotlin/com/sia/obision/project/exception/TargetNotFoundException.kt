package com.sia.obision.project.exception

import io.grpc.Status
import io.grpc.StatusException

class TargetNotFoundException(description: String?) :
    StatusException(Status.NOT_FOUND.withDescription(description))
