pluginManagement {
    resolutionStrategy {
        eachPlugin {
            when (requested.id.id) {
                "com.android.library",
                "com.android.application",
                "com.android.dynamic-feature" -> {
                    useModule("com.android.tools.build:gradle:${requested.version}")
                }
            }
        }
    }
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}

rootProject.name = ("skeleton")

include(
    ":app",
    ":core",
    ":features:oi",
    ":commons:ui",
    ":commons:views",
    ":libraries:sample"
)

rootProject.buildFileName = "build.gradle.kts"
