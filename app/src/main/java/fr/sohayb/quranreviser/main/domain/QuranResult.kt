package fr.sohayb.quranreviser.main.domain

import fr.sohayb.quranreviser.app.api.response.QuranApiResponse
import fr.sohayb.quranreviser.app.models.QuranResponse
import fr.sohayb.quranreviser.base.error.Error
import fr.sohayb.quranreviser.base.domain.ResultType
import fr.sohayb.quranreviser.main.data.Tafseer
import fr.sohayb.quranreviser.main.data.VerseTafseer


sealed class QuranResult: ResultType {

    data class GotAyahTafseer(val verseTafseer: VerseTafseer): QuranResult()
    data class QuranError(val error: Error): QuranResult()
    data class GotCurrentTafseer(val currentTafseer: Tafseer?): QuranResult()

    data class GotAyatInSura(val response: QuranApiResponse): QuranResult()
    data class GotQuran(val quran: QuranResponse): QuranResult()


    object InitApplication: QuranResult()
    object IsLoading : QuranResult()
}