object PROJECT {
    const val appId = "it.jdark.android"
    const val versionCode = 1
    const val versionName = "1.0"
    const val minSdk = 26
    const val compileSdk = 30
    const val targetSdk = 29
}

object BUILD {
    private const val gradleBuildTools = "7.0.1"
    const val androidGradlePlugin = "com.android.tools.build:gradle:${gradleBuildTools}"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${KOTLIN.version}"
//    const val sqlDelightPlugin = "com.squareup.sqldelight${Db.SQLDelight.sqlDelightVersion}"
}

object KOTLIN {
    const val version = "1.5.30"
}

object PLUGINS {
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

object COROUTINES {
    private const val coroutineVersion = "1.5.1"
    const val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:_"
    const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:_"
    // Testing
    const val test = "org.jetbrains.kotlinx:kotlinx-coroutines-test:_"
}

object ANDROIDX {
//    private const val appCompatVersion = "1.3.1"
//    private const val fragmentKtxVersion = "1.3.3"
//    private const val constraintLayoutVersion = "2.1.0"
//    private const val coreKtxVersion = "1.6.0"
//    private const val recyclerVersion = "1.2.1"
    const val appCompat = "androidx.appcompat:appcompat:_"
    const val constrainLayout = "androidx.constraintlayout:constraintlayout:_"
    const val fragmentKtx = "androidx.fragment:fragment-ktx:_"
    const val activityKtx = "androidx.activity:activity-ktx:_"
    const val recyclerview = "androidx.recyclerview:recyclerview:_"

    // Core Ktx
    const val coreKtx = "androidx.core:core-ktx:_"
}
//
object LIFECYCLE {
    private const val lifecycleVersion = "2.3.1"
    const val viewmodelKtx = "androidx.lifecycle:lifecycle-viewmodel-ktx:_"
    const val livedataKtx = "androidx.lifecycle:lifecycle-livedata-ktx:_"
    const val runtimeKtx = "androidx.lifecycle:lifecycle-runtime-ktx:_"
    const val viewModelSavedState =
        "androidx.lifecycle:lifecycle-viewmodel-savedstate:_"
    const val kaptAnnotation = "androidx.lifecycle:lifecycle-compiler:_"
}

object NAVIGATION {
    private const val navVersion = "2.3.5"
    // Navigation libraries (NO COMPOSE)
    const val fragment = "androidx.navigation:navigation-fragment-ktx:_"
    const val ui = "androidx.navigation:navigation-ui-ktx:_"
    // Testing
    const val testing = "androidx.navigation:navigation-testing:_"

}

object DB {
    object Room {
        private const val roomVersion = "2.3.0"
        const val coreKtx = "androidx.room:room-ktx:_"
        const val runtime = "androidx.room:room-runtime:_"
        const val KaptCompile = "androidx.room:room-compiler:_"

        // Testing
        const val testing = "androidx.room:room-testing:_"
    }

    object SQLDelight {
        const val sqlDelightVersion = "1.4.3"
        const val runtime = "com.squareup.sqldelight:runtime:_"
        const val androidDriver = "com.squareup.sqldelight:android-driver:_"
        const val nativeDriver = "com.squareup.sqldelight:native-driver:_"
    }
}


object COMPOSE {
//    private const val composeVersion = "1.0.1"
//    private const val navComposeVersion = "2.4.0-alpha07"
//    private const val composeActivityVersion = "1.3.1"
//    private const val composeConstraintLayoutVersion = "1.0.0-beta02"
    const val runtime = "androidx.compose.runtime:runtime:_"
    const val runtimeRx = "androidx.compose.runtime:runtime-rxjava2:_"
    const val runtimeLiveData = "androidx.compose.runtime:runtime-livedata:_"

    // Integration with activities
    const val composeActivity = "androidx.activity:activity-compose:_"

    // Compose Material Design
    const val material = "androidx.compose.material:material:_"
    const val materialIcon = "androidx.compose.material:material-icons-core:_"
    const val materialIconExt = "androidx.compose.material:material-icons-extended:_"

    // Animations
    const val animation = "androidx.compose.animation:animation:_"

    // Tooling support (Previews, etc.)
    const val ui = "androidx.compose.ui:ui:_"
    const val uiTooling = "androidx.compose.ui:ui-tooling:_"
    const val uiViewBinding = "androidx.compose.ui:ui-viewbinding:_"
    const val uiGeometry = "androidx.compose.ui:ui-geometry:_"
    const val uiGraphics = "androidx.compose.ui:ui-graphics:_"

    // Navigation
    const val navigation = "androidx.navigation:navigation-compose:_"

    // Foundation (Border, Background, Box, Image, Scroll, shapes, animations, etc.)
    const val foundation = "androidx.compose.foundation:foundation:_"
    const val compiler = "androidx.compose.compiler:compiler:_"
    const val constraintLayout =
        "androidx.constraintlayout:constraintlayout-compose:_"

    // Integration with ViewModels
    const val lifecycleVM = "androidx.lifecycle:lifecycle-viewmodel-compose:_"

    // UI Tests
    const val testjUnit = "androidx.compose.ui:ui-test-junit4:_"

    // TheWhen using a MDC theme
    const val themeFromMDC = "com.google.android.material:compose-theme-adapter:_"
//
//    // When using a AppCompat theme (
    const val themeFromAppCompat = "com.google.accompanist:accompanist-appcompat-theme:_"
//
    object Accompanist {
        private const val AccompanistVersion = "0.17.0"
        const val systemUiController =
            "com.google.accompanist:accompanist-systemuicontroller:_"
        const val appCompatTheme =
            "com.google.accompanist:accompanist-appcompat-theme:_"
        const val pager = "com.google.accompanist:accompanist-pager:_"
        const val pagerIndicator =
            "com.google.accompanist:accompanist-pager-indicators:_"
        const val swipeRefresh =
            "com.google.accompanist:accompanist-swiperefresh:_"
        const val placeholder = "com.google.accompanist:accompanist-placeholder:_"
        const val placeholderMaterial =
            "com.google.accompanist:accompanist-placeholder-material:_"
        const val drawablePainter =
            "com.google.accompanist:accompanist-drawablepainter:_"
        const val flowLayout = "com.google.accompanist:accompanist-flowlayout:_"
        const val permission = "com.google.accompanist:accompanist-permissions:_"
        const val navigationAnimation =
            "com.google.accompanist:accompanist-navigation-animation:_"
        const val navigationMaterial =
            "com.google.accompanist:accompanist-navigation-material:_"
    }
}


object GOOGLE {
    private const val materialVersion = "1.3.0"
    const val material = "com.google.android.material:material:_"

}

object NETWORK {
    private const val retrofitVersion = "2.9.0"
    private const val ktorVersion = "1.6.3"

    object Retrofit {
        const val core = "com.squareup.retrofit2:retrofit:_"
        const val moshiConverter = "com.squareup.retrofit2:converter-moshi:_"
    }

    object Ktor {
        const val core = "io.ktor:ktor-client-core:_"
        const val clientSerialization = "io.ktor:ktor-client-serialization:_"
        const val android = "io.ktor:ktor-client-android:_"
        const val ios = "io.ktor:ktor-client-ios:_"
    }
}


object imageLoad {
    // Coil
    private const val coilVersion = "1.3.0"
    const val coil = "io.coil-kt:coil:_"
}

object TEST {
    private const val junitVersion = "4.12"
    private const val junitExtVersion = "1.1.3"
    private const val espressoVersion = "3.4.0"
    private const val truthVersion = "1.0.1"
    private const val testVersion = "1.4.0"

    // jUnit
    const val junit = "junit:junit:_"

    // Truth
    const val truth = "com.google.truth:truth:_"
    const val truthExt = "androidx.test.ext:truth:_"

    // Optional -- Robolectric environment
    const val core = "androidx.test:core:_"
    const val coreKtx = "androidx.test:core-ktx:_"
    const val junitExt = "androidx.test.ext:junit:_"
//    const val junitExtKtx = "android.test.ext:junit-ktx:$junitExtVersion"

    // Espresso
    const val espressoCore = "androidx.test.espresso:espresso-core:_"
    const val espressoContrib = "androidx.test.espresso:espresso-contrib:_"
    const val espressoIntents = "androidx.test.espresso:espresso-intents:_"
    const val espressoAccessibility = "androidx.test.espresso:espresso-accessibility:_"
    const val espressoWeb = "androidx.test.espresso:espresso-web:_"
    const val espressoIdling = "androidx.test.espresso.idling:idling-concurrent:_"
}