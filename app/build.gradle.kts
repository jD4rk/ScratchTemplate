plugins {
    id(Plugins.Android.application)
    kotlin(Plugins.Kotlin.android)
    id(Plugins.SqlDelight.plugin)
}

android {
    compileSdk = Project.compileSdk
    defaultConfig {
        applicationId = Project.appId
        minSdk = Project.minSdk
        targetSdk = Project.targetSdk
        versionCode = Project.versionCode
        versionName = Project.versionName
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
    implementation ("com.google.android.material:compose-theme-adapter:_")
    implementation (libs.ktx.lifecycle.livedata.core)
}
