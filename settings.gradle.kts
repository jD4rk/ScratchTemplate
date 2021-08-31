pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
    plugins {
        id("de.fayard.refreshVersions") version "0.20.0"
    }
}
plugins {
    id("de.fayard.refreshVersions")
}

enableFeaturePreview("VERSION_CATALOGS")
refreshVersions {
    featureFlags {
        enableFeaturePreview("VERSION_CATALOGS")
    }
}

// Change here to update Root project name in AS or IntelliJ
rootProject.name = "ScratchTemplate"
include (":app")
