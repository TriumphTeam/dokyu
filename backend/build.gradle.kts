
plugins {
    kotlin("jvm") version "1.6.0"
    id("com.github.hierynomus.license") version "0.16.1"
}

allprojects {
    repositories {
        mavenCentral()
    }
}

subprojects {
    apply {
        plugin("org.jetbrains.kotlin.jvm")
        plugin("com.github.hierynomus.license")
    }
}

group = "dev.triumphteam"
version = "1.0.0-SNAPSHOT"