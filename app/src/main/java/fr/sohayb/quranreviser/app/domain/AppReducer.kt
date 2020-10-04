package fr.sohayb.quranreviser.app.domain

import fr.sohayb.quranreviser.base.domain.ReducerType
import fr.sohayb.quranreviser.base.domain.ResultType
import fr.sohayb.quranreviser.main.domain.MainReducer

class AppReducer(
    private val exampleReducer: MainReducer,
    private val initialState: AppState
) : ReducerType<AppState> {

    override fun reduce(result: ResultType, state: AppState): AppState {

        return when(result) {

            is AppResult.ResetAppState -> initialState

            else -> AppState(
                exampleState = exampleReducer.reduce(result, state.exampleState)
            )
        }
    }
}