package fr.sohayb.quranreviser.app.database

import androidx.room.Database
import androidx.room.RoomDatabase
import fr.sohayb.quranreviser.app.database.daos.SequenceDao
import fr.sohayb.quranreviser.app.database.daos.UserDao
import fr.sohayb.quranreviser.app.models.*



@Database(
    entities = [(User::class),(Sequence::class)],
    version = 1,
    exportSchema = true
)


abstract class AppDatabase : RoomDatabase() {
    abstract fun usersDao(): UserDao
    abstract fun sequenceDao(): SequenceDao

}