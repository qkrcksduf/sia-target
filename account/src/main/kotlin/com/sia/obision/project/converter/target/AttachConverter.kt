package com.sia.obision.project.converter.target

import com.sia.obision.project.param.target.UploadAttachParam
import com.sia.obision.target.v1.attach.UploadAttachRequestV1

fun UploadAttachRequestV1.toParam() = UploadAttachParam(
    recordId = recordId.toEntity(),
    fileName = fileName,
    fileExtension = fileExtension.toString(),
    size = size
)
