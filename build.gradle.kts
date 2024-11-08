// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
   // alias(libs.plugins.android.application) apply false
  //  alias(libs.plugins.jetbrains.kotlin.android) apply false

    id("com.android.application") version "8.5.0" apply false
    id("com.android.library") version "8.1.0" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
    id("androidx.navigation.safeargs.kotlin") version "2.7.6" apply false
   // id("com.google.gms.google-services") version "4.4.0" apply false
    id("com.google.dagger.hilt.android") version "2.48.1" apply false
}