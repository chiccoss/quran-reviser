package fr.lpiem.sweettodolist.app.database.daos

import androidx.room.*
import fr.lpiem.sweettodolist.app.models.*

@Dao
interface SequenceDao {

    @Query("SELECT * FROM sequence")
    fun getAll() : List<Sequence>


    @Query("DELETE FROM sequence")
    fun emptySequenceTable()

    @Insert
    fun insertSequence(sequence: Sequence)

    @Update
    fun updateSequence(sequence: Sequence)

    @Delete
    fun deleteSequence(sequence: Sequence)

}