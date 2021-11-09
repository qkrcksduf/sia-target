package com.sia.obision.project

import com.sia.obision.project.repo.target.*
import org.koin.core.KoinApplication
import org.koin.dsl.bind
import org.koin.dsl.module

fun KoinApplication.projectInjectionModules(): KoinApplication {
    return modules(
        module {
            factory { TargetHibernateRepository() } bind TargetRepository::class
            factory { CategoryHibernateRepository() } bind CategoryRepository::class
            factory { RecordHibernateRepository() } bind RecordRepository::class
            factory { AttachHibernateRepository() } bind AttachRepository::class
            factory { QlrmHibernateRepository() } bind TestRepository::class
        }
    )
}