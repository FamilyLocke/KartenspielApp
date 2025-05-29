plugins {
    kotlin("jvm") version "1.9.0"
}

dependencies {
    implementation(project(":domain"))
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.1")
}
