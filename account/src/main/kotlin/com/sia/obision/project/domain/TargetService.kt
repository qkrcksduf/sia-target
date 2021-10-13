package com.sia.obision.project.domain

import com.sia.core.dependencyinjection.injector
import com.sia.obision.project.exception.IdDuplicationException
import com.sia.obision.project.repo.target.TargetRepository

object TargetService {

    fun exists(id: String) {
        injector().get<TargetRepository>().use {
            if (it.exists(id)) {
                val message = "target already exists"
                throw IdDuplicationException(message)
            }
        }
    }

}