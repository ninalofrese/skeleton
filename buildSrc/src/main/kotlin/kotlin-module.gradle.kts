plugins {
    id("java-library")
    kotlin("jvm")
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))

    testImplementation(TestingLib.JUNIT)
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions {
        jvmTarget = "11"
    }
}

