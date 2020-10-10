package fr.sohayb.quranreviser.app.database.daos

import androidx.room.*
import fr.sohayb.quranreviser.app.models.User

@Dao
interface UserDao {

    @Query("SELECT * FROM users")
    fun getAll() : List<User>


    @Query("DELETE FROM users")
    fun emptyUsersTable()

    @Insert
    fun insertUser(user: User)

    @Update
    fun updateUser(user: User)

    @Delete
    fun deleteUser(user: User)

}