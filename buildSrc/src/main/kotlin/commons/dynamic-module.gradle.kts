package commons

plugins {
    id("com.android.dynamic-feature")
    kotlin("android")
    kotlin("kapt")
    id("dagger.hilt.android.plugin")
    id("androidx.navigation.safeargs.kotlin")
}

android {
    compileSdk = Sdk.COMPILE_SDK_VERSION

    defaultConfig {
        minSdk = Sdk.MIN_SDK_VERSION

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildFeatures {
        viewBinding = true
        compose = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_11.toString()
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

    sourceSets {
        getByName("main") {
            java.srcDir("src/main/kotlin")
        }
        getByName("test") {
            java.srcDir("src/test/kotlin")
        }
        getByName("androidTest") {
            java.srcDir("src/androidTest/kotlin")
        }
    }

    lint {
        disable("ObsoleteLintCustomCheck")

        isWarningsAsErrors = true
        isAbortOnError = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "${Versions.COMPOSE}"
    }

    testOptions {
        unitTests.isIncludeAndroidResources = true
        unitTests.isReturnDefaultValues = true
    }
}

dependencies {
    implementation(project(Modules.APP))
    implementation(project(Modules.CORE))
    implementation(project(Modules.Commons.UI))
    implementation(project(Modules.Commons.VIEWS))

    SupportLibs.deps.forEach { implementation(it) }
    UiLibs.deps.forEach { implementation(it) }
    ComposeLibs.deps.forEach { implementation(it) }

    TestingLib.deps.forEach { testImplementation(it) }

    kapt(KaptLibs.HILT_COMPILER)
}

kapt {
    correctErrorTypes = true
}
