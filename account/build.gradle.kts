dependencies {
    implementation(project(":protobuf"))
    implementation("de.svenkubiak:jBCrypt:0.4")
    implementation("com.rabbitmq:amqp-client:5.9.0")
    implementation("p6spy:p6spy:3.7.0")
    implementation("org.projectlombok:lombok:1.18.20")
    implementation("org.qlrm:qlrm:3.0.1")
    compileOnly("org.projectlombok:lombok")
    annotationProcessor("org.projectlombok:lombok")
}