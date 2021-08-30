plugins {
    id(PLUGINS.Android.application)
    kotlin(PLUGINS.Kotlin.android)
}

android {
    compileSdk = PROJECT.compileSdk
    defaultConfig {
        applicationId = PROJECT.appId
        minSdk = PROJECT.minSdk
        targetSdk = PROJECT.targetSdk
        versionCode = PROJECT.versionCode
        versionName = PROJECT.versionName
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles (getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        dataBinding = true
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.0.1"
    }

}

dependencies {

    // This is deps from "refreshVersion"
    implementation(AndroidX.constraintLayout)
    implementation(ANDROIDX.appCompat)
    implementation(COMPOSE.themeFromAppCompat)
    implementation(COMPOSE.themeFromMDC)
    implementation(COMPOSE.Accompanist.permission)
    // This is deps from "dependencies.kt" inside buildSrc
//    implementation (AndroidX.room.runtime)
//    implementation (AndroidX.room.compiler)
//
//    // Testing
//    implementation (AndroidX.room.testing)

}