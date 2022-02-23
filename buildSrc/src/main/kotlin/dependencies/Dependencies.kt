@file:Suppress("MemberVisibilityCanBePrivate")

object SupportLibs {
    const val ANDROIDX_APPCOMPAT = "androidx.appcompat:appcompat:${Versions.APPCOMPAT}"
    const val ANDROIDX_CORE_KTX = "androidx.core:core-ktx:${Versions.CORE_KTX}"
    const val HILT = "com.google.dagger:hilt-android:${Versions.HILT}"
    const val COROUTINES = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.COROUTINES}"
    const val COROUTINES_ANDROID =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.COROUTINES}"
    const val COROUTINES_REACTIVE =
        "org.jetbrains.kotlinx:kotlinx-coroutines-reactive:${Versions.COROUTINES}"

    val coroutines = listOf(COROUTINES, COROUTINES_ANDROID, COROUTINES_REACTIVE)
    val deps = listOf(
        ANDROIDX_APPCOMPAT,
        ANDROIDX_CORE_KTX,
        HILT,
        COROUTINES,
        COROUTINES_ANDROID,
        COROUTINES_REACTIVE
    )
}

object KaptLibs {
    const val HILT_COMPILER = "com.google.dagger:hilt-compiler:${Versions.HILT}"
    const val ROOM_COMPILER = "androidx.room:room-compiler:${Versions.ROOM}"

    val deps = listOf(HILT_COMPILER, ROOM_COMPILER)
}

object DesugaringLibs {
    const val ANDROID_DESUGARING = "com.android.tools:desugar_jdk_libs:${Versions.ANDROID_DESUGARING}"
}

object NetworkLibs {
    const val OK_HTTP = "com.squareup.okhttp3:okhttp:${Versions.OK_HTTP}"
    const val OK_HTTP_LOGGER = "com.squareup.okhttp3:logging-interceptor:${Versions.OK_HTTP}"
    const val RETROFIT = "com.squareup.retrofit2:retrofit:${Versions.RETROFIT}"
    const val RETROFIT_MOSHI = "com.squareup.retrofit2:converter-moshi:${Versions.RETROFIT}"
    const val MOSHI = "com.squareup.moshi:moshi:${Versions.MOSHI}"
    const val MOSHI_KTX = "com.squareup.moshi:moshi-kotlin:${Versions.MOSHI}"

    val deps = listOf(RETROFIT, RETROFIT_MOSHI, OK_HTTP, OK_HTTP_LOGGER, MOSHI, MOSHI_KTX)
}

object CacheLibs {
    const val ROOM = "androidx.room:room-runtime:${Versions.ROOM}"
    const val ROOM_KTX = "androidx.room:room-ktx:${Versions.ROOM}"

    val deps = listOf(ROOM, ROOM_KTX)
}

object NavigationLibs {
    const val ANDROIDX_NAVIGATION =
        "androidx.navigation:navigation-fragment-ktx:${Versions.NAVIGATION}"
    const val ANDROIDX_NAVIGATION_UI =
        "androidx.navigation:navigation-ui-ktx:${Versions.NAVIGATION}"
    const val ANDROIDX_NAVIGATION_DYNAMIC =
        "androidx.navigation:navigation-dynamic-features-fragment:${Versions.NAVIGATION}"

    val deps = listOf(ANDROIDX_NAVIGATION, ANDROIDX_NAVIGATION_UI, ANDROIDX_NAVIGATION_DYNAMIC)
}

object UiLibs {
    const val ANDROIDX_VIEW_MODEL =
        "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.VIEW_MODEL}"
    const val ANDROIDX_LIVEDATA = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.LIVEDATA}"
    const val ANDROIDX_CONSTRAINT_LAYOUT =
        "androidx.constraintlayout:constraintlayout:${Versions.CONSTRAINT_LAYOUT}"
    const val ANDROIDX_RECYCLER_VIEW =
        "androidx.recyclerview:recyclerview:${Versions.RECYCLER_VIEW}"
    const val MATERIAL = "com.google.android.material:material:${Versions.MATERIAL}"
    const val COIL = "io.coil-kt:coil:${Versions.COIL}"

    val deps = listOf(
        ANDROIDX_VIEW_MODEL,
        ANDROIDX_LIVEDATA,
        ANDROIDX_CONSTRAINT_LAYOUT,
        ANDROIDX_RECYCLER_VIEW,
        MATERIAL,
        COIL
    )
}

object ComposeLibs {
    const val COMPOSE_ACTIVITY = "androidx.activity:activity-compose:${Versions.COMPOSE_ACTIVITY}"
    const val COMPOSE_APPCOMPAT = "com.google.accompanist:accompanist-appcompat-theme:${Versions.COMPOSE_APPCOMPAT}"
    const val COMPOSE_UI = "androidx.compose.ui:ui:${Versions.COMPOSE}"
    const val COMPOSE_UI_TOOLING = "androidx.compose.ui:ui-tooling:${Versions.COMPOSE}"
    const val COMPOSE_FOUNDATION = "androidx.compose.foundation:foundation:${Versions.COMPOSE}"
    const val COMPOSE_MATERIAL = "androidx.compose.material:material:${Versions.COMPOSE}"
    const val COMPOSE_ANIMATION = "androidx.compose.animation:animation:${Versions.COMPOSE}"
    const val COMPOSE_VIEWMODEL = "androidx.lifecycle:lifecycle-viewmodel-compose:${Versions.LIVEDATA}"

    val deps = listOf(
        COMPOSE_UI,
        COMPOSE_UI_TOOLING,
        COMPOSE_FOUNDATION,
        COMPOSE_MATERIAL,
        COMPOSE_ACTIVITY,
        COMPOSE_APPCOMPAT,
        COMPOSE_ANIMATION,
        COMPOSE_VIEWMODEL
    )
}

object TestingLib {
    const val JUNIT = "junit:junit:${Versions.JUNIT}"
    const val MOCKK = "io.mockk:mockk:${Versions.MOCKK}"
    const val HILT = "com.google.dagger:hilt-android-testing:${Versions.HILT}"
    const val HILT_COMPILER = "com.google.dagger:hilt-compiler:${Versions.HILT}"
    const val COROUTINES = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.COROUTINES}"

    val deps = listOf(JUNIT, MOCKK, HILT, HILT_COMPILER, COROUTINES)
}

object AndroidTestingLib {
    const val ANDROIDX_TEST_RULES = "androidx.test:rules:${Versions.ANDROIDX_TEST}"
    const val ANDROIDX_TEST_RUNNER = "androidx.test:runner:${Versions.ANDROIDX_TEST}"
    const val ANDROIDX_TEST_EXT_JUNIT = "androidx.test.ext:junit:${Versions.ANDROIDX_TEST_EXT}"
    const val ESPRESSO_CORE = "androidx.test.espresso:espresso-core:${Versions.ESPRESSO_CORE}"
    const val MOCKK = "io.mockk:mockk-android:${Versions.MOCKK}"
    const val HILT = "com.google.dagger:hilt-android-testing:${Versions.HILT}"
    const val HILT_COMPILER = "com.google.dagger:hilt-compiler:${Versions.HILT}"
    const val ROOM = "androidx.room:room-testing:${Versions.ROOM}"
    const val NAVIGATION = "androidx.navigation:navigation-testing:${Versions.NAVIGATION}"
    const val ROBOELECTRIC = "org.robolectric:robolectric:${Versions.ROBOELECTRIC}"
    const val COMPOSE = "androidx.compose.ui:ui-test-junit4:${Versions.COMPOSE}"

    val base = listOf(
        ANDROIDX_TEST_RULES,
        ANDROIDX_TEST_RUNNER,
        MOCKK,
        ANDROIDX_TEST_EXT_JUNIT,
        ESPRESSO_CORE,
        HILT,
        HILT_COMPILER,
        NAVIGATION,
        ROBOELECTRIC,
        COMPOSE
    )
}
