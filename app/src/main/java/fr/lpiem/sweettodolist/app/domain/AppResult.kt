package fr.lpiem.sweettodolist.app.domain

import fr.lpiem.sweettodolist.base.domain.ResultType

sealed class AppResult: ResultType {

    object ResetAppState: AppResult()

}