package fr.sohayb.quranreviser.app.data

import android.content.Context
import fr.sohayb.quranreviser.app.api.NetworkService
import fr.sohayb.quranreviser.app.api.Resource
import fr.sohayb.quranreviser.app.api.ResponseHandler
import fr.sohayb.quranreviser.main.data.VerseTafseer

class NetworkDataSource(private val networkService: NetworkService, context: Context) : ResponseHandler(context) {


    // TEST OF GETCARS AND ADDCAR


    suspend fun getAyahTafseer(tafseerId : Int,suraNumber: Int,ayahNumber: Int): Resource<VerseTafseer> {
        return try {
            handleSuccess(networkService.getAyahTafseer(tafseerId,suraNumber,ayahNumber).toLocalVerseTafseer())
        } catch (e: Exception) {
            handleException(e)
        }
    }




}