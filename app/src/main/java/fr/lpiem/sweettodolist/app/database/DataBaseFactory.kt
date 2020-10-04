package fr.lpiem.sweettodolist.app.database

import android.content.Context
import androidx.room.Room

class DataBaseFactory {

    companion object {
        var instance: AppDatabase? = null
        private val LOCK = Any()

        fun initialize(context: Context) = instance
            ?: synchronized(LOCK) {
            instance
                ?: createDatabase(
                    context
                )
                    .also { instance = it }
        }


        private fun createDatabase(context: Context) =
            Room.databaseBuilder(
                context.applicationContext,
                AppDatabase::class.java,
                "database-app.db"
            ).allowMainThreadQueries()
                .build()
    }
}