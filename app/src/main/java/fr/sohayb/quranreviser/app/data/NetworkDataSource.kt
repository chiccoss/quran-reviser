package fr.sohayb.quranreviser.app.data

import android.content.Context
import fr.sohayb.quranreviser.app.api.NetworkService
import fr.sohayb.quranreviser.app.api.Resource
import fr.sohayb.quranreviser.app.api.ResponseHandler
import fr.sohayb.quranreviser.app.api.response.QuranApiResponse
import fr.sohayb.quranreviser.app.models.QuranResponse
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


    suspend fun getAyahtInSura(): Resource<QuranApiResponse> {
        return try {
            handleSuccess(networkService.getAyahtInSura())
        } catch (e: Exception) {
            handleException(e)
        }
    }


    suspend fun getQuran(): Resource<QuranResponse> {
        return try {
            handleSuccess(networkService.getQuran())
        } catch (e: Exception) {
            handleException(e)
        }
    }








}