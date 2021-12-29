plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
    id("dagger.hilt.android.plugin")
    id("androidx.navigation.safeargs.kotlin")
}

android {
    compileSdk = Sdk.COMPILE_SDK_VERSION

    defaultConfig {
        minSdk = Sdk.MIN_SDK_VERSION
        targetSdk = Sdk.TARGET_SDK_VERSION

        applicationId = AppCoordinates.APP_ID
        versionCode = AppCoordinates.APP_VERSION_CODE
        versionName = AppCoordinates.APP_VERSION_NAME
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildFeatures {
        viewBinding = true
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    setDynamicFeatures(
        mutableSetOf(
            Modules.Features.OI
        )
    )
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    lint {
        isWarningsAsErrors = true
        isAbortOnError = true
    }

    // Use this block to configure different flavors
//    flavorDimensions("version")
//    productFlavors {
//        create("full") {
//            dimension = "version"
//            applicationIdSuffix = ".full"
//        }
//        create("demo") {
//            dimension = "version"
//            applicationIdSuffix = ".demo"
//        }
//    }

    configurations.forEach { it.exclude("javax.annotation", "jsr250-api") }

    packagingOptions {
        resources.pickFirsts.add("META-INF/metadata.jvm.kotlin_module")
        resources.pickFirsts.add("META-INF/gradle/incremental.annotation.processors")
        resources.pickFirsts.add("META-INF/metadata.kotlin_module")
    }
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))

    implementation(project(Modules.CORE))

    SupportLibs.deps.forEach { implementation(it) }
    CacheLibs.deps.forEach { implementation(it) }
    NetworkLibs.deps.forEach { implementation(it) }
    KaptLibs.deps.forEach { "kapt"(it) }

    NavigationLibs.deps.forEach { implementation(it) }
    UiLibs.deps.forEach { implementation(it) }

    TestingLib.deps.forEach { testImplementation(it) }
    AndroidTestingLib.base.forEach { androidTestImplementation(it) }
}

kapt {
    correctErrorTypes = true
}
