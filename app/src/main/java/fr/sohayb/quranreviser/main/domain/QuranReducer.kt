package fr.sohayb.quranreviser.main.domain

import fr.sohayb.quranreviser.base.domain.ReducerType
import fr.sohayb.quranreviser.base.domain.ResultType
import fr.sohayb.quranreviser.base.util.BooleanOneTimeEvent
import fr.sohayb.quranreviser.base.util.OneTimeEvent

class QuranReducer: ReducerType<QuranState> {

    override fun reduce(result: ResultType, state: QuranState): QuranState {
        return when (result) {
            is QuranResult.GotAyahTafseer -> state.copy(currentAyah = result.verseTafseer)
            is QuranResult.InitApplication -> state.copy(goToMainActivity = BooleanOneTimeEvent(true))

            else -> state
        }

    }
}