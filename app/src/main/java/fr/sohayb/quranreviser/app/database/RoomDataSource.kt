package fr.sohayb.quranreviser.app.database

import android.annotation.SuppressLint
import fr.sohayb.quranreviser.app.models.User
import fr.sohayb.quranreviser.app.models.Sequence


@SuppressLint("Registered")
class RoomDataSource {
    /*val database =
        AppDatabase.invoke(context = this@RoomDataSource)
*/

    /*
        suspend fun getAndfillRecyclerWithPhotos() = withContext(Dispatchers.IO) {
            val liveData = MutableLiveData<List<Picture>>()

            val pics = DataBaseFactory.instance?.photosDao()?.getAll()
                .let { it as ArrayList<Picture> }

            liveData.apply { postValue(pics) }
        }
    */
   /* fun InsertUser(user: User) {

        val liveData = MutableLiveData<User>()

        val pics = DataBaseFactory.instance?.usersDao().
            .let { it as ArrayList<Picture> }

        liveData.apply { postValue(pics) }

    }
*/
    fun updateUser(user: User) {
        DataBaseFactory.instance?.usersDao()?.updateUser(user)
    }

    fun insertUser(user: User) {
        DataBaseFactory.instance?.usersDao()?.insertUser(user)
    }

    fun deleteUser(user: User) {
        DataBaseFactory.instance?.usersDao()?.deleteUser(user)
    }


    fun updateSequence(sequence : Sequence) {
        DataBaseFactory.instance?.sequenceDao()?.updateSequence(sequence)
    }

    fun insertSequence(sequence : Sequence) {
        DataBaseFactory.instance?.sequenceDao()?.insertSequence(sequence)
    }

    fun deleteSequence(sequence : Sequence) {
        DataBaseFactory.instance?.sequenceDao()?.deleteSequence(sequence)
    }

}