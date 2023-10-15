package com.hyperone.driver

import android.app.Application
import com.google.firebase.FirebaseApp
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

/**
 * Custom Application class for the Recipes application.
 */
@HiltAndroidApp
class DriverApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())

        FirebaseApp.initializeApp(applicationContext)
    }
}