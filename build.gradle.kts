// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
    dependencies {
//        classpath(Build.kotlinGradlePlugin)
//        classpath(Build.androidGradlePlugin)
//        classpath("com.android.tools.build:gradle:_")
//        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:_")
        classpath(libs.buildscript.android)
        classpath(libs.buildscript.kotlin)
        classpath(libs.buildscript.sqlDelight)
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}