package fr.sohayb.quranreviser.main.domain

import fr.sohayb.quranreviser.base.domain.StateType
import fr.sohayb.quranreviser.base.util.OneTimeEvent

data class MainState(
    val downloadingHtml: Boolean = false,
    val downloadedHtml: String? = null,
    val downloadError: OneTimeEvent<Throwable>? = null
): StateType