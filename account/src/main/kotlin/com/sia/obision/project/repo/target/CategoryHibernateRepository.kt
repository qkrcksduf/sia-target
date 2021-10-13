package com.sia.obision.project.repo.target

import com.sia.core.repository.infra.hibernate.HibernateRepository
import com.sia.obision.project.entity.target.Category
import java.util.*

class CategoryHibernateRepository : CategoryRepository, HibernateRepository<Category, UUID>(Category::class) {
}