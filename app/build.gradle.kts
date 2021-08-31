import org.gradle.model.internal.core.ModelNodes.withType

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
        // Compiler flag to use experimental Compose APIs
        val compileArgs = listOfNotNull(
            "-Xopt-in=kotlin.RequiresOptIn",
            // Enable experimental coroutines APIs, including Flow
            "-Xopt-in=kotlinx.coroutines.ExperimentalCoroutinesApi",
            "-Xopt-in=kotlinx.coroutines.FlowPreview",
            "-Xopt-in=kotlin.Experimental"
        )
        freeCompilerArgs = compileArgs

    }
    buildFeatures {
        dataBinding = true
        compose = true
        // Disable unused AGP features
        buildConfig = false
        aidl = false
        renderScript = false
        resValues = false
        shaders = false
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.0.1"
    }

}

dependencies {
    implementation ("com.google.android.material:compose-theme-adapter:_")
    implementation (libs.ktx.lifecycle.livedata.core)
}
