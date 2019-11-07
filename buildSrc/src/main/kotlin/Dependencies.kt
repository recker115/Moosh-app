import LibVersions.lifecycle_version

const val kotlinVersion = "1.3.50"

object Versions {
    const val minSDK = 19
    const val targetSDK = 29
    const val compileSDK = 29
//    const val buildTools = "28.0.3"

    const val versionCode = 223
    const val versionName = "19.11.0"
}

object LibVersions {
    const val kotlin = "1.3.50"

    const val retrofit = "2.6.1"
    const val okHttp = "3.12.3"
    const val glide = "4.9.0"
    const val butterKnife = "10.1.0"

    const val junit5 = "5.2.0"
    const val junitPlatform = "1.2.0"
    const val spek = "1.1.5"

    const val work_version = "2.2.0"
    const val kluent = "1.40"
    const val android_lifecycle = "2.1.0"
    const val lifecycle_version = "2.2.0-beta01" // viewmodel and livedata
    const val daggerVersion = "2.25.2"

}

object AndroidxLibs {
    const val multidex = "androidx.multidex:multidex:2.0.1"

    const val constraintlayout = "androidx.constraintlayout:constraintlayout:1.1.3"
    const val recyclerview = "androidx.recyclerview:recyclerview:1.0.0"

    const val appcompat = "androidx.appcompat:appcompat:1.1.0"
    const val material = "com.google.android.material:material:1.0.0"

    const val ktx = "androidx.core:core-ktx:1.0.1"
    const val fragment="androidx.fragment:fragment:1.1.0"
}

object BuildPlugins {
    const val androidApplication = "com.android.application"
    const val kotlinAndroid = "kotlin-android"
    const val kotlinAndroidExtensions = "kotlin-android-extensions"
    const val kotlinKapt = "kotlin-kapt"
}

object Libraries {
    private object Versions {
        const val jetpack = "1.0.0-beta01"
        const val constraintLayout = "1.1.2"
        const val ktx = "1.1.0-alpha05"
    }

    const val kotlinStdLib     = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$kotlinVersion"
    const val appCompat        = "androidx.appcompat:appcompat:${Versions.jetpack}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    const val ktxCore          = "androidx.core:core-ktx:${Versions.ktx}"
}

object TestLibraries {
    private object Versions {
        const val junit4 = "4.12"
        const val testRunner = "1.1.0-alpha4"
        const val espresso = "3.1.0-alpha4"
    }
    const val junit4     = "junit:junit:${Versions.junit4}"
    const val testRunner = "androidx.test:runner:${Versions.testRunner}"
    const val espresso   = "androidx.test.espresso:espresso-core:${Versions.espresso}"
}

object DependencyInjection {
    const val dagger = "com.google.dagger:dagger:${LibVersions.daggerVersion}"
    const val annotationProcessor = "com.google.dagger:dagger-compiler:${LibVersions.daggerVersion}"
    const val androidSupportDagger = "com.google.dagger:dagger-android-support:${LibVersions.daggerVersion}"
    const val androidSupportApt = "com.google.dagger:dagger-android-processor:${LibVersions.daggerVersion}"
}

object ArchitecureLibs{
    val work_manager = "androidx.work:work-runtime:${LibVersions.work_version}"
    val viewModelDependency = "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version"
    val livedataDependency = "androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version"
}