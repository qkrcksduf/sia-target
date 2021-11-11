package com.sia.boot.app

import ch.qos.logback.classic.LoggerContext
import ch.qos.logback.classic.util.ContextInitializer
import com.linecorp.armeria.common.grpc.GrpcSerializationFormats
import com.linecorp.armeria.server.Server
import com.linecorp.armeria.server.ServerBuilder
import com.linecorp.armeria.server.docs.DocService
import com.linecorp.armeria.server.grpc.GrpcService
import com.sia.core.config.ConfigManager
import com.sia.core.repository.domain.RepositoryConfig
import com.sia.core.repository.infra.hibernate.HibernateConfig
import com.sia.core.repository.infra.hibernate.HibernateManager
import com.sia.core.service.ServiceManager
import com.sia.core.util.TimeProvider
import com.sia.obision.project.getProjectEntities
import com.sia.obision.project.projectGrpcServices
import com.sia.obision.project.projectInjectionModules
import mu.KotlinLogging
import org.koin.core.context.startKoin
import org.koin.dsl.module
import org.slf4j.LoggerFactory

private val logger = KotlinLogging.logger {}

fun main() {
    val configManager = ConfigManager.apply {
        registerLauncherConfigs()
        registerAccountConfigs()
    }

    setHibernate(configManager)
    setKoin()

    val serviceManager = ServiceManager()

    newServerAndStart(serviceManager)
}

private fun setLogger() {
    val loggerContext = LoggerFactory.getILoggerFactory() as LoggerContext
    val ci = ContextInitializer(loggerContext)
    val url = ci.findURLOfDefaultConfigurationFile(true)
    loggerContext.reset()
    ci.configureByResource(url)
}

private fun setHibernate(configManager: ConfigManager) {
    val repositoryConfig: RepositoryConfig = configManager.getConfigOf()
    val hibernateConfig: HibernateConfig = configManager.getConfigOf()
    HibernateManager.setConfig(repositoryConfig, hibernateConfig)
        .registerAnnotatedClasses(getProjectEntities())
}

//        "keepalivetimeout",
//        "maxinboundmessagesize"

private fun setKoin() {
    startKoin {
        modules(
            module {
                single {
                    TimeProvider
                }
            }
        )
        projectInjectionModules()
    }
}


internal fun newServerAndStart(serviceManager: ServiceManager, httpPort: Int = 8080, httpsPort: Int = 443) =
    newServer(httpPort, httpsPort)
        .startServer(serviceManager)

private fun newServer(httpPort: Int, httpsPort: Int): Server = Server.builder()
    .setHttp(httpPort, httpsPort)
    .setGrpcService()
    .build()

private fun ServerBuilder.setHttp(httpPort: Int, httpsPort: Int) = this.apply {
    http(httpPort)
    https(httpsPort)
    tlsSelfSigned()
}

private fun ServerBuilder.setGrpcService() = this.apply {
    val grpcService = createGrpcService()
    service(grpcService)
    service("/", grpcService)
    serviceUnder("/docs", DocService.builder().build())
}

private fun createGrpcService(): GrpcService = GrpcService.builder()
    .addServices(projectGrpcServices())
    .supportedSerializationFormats(GrpcSerializationFormats.values())
    .enableUnframedRequests(true)
    .build()

private fun Server.startServer(serviceManager: ServiceManager) {
    Runtime.getRuntime().addShutdownHook(
        Thread {
            stop().join()
            serviceManager.stopService()
            logger.info("Server has been stopped.")
        }
    )

    serviceManager.startService()
    start().join()
    logger.info(
        "Server has been started. Saving DocService at http:127.0.0.1:{}/docs",
        activeLocalPort()
    )
}
