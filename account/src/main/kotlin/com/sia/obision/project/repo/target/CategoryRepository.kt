package com.sia.obision.project.repo.target

import com.sia.core.repository.domain.Repository
import com.sia.obision.project.entity.target.Category
import java.util.*

interface CategoryRepository : Repository<Category, UUID> {
    fun checkExist(mainCategory: String, middleCategory: String?, subCategory: String?): String?
}
