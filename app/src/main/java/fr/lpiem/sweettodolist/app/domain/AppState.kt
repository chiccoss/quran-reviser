package fr.lpiem.sweettodolist.app.domain

import fr.lpiem.sweettodolist.base.domain.StateType
import fr.lpiem.sweettodolist.main.domain.MainState

data class AppState(
    val exampleState: MainState = MainState()
) : StateType