package fr.sohayb.quranreviser.app.domain

import fr.sohayb.quranreviser.base.domain.StateType
import fr.sohayb.quranreviser.main.domain.MainState

data class AppState(
    val exampleState: MainState = MainState()
) : StateType