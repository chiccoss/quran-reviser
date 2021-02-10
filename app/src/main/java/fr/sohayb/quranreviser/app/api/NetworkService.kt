package fr.sohayb.quranreviser.app.api

import fr.sohayb.quranreviser.app.api.response.QuranApiResponse
import fr.sohayb.quranreviser.app.api.response.VerseTafseerResponse
import fr.sohayb.quranreviser.app.models.QuranResponse
import okhttp3.ResponseBody
import retrofit2.http.GET
import retrofit2.http.Path


@JvmSuppressWildcards
interface NetworkService {

    @GET("tafseer/{tafseer_id}/{sura_number}/{ayah_number}")
    suspend fun getAyahTafseer(
        @Path("tafseer_id") tafseerId: Int,
        @Path("sura_number") suraNumber: Int,
        @Path("ayah_number") ayahNumber: Int
    ): VerseTafseerResponse


    @GET("v1/surah")
    suspend fun getAyahtInSura(
    ): QuranApiResponse


    @GET("v1/quran/quran-uthmani")
    suspend fun getQuran(): QuranResponse






    //endregion
}