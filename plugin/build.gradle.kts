plugins {
    groovy
    `maven-publish`
    signing
}

apply(from = "./upload.gradle.kts")

buildscript {
    repositories {
        mavenCentral()
    }
}

repositories {
    mavenCentral()
    google()
    maven {
        url = uri("https://plugins.gradle.org/m2/")
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(gradleApi())
    implementation(localGroovy())
    implementation("org.javassist:javassist:3.30.2-GA")
    implementation("com.android.tools.build:gradle:8.7.3")
    //noinspection GradleDependency
    implementation("com.android.tools:common:31.7.3")
    implementation("org.ow2.asm:asm-commons:9.7.1")
    implementation("org.dom4j:dom4j:2.1.4")
    implementation("com.github.johnrengelman:shadow:8.1.1")
}