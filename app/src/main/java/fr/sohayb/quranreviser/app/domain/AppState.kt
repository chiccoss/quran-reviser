package fr.sohayb.quranreviser.app.domain

import fr.sohayb.quranreviser.base.domain.StateType
import fr.sohayb.quranreviser.main.domain.QuranState

data class AppState(
    val quranState: QuranState = QuranState()
) : StateType