package fr.sohayb.quranreviser.main.domain

import fr.sohayb.quranreviser.base.error.Error
import fr.sohayb.quranreviser.base.domain.ResultType
import fr.sohayb.quranreviser.main.data.VerseTafseer


sealed class QuranResult: ResultType {

    data class GotAyahTafseer(val verseTafseer: VerseTafseer): QuranResult()
    data class QuranError(val error: Error): QuranResult()


}