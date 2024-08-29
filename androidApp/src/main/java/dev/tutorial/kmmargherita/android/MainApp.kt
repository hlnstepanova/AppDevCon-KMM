package dev.tutorial.kmmargherita.android

import android.app.Application
import dev.tutorial.kmmargherita.di.initKoin

@Suppress("unused")
class MainApp : Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin {}
    }
}
