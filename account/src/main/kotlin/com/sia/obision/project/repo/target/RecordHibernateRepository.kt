package com.sia.obision.project.repo.target

import com.sia.core.repository.infra.hibernate.HibernateRepository
import com.sia.core.repository.infra.hibernate.querydsl.SortDirection
import com.sia.obision.project.entity.target.Record
import com.sia.obision.project.param.target.*
import com.sia.obision.project.repo.target.view.RecordView
import com.sia.obision.project.util.executeCountQuery
import com.sia.obision.project.util.filterQuery
import com.sia.obision.project.util.pagingQuery
import com.vladmihalcea.hibernate.type.array.ListArrayType
import org.hibernate.Session
import org.hibernate.type.*
import java.sql.Timestamp
import java.util.*

class RecordHibernateRepository : RecordRepository, HibernateRepository<Record, UUID>(Record::class) {
    override fun getSearchTotalCount(recordSearchParam: RecordSearchParam): Int {
        val query = buildString {
            defaultCountSelectQuery()
            selectOptionQuery(recordSearchParam.selectOption)
            searchQuery(recordSearchParam.searchProperty)
        }

        return executeCountQuery(query, session)
    }

    override fun getFilterTotalCount(recordFilterParam: RecordFilterParam): Int {
        val query = buildString {
            defaultCountSelectQuery()
            selectOptionQuery(recordFilterParam.selectOption)
            filterQuery(recordFilterParam.filterProperty, "r")
        }

        return executeCountQuery(query, session)
    }

    override fun recordFilter(recordFilterParam: RecordFilterParam): List<RecordView> {
        val query = buildString {
            defaultRecordSelectQuery()
            selectOptionQuery(recordFilterParam.selectOption)
            filterQuery(recordFilterParam.filterProperty, "r")
            groupQuery()
            recordSortQuery(recordFilterParam.sortDirection, recordFilterParam.recordSortProperty)
            pagingQuery(recordFilterParam.paging)
        }
        val result = executeQuery(query, session)
        return createRecordView(result)
    }

    override fun recordSearch(recordSearchParam: RecordSearchParam): List<RecordView> {
        val query = buildString {
            defaultRecordSelectQuery()
            selectOptionQuery(recordSearchParam.selectOption)
            searchQuery(recordSearchParam.searchProperty)
            groupQuery()
            recordSortQuery(recordSearchParam.sortDirection, recordSearchParam.recordSortProperty)
            pagingQuery(recordSearchParam.paging)
        }

        val result = executeQuery(query, session)
        return createRecordView(result)
    }
}

private fun StringBuilder.searchQuery(searchProperty: RecordSearchPropertyParam) {
    if (searchProperty.targetName != null) append(" AND t.name LIKE '%${searchProperty.targetName}%'")
    else if (searchProperty.creator != null) append(" AND r.creator LIKE '%${searchProperty.creator}%'")
    else if (searchProperty.contents != null) append(" AND r.contents LIKE '%${searchProperty.contents}%'")
}

@Suppress("MagicNumber")
private fun createRecordView(result: List<Array<*>>) =
    result.map {
        val recordId = it[0] as UUID
        val targetId = it[1] as String
        val targetName = it[2] as String
        val contents = it[3] as String
        val createdTime = it[4] as Timestamp
        val creator = it[5] as String
        val isFavoriteTarget = it[6] as Boolean
        val isFavoriteRecord = it[7] as Boolean
        val isEmergency = it[8] as Boolean
        val fileName = it[9] as List<String>
        val size = it[10] as List<Int>
        val attachId = it[11] as List<UUID>
        val fileExtension = it[12] as List<String>

        RecordView(
            recordId = recordId,
            targetId = targetId,
            targetName = targetName,
            contents = contents,
            createdTime = createdTime,
            creator = creator,
            isFavoriteTarget = isFavoriteTarget,
            isFavoriteRecord = isFavoriteRecord,
            isEmergency = isEmergency,
            fileName = fileName,
            size = size,
            attachId = attachId,
            fileExtension = fileExtension
        )
    }

private fun executeQuery(query: String, session: Session) =
    session.createNativeQuery(query)
        .addScalar("recordId", PostgresUUIDType())
        .addScalar("targetId", StringType())
        .addScalar("targetName", StringType())
        .addScalar("contents", StringType())
        .addScalar("createdTime", TimestampType())
        .addScalar("creator", StringType())
        .addScalar("isFavoriteTarget", BooleanType())
        .addScalar("isFavoriteRecord", BooleanType())
        .addScalar("isEmergency", BooleanType())
        .addScalar("fileName", ListArrayType())
        .addScalar("size", ListArrayType())
        .addScalar("attachId", ListArrayType())
        .addScalar("fileExtension", ListArrayType())
        .resultList as List<Array<*>>

private fun StringBuilder.defaultCountSelectQuery() {
    append(
        "SELECT COUNT(*) AS count FROM record r, target t, category c " +
            "WHERE r.target = t.id and t.category = c.id"
    )
}

private fun StringBuilder.defaultRecordSelectQuery() {
    append(
        "SELECT r.id AS recordId, t.id AS targetId, t.name AS targetName, " +
            "r.contents AS contents, r.created_time AS createdTime, r.creator AS creator, " +
            "t.is_favorite AS isFavoriteTarget, r.is_favorite AS isFavoriteRecord, " +
            "r.is_emergency AS isEmergency, array_remove(array_agg(a.file_name), null) AS fileName, " +
            "array_remove(array_agg(a.size), null) AS size, " +
            "array_remove(array_agg(a.id), null) AS attachId, " +
            "array_remove(array_agg(a.file_extension), null) AS fileExtension " +
            "FROM target t, category c, record r LEFT JOIN attach a ON a.record = r.id  " +
            "WHERE t.id = r.target AND c.id = t.category"
    )
}

private fun StringBuilder.groupQuery() {
    append(" GROUP BY r.id, t.id, r.contents, r.creator, r.is_favorite, r.is_emergency, t.name ")
}

private fun StringBuilder.selectOptionQuery(selectOption: RecordSelectOptionParam) {
    if (selectOption.isEmergency) append(" AND r.is_emergency = true")
    else if (selectOption.isFavoriteRecord) append(" AND r.is_favorite = true")
    else if (selectOption.isFavoriteTarget) append(" AND t.is_favorite = true")
}

private fun StringBuilder.recordSortQuery(sortDirection: SortDirection?, recordSortProperty: RecordSortPropertyParam?) {
    if (recordSortProperty != null) {
        append(" ORDER BY")
        when (recordSortProperty) {
            RecordSortPropertyParam.TARGET_NAME -> append(" t.name")
            RecordSortPropertyParam.CREATED_TIME -> append(" t.created_time")
        }
        if (sortDirection != null) {
            when (sortDirection) {
                SortDirection.ASC -> append(" ASC")
                SortDirection.DESC -> append(" DESC")
            }
        }
    }
}
