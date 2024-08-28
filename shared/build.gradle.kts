plugins {
    kotlin("multiplatform")
    kotlin("native.cocoapods")
    id("com.android.library")
    kotlin("plugin.serialization") version "1.9.20"
}

version = "1.0"

kotlin {
  androidTarget()
  jvm()
    iosArm64()
    iosSimulatorArm64()

    cocoapods {
        summary = "Some description for the Shared Module"
        homepage = "Link to the Shared Module homepage"
        ios.deploymentTarget = "17.2"
        podfile = project.file("../iosApp/Podfile")
        framework {
            baseName = "shared"
        }
    }

    sourceSets {
        all {
            languageSettings.optIn("kotlin.RequiresOptIn")
            languageSettings.optIn("kotlin.experimental.ExperimentalObjCName")
        }
        commonMain.dependencies {
                // Ktor
                implementation("io.ktor:ktor-client-core:2.1.0")
                implementation("io.ktor:ktor-client-content-negotiation:2.0.3")
                implementation("io.ktor:ktor-serialization-kotlinx-json:2.0.3")

                // Koin
                api("io.insert-koin:koin-core:3.2.0")

                // Coroutines
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4")
            }
        commonTest.dependencies {
                implementation(kotlin("test"))
            }

        androidMain.dependencies {
                // Ktor
                implementation("io.ktor:ktor-client-android:2.0.3")

                // Lifecycle
                implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.1")
            }

        iosMain.dependencies {
                // Ktor
                implementation("io.ktor:ktor-client-ios:2.0.3")
            }
    }
}

android {
    compileSdk = 34
    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
    defaultConfig {
        minSdk = 21
    }
    namespace = "dev.tutorial.kmpizza"

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}
