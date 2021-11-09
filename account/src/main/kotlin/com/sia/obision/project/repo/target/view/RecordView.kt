package com.sia.obision.project.repo.target.view

import java.sql.Timestamp
import java.util.*

data class RecordView(
    val recordId: UUID,
    val targetId: String,
    val targetName: String,
    val contents: String,
    val createdTime: Timestamp,
    val creator: String,
    val isFavoriteTarget: Boolean,
    val isFavoriteRecord: Boolean,
    val isEmergency: Boolean,
    val fileName: List<String> = emptyList(),
    val size: List<Int> = emptyList(),
    val attachId: List<UUID> = emptyList(),
    val fileExtension: List<String> = emptyList()
)
