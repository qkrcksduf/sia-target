package com.sia.obision.project.domain

import com.sia.core.dependencyinjection.injector
import com.sia.obision.project.exception.CategoryDuplicationException
import com.sia.obision.project.repo.target.CategoryRepository
import java.util.*

object CategoryService {
    fun checkExistCategory(mainCategory: String, middleCategory: String?, subCategory: String?) {
        injector().get<CategoryRepository>().use {
            val result = it.checkExist(mainCategory, middleCategory, subCategory)
            if (result != null) {
                val message = buildString {
                    append("Category(mainCategory = $mainCategory")
                    if (middleCategory != null) {
                        append(", middleCategory = $middleCategory")
                        if (subCategory != null) {
                            append(", subCategory = $subCategory")
                        }
                    }
                    append(")")
                }
                throw CategoryDuplicationException(message)
            }
        }
    }
}
