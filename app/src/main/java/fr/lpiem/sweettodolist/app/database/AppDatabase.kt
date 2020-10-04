package fr.lpiem.sweettodolist.app.database

import androidx.room.Database
import androidx.room.RoomDatabase
import fr.lpiem.sweettodolist.app.database.daos.SequenceDao
import fr.lpiem.sweettodolist.app.database.daos.UserDao
import fr.lpiem.sweettodolist.app.models.*



@Database(
    entities = [(User::class),(Sequence::class)],
    version = 1,
    exportSchema = true
)


abstract class AppDatabase : RoomDatabase() {
    abstract fun usersDao(): UserDao
    abstract fun sequenceDao(): SequenceDao

}