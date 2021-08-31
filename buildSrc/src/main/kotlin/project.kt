object Project {
    const val appId = "it.jdark.android"
    const val versionCode = 1
    const val versionName = "_"
    const val minSdk = 26
    const val compileSdk = 30
    const val targetSdk = 29
}

object Plugins {
    object Android {
        const val application = "com.android.application"
        const val library = "com.android.library"
        const val androidNavigationSafeargs = "androidx.navigation.safeargs.kotlin"
    }

    object Kotlin {
        const val android = "android"
        const val multiplatform = "multiplatform"
        const val cocoapods = "native.cocoapods"
        const val serialization = "plugin.serialization"
        const val kapt = "kotlin-kapt"
    }

    object SqlDelight {
        const val plugin = "com.squareup.sqldelight"
    }
}