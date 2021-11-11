object TestVersion {
    const val kotest = "4.3.2"
    const val mockk = "1.10.3"
    const val testcontainers = "1.15.3"
}

dependencies {
    implementation(project(":protobuf"))
    implementation("de.svenkubiak:jBCrypt:0.4")
    implementation("com.rabbitmq:amqp-client:5.9.0")
    implementation("p6spy:p6spy:3.7.0")
    implementation("org.projectlombok:lombok:1.18.20")
//    implementation("org.qlrm:qlrm:3.0.1")

    //test
    implementation("io.kotest:kotest-runner-junit5:${TestVersion.kotest}")
    implementation("io.kotest:kotest-assertions-core:${TestVersion.kotest}")
    implementation("io.kotest:kotest-property:${TestVersion.kotest}")
    implementation("io.mockk:mockk:${TestVersion.mockk}")
    implementation("org.testcontainers:postgresql:${TestVersion.testcontainers}")
    implementation("org.testcontainers:mongodb:${TestVersion.testcontainers}")
    implementation("org.testcontainers:postgresql:${TestVersion.testcontainers}")
    implementation("org.testcontainers:mongodb:${TestVersion.testcontainers}")

}