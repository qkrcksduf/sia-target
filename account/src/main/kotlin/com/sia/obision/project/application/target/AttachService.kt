package com.sia.obision.project.application.target

import com.google.protobuf.ByteString
import com.sia.core.dependencyinjection.injector
import com.sia.obision.project.converter.target.toEntity
import com.sia.obision.project.converter.target.toParam
import com.sia.obision.project.converter.target.toProto
import com.sia.obision.project.entity.target.Attach
import com.sia.obision.project.exception.AttachDuplicationException
import com.sia.obision.project.exception.AttachNotFoundException
import com.sia.obision.project.exception.BadRequestException
import com.sia.obision.project.exception.RecordNotFoundException
import com.sia.obision.project.repo.target.AttachRepository
import com.sia.obision.project.repo.target.RecordRepository
import com.sia.obision.project.util.checkEmpty
import com.sia.obision.target.v1.attach.*
import java.io.File
import java.io.FileInputStream
import java.io.FileNotFoundException
import javax.persistence.PersistenceException
import javax.transaction.Transactional

object AttachService {

    @Suppress("ThrowsCount")
    @Transactional
    fun uploadAttach(request: UploadAttachRequestV1): UploadAttachResponseV1 {
        if (checkEmpty(request.recordId.toString(), request.fileName, request.fileExtension.toString()))
            throw BadRequestException("recordId, fileName, fileExtension must exist")

        val attachParam = request.toParam()

        val record = try {
            injector().get<RecordRepository>().use {
                it.findOne(attachParam.recordId)
            }
        } catch (e: NoSuchElementException) {
            throw RecordNotFoundException("${attachParam.recordId} does not exist")
        }

        val attach = Attach(
            fileName = attachParam.fileName,
            fileExtension = attachParam.fileExtension,
            size = attachParam.size,
            record = record
        )
        val filePath = attach.updateFilePath(attachParam.recordId)

        try {
            val file = File(filePath)
            file.parentFile.mkdirs()

            file.writeBytes(request.file.toByteArray())

            injector().get<AttachRepository>().use {
                it.save(attach)
            }

            return UploadAttachResponseV1.newBuilder()
                .setAttachId(attach.id!!.toProto())
                .build()
        } catch (e: FileNotFoundException) {
            throw FileNotFoundException("file name too long")
        } catch (e: PersistenceException) {
            throw AttachDuplicationException("the attachment to the record already exists")
        }
    }

    @Transactional
    fun downloadAttach(request: DownloadAttachRequestV1): DownloadAttachResponseV1 {
        if (checkEmpty(request.attachId.toString())) throw BadRequestException("id must exist")
        val id = request.attachId.toEntity()

        try {
            val attach = injector().get<AttachRepository>().use {
                it.findOne(id)
            }

            val file = File(attach.attachmentPath!!)
            val attachInputFileStream = FileInputStream(file)

            return DownloadAttachResponseV1.newBuilder()
                .setFile(ByteString.copyFrom(attachInputFileStream.readAllBytes()))
                .build()
        } catch (e: NoSuchElementException) {
            throw AttachNotFoundException("$id does not exist")
        }
    }

    fun deleteAttach(request: DeleteAttachRequestV1) {
        if (checkEmpty(request.id.toString())) throw BadRequestException("id must exist")
        val id = request.id.toEntity()

        try {
            val attach = injector().get<AttachRepository>().use {
                it.findOne(id)
            }
            injector().get<AttachRepository>().use {
                it.delete(id)
            }

            val file = File(attach.attachmentPath!!)
            file.delete()
        } catch (e: NoSuchElementException) {
            throw AttachNotFoundException("$id does not exist")
        }
    }
}
