package com.sia.obision.project.converter.target

import com.sia.obision.project.exception.BadRequestException
import com.sia.obision.project.param.target.*
import com.sia.obision.project.repo.target.view.RecordView
import com.sia.obision.project.util.checkEmpty
import com.sia.obision.project.util.specialCharacterReplace
import com.sia.obision.target.v1.attach.Attach
import com.sia.obision.target.v1.attach.FileExtension
import com.sia.obision.target.v1.record.*

fun CreateRecordRequestV1.toParam() = CreateRecordParam(
    targetName = targetName.trim(),
    contents = contents.trim(),
    creator = creator.trim(),
    isEmergency = isEmergency
)

fun UpdateRecordRequestV1.toParam() = UpdateRecordParam(
    id = id.toEntity(),
    targetName = targetName.trim(),
    contents = contents.trim(),
    isEmergency = isEmergency
)

fun RecordSortProperty.toEntity(): RecordSortPropertyParam? = when (this) {
    RecordSortProperty.DEFAULT -> null
    RecordSortProperty.TARGET_NAME -> RecordSortPropertyParam.TARGET_NAME
    RecordSortProperty.CREATED_TIME -> RecordSortPropertyParam.CREATED_TIME
    else -> throw BadRequestException("DEFAULT, TARGET_NAME, CREATED_TIME 중 하나를 반드시 입력해야 합니다.")
}

fun RecordSelectOption.toParam() = RecordSelectOptionParam(
    isFavoriteRecord = isFavoriteRecord,
    isEmergency = isEmergency,
    isFavoriteTarget = isFavoriteTarget
)

fun RecordSearchProperty.toParam() = RecordSearchPropertyParam(
    targetName = if (checkEmpty(targetName)) null else specialCharacterReplace(targetName.trim()),
    creator = if (checkEmpty(creator)) null else specialCharacterReplace(creator.trim()),
    contents = if (checkEmpty(contents)) null else specialCharacterReplace(contents.trim())
)

fun RecordView.toProto(): Record {

    val record = Record.newBuilder()
        .setRecordId(recordId.toProto())
        .setTargetId(targetId)
        .setTargetName(targetName)
        .setContents(contents)
        .setCreatedTime(createdTime.toProto())
        .setCreator(creator)
        .setIsFavoriteTarget(isFavoriteTarget)
        .setIsFavoriteRecord(isFavoriteRecord)
        .setIsEmergency(isEmergency)

    val length = attachId.size
    if (attachId.isNotEmpty()) {
        for (i in 0 until length) {
            record.addAttach(AttachParam(attachId[i], fileName[i], fileExtension[i], size[i]).toProto())
        }
    }

    return record.build()
}

fun AttachParam.toProto(): Attach {
    val enumFileExtension = changeEnumFileExtension(fileExtension)
    return Attach.newBuilder()
        .setId(id.toProto())
        .setFileExtension(enumFileExtension)
        .setFileName(fileName)
        .setSize(size)
        .build()!!
}

private fun changeEnumFileExtension(fileExtension: String): FileExtension {
    return when (fileExtension) {
        "HWP" -> FileExtension.HWP
        "CSV" -> FileExtension.CSV
        "JPG" -> FileExtension.JPG
        "PNG" -> FileExtension.PNG
        "SHP" -> FileExtension.SHP
        "PDF" -> FileExtension.PDF
        "PPT" -> FileExtension.PPT
        "TXT" -> FileExtension.TXT
        else -> FileExtension.ZIP
    }
}
