package com.sia.obision.project.application.target

import com.sia.core.dependencyinjection.injector
import com.sia.obision.project.repo.target.TestRepository

object QlrmService {

    fun test() {
        injector().get<TestRepository>().use {
            it.test()
        }
    }
}