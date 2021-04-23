plugins {
    `kotlin-dsl`
}
repositories {
    google()
    mavenCentral()
}

object Plugins {
    const val AGP = "4.1.3"
    const val DOKKA = "1.4.20"
    const val KOTLIN = "1.4.31"
    const val HILT = "2.35"
    const val NAVIGATION = "2.3.5"
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:${Plugins.KOTLIN}")
    implementation("com.android.tools.build:gradle:${Plugins.AGP}")
    implementation("org.jetbrains.dokka:dokka-gradle-plugin:${Plugins.DOKKA}")
    implementation("org.jetbrains.dokka:dokka-core:${Plugins.DOKKA}")
    implementation("com.google.dagger:hilt-android-gradle-plugin:${Plugins.HILT}")
    implementation("androidx.navigation:navigation-safe-args-gradle-plugin:${Plugins.NAVIGATION}")
}