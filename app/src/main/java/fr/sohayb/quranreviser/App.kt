package fr.sohayb.quranreviser

import android.app.Application
import fr.sohayb.quranreviser.analytics.injection.AnalyticsModule
import fr.sohayb.quranreviser.app.injection.AppModule
import fr.sohayb.quranreviser.app.injection.DataSourceModule
import fr.sohayb.quranreviser.app.database.DataBaseFactory.Companion.initialize
import fr.sohayb.quranreviser.main.injection.MainModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level
import timber.log.Timber

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        initialize(applicationContext)
        if(BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }

        startKoin {
            if(BuildConfig.DEBUG) {
                androidLogger(level = Level.DEBUG)
            }
            androidContext(this@App)
            modules(
                AppModule,
                MainModule,
                DataSourceModule,
                AnalyticsModule
            )
        }
    }
}