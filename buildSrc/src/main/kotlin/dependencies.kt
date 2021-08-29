object Project {
    const val appId = "it.jdark.android"
    const val versionCode = 1
    const val versionName = "1.0"
    const val minSdk = 26
    const val compileSdk = 30
    const val targetSdk = 29
}

@SuppressWarnings("unused")
object Build {
    private const val gradleBuildTools = "7.0.1"
    const val androidGradlePlugin = "com.android.tools.build:gradle:${gradleBuildTools}"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Kotlin.version}"
    const val sqlDelightPlugin = "com.squareup.sqldelight${Db.SQLDelight.sqlDelightVersion}"
}

object Kotlin {
    const val version = "1.5.30"
}

@SuppressWarnings("unused")
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

@SuppressWarnings("unused")
object Coroutines {
    private const val coroutineVersion = "1.5.1"
    const val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutineVersion"
    const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutineVersion"
    // Testing
    const val test = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${coroutineVersion}"

}

@SuppressWarnings("unused")
object AndroidX {
    private const val appCompatVersion = "1.3.1"
    private const val fragmentKtxVersion = "1.3.3"
    private const val constraintLayoutVersion = "2.1.0"
    private const val coreKtxVersion = "1.6.0"
    private const val recyclerVersion = "1.2.1"
    const val appCompat = "androidx.appcompat:appcompat:$appCompatVersion"
    const val constrainLayout = "androidx.constraintlayout:constraintlayout:${constraintLayoutVersion}"
    const val fragmentKtx = "androidx.fragment:fragment-ktx:$fragmentKtxVersion"
    const val activityKtx = "androidx.activity:activity-ktx:$appCompatVersion"
    const val recyclerview = "androidx.recyclerview:recyclerview:$recyclerVersion"

    // Core Ktx
    const val coreKtx = "androidx.core:core-ktx:$coreKtxVersion"
}

@SuppressWarnings("unused")
object Lifecycle {
    private const val lifecycleVersion = "2.3.1"
    const val viewmodelKtx = "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycleVersion"
    const val livedataKtx = "androidx.lifecycle:lifecycle-livedata-ktx:$lifecycleVersion"
    const val runtimeKtx = "androidx.lifecycle:lifecycle-runtime-ktx:$lifecycleVersion"
    const val viewModelSavedState =
        "androidx.lifecycle:lifecycle-viewmodel-savedstate:$lifecycleVersion"
    const val kaptAnnotation = "androidx.lifecycle:lifecycle-compiler:$lifecycleVersion"
}

@SuppressWarnings("unused")
object Navigation {
    private const val navVersion = "2.3.5"
    // Navigation libraries (NO COMPOSE)
    const val fragment = "androidx.navigation:navigation-fragment-ktx:$navVersion"
    const val ui = "androidx.navigation:navigation-ui-ktx:$navVersion"
    // Testing
    const val testing = "androidx.navigation:navigation-testing:${navVersion}"

}

@SuppressWarnings("unused")
object Db {
    object Room {
        private const val roomVersion = "2.3.0"
        const val coreKtx = "androidx.room:room-ktx:$roomVersion"
        const val runtime = "androidx.room:room-runtime:$roomVersion"
        const val KaptCompile = "androidx.room:room-compiler:$roomVersion"

        // Testing
        const val testing = "androidx.room:room-testing:${roomVersion}"
    }

    object SQLDelight {
        const val sqlDelightVersion = "1.4.3"
        const val runtime = "com.squareup.sqldelight:runtime:${sqlDelightVersion}"
        const val androidDriver = "com.squareup.sqldelight:android-driver:${sqlDelightVersion}"
        const val nativeDriver = "com.squareup.sqldelight:native-driver:${sqlDelightVersion}"
    }
}


@SuppressWarnings("unused")
object Compose {
    private const val composeVersion = "1.0.1"
    private const val navComposeVersion = "2.4.0-alpha07"
    private const val composeActivityVersion = "1.3.1"
    private const val composeConstraintLayoutVersion = "1.0.0-beta02"
    const val runtime = "androidx.compose.runtime:runtime:${composeVersion}"
    const val liveData = "androidx.compose.runtime:runtime-livedata:${composeVersion}"

    // Integration with activities
    const val composeActivity = "androidx.activity:activity-compose:$composeActivityVersion"

    // Compose Material Design
    const val material = "androidx.compose.material:material:$composeVersion"
    const val materialIcon = "androidx.compose.material:material-icons-core:$composeVersion"
    const val materialIconExt = "androidx.compose.material:material-icons-extended:$composeVersion"

    // Animations
    const val animation = "androidx.compose.animation:animation:$composeVersion"

    // Tooling support (Previews, etc.)
    const val ui = "androidx.compose.ui:ui:${composeVersion}"
    const val uiTooling = "androidx.compose.ui:ui-tooling:$composeVersion"

    // Navigation
    const val navigation = "androidx.navigation:navigation-compose:$navComposeVersion"

    // Foundation (Border, Background, Box, Image, Scroll, shapes, animations, etc.)
    const val foundation = "androidx.compose.foundation:foundation:${composeVersion}"
    const val compiler = "androidx.compose.compiler:compiler:${composeVersion}"
    const val constraintLayout =
        "androidx.constraintlayout:constraintlayout-compose:${composeConstraintLayoutVersion}"

    // Integration with ViewModels
    const val lifecycleVM = "androidx.lifecycle:lifecycle-viewmodel-compose:$composeVersion"

    // UI Tests
    const val testjUnit = "androidx.compose.ui:ui-test-junit4:$composeVersion"

    // TheWhen using a MDC theme
    const val themeFromMDC = "com.google.android.material:compose-theme-adapter:$composeVersion"

    // When using a AppCompat theme (
    const val themeFromAppCompat = "com.google.accompanist:accompanist-appcompat-theme:0.16.0"

    object Accompanist {
        private const val AccompanistVersion = "0.17.0"
        const val systemUiController =
            "com.google.accompanist:accompanist-systemuicontroller:$AccompanistVersion"
        const val appCompatTheme =
            "com.google.accompanist:accompanist-appcompat-theme:$AccompanistVersion"
        const val pager = "com.google.accompanist:accompanist-pager:$AccompanistVersion"
        const val pagerIndicator =
            "com.google.accompanist:accompanist-pager-indicators:$AccompanistVersion"
        const val swipeRefresh =
            "com.google.accompanist:accompanist-swiperefresh:$AccompanistVersion"
        const val placeholder = "com.google.accompanist:accompanist-placeholder:$AccompanistVersion"
        const val placeholderMaterial =
            "com.google.accompanist:accompanist-placeholder-material:$AccompanistVersion"
        const val drawablePainter =
            "com.google.accompanist:accompanist-drawablepainter:$AccompanistVersion"
        const val flowLayout = "com.google.accompanist:accompanist-flowlayout:$AccompanistVersion"
        const val permission = "com.google.accompanist:accompanist-permissions:$AccompanistVersion"
        const val navigationAnimation =
            "com.google.accompanist:accompanist-navigation-animation:$AccompanistVersion"
        const val navigationMaterial =
            "com.google.accompanist:accompanist-navigation-material:$AccompanistVersion"

    }

}


@SuppressWarnings("unused")
object Google {
    private const val materialVersion = "1.3.0"
    const val material = "com.google.android.material:material:$materialVersion"

}

@SuppressWarnings("unused")
object Network {
    private const val retrofitVersion = "2.9.0"
    private const val ktorVersion = "1.6.3"

    object Retrofit {
        const val core = "com.squareup.retrofit2:retrofit:$retrofitVersion"
        const val moshiConverter = "com.squareup.retrofit2:converter-moshi:$retrofitVersion"
    }

    object Ktor {
        const val core = "io.ktor:ktor-client-core:${ktorVersion}"
        const val clientSerialization = "io.ktor:ktor-client-serialization:${ktorVersion}"
        const val android = "io.ktor:ktor-client-android:${ktorVersion}"
        const val ios = "io.ktor:ktor-client-ios:${ktorVersion}"
    }
}


@SuppressWarnings("unused")
object imageLoad {
    // Coil
    private const val coilVersion = "1.3.0"
    const val coil = "io.coil-kt:coil:$coilVersion"
}

@SuppressWarnings("unused")
object Test {
    private const val junitVersion = "4.12"
    private const val junitExtVersion = "1.1.3"
    private const val espressoVersion = "3.4.0"
    private const val truthVersion = "1.0.1"
    private const val testVersion = "1.4.0"

    // jUnit
    const val junit = "junit:junit:$junitVersion"

    // Truth
    const val truth = "com.google.truth:truth:$truthVersion"
    const val truthExt = "androidx.test.ext:truth:$testVersion"

    // Optional -- Robolectric environment
    const val core = "androidx.test:core:$testVersion"
    const val coreKtx = "androidx.test:core-ktx:$testVersion"
    const val junitExt = "androidx.test.ext:junit:$junitExtVersion"
//    const val junitExtKtx = "android.test.ext:junit-ktx:$junitExtVersion"

    // Espresso
    const val espressoCore = "androidx.test.espresso:espresso-core:$espressoVersion"
    const val espressoContrib = "androidx.test.espresso:espresso-contrib:$espressoVersion"
    const val espressoIntents = "androidx.test.espresso:espresso-intents:$espressoVersion"
    const val espressoAccessibility = "androidx.test.espresso:espresso-accessibility:$espressoVersion"
    const val espressoWeb = "androidx.test.espresso:espresso-web:$espressoVersion"
    const val espressoIdling = "androidx.test.espresso.idling:idling-concurrent:$espressoVersion"
}