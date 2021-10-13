package com.sia.obision.project.repo.target

import com.sia.core.repository.infra.hibernate.HibernateRepository
import com.sia.obision.project.entity.target.Target
import com.sia.obision.project.param.target.TargetFilterParam
import com.sia.obision.project.param.target.TargetSearchParam
import com.sia.obision.project.param.target.TargetSortPropertyParam
import com.sia.obision.project.repo.target.view.TargetSearch
import org.locationtech.jts.geom.Point
import org.qlrm.mapper.JpaResultMapper

class TargetHibernateRepository : TargetRepository, HibernateRepository<Target, String>(Target::class) {

  override fun targetSearch(targetSearchParam: TargetSearchParam): List<TargetSearch> {
    val query =
      buildString {
        append("SELECT t.id, t.name, c.id, c.main_category, c.middle_category, c.sub_category, t.mgrs, t.be, t.jdpi, t.created_time, t.is_favorite FROM target t, category c WHERE t.category = c.id")

        if (targetSearchParam.isFavorite) append(" AND t.is_favorite = ${targetSearchParam.isFavorite}")

        if (targetSearchParam.searchProperty.id != null)
          append(" AND t.id LIKE '%${targetSearchParam.searchProperty.id}%'")
        else if (targetSearchParam.searchProperty.name != null)
          append(" AND t.name LIKE '%${targetSearchParam.searchProperty.name}%'")
        else if (targetSearchParam.searchProperty.category != null)
          append(" AND c.main_category LIKE '%${targetSearchParam.searchProperty.category}%' OR c.middle_category LIKE '%${targetSearchParam.searchProperty.category}%' OR c.sub_category LIKE '%${targetSearchParam.searchProperty.category}%'")

        if (targetSearchParam.targetSortProperty != null) {
          append(" ORDER BY")
          when (targetSearchParam.targetSortProperty) {
            TargetSortPropertyParam.TARGET_ID -> append(" t.id")
            TargetSortPropertyParam.TARGET_NAME -> append(" t.name")
            TargetSortPropertyParam.CREATED_TIME -> append(" t.created_time")
          }
        }

        if (targetSearchParam.paging.offset != 0 && targetSearchParam.paging.limit != 0) {
          append(" offset ${targetSearchParam.paging.offset} limit ${targetSearchParam.paging.limit}")
        }
      }
    val result = session.createNativeQuery(query)
    val jpaResultMapper = JpaResultMapper()
    //    JpaResultMapper.PRIMITIVE_TO_BOX_TYPE_MAP.put(
    //      Point.class, Point .class)

    return jpaResultMapper.list(result, TargetSearch::class.java)
  }

  override fun targetFilter(targetFilterParam: TargetFilterParam): List<Target> {
    TODO("Not yet implemented")
  }

}


