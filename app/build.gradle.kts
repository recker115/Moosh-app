plugins {
    id(BuildPlugins.androidApplication)
    id(BuildPlugins.kotlinAndroid)
    id(BuildPlugins.kotlinAndroidExtensions)
    id(BuildPlugins.kotlinKapt)
}

android {
    compileSdkVersion(Versions.compileSDK)
    defaultConfig {
        applicationId = "com.recker.moosh"
        minSdkVersion(Versions.minSDK)
        targetSdkVersion(Versions.targetSDK)
        versionCode = Versions.versionCode
        versionName = Versions.versionName
        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
}

dependencies {

//    implementation(fileTree(org.gradle.internal.impldep.bsh.commands.dir("libs"), include(["*.jar"])))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7:$kotlinVersion")
    implementation(AndroidxLibs.constraintlayout)
    implementation(AndroidxLibs.appcompat)
    implementation(AndroidxLibs.material)
    implementation(AndroidxLibs.ktx)

    //Dagger 2
    implementation(DependencyInjection.dagger)
    kapt(DependencyInjection.annotationProcessor)
    implementation(DependencyInjection.androidSupportDagger)
    kapt(DependencyInjection.androidSupportApt)

    //viewmodel and livedata
    implementation(ArchitecureLibs.viewModelDependency)
    implementation(ArchitecureLibs.livedataDependency)

    //viewpager 2
    implementation(AndroidxLibs.viewpager2Dependency)
    
    testImplementation(TestLibraries.junit4)
    androidTestImplementation(TestLibraries.testRunner)
    androidTestImplementation(TestLibraries.espresso)
}
