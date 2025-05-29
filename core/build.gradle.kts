plugins {
    kotlin("jvm") version "1.9.0"
    id("com.google.dagger.hilt.android") version "2.45" apply false
}

dependencies {
    implementation(project(":domain"))
}
