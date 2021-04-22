plugins {
    `kotlin-dsl`
}
repositories {
    jcenter()
    google()
}

kotlinDslPluginOptions.experimentalWarning.set(false)

object Plugins {
    const val AGP = "4.1.3"
    const val DOKKA = "1.4.20"
    const val KOTLIN = "1.4.31"
    const val HILT = "2.34.1-beta"
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:${Plugins.KOTLIN}")
    implementation("com.android.tools.build:gradle:${Plugins.AGP}")
    implementation("org.jetbrains.dokka:dokka-gradle-plugin:${Plugins.DOKKA}")
    implementation("org.jetbrains.dokka:dokka-core:${Plugins.DOKKA}")
//    implementation("com.google.dagger:hilt-android-gradle-plugin:${Plugins.HILT}")
}