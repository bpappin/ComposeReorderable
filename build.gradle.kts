plugins {
    `maven-publish`
    id("com.android.library") version "8.3.1" apply false
    id("org.jetbrains.kotlin.multiplatform") version "1.9.22" apply false
    id("org.jetbrains.kotlin.android") version "1.9.22" apply false
    id("org.jetbrains.compose") version "1.6.1" apply false
}

ext {
    extra["compileSdkVersion"] = 34
    extra["minSdkVersion"] = 21
    extra["targetSdkVersion"] = 34
}

allprojects {
    repositories {
        google()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}
