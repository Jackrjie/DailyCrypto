package com.jackrjie.dailycrypto

import android.app.Application
import com.jackrjie.dailycrypto.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class DailyCryptoApp: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@DailyCryptoApp)
            androidLogger()

            modules(appModule)
        }
    }
}