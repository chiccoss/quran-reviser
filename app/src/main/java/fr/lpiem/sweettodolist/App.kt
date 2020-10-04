package fr.lpiem.sweettodolist

import android.app.Application
import fr.lpiem.sweettodolist.analytics.injection.AnalyticsModule
import fr.lpiem.sweettodolist.app.injection.AppModule
import fr.lpiem.sweettodolist.app.injection.DataSourceModule
import fr.lpiem.sweettodolist.app.database.DataBaseFactory.Companion.initialize
import fr.lpiem.sweettodolist.main.injection.MainModule
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