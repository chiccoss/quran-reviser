package fr.sohayb.quranreviser.main.domain

import fr.sohayb.quranreviser.base.domain.ReducerType
import fr.sohayb.quranreviser.base.domain.ResultType
import fr.sohayb.quranreviser.base.util.BooleanOneTimeEvent
import fr.sohayb.quranreviser.base.util.OneTimeEvent

class QuranReducer: ReducerType<QuranState> {

    override fun reduce(result: ResultType, state: QuranState): QuranState {
        return when (result) {
            is QuranResult.GotAyahTafseer -> state.copy(ayahTafseer = result.verseTafseer)
            is QuranResult.InitApplication -> state.copy(goToMainActivity = BooleanOneTimeEvent(true))
            is QuranResult.GotCurrentTafseer -> state.copy(currentTafseer = result.currentTafseer)
            is QuranResult.GotAyatInSura -> state.copy(listOfSuras = result.response)
            is QuranResult.GotQuran -> state.copy(quran = OneTimeEvent(result.quran),isLoading = false)
            is QuranResult.IsLoading -> state.copy(isLoading = true)


            else -> state
        }

    }
}