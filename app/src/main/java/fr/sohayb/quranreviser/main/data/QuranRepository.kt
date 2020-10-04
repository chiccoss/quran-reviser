package fr.sohayb.quranreviser.main.data

import android.content.Context
import fr.sohayb.quranreviser.app.api.Resource
import fr.sohayb.quranreviser.app.data.NetworkDataSource
import okhttp3.ResponseBody

class QuranRepository(
    private val networkDataSource: NetworkDataSource,
    private val context: Context
) {


    suspend fun getAyahTafseer(tafseerId : Int, suraNumber : Int, ayahId : Int): Resource<VerseTafseer> {
        //val forgotPasswordData = ForgotPasswordData(email)

        return networkDataSource.getAyahTafseer( tafseerId , suraNumber , ayahId )

    }


}