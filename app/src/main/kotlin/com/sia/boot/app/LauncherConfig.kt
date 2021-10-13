package com.sia.boot.app

import com.sia.core.config.ConfigManager
import com.sia.core.repository.domain.RepositoryConfig
import com.sia.core.repository.infra.hibernate.HibernateConfig
import com.sia.core.web.config.WebServerConfig

fun ConfigManager.registerLauncherConfigs() {
    register<RepositoryConfig>()
    register<WebServerConfig>()
    register<HibernateConfig>()
}