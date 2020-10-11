package fr.sohayb.quranreviser.main.data

import android.content.Context
import fr.sohayb.quranreviser.app.api.Resource
import fr.sohayb.quranreviser.app.api.response.QuranApiResponse
import fr.sohayb.quranreviser.app.data.CurrentTafseerPreferences
import fr.sohayb.quranreviser.app.data.NetworkDataSource
import fr.sohayb.quranreviser.app.data.PreferencesDataSource
import okhttp3.ResponseBody

class QuranRepository(
    private val preferencesDataSource: PreferencesDataSource,
    private val networkDataSource: NetworkDataSource,
    private val context: Context
) {

    fun getTutorialIsSeen(): Boolean {
        return preferencesDataSource.tutorialAlreadySeen
    }

    fun setTutorialIsSeen(bool : Boolean){//: Boolean {
        //return preferencesDataSource.tutorialAlreadySeen.
    }

    fun getCurrentTafseer(): Tafseer? {
        return preferencesDataSource.currentTafseer?.toTafseer()
    }

    fun setCurrentTafseer(tafseer : Tafseer) : Boolean{
        return preferencesDataSource.saveTafseer(
            CurrentTafseerPreferences(
                tafseer.id,
                tafseer.name,
                tafseer.language,
                tafseer.author,
                tafseer.book_name
            )
        )
    }


    suspend fun getAyahTafseer(tafseerId : Int, suraNumber : Int, ayahId : Int): Resource<VerseTafseer> {
        //val forgotPasswordData = ForgotPasswordData(email)

        return networkDataSource.getAyahTafseer( tafseerId , suraNumber , ayahId )

    }


    suspend fun getAyahtInSura(): Resource<QuranApiResponse> {
        //val forgotPasswordData = ForgotPasswordData(email)

        return networkDataSource.getAyahtInSura(  )

    }




}