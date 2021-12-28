plugins {
    `kotlin-dsl`
}
repositories {
    google()
    mavenCentral()
}

object Plugins {
    const val AGP = "7.0.4"
    const val DOKKA = "1.4.20"
    const val KOTLIN = "1.6.10"
    const val HILT = "2.40.5"
    const val NAVIGATION = "2.4.0-beta02"
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:${Plugins.KOTLIN}")
    implementation("com.android.tools.build:gradle:${Plugins.AGP}")
    implementation("org.jetbrains.dokka:dokka-gradle-plugin:${Plugins.DOKKA}")
    implementation("org.jetbrains.dokka:dokka-core:${Plugins.DOKKA}")
    implementation("com.google.dagger:hilt-android-gradle-plugin:${Plugins.HILT}")
    implementation("androidx.navigation:navigation-safe-args-gradle-plugin:${Plugins.NAVIGATION}")
}
