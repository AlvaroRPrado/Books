plugins {
    //alias(libs.plugins.android.application)
  //  alias(libs.plugins.jetbrains.kotlin.android)
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-kapt")
    id("androidx.navigation.safeargs")
    //id("com.google.gms.google-services")
    id("kotlin-parcelize")
    id("dagger.hilt.android.plugin")
}

android {
    namespace = "com.prado.livros"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.prado.livros"
        minSdk = 26
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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }

    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    // Navigation
    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.navigation.ui.ktx)


    // Retrofit
    implementation(libs.retrofit)
    implementation(libs.gson)
    implementation(libs.converter.gson)

    // ViewModel
    implementation(libs.androidx.lifecycle.viewmodel.ktx)
    implementation(libs.androidx.activity.ktx)

    // LiveData
    implementation(libs.androidx.lifecycle.livedata.ktx)

    // Picasso
    implementation(libs.picasso)

    // RecyclerView for Search
    implementation(libs.androidx.recyclerview)

    // Lottie
    implementation(libs.lottie)

    // Animated Svg for Splash
    implementation(libs.animated.svg.view)

    // Room
    implementation(libs.androidx.room.runtime)
    kapt(libs.androidx.room.compiler)

    // Firebase
   // implementation (platform("com.google.firebase:firebase-bom:32.7.0"))
   // implementation("com.google.firebase:firebase-auth-ktx")
   // implementation("com.firebaseui:firebase-ui-auth:8.0.2")
   // implementation("com.google.firebase:firebase-firestore-ktx")

    // Hilt
    implementation(libs.hilt.android)
    kapt(libs.hilt.compiler)
}