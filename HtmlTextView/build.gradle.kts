plugins {
    id("com.android.library")
    id("maven-publish")
    id("org.jetbrains.kotlin.android") version "1.8.22" apply false
}

val group = "com.github.andreas-kkday"
val artifact = "htmlTextView"
val versionCode = 1
val versionName = "4.0"

android {
    compileSdkVersion(34)

    namespace = "org.sufficientlysecure.htmltextview"

    defaultConfig {
        minSdkVersion(21)
        targetSdkVersion(34)
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    afterEvaluate {
        publishing {
            publications {
                register("release", MavenPublication::class) {
                    from(components.findByName("release"))
                }
            }
        }
    }
}


dependencies {
    implementation("androidx.annotation:annotation:1.8.2")

}
