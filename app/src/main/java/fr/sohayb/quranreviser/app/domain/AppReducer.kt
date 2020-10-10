package fr.sohayb.quranreviser.app.domain

import fr.sohayb.quranreviser.base.domain.ReducerType
import fr.sohayb.quranreviser.base.domain.ResultType
import fr.sohayb.quranreviser.main.domain.QuranReducer

class AppReducer(
    private val quranReducer: QuranReducer,
    private val initialState: AppState
) : ReducerType<AppState> {

    override fun reduce(result: ResultType, state: AppState): AppState {

        return when(result) {

            is AppResult.ResetAppState -> initialState

            else -> AppState(
                quranState = quranReducer.reduce(result, state.quranState)
            )
        }
    }
}