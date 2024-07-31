plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    id("kotlin-kapt")
}

android {
    namespace = "com.example.financeappprojectkotlin"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.financeappprojectkotlin"
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
    kotlinOptions {
        jvmTarget = "1.8"
    }
buildFeatures {
    viewBinding= true
}

}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.filament.android)
    implementation(libs.androidx.recyclerview)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)


        implementation("com.github.mikhaellopez:circularprogressbar:3.1.0")

    implementation ("com.github.Dimezis:BlurView:version-2.0.5")

// ViewModel
    // ViewModel
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:1.4.0")
    // ViewModel utilities for Compose
    implementation ("androidx.lifecycle:lifecycle-viewmodel-compose")
    // LiveData
    implementation ("androidx.lifecycle:lifecycle-livedata-ktx")
    // Lifecycles only (without ViewModel or LiveData)
    implementation ("androidx.lifecycle:lifecycle-runtime-ktx")
    // Lifecycle utilities for Compose
    implementation ("androidx.lifecycle:lifecycle-runtime-compose")

    // Saved state module for ViewModel
    implementation ("androidx.lifecycle:lifecycle-viewmodel-savedstate")

    // alternately - if using Java8, use the following instead of lifecycle-compiler
    implementation ("androidx.lifecycle:lifecycle-common-java21")

    // optional - helpers for implementing LifecycleOwner in a Service
    implementation ("androidx.lifecycle:lifecycle-service")

    // optional - ProcessLifecycleOwner provides a lifecycle for the whole application process
    implementation ("androidx.lifecycle:lifecycle-process")

    // optional - ReactiveStreams support for LiveData
    implementation ("androidx.lifecycle:lifecycle-reactivestreams-ktx")

    // optional - Test helpers for LiveData
    testImplementation ("androidx.arch.core:core-testing")

    // optional - Test helpers for Lifecycle runtime
    testImplementation ("androidx.lifecycle:lifecycle-runtime-testing")
    //
    implementation("com.github.bumptech.glide:glide:4.14.2")
    kapt("com.github.bumptech.glide:compiler:4.14.2")
    //


}