plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.google.gms.google.services)
}

android {
    namespace = "com.example.languagetranslatorapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.languagetranslatorapp"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
//    implementation("com.google.firebase:firebase-auth:21.0.1")
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    implementation("com.google.firebase:firebase-core:17.3.0")
    implementation("com.google.firebase:firebase-ml-natural-language-language-id-model:20.0.8")
    implementation("com.google.firebase:firebase-ml-natural-language:22.0.1")
    implementation("com.google.firebase:firebase-ml-natural-language-translate-model:20.0.9")
//    implementation ("com.google.mlkit:translate:16.1.2")
    testImplementation(libs.junit)
//    implementation("com.google.firebase:firebase-crashlytics")
//    implementation("com.google.firebase:firebase-analytics")
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}