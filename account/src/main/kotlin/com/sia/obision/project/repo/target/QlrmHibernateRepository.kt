package com.sia.obision.project.repo.target

import com.sia.core.repository.infra.hibernate.HibernateRepository
import com.sia.obision.project.entity.target.QlrmTest
import com.sia.obision.project.param.target.TestParam
import com.sia.obision.project.qlrm.qlrm.mapper.mapper.JpaResultMapper

class QlrmHibernateRepository : TestRepository, HibernateRepository<QlrmTest, String>(QlrmTest::class) {
    override fun test() {
        try {
            val jpaResultMapper = JpaResultMapper()
            val query = "SELECT t.id, t.name FROM qlrm_test t"
            val result = session.createNativeQuery(query)

            val resultList = jpaResultMapper.list(result, TestParam::class.java)
            resultList.forEach {
                println("testId: ${it.id}")
                println("testName: ${it.name}")
            }
        } catch (e: Exception) {
            println(e.stackTraceToString())
            throw Exception(e.stackTraceToString())
        }
    }
}