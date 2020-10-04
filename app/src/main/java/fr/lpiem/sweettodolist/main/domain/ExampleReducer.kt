package fr.lpiem.sweettodolist.main.domain

import fr.lpiem.sweettodolist.base.domain.ReducerType
import fr.lpiem.sweettodolist.base.domain.ResultType
import fr.lpiem.sweettodolist.base.util.OneTimeEvent

class MainReducer: ReducerType<MainState> {

    override fun reduce(result: ResultType, state: MainState): MainState {

        if(result !is MainResult) return state

        return when(result) {
            is MainResult.DownloadingWebpage -> state.copy(downloadingHtml = true)
            is MainResult.DownloadedWebpage -> {
                val error = if(result.error == null) null else OneTimeEvent(result.error)
                state.copy(
                    downloadingHtml = false,
                    downloadedHtml = result.html,
                    downloadError = error
                )
            }
        }
    }
}