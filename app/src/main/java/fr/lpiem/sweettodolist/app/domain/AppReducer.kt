package fr.lpiem.sweettodolist.app.domain

import fr.lpiem.sweettodolist.base.domain.ReducerType
import fr.lpiem.sweettodolist.base.domain.ResultType
import fr.lpiem.sweettodolist.main.domain.MainReducer

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