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

object NetworkLibs {
    const val OK_HTTP = "com.squareup.okhttp3:okhttp:${Versions.OK_HTTP}"
    const val OK_HTTP_LOGGER = "com.squareup.okhttp3:logging-interceptor:${Versions.OK_HTTP}"
    const val RETROFIT = "com.squareup.retrofit2:retrofit:${Versions.RETROFIT}"
    const val MOSHI = "com.squareup.moshi:moshi:${Versions.MOSHI}"

    val deps = listOf(RETROFIT, OK_HTTP, OK_HTTP_LOGGER, MOSHI)
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

    val deps = listOf(ANDROIDX_NAVIGATION, ANDROIDX_NAVIGATION_UI)
}

object UiLibs {
    const val ANDROIDX_VIEW_MODEL =
        "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.VIEW_MODEL}"
    const val ANDROIDX_LIVEDATA = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.LIVEDATA}"
    const val ANDROIDX_CONSTRAINT_LAYOUT =
        "com.android.support.constraint:constraint-layout:${Versions.CONSTRAINT_LAYOUT}"
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

    val base = listOf(
        ANDROIDX_TEST_RULES,
        ANDROIDX_TEST_RUNNER,
        MOCKK,
        ANDROIDX_TEST_EXT_JUNIT,
        ESPRESSO_CORE,
        HILT,
        HILT_COMPILER,
        NAVIGATION,
        ROBOELECTRIC
    )
}