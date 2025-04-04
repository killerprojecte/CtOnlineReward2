plugins {
    `java-library`
    java
    id("org.jetbrains.kotlin.jvm") version "2.1.20"
    id("io.izzel.taboolib") version "2.0.11"
    id("com.github.johnrengelman.shadow") version "7.1.2" apply false

}


subprojects {
    apply(plugin = "com.github.johnrengelman.shadow")


    repositories {
        maven("https://maven.aliyun.com/repository/public")
        maven("https://repo.tabooproject.org/repository/releases")
        maven("https://jitpack.io")
        mavenCentral()
    }


}

kotlin {
    sourceSets.all {
        languageSettings {
            languageVersion = "2.0"
        }
    }
}
