import com.google.protobuf.gradle.*

apply(plugin = "com.google.protobuf")

configurations.forEach {
    if (it.name.toLowerCase().contains("proto")) {
        it.attributes.attribute(Usage.USAGE_ATTRIBUTE, objects.named(Usage::class.java, "java-runtime"))
    }
}

dependencies {
    compileOnly("javax.annotation:javax.annotation-api:1.3.2")

    api("com.google.protobuf:protobuf-java-util:3.17.0")
    api("io.grpc:grpc-kotlin-stub:1.0.0")
    api("io.grpc:grpc-protobuf:1.39.0")
    api("io.grpc:grpc-netty-shaded:1.39.0")
}

protobuf {
    generatedFilesBaseDir = "$projectDir/build/generated/source" //컴파일 되는 위치

    protoc {
        artifact = "com.google.protobuf:protoc:3.17.0" //컴파일러 버전
    }

    // grpc 사용을 위한 plugin 설정
    // kotlin 으로 사용해도 자바가 필요하다. 자바파일로 컴파일되기 때문에
    plugins {
        id("grpc") {
            artifact = "io.grpc:protoc-gen-grpc-java:1.39.0"
        }

        id("grpckt") {
            artifact = "io.grpc:protoc-gen-grpc-kotlin:1.0.0:jdk7@jar"
        }
    }

    generateProtoTasks {
        ofSourceSet("main").forEach {
            it.plugins {
                id("grpc")
                id("grpckt")
            }
            //armeria docs를 만들기 위한 설정
            it.generateDescriptorSet = true
            it.descriptorSetOptions.includeSourceInfo = true
            it.descriptorSetOptions.includeImports = true
            it.descriptorSetOptions.path = "$buildDir/resources/META-INF/armeria/grpc/service-name.dsc"
        }
    }
}

sourceSets {
    main {
        java.srcDir("build/generated/source/main/grpckt")
        java.srcDir("build/generated/source/main/grpc")
        java.srcDir("build/generated/source/main/java")
    }
}