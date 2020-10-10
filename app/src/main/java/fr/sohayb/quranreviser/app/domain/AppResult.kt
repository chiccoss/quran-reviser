package fr.sohayb.quranreviser.app.domain

import fr.sohayb.quranreviser.base.domain.ResultType

sealed class AppResult: ResultType {

    object ResetAppState: AppResult()

}