package com.sia.obision.project.repo.target

import com.sia.core.repository.domain.Repository
import com.sia.obision.project.entity.target.QlrmTest
import java.util.*

interface TestRepository : Repository<QlrmTest, String> {
    fun test()
}