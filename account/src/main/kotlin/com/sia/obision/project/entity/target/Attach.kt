package com.sia.obision.project.entity.target

import java.util.*
import javax.persistence.*

@Entity(name = "attach")
@Table(
    name = "attach",
    uniqueConstraints = [
        UniqueConstraint(name = "record_file_unique", columnNames = ["attachmentPath", "record"])
    ]
)

data class Attach(
    @Id
    @GeneratedValue
    @Column(columnDefinition = "uuid default uuid_generate_v4()")
    val id: UUID? = null,
    var attachmentPath: String? = null,
    val fileName: String,
    val size: Int,
    val fileExtension: String,

    @ManyToOne
    @JoinColumn(name = "record")
    val record: Record
) {
    fun updateFilePath(recordId: UUID): String {
//        val attachDirPath = ConfigManager.getConfigOf<AttachConfig>().attachDirPath
        val attachDirPath = "attach"
        attachmentPath = buildString {
            append(attachDirPath)
            append("/$recordId")
            append("/$fileName")
        }
        return attachmentPath!!
    }
}
