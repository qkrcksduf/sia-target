plugins {
    kotlin("jvm") version "1.4.21"
    id("com.google.protobuf") version "0.8.15"
    id("org.jetbrains.kotlin.plugin.noarg") version "1.4.21"
    id("org.jetbrains.kotlin.plugin.allopen") version "1.4.21"

}

allprojects {
    group = "com.sia"
    version = "1.0-SNAPSHOT"

    apply(plugin = "kotlin")
    apply(plugin = "org.jetbrains.kotlin.plugin.noarg")
    apply(plugin = "org.jetbrains.kotlin.plugin.allopen")


    repositories {
        mavenCentral()
        jcenter()
        maven {
            setUrl("https://pkgs.dev.azure.com/si-analytics/_packaging/sia-core-armeria/maven/v1")
            name = "sia-core-armeria"
            credentials {
                username = "si-analytics"
                password = "3teojdqxz3dtixnhtjgzr73opygzoezk35mjcjntmvdrzpjupfqq"
            }
        }
    }
    allOpen {
        AllOpen.annotationList.forEach {
            annotation(it)
        }
    }

    noArg {
        AllOpen.annotationList.forEach {
            annotation(it)
        }
    }

    tasks {
        compileKotlin {
            kotlinOptions {
                freeCompilerArgs = listOf("-Xjsr305=strict")
                jvmTarget = "11"
            }
            dependsOn(processResources)
        }

        compileTestKotlin {
            kotlinOptions {
                freeCompilerArgs = listOf("-Xjsr305=strict")
                jvmTarget = "11"
            }
        }
    }

    configurations.forEach {
        if (it.name.toLowerCase().contains("proto")) {
            it.attributes.attribute(Usage.USAGE_ATTRIBUTE, objects.named(Usage::class.java, "java-runtime"))
        }
    }

    dependencies {
        implementation(kotlin("stdlib"))
        implementation("si-analytics:sia-core-armeria:0.3.1")
    }

}

object AllOpen {
    val annotationList =
        listOf("javax.persistence.Entity", "javax.persistence.MappedSuperclass", "javax.persistence.Embeddable")
}
