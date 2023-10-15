import Versions.CHUCKER_VERSION
import Versions.FIREBASE_AUTH_KTX_VERSION
import Versions.GLIDE_VERSION
import Versions.JUNIT_VERSION
import Versions.MOCKK_VERSION
import Versions.NAV_VERSION
import Versions.OKHTTP_VERRSION
import Versions.RETROFIT_VERSION
import Versions.ROOM_VERSION

object Versions {
    const val NAV_VERSION = "2.7.3"
    const val PAGING_VERSION = "3.1.1"
    const val GLIDE_VERSION = "4.11.0"
    const val MOCKK_VERSION = "1.9.1"
    const val JUNIT_VERSION = "5.8.2"
    const val EXOPLAYER_VERSION = "2.15.0"
    const val RETROFIT_VERSION = "2.9.0"
    const val OKHTTP_VERRSION = "4.9.1"
    const val READMORE_VERSION = "1.0.0"
    const val FIREBASE_AUTH_KTX_VERSION = "22.1.2"
    const val ROOM_VERSION = "2.5.2"
    const val CHUCKER_VERSION = "3.5.2"
}

object NavComponent {
    const val NAVIGATION_FRAGMENT = "androidx.navigation:navigation-fragment-ktx:$NAV_VERSION"
    const val NAVIGATION_UI = "androidx.navigation:navigation-ui-ktx:$NAV_VERSION"
    const val NAVIGATION_DYNAMIC_FEATURES_FRAGMENT =
        "androidx.navigation:navigation-dynamic-features-fragment:$NAV_VERSION"
    const val NAVIGATION_TESTING = "androidx.navigation:navigation-testing:$NAV_VERSION"
    const val NAVIGATION_COMPOSE = "androidx.navigation:navigation-compose:2.4.0-alpha10"
}

object AndroidX {
    const val MATERIAL = "androidx.compose.material:material:1.0.0-rc02"
    const val CONSTRAINT_LAYOUT = "androidx.constraintlayout:constraintlayout:2.1.0"
    const val APP_COMPAT = "androidx.appcompat:appcompat:1.3.1"
    const val LEGACY = "androidx.legacy:legacy-support-v4:1.0.0"
    const val LIFECYCLE_VIEW_MODEL = "androidx.lifecycle:lifecycle-viewmodel-ktx:2.4.1"
    const val LIFECYCLE_LIVEDATA = "androidx.lifecycle:lifecycle-livedata-ktx:2.4.1"
    const val LIFECYCLE_RUNTIME = "androidx.lifecycle:lifecycle-runtime-ktx:2.4.0"
    const val ACTIVITY = "androidx.activity:activity-ktx:1.3.1"
    const val FRAGMENT = "androidx.fragment:fragment-ktx:1.3.6"
    const val DATASTORE = "androidx.datastore:datastore-preferences:1.0.0"
}

object Firebase {
    const val FIREBASE_BOM = "com.google.firebase:firebase-bom:30.4.1"
    const val FIREBASE_AUTH = "com.google.firebase:firebase-auth-ktx:$FIREBASE_AUTH_KTX_VERSION"
    const val FIREBASE_PLAY_SERVICES = "com.google.android.gms:play-services-auth:20.3.0"
    const val FIREBASE = "com.google.firebase:firebase-firestore-ktx:23.0.1"
    const val FIREBASE_CONFIG = "com.google.firebase:firebase-config-ktx:21.0.1"
    const val FIREBASE_STORAGE = "com.google.firebase:firebase-storage-ktx:24.6.1"
    const val FIREBASE_MESSAGING = "com.google.firebase:firebase-messaging-ktx:23.0.1"
}

object Glide {
    const val GLIDE = "com.github.bumptech.glide:glide:$GLIDE_VERSION"
    const val GLIDE_COMPILER = "com.github.bumptech.glide:compiler:$GLIDE_VERSION"
    const val GLIDE_BLUR = "jp.wasabeef:glide-transformations:4.3.0"
}

object DaggerHilt {
    const val DAGGER_HILT = "com.google.dagger:hilt-android:2.38.1"
    const val DAGGER_HILT_COMPILER = "com.google.dagger:hilt-android-compiler:2.38.1"
    const val DAGGER_HILT_VIEW_MODEL = "androidx.hilt:hilt-lifecycle-viewmodel:1.0.0-alpha03"
    const val DAGGER_HILT_ANDROIDX_COMPILER = "androidx.hilt:hilt-compiler:1.0.0"
}

object Coroutines {
    const val COROUTINES = "org.jetbrains.kotlinx:kotlinx-coroutines-android:1.5.2"
    const val COROUTINES_SERVICES = "org.jetbrains.kotlinx:kotlinx-coroutines-play-services:1.5.2"
    const val COROUTINES_ANDROID = "org.jetbrains.kotlinx:kotlinx-coroutines-android:1.4.2"
}

object Preference {
    const val PREFERENCE = "androidx.preference:preference:1.1.0"
}

object Testing {
    const val ASSERTJ = "org.assertj:assertj-core:3.21.0"

    const val JUNIT_JUPITER_API = "org.junit.jupiter:junit-jupiter-api:$JUNIT_VERSION"
    const val JUNIT_JUPITER_ENGINE = "org.junit.jupiter:junit-jupiter-engine:$JUNIT_VERSION"
    const val JUNIT_JUPITER_PARAMS = "org.junit.jupiter:junit-jupiter-params:$JUNIT_VERSION"
    const val JUNIT_VINTAGE = "org.junit.vintage:junit-vintage-engine:$JUNIT_VERSION"

    const val TEST_RULE = "androidx.test:rules:1.1.0"
    const val ARCH_CORE_TESTING = "android.arch.core:core-testing:1.1.0"
    const val COROUTINES_TEST = "org.jetbrains.kotlinx:kotlinx-coroutines-test:1.3.3"

    const val MOCKK = "io.mockk:mockk:$MOCKK_VERSION"
    const val MOCKK_ANDROID = "io.mockk:mockk-android:$MOCKK_VERSION"
}

object Retrofit {
    const val RETROFIT = "com.squareup.retrofit2:retrofit:${RETROFIT_VERSION}"
    const val CONVERTER_GSON = "com.squareup.retrofit2:converter-gson:${RETROFIT_VERSION}"
    const val CONVERTER_JAXB = "com.squareup.retrofit2:converter-jaxb:${RETROFIT_VERSION}"
}

object OkHttp {
    const val OKHTTP = "com.squareup.okhttp3:okhttp:${OKHTTP_VERRSION}"
    const val LOGGING_INTERCEPTOR = "com.squareup.okhttp3:logging-interceptor:${OKHTTP_VERRSION}"
    const val OKHTTP_SIGNPOST = "se.akerfeldt:okhttp-signpost:$OKHTTP_VERRSION"
}

object Room {
    const val ROOM_RUNTIME = "androidx.room:room-runtime:$ROOM_VERSION"
    const val ROOM_COMPILER = "androidx.room:room-compiler:$ROOM_VERSION"
    const val ROOM_KTX = "androidx.room:room-ktx:$ROOM_VERSION"
}

object Chucker {
    const val LIBRARY = "com.github.chuckerteam.chucker:library:$CHUCKER_VERSION"
    const val LIBRARY_NO_OP = "com.github.chuckerteam.chucker:library-no-op:$CHUCKER_VERSION"
}

object TIMBER {
    const val TIMBER = "com.jakewharton.timber:timber:5.0.1"
}

