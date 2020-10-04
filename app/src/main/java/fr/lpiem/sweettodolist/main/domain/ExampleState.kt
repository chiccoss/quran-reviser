package fr.lpiem.sweettodolist.main.domain

import fr.lpiem.sweettodolist.base.domain.StateType
import fr.lpiem.sweettodolist.base.util.OneTimeEvent

data class MainState(
    val downloadingHtml: Boolean = false,
    val downloadedHtml: String? = null,
    val downloadError: OneTimeEvent<Throwable>? = null
): StateType