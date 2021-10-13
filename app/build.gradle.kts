dependencies {
    implementation(project(":protobuf"))
    implementation(project(":account"))
    implementation("com.linecorp.armeria:armeria:1.9.2")
    implementation("com.linecorp.armeria:armeria-grpc:1.9.2")
    implementation("io.github.microutils:kotlin-logging:1.12.5")
    implementation("ch.qos.logback:logback-classic:1.2.3")
    implementation("org.jetbrains.kotlinx:kotlinx-html:0.7.3")

    testImplementation("io.kotest:kotest-assertions-core:4.6.1")
    testImplementation("io.kotest:kotest-runner-junit5:4.6.1")
}