package com.sia.obision.project.repo.target

import com.sia.core.repository.infra.hibernate.HibernateRepository
import com.sia.obision.project.entity.target.Category
import org.hibernate.type.PostgresUUIDType
import java.util.*

class CategoryHibernateRepository : CategoryRepository, HibernateRepository<Category, UUID>(Category::class) {
    override fun checkExist(mainCategory: String, middleCategory: String?, subCategory: String?): String? {
        val query = buildString {
            append("SELECT id AS id FROM category WHERE main_category = '$mainCategory'")
            if (middleCategory != null) {
                append(" AND middle_category = '$middleCategory'")
                if (subCategory != null) {
                    append(" AND sub_category = '$subCategory'")
                }
            }
        }

        val result = session.createNativeQuery(query)
            .addScalar("id", PostgresUUIDType())
            .resultList.firstOrNull()
        return result?.toString()
    }
}
