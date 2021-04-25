plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
    id("dagger.hilt.android.plugin")
    id("androidx.navigation.safeargs.kotlin")
}

android {
    compileSdkVersion(Sdk.COMPILE_SDK_VERSION)

    defaultConfig {
        minSdkVersion(Sdk.MIN_SDK_VERSION)
        targetSdkVersion(Sdk.TARGET_SDK_VERSION)

        applicationId = AppCoordinates.APP_ID
        versionCode = AppCoordinates.APP_VERSION_CODE
        versionName = AppCoordinates.APP_VERSION_NAME
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildFeatures {
        viewBinding = true
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    lintOptions {
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
        pickFirst("META-INF/metadata.jvm.kotlin_module")
        pickFirst("META-INF/gradle/incremental.annotation.processors")
        pickFirst("META-INF/metadata.kotlin_module")
    }
}

dependencies {
    implementation(kotlin("stdlib-jdk7"))

    implementation(project(":library:base"))
    implementation(project(":library:design"))
    implementation(project(":feature:oi"))
    implementation(project(":api:sample"))

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
