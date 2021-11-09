package com.sia.obision.project.repo.target

import com.sia.core.repository.infra.hibernate.HibernateRepository
import com.sia.core.repository.infra.hibernate.querydsl.SortDirection
import com.sia.obision.project.entity.target.Target
import com.sia.obision.project.param.target.*
import com.sia.obision.project.repo.target.view.TargetView
import com.sia.obision.project.util.executeCountQuery
import com.sia.obision.project.util.filterQuery
import com.sia.obision.project.util.pagingQuery
import org.hibernate.Session
import org.hibernate.spatial.JTSGeometryType
import org.hibernate.spatial.dialect.postgis.PGGeometryTypeDescriptor
import org.hibernate.type.*
import org.locationtech.jts.geom.Geometry
import java.sql.Timestamp
import java.util.*

@Suppress("MagicNumber")
class TargetHibernateRepository : TargetRepository,
    HibernateRepository<Target, String>(Target::class) {

    override fun findByName(name: String): Target? {
        val query = "SELECT t FROM target t WHERE t.name = :name"
        return session.createQuery(query, Target::class.java)
            .setParameter("name", name)
            .resultList
            .firstOrNull()
    }

    override fun getSearchTotalCount(targetSearchParam: TargetSearchParam): Int {
        val query = buildString {
            defaultCountSelectQuery()
            isFavoriteQuery(targetSearchParam.isFavorite)
            targetSearchQuery(targetSearchParam.searchProperty)
        }

        return executeCountQuery(query, session)
    }

    override fun getFilterTotalCount(targetFilterParam: TargetFilterParam): Int {
        val query = buildString {
            defaultCountSelectQuery()
            isFavoriteQuery(targetFilterParam.isFavorite)
            filterQuery(targetFilterParam.filterProperty, "t")
        }

        return executeCountQuery(query, session)
    }

    override fun targetSearch(targetSearchParam: TargetSearchParam): List<TargetView> {
        val query = buildString {
            defaultTargetSelectQuery()
            isFavoriteQuery(targetSearchParam.isFavorite)
            targetSearchQuery(targetSearchParam.searchProperty)
            targetSortQuery(targetSearchParam.targetSortProperty, targetSearchParam.sortDirection)
            pagingQuery(targetSearchParam.paging)
        }
        val result = executeQuery(session, query)
        return createTargetView(result)
    }

    override fun targetFilter(targetFilterParam: TargetFilterParam): List<TargetView> {
        val query = buildString {
            defaultTargetSelectQuery()
            isFavoriteQuery(targetFilterParam.isFavorite)
            filterQuery(targetFilterParam.filterProperty, "t")
            targetSortQuery(targetFilterParam.targetSortProperty, targetFilterParam.sortDirection)
            pagingQuery(targetFilterParam.paging)
        }
        val result = executeQuery(session, query)
        return createTargetView(result)
    }
}

private fun StringBuilder.targetSearchQuery(searchProperty: TargetSearchPropertyParam) {
    if (searchProperty.id != null)
        append(" AND t.id LIKE '%${searchProperty.id}%'")
    else if (searchProperty.name != null)
        append(" AND t.name LIKE '%${searchProperty.name}%'")
    else if (searchProperty.category != null)
        append(
            " AND c.main_category LIKE '%${searchProperty.category}%' " +
                "OR c.middle_category " +
                "LIKE '%${searchProperty.category}%' OR c.sub_category " +
                "LIKE '%${searchProperty.category}%'"
        )
}

private fun StringBuilder.defaultCountSelectQuery() {
    append("SELECT COUNT(*) AS count FROM target t, category c WHERE t.category = c.id")
}

private fun StringBuilder.defaultTargetSelectQuery() {
    append(
        "SELECT t.id AS targetId, t.name AS name, c.id AS categoryId, c.main_category AS mainCategory, " +
            "c.middle_category AS middleCategory, c.sub_category AS subCategory, t.mgrs AS mgrs, " +
            "t.geography AS geography, t.be AS be, t.jdpi AS jdpi, t.created_time AS createdTime, " +
            "t.is_favorite AS isFavorite FROM target t, category c WHERE t.category = c.id"
    )
}

private fun StringBuilder.isFavoriteQuery(isFavorite: Boolean) {
    if (isFavorite) append(" AND t.is_favorite = $isFavorite")
}

private fun StringBuilder.targetSortQuery(
    targetSortProperty: TargetSortPropertyParam?,
    sortDirection: SortDirection?
) {
    if (targetSortProperty != null) {
        append(" ORDER BY")
        when (targetSortProperty) {
            TargetSortPropertyParam.TARGET_ID -> append(" t.id")
            TargetSortPropertyParam.TARGET_NAME -> append(" t.name")
            TargetSortPropertyParam.CREATED_TIME -> append(" t.created_time")
        }
        if (sortDirection != null) {
            when (sortDirection) {
                SortDirection.ASC -> append(" ASC")
                SortDirection.DESC -> append(" DESC")
            }
        }
    }
}

private fun executeQuery(session: Session, query: String) =
    session.createNativeQuery(query)
        .addScalar("targetId", StringType())
        .addScalar("name", StringType())
        .addScalar("categoryId", PostgresUUIDType())
        .addScalar("mainCategory", StringType())
        .addScalar("middleCategory", StringType())
        .addScalar("subCategory", StringType())
        .addScalar("mgrs", StringType())
        .addScalar("geography", JTSGeometryType(PGGeometryTypeDescriptor.INSTANCE))
        .addScalar("be", StringType())
        .addScalar("jdpi", StringType())
        .addScalar("createdTime", TimestampType())
        .addScalar("isFavorite", BooleanType())
        .resultList as List<Array<*>>

@Suppress("MagicNumber")
private fun createTargetView(result: List<Array<*>>) =
    result.map {
        val targetId = it[0] as String
        val name = it[1] as String
        val categoryId = it[2] as UUID
        val mainCategory = it[3] as String
        val middleCategory = it[4] as? String
        val subCategory = it[5] as? String
        val mgrs = it[6] as? String
        val geography = it[7] as? Geometry
        val be = it[8] as? String
        val jdpi = it[9] as? String
        val createdTime = it[10] as Timestamp
        val isFavorite = it[11] as Boolean

        TargetView(
            targetId = targetId,
            name = name,
            categoryId = categoryId,
            mainCategory = mainCategory,
            middleCategory = middleCategory,
            subCategory = subCategory,
            mgrs = mgrs,
            geography = geography?.centroid,
            be = be,
            jdpi = jdpi,
            createdTime = createdTime,
            isFavorite = isFavorite,
        )
    }
