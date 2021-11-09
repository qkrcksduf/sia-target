package com.sia.obision.project.domain

import com.sia.core.dependencyinjection.injector
import com.sia.obision.project.exception.IdDuplicationException
import com.sia.obision.project.repo.target.TargetRepository

object TargetService {

    fun checkExistTarget(id: String) {
        injector().get<TargetRepository>().use {
            if (it.exists(id)) {
                val message = "표적을 생성할 수 없습니다. 이미 존재하는 표적 ID 입니다."
//                val message = "$id already exists"
                throw IdDuplicationException(message)
            }
        }
    }
}
