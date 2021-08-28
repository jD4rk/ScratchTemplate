plugins {
    id(Plugins.Android.application)
    kotlin(Plugins.Kotlin.android)
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
    implementation(AndroidX.appCompat)
    implementation(Google.material)
    implementation(AndroidX.constrainLayout)
    implementation(AndroidX.coreKtx)

    // Old Navigation dependencies (no Compose)
    implementation(Navigation.fragment)
    implementation(Navigation.ui)

    testImplementation(Test.junit)

    androidTestImplementation(Test.espressoCore)
    androidTestImplementation(Test.junitExt)
}
//dependencies {
//
//    implementation 'androidx.core:core-ktx:1.6.0'
//    implementation 'androidx.appcompat:appcompat:1.3.1'
//    implementation 'com.google.android.material:material:1.4.0'
//    testImplementation 'junit:junit:4.+'
//    androidTestImplementation 'androidx.test.ext:junit:1.1.3'
//    androidTestImplementation 'androidx.test.espresso:espresso-core:3.4.0'
//}