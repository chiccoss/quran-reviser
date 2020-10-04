package fr.lpiem.sweettodolist.app.data

import android.content.Context
import fr.lpiem.sweettodolist.app.api.NetworkService
import fr.lpiem.sweettodolist.app.api.ResponseHandler

class NetworkDataSource(private val networkService: NetworkService, context: Context) : ResponseHandler(context) {


    // TEST OF GETCARS AND ADDCAR

/*

    suspend fun signup(): Resource<ResponseBody> {
        return try {
            handleSuccess(networkService.deleteCar(1))
        } catch (e: Exception) {
            handleException(e)
        }
    }




    suspend fun getUser(): Resource<User> {
        return try {
            handleSuccess(networkService.getUser().mapToUser())
        } catch (e: Exception) {
            handleException(e)
        }
    }
*/

}